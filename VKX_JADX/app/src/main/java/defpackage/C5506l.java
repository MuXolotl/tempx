package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؘؙِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5506l extends AbstractRunnableC17845l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C9471l f11769l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11770l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ BinderC1079l f11771l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5506l(C9471l c9471l, BinderC1079l binderC1079l, int i) {
        super(c9471l, true);
        this.f11770l = i;
        switch (i) {
            case 1:
                this.f11771l = binderC1079l;
                Objects.requireNonNull(c9471l);
                this.f11769l = c9471l;
                super(c9471l, true);
                break;
            case 2:
                this.f11771l = binderC1079l;
                Objects.requireNonNull(c9471l);
                this.f11769l = c9471l;
                super(c9471l, true);
                break;
            default:
                this.f11771l = binderC1079l;
                Objects.requireNonNull(c9471l);
                this.f11769l = c9471l;
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC17845l
    public final void loadAd() {
        int i = this.f11770l;
        BinderC1079l binderC1079l = this.f11771l;
        switch (i) {
            case 0:
                binderC1079l.mo785return(null);
                break;
            case 1:
                binderC1079l.mo785return(null);
                break;
            case 2:
                binderC1079l.mo785return(null);
                break;
            case 3:
                binderC1079l.mo785return(null);
                break;
            default:
                binderC1079l.mo785return(null);
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC17845l
    public final void yandex() {
        switch (this.f11770l) {
            case 0:
                InterfaceC0591l interfaceC0591l = this.f11769l.billing;
                AbstractC1051l.subs(interfaceC0591l);
                interfaceC0591l.getGmpAppId(this.f11771l);
                break;
            case 1:
                InterfaceC0591l interfaceC0591l2 = this.f11769l.billing;
                AbstractC1051l.subs(interfaceC0591l2);
                interfaceC0591l2.getCachedAppInstanceId(this.f11771l);
                break;
            case 2:
                InterfaceC0591l interfaceC0591l3 = this.f11769l.billing;
                AbstractC1051l.subs(interfaceC0591l3);
                interfaceC0591l3.generateEventId(this.f11771l);
                break;
            case 3:
                InterfaceC0591l interfaceC0591l4 = this.f11769l.billing;
                AbstractC1051l.subs(interfaceC0591l4);
                interfaceC0591l4.getCurrentScreenName(this.f11771l);
                break;
            default:
                InterfaceC0591l interfaceC0591l5 = this.f11769l.billing;
                AbstractC1051l.subs(interfaceC0591l5);
                interfaceC0591l5.getCurrentScreenClass(this.f11771l);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5506l(C9471l c9471l, BinderC1079l binderC1079l, int i, boolean z) {
        super(c9471l, true);
        this.f11770l = i;
        this.f11771l = binderC1079l;
        this.f11769l = c9471l;
    }
}
