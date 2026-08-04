package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: renamed from: strictfp, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cstrictfp extends Ccase {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Cstrictfp f36572l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final Cstrictfp f36573l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Cstrictfp f36575l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f36576l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f36577l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final ad f36571l = new ad(9, Cstrictfp.class);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Cstrictfp[] f36574l = new Cstrictfp[17];

    static {
        int i = 0;
        while (true) {
            Cstrictfp[] cstrictfpArr = f36574l;
            if (i >= 17) {
                f36573l = cstrictfpArr[0];
                f36575l = cstrictfpArr[1];
                f36572l = cstrictfpArr[3];
                return;
            }
            cstrictfpArr[i] = new Cstrictfp(i);
            i++;
        }
    }

    public Cstrictfp(byte[] bArr) {
        if (m4582volatile(bArr)) {
            C8339l.metrica("malformed integer");
            throw null;
        }
        this.f36577l = bArr;
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.f36576l = i;
    }

    public static Cstrictfp premium(Object obj) {
        String strAds;
        if (obj == null || (obj instanceof Cstrictfp)) {
            return (Cstrictfp) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (Cstrictfp) f36571l.m215l((byte[]) obj);
            } catch (Exception e) {
                strAds = AbstractC5020l.ads(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            strAds = "illegal object in getInstance: ".concat(obj.getClass().getName());
        }
        C8339l.metrica(strAds);
        return null;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static Cstrictfp m4580private(int i) {
        return (((long) i) < 0 || i >= 17) ? new Cstrictfp(i) : f36574l[i];
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static int m4581synchronized(int i, int i2, byte[] bArr) {
        int length = bArr.length;
        int iMax = Math.max(i, length - 4);
        int i3 = i2 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[iMax] & 255);
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static boolean m4582volatile(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || AbstractC8151l.crashlytics("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f36577l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    public final BigInteger applovin() {
        return new BigInteger(1, this.f36577l);
    }

    public final BigInteger appmetrica() {
        return new BigInteger(this.f36577l);
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f36577l);
    }

    public final boolean inmobi(int i) {
        byte[] bArr = this.f36577l;
        int length = bArr.length;
        int i2 = this.f36576l;
        return length - i2 <= 4 && m4581synchronized(i2, -1, bArr) == i;
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(2, z, this.f36577l);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final long m4583native() {
        byte[] bArr = this.f36577l;
        int length = bArr.length;
        int i = this.f36576l;
        if (length - i > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int length2 = bArr.length;
        int iMax = Math.max(i, length2 - 8);
        long j = bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length2) {
                return j;
            }
            j = (j << 8) | ((long) (bArr[iMax] & 255));
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final int m4584package() {
        byte[] bArr = this.f36577l;
        int length = bArr.length;
        int i = this.f36576l;
        int i2 = length - i;
        if (i2 > 4 || (i2 == 4 && (bArr[i] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return m4581synchronized(i, 255, bArr);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final int m4585strictfp() {
        byte[] bArr = this.f36577l;
        int length = bArr.length;
        int i = this.f36576l;
        if (length - i <= 4) {
            return m4581synchronized(i, -1, bArr);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m4586throws(BigInteger bigInteger) {
        return bigInteger != null && m4581synchronized(this.f36576l, -1, this.f36577l) == bigInteger.intValue() && appmetrica().equals(bigInteger);
    }

    public final String toString() {
        return appmetrica().toString();
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof Cstrictfp) {
            return Arrays.equals(this.f36577l, ((Cstrictfp) ccase).f36577l);
        }
        return false;
    }

    public Cstrictfp(long j) {
        this.f36577l = BigInteger.valueOf(j).toByteArray();
        this.f36576l = 0;
    }

    public Cstrictfp(BigInteger bigInteger) {
        this.f36577l = bigInteger.toByteArray();
        this.f36576l = 0;
    }

    public Cstrictfp(int i) {
        this.f36577l = BigInteger.valueOf(i).toByteArray();
        this.f36576l = 0;
    }
}
