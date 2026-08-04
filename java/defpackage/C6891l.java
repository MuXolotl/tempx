package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: lؙۦۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6891l extends AbstractC15335l {
    public final byte[] amazon;
    public int billing;
    public final ByteArrayOutputStream mopub;
    public final int purchase;

    public C6891l(int i, ByteArrayOutputStream byteArrayOutputStream) {
        if (i < 0) {
            C8339l.metrica("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.amazon = new byte[iMax];
        this.purchase = iMax;
        this.mopub = byteArrayOutputStream;
    }

    @Override // defpackage.AbstractC15335l
    public final void Signature(int i, int i2) throws IOException {
        inmobi(20);
        signatures(i, 0);
        premium(i2);
    }

    @Override // defpackage.AbstractC15335l
    public final void ad(long j) throws IOException {
        inmobi(10);
        applovin(j);
    }

    @Override // defpackage.AbstractC15335l
    public final void adcel(int i) throws IOException {
        if (i >= 0) {
            license(i);
        } else {
            ad(i);
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void ads(int i, int i2, byte[] bArr) throws IOException {
        m2079throws(bArr, i, i2);
    }

    public final void advert(int i) {
        int i2 = this.billing;
        byte[] bArr = this.amazon;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.billing = i2 + 4;
    }

    public final void applovin(long j) {
        boolean z = AbstractC15335l.crashlytics;
        byte[] bArr = this.amazon;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.billing;
                if (j2 == 0) {
                    this.billing = i + 1;
                    AbstractC1900l.firebase(bArr, i, (byte) j);
                    return;
                } else {
                    this.billing = i + 1;
                    AbstractC1900l.firebase(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.billing;
                if (j3 == 0) {
                    this.billing = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.billing = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void appmetrica() throws IOException {
        this.mopub.write(this.amazon, 0, this.billing);
        this.billing = 0;
    }

    @Override // defpackage.AbstractC15335l
    public final void firebase(int i, AbstractC15257l abstractC15257l) throws IOException {
        tapsense(i, 2);
        license(abstractC15257l.size());
        C14809l c14809l = (C14809l) abstractC15257l;
        ads(c14809l.smaato(), c14809l.size(), c14809l.f28972l);
    }

    public final void inmobi(int i) throws IOException {
        if (this.purchase - this.billing < i) {
            appmetrica();
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void isPro(int i, boolean z) throws IOException {
        inmobi(11);
        signatures(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.billing;
        this.amazon[i2] = b;
        this.billing = i2 + 1;
    }

    public final void isVip(long j) {
        int i = this.billing;
        byte[] bArr = this.amazon;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.billing = i + 8;
    }

    @Override // defpackage.AbstractC15335l
    public final void license(int i) throws IOException {
        inmobi(5);
        premium(i);
    }

    @Override // defpackage.AbstractC15335l
    public final void metrica(long j) throws IOException {
        inmobi(8);
        isVip(j);
    }

    public final void premium(int i) {
        boolean z = AbstractC15335l.crashlytics;
        byte[] bArr = this.amazon;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.billing;
                if (i2 == 0) {
                    this.billing = i3 + 1;
                    AbstractC1900l.firebase(bArr, i3, (byte) i);
                    return;
                } else {
                    this.billing = i3 + 1;
                    AbstractC1900l.firebase(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.billing;
                if (i4 == 0) {
                    this.billing = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.billing = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void pro(int i, long j) throws IOException {
        inmobi(20);
        signatures(i, 0);
        applovin(j);
    }

    @Override // defpackage.AbstractC15335l
    public final void remoteconfig(int i) throws IOException {
        inmobi(4);
        advert(i);
    }

    public final void signatures(int i, int i2) {
        premium((i << 3) | i2);
    }

    @Override // defpackage.AbstractC15335l
    public final void smaato(int i, int i2) throws IOException {
        inmobi(14);
        signatures(i, 5);
        advert(i2);
    }

    @Override // defpackage.AbstractC15335l
    public final void startapp(int i, int i2) throws IOException {
        inmobi(20);
        signatures(i, 0);
        if (i2 >= 0) {
            premium(i2);
        } else {
            applovin(i2);
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void subs(byte b) throws IOException {
        if (this.billing == this.purchase) {
            appmetrica();
        }
        int i = this.billing;
        this.amazon[i] = b;
        this.billing = i + 1;
    }

    @Override // defpackage.AbstractC15335l
    public final void subscription(int i, String str) throws IOException {
        tapsense(i, 2);
        try {
            int length = str.length() * 3;
            int iBilling = AbstractC15335l.billing(length);
            int i2 = iBilling + length;
            int i3 = this.purchase;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iBilling2 = AbstractC3472l.yandex.billing(str, bArr, 0, length);
                license(iBilling2);
                m2079throws(bArr, 0, iBilling2);
                return;
            }
            if (i2 > i3 - this.billing) {
                appmetrica();
            }
            int iBilling3 = AbstractC15335l.billing(str.length());
            int i4 = this.billing;
            byte[] bArr2 = this.amazon;
            try {
                if (iBilling3 != iBilling) {
                    int iLoadAd = AbstractC3472l.loadAd(str);
                    premium(iLoadAd);
                    this.billing = AbstractC3472l.yandex.billing(str, bArr2, this.billing, iLoadAd);
                    return;
                }
                int i5 = i4 + iBilling3;
                this.billing = i5;
                int iBilling4 = AbstractC3472l.yandex.billing(str, bArr2, i5, i3 - i5);
                this.billing = i4;
                premium((iBilling4 - i4) - iBilling3);
                this.billing = iBilling4;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new C8413l((IndexOutOfBoundsException) e);
            } catch (C13717l e2) {
                this.billing = i4;
                throw e2;
            }
        } catch (C13717l e3) {
            admob(str, e3);
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void tapsense(int i, int i2) throws IOException {
        license((i << 3) | i2);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m2079throws(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.billing;
        int i4 = this.purchase;
        int i5 = i4 - i3;
        byte[] bArr2 = this.amazon;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.billing += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.billing = i4;
        appmetrica();
        if (i7 > i4) {
            this.mopub.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.billing = i7;
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void vip(int i, long j) throws IOException {
        inmobi(18);
        signatures(i, 1);
        isVip(j);
    }
}
