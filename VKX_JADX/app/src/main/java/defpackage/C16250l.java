package defpackage;

/* JADX INFO: renamed from: lؚٖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16250l extends AbstractC11078l {
    public final byte[] amazon;
    public int billing;
    public final int purchase;

    public C16250l(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            C18073l.adcel("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.amazon = bArr;
        this.billing = 0;
        this.purchase = i;
    }

    @Override // defpackage.AbstractC11078l
    public final void Signature(int i, int i2) throws C8413l {
        pro((i << 3) | i2);
    }

    @Override // defpackage.AbstractC11078l
    public final void ad(int i, long j) throws C8413l {
        Signature(i, 0);
        advert(j);
    }

    @Override // defpackage.AbstractC11078l
    public final void adcel(int i) throws C8413l {
        if (i >= 0) {
            pro(i);
        } else {
            advert(i);
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void ads(int i, int i2, byte[] bArr) throws C8413l {
        try {
            System.arraycopy(bArr, i, this.amazon, this.billing, i2);
            this.billing += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), Integer.valueOf(i2)), e, 1);
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void advert(long j) throws C8413l {
        boolean z = AbstractC11078l.crashlytics;
        byte[] bArr = this.amazon;
        if (!z || isVip() < 10) {
            while (true) {
                long j2 = j & (-128);
                int i = this.billing;
                if (j2 == 0) {
                    this.billing = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        this.billing = i + 1;
                        bArr[i] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
                    }
                }
                throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i2 = this.billing;
            if (j3 == 0) {
                this.billing = i2 + 1;
                AbstractC10176l.firebase(bArr, i2, (byte) j);
                return;
            } else {
                this.billing = i2 + 1;
                AbstractC10176l.firebase(bArr, i2, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void firebase(int i, AbstractC16071l abstractC16071l) throws C8413l {
        Signature(i, 2);
        pro(abstractC16071l.size());
        C15379l c15379l = (C15379l) abstractC16071l;
        ads(c15379l.firebase(), c15379l.size(), c15379l.f30044l);
    }

    @Override // defpackage.AbstractC11078l
    public final void isPro(int i, boolean z) throws C8413l {
        Signature(i, 0);
        subs(z ? (byte) 1 : (byte) 0);
    }

    public final int isVip() {
        return this.purchase - this.billing;
    }

    @Override // defpackage.AbstractC11078l
    public final void license(int i, int i2) throws C8413l {
        Signature(i, 0);
        pro(i2);
    }

    @Override // defpackage.AbstractC11078l
    public final void metrica(long j) throws C8413l {
        try {
            byte[] bArr = this.amazon;
            int i = this.billing;
            int i2 = i + 1;
            this.billing = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.billing = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.billing = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.billing = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void pro(int i) throws C8413l {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.billing;
            byte[] bArr = this.amazon;
            if (i2 == 0) {
                this.billing = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.billing = i3 + 1;
                    bArr[i3] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
                }
            }
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void remoteconfig(int i) throws C8413l {
        try {
            byte[] bArr = this.amazon;
            int i2 = this.billing;
            int i3 = i2 + 1;
            this.billing = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.billing = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.billing = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.billing = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void smaato(int i, int i2) throws C8413l {
        Signature(i, 5);
        remoteconfig(i2);
    }

    @Override // defpackage.AbstractC11078l
    public final void startapp(int i, int i2) throws C8413l {
        Signature(i, 0);
        adcel(i2);
    }

    @Override // defpackage.AbstractC11078l
    public final void subs(byte b) throws C8413l {
        try {
            byte[] bArr = this.amazon;
            int i = this.billing;
            this.billing = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.billing), Integer.valueOf(this.purchase), 1), e, 1);
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void subscription(int i, AbstractC9446l abstractC9446l, InterfaceC9608l interfaceC9608l) throws C8413l {
        Signature(i, 2);
        pro(abstractC9446l.loadAd(interfaceC9608l));
        interfaceC9608l.billing(this.yandex, abstractC9446l);
    }

    @Override // defpackage.AbstractC11078l
    public final void tapsense(int i, String str) throws C8413l {
        Signature(i, 2);
        int i2 = this.billing;
        try {
            int iBilling = AbstractC11078l.billing(str.length() * 3);
            int iBilling2 = AbstractC11078l.billing(str.length());
            byte[] bArr = this.amazon;
            if (iBilling2 != iBilling) {
                pro(AbstractC11523l.loadAd(str));
                this.billing = AbstractC11523l.yandex.purchase(str, bArr, this.billing, isVip());
                return;
            }
            int i3 = i2 + iBilling2;
            this.billing = i3;
            int iPurchase = AbstractC11523l.yandex.purchase(str, bArr, i3, isVip());
            this.billing = i2;
            pro((iPurchase - i2) - iBilling2);
            this.billing = iPurchase;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(e);
        } catch (C16458l e2) {
            this.billing = i2;
            admob(str, e2);
        }
    }

    @Override // defpackage.AbstractC11078l
    public final void vip(int i, long j) throws C8413l {
        Signature(i, 1);
        metrica(j);
    }
}
