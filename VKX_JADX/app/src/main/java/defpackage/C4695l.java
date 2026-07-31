package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؘؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4695l implements InterfaceC15393l {
    public final byte[] yandex;

    public C4695l(byte[] bArr) {
        if (bArr.length == 16) {
            this.yandex = bArr;
        } else {
            C8339l.metrica(AbstractC15560l.tapsense("Invalid 'bytes' size ", bArr.length, ", byte array size must be 16"));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC15393l)) {
            return Arrays.equals(((C4695l) ((InterfaceC15393l) obj)).yandex, this.yandex);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.yandex);
    }

    public final String toString() {
        byte[] bArr = this.yandex;
        String strYandex = AbstractC3048l.yandex(0, 4, bArr);
        String strYandex2 = AbstractC3048l.yandex(4, 6, bArr);
        String strYandex3 = AbstractC3048l.yandex(6, 8, bArr);
        String strYandex4 = AbstractC3048l.yandex(8, 10, bArr);
        String strYandex5 = AbstractC3048l.yandex(10, 16, bArr);
        StringBuilder sb = new StringBuilder();
        sb.append(strYandex);
        sb.append("-");
        sb.append(strYandex2);
        sb.append("-");
        sb.append(strYandex3);
        return AbstractC9361l.advert(sb, "-", strYandex4, "-", strYandex5);
    }
}
