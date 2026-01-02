# meta-rpi5-bsp/recipes-core/init-ifupdown/init-ifupdown_%.bbappend

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " file://interfaces"
