package defpackage;

/* JADX INFO: renamed from: lؔؒۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2339l extends AbstractC7389l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f5085l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f5086l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f5087l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f5088l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int[] f5089l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5090l;

    public C2339l() {
        super(EnumC2441l.f5219l);
        this.f5089l = new int[16];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
    }

    public static int isPro(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    public static int smaato(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static int subs(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    @Override // defpackage.AbstractC7389l
    public final void admob(int i, byte[] bArr) {
        int i2 = this.f5087l;
        this.f5087l = i2 + 1;
        this.f5089l[i2] = AbstractC10000l.metrica(i, bArr);
        if (this.f5087l == 16) {
            billing();
        }
    }

    @Override // defpackage.AbstractC7389l
    public final void billing() {
        int i = this.f5088l;
        int i2 = this.f5090l;
        int i3 = this.f5085l;
        int i4 = this.f5086l;
        int iSubs = subs(i2, i3, i4) + i;
        int[] iArr = this.f5089l;
        int iSmaato = smaato(iSubs + iArr[0], 3);
        int iSmaato2 = smaato(subs(iSmaato, i2, i3) + i4 + iArr[1], 7);
        int iSmaato3 = smaato(subs(iSmaato2, iSmaato, i2) + i3 + iArr[2], 11);
        int iSmaato4 = smaato(subs(iSmaato3, iSmaato2, iSmaato) + i2 + iArr[3], 19);
        int iSmaato5 = smaato(subs(iSmaato4, iSmaato3, iSmaato2) + iSmaato + iArr[4], 3);
        int iSmaato6 = smaato(subs(iSmaato5, iSmaato4, iSmaato3) + iSmaato2 + iArr[5], 7);
        int iSmaato7 = smaato(subs(iSmaato6, iSmaato5, iSmaato4) + iSmaato3 + iArr[6], 11);
        int iSmaato8 = smaato(subs(iSmaato7, iSmaato6, iSmaato5) + iSmaato4 + iArr[7], 19);
        int iSmaato9 = smaato(subs(iSmaato8, iSmaato7, iSmaato6) + iSmaato5 + iArr[8], 3);
        int iSmaato10 = smaato(subs(iSmaato9, iSmaato8, iSmaato7) + iSmaato6 + iArr[9], 7);
        int iSmaato11 = smaato(subs(iSmaato10, iSmaato9, iSmaato8) + iSmaato7 + iArr[10], 11);
        int iSmaato12 = smaato(subs(iSmaato11, iSmaato10, iSmaato9) + iSmaato8 + iArr[11], 19);
        int iSmaato13 = smaato(subs(iSmaato12, iSmaato11, iSmaato10) + iSmaato9 + iArr[12], 3);
        int iSmaato14 = smaato(subs(iSmaato13, iSmaato12, iSmaato11) + iSmaato10 + iArr[13], 7);
        int iSmaato15 = smaato(subs(iSmaato14, iSmaato13, iSmaato12) + iSmaato11 + iArr[14], 11);
        int iSmaato16 = smaato(subs(iSmaato15, iSmaato14, iSmaato13) + iSmaato12 + iArr[15], 19);
        int iM1036package = AbstractC1757l.m1036package(isPro(iSmaato16, iSmaato15, iSmaato14) + iSmaato13, iArr[0], 1518500249, 3);
        int iM1036package2 = AbstractC1757l.m1036package(isPro(iM1036package, iSmaato16, iSmaato15) + iSmaato14, iArr[4], 1518500249, 5);
        int iM1036package3 = AbstractC1757l.m1036package(isPro(iM1036package2, iM1036package, iSmaato16) + iSmaato15, iArr[8], 1518500249, 9);
        int iM1036package4 = AbstractC1757l.m1036package(isPro(iM1036package3, iM1036package2, iM1036package) + iSmaato16, iArr[12], 1518500249, 13);
        int iM1036package5 = AbstractC1757l.m1036package(isPro(iM1036package4, iM1036package3, iM1036package2) + iM1036package, iArr[1], 1518500249, 3);
        int iM1036package6 = AbstractC1757l.m1036package(isPro(iM1036package5, iM1036package4, iM1036package3) + iM1036package2, iArr[5], 1518500249, 5);
        int iM1036package7 = AbstractC1757l.m1036package(isPro(iM1036package6, iM1036package5, iM1036package4) + iM1036package3, iArr[9], 1518500249, 9);
        int iM1036package8 = AbstractC1757l.m1036package(isPro(iM1036package7, iM1036package6, iM1036package5) + iM1036package4, iArr[13], 1518500249, 13);
        int iM1036package9 = AbstractC1757l.m1036package(isPro(iM1036package8, iM1036package7, iM1036package6) + iM1036package5, iArr[2], 1518500249, 3);
        int iM1036package10 = AbstractC1757l.m1036package(isPro(iM1036package9, iM1036package8, iM1036package7) + iM1036package6, iArr[6], 1518500249, 5);
        int iM1036package11 = AbstractC1757l.m1036package(isPro(iM1036package10, iM1036package9, iM1036package8) + iM1036package7, iArr[10], 1518500249, 9);
        int iM1036package12 = AbstractC1757l.m1036package(isPro(iM1036package11, iM1036package10, iM1036package9) + iM1036package8, iArr[14], 1518500249, 13);
        int iM1036package13 = AbstractC1757l.m1036package(isPro(iM1036package12, iM1036package11, iM1036package10) + iM1036package9, iArr[3], 1518500249, 3);
        int iM1036package14 = AbstractC1757l.m1036package(isPro(iM1036package13, iM1036package12, iM1036package11) + iM1036package10, iArr[7], 1518500249, 5);
        int iM1036package15 = AbstractC1757l.m1036package(isPro(iM1036package14, iM1036package13, iM1036package12) + iM1036package11, iArr[11], 1518500249, 9);
        int iM1036package16 = AbstractC1757l.m1036package(isPro(iM1036package15, iM1036package14, iM1036package13) + iM1036package12, iArr[15], 1518500249, 13);
        int iM1036package17 = AbstractC1757l.m1036package(iM1036package13 + ((iM1036package16 ^ iM1036package15) ^ iM1036package14), iArr[0], 1859775393, 3);
        int iM1036package18 = AbstractC1757l.m1036package(iM1036package14 + ((iM1036package17 ^ iM1036package16) ^ iM1036package15), iArr[8], 1859775393, 9);
        int iM1036package19 = AbstractC1757l.m1036package(iM1036package15 + ((iM1036package18 ^ iM1036package17) ^ iM1036package16), iArr[4], 1859775393, 11);
        int iM1036package20 = AbstractC1757l.m1036package(iM1036package16 + ((iM1036package19 ^ iM1036package18) ^ iM1036package17), iArr[12], 1859775393, 15);
        int iM1036package21 = AbstractC1757l.m1036package(iM1036package17 + ((iM1036package20 ^ iM1036package19) ^ iM1036package18), iArr[2], 1859775393, 3);
        int iM1036package22 = AbstractC1757l.m1036package(iM1036package18 + ((iM1036package21 ^ iM1036package20) ^ iM1036package19), iArr[10], 1859775393, 9);
        int iM1036package23 = AbstractC1757l.m1036package(iM1036package19 + ((iM1036package22 ^ iM1036package21) ^ iM1036package20), iArr[6], 1859775393, 11);
        int iM1036package24 = AbstractC1757l.m1036package(iM1036package20 + ((iM1036package23 ^ iM1036package22) ^ iM1036package21), iArr[14], 1859775393, 15);
        int iM1036package25 = AbstractC1757l.m1036package(iM1036package21 + ((iM1036package24 ^ iM1036package23) ^ iM1036package22), iArr[1], 1859775393, 3);
        int iM1036package26 = AbstractC1757l.m1036package(iM1036package22 + ((iM1036package25 ^ iM1036package24) ^ iM1036package23), iArr[9], 1859775393, 9);
        int iM1036package27 = AbstractC1757l.m1036package(iM1036package23 + ((iM1036package26 ^ iM1036package25) ^ iM1036package24), iArr[5], 1859775393, 11);
        int iM1036package28 = AbstractC1757l.m1036package(iM1036package24 + ((iM1036package27 ^ iM1036package26) ^ iM1036package25), iArr[13], 1859775393, 15);
        int iM1036package29 = AbstractC1757l.m1036package(iM1036package25 + ((iM1036package28 ^ iM1036package27) ^ iM1036package26), iArr[3], 1859775393, 3);
        int iM1036package30 = AbstractC1757l.m1036package(iM1036package26 + ((iM1036package29 ^ iM1036package28) ^ iM1036package27), iArr[11], 1859775393, 9);
        int iM1036package31 = AbstractC1757l.m1036package(iM1036package27 + ((iM1036package30 ^ iM1036package29) ^ iM1036package28), iArr[7], 1859775393, 11);
        int iM1036package32 = AbstractC1757l.m1036package(iM1036package28 + ((iM1036package31 ^ iM1036package30) ^ iM1036package29), iArr[15], 1859775393, 15);
        this.f5088l += iM1036package29;
        this.f5090l += iM1036package32;
        this.f5085l += iM1036package31;
        this.f5086l += iM1036package30;
        this.f5087l = 0;
        for (int i5 = 0; i5 != iArr.length; i5++) {
            iArr[i5] = 0;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        purchase();
        AbstractC10000l.smaato(this.f5088l, i, bArr);
        AbstractC10000l.smaato(this.f5090l, i + 4, bArr);
        AbstractC10000l.smaato(this.f5085l, i + 8, bArr);
        AbstractC10000l.smaato(this.f5086l, i + 12, bArr);
        reset();
        return 16;
    }

    public final void firebase(C2339l c2339l) {
        amazon(c2339l);
        this.f5088l = c2339l.f5088l;
        this.f5090l = c2339l.f5090l;
        this.f5085l = c2339l.f5085l;
        this.f5086l = c2339l.f5086l;
        int[] iArr = c2339l.f5089l;
        System.arraycopy(iArr, 0, this.f5089l, 0, iArr.length);
        this.f5087l = c2339l.f5087l;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "MD4";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 16;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        firebase((C2339l) interfaceC11512l);
    }

    @Override // defpackage.AbstractC7389l
    public final void mopub(long j) {
        if (this.f5087l > 14) {
            billing();
        }
        int[] iArr = this.f5089l;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // defpackage.AbstractC7389l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        this.f5088l = 1732584193;
        this.f5090l = -271733879;
        this.f5085l = -1732584194;
        this.f5086l = 271733878;
        this.f5087l = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f5089l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C2339l(this);
    }

    public C2339l(C2339l c2339l) {
        super(c2339l.f15315l);
        this.f5089l = new int[16];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        firebase(c2339l);
    }
}
