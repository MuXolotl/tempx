package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lٌُِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8716l extends AbstractC10908l {
    public final int amazon;
    public final byte[] crashlytics;
    public int purchase;

    public C8716l(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            C8339l.metrica(AbstractC12589l.premium(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.crashlytics = bArr;
        this.purchase = 0;
        this.amazon = i;
    }

    @Override // defpackage.AbstractC10908l
    public final void Signature(long j) throws C8413l {
        int i = this.purchase;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(i, this.amazon, 8, e, 14);
        }
    }

    public final int ad() {
        return this.amazon - this.purchase;
    }

    @Override // defpackage.AbstractC10908l
    public final void adcel(int i) throws C8413l {
        if (i >= 0) {
            ads(i);
        } else {
            tapsense(i);
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void admob(int i, long j) throws C8413l {
        ads(i << 3);
        tapsense(j);
    }

    @Override // defpackage.AbstractC10908l
    public final void ads(int i) throws C8413l {
        int i2;
        int i3 = this.purchase;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.crashlytics;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.purchase = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8413l(i2, this.amazon, 1, e, 14);
                }
            }
            throw new C8413l(i2, this.amazon, 1, e, 14);
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void amazon(int i, int i2) throws C8413l {
        ads((i << 3) | i2);
    }

    @Override // defpackage.AbstractC10908l
    public final void billing(int i, int i2) throws C8413l {
        ads(i << 3);
        ads(i2);
    }

    @Override // defpackage.AbstractC10908l
    public final void crashlytics(int i, int i2, byte[] bArr) throws C8413l {
        pro(i, i2, bArr);
    }

    @Override // defpackage.AbstractC10908l
    public final void firebase(int i, String str) throws C8413l {
        ads((i << 3) | 2);
        license(str);
    }

    @Override // defpackage.AbstractC10908l
    public final void isPro(int i, boolean z) throws C8413l {
        ads(i << 3);
        startapp(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.AbstractC10908l
    public final void license(String str) throws C8413l {
        int i = this.purchase;
        try {
            int iYandex = AbstractC10908l.yandex(str.length() * 3);
            int iYandex2 = AbstractC10908l.yandex(str.length());
            byte[] bArr = this.crashlytics;
            if (iYandex2 != iYandex) {
                ads(AbstractC13388l.loadAd(str));
                int i2 = this.purchase;
                this.purchase = AbstractC13388l.crashlytics(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + iYandex2;
                this.purchase = i3;
                int iCrashlytics = AbstractC13388l.crashlytics(str, bArr, i3, bArr.length - i3);
                this.purchase = i;
                ads((iCrashlytics - i) - iYandex2);
                this.purchase = iCrashlytics;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(e);
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void metrica(AbstractC12570l abstractC12570l) throws C8413l {
        AbstractC0288l abstractC0288l = (AbstractC0288l) abstractC12570l;
        ads(abstractC0288l.remoteconfig());
        abstractC0288l.billing(this);
    }

    @Override // defpackage.AbstractC10908l
    public final void mopub(int i, int i2) throws C8413l {
        ads((i << 3) | 5);
        subscription(i2);
    }

    public final void pro(int i, int i2, byte[] bArr) throws C8413l {
        try {
            System.arraycopy(bArr, i, this.crashlytics, this.purchase, i2);
            this.purchase += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(this.purchase, this.amazon, i2, e, 14);
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void purchase(int i, int i2) throws C8413l {
        ads(i << 3);
        adcel(i2);
    }

    @Override // defpackage.AbstractC10908l
    public final void remoteconfig(AbstractC15619l abstractC15619l) throws C8413l {
        ads(abstractC15619l.billing());
        abstractC15619l.firebase(this);
    }

    @Override // defpackage.AbstractC10908l
    public final void smaato(int i, AbstractC15619l abstractC15619l) throws C8413l {
        ads((i << 3) | 2);
        remoteconfig(abstractC15619l);
    }

    @Override // defpackage.AbstractC10908l
    public final void startapp(byte b) throws C8413l {
        int i = this.purchase;
        try {
            int i2 = i + 1;
            try {
                this.crashlytics[i] = b;
                this.purchase = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new C8413l(i, this.amazon, 1, e, 14);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void subs(int i, long j) throws C8413l {
        ads((i << 3) | 1);
        Signature(j);
    }

    @Override // defpackage.AbstractC10908l
    public final void subscription(int i) throws C8413l {
        int i2 = this.purchase;
        try {
            byte[] bArr = this.crashlytics;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.purchase = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(i2, this.amazon, 4, e, 14);
        }
    }

    @Override // defpackage.AbstractC10908l
    public final void tapsense(long j) throws C8413l {
        int i;
        int i2 = this.purchase;
        byte[] bArr = this.crashlytics;
        int i3 = this.amazon;
        if (!AbstractC10908l.loadAd || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new C8413l(i, i3, 1, e, 14);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new C8413l(i, i3, 1, e, 14);
            }
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                AbstractC1823l.firebase(bArr, i2, (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC1823l.firebase(bArr, i2, (byte) j3);
        }
        this.purchase = i;
    }

    @Override // defpackage.AbstractC10908l
    public final void vip(int i, byte[] bArr) throws C8413l {
        ads(i);
        pro(0, i, bArr);
    }
}
