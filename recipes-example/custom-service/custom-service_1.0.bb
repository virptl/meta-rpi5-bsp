SUMMARY = "Custom Raspberry Pi 5 Startup Service"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://rpi5-hello.sh \
    file://rpi5-startup.sh \
"

# Inherit the update-rc.d class to handle init script links automatically
inherit update-rc.d

# Define the service name for update-rc.d
INITSCRIPT_NAME = "rpi5-startup"
INITSCRIPT_PARAMS = "defaults 99"

do_install() {
    # 1. Install the main application script
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/rpi5-hello.sh ${D}${bindir}/

    # 2. Install the init script
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/rpi5-startup.sh ${D}${sysconfdir}/init.d/rpi5-startup
}
