package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: lؘِۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5977l extends AbstractC11078l {
    public final byte[] amazon;
    public int billing;
    public final OutputStream mopub;
    public final int purchase;

    public C5977l(OutputStream outputStream, int i) {
        if (i < 0) {
            C8339l.metrica("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.amazon = new byte[iMax];
        this.purchase = iMax;
        if (outputStream != null) {
            this.mopub = outputStream;
        } else {
            C6541l.subs("out");
            throw null;
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void Signature(int i, int i2) {
        pro((i << 3) | i2);
    }

    @Override // defpackage.AbstractC11078l
    public final void ad(int i, long j) {
        m1918throws(20);
        premium(i, 0);
        appmetrica(j);
    }

    @Override // defpackage.AbstractC11078l
    public final void adcel(int i) {
        if (i >= 0) {
            pro(i);
        } else {
            advert(i);
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void ads(int i, int i2, byte[] bArr) throws IOException {
        m1917package(bArr, i, i2);
    }

    @Override // defpackage.AbstractC11078l
    public final void advert(long j) {
        m1918throws(10);
        appmetrica(j);
    }

    public final void applovin(int i) {
        boolean z = AbstractC11078l.crashlytics;
        byte[] bArr = this.amazon;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.billing;
                if (i2 == 0) {
                    this.billing = i3 + 1;
                    AbstractC10176l.firebase(bArr, i3, (byte) i);
                    return;
                } else {
                    this.billing = i3 + 1;
                    AbstractC10176l.firebase(bArr, i3, (byte) ((i | 128) & 255));
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
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void appmetrica(long j) {
        boolean z = AbstractC11078l.crashlytics;
        byte[] bArr = this.amazon;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.billing;
                if (j2 == 0) {
                    this.billing = i + 1;
                    AbstractC10176l.firebase(bArr, i, (byte) j);
                    return;
                } else {
                    this.billing = i + 1;
                    AbstractC10176l.firebase(bArr, i, (byte) ((((int) j) | 128) & 255));
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
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void firebase(int i, AbstractC16071l abstractC16071l) throws IOException {
        Signature(i, 2);
        pro(abstractC16071l.size());
        C15379l c15379l = (C15379l) abstractC16071l;
        ads(c15379l.firebase(), c15379l.size(), c15379l.f30044l);
    }

    public final void inmobi() {
        this.mopub.write(this.amazon, 0, this.billing);
        this.billing = 0;
    }

    @Override // defpackage.AbstractC11078l
    public final void isPro(int i, boolean z) {
        m1918throws(11);
        premium(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.billing;
        this.billing = i2 + 1;
        this.amazon[i2] = b;
    }

    public final void isVip(int i) {
        int i2 = this.billing;
        int i3 = i2 + 1;
        this.billing = i3;
        byte[] bArr = this.amazon;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.billing = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.billing = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.billing = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    @Override // defpackage.AbstractC11078l
    public final void license(int i, int i2) {
        m1918throws(20);
        premium(i, 0);
        applovin(i2);
    }

    @Override // defpackage.AbstractC11078l
    public final void metrica(long j) {
        m1918throws(8);
        signatures(j);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m1917package(byte[] bArr, int i, int i2) throws IOException {
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
        inmobi();
        if (i7 > i4) {
            this.mopub.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.billing = i7;
        }
    }

    public final void premium(int i, int i2) {
        applovin((i << 3) | i2);
    }

    @Override // defpackage.AbstractC11078l
    public final void pro(int i) {
        m1918throws(5);
        applovin(i);
    }

    @Override // defpackage.AbstractC11078l
    public final void remoteconfig(int i) {
        m1918throws(4);
        isVip(i);
    }

    public final void signatures(long j) {
        int i = this.billing;
        int i2 = i + 1;
        this.billing = i2;
        byte[] bArr = this.amazon;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.billing = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.billing = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.billing = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.billing = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.billing = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.billing = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.billing = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    @Override // defpackage.AbstractC11078l
    public final void smaato(int i, int i2) {
        m1918throws(14);
        premium(i, 5);
        isVip(i2);
    }

    @Override // defpackage.AbstractC11078l
    public final void startapp(int i, int i2) {
        m1918throws(20);
        premium(i, 0);
        if (i2 >= 0) {
            applovin(i2);
        } else {
            appmetrica(i2);
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void subs(byte b) {
        if (this.billing == this.purchase) {
            inmobi();
        }
        int i = this.billing;
        this.billing = i + 1;
        this.amazon[i] = b;
    }

    @Override // defpackage.AbstractC11078l
    public final void subscription(int i, AbstractC9446l abstractC9446l, InterfaceC9608l interfaceC9608l) {
        Signature(i, 2);
        pro(abstractC9446l.loadAd(interfaceC9608l));
        interfaceC9608l.billing(this.yandex, abstractC9446l);
    }

    @Override // defpackage.AbstractC11078l
    public final void tapsense(int i, String str) throws IOException {
        Signature(i, 2);
        try {
            int length = str.length() * 3;
            int iBilling = AbstractC11078l.billing(length);
            int i2 = iBilling + length;
            int i3 = this.purchase;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iPurchase = AbstractC11523l.yandex.purchase(str, bArr, 0, length);
                pro(iPurchase);
                m1917package(bArr, 0, iPurchase);
                return;
            }
            if (i2 > i3 - this.billing) {
                inmobi();
            }
            int iBilling2 = AbstractC11078l.billing(str.length());
            int i4 = this.billing;
            byte[] bArr2 = this.amazon;
            try {
                if (iBilling2 != iBilling) {
                    int iLoadAd = AbstractC11523l.loadAd(str);
                    applovin(iLoadAd);
                    this.billing = AbstractC11523l.yandex.purchase(str, bArr2, this.billing, iLoadAd);
                    return;
                }
                int i5 = i4 + iBilling2;
                this.billing = i5;
                int iPurchase2 = AbstractC11523l.yandex.purchase(str, bArr2, i5, i3 - i5);
                this.billing = i4;
                applovin((iPurchase2 - i4) - iBilling2);
                this.billing = iPurchase2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new C8413l((IndexOutOfBoundsException) e);
            } catch (C16458l e2) {
                this.billing = i4;
                throw e2;
            }
        } catch (C16458l e3) {
            admob(str, e3);
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m1918throws(int i) {
        if (this.purchase - this.billing < i) {
            inmobi();
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void vip(int i, long j) {
        m1918throws(18);
        premium(i, 1);
        signatures(j);
    }
}
