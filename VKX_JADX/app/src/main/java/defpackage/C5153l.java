package defpackage;

/* JADX INFO: renamed from: lٌؗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5153l extends AbstractC1821l {
    public C5153l(EnumC2441l enumC2441l) {
        super(enumC2441l);
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        subs();
        AbstractC10000l.Signature(this.f4229l, bArr, i);
        AbstractC10000l.Signature(this.f4219l, bArr, i + 8);
        AbstractC10000l.Signature(this.f4220l, bArr, i + 16);
        AbstractC10000l.Signature(this.f4228l, bArr, i + 24);
        AbstractC10000l.Signature(this.f4223l, bArr, i + 32);
        AbstractC10000l.Signature(this.f4230l, bArr, i + 40);
        reset();
        return 48;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "SHA-384";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 48;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        admob((C5153l) interfaceC11512l);
    }

    @Override // defpackage.AbstractC1821l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        this.f4229l = -3766243637369397544L;
        this.f4219l = 7105036623409894663L;
        this.f4220l = -7973340178411365097L;
        this.f4228l = 1526699215303891257L;
        this.f4223l = 7436329637833083697L;
        this.f4230l = -8163818279084223215L;
        this.f4227l = -2662702644619276377L;
        this.f4217l = 5167115440072839076L;
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C5153l(this);
    }

    public C5153l() {
        this(EnumC2441l.f5219l);
    }

    public C5153l(C5153l c5153l) {
        super(c5153l);
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
    }
}
