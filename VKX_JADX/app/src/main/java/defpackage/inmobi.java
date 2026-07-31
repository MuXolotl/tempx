package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class inmobi extends Ccase {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final ad f835l = new ad(3, inmobi.class);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final inmobi[] f836l = new inmobi[12];

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f837l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f838l;

    public inmobi(boolean z, byte[] bArr) {
        if (Cstrictfp.m4582volatile(bArr)) {
            C8339l.metrica("malformed enumerated");
            throw null;
        }
        int i = 0;
        if ((bArr[0] & 128) != 0) {
            C8339l.metrica("enumerated must be non-negative");
            throw null;
        }
        this.f838l = z ? AbstractC14024l.crashlytics(bArr) : bArr;
        int length = bArr.length - 1;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.f837l = i;
    }

    public static inmobi applovin(Object obj) {
        String strAds;
        if (obj == null || (obj instanceof inmobi)) {
            return (inmobi) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (inmobi) f835l.m215l((byte[]) obj);
            } catch (Exception e) {
                strAds = AbstractC5020l.ads(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            strAds = "illegal object in getInstance: ".concat(obj.getClass().getName());
        }
        C8339l.metrica(strAds);
        return null;
    }

    public static inmobi premium(boolean z, byte[] bArr) {
        if (bArr.length > 1) {
            return new inmobi(z, bArr);
        }
        if (bArr.length == 0) {
            C8339l.metrica("ENUMERATED has zero length");
            return null;
        }
        int i = bArr[0] & 255;
        if (i >= 12) {
            return new inmobi(z, bArr);
        }
        inmobi[] inmobiVarArr = f836l;
        inmobi inmobiVar = inmobiVarArr[i];
        if (inmobiVar != null) {
            return inmobiVar;
        }
        inmobi inmobiVar2 = new inmobi(z, bArr);
        inmobiVarArr[i] = inmobiVar2;
        return inmobiVar2;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f838l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    public final int appmetrica() {
        byte[] bArr = this.f838l;
        int length = bArr.length;
        int i = this.f837l;
        if (length - i <= 4) {
            return Cstrictfp.m4581synchronized(i, -1, bArr);
        }
        throw new ArithmeticException("ASN.1 Enumerated out of int range");
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f838l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(10, z, this.f838l);
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof inmobi) {
            return Arrays.equals(this.f838l, ((inmobi) ccase).f838l);
        }
        return false;
    }

    public inmobi(int i) {
        if (i < 0) {
            C8339l.metrica("enumerated must be non-negative");
            throw null;
        }
        this.f838l = BigInteger.valueOf(i).toByteArray();
        this.f837l = 0;
    }
}
