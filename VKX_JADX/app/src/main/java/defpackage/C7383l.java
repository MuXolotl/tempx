package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؚٜٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7383l implements InterfaceC0484l {
    public byte[] admob;
    public byte[] amazon;
    public int billing;
    public boolean crashlytics;
    public C15295l isPro;
    public int loadAd;
    public InterfaceC9719l mopub;
    public byte[] purchase;
    public C15295l subs;
    public InterfaceC10952l yandex;

    public static int amazon(int i, boolean z) {
        if (!z || (i >= 32 && i <= 128 && (i & 15) == 0)) {
            return i >>> 3;
        }
        C8339l.metrica("tag length in octets must be one of {4,6,8,10,12,14,16}");
        return 0;
    }

    public static C7383l purchase(InterfaceC10952l interfaceC10952l) {
        C7383l c7383l = new C7383l();
        int i = 0;
        c7383l.subs = new C15295l(i);
        c7383l.isPro = new C15295l(i);
        c7383l.yandex = interfaceC10952l;
        int iLicense = interfaceC10952l.license();
        c7383l.loadAd = iLicense;
        c7383l.admob = new byte[iLicense];
        if (iLicense == 16) {
            return c7383l;
        }
        C8339l.metrica("cipher required with a block size of 16.");
        return null;
    }

    public final void crashlytics(int i, int i2, byte[] bArr, byte[] bArr2) {
        C15295l c15295l = this.subs;
        C1955l c1955l = new C1955l(this.yandex, this.billing * 8, null);
        c1955l.init(this.mopub);
        byte[] bArr3 = new byte[16];
        int size = c15295l.size();
        byte[] bArr4 = this.purchase;
        if (size + (bArr4 == null ? 0 : bArr4.length) > 0) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i3 = 2;
        byte b = (byte) (bArr3[0] | ((((c1955l.f4448l - 2) / 2) & 7) << 3));
        bArr3[0] = b;
        byte[] bArr5 = this.amazon;
        bArr3[0] = (byte) (b | ((14 - bArr5.length) & 7));
        System.arraycopy(bArr5, 0, bArr3, 1, bArr5.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        c1955l.update(bArr3, 0, 16);
        int size2 = c15295l.size();
        byte[] bArr6 = this.purchase;
        if (size2 + (bArr6 == null ? 0 : bArr6.length) > 0) {
            int size3 = c15295l.size();
            byte[] bArr7 = this.purchase;
            int length = size3 + (bArr7 == null ? 0 : bArr7.length);
            if (length < 65280) {
                c1955l.update((byte) (length >> 8));
                c1955l.update((byte) length);
            } else {
                c1955l.update((byte) -1);
                c1955l.update((byte) -2);
                c1955l.update((byte) (length >> 24));
                c1955l.update((byte) (length >> 16));
                c1955l.update((byte) (length >> 8));
                c1955l.update((byte) length);
                i3 = 6;
            }
            byte[] bArr8 = this.purchase;
            if (bArr8 != null) {
                c1955l.update(bArr8, 0, bArr8.length);
            }
            if (c15295l.size() > 0) {
                c1955l.update(c15295l.vip(), 0, c15295l.size());
            }
            int i6 = (i3 + length) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    c1955l.update((byte) 0);
                    i6++;
                }
            }
        }
        c1955l.update(bArr, i, i2);
        c1955l.doFinal(bArr2, 0);
    }

    @Override // defpackage.firebase
    public final int doFinal(byte[] bArr, int i) throws C10352l {
        int i2;
        InterfaceC10952l interfaceC10952l = this.yandex;
        C15295l c15295l = this.isPro;
        byte[] bArrVip = c15295l.vip();
        int size = c15295l.size();
        byte[] bArr2 = this.admob;
        int i3 = this.loadAd;
        if (this.mopub == null) {
            C8339l.smaato("CCM cipher unitialized.");
            return 0;
        }
        byte[] bArr3 = this.amazon;
        int length = bArr3.length;
        int i4 = 15 - length;
        if (i4 < 4) {
            if (size - (!this.crashlytics ? 16 : 0) >= (1 << (i4 * 8))) {
                C8339l.smaato("CCM packet too large for choice of q");
                return 0;
            }
        }
        byte[] bArr4 = new byte[i3];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        C9786l c9786l = new C9786l(interfaceC10952l);
        c9786l.init(this.crashlytics, new C0272l(this.mopub, bArr4, 0, i3));
        boolean z = this.crashlytics;
        int i5 = this.billing;
        if (z) {
            i2 = i5 + size;
            if (bArr.length < i2 + i) {
                C18073l.ad("Output buffer too short.");
                return 0;
            }
            crashlytics(0, size, bArrVip, bArr2);
            byte[] bArr5 = new byte[i3];
            c9786l.tapsense(0, 0, bArr2, bArr5);
            int i6 = i;
            int i7 = 0;
            while (i7 < size - i3) {
                c9786l.tapsense(i7, i6, bArrVip, bArr);
                i6 += i3;
                i7 += i3;
            }
            byte[] bArr6 = new byte[i3];
            int i8 = size - i7;
            System.arraycopy(bArrVip, i7, bArr6, 0, i8);
            c9786l.tapsense(0, 0, bArr6, bArr6);
            System.arraycopy(bArr6, 0, bArr, i6, i8);
            System.arraycopy(bArr5, 0, bArr, i + size, this.billing);
        } else {
            if (size < i5) {
                C11467l.remoteconfig("data too short");
                return 0;
            }
            int i9 = size - i5;
            if (bArr.length < i9 + i) {
                C18073l.ad("Output buffer too short.");
                return 0;
            }
            System.arraycopy(bArrVip, i9, bArr2, 0, i5);
            c9786l.tapsense(0, 0, bArr2, bArr2);
            for (int i10 = this.billing; i10 != bArr2.length; i10++) {
                bArr2[i10] = 0;
            }
            int i11 = i;
            int i12 = 0;
            while (i12 < i9 - i3) {
                c9786l.tapsense(i12, i11, bArrVip, bArr);
                i11 += i3;
                i12 += i3;
            }
            byte[] bArr7 = new byte[i3];
            int i13 = i9 - i12;
            System.arraycopy(bArrVip, i12, bArr7, 0, i13);
            c9786l.tapsense(0, 0, bArr7, bArr7);
            System.arraycopy(bArr7, 0, bArr, i11, i13);
            byte[] bArr8 = new byte[i3];
            crashlytics(i, i9, bArr, bArr8);
            if (!AbstractC14024l.smaato(bArr2, bArr8)) {
                C11467l.remoteconfig("mac check in CCM failed");
                return 0;
            }
            i2 = i9;
        }
        interfaceC10952l.reset();
        this.subs.reset();
        c15295l.reset();
        return i2;
    }

    @Override // defpackage.firebase
    public final String getAlgorithmName() {
        return this.yandex.getAlgorithmName().concat("/CCM");
    }

    @Override // defpackage.firebase
    public final int getOutputSize(int i) {
        int size = this.isPro.size() + i;
        boolean z = this.crashlytics;
        int i2 = this.billing;
        if (z) {
            return size + i2;
        }
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // defpackage.isPro
    public final InterfaceC10952l getUnderlyingCipher() {
        return this.yandex;
    }

    @Override // defpackage.firebase
    public final int getUpdateOutputSize(int i) {
        return 0;
    }

    @Override // defpackage.firebase
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        InterfaceC9719l interfaceC9719l2;
        this.crashlytics = z;
        if (interfaceC9719l instanceof remoteconfig) {
            remoteconfig remoteconfigVar = (remoteconfig) interfaceC9719l;
            this.amazon = AbstractC14024l.crashlytics(remoteconfigVar.f36560l);
            this.purchase = AbstractC14024l.crashlytics(remoteconfigVar.f36561l);
            this.billing = amazon(remoteconfigVar.f36562l, z);
            interfaceC9719l2 = remoteconfigVar.f36559l;
        } else {
            if (!(interfaceC9719l instanceof C0272l)) {
                C8339l.metrica(AbstractC5020l.subscription("invalid parameters passed to CCM: ", interfaceC9719l));
                return;
            }
            C0272l c0272l = (C0272l) interfaceC9719l;
            this.amazon = c0272l.f1273l;
            this.purchase = null;
            this.billing = amazon(64, z);
            interfaceC9719l2 = c0272l.f1272l;
        }
        if (interfaceC9719l2 != null) {
            this.mopub = interfaceC9719l2;
        }
        byte[] bArr = this.amazon;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            C8339l.metrica("nonce must have length from 7 to 13 octets");
            return;
        }
        this.yandex.reset();
        this.subs.reset();
        this.isPro.reset();
    }

    @Override // defpackage.firebase
    public final byte[] loadAd() {
        int i = this.billing;
        byte[] bArr = new byte[i];
        System.arraycopy(this.admob, 0, bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.firebase
    public final int processByte(byte b, byte[] bArr, int i) throws IOException {
        this.isPro.write(b);
        return 0;
    }

    @Override // defpackage.firebase
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        if (bArr.length >= i + i2) {
            this.isPro.write(bArr, i, i2);
            return 0;
        }
        C10754l.ad("Input buffer too short");
        return 0;
    }

    @Override // defpackage.firebase
    public final void yandex(int i, int i2, byte[] bArr) throws IOException {
        this.subs.write(bArr, i, i2);
    }
}
