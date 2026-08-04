package defpackage;

/* JADX INFO: renamed from: lًۣٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14504l extends AbstractC3149l implements InterfaceC14404l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC13012l f28379l;

    public C14504l(InterfaceC13012l interfaceC13012l) {
        super("Cannot transform this request's content to " + interfaceC13012l);
        this.f28379l = interfaceC13012l;
    }

    @Override // defpackage.InterfaceC14404l
    public final Throwable yandex() {
        C14504l c14504l = new C14504l(this.f28379l);
        c14504l.initCause(this);
        return c14504l;
    }
}
