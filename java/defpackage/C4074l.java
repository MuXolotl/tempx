package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lّؖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4074l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C4074l f8373l = new C4074l(new byte[0]);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final char[] f8374l = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f8375l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f8376l;

    public C4074l(byte[] bArr, int i, int i2) {
        this(AbstractC8669l.inmobi(i, i2, bArr));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4074l c4074l = (C4074l) obj;
        byte[] bArr = c4074l.f8376l;
        if (c4074l == this) {
            return 0;
        }
        byte[] bArr2 = this.f8376l;
        int iMin = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < iMin; i++) {
            int iSubs = AbstractC8576l.subs(bArr2[i] & 255, bArr[i] & 255);
            if (iSubs != 0) {
                return iSubs;
            }
        }
        return AbstractC8576l.subs(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4074l.class != obj.getClass()) {
            return false;
        }
        C4074l c4074l = (C4074l) obj;
        byte[] bArr = c4074l.f8376l;
        int length = bArr.length;
        byte[] bArr2 = this.f8376l;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = c4074l.f8375l;
        if (i2 == 0 || (i = this.f8375l) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f8375l;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f8376l);
        this.f8375l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        byte[] bArr = this.f8376l;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = f8374l;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    public final byte yandex(int i) {
        byte[] bArr = this.f8376l;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        C18262l.adcel(AbstractC0653l.adcel(AbstractC2812l.Signature("index (", i, ") is out of byte string bounds: [0.."), bArr.length, ')'));
        return (byte) 0;
    }

    public C4074l(byte[] bArr) {
        this.f8376l = bArr;
    }
}
