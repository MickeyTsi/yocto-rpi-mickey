SUMMARY = "ISO language, territory, currency, script codes and their translations"
HOMEPAGE = "https://salsa.debian.org/iso-codes-team/iso-codes"
BUGTRACKER = "https://salsa.debian.org/iso-codes-team/iso-codes/issues"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

# SRC_URI = "git://salsa.debian.org/iso-codes-team/iso-codes.git"
# SRCREV = "38edb926592954b87eb527124da0ec68d2a748f3"

# SRC_URI[sha256sum] = "16740da73f8d2a9849af9b2e0a260d643589d4fddc85d003be9b28ec67d6bd26"

SRC_URI = "https://salsa.debian.org/iso-codes-team/iso-codes/-/archive/iso-codes-4.4/iso-codes-iso-codes-4.4.tar.gz"

SRC_URI[sha256sum] = "ff7c0d28975dc83e8975c1c815d3bb7371a4130ae90e3dc93508de2bf1939010"

# inherit gettext cannot be used, because it adds gettext-native to BASEDEPENDS which
# are inhibited by allarch
DEPENDS = "gettext-native"

S = "${WORKDIR}/iso-codes-iso-codes-4.4"

inherit allarch autotools

FILES_${PN} += "${datadir}/xml/"
