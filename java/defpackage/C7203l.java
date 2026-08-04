package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: lؚِۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7203l implements isPro {
    public C15295l admob;
    public final byte[] amazon;
    public final C12720l billing;
    public final byte[] crashlytics;
    public byte[] firebase;
    public byte[] isPro;
    public final C13645l loadAd;
    public C15295l mopub;
    public final C12720l purchase;
    public final byte[] remoteconfig;
    public int smaato;
    public boolean subs;
    public final InterfaceC10952l yandex;

    public C7203l(InterfaceC10952l interfaceC10952l) {
        C13645l c13645l = new C13645l(19, false);
        this.crashlytics = new byte[16];
        this.amazon = new byte[16];
        this.remoteconfig = new byte[16];
        if (interfaceC10952l.license() != 16) {
            C8339l.metrica("Cipher required with a block size of 16.");
            throw null;
        }
        this.yandex = interfaceC10952l;
        this.loadAd = c13645l;
        this.purchase = new C12720l(this);
        this.billing = new C12720l(this);
    }

    public static void amazon(byte[] bArr, int i, int i2, boolean z) {
        int length = bArr == null ? 0 : bArr.length;
        int i3 = i + i2;
        if (i2 < 0 || i < 0 || i3 < 0 || i3 > length) {
            if (!z) {
                throw new C10314l("Input buffer too short.");
            }
        }
    }

    public static void billing(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = 0;
        int i4 = 15;
        while (i3 < i2) {
            bArr2[i4] = bArr[i + i3];
            i3++;
            i4--;
        }
    }

    public final void admob() {
        C15295l c15295l = this.mopub;
        if (c15295l != null) {
            c15295l.yandex();
        }
        C12720l c12720l = this.purchase;
        c12720l.f25082l = 0;
        c12720l.f25083l = 0L;
        C12720l c12720l2 = this.billing;
        c12720l2.f25082l = 0;
        c12720l2.f25083l = 0L;
        int i = 3;
        this.mopub = new C15295l(i);
        this.admob = this.subs ? null : new C15295l(i);
        this.smaato &= -3;
        Arrays.fill(this.crashlytics, (byte) 0);
        byte[] bArr = this.isPro;
        if (bArr != null) {
            c12720l.yandex(0, bArr.length, bArr);
        }
    }

    public final byte[] crashlytics() {
        C12720l c12720l = this.billing;
        C7203l c7203l = (C7203l) c12720l.f25081l;
        byte[] bArr = c7203l.amazon;
        if (c12720l.f25082l > 0) {
            Arrays.fill(bArr, (byte) 0);
            billing(0, c12720l.f25082l, (byte[]) c12720l.f25085l, bArr);
            c7203l.mopub(bArr);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        AbstractC10000l.Signature(c12720l.f25083l * 8, bArr3, 0);
        AbstractC10000l.Signature(this.purchase.f25083l * 8, bArr3, 8);
        mopub(bArr3);
        billing(0, 16, this.crashlytics, bArr2);
        byte[] bArr4 = new byte[16];
        for (int i = 0; i < 12; i++) {
            bArr2[i] = (byte) (bArr2[i] ^ this.firebase[i]);
        }
        bArr2[15] = (byte) (bArr2[15] & (-129));
        this.yandex.tapsense(0, 0, bArr2, bArr4);
        return bArr4;
    }

    @Override // defpackage.firebase
    public final int doFinal(byte[] bArr, int i) throws C10352l, IOException {
        String str;
        purchase(0);
        boolean z = true;
        amazon(bArr, i, getOutputSize(0), true);
        boolean z2 = this.subs;
        byte[] bArr2 = this.remoteconfig;
        InterfaceC10952l interfaceC10952l = this.yandex;
        int i2 = 16;
        if (z2) {
            byte[] bArrCrashlytics = crashlytics();
            byte[] bArrVip = this.mopub.vip();
            byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(bArrCrashlytics);
            bArrCrashlytics2[15] = (byte) (bArrCrashlytics2[15] | (-128));
            byte[] bArr3 = new byte[16];
            int size = this.mopub.size();
            int i3 = 0;
            while (size > 0) {
                interfaceC10952l.tapsense(0, 0, bArrCrashlytics2, bArr3);
                int iMin = Math.min(i2, size);
                boolean z3 = z;
                int i4 = 0;
                while (i4 < iMin) {
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArrVip[i4 + i3]);
                    i4++;
                    i2 = i2;
                }
                int i5 = i2;
                System.arraycopy(bArr3, 0, bArr, i + i3, iMin);
                size -= iMin;
                i3 += iMin;
                for (int i6 = 0; i6 < 4; i6++) {
                    byte b = (byte) (bArrCrashlytics2[i6] + 1);
                    bArrCrashlytics2[i6] = b;
                    if (b != 0) {
                        break;
                    }
                }
                z = z3;
                i2 = i5;
            }
            int size2 = this.mopub.size() + 16;
            System.arraycopy(bArrCrashlytics, 0, bArr, this.mopub.size() + i, i2);
            System.arraycopy(bArrCrashlytics, 0, bArr2, 0, bArr2.length);
            admob();
            return size2;
        }
        byte[] bArrVip2 = this.admob.vip();
        int size3 = this.admob.size();
        int i7 = size3 - 16;
        if (i7 >= 0) {
            byte[] bArrVip3 = AbstractC14024l.vip(i7, size3, bArrVip2);
            byte[] bArrCrashlytics3 = AbstractC14024l.crashlytics(bArrVip3);
            bArrCrashlytics3[15] = (byte) (bArrCrashlytics3[15] | (-128));
            int i8 = 16;
            byte[] bArr4 = new byte[16];
            int i9 = 0;
            while (i7 > 0) {
                interfaceC10952l.tapsense(0, 0, bArrCrashlytics3, bArr4);
                int iMin2 = Math.min(i8, i7);
                for (int i10 = 0; i10 < iMin2; i10++) {
                    bArr4[i10] = (byte) (bArr4[i10] ^ bArrVip2[i10 + i9]);
                }
                this.mopub.write(bArr4, 0, iMin2);
                this.billing.yandex(0, iMin2, bArr4);
                i7 -= iMin2;
                i9 += iMin2;
                for (int i11 = 0; i11 < 4; i11++) {
                    byte b2 = (byte) (bArrCrashlytics3[i11] + 1);
                    bArrCrashlytics3[i11] = b2;
                    if (b2 != 0) {
                        break;
                    }
                }
                i8 = 16;
            }
            byte[] bArrCrashlytics4 = crashlytics();
            if (AbstractC14024l.smaato(bArrCrashlytics4, bArrVip3)) {
                System.arraycopy(bArrCrashlytics4, 0, bArr2, 0, bArr2.length);
                int size4 = this.mopub.size();
                System.arraycopy(this.mopub.vip(), 0, bArr, i, size4);
                admob();
                return size4;
            }
            admob();
            str = "mac check failed";
        } else {
            str = "Data too short";
        }
        C11467l.remoteconfig(str);
        return 0;
    }

    @Override // defpackage.firebase
    public final String getAlgorithmName() {
        return this.yandex.getAlgorithmName().concat("-GCM-SIV");
    }

    @Override // defpackage.firebase
    public final int getOutputSize(int i) {
        if (this.subs) {
            return this.mopub.size() + i + 16;
        }
        int size = this.admob.size() + i;
        if (size > 16) {
            return size - 16;
        }
        return 0;
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
        byte[] bArrCrashlytics;
        C13886l c13886l;
        byte[] bArrCrashlytics2;
        if (interfaceC9719l instanceof remoteconfig) {
            remoteconfig remoteconfigVar = (remoteconfig) interfaceC9719l;
            bArrCrashlytics2 = AbstractC14024l.crashlytics(remoteconfigVar.f36561l);
            bArrCrashlytics = AbstractC14024l.crashlytics(remoteconfigVar.f36560l);
            c13886l = remoteconfigVar.f36559l;
        } else {
            if (!(interfaceC9719l instanceof C0272l)) {
                C8339l.metrica("invalid parameters passed to GCM-SIV");
                return;
            }
            C0272l c0272l = (C0272l) interfaceC9719l;
            bArrCrashlytics = c0272l.f1273l;
            c13886l = (C13886l) c0272l.f1272l;
            bArrCrashlytics2 = null;
        }
        if (bArrCrashlytics == null || bArrCrashlytics.length != 12) {
            C8339l.metrica("Invalid nonce");
            return;
        }
        if (c13886l != null) {
            byte[] bArr = c13886l.f27156l;
            if (bArr.length == 16 || bArr.length == 32) {
                this.subs = z;
                this.isPro = bArrCrashlytics2;
                this.firebase = bArrCrashlytics;
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[16];
                byte[] bArr4 = new byte[16];
                int length = bArr.length;
                byte[] bArr5 = new byte[length];
                System.arraycopy(bArrCrashlytics, 0, bArr2, 4, 12);
                InterfaceC10952l interfaceC10952l = this.yandex;
                interfaceC10952l.init(true, c13886l);
                interfaceC10952l.tapsense(0, 0, bArr2, bArr3);
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                bArr2[0] = (byte) (bArr2[0] + 1);
                interfaceC10952l.tapsense(0, 0, bArr2, bArr3);
                System.arraycopy(bArr3, 0, bArr4, 8, 8);
                bArr2[0] = (byte) (bArr2[0] + 1);
                interfaceC10952l.tapsense(0, 0, bArr2, bArr3);
                System.arraycopy(bArr3, 0, bArr5, 0, 8);
                bArr2[0] = (byte) (bArr2[0] + 1);
                interfaceC10952l.tapsense(0, 0, bArr2, bArr3);
                System.arraycopy(bArr3, 0, bArr5, 8, 8);
                if (length == 32) {
                    bArr2[0] = (byte) (bArr2[0] + 1);
                    interfaceC10952l.tapsense(0, 0, bArr2, bArr3);
                    System.arraycopy(bArr3, 0, bArr5, 16, 8);
                    bArr2[0] = (byte) (bArr2[0] + 1);
                    interfaceC10952l.tapsense(0, 0, bArr2, bArr3);
                    System.arraycopy(bArr3, 0, bArr5, 24, 8);
                }
                interfaceC10952l.init(true, new C13886l(bArr5, 0, length));
                billing(0, 16, bArr4, bArr3);
                int i = 0;
                for (int i2 = 0; i2 < 16; i2++) {
                    byte b = bArr3[i2];
                    bArr3[i2] = (byte) (i | ((b >> 1) & 127));
                    i = (b & 1) == 0 ? 0 : -128;
                }
                if (i != 0) {
                    bArr3[0] = (byte) (bArr3[0] ^ (-31));
                }
                this.loadAd.pro(bArr3);
                this.smaato |= 1;
                admob();
                return;
            }
        }
        C8339l.metrica("Invalid key");
    }

    @Override // defpackage.firebase
    public final byte[] loadAd() {
        return AbstractC14024l.crashlytics(this.remoteconfig);
    }

    public final void mopub(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = this.crashlytics;
            if (i >= 16) {
                this.loadAd.ad(bArr2);
                return;
            } else {
                bArr2[i] = (byte) (bArr2[i] ^ bArr[i]);
                i++;
            }
        }
    }

    @Override // defpackage.firebase
    public final int processByte(byte b, byte[] bArr, int i) throws IOException {
        purchase(1);
        if (!this.subs) {
            this.admob.write(b);
            return 0;
        }
        this.mopub.write(b);
        C12720l c12720l = this.billing;
        byte[] bArr2 = (byte[]) c12720l.f25084l;
        bArr2[0] = b;
        c12720l.yandex(0, 1, bArr2);
        return 0;
    }

    @Override // defpackage.firebase
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        purchase(i2);
        amazon(bArr, i, i2, false);
        if (this.subs) {
            this.mopub.write(bArr, i, i2);
            this.billing.yandex(i, i2, bArr);
        } else {
            this.admob.write(bArr, i, i2);
        }
        return 0;
    }

    public final void purchase(int i) {
        String str;
        long j;
        int i2 = this.smaato;
        if ((i2 & 1) != 0) {
            if ((i2 & 2) == 0) {
                C12720l c12720l = this.purchase;
                C7203l c7203l = (C7203l) c12720l.f25081l;
                byte[] bArr = c7203l.amazon;
                if (c12720l.f25082l > 0) {
                    Arrays.fill(bArr, (byte) 0);
                    billing(0, c12720l.f25082l, (byte[]) c12720l.f25085l, bArr);
                    c7203l.mopub(bArr);
                }
                this.smaato |= 2;
            }
            long size = this.mopub.size();
            if (this.subs) {
                j = 2147483623;
            } else {
                size = this.admob.size();
                j = 2147483639;
            }
            if (AbstractC6660l.crashlytics(size, j - ((long) i)) <= 0) {
                return;
            } else {
                str = "byte count exceeded";
            }
        } else {
            str = "Cipher is not initialised";
        }
        C8339l.smaato(str);
    }

    @Override // defpackage.firebase
    public final void yandex(int i, int i2, byte[] bArr) {
        int i3 = this.smaato;
        if ((i3 & 1) == 0) {
            C8339l.smaato("Cipher is not initialised");
            return;
        }
        if ((i3 & 2) != 0) {
            C8339l.smaato("AEAD data cannot be processed after ordinary data");
            return;
        }
        C12720l c12720l = this.purchase;
        if (AbstractC6660l.crashlytics(c12720l.f25083l, 2147483623 - i2) > 0) {
            C8339l.smaato("AEAD byte count exceeded");
        } else {
            amazon(bArr, i, i2, false);
            c12720l.yandex(i, i2, bArr);
        }
    }
}
