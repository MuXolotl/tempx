package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؓٚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1936l extends AbstractRunnableC17845l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C9471l f4404l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4405l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ String f4406l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1936l(C9471l c9471l, String str, int i) {
        super(c9471l, true);
        this.f4405l = i;
        switch (i) {
            case 1:
                this.f4406l = str;
                Objects.requireNonNull(c9471l);
                this.f4404l = c9471l;
                super(c9471l, true);
                break;
            default:
                this.f4406l = str;
                Objects.requireNonNull(c9471l);
                this.f4404l = c9471l;
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC17845l
    public final void yandex() {
        switch (this.f4405l) {
            case 0:
                InterfaceC0591l interfaceC0591l = this.f4404l.billing;
                AbstractC1051l.subs(interfaceC0591l);
                interfaceC0591l.beginAdUnitExposure(this.f4406l, this.f34774l);
                break;
            default:
                InterfaceC0591l interfaceC0591l2 = this.f4404l.billing;
                AbstractC1051l.subs(interfaceC0591l2);
                interfaceC0591l2.endAdUnitExposure(this.f4406l, this.f34774l);
                break;
        }
    }
}
