SUMMARY = "Cantarell, a Humanist sans-serif font family"

DESCRIPTION = "The Cantarell font typeface is designed as a \
               contemporary Humanist sans serif, and was developed for \
               on-screen reading; in particular, reading web pages on an \
               HTC Dream mobile phone."

HOMEPAGE = "https://gitlab.gnome.org/GNOME/cantarell-fonts/"
SECTION = "fonts"
LICENSE = "OFL-1.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=df91e3ffcab8cfb972a66bf11255188d"

PV = "0.0.25"

#SRCREV = "e28a9096da43984212b5b4002b949bcb8c7527f9"
#SRC_URI = "git://gitlab.gnome.org/GNOME/cantarell-fonts.git;protocol=https;branch=reconstruction-0.0.25"
SRC_URI = "http://mirrorservice.org/sites/ftp.gnome.org/pub/GNOME/sources/cantarell-fonts/0.0/cantarell-fonts-0.0.25.tar.xz"
SRC_URI[sha256sum] = "14a228aa0b516dfc367b434a850f955a00c57fc549cbb05348e2b150196a737f"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>(?!0\.13)(?!0\.10\.1)\d+\.\d+(\.\d+)+)"

#S = "${WORKDIR}/git"
S = "${WORKDIR}/cantarell-fonts-0.0.25"

inherit autotools allarch fontcache pkgconfig

PACKAGECONFIG ??= ""
PACKAGECONFIG[fontforge] = "--enable-source-rebuild=yes,--enable-source-rebuild=no,fontforge-native"
FILES_${PN} = "${datadir}/fonts ${datadir}/fontconfig"
