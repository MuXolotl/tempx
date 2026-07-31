package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٜؔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2761l extends Ccase implements Cdefault {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f5999l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f5998l = new ad(22, C2761l.class);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final char[] f5997l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public C2761l(byte[] bArr) {
        this.f5999l = bArr;
    }

    public static void premium(int i, StringBuilder sb) {
        char[] cArr = f5997l;
        sb.append(cArr[(i >>> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f5999l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f5999l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(28, z, this.f5999l);
    }

    @Override // defpackage.Cdefault
    public final String mopub() {
        int i;
        byte[] bArr = this.f5999l;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(((C7972l.m2214extends(length) + length) * 2) + 3);
        sb.append("#1C");
        if (length < 128) {
            premium(length, sb);
        } else {
            byte[] bArr2 = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr2[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr2[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                premium(bArr2[i4], sb);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b : bArr) {
            premium(b, sb);
        }
        return sb.toString();
    }

    public final String toString() {
        return mopub();
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof C2761l) {
            return Arrays.equals(this.f5999l, ((C2761l) ccase).f5999l);
        }
        return false;
    }
}
