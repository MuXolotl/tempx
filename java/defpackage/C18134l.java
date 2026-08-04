package defpackage;

/* JADX INFO: renamed from: lَ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18134l extends C14249l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f35446l;

    public C18134l(C16864l c16864l, InterfaceC1814l interfaceC1814l, AbstractC10022l abstractC10022l, byte[] bArr) {
        super(c16864l);
        this.f27846l = new C6020l(this, interfaceC1814l, 1);
        this.f27845l = new C0766l(this, bArr, abstractC10022l);
        AbstractC12155l.crashlytics(AbstractC11036l.crashlytics(abstractC10022l), bArr.length, interfaceC1814l.getMethod());
        this.f35446l = true;
    }

    @Override // defpackage.C14249l
    public final boolean loadAd() {
        return this.f35446l;
    }
}
