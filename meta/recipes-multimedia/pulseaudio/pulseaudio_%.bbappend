do_overlay() {
echo overlay
echo B=${B}
echo S=${S}
echo TOPDIR=${TOPDIR}
rm -rf ${S}/*
cp -rf ${TOPDIR}/../src/pulseaudio-13.0/* ${S}
}
addtask overlay before do_configure after do_patch
