DESCRIPTION = "Minimal debug image for Raspberry Pi 5 BSP bring-up"
LICENSE = "MIT"

inherit image

IMAGE_LINGUAS = " "

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    dropbear \
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
"

IMAGE_FSTYPES += "wic"

