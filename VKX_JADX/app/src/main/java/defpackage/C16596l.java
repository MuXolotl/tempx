package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: lٖۘٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16596l extends AbstractC10908l {
    public final int amazon;
    public final OutputStream billing;
    public final byte[] crashlytics;
    public int purchase;

    public C16596l(OutputStream outputStream, int i) {
        if (outputStream == null) {
            C6541l.subs("out");
            throw null;
        }
        this.billing = outputStream;
        if (i < 0) {
            C8339l.metrica("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.crashlytics = bArr;
        this.amazon = bArr.length;
    }

    @Override // defpackage.AbstractC10908l
    public final void Signature(long j) {
        signatures(8);
        advert(j);
    }

    public final void ad(int i) {
        int i2 = this.purchase;
        byte[] bArr = this.crashlytics;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.purchase = i2 + 4;
    }

    @Override // defpackage.AbstractC10908l
    public final void adcel(int i) {
        if (i >= 0) {
            ads(i);
        } else {
            tapsense(i);
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void admob(int i, long j) {
        signatures(20);
        applovin(i << 3);
        pro(j);
    }

    @Override // defpackage.AbstractC10908l
    public final void ads(int i) {
        signatures(5);
        applovin(i);
    }

    public final void advert(long j) {
        int i = this.purchase;
        byte[] bArr = this.crashlytics;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.purchase = i + 8;
    }

    @Override // defpackage.AbstractC10908l
    public final void amazon(int i, int i2) {
        ads((i << 3) | i2);
    }

    public final void applovin(int i) {
        boolean z = AbstractC10908l.loadAd;
        byte[] bArr = this.crashlytics;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.purchase;
                if (i2 == 0) {
                    this.purchase = i3 + 1;
                    AbstractC1823l.firebase(bArr, i3, (byte) i);
                    return;
                } else {
                    this.purchase = i3 + 1;
                    AbstractC1823l.firebase(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.purchase;
                if (i4 == 0) {
                    this.purchase = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.purchase = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void billing(int i, int i2) {
        signatures(20);
        applovin(i << 3);
        applovin(i2);
    }

    @Override // defpackage.AbstractC10908l
    public final void crashlytics(int i, int i2, byte[] bArr) throws IOException {
        isVip(i, i2, bArr);
    }

    @Override // defpackage.AbstractC10908l
    public final void firebase(int i, String str) throws IOException {
        ads((i << 3) | 2);
        license(str);
    }

    @Override // defpackage.AbstractC10908l
    public final void isPro(int i, boolean z) {
        signatures(11);
        applovin(i << 3);
        int i2 = this.purchase;
        this.crashlytics[i2] = z ? (byte) 1 : (byte) 0;
        this.purchase = i2 + 1;
    }

    public final void isVip(int i, int i2, byte[] bArr) throws IOException {
        int i3 = this.purchase;
        int i4 = this.amazon;
        int i5 = i4 - i3;
        byte[] bArr2 = this.crashlytics;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.purchase += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.purchase = i4;
        premium();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.billing.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.purchase = i7;
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void license(String str) throws IOException {
        int length = str.length() * 3;
        int iYandex = AbstractC10908l.yandex(length);
        int i = iYandex + length;
        int i2 = this.amazon;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iCrashlytics = AbstractC13388l.crashlytics(str, bArr, 0, length);
            ads(iCrashlytics);
            isVip(0, iCrashlytics, bArr);
            return;
        }
        if (i > i2 - this.purchase) {
            premium();
        }
        int iYandex2 = AbstractC10908l.yandex(str.length());
        int i3 = this.purchase;
        byte[] bArr2 = this.crashlytics;
        try {
            if (iYandex2 == iYandex) {
                int i4 = i3 + iYandex2;
                this.purchase = i4;
                int iCrashlytics2 = AbstractC13388l.crashlytics(str, bArr2, i4, i2 - i4);
                this.purchase = i3;
                applovin((iCrashlytics2 - i3) - iYandex2);
                this.purchase = iCrashlytics2;
            } else {
                int iLoadAd = AbstractC13388l.loadAd(str);
                applovin(iLoadAd);
                this.purchase = AbstractC13388l.crashlytics(str, bArr2, this.purchase, iLoadAd);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C8413l((IndexOutOfBoundsException) e);
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void metrica(AbstractC12570l abstractC12570l) {
        AbstractC0288l abstractC0288l = (AbstractC0288l) abstractC12570l;
        ads(abstractC0288l.remoteconfig());
        abstractC0288l.billing(this);
    }

    @Override // defpackage.AbstractC10908l
    public final void mopub(int i, int i2) {
        signatures(14);
        applovin((i << 3) | 5);
        ad(i2);
    }

    public final void premium() {
        this.billing.write(this.crashlytics, 0, this.purchase);
        this.purchase = 0;
    }

    public final void pro(long j) {
        boolean z = AbstractC10908l.loadAd;
        byte[] bArr = this.crashlytics;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.purchase;
                if (j2 == 0) {
                    this.purchase = i2 + 1;
                    AbstractC1823l.firebase(bArr, i2, (byte) i);
                    return;
                } else {
                    this.purchase = i2 + 1;
                    AbstractC1823l.firebase(bArr, i2, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.purchase;
                if (j3 == 0) {
                    this.purchase = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.purchase = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void purchase(int i, int i2) {
        signatures(20);
        applovin(i << 3);
        if (i2 >= 0) {
            applovin(i2);
        } else {
            pro(i2);
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void remoteconfig(AbstractC15619l abstractC15619l) {
        ads(abstractC15619l.billing());
        abstractC15619l.firebase(this);
    }

    public final void signatures(int i) {
        if (this.amazon - this.purchase < i) {
            premium();
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void smaato(int i, AbstractC15619l abstractC15619l) {
        ads((i << 3) | 2);
        remoteconfig(abstractC15619l);
    }

    @Override // defpackage.AbstractC10908l
    public final void startapp(byte b) {
        if (this.purchase == this.amazon) {
            premium();
        }
        int i = this.purchase;
        this.crashlytics[i] = b;
        this.purchase = i + 1;
    }

    @Override // defpackage.AbstractC10908l
    public final void subs(int i, long j) {
        signatures(18);
        applovin((i << 3) | 1);
        advert(j);
    }

    @Override // defpackage.AbstractC10908l
    public final void subscription(int i) {
        signatures(4);
        ad(i);
    }

    @Override // defpackage.AbstractC10908l
    public final void tapsense(long j) {
        signatures(10);
        pro(j);
    }

    @Override // defpackage.AbstractC10908l
    public final void vip(int i, byte[] bArr) throws IOException {
        ads(i);
        isVip(0, i, bArr);
    }
}
