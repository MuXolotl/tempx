package defpackage;

/* JADX INFO: renamed from: lٔٞۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15058l extends AbstractC7389l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int[] f29580l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f29581l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f29582l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f29583l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f29584l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f29585l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f29586l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f29587l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f29588l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f29589l;

    public C15058l() {
        super(EnumC2441l.f5219l);
        this.f29580l = new int[16];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
    }

    public static int adcel(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static int firebase(int i, int i2, int i3, int i4, int i5, int i6) {
        return adcel(i + ((i2 | (~i3)) ^ i4) + i5 + 1859775393, i6);
    }

    public static int isPro(int i, int i2, int i3, int i4, int i5, int i6) {
        return adcel((((~i2) & i4) | (i3 & i2)) + i + i5 + 1518500249, i6);
    }

    public static int metrica(int i, int i2, int i3, int i4, int i5, int i6) {
        return adcel(i + ((i2 | (~i3)) ^ i4) + i5 + 1548603684, i6);
    }

    public static int remoteconfig(int i, int i2, int i3, int i4, int i5, int i6) {
        return adcel(i + ((i2 ^ i3) ^ i4) + i5, i6);
    }

    public static int smaato(int i, int i2, int i3, int i4, int i5, int i6) {
        return adcel(((((i2 & i4) | (i3 & (~i4))) + i) + i5) - 1894007588, i6);
    }

    public static int startapp(int i, int i2, int i3, int i4, int i5, int i6) {
        return adcel(((i2 & i4) | (i3 & (~i4))) + i + i5 + 1352829926, i6);
    }

    public static int subs(int i, int i2, int i3, int i4, int i5, int i6) {
        return adcel(i + ((i2 ^ i3) ^ i4) + i5, i6);
    }

    public static int vip(int i, int i2, int i3, int i4, int i5, int i6) {
        return adcel((((~i2) & i4) | (i3 & i2)) + i + i5 + 1836072691, i6);
    }

    @Override // defpackage.AbstractC7389l
    public final void admob(int i, byte[] bArr) {
        int i2 = this.f29589l;
        this.f29589l = i2 + 1;
        this.f29580l[i2] = AbstractC10000l.metrica(i, bArr);
        if (this.f29589l == 16) {
            billing();
        }
    }

    public final void ads(C15058l c15058l) {
        amazon(c15058l);
        this.f29584l = c15058l.f29584l;
        this.f29587l = c15058l.f29587l;
        this.f29581l = c15058l.f29581l;
        this.f29582l = c15058l.f29582l;
        this.f29586l = c15058l.f29586l;
        this.f29583l = c15058l.f29583l;
        this.f29588l = c15058l.f29588l;
        this.f29585l = c15058l.f29585l;
        int[] iArr = c15058l.f29580l;
        System.arraycopy(iArr, 0, this.f29580l, 0, iArr.length);
        this.f29589l = c15058l.f29589l;
    }

    @Override // defpackage.AbstractC7389l
    public final void billing() {
        int i = this.f29584l;
        int i2 = this.f29587l;
        int i3 = this.f29581l;
        int i4 = this.f29582l;
        int i5 = this.f29586l;
        int i6 = this.f29583l;
        int i7 = this.f29588l;
        int i8 = this.f29585l;
        int[] iArr = this.f29580l;
        int iSubs = subs(i, i2, i3, i4, iArr[0], 11);
        int iSubs2 = subs(i4, iSubs, i2, i3, iArr[1], 14);
        int iSubs3 = subs(i3, iSubs2, iSubs, i2, iArr[2], 15);
        int iSubs4 = subs(i2, iSubs3, iSubs2, iSubs, iArr[3], 12);
        int iSubs5 = subs(iSubs, iSubs4, iSubs3, iSubs2, iArr[4], 5);
        int iSubs6 = subs(iSubs2, iSubs5, iSubs4, iSubs3, iArr[5], 8);
        int iSubs7 = subs(iSubs3, iSubs6, iSubs5, iSubs4, iArr[6], 7);
        int iSubs8 = subs(iSubs4, iSubs7, iSubs6, iSubs5, iArr[7], 9);
        int iSubs9 = subs(iSubs5, iSubs8, iSubs7, iSubs6, iArr[8], 11);
        int iSubs10 = subs(iSubs6, iSubs9, iSubs8, iSubs7, iArr[9], 13);
        int iSubs11 = subs(iSubs7, iSubs10, iSubs9, iSubs8, iArr[10], 14);
        int iSubs12 = subs(iSubs8, iSubs11, iSubs10, iSubs9, iArr[11], 15);
        int iSubs13 = subs(iSubs9, iSubs12, iSubs11, iSubs10, iArr[12], 6);
        int iSubs14 = subs(iSubs10, iSubs13, iSubs12, iSubs11, iArr[13], 7);
        int iSubs15 = subs(iSubs11, iSubs14, iSubs13, iSubs12, iArr[14], 9);
        int iSubs16 = subs(iSubs12, iSubs15, iSubs14, iSubs13, iArr[15], 8);
        int iStartapp = startapp(i5, i6, i7, i8, iArr[5], 8);
        int iStartapp2 = startapp(i8, iStartapp, i6, i7, iArr[14], 9);
        int iStartapp3 = startapp(i7, iStartapp2, iStartapp, i6, iArr[7], 9);
        int iStartapp4 = startapp(i6, iStartapp3, iStartapp2, iStartapp, iArr[0], 11);
        int iStartapp5 = startapp(iStartapp, iStartapp4, iStartapp3, iStartapp2, iArr[9], 13);
        int iStartapp6 = startapp(iStartapp2, iStartapp5, iStartapp4, iStartapp3, iArr[2], 15);
        int iStartapp7 = startapp(iStartapp3, iStartapp6, iStartapp5, iStartapp4, iArr[11], 15);
        int iStartapp8 = startapp(iStartapp4, iStartapp7, iStartapp6, iStartapp5, iArr[4], 5);
        int iStartapp9 = startapp(iStartapp5, iStartapp8, iStartapp7, iStartapp6, iArr[13], 7);
        int iStartapp10 = startapp(iStartapp6, iStartapp9, iStartapp8, iStartapp7, iArr[6], 7);
        int iStartapp11 = startapp(iStartapp7, iStartapp10, iStartapp9, iStartapp8, iArr[15], 8);
        int iStartapp12 = startapp(iStartapp8, iStartapp11, iStartapp10, iStartapp9, iArr[8], 11);
        int iStartapp13 = startapp(iStartapp9, iStartapp12, iStartapp11, iStartapp10, iArr[1], 14);
        int iStartapp14 = startapp(iStartapp10, iStartapp13, iStartapp12, iStartapp11, iArr[10], 14);
        int iStartapp15 = startapp(iStartapp11, iStartapp14, iStartapp13, iStartapp12, iArr[3], 12);
        int iStartapp16 = startapp(iStartapp12, iStartapp15, iStartapp14, iStartapp13, iArr[12], 6);
        int iIsPro = isPro(iStartapp13, iSubs16, iSubs15, iSubs14, iArr[7], 7);
        int iIsPro2 = isPro(iSubs14, iIsPro, iSubs16, iSubs15, iArr[4], 6);
        int iIsPro3 = isPro(iSubs15, iIsPro2, iIsPro, iSubs16, iArr[13], 8);
        int iIsPro4 = isPro(iSubs16, iIsPro3, iIsPro2, iIsPro, iArr[1], 13);
        int iIsPro5 = isPro(iIsPro, iIsPro4, iIsPro3, iIsPro2, iArr[10], 11);
        int iIsPro6 = isPro(iIsPro2, iIsPro5, iIsPro4, iIsPro3, iArr[6], 9);
        int iIsPro7 = isPro(iIsPro3, iIsPro6, iIsPro5, iIsPro4, iArr[15], 7);
        int iIsPro8 = isPro(iIsPro4, iIsPro7, iIsPro6, iIsPro5, iArr[3], 15);
        int iIsPro9 = isPro(iIsPro5, iIsPro8, iIsPro7, iIsPro6, iArr[12], 7);
        int iIsPro10 = isPro(iIsPro6, iIsPro9, iIsPro8, iIsPro7, iArr[0], 12);
        int iIsPro11 = isPro(iIsPro7, iIsPro10, iIsPro9, iIsPro8, iArr[9], 15);
        int iIsPro12 = isPro(iIsPro8, iIsPro11, iIsPro10, iIsPro9, iArr[5], 9);
        int iIsPro13 = isPro(iIsPro9, iIsPro12, iIsPro11, iIsPro10, iArr[2], 11);
        int iIsPro14 = isPro(iIsPro10, iIsPro13, iIsPro12, iIsPro11, iArr[14], 7);
        int iIsPro15 = isPro(iIsPro11, iIsPro14, iIsPro13, iIsPro12, iArr[11], 13);
        int iIsPro16 = isPro(iIsPro12, iIsPro15, iIsPro14, iIsPro13, iArr[8], 12);
        int iMetrica = metrica(iSubs13, iStartapp16, iStartapp15, iStartapp14, iArr[6], 9);
        int iMetrica2 = metrica(iStartapp14, iMetrica, iStartapp16, iStartapp15, iArr[11], 13);
        int iMetrica3 = metrica(iStartapp15, iMetrica2, iMetrica, iStartapp16, iArr[3], 15);
        int iMetrica4 = metrica(iStartapp16, iMetrica3, iMetrica2, iMetrica, iArr[7], 7);
        int iMetrica5 = metrica(iMetrica, iMetrica4, iMetrica3, iMetrica2, iArr[0], 12);
        int iMetrica6 = metrica(iMetrica2, iMetrica5, iMetrica4, iMetrica3, iArr[13], 8);
        int iMetrica7 = metrica(iMetrica3, iMetrica6, iMetrica5, iMetrica4, iArr[5], 9);
        int iMetrica8 = metrica(iMetrica4, iMetrica7, iMetrica6, iMetrica5, iArr[10], 11);
        int iMetrica9 = metrica(iMetrica5, iMetrica8, iMetrica7, iMetrica6, iArr[14], 7);
        int iMetrica10 = metrica(iMetrica6, iMetrica9, iMetrica8, iMetrica7, iArr[15], 7);
        int iMetrica11 = metrica(iMetrica7, iMetrica10, iMetrica9, iMetrica8, iArr[8], 12);
        int iMetrica12 = metrica(iMetrica8, iMetrica11, iMetrica10, iMetrica9, iArr[12], 7);
        int iMetrica13 = metrica(iMetrica9, iMetrica12, iMetrica11, iMetrica10, iArr[4], 6);
        int iMetrica14 = metrica(iMetrica10, iMetrica13, iMetrica12, iMetrica11, iArr[9], 15);
        int iMetrica15 = metrica(iMetrica11, iMetrica14, iMetrica13, iMetrica12, iArr[1], 13);
        int iMetrica16 = metrica(iMetrica12, iMetrica15, iMetrica14, iMetrica13, iArr[2], 11);
        int iFirebase = firebase(iIsPro13, iMetrica16, iIsPro15, iIsPro14, iArr[3], 11);
        int iFirebase2 = firebase(iIsPro14, iFirebase, iMetrica16, iIsPro15, iArr[10], 13);
        int iFirebase3 = firebase(iIsPro15, iFirebase2, iFirebase, iMetrica16, iArr[14], 6);
        int iFirebase4 = firebase(iMetrica16, iFirebase3, iFirebase2, iFirebase, iArr[4], 7);
        int iFirebase5 = firebase(iFirebase, iFirebase4, iFirebase3, iFirebase2, iArr[9], 14);
        int iFirebase6 = firebase(iFirebase2, iFirebase5, iFirebase4, iFirebase3, iArr[15], 9);
        int iFirebase7 = firebase(iFirebase3, iFirebase6, iFirebase5, iFirebase4, iArr[8], 13);
        int iFirebase8 = firebase(iFirebase4, iFirebase7, iFirebase6, iFirebase5, iArr[1], 15);
        int iFirebase9 = firebase(iFirebase5, iFirebase8, iFirebase7, iFirebase6, iArr[2], 14);
        int iFirebase10 = firebase(iFirebase6, iFirebase9, iFirebase8, iFirebase7, iArr[7], 8);
        int iFirebase11 = firebase(iFirebase7, iFirebase10, iFirebase9, iFirebase8, iArr[0], 13);
        int iFirebase12 = firebase(iFirebase8, iFirebase11, iFirebase10, iFirebase9, iArr[6], 6);
        int iFirebase13 = firebase(iFirebase9, iFirebase12, iFirebase11, iFirebase10, iArr[13], 5);
        int iFirebase14 = firebase(iFirebase10, iFirebase13, iFirebase12, iFirebase11, iArr[11], 12);
        int iFirebase15 = firebase(iFirebase11, iFirebase14, iFirebase13, iFirebase12, iArr[5], 7);
        int iFirebase16 = firebase(iFirebase12, iFirebase15, iFirebase14, iFirebase13, iArr[12], 5);
        int iVip = vip(iMetrica13, iIsPro16, iMetrica15, iMetrica14, iArr[15], 9);
        int iVip2 = vip(iMetrica14, iVip, iIsPro16, iMetrica15, iArr[5], 7);
        int iVip3 = vip(iMetrica15, iVip2, iVip, iIsPro16, iArr[1], 15);
        int iVip4 = vip(iIsPro16, iVip3, iVip2, iVip, iArr[3], 11);
        int iVip5 = vip(iVip, iVip4, iVip3, iVip2, iArr[7], 8);
        int iVip6 = vip(iVip2, iVip5, iVip4, iVip3, iArr[14], 6);
        int iVip7 = vip(iVip3, iVip6, iVip5, iVip4, iArr[6], 6);
        int iVip8 = vip(iVip4, iVip7, iVip6, iVip5, iArr[9], 14);
        int iVip9 = vip(iVip5, iVip8, iVip7, iVip6, iArr[11], 12);
        int iVip10 = vip(iVip6, iVip9, iVip8, iVip7, iArr[8], 13);
        int iVip11 = vip(iVip7, iVip10, iVip9, iVip8, iArr[12], 5);
        int iVip12 = vip(iVip8, iVip11, iVip10, iVip9, iArr[2], 14);
        int iVip13 = vip(iVip9, iVip12, iVip11, iVip10, iArr[10], 13);
        int iVip14 = vip(iVip10, iVip13, iVip12, iVip11, iArr[0], 13);
        int iVip15 = vip(iVip11, iVip14, iVip13, iVip12, iArr[4], 7);
        int iVip16 = vip(iVip12, iVip15, iVip14, iVip13, iArr[13], 5);
        int iSmaato = smaato(iFirebase13, iFirebase16, iVip15, iFirebase14, iArr[1], 11);
        int iSmaato2 = smaato(iFirebase14, iSmaato, iFirebase16, iVip15, iArr[9], 12);
        int iSmaato3 = smaato(iVip15, iSmaato2, iSmaato, iFirebase16, iArr[11], 14);
        int iSmaato4 = smaato(iFirebase16, iSmaato3, iSmaato2, iSmaato, iArr[10], 15);
        int iSmaato5 = smaato(iSmaato, iSmaato4, iSmaato3, iSmaato2, iArr[0], 14);
        int iSmaato6 = smaato(iSmaato2, iSmaato5, iSmaato4, iSmaato3, iArr[8], 15);
        int iSmaato7 = smaato(iSmaato3, iSmaato6, iSmaato5, iSmaato4, iArr[12], 9);
        int iSmaato8 = smaato(iSmaato4, iSmaato7, iSmaato6, iSmaato5, iArr[4], 8);
        int iSmaato9 = smaato(iSmaato5, iSmaato8, iSmaato7, iSmaato6, iArr[13], 9);
        int iSmaato10 = smaato(iSmaato6, iSmaato9, iSmaato8, iSmaato7, iArr[3], 14);
        int iSmaato11 = smaato(iSmaato7, iSmaato10, iSmaato9, iSmaato8, iArr[7], 5);
        int iSmaato12 = smaato(iSmaato8, iSmaato11, iSmaato10, iSmaato9, iArr[15], 6);
        int iSmaato13 = smaato(iSmaato9, iSmaato12, iSmaato11, iSmaato10, iArr[14], 8);
        int iSmaato14 = smaato(iSmaato10, iSmaato13, iSmaato12, iSmaato11, iArr[5], 6);
        int iSmaato15 = smaato(iSmaato11, iSmaato14, iSmaato13, iSmaato12, iArr[6], 5);
        int iSmaato16 = smaato(iSmaato12, iSmaato15, iSmaato14, iSmaato13, iArr[2], 12);
        int iRemoteconfig = remoteconfig(iVip13, iVip16, iFirebase15, iVip14, iArr[8], 15);
        int iRemoteconfig2 = remoteconfig(iVip14, iRemoteconfig, iVip16, iFirebase15, iArr[6], 5);
        int iRemoteconfig3 = remoteconfig(iFirebase15, iRemoteconfig2, iRemoteconfig, iVip16, iArr[4], 8);
        int iRemoteconfig4 = remoteconfig(iVip16, iRemoteconfig3, iRemoteconfig2, iRemoteconfig, iArr[1], 11);
        int iRemoteconfig5 = remoteconfig(iRemoteconfig, iRemoteconfig4, iRemoteconfig3, iRemoteconfig2, iArr[3], 14);
        int iRemoteconfig6 = remoteconfig(iRemoteconfig2, iRemoteconfig5, iRemoteconfig4, iRemoteconfig3, iArr[11], 14);
        int iRemoteconfig7 = remoteconfig(iRemoteconfig3, iRemoteconfig6, iRemoteconfig5, iRemoteconfig4, iArr[15], 6);
        int iRemoteconfig8 = remoteconfig(iRemoteconfig4, iRemoteconfig7, iRemoteconfig6, iRemoteconfig5, iArr[0], 14);
        int iRemoteconfig9 = remoteconfig(iRemoteconfig5, iRemoteconfig8, iRemoteconfig7, iRemoteconfig6, iArr[5], 6);
        int iRemoteconfig10 = remoteconfig(iRemoteconfig6, iRemoteconfig9, iRemoteconfig8, iRemoteconfig7, iArr[12], 9);
        int iRemoteconfig11 = remoteconfig(iRemoteconfig7, iRemoteconfig10, iRemoteconfig9, iRemoteconfig8, iArr[2], 12);
        int iRemoteconfig12 = remoteconfig(iRemoteconfig8, iRemoteconfig11, iRemoteconfig10, iRemoteconfig9, iArr[13], 9);
        int iRemoteconfig13 = remoteconfig(iRemoteconfig9, iRemoteconfig12, iRemoteconfig11, iRemoteconfig10, iArr[9], 12);
        int iRemoteconfig14 = remoteconfig(iRemoteconfig10, iRemoteconfig13, iRemoteconfig12, iRemoteconfig11, iArr[7], 5);
        int iRemoteconfig15 = remoteconfig(iRemoteconfig11, iRemoteconfig14, iRemoteconfig13, iRemoteconfig12, iArr[10], 15);
        int iRemoteconfig16 = remoteconfig(iRemoteconfig12, iRemoteconfig15, iRemoteconfig14, iRemoteconfig13, iArr[14], 8);
        this.f29584l += iSmaato13;
        this.f29587l += iSmaato16;
        this.f29581l += iSmaato15;
        this.f29582l += iRemoteconfig14;
        this.f29586l += iRemoteconfig13;
        this.f29583l += iRemoteconfig16;
        this.f29588l += iRemoteconfig15;
        this.f29585l += iSmaato14;
        this.f29589l = 0;
        for (int i9 = 0; i9 != iArr.length; i9++) {
            iArr[i9] = 0;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        purchase();
        AbstractC10000l.smaato(this.f29584l, i, bArr);
        AbstractC10000l.smaato(this.f29587l, i + 4, bArr);
        AbstractC10000l.smaato(this.f29581l, i + 8, bArr);
        AbstractC10000l.smaato(this.f29582l, i + 12, bArr);
        AbstractC10000l.smaato(this.f29586l, i + 16, bArr);
        AbstractC10000l.smaato(this.f29583l, i + 20, bArr);
        AbstractC10000l.smaato(this.f29588l, i + 24, bArr);
        AbstractC10000l.smaato(this.f29585l, i + 28, bArr);
        reset();
        return 32;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "RIPEMD256";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 32;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        ads((C15058l) interfaceC11512l);
    }

    @Override // defpackage.AbstractC7389l
    public final void mopub(long j) {
        if (this.f29589l > 14) {
            billing();
        }
        int[] iArr = this.f29580l;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // defpackage.AbstractC7389l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        this.f29584l = 1732584193;
        this.f29587l = -271733879;
        this.f29581l = -1732584194;
        this.f29582l = 271733878;
        this.f29586l = 1985229328;
        this.f29583l = -19088744;
        this.f29588l = -1985229329;
        this.f29585l = 19088743;
        this.f29589l = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f29580l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C15058l(this);
    }

    public C15058l(C15058l c15058l) {
        super(c15058l.f15315l);
        this.f29580l = new int[16];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        ads(c15058l);
    }
}
