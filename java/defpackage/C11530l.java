package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lُۨۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11530l extends AbstractC15335l {
    public final byte[] amazon;
    public int billing;
    public final int purchase;

    public C11530l(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            C8339l.metrica(AbstractC12589l.premium(bArr.length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.amazon = bArr;
        this.billing = 0;
        this.purchase = i;
    }

    @Override // defpackage.AbstractC15335l
    public final void Signature(int i, int i2) throws C8413l {
        tapsense(i, 0);
        license(i2);
    }

    @Override // defpackage.AbstractC15335l
    public final void ad(long j) throws C8413l {
        int i;
        int i2 = this.billing;
        boolean z = AbstractC15335l.crashlytics;
        byte[] bArr = this.amazon;
        if (!z || advert() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8413l(i, this.purchase, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                AbstractC1900l.firebase(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC1900l.firebase(bArr, i2, (byte) j);
        }
        this.billing = i;
    }

    @Override // defpackage.AbstractC15335l
    public final void adcel(int i) throws C8413l {
        if (i >= 0) {
            license(i);
        } else {
            ad(i);
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void ads(int i, int i2, byte[] bArr) throws C8413l {
        try {
            System.arraycopy(bArr, i, this.amazon, this.billing, i2);
            this.billing += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(this.billing, this.purchase, i2, e);
        }
    }

    public final int advert() {
        return this.purchase - this.billing;
    }

    @Override // defpackage.AbstractC15335l
    public final void firebase(int i, AbstractC15257l abstractC15257l) throws C8413l {
        tapsense(i, 2);
        license(abstractC15257l.size());
        C14809l c14809l = (C14809l) abstractC15257l;
        ads(c14809l.smaato(), c14809l.size(), c14809l.f28972l);
    }

    @Override // defpackage.AbstractC15335l
    public final void isPro(int i, boolean z) throws C8413l {
        tapsense(i, 0);
        subs(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.AbstractC15335l
    public final void license(int i) throws C8413l {
        int i2;
        int i3 = this.billing;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.amazon;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.billing = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8413l(i2, this.purchase, 1, e);
                }
            }
            throw new C8413l(i2, this.purchase, 1, e);
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void metrica(long j) throws C8413l {
        int i = this.billing;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(i, this.purchase, 8, e);
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void pro(int i, long j) throws C8413l {
        tapsense(i, 0);
        ad(j);
    }

    @Override // defpackage.AbstractC15335l
    public final void remoteconfig(int i) throws C8413l {
        int i2 = this.billing;
        try {
            byte[] bArr = this.amazon;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.billing = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(i2, this.purchase, 4, e);
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void smaato(int i, int i2) throws C8413l {
        tapsense(i, 5);
        remoteconfig(i2);
    }

    @Override // defpackage.AbstractC15335l
    public final void startapp(int i, int i2) throws C8413l {
        tapsense(i, 0);
        adcel(i2);
    }

    @Override // defpackage.AbstractC15335l
    public final void subs(byte b) throws C8413l {
        int i = this.billing;
        try {
            int i2 = i + 1;
            try {
                this.amazon[i] = b;
                this.billing = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new C8413l(i, this.purchase, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void subscription(int i, String str) throws C8413l {
        tapsense(i, 2);
        int i2 = this.billing;
        try {
            int iBilling = AbstractC15335l.billing(str.length() * 3);
            int iBilling2 = AbstractC15335l.billing(str.length());
            byte[] bArr = this.amazon;
            if (iBilling2 != iBilling) {
                license(AbstractC3472l.loadAd(str));
                this.billing = AbstractC3472l.yandex.billing(str, bArr, this.billing, advert());
                return;
            }
            int i3 = i2 + iBilling2;
            this.billing = i3;
            int iBilling3 = AbstractC3472l.yandex.billing(str, bArr, i3, advert());
            this.billing = i2;
            license((iBilling3 - i2) - iBilling2);
            this.billing = iBilling3;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(e);
        } catch (C13717l e2) {
            this.billing = i2;
            admob(str, e2);
        }
    }

    @Override // defpackage.AbstractC15335l
    public final void tapsense(int i, int i2) throws C8413l {
        license((i << 3) | i2);
    }

    @Override // defpackage.AbstractC15335l
    public final void vip(int i, long j) throws C8413l {
        tapsense(i, 1);
        metrica(j);
    }
}
