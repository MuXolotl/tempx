package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًُِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11758l implements isPro {
    public int admob;
    public C10348l amazon;
    public byte[] billing;
    public int crashlytics;
    public boolean firebase;
    public int isPro;
    public boolean loadAd;
    public byte[] mopub;
    public byte[] purchase;
    public byte[] smaato;
    public byte[] subs;
    public C9786l yandex;

    public final void amazon() {
        C10348l c10348l = this.amazon;
        if (this.firebase) {
            return;
        }
        this.firebase = true;
        c10348l.doFinal(this.billing, 0);
        int i = this.crashlytics;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 2;
        c10348l.update(bArr, 0, i);
    }

    public final void billing(boolean z) {
        this.yandex.reset();
        C10348l c10348l = this.amazon;
        c10348l.reset();
        this.isPro = 0;
        Arrays.fill(this.subs, (byte) 0);
        if (z) {
            Arrays.fill(this.mopub, (byte) 0);
        }
        int i = this.crashlytics;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 1;
        c10348l.update(bArr, 0, i);
        this.firebase = false;
        byte[] bArr2 = this.smaato;
        if (bArr2 != null) {
            yandex(0, bArr2.length, bArr2);
        }
    }

    public final void crashlytics() {
        byte[] bArr = new byte[this.crashlytics];
        int i = 0;
        this.amazon.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.mopub;
            if (i >= bArr2.length) {
                return;
            }
            bArr2[i] = (byte) ((this.purchase[i] ^ this.billing[i]) ^ bArr[i]);
            i++;
        }
    }

    @Override // defpackage.firebase
    public final int doFinal(byte[] bArr, int i) throws C10352l {
        String str;
        byte[] bArr2 = this.mopub;
        C10348l c10348l = this.amazon;
        C9786l c9786l = this.yandex;
        amazon();
        int i2 = this.isPro;
        byte[] bArr3 = this.subs;
        byte[] bArr4 = new byte[bArr3.length];
        this.isPro = 0;
        if (this.loadAd) {
            int i3 = i + i2;
            if (bArr.length < this.admob + i3) {
                C18073l.ad("Output buffer too short");
                return 0;
            }
            c9786l.tapsense(0, 0, bArr3, bArr4);
            System.arraycopy(bArr4, 0, bArr, i, i2);
            c10348l.update(bArr4, 0, i2);
            crashlytics();
            System.arraycopy(bArr2, 0, bArr, i3, this.admob);
            billing(false);
            return i2 + this.admob;
        }
        int i4 = this.admob;
        if (i2 < i4) {
            str = "data too short";
        } else {
            if (bArr.length < (i + i2) - i4) {
                C18073l.ad("Output buffer too short");
                return 0;
            }
            if (i2 > i4) {
                c10348l.update(bArr3, 0, i2 - i4);
                c9786l.tapsense(0, 0, this.subs, bArr4);
                System.arraycopy(bArr4, 0, bArr, i, i2 - this.admob);
            }
            crashlytics();
            byte[] bArr5 = this.subs;
            int i5 = i2 - this.admob;
            int i6 = 0;
            for (int i7 = 0; i7 < this.admob; i7++) {
                i6 |= bArr2[i7] ^ bArr5[i5 + i7];
            }
            if (i6 == 0) {
                billing(false);
                return i2 - this.admob;
            }
            str = "mac check in EAX failed";
        }
        C11467l.remoteconfig(str);
        return 0;
    }

    @Override // defpackage.firebase
    public final String getAlgorithmName() {
        return this.yandex.f13718l.getAlgorithmName().concat("/EAX");
    }

    @Override // defpackage.firebase
    public final int getOutputSize(int i) {
        int i2 = i + this.isPro;
        boolean z = this.loadAd;
        int i3 = this.admob;
        if (z) {
            return i2 + i3;
        }
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // defpackage.isPro
    public final InterfaceC10952l getUnderlyingCipher() {
        return this.yandex.f13718l;
    }

    @Override // defpackage.firebase
    public final int getUpdateOutputSize(int i) {
        int i2 = i + this.isPro;
        if (!this.loadAd) {
            int i3 = this.admob;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % this.crashlytics);
    }

    @Override // defpackage.firebase
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        byte[] bArrCrashlytics;
        InterfaceC9719l interfaceC9719l2;
        byte[] bArr = this.purchase;
        int i = this.crashlytics;
        C10348l c10348l = this.amazon;
        this.loadAd = z;
        if (interfaceC9719l instanceof remoteconfig) {
            remoteconfig remoteconfigVar = (remoteconfig) interfaceC9719l;
            bArrCrashlytics = AbstractC14024l.crashlytics(remoteconfigVar.f36560l);
            this.smaato = AbstractC14024l.crashlytics(remoteconfigVar.f36561l);
            this.admob = remoteconfigVar.f36562l / 8;
            interfaceC9719l2 = remoteconfigVar.f36559l;
        } else {
            if (!(interfaceC9719l instanceof C0272l)) {
                C8339l.metrica("invalid parameters passed to EAX");
                return;
            }
            C0272l c0272l = (C0272l) interfaceC9719l;
            bArrCrashlytics = c0272l.f1273l;
            this.smaato = null;
            this.admob = c10348l.f21135l / 2;
            interfaceC9719l2 = c0272l.f1272l;
        }
        this.subs = new byte[z ? i : this.admob + i];
        byte[] bArr2 = new byte[i];
        c10348l.init(interfaceC9719l2);
        bArr2[i - 1] = 0;
        c10348l.update(bArr2, 0, i);
        c10348l.update(bArrCrashlytics, 0, bArrCrashlytics.length);
        c10348l.doFinal(bArr, 0);
        this.yandex.init(true, new C0272l(interfaceC9719l2, bArr));
        billing(true);
    }

    @Override // defpackage.firebase
    public final byte[] loadAd() {
        int i = this.admob;
        byte[] bArr = new byte[i];
        System.arraycopy(this.mopub, 0, bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.firebase
    public final int processByte(byte b, byte[] bArr, int i) {
        amazon();
        return purchase(b, bArr, i);
    }

    @Override // defpackage.firebase
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        amazon();
        if (bArr.length < i + i2) {
            C10754l.ad("Input buffer too short");
            return 0;
        }
        if (bArr == bArr2 && AbstractC14024l.ad(i, i2, i3, getUpdateOutputSize(i2))) {
            bArr = new byte[i2];
            System.arraycopy(bArr2, i, bArr, 0, i2);
            i = 0;
        }
        int iPurchase = 0;
        for (int i4 = 0; i4 != i2; i4++) {
            iPurchase += purchase(bArr[i + i4], bArr2, i3 + iPurchase);
        }
        return iPurchase;
    }

    public final int purchase(byte b, byte[] bArr, int i) {
        int iTapsense;
        C10348l c10348l = this.amazon;
        C9786l c9786l = this.yandex;
        int i2 = this.crashlytics;
        byte[] bArr2 = this.subs;
        int i3 = this.isPro;
        int i4 = i3 + 1;
        this.isPro = i4;
        bArr2[i3] = b;
        if (i4 == bArr2.length) {
            if (bArr.length >= i + i2) {
                if (this.loadAd) {
                    iTapsense = c9786l.tapsense(0, i, bArr2, bArr);
                    c10348l.update(bArr, i, i2);
                } else {
                    c10348l.update(bArr2, 0, i2);
                    iTapsense = c9786l.tapsense(0, i, this.subs, bArr);
                }
                this.isPro = 0;
                if (!this.loadAd) {
                    byte[] bArr3 = this.subs;
                    System.arraycopy(bArr3, i2, bArr3, 0, this.admob);
                    this.isPro = this.admob;
                }
                return iTapsense;
            }
            C18073l.ad("Output buffer is too short");
        }
        return 0;
    }

    @Override // defpackage.firebase
    public final void yandex(int i, int i2, byte[] bArr) {
        if (this.firebase) {
            C8339l.smaato("AAD data cannot be added after encryption/decryption processing has begun.");
        } else {
            this.amazon.update(bArr, i, i2);
        }
    }
}
