SUMMARY = " Custom recipe for my embedded project image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=182bb0c13c64ef035f63492914bc620e"

SRC_URI = "git://github.com/HermannTadjuidje/Embedded_Linux_Prvt.git;protocol=https;branch=main;tag=v1.3"
#SRCREV = "41eb7f83e71c132be80ac8abcd52a44667a67ec6"
S = "${WORKDIR}/git/hello"

do_compile() {
    oe_runmake
}

do_install() {
    oe_runmake install DESTDIR=${D}
}

inherit systemd

SYSTEMD_SERVICE:${PN} = "hello.service"

SRC_URI += "file://hello.service"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/hello.service ${D}${systemd_system_unitdir}
}
