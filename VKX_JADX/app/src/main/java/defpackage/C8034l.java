package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lًٖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8034l extends C3844l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient byte[][] f16721l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient int[] f16722l;

    public C8034l(byte[][] bArr, int[] iArr) {
        super(C3844l.f7950l.f7953l);
        this.f16721l = bArr;
        this.f16722l = iArr;
    }

    @Override // defpackage.C3844l
    public final void Signature(C0869l c0869l, int i) {
        int iIsPro = AbstractC10733l.isPro(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f16722l;
            int i3 = iIsPro == 0 ? 0 : iArr[iIsPro - 1];
            int i4 = iArr[iIsPro] - i3;
            byte[][] bArr = this.f16721l;
            int i5 = iArr[bArr.length + iIsPro];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C18346l c18346l = new C18346l(bArr[iIsPro], i6, i6 + iMin, true, false);
            C18346l c18346l2 = c0869l.f2527l;
            if (c18346l2 == null) {
                c18346l.mopub = c18346l;
                c18346l.billing = c18346l;
                c0869l.f2527l = c18346l;
            } else {
                c18346l2.mopub.loadAd(c18346l);
            }
            i2 += iMin;
            iIsPro++;
        }
        c0869l.f2526l += (long) i;
    }

    @Override // defpackage.C3844l
    public final C3844l ads() {
        return license().ads();
    }

    @Override // defpackage.C3844l
    public final void amazon(byte[] bArr, int i, int i2, int i3) {
        long j = i3;
        AbstractC9334l.crashlytics(purchase(), i, j);
        AbstractC9334l.crashlytics(bArr.length, i2, j);
        int i4 = i3 + i;
        int iIsPro = AbstractC10733l.isPro(this, i);
        while (i < i4) {
            int[] iArr = this.f16722l;
            int i5 = iIsPro == 0 ? 0 : iArr[iIsPro - 1];
            int i6 = iArr[iIsPro] - i5;
            byte[][] bArr2 = this.f16721l;
            int i7 = iArr[bArr2.length + iIsPro];
            int iMin = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            AbstractC8669l.advert(bArr2[iIsPro], i2, i8, bArr, i8 + iMin);
            i2 += iMin;
            i += iMin;
            iIsPro++;
        }
    }

    @Override // defpackage.C3844l
    public final String billing() {
        return license().billing();
    }

    @Override // defpackage.C3844l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3844l) {
            C3844l c3844l = (C3844l) obj;
            if (c3844l.purchase() == purchase() && remoteconfig(0, purchase(), c3844l)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.C3844l
    public final int firebase(int i, byte[] bArr) {
        return license().firebase(i, bArr);
    }

    @Override // defpackage.C3844l
    public final int hashCode() {
        int i = this.f7952l;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f16721l;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f16722l;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f7952l = i3;
        return i3;
    }

    @Override // defpackage.C3844l
    public final byte isPro(int i) {
        byte[][] bArr = this.f16721l;
        int length = bArr.length - 1;
        int[] iArr = this.f16722l;
        AbstractC9334l.crashlytics(iArr[length], i, 1L);
        int iIsPro = AbstractC10733l.isPro(this, i);
        return bArr[iIsPro][(i - (iIsPro == 0 ? 0 : iArr[iIsPro - 1])) + iArr[bArr.length + iIsPro]];
    }

    public final C3844l license() {
        return new C3844l(subscription());
    }

    @Override // defpackage.C3844l
    public final String loadAd() {
        return license().loadAd();
    }

    @Override // defpackage.C3844l
    public final String metrica(Charset charset) {
        return license().metrica(charset);
    }

    @Override // defpackage.C3844l
    public final int mopub(int i, byte[] bArr) {
        return license().mopub(i, bArr);
    }

    @Override // defpackage.C3844l
    public final int purchase() {
        return this.f16722l[this.f16721l.length - 1];
    }

    @Override // defpackage.C3844l
    public final boolean remoteconfig(int i, int i2, C3844l c3844l) {
        if (i >= 0 && i <= purchase() - i2) {
            int i3 = i2 + i;
            int iIsPro = AbstractC10733l.isPro(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f16722l;
                int i5 = iIsPro == 0 ? 0 : iArr[iIsPro - 1];
                int i6 = iArr[iIsPro] - i5;
                byte[][] bArr = this.f16721l;
                int i7 = iArr[bArr.length + iIsPro];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (c3844l.vip(bArr[iIsPro], i4, (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iIsPro++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.C3844l
    public final C3844l startapp(int i, int i2) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("beginIndex=", i, " < 0"));
            return null;
        }
        if (i2 > purchase()) {
            StringBuilder sbSignature = AbstractC2812l.Signature("endIndex=", i2, " > length(");
            sbSignature.append(purchase());
            sbSignature.append(')');
            throw new IllegalArgumentException(sbSignature.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            C10754l.metrica(AbstractC12589l.premium(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == purchase()) {
            return this;
        }
        if (i == i2) {
            return C3844l.f7950l;
        }
        int iIsPro = AbstractC10733l.isPro(this, i);
        int iIsPro2 = AbstractC10733l.isPro(this, i2 - 1);
        byte[][] bArr = this.f16721l;
        byte[][] bArr2 = (byte[][]) AbstractC8669l.m2419throws(iIsPro, iIsPro2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f16722l;
        if (iIsPro <= iIsPro2) {
            int i4 = iIsPro;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iIsPro2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iIsPro != 0 ? iArr2[iIsPro - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new C8034l(bArr2, iArr);
    }

    @Override // defpackage.C3844l
    public final byte[] subs() {
        return subscription();
    }

    @Override // defpackage.C3844l
    public final byte[] subscription() {
        byte[] bArr = new byte[purchase()];
        byte[][] bArr2 = this.f16721l;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f16722l;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC8669l.advert(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.C3844l
    public final String toString() {
        return license().toString();
    }

    @Override // defpackage.C3844l
    public final boolean vip(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0 && i <= purchase() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iIsPro = AbstractC10733l.isPro(this, i);
            while (i < i4) {
                int[] iArr = this.f16722l;
                int i5 = iIsPro == 0 ? 0 : iArr[iIsPro - 1];
                int i6 = iArr[iIsPro] - i5;
                byte[][] bArr2 = this.f16721l;
                int i7 = iArr[bArr2.length + iIsPro];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (AbstractC9334l.loadAd(bArr2[iIsPro], (i - i5) + i7, i2, bArr, iMin)) {
                    i2 += iMin;
                    i += iMin;
                    iIsPro++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.C3844l
    public final ByteBuffer yandex() {
        return ByteBuffer.wrap(subscription()).asReadOnlyBuffer();
    }
}
