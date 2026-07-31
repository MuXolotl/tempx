package defpackage;

/* JADX INFO: renamed from: lْؑۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0655l extends AbstractC7389l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f2122l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f2123l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int[] f2124l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f2125l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f2126l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f2127l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f2128l;

    public C0655l(EnumC2441l enumC2441l) {
        super(enumC2441l);
        this.f2124l = new int[80];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
    }

    @Override // defpackage.AbstractC7389l
    public final void admob(int i, byte[] bArr) {
        this.f2124l[this.f2128l] = AbstractC10000l.yandex(i, bArr);
        int i2 = this.f2128l + 1;
        this.f2128l = i2;
        if (i2 == 16) {
            billing();
        }
    }

    @Override // defpackage.AbstractC7389l
    public final void billing() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.f2124l;
            if (i >= 80) {
                break;
            }
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
            i++;
        }
        int iApplovin = this.f2125l;
        int iApplovin2 = this.f2127l;
        int i3 = this.f2122l;
        int i4 = this.f2123l;
        int i5 = this.f2126l;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int iApplovin3 = AbstractC5020l.applovin(((iApplovin2 & i3) | ((~iApplovin2) & i4)) + ((iApplovin << 5) | (iApplovin >>> 27)), iArr[i6], 1518500249, i5);
            int i8 = (iApplovin2 >>> 2) | (iApplovin2 << 30);
            int iApplovin4 = AbstractC5020l.applovin(((iApplovin & i8) | ((~iApplovin) & i3)) + ((iApplovin3 << 5) | (iApplovin3 >>> 27)), iArr[i6 + 1], 1518500249, i4);
            int i9 = (iApplovin >>> 2) | (iApplovin << 30);
            int iApplovin5 = AbstractC5020l.applovin(((iApplovin3 & i9) | ((~iApplovin3) & i8)) + ((iApplovin4 << 5) | (iApplovin4 >>> 27)), iArr[i6 + 2], 1518500249, i3);
            i5 = (iApplovin3 >>> 2) | (iApplovin3 << 30);
            int i10 = i6 + 4;
            iApplovin2 = AbstractC5020l.applovin(((iApplovin4 & i5) | ((~iApplovin4) & i9)) + ((iApplovin5 << 5) | (iApplovin5 >>> 27)), iArr[i6 + 3], 1518500249, i8);
            i4 = (iApplovin4 >>> 2) | (iApplovin4 << 30);
            i6 += 5;
            iApplovin = AbstractC5020l.applovin(((iApplovin5 & i4) | ((~iApplovin5) & i5)) + ((iApplovin2 << 5) | (iApplovin2 >>> 27)), iArr[i10], 1518500249, i9);
            i3 = (iApplovin5 >>> 2) | (iApplovin5 << 30);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int iApplovin6 = AbstractC5020l.applovin(((iApplovin << 5) | (iApplovin >>> 27)) + ((iApplovin2 ^ i3) ^ i4), iArr[i6], 1859775393, i5);
            int i12 = (iApplovin2 >>> 2) | (iApplovin2 << 30);
            int iApplovin7 = AbstractC5020l.applovin(((iApplovin6 << 5) | (iApplovin6 >>> 27)) + ((iApplovin ^ i12) ^ i3), iArr[i6 + 1], 1859775393, i4);
            int i13 = (iApplovin >>> 2) | (iApplovin << 30);
            int iApplovin8 = AbstractC5020l.applovin(((iApplovin7 << 5) | (iApplovin7 >>> 27)) + ((iApplovin6 ^ i13) ^ i12), iArr[i6 + 2], 1859775393, i3);
            i5 = (iApplovin6 >>> 2) | (iApplovin6 << 30);
            int i14 = i6 + 4;
            iApplovin2 = AbstractC5020l.applovin(((iApplovin8 << 5) | (iApplovin8 >>> 27)) + ((iApplovin7 ^ i5) ^ i13), iArr[i6 + 3], 1859775393, i12);
            i4 = (iApplovin7 >>> 2) | (iApplovin7 << 30);
            i6 += 5;
            iApplovin = AbstractC5020l.applovin(((iApplovin2 << 5) | (iApplovin2 >>> 27)) + ((iApplovin8 ^ i4) ^ i5), iArr[i14], 1859775393, i13);
            i3 = (iApplovin8 >>> 2) | (iApplovin8 << 30);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int iApplovin9 = AbstractC5020l.applovin((((i3 | i4) & iApplovin2) | (i3 & i4)) + ((iApplovin << 5) | (iApplovin >>> 27)), iArr[i6], -1894007588, i5);
            int i16 = (iApplovin2 >>> 2) | (iApplovin2 << 30);
            int iApplovin10 = AbstractC5020l.applovin((((i16 | i3) & iApplovin) | (i16 & i3)) + ((iApplovin9 << 5) | (iApplovin9 >>> 27)), iArr[i6 + 1], -1894007588, i4);
            int i17 = (iApplovin >>> 2) | (iApplovin << 30);
            int iApplovin11 = AbstractC5020l.applovin((((i17 | i16) & iApplovin9) | (i17 & i16)) + ((iApplovin10 << 5) | (iApplovin10 >>> 27)), iArr[i6 + 2], -1894007588, i3);
            i5 = (iApplovin9 >>> 2) | (iApplovin9 << 30);
            int i18 = i6 + 4;
            iApplovin2 = AbstractC5020l.applovin((((i5 | i17) & iApplovin10) | (i5 & i17)) + ((iApplovin11 << 5) | (iApplovin11 >>> 27)), iArr[i6 + 3], -1894007588, i16);
            i4 = (iApplovin10 >>> 2) | (iApplovin10 << 30);
            i6 += 5;
            iApplovin = AbstractC5020l.applovin((((i4 | i5) & iApplovin11) | (i4 & i5)) + ((iApplovin2 << 5) | (iApplovin2 >>> 27)), iArr[i18], -1894007588, i17);
            i3 = (iApplovin11 >>> 2) | (iApplovin11 << 30);
        }
        for (int i19 = 0; i19 <= 3; i19++) {
            int iApplovin12 = AbstractC5020l.applovin(((iApplovin << 5) | (iApplovin >>> 27)) + ((iApplovin2 ^ i3) ^ i4), iArr[i6], -899497514, i5);
            int i20 = (iApplovin2 >>> 2) | (iApplovin2 << 30);
            int iApplovin13 = AbstractC5020l.applovin(((iApplovin12 << 5) | (iApplovin12 >>> 27)) + ((iApplovin ^ i20) ^ i3), iArr[i6 + 1], -899497514, i4);
            int i21 = (iApplovin >>> 2) | (iApplovin << 30);
            int iApplovin14 = AbstractC5020l.applovin(((iApplovin13 << 5) | (iApplovin13 >>> 27)) + ((iApplovin12 ^ i21) ^ i20), iArr[i6 + 2], -899497514, i3);
            i5 = (iApplovin12 >>> 2) | (iApplovin12 << 30);
            int i22 = i6 + 4;
            iApplovin2 = AbstractC5020l.applovin(((iApplovin14 << 5) | (iApplovin14 >>> 27)) + ((iApplovin13 ^ i5) ^ i21), iArr[i6 + 3], -899497514, i20);
            i4 = (iApplovin13 >>> 2) | (iApplovin13 << 30);
            i6 += 5;
            iApplovin = AbstractC5020l.applovin(((iApplovin2 << 5) | (iApplovin2 >>> 27)) + ((iApplovin14 ^ i4) ^ i5), iArr[i22], -899497514, i21);
            i3 = (iApplovin14 >>> 2) | (iApplovin14 << 30);
        }
        this.f2125l += iApplovin;
        this.f2127l += iApplovin2;
        this.f2122l += i3;
        this.f2123l += i4;
        this.f2126l += i5;
        this.f2128l = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            iArr[i23] = 0;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        purchase();
        AbstractC10000l.isPro(this.f2125l, i, bArr);
        AbstractC10000l.isPro(this.f2127l, i + 4, bArr);
        AbstractC10000l.isPro(this.f2122l, i + 8, bArr);
        AbstractC10000l.isPro(this.f2123l, i + 12, bArr);
        AbstractC10000l.isPro(this.f2126l, i + 16, bArr);
        reset();
        return 20;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 20;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C0655l c0655l = (C0655l) interfaceC11512l;
        amazon(c0655l);
        subs(c0655l);
    }

    @Override // defpackage.AbstractC7389l
    public final void mopub(long j) {
        if (this.f2128l > 14) {
            billing();
        }
        int[] iArr = this.f2124l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // defpackage.AbstractC7389l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        this.f2125l = 1732584193;
        this.f2127l = -271733879;
        this.f2122l = -1732584194;
        this.f2123l = 271733878;
        this.f2126l = -1009589776;
        this.f2128l = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f2124l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public final void subs(C0655l c0655l) {
        this.f2125l = c0655l.f2125l;
        this.f2127l = c0655l.f2127l;
        this.f2122l = c0655l.f2122l;
        this.f2123l = c0655l.f2123l;
        this.f2126l = c0655l.f2126l;
        int[] iArr = c0655l.f2124l;
        System.arraycopy(iArr, 0, this.f2124l, 0, iArr.length);
        this.f2128l = c0655l.f2128l;
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C0655l(this);
    }

    public C0655l() {
        this(EnumC2441l.f5219l);
    }

    public C0655l(C0655l c0655l) {
        super(c0655l);
        this.f2124l = new int[80];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        subs(c0655l);
    }
}
