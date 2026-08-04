package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8582l {
    public C7260l admob;
    public final C8470l amazon;
    public InterfaceC9719l billing;
    public final C0361l crashlytics;
    public InterfaceC15283l firebase;
    public C18595l isPro;
    public final C0045l loadAd;
    public InterfaceC9719l mopub;
    public boolean purchase;
    public byte[] smaato;
    public byte[] subs;
    public final InterfaceC3481l yandex;

    public C8582l(InterfaceC3481l interfaceC3481l, C0045l c0045l, C0361l c0361l) {
        this.yandex = interfaceC3481l;
        this.loadAd = c0045l;
        this.crashlytics = c0361l;
        byte[] bArr = new byte[c0361l.f1426l];
        this.amazon = null;
    }

    public final void amazon(boolean z, InterfaceC9719l interfaceC9719l, InterfaceC9719l interfaceC9719l2, InterfaceC9719l interfaceC9719l3) {
        this.purchase = z;
        this.billing = interfaceC9719l;
        this.mopub = interfaceC9719l2;
        this.subs = new byte[0];
        crashlytics(interfaceC9719l3);
    }

    public final void crashlytics(InterfaceC9719l interfaceC9719l) {
        if (interfaceC9719l instanceof C0272l) {
            C0272l c0272l = (C0272l) interfaceC9719l;
            this.smaato = c0272l.f1273l;
            interfaceC9719l = c0272l.f1272l;
        } else {
            this.smaato = null;
        }
        this.admob = (C7260l) interfaceC9719l;
    }

    public final byte[] loadAd(int i, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int iYandex;
        byte[] bArr4;
        C0045l c0045l = this.loadAd;
        C8470l c8470l = this.amazon;
        if (c8470l == null) {
            byte[] bArr5 = new byte[i];
            int i2 = this.admob.f15106l / 8;
            byte[] bArr6 = new byte[i2];
            int i3 = i + i2;
            byte[] bArr7 = new byte[i3];
            c0045l.purchase(i3, bArr7);
            if (this.subs.length != 0) {
                System.arraycopy(bArr7, 0, bArr6, 0, i2);
                System.arraycopy(bArr7, i2, bArr5, 0, i);
            } else {
                System.arraycopy(bArr7, 0, bArr5, 0, i);
                System.arraycopy(bArr7, i, bArr6, 0, i2);
            }
            byte[] bArr8 = new byte[i];
            for (int i4 = 0; i4 != i; i4++) {
                bArr8[i4] = (byte) (bArr[i4] ^ bArr5[i4]);
            }
            bArr2 = bArr6;
            bArr3 = bArr8;
            iYandex = i;
        } else {
            C7260l c7260l = this.admob;
            int i5 = c7260l.f15109l / 8;
            byte[] bArr9 = new byte[i5];
            int i6 = c7260l.f15106l / 8;
            bArr2 = new byte[i6];
            int i7 = i5 + i6;
            byte[] bArr10 = new byte[i7];
            c0045l.purchase(i7, bArr10);
            System.arraycopy(bArr10, 0, bArr9, 0, i5);
            System.arraycopy(bArr10, i5, bArr2, 0, i6);
            c8470l.billing(true, this.smaato != null ? new C0272l(new C13886l(bArr9, 0, i5), this.smaato) : new C13886l(bArr9, 0, i5));
            bArr3 = new byte[c8470l.crashlytics(i)];
            int iSubs = this.amazon.subs(bArr, 0, i, bArr3, 0);
            iYandex = iSubs + c8470l.yandex(bArr3, iSubs);
        }
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(this.admob.f15107l);
        if (this.subs.length != 0) {
            bArr4 = new byte[8];
            if (bArrCrashlytics != null) {
                AbstractC10000l.Signature(((long) bArrCrashlytics.length) * 8, bArr4, 0);
            }
        } else {
            bArr4 = null;
        }
        C0361l c0361l = this.crashlytics;
        int i8 = c0361l.f1426l;
        byte[] bArr11 = new byte[i8];
        c0361l.init(new C13886l(bArr2, 0, bArr2.length));
        c0361l.update(bArr3, 0, bArr3.length);
        if (bArrCrashlytics != null) {
            c0361l.update(bArrCrashlytics, 0, bArrCrashlytics.length);
        }
        if (this.subs.length != 0) {
            c0361l.update(bArr4, 0, bArr4.length);
        }
        c0361l.doFinal(bArr11, 0);
        byte[] bArr12 = this.subs;
        byte[] bArr13 = new byte[bArr12.length + iYandex + i8];
        System.arraycopy(bArr12, 0, bArr13, 0, bArr12.length);
        System.arraycopy(bArr3, 0, bArr13, this.subs.length, iYandex);
        System.arraycopy(bArr11, 0, bArr13, this.subs.length + iYandex, i8);
        return bArr13;
    }

    public final byte[] purchase(int i, byte[] bArr) throws C10352l {
        if (this.purchase) {
            C18595l c18595l = this.isPro;
            if (c18595l != null) {
                C18595l c18595lPurchase = ((InterfaceC8145l) c18595l.f36317l).purchase();
                InterfaceC17797l interfaceC17797l = (InterfaceC17797l) c18595l.f36316l;
                this.billing = (AbstractC8831l) c18595lPurchase.f36316l;
                this.subs = interfaceC17797l.getEncoded((AbstractC8831l) c18595lPurchase.f36317l);
            }
        } else if (this.firebase != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i);
            try {
                this.mopub = this.firebase.isVip(byteArrayInputStream);
                this.subs = AbstractC14024l.vip(0, i - byteArrayInputStream.available(), bArr);
            } catch (IOException e) {
                throw new C10352l(AbstractC5020l.adcel(e, new StringBuilder("unable to recover ephemeral public key: ")), e);
            } catch (IllegalArgumentException e2) {
                throw new C10352l("unable to recover ephemeral public key: " + e2.getMessage(), e2);
            }
        }
        InterfaceC9719l interfaceC9719l = this.billing;
        InterfaceC3481l interfaceC3481l = this.yandex;
        interfaceC3481l.init(interfaceC9719l);
        byte[] bArrYandex = AbstractC16784l.yandex(interfaceC3481l.getFieldSize(), interfaceC3481l.yandex(this.mopub));
        byte[] bArr2 = this.subs;
        if (bArr2.length != 0) {
            byte[] bArrMopub = AbstractC14024l.mopub(bArr2, bArrYandex);
            Arrays.fill(bArrYandex, (byte) 0);
            bArrYandex = bArrMopub;
        }
        try {
            this.loadAd.billing(new C9800l(bArrYandex, AbstractC14024l.crashlytics(this.admob.f15108l)));
            return this.purchase ? loadAd(i, bArr) : yandex(i, bArr);
        } finally {
            Arrays.fill(bArrYandex, (byte) 0);
        }
    }

    public final byte[] yandex(int i, byte[] bArr) throws C10352l {
        byte[] bArr2;
        String str;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int iSubs;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8 = this.subs;
        int length = bArr8.length;
        C0361l c0361l = this.crashlytics;
        int i2 = c0361l.f1426l;
        if (i >= length + i2) {
            C0045l c0045l = this.loadAd;
            C8470l c8470l = this.amazon;
            if (c8470l == null) {
                int length2 = (i - bArr8.length) - i2;
                byte[] bArr9 = new byte[length2];
                int i3 = this.admob.f15106l / 8;
                byte[] bArr10 = new byte[i3];
                int i4 = length2 + i3;
                byte[] bArr11 = new byte[i4];
                c0045l.purchase(i4, bArr11);
                if (this.subs.length != 0) {
                    System.arraycopy(bArr11, 0, bArr10, 0, i3);
                    System.arraycopy(bArr11, i3, bArr9, 0, length2);
                } else {
                    System.arraycopy(bArr11, 0, bArr9, 0, length2);
                    System.arraycopy(bArr11, length2, bArr10, 0, i3);
                }
                byte[] bArr12 = new byte[length2];
                for (int i5 = 0; i5 != length2; i5++) {
                    bArr12[i5] = (byte) (bArr[this.subs.length + i5] ^ bArr9[i5]);
                }
                bArr3 = bArr10;
                iSubs = 0;
                bArr4 = bArr12;
                bArr5 = bArr;
            } else {
                C7260l c7260l = this.admob;
                int i6 = c7260l.f15109l / 8;
                byte[] bArr13 = new byte[i6];
                int i7 = c7260l.f15106l / 8;
                bArr3 = new byte[i7];
                int i8 = i6 + i7;
                byte[] bArr14 = new byte[i8];
                c0045l.purchase(i8, bArr14);
                System.arraycopy(bArr14, 0, bArr13, 0, i6);
                System.arraycopy(bArr14, i6, bArr3, 0, i7);
                InterfaceC9719l c13886l = new C13886l(bArr13, 0, i6);
                byte[] bArr15 = this.smaato;
                if (bArr15 != null) {
                    c13886l = new C0272l(c13886l, bArr15, 0, bArr15.length);
                }
                c8470l.billing(false, c13886l);
                bArr4 = new byte[c8470l.crashlytics((i - this.subs.length) - i2)];
                byte[] bArr16 = this.subs;
                bArr5 = bArr;
                iSubs = this.amazon.subs(bArr5, bArr16.length, (i - bArr16.length) - i2, bArr4, 0);
            }
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(this.admob.f15107l);
            if (this.subs.length != 0) {
                bArr7 = new byte[8];
                if (bArrCrashlytics != null) {
                    bArr6 = null;
                    AbstractC10000l.Signature(((long) bArrCrashlytics.length) * 8, bArr7, 0);
                } else {
                    bArr6 = null;
                }
            } else {
                bArr6 = null;
                bArr7 = null;
            }
            byte[] bArrVip = AbstractC14024l.vip(i - i2, i, bArr5);
            int length3 = bArrVip.length;
            byte[] bArr17 = new byte[length3];
            bArr2 = bArr6;
            c0361l.init(new C13886l(bArr3, 0, bArr3.length));
            byte[] bArr18 = this.subs;
            c0361l.update(bArr5, bArr18.length, (i - bArr18.length) - length3);
            if (bArrCrashlytics != null) {
                c0361l.update(bArrCrashlytics, 0, bArrCrashlytics.length);
            }
            if (this.subs.length != 0) {
                c0361l.update(bArr7, 0, bArr7.length);
            }
            c0361l.doFinal(bArr17, 0);
            if (AbstractC14024l.smaato(bArrVip, bArr17)) {
                return c8470l == null ? bArr4 : AbstractC14024l.vip(0, c8470l.yandex(bArr4, iSubs) + iSubs, bArr4);
            }
            str = "invalid MAC";
        } else {
            bArr2 = null;
            str = "Length of input must be greater than the MAC and V combined";
        }
        C11467l.remoteconfig(str);
        return bArr2;
    }

    public C8582l(InterfaceC3481l interfaceC3481l, C0045l c0045l, C0361l c0361l, C8470l c8470l) {
        this.yandex = interfaceC3481l;
        this.loadAd = c0045l;
        this.crashlytics = c0361l;
        byte[] bArr = new byte[c0361l.f1426l];
        this.amazon = c8470l;
    }
}
