# Base this image on core-image-base
include recipes-core/images/core-image-base.bb

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL_append = " packagegroup-rpi-test"

IMAGE_INSTALL_append = " alsa-utils"
