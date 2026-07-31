package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13237l implements isPro {
    public final InterfaceC4041l admob;
    public boolean amazon;
    public byte[] billing;
    public int crashlytics = -1;
    public final C15295l firebase;
    public final int isPro;
    public final C0800l loadAd;
    public final byte[] mopub;
    public byte[] purchase;
    public final C15295l smaato;
    public final long[] subs;
    public final InterfaceC10952l yandex;

    public C13237l(InterfaceC10952l interfaceC10952l) {
        InterfaceC4041l c13161l;
        int i = 5;
        this.firebase = new C15295l(i);
        this.smaato = new C15295l(i);
        this.yandex = interfaceC10952l;
        this.loadAd = new C0800l(new C5332l(interfaceC10952l));
        int iLicense = interfaceC10952l.license();
        this.isPro = iLicense;
        this.purchase = new byte[iLicense];
        this.mopub = new byte[iLicense];
        if (iLicense == 16) {
            c13161l = new C13161l();
        } else if (iLicense == 32) {
            c13161l = new C5138l((char) 0, 29);
        } else {
            if (iLicense != 64) {
                C8339l.metrica("Only 128, 256, and 512 -bit block sizes supported");
                throw null;
            }
            c13161l = new C10685l();
        }
        this.admob = c13161l;
        this.subs = new long[iLicense >>> 3];
        this.billing = null;
    }

    public final void amazon() {
        Arrays.fill(this.subs, 0L);
        this.yandex.reset();
        this.smaato.reset();
        this.firebase.reset();
        byte[] bArr = this.purchase;
        if (bArr != null) {
            yandex(0, bArr.length, bArr);
        }
    }

    public final void crashlytics(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i2;
        while (true) {
            int i5 = this.isPro;
            long[] jArr = this.subs;
            if (i >= i4) {
                jArr[0] = ((((long) i3) & 4294967295L) << 3) ^ jArr[0];
                int i6 = i5 >>> 4;
                jArr[i6] = ((4294967295L & ((long) i2)) << 3) ^ jArr[i6];
                byte[] bArr2 = new byte[jArr.length * 8];
                AbstractC10000l.license(0, bArr2, jArr);
                this.billing = bArr2;
                this.yandex.tapsense(0, 0, bArr2, bArr2);
                return;
            }
            int i7 = i;
            for (int i8 = 0; i8 < jArr.length; i8++) {
                jArr[i8] = jArr[i8] ^ AbstractC10000l.subscription(i7, bArr);
                i7 += 8;
            }
            this.admob.isVip(jArr);
            i += i5;
        }
    }

    @Override // defpackage.firebase
    public final int doFinal(byte[] bArr, int i) throws C10352l {
        int i2;
        int iYandex;
        long[] jArr;
        C15295l c15295l = this.smaato;
        int size = c15295l.size();
        if (!this.amazon && size < this.crashlytics) {
            C11467l.remoteconfig("data too short");
            return 0;
        }
        int i3 = this.isPro;
        byte[] bArr2 = new byte[i3];
        this.yandex.tapsense(0, 0, bArr2, bArr2);
        long[] jArr2 = new long[i3 >>> 3];
        AbstractC10000l.tapsense(0, bArr2, jArr2);
        InterfaceC4041l interfaceC4041l = this.admob;
        interfaceC4041l.mo1470else(jArr2);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(jArr2, 0L);
        C15295l c15295l2 = this.firebase;
        int size2 = c15295l2.size();
        if (size2 > 0) {
            byte[] bArrVip = c15295l2.vip();
            for (int i4 = 0; i4 < size2; i4 += i3) {
                int i5 = i4;
                int i6 = 0;
                while (true) {
                    jArr = this.subs;
                    if (i6 < jArr.length) {
                        jArr[i6] = jArr[i6] ^ AbstractC10000l.subscription(i5, bArrVip);
                        i5 += 8;
                        i6++;
                    }
                }
                interfaceC4041l.isVip(jArr);
            }
        }
        boolean z = this.amazon;
        C0800l c0800l = this.loadAd;
        if (!z) {
            i2 = size;
            int i7 = i2 - this.crashlytics;
            if (bArr.length - i < i7) {
                C18073l.ad("Output buffer too short");
                return 0;
            }
            crashlytics(c15295l.vip(), 0, i7, size2);
            int iSubs = c0800l.subs(c15295l.vip(), 0, i7, bArr, i);
            iYandex = c0800l.yandex(bArr, i + iSubs) + iSubs;
        } else {
            if ((bArr.length - i) - this.crashlytics < size) {
                C18073l.ad("Output buffer too short");
                return 0;
            }
            int iSubs2 = c0800l.subs(c15295l.vip(), 0, size, bArr, i);
            i2 = size;
            iYandex = c0800l.yandex(bArr, i + iSubs2) + iSubs2;
            crashlytics(bArr, i, i2, size2);
        }
        byte[] bArr3 = this.billing;
        if (bArr3 == null) {
            C8339l.smaato("mac is not calculated");
            return 0;
        }
        boolean z2 = this.amazon;
        int i8 = this.crashlytics;
        if (z2) {
            System.arraycopy(bArr3, 0, bArr, i + iYandex, i8);
            amazon();
            return iYandex + this.crashlytics;
        }
        byte[] bArr4 = new byte[i8];
        byte[] bArrVip2 = c15295l.vip();
        int i9 = this.crashlytics;
        System.arraycopy(bArrVip2, i2 - i9, bArr4, 0, i9);
        int i10 = this.crashlytics;
        byte[] bArr5 = new byte[i10];
        System.arraycopy(this.billing, 0, bArr5, 0, i10);
        if (AbstractC14024l.smaato(bArr4, bArr5)) {
            amazon();
            return iYandex;
        }
        C11467l.remoteconfig("mac verification failed");
        return 0;
    }

    @Override // defpackage.firebase
    public final String getAlgorithmName() {
        return this.yandex.getAlgorithmName().concat("/KGCM");
    }

    @Override // defpackage.firebase
    public final int getOutputSize(int i) {
        int size = this.smaato.size() + i;
        boolean z = this.amazon;
        int i2 = this.crashlytics;
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
        C13886l c13886l;
        this.amazon = z;
        boolean z2 = interfaceC9719l instanceof remoteconfig;
        int i = this.isPro;
        byte[] bArr = this.mopub;
        if (z2) {
            remoteconfig remoteconfigVar = (remoteconfig) interfaceC9719l;
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(remoteconfigVar.f36560l);
            int length = bArr.length - bArrCrashlytics.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(bArrCrashlytics, 0, bArr, length, bArrCrashlytics.length);
            byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(remoteconfigVar.f36561l);
            this.purchase = bArrCrashlytics2;
            int i2 = remoteconfigVar.f36562l;
            if (i2 < 64 || i2 > (i << 3) || (i2 & 7) != 0) {
                C8339l.metrica(AbstractC0653l.vip(i2, "Invalid value for MAC size: "));
                return;
            }
            this.crashlytics = i2 >>> 3;
            c13886l = remoteconfigVar.f36559l;
            if (bArrCrashlytics2 != null) {
                yandex(0, bArrCrashlytics2.length, bArrCrashlytics2);
            }
        } else {
            if (!(interfaceC9719l instanceof C0272l)) {
                C8339l.metrica("Invalid parameter passed");
                return;
            }
            C0272l c0272l = (C0272l) interfaceC9719l;
            byte[] bArr2 = c0272l.f1273l;
            int length2 = bArr.length - bArr2.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            this.purchase = null;
            this.crashlytics = i;
            c13886l = (C13886l) c0272l.f1272l;
        }
        this.billing = new byte[i];
        this.loadAd.billing(true, new C0272l(c13886l, bArr));
        this.yandex.init(true, c13886l);
    }

    @Override // defpackage.firebase
    public final byte[] loadAd() {
        int i = this.crashlytics;
        byte[] bArr = new byte[i];
        System.arraycopy(this.billing, 0, bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.firebase
    public final int processByte(byte b, byte[] bArr, int i) throws IOException {
        this.smaato.write(b);
        return 0;
    }

    @Override // defpackage.firebase
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        if (bArr.length >= i + i2) {
            this.smaato.write(bArr, i, i2);
            return 0;
        }
        C10754l.ad("input buffer too short");
        return 0;
    }

    @Override // defpackage.firebase
    public final void yandex(int i, int i2, byte[] bArr) {
        this.firebase.write(bArr, i, i2);
    }
}
