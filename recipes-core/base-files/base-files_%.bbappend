FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Overwrite the default issue files with our custom ones
SRC_URI:append = " \
    file://issue \
    file://issue.net \
    file://motd \
"
do_install:append() {
    install -m 0644 ${WORKDIR}/issue ${D}${sysconfdir}/issue
    install -m 0644 ${WORKDIR}/issue.net ${D}${sysconfdir}/issue.net
    install -m 0644 ${WORKDIR}/motd ${D}${sysconfdir}/motd
}
