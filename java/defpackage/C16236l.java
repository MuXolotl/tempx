package defpackage;

/* JADX INFO: renamed from: lؚٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16236l extends AbstractRunnableC17845l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f31778l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ BinderC1079l f31779l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ String f31780l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C9471l f31781l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ String f31782l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16236l(C9471l c9471l, String str, String str2, boolean z, BinderC1079l binderC1079l) {
        super(c9471l, true);
        this.f31780l = str;
        this.f31782l = str2;
        this.f31778l = z;
        this.f31779l = binderC1079l;
        this.f31781l = c9471l;
    }

    @Override // defpackage.AbstractRunnableC17845l
    public final void loadAd() {
        this.f31779l.mo785return(null);
    }

    @Override // defpackage.AbstractRunnableC17845l
    public final void yandex() {
        InterfaceC0591l interfaceC0591l = this.f31781l.billing;
        AbstractC1051l.subs(interfaceC0591l);
        interfaceC0591l.getUserProperties(this.f31780l, this.f31782l, this.f31778l, this.f31779l);
    }
}
