FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Yocto will find YOUR watchdog.conf first because of FILESEXTRAPATHS
# and use it to replace the one from the original recipe.
SRC_URI:append = " file://watchdog.conf"

# We do NOT need a do_install:append.
# The original recipe's do_install will pick up your file automatically 
# because it looks in WORKDIR, where your file is now placed.
