package defpackage;

/* JADX INFO: renamed from: lٖؔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2657l extends AbstractC7389l implements InterfaceC17898l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final int[] f5760l = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f5761l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f5762l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f5763l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f5764l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f5765l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f5766l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f5767l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5768l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f5769l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f5770l;

    public C2657l(EnumC2441l enumC2441l) {
        super(enumC2441l);
        this.f5761l = new int[64];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
    }

    public static int firebase(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public static int isPro(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    public static int smaato(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    public static int subs(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    @Override // defpackage.AbstractC7389l
    public final void admob(int i, byte[] bArr) {
        this.f5761l[this.f5770l] = AbstractC10000l.yandex(i, bArr);
        int i2 = this.f5770l + 1;
        this.f5770l = i2;
        if (i2 == 16) {
            billing();
        }
    }

    @Override // defpackage.AbstractC7389l
    public final void billing() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.f5761l;
            if (i > 63) {
                break;
            }
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
            i++;
        }
        int iIsPro = this.f5765l;
        int iIsPro2 = this.f5768l;
        int iIsPro3 = this.f5762l;
        int iIsPro4 = this.f5763l;
        int i5 = this.f5767l;
        int i6 = this.f5764l;
        int i7 = this.f5769l;
        int i8 = this.f5766l;
        int i9 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            int iSubs = subs(i5, i6, i7) + smaato(i5);
            int[] iArr2 = f5760l;
            int i11 = iSubs + iArr2[i9] + iArr[i9] + i8;
            int i12 = iIsPro4 + i11;
            int iIsPro5 = isPro(iIsPro, iIsPro2, iIsPro3) + firebase(iIsPro) + i11;
            int i13 = i9 + 1;
            int iSubs2 = subs(i12, i5, i6) + smaato(i12) + iArr2[i13] + iArr[i13] + i7;
            int i14 = iIsPro3 + iSubs2;
            int iIsPro6 = isPro(iIsPro5, iIsPro, iIsPro2) + firebase(iIsPro5) + iSubs2;
            int i15 = i9 + 2;
            int iSubs3 = subs(i14, i12, i5) + smaato(i14) + iArr2[i15] + iArr[i15] + i6;
            int i16 = iIsPro2 + iSubs3;
            int iIsPro7 = isPro(iIsPro6, iIsPro5, iIsPro) + firebase(iIsPro6) + iSubs3;
            int i17 = i9 + 3;
            int iSubs4 = subs(i16, i14, i12) + smaato(i16) + iArr2[i17] + iArr[i17] + i5;
            int i18 = iIsPro + iSubs4;
            int iIsPro8 = isPro(iIsPro7, iIsPro6, iIsPro5) + firebase(iIsPro7) + iSubs4;
            int i19 = i9 + 4;
            int iSubs5 = subs(i18, i16, i14) + smaato(i18) + iArr2[i19] + iArr[i19] + i12;
            i8 = iIsPro5 + iSubs5;
            iIsPro4 = isPro(iIsPro8, iIsPro7, iIsPro6) + firebase(iIsPro8) + iSubs5;
            int i20 = i9 + 5;
            int iSubs6 = subs(i8, i18, i16) + smaato(i8) + iArr2[i20] + iArr[i20] + i14;
            i7 = iIsPro6 + iSubs6;
            iIsPro3 = isPro(iIsPro4, iIsPro8, iIsPro7) + firebase(iIsPro4) + iSubs6;
            int i21 = i9 + 6;
            int iSubs7 = subs(i7, i8, i18) + smaato(i7) + iArr2[i21] + iArr[i21] + i16;
            i6 = iIsPro7 + iSubs7;
            iIsPro2 = isPro(iIsPro3, iIsPro4, iIsPro8) + firebase(iIsPro3) + iSubs7;
            int i22 = i9 + 7;
            int iSubs8 = subs(i6, i7, i8) + smaato(i6) + iArr2[i22] + iArr[i22] + i18;
            i5 = iIsPro8 + iSubs8;
            iIsPro = isPro(iIsPro2, iIsPro3, iIsPro4) + firebase(iIsPro2) + iSubs8;
            i9 += 8;
        }
        this.f5765l += iIsPro;
        this.f5768l += iIsPro2;
        this.f5762l += iIsPro3;
        this.f5763l += iIsPro4;
        this.f5767l += i5;
        this.f5764l += i6;
        this.f5769l += i7;
        this.f5766l += i8;
        this.f5770l = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            iArr[i23] = 0;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        purchase();
        AbstractC10000l.isPro(this.f5765l, i, bArr);
        AbstractC10000l.isPro(this.f5768l, i + 4, bArr);
        AbstractC10000l.isPro(this.f5762l, i + 8, bArr);
        AbstractC10000l.isPro(this.f5763l, i + 12, bArr);
        AbstractC10000l.isPro(this.f5767l, i + 16, bArr);
        AbstractC10000l.isPro(this.f5764l, i + 20, bArr);
        AbstractC10000l.isPro(this.f5769l, i + 24, bArr);
        AbstractC10000l.isPro(this.f5766l, i + 28, bArr);
        reset();
        return 32;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "SHA-256";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 32;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        remoteconfig((C2657l) interfaceC11512l);
    }

    @Override // defpackage.AbstractC7389l
    public final void mopub(long j) {
        if (this.f5770l > 14) {
            billing();
        }
        int[] iArr = this.f5761l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    public final void remoteconfig(C2657l c2657l) {
        amazon(c2657l);
        this.f5765l = c2657l.f5765l;
        this.f5768l = c2657l.f5768l;
        this.f5762l = c2657l.f5762l;
        this.f5763l = c2657l.f5763l;
        this.f5767l = c2657l.f5767l;
        this.f5764l = c2657l.f5764l;
        this.f5769l = c2657l.f5769l;
        this.f5766l = c2657l.f5766l;
        int[] iArr = c2657l.f5761l;
        System.arraycopy(iArr, 0, this.f5761l, 0, iArr.length);
        this.f5770l = c2657l.f5770l;
    }

    @Override // defpackage.AbstractC7389l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        this.f5765l = 1779033703;
        this.f5768l = -1150833019;
        this.f5762l = 1013904242;
        this.f5763l = -1521486534;
        this.f5767l = 1359893119;
        this.f5764l = -1694144372;
        this.f5769l = 528734635;
        this.f5766l = 1541459225;
        this.f5770l = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f5761l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C2657l(this);
    }

    public C2657l() {
        this(EnumC2441l.f5219l);
    }

    public C2657l(C2657l c2657l) {
        super(c2657l);
        this.f5761l = new int[64];
        remoteconfig(c2657l);
    }
}
