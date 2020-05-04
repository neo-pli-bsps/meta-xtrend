KV = "4.10.6"
SRCDATE = "20180412"

SRC_URI = "https://github.com/neo-pli-bsps/meta-xtrend/releases/download/Binaries-1.0/et10000-drivers-4.10.6-20180412.zip"

require et-dvb-modules.inc

SRC_URI[md5sum] = "be841edb975d1059d87c111143a45779"
SRC_URI[sha256sum] = "1d2f7699cb0f423ea8fa81bb740031c15669897ca8070a748500d8035baaa3c2"

COMPATIBLE_MACHINE = "et10000"
