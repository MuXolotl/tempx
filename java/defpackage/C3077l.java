package defpackage;

/* JADX INFO: renamed from: lؔۨؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3077l extends AbstractC7389l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f6607l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f6608l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f6609l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f6610l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int[] f6611l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f6612l;

    public C3077l() {
        super(EnumC2441l.f5219l);
        this.f6611l = new int[16];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
    }

    public static int isPro(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    public static int subs(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    @Override // defpackage.AbstractC7389l
    public final void admob(int i, byte[] bArr) {
        int i2 = this.f6609l;
        this.f6609l = i2 + 1;
        this.f6611l[i2] = AbstractC10000l.metrica(i, bArr);
        if (this.f6609l == 16) {
            billing();
        }
    }

    @Override // defpackage.AbstractC7389l
    public final void billing() {
        int i = this.f6610l;
        int i2 = this.f6612l;
        int i3 = this.f6607l;
        int i4 = this.f6608l;
        int iSubs = subs(i2, i3, i4) + i;
        int[] iArr = this.f6611l;
        int iM1040synchronized = AbstractC1757l.m1040synchronized(iSubs, iArr[0], -680876936, 7, i2);
        int iM1040synchronized2 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized, i2, i3) + i4, iArr[1], -389564586, 12, iM1040synchronized);
        int iM1040synchronized3 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized2, iM1040synchronized, i2) + i3, iArr[2], 606105819, 17, iM1040synchronized2);
        int iM1040synchronized4 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized3, iM1040synchronized2, iM1040synchronized) + i2, iArr[3], -1044525330, 22, iM1040synchronized3);
        int iM1040synchronized5 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized4, iM1040synchronized3, iM1040synchronized2) + iM1040synchronized, iArr[4], -176418897, 7, iM1040synchronized4);
        int iM1040synchronized6 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized5, iM1040synchronized4, iM1040synchronized3) + iM1040synchronized2, iArr[5], 1200080426, 12, iM1040synchronized5);
        int iM1040synchronized7 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized6, iM1040synchronized5, iM1040synchronized4) + iM1040synchronized3, iArr[6], -1473231341, 17, iM1040synchronized6);
        int iM1040synchronized8 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized7, iM1040synchronized6, iM1040synchronized5) + iM1040synchronized4, iArr[7], -45705983, 22, iM1040synchronized7);
        int iM1040synchronized9 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized8, iM1040synchronized7, iM1040synchronized6) + iM1040synchronized5, iArr[8], 1770035416, 7, iM1040synchronized8);
        int iM1040synchronized10 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized9, iM1040synchronized8, iM1040synchronized7) + iM1040synchronized6, iArr[9], -1958414417, 12, iM1040synchronized9);
        int iM1040synchronized11 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized10, iM1040synchronized9, iM1040synchronized8) + iM1040synchronized7, iArr[10], -42063, 17, iM1040synchronized10);
        int iM1040synchronized12 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized11, iM1040synchronized10, iM1040synchronized9) + iM1040synchronized8, iArr[11], -1990404162, 22, iM1040synchronized11);
        int iM1040synchronized13 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized12, iM1040synchronized11, iM1040synchronized10) + iM1040synchronized9, iArr[12], 1804603682, 7, iM1040synchronized12);
        int iM1040synchronized14 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized13, iM1040synchronized12, iM1040synchronized11) + iM1040synchronized10, iArr[13], -40341101, 12, iM1040synchronized13);
        int iM1040synchronized15 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized14, iM1040synchronized13, iM1040synchronized12) + iM1040synchronized11, iArr[14], -1502002290, 17, iM1040synchronized14);
        int iM1040synchronized16 = AbstractC1757l.m1040synchronized(subs(iM1040synchronized15, iM1040synchronized14, iM1040synchronized13) + iM1040synchronized12, iArr[15], 1236535329, 22, iM1040synchronized15);
        int iM1040synchronized17 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized16, iM1040synchronized15, iM1040synchronized14) + iM1040synchronized13, iArr[1], -165796510, 5, iM1040synchronized16);
        int iM1040synchronized18 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized17, iM1040synchronized16, iM1040synchronized15) + iM1040synchronized14, iArr[6], -1069501632, 9, iM1040synchronized17);
        int iM1040synchronized19 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized18, iM1040synchronized17, iM1040synchronized16) + iM1040synchronized15, iArr[11], 643717713, 14, iM1040synchronized18);
        int iM1040synchronized20 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized19, iM1040synchronized18, iM1040synchronized17) + iM1040synchronized16, iArr[0], -373897302, 20, iM1040synchronized19);
        int iM1040synchronized21 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized20, iM1040synchronized19, iM1040synchronized18) + iM1040synchronized17, iArr[5], -701558691, 5, iM1040synchronized20);
        int iM1040synchronized22 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized21, iM1040synchronized20, iM1040synchronized19) + iM1040synchronized18, iArr[10], 38016083, 9, iM1040synchronized21);
        int iM1040synchronized23 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized22, iM1040synchronized21, iM1040synchronized20) + iM1040synchronized19, iArr[15], -660478335, 14, iM1040synchronized22);
        int iM1040synchronized24 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized23, iM1040synchronized22, iM1040synchronized21) + iM1040synchronized20, iArr[4], -405537848, 20, iM1040synchronized23);
        int iM1040synchronized25 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized24, iM1040synchronized23, iM1040synchronized22) + iM1040synchronized21, iArr[9], 568446438, 5, iM1040synchronized24);
        int iM1040synchronized26 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized25, iM1040synchronized24, iM1040synchronized23) + iM1040synchronized22, iArr[14], -1019803690, 9, iM1040synchronized25);
        int iM1040synchronized27 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized26, iM1040synchronized25, iM1040synchronized24) + iM1040synchronized23, iArr[3], -187363961, 14, iM1040synchronized26);
        int iM1040synchronized28 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized27, iM1040synchronized26, iM1040synchronized25) + iM1040synchronized24, iArr[8], 1163531501, 20, iM1040synchronized27);
        int iM1040synchronized29 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized28, iM1040synchronized27, iM1040synchronized26) + iM1040synchronized25, iArr[13], -1444681467, 5, iM1040synchronized28);
        int iM1040synchronized30 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized29, iM1040synchronized28, iM1040synchronized27) + iM1040synchronized26, iArr[2], -51403784, 9, iM1040synchronized29);
        int iM1040synchronized31 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized30, iM1040synchronized29, iM1040synchronized28) + iM1040synchronized27, iArr[7], 1735328473, 14, iM1040synchronized30);
        int iM1040synchronized32 = AbstractC1757l.m1040synchronized(isPro(iM1040synchronized31, iM1040synchronized30, iM1040synchronized29) + iM1040synchronized28, iArr[12], -1926607734, 20, iM1040synchronized31);
        int iM1040synchronized33 = AbstractC1757l.m1040synchronized(iM1040synchronized29 + ((iM1040synchronized32 ^ iM1040synchronized31) ^ iM1040synchronized30), iArr[5], -378558, 4, iM1040synchronized32);
        int iM1040synchronized34 = AbstractC1757l.m1040synchronized(iM1040synchronized30 + ((iM1040synchronized33 ^ iM1040synchronized32) ^ iM1040synchronized31), iArr[8], -2022574463, 11, iM1040synchronized33);
        int iM1040synchronized35 = AbstractC1757l.m1040synchronized(iM1040synchronized31 + ((iM1040synchronized34 ^ iM1040synchronized33) ^ iM1040synchronized32), iArr[11], 1839030562, 16, iM1040synchronized34);
        int iM1040synchronized36 = AbstractC1757l.m1040synchronized(iM1040synchronized32 + ((iM1040synchronized35 ^ iM1040synchronized34) ^ iM1040synchronized33), iArr[14], -35309556, 23, iM1040synchronized35);
        int iM1040synchronized37 = AbstractC1757l.m1040synchronized(iM1040synchronized33 + ((iM1040synchronized36 ^ iM1040synchronized35) ^ iM1040synchronized34), iArr[1], -1530992060, 4, iM1040synchronized36);
        int iM1040synchronized38 = AbstractC1757l.m1040synchronized(iM1040synchronized34 + ((iM1040synchronized37 ^ iM1040synchronized36) ^ iM1040synchronized35), iArr[4], 1272893353, 11, iM1040synchronized37);
        int iM1040synchronized39 = AbstractC1757l.m1040synchronized(iM1040synchronized35 + ((iM1040synchronized38 ^ iM1040synchronized37) ^ iM1040synchronized36), iArr[7], -155497632, 16, iM1040synchronized38);
        int iM1040synchronized40 = AbstractC1757l.m1040synchronized(iM1040synchronized36 + ((iM1040synchronized39 ^ iM1040synchronized38) ^ iM1040synchronized37), iArr[10], -1094730640, 23, iM1040synchronized39);
        int iM1040synchronized41 = AbstractC1757l.m1040synchronized(iM1040synchronized37 + ((iM1040synchronized40 ^ iM1040synchronized39) ^ iM1040synchronized38), iArr[13], 681279174, 4, iM1040synchronized40);
        int iM1040synchronized42 = AbstractC1757l.m1040synchronized(iM1040synchronized38 + ((iM1040synchronized41 ^ iM1040synchronized40) ^ iM1040synchronized39), iArr[0], -358537222, 11, iM1040synchronized41);
        int iM1040synchronized43 = AbstractC1757l.m1040synchronized(iM1040synchronized39 + ((iM1040synchronized42 ^ iM1040synchronized41) ^ iM1040synchronized40), iArr[3], -722521979, 16, iM1040synchronized42);
        int iM1040synchronized44 = AbstractC1757l.m1040synchronized(iM1040synchronized40 + ((iM1040synchronized43 ^ iM1040synchronized42) ^ iM1040synchronized41), iArr[6], 76029189, 23, iM1040synchronized43);
        int iM1040synchronized45 = AbstractC1757l.m1040synchronized(iM1040synchronized41 + ((iM1040synchronized44 ^ iM1040synchronized43) ^ iM1040synchronized42), iArr[9], -640364487, 4, iM1040synchronized44);
        int iM1040synchronized46 = AbstractC1757l.m1040synchronized(iM1040synchronized42 + ((iM1040synchronized45 ^ iM1040synchronized44) ^ iM1040synchronized43), iArr[12], -421815835, 11, iM1040synchronized45);
        int iM1040synchronized47 = AbstractC1757l.m1040synchronized(iM1040synchronized43 + ((iM1040synchronized46 ^ iM1040synchronized45) ^ iM1040synchronized44), iArr[15], 530742520, 16, iM1040synchronized46);
        int iM1040synchronized48 = AbstractC1757l.m1040synchronized(iM1040synchronized44 + ((iM1040synchronized47 ^ iM1040synchronized46) ^ iM1040synchronized45), iArr[2], -995338651, 23, iM1040synchronized47);
        int iM1040synchronized49 = AbstractC1757l.m1040synchronized(iM1040synchronized45 + (((~iM1040synchronized46) | iM1040synchronized48) ^ iM1040synchronized47), iArr[0], -198630844, 6, iM1040synchronized48);
        int iM1040synchronized50 = AbstractC1757l.m1040synchronized(iM1040synchronized46 + (((~iM1040synchronized47) | iM1040synchronized49) ^ iM1040synchronized48), iArr[7], 1126891415, 10, iM1040synchronized49);
        int iM1040synchronized51 = AbstractC1757l.m1040synchronized(iM1040synchronized47 + (((~iM1040synchronized48) | iM1040synchronized50) ^ iM1040synchronized49), iArr[14], -1416354905, 15, iM1040synchronized50);
        int iM1040synchronized52 = AbstractC1757l.m1040synchronized(iM1040synchronized48 + (((~iM1040synchronized49) | iM1040synchronized51) ^ iM1040synchronized50), iArr[5], -57434055, 21, iM1040synchronized51);
        int iM1040synchronized53 = AbstractC1757l.m1040synchronized(iM1040synchronized49 + (((~iM1040synchronized50) | iM1040synchronized52) ^ iM1040synchronized51), iArr[12], 1700485571, 6, iM1040synchronized52);
        int iM1040synchronized54 = AbstractC1757l.m1040synchronized(iM1040synchronized50 + (((~iM1040synchronized51) | iM1040synchronized53) ^ iM1040synchronized52), iArr[3], -1894986606, 10, iM1040synchronized53);
        int iM1040synchronized55 = AbstractC1757l.m1040synchronized(iM1040synchronized51 + (((~iM1040synchronized52) | iM1040synchronized54) ^ iM1040synchronized53), iArr[10], -1051523, 15, iM1040synchronized54);
        int iM1040synchronized56 = AbstractC1757l.m1040synchronized(iM1040synchronized52 + (((~iM1040synchronized53) | iM1040synchronized55) ^ iM1040synchronized54), iArr[1], -2054922799, 21, iM1040synchronized55);
        int iM1040synchronized57 = AbstractC1757l.m1040synchronized(iM1040synchronized53 + (((~iM1040synchronized54) | iM1040synchronized56) ^ iM1040synchronized55), iArr[8], 1873313359, 6, iM1040synchronized56);
        int iM1040synchronized58 = AbstractC1757l.m1040synchronized(iM1040synchronized54 + (((~iM1040synchronized55) | iM1040synchronized57) ^ iM1040synchronized56), iArr[15], -30611744, 10, iM1040synchronized57);
        int iM1040synchronized59 = AbstractC1757l.m1040synchronized(iM1040synchronized55 + (((~iM1040synchronized56) | iM1040synchronized58) ^ iM1040synchronized57), iArr[6], -1560198380, 15, iM1040synchronized58);
        int iM1040synchronized60 = AbstractC1757l.m1040synchronized(iM1040synchronized56 + (((~iM1040synchronized57) | iM1040synchronized59) ^ iM1040synchronized58), iArr[13], 1309151649, 21, iM1040synchronized59);
        int iM1040synchronized61 = AbstractC1757l.m1040synchronized(iM1040synchronized57 + (((~iM1040synchronized58) | iM1040synchronized60) ^ iM1040synchronized59), iArr[4], -145523070, 6, iM1040synchronized60);
        int iM1040synchronized62 = AbstractC1757l.m1040synchronized(iM1040synchronized58 + (((~iM1040synchronized59) | iM1040synchronized61) ^ iM1040synchronized60), iArr[11], -1120210379, 10, iM1040synchronized61);
        int iM1040synchronized63 = AbstractC1757l.m1040synchronized(iM1040synchronized59 + (((~iM1040synchronized60) | iM1040synchronized62) ^ iM1040synchronized61), iArr[2], 718787259, 15, iM1040synchronized62);
        int iM1040synchronized64 = AbstractC1757l.m1040synchronized(iM1040synchronized60 + (((~iM1040synchronized61) | iM1040synchronized63) ^ iM1040synchronized62), iArr[9], -343485551, 21, iM1040synchronized63);
        this.f6610l += iM1040synchronized61;
        this.f6612l += iM1040synchronized64;
        this.f6607l += iM1040synchronized63;
        this.f6608l += iM1040synchronized62;
        this.f6609l = 0;
        for (int i5 = 0; i5 != iArr.length; i5++) {
            iArr[i5] = 0;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        purchase();
        AbstractC10000l.smaato(this.f6610l, i, bArr);
        AbstractC10000l.smaato(this.f6612l, i + 4, bArr);
        AbstractC10000l.smaato(this.f6607l, i + 8, bArr);
        AbstractC10000l.smaato(this.f6608l, i + 12, bArr);
        reset();
        return 16;
    }

    public final void firebase(C3077l c3077l) {
        amazon(c3077l);
        this.f6610l = c3077l.f6610l;
        this.f6612l = c3077l.f6612l;
        this.f6607l = c3077l.f6607l;
        this.f6608l = c3077l.f6608l;
        int[] iArr = c3077l.f6611l;
        System.arraycopy(iArr, 0, this.f6611l, 0, iArr.length);
        this.f6609l = c3077l.f6609l;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "MD5";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 16;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        firebase((C3077l) interfaceC11512l);
    }

    @Override // defpackage.AbstractC7389l
    public final void mopub(long j) {
        if (this.f6609l > 14) {
            billing();
        }
        int[] iArr = this.f6611l;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // defpackage.AbstractC7389l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        this.f6610l = 1732584193;
        this.f6612l = -271733879;
        this.f6607l = -1732584194;
        this.f6608l = 271733878;
        this.f6609l = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f6611l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C3077l(this);
    }

    public C3077l(C3077l c3077l) {
        super(c3077l);
        this.f6611l = new int[16];
        firebase(c3077l);
    }
}
