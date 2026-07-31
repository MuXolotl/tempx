package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lًؘٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5539l extends AbstractRunnableC17845l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f11817l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C9471l f11818l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11819l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f11820l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ String f11821l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5539l(C9471l c9471l, C8066l c8066l, String str, String str2) {
        super(c9471l, true);
        this.f11820l = c8066l;
        this.f11821l = str;
        this.f11817l = str2;
        Objects.requireNonNull(c9471l);
        this.f11818l = c9471l;
    }

    @Override // defpackage.AbstractRunnableC17845l
    public void loadAd() {
        switch (this.f11819l) {
            case 0:
                ((BinderC1079l) this.f11820l).mo785return(null);
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC17845l
    public final void yandex() {
        switch (this.f11819l) {
            case 0:
                InterfaceC0591l interfaceC0591l = this.f11818l.billing;
                AbstractC1051l.subs(interfaceC0591l);
                interfaceC0591l.getConditionalUserProperties(this.f11821l, this.f11817l, (BinderC1079l) this.f11820l);
                break;
            default:
                InterfaceC0591l interfaceC0591l2 = this.f11818l.billing;
                AbstractC1051l.subs(interfaceC0591l2);
                interfaceC0591l2.setCurrentScreenByScionActivityInfo((C8066l) this.f11820l, this.f11821l, this.f11817l, this.f34775l);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5539l(C9471l c9471l, String str, String str2, BinderC1079l binderC1079l) {
        super(c9471l, true);
        this.f11821l = str;
        this.f11817l = str2;
        this.f11820l = binderC1079l;
        this.f11818l = c9471l;
    }
}
