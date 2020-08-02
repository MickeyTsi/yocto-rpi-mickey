# Base this image on core-image-base
include recipes-core/images/core-image-base.bb


COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL_append = " packagegroup-rpi-test"

IMAGE_INSTALL_append = " alsa-utils pulseaudio-server pulseaudio-misc"

IMAGE_INSTALL_append = " gsttest gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-bad"

IMAGE_INSTALL_append = " android-tools wpa-supplicant"

# gstreamer1.0-plugins-ugly 