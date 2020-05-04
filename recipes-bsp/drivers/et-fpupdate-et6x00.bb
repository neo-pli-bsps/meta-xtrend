FPVERSION = "15"

SRC_URI = " \
	https://github.com/neo-pli-bsps/meta-xtrend/releases/download/Binaries-1.0/fpupdate-1.0.zip \
	https://github.com/neo-pli-bsps/meta-xtrend/releases/download/Binaries-1.0/avrmain-et6x00-15.zip;name=avrmain \
	"

require et-fpupdate-1.0.inc

SRC_URI[avrmain.md5sum] = "329cd1d6e603785af242b3bc4bd52897"
SRC_URI[avrmain.sha256sum] = "771de8f774dff96315f700cf6cc5aeaefcf842478f489cb45af49b7dd13f1245"
