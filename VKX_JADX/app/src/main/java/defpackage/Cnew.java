package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: new, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cnew extends Ccase {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f36533l = new ad(20, Cnew.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f36534l;

    public Cnew(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            C8339l.metrica("UTCTime string too short");
            throw null;
        }
        this.f36534l = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57) {
            C8339l.metrica("illegal characters in UTCTime string");
            throw null;
        }
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f36534l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f36534l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(23, z, this.f36534l);
    }

    public final String premium() {
        String strYandex = AbstractC9008l.yandex(this.f36534l);
        if (strYandex.indexOf(45) < 0 && strYandex.indexOf(43) < 0) {
            return strYandex.length() == 11 ? strYandex.substring(0, 10).concat("00GMT+00:00") : strYandex.substring(0, 12).concat("GMT+00:00");
        }
        int iIndexOf = strYandex.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strYandex.indexOf(43);
        }
        if (iIndexOf == strYandex.length() - 3) {
            strYandex = strYandex.concat("00");
        }
        if (iIndexOf == 10) {
            return strYandex.substring(0, 10) + "00GMT" + strYandex.substring(10, 13) + ":" + strYandex.substring(13, 15);
        }
        return strYandex.substring(0, 12) + "GMT" + strYandex.substring(12, 15) + ":" + strYandex.substring(15, 17);
    }

    public final String toString() {
        return AbstractC9008l.yandex(this.f36534l);
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (!(ccase instanceof Cnew)) {
            return false;
        }
        return Arrays.equals(this.f36534l, ((Cnew) ccase).f36534l);
    }
}
