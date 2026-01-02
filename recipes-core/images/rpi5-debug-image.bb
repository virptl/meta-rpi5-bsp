DESCRIPTION = "Minimal debug image for Raspberry Pi 5 BSP bring-up"
LICENSE = "MIT"

inherit core-image

IMAGE_LINGUAS = " "

# 'ssh-server-openssh' automatically installs openssh and configures it.
IMAGE_FEATURES += "ssh-server-openssh debug-tweaks"

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    bash \
    ethtool \
    i2c-tools \
    usbutils \
    procps \
"

IMAGE_INSTALL:append = " \
    linux-firmware-rpidistro-bcm43455 \
    linux-firmware-rpidistro-bcm43456 \
    kernel-modules \
    wpa-supplicant \
    iw \
    custom-service \
    watchdog \
    bluez5 \
    bluez5-obex \
"

IMAGE_FSTYPES += "wic"
