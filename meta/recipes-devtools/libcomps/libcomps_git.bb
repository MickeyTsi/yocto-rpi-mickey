SUMMARY = "Libcomps is alternative for yum.comps library (which is for managing rpm package groups)."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/rpm-software-management/libcomps.git \
           file://0001-Do-not-set-PYTHON_INSTALL_DIR-by-running-python.patch \
           file://0001-Make-__comps_objmrtree_all-static-inline.patch \
           file://0001-Add-crc32.c-to-sources-list.patch \
           "

PV = "0.1.14"
SRCREV = "5a0e04286f3462e3308f2a332eb0f90a66920218"

S = "${WORKDIR}/git"

inherit cmake distutils3-base

DEPENDS += "libxml2 expat libcheck"

EXTRA_OECMAKE = " -DPYTHON_INSTALL_DIR=${PYTHON_SITEPACKAGES_DIR} -DPYTHON_DESIRED=3"
OECMAKE_SOURCEPATH = "${S}/libcomps"

BBCLASSEXTEND = "native nativesdk"

