inherit autotools pkgconfig

DESCRIPTION = "gsttest"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

FILESPATH := "${TOPDIR}/../src"

SRC_URI="file://gsttest/"
S = "${WORKDIR}/gsttest/"

DEPENDS = "glib-2.0 gstreamer1.0 gstreamer1.0-plugins-base"
EXTRA_OECONF = "--with-gstreamer"

FILES_${PN} += "${bindir}/*"