package defpackage;

/* JADX INFO: renamed from: l٘ؗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17711l extends AbstractC1821l {
    public C17711l(EnumC2441l enumC2441l) {
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
        AbstractC10000l.Signature(this.f4227l, bArr, i + 48);
        AbstractC10000l.Signature(this.f4217l, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 64;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        admob((C17711l) interfaceC11512l);
    }

    @Override // defpackage.AbstractC1821l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        this.f4229l = 7640891576956012808L;
        this.f4219l = -4942790177534073029L;
        this.f4220l = 4354685564936845355L;
        this.f4228l = -6534734903238641935L;
        this.f4223l = 5840696475078001361L;
        this.f4230l = -7276294671716946913L;
        this.f4227l = 2270897969802886507L;
        this.f4217l = 6620516959819538809L;
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C17711l(this);
    }

    public C17711l() {
        this(EnumC2441l.f5219l);
    }

    public C17711l(C17711l c17711l) {
        super(c17711l);
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
    }
}
