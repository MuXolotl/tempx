package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14850l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9067l f29081l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29082l;

    public /* synthetic */ C14850l(AbstractC9067l abstractC9067l, int i) {
        this.f29082l = i;
        this.f29081l = abstractC9067l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f29082l;
        AbstractC9067l abstractC9067l = this.f29081l;
        InterfaceC11189l interfaceC11189l = (InterfaceC11189l) obj;
        switch (i) {
            case 0:
                AbstractC9067l abstractC9067l2 = (AbstractC9067l) interfaceC11189l;
                InterfaceC10137l interfaceC10137l = abstractC9067l.f18656l;
                if (!AbstractC8576l.yandex(abstractC9067l2.f18657l, interfaceC10137l)) {
                    abstractC9067l2.f18657l = interfaceC10137l;
                    abstractC9067l2.mo2588l();
                }
                return EnumC8647l.f17805l;
            default:
                abstractC9067l.f18657l = ((AbstractC9067l) interfaceC11189l).f18656l;
                return Boolean.FALSE;
        }
    }
}
