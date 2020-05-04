FPVERSION = "15"

SRC_URI = " \
	https://github.com/neo-pli-bsps/meta-xtrend/releases/download/Binaries-1.0/fpupdate-1.0.zip \
	https://github.com/neo-pli-bsps/meta-xtrend/releases/download/Binaries-1.0/avrmain-et9x00-15.zip;name=avrmain \
	"

require et-fpupdate-1.0.inc

SRC_URI[avrmain.md5sum] = "56c1e74eaf019d57fa29e64bb7755023"
SRC_URI[avrmain.sha256sum] = "dca85d2d990f9b718e75b9445ee8d2d2a8851733fd59569c2b4b22045ffa9bc9"
