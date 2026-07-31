package defpackage;

/* JADX INFO: renamed from: lؘٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1660l implements InterfaceC10952l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final int[] f4005l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final int[] f4006l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final int[] f4007l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final int[] f4008l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long[] f4009l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f4010l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f4011l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f4012l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long[] f4013l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long[] f4014l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC17054l f4015l;

    static {
        int[] iArr = new int[80];
        f4005l = iArr;
        f4007l = new int[iArr.length];
        f4006l = new int[iArr.length];
        f4008l = new int[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = f4005l;
            if (i >= iArr2.length) {
                return;
            }
            f4007l[i] = i % 17;
            iArr2[i] = i % 9;
            f4006l[i] = i % 5;
            f4008l[i] = i % 3;
            i++;
        }
    }

    public C1660l(int i) {
        C3589l c3589l;
        long[] jArr = new long[5];
        this.f4014l = jArr;
        int i2 = i / 8;
        this.f4012l = i2;
        int i3 = i2 / 8;
        this.f4011l = i3;
        this.f4009l = new long[i3];
        long[] jArr2 = new long[(i3 * 2) + 1];
        this.f4013l = jArr2;
        if (i == 256) {
            c3589l = new C3589l(1, jArr2, jArr);
        } else if (i == 512) {
            c3589l = new C3589l(2, jArr2, jArr);
        } else {
            if (i != 1024) {
                C8339l.metrica("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
                throw null;
            }
            c3589l = new C3589l(0, jArr2, jArr);
        }
        this.f4015l = c3589l;
    }

    public static long amazon(int i, long j, long j2) {
        long j3 = j ^ j2;
        return (j3 << (-i)) | (j3 >>> i);
    }

    public static long crashlytics(int i, long j, long j2) {
        return ((j >>> (-i)) | (j << i)) ^ j2;
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        return "Threefish-" + (this.f4012l * 8);
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        long[] jArr;
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica(AbstractC5020l.subscription("Invalid parameter passed to Threefish init - ", interfaceC9719l));
            return;
        }
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        if (bArr != null) {
            int length = bArr.length;
            int i = this.f4012l;
            if (length != i) {
                C8339l.metrica(AbstractC15560l.tapsense("Threefish key must be same size as block (", i, " bytes)"));
                return;
            } else {
                jArr = new long[this.f4011l];
                AbstractC10000l.tapsense(0, bArr, jArr);
            }
        } else {
            jArr = null;
        }
        yandex(z, jArr, null);
        getAlgorithmName();
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        return this.f4012l;
    }

    public final void loadAd(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.f4013l;
        int i = this.f4011l;
        if (jArr3[i] == 0) {
            C8339l.smaato("Threefish engine not initialised");
            return;
        }
        if (jArr.length != i) {
            C10754l.ad("Input buffer too short");
            return;
        }
        if (jArr2.length != i) {
            C18073l.ad("Output buffer too short");
            return;
        }
        boolean z = this.f4010l;
        AbstractC17054l abstractC17054l = this.f4015l;
        if (z) {
            abstractC17054l.mo1361l(jArr, jArr2);
        } else {
            abstractC17054l.mo1362l(jArr, jArr2);
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = this.f4012l;
        if (i + i3 > bArr.length) {
            C10754l.ad("Input buffer too short");
            return 0;
        }
        if (i2 + i3 > bArr2.length) {
            C18073l.ad("Output buffer too short");
            return 0;
        }
        long[] jArr = this.f4009l;
        AbstractC10000l.tapsense(i, bArr, jArr);
        loadAd(jArr, jArr);
        AbstractC10000l.license(i2, bArr2, jArr);
        return i3;
    }

    public final void yandex(boolean z, long[] jArr, long[] jArr2) {
        long[] jArr3;
        this.f4010l = z;
        if (jArr != null) {
            int length = jArr.length;
            int i = this.f4011l;
            if (length != i) {
                C8339l.metrica(AbstractC15560l.tapsense("Threefish key must be same size as block (", i, " words)"));
                return;
            }
            long j = 2004413935125273122L;
            int i2 = 0;
            while (true) {
                jArr3 = this.f4013l;
                if (i2 >= i) {
                    break;
                }
                long j2 = jArr[i2];
                jArr3[i2] = j2;
                j ^= j2;
                i2++;
            }
            jArr3[i] = j;
            System.arraycopy(jArr3, 0, jArr3, i + 1, i);
        }
        if (jArr2 != null) {
            if (jArr2.length != 2) {
                C8339l.metrica("Tweak must be 2 words.");
                return;
            }
            long j3 = jArr2[0];
            long[] jArr4 = this.f4014l;
            jArr4[0] = j3;
            long j4 = jArr2[1];
            jArr4[1] = j4;
            jArr4[2] = j3 ^ j4;
            jArr4[3] = j3;
            jArr4[4] = j4;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
    }
}
