package defpackage;

/* JADX INFO: renamed from: lِؕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11620l extends AbstractC6716l {
    public final C2657l adcel;
    public final byte[] ads;
    public final C0361l firebase;
    public final byte[] metrica;
    public final byte[] remoteconfig;
    public final C13698l smaato;
    public final int startapp;
    public InterfaceC11512l subscription;
    public InterfaceC11512l tapsense;
    public final InterfaceC16922l vip;

    public C11620l(int i, int i2, int i3, int i4, int i5) {
        int i6;
        super(i, i2, i3, i4, i5);
        this.adcel = new C2657l();
        this.ads = new byte[32];
        if (i == 16) {
            this.vip = new C2657l();
            this.firebase = new C0361l(new C2657l());
            this.smaato = new C13698l(new C2657l());
            i6 = 64;
        } else {
            this.vip = new C17711l();
            this.firebase = new C0361l(new C17711l());
            this.smaato = new C13698l(new C17711l());
            i6 = 128;
        }
        this.startapp = i6;
        this.remoteconfig = new byte[this.firebase.f1426l];
        this.metrica = new byte[this.vip.getDigestSize()];
    }

    public static byte[] isPro(C5138l c5138l) {
        byte[] bArr = new byte[22];
        byte[] bArr2 = (byte[]) c5138l.f11181l;
        System.arraycopy(bArr2, 3, bArr, 0, 1);
        System.arraycopy(bArr2, 8, bArr, 1, 8);
        System.arraycopy(bArr2, 19, bArr, 9, 1);
        System.arraycopy(bArr2, 20, bArr, 10, 12);
        return bArr;
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] amazon(C5138l c5138l, byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        InterfaceC11512l interfaceC11512l = this.tapsense;
        C2657l c2657l = this.adcel;
        c2657l.loadAd(interfaceC11512l);
        c2657l.update(isPro(c5138l), 0, 22);
        c2657l.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.ads;
        c2657l.doFinal(bArr3, 0);
        return AbstractC14024l.vip(0, length, bArr3);
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] billing(C5138l c5138l, byte[] bArr, byte[] bArr2) {
        byte[] bArrIsPro = isPro(c5138l);
        InterfaceC16922l interfaceC16922l = this.vip;
        ((InterfaceC11512l) interfaceC16922l).loadAd(this.subscription);
        interfaceC16922l.update(bArrIsPro, 0, 22);
        interfaceC16922l.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.metrica;
        interfaceC16922l.doFinal(bArr3, 0);
        return AbstractC14024l.vip(0, this.yandex, bArr3);
    }

    @Override // defpackage.AbstractC6716l
    public final C9489l crashlytics(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i = ((this.mopub * this.admob) + 7) / 8;
        int i2 = this.billing;
        int i3 = this.subs;
        int i4 = i3 / i2;
        int i5 = i3 - i4;
        int i6 = (i4 + 7) / 8;
        int i7 = (i5 + 7) / 8;
        int i8 = i + i6 + i7;
        byte[] bArr6 = new byte[i8];
        InterfaceC16922l interfaceC16922l = this.vip;
        byte[] bArr7 = new byte[interfaceC16922l.getDigestSize()];
        interfaceC16922l.update(bArr, 0, bArr.length);
        interfaceC16922l.update(bArr2, 0, bArr2.length);
        interfaceC16922l.update(bArr3, 0, bArr3.length);
        if (bArr4 != null) {
            interfaceC16922l.update(bArr4, 0, bArr4.length);
        }
        interfaceC16922l.update(bArr5, 0, bArr5.length);
        interfaceC16922l.doFinal(bArr7, 0);
        byte[] bArrAdmob = AbstractC14024l.admob(bArr, bArr2, bArr7);
        byte[] bArr8 = new byte[i8];
        int length = bArrAdmob.length;
        C18245l c18245l = new C18245l();
        byte[] bArr9 = new byte[length];
        c18245l.yandex = bArr9;
        System.arraycopy(bArrAdmob, 0, bArr9, 0, length);
        C13698l c13698l = this.smaato;
        c13698l.billing(c18245l);
        c13698l.purchase(i8, bArr8);
        AbstractC15269l.mopub(bArr6, i8, bArr8);
        byte[] bArr10 = new byte[8];
        System.arraycopy(bArr8, i, bArr10, 8 - i7, i7);
        long jLoadAd = AbstractC10000l.loadAd(0, bArr10) & ((-1) >>> (64 - i5));
        byte[] bArr11 = new byte[4];
        System.arraycopy(bArr8, i7 + i, bArr11, 4 - i6, i6);
        return new C9489l(jLoadAd, AbstractC14024l.vip(0, i, bArr8), AbstractC10000l.yandex(0, bArr11) & ((-1) >>> (32 - i4)));
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] loadAd(byte[] bArr, C5138l c5138l, byte[] bArr2, byte[] bArr3) {
        byte[] bArrIsPro = isPro(c5138l);
        InterfaceC16922l interfaceC16922l = this.vip;
        ((InterfaceC11512l) interfaceC16922l).loadAd(this.subscription);
        interfaceC16922l.update(bArrIsPro, 0, 22);
        interfaceC16922l.update(bArr2, 0, bArr2.length);
        interfaceC16922l.update(bArr3, 0, bArr3.length);
        byte[] bArr4 = this.metrica;
        interfaceC16922l.doFinal(bArr4, 0);
        return AbstractC14024l.vip(0, this.yandex, bArr4);
    }

    @Override // defpackage.AbstractC6716l
    public final void mopub(byte[] bArr) {
        int i = this.startapp;
        byte[] bArr2 = new byte[i];
        int length = bArr.length;
        InterfaceC16922l interfaceC16922l = this.vip;
        interfaceC16922l.update(bArr, 0, length);
        interfaceC16922l.update(bArr2, 0, i - this.yandex);
        this.subscription = ((InterfaceC11512l) interfaceC16922l).yandex();
        interfaceC16922l.reset();
        int length2 = bArr.length;
        C2657l c2657l = this.adcel;
        c2657l.update(bArr, 0, length2);
        c2657l.update(bArr2, 0, 64 - bArr.length);
        this.tapsense = c2657l.yandex();
        c2657l.reset();
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] purchase(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C13886l c13886l = new C13886l(bArr);
        C0361l c0361l = this.firebase;
        c0361l.init(c13886l);
        c0361l.update(bArr2, 0, bArr2.length);
        if (bArr3 != null) {
            c0361l.update(bArr3, 0, bArr3.length);
        }
        c0361l.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.remoteconfig;
        c0361l.doFinal(bArr5, 0);
        return AbstractC14024l.vip(0, this.yandex, bArr5);
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] yandex(C5138l c5138l, byte[] bArr, byte[] bArr2) {
        byte[] bArrIsPro = isPro(c5138l);
        InterfaceC11512l interfaceC11512l = this.tapsense;
        C2657l c2657l = this.adcel;
        c2657l.loadAd(interfaceC11512l);
        c2657l.update(bArrIsPro, 0, 22);
        c2657l.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.ads;
        c2657l.doFinal(bArr3, 0);
        return AbstractC14024l.vip(0, this.yandex, bArr3);
    }
}
