package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15116l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC16860l f29653l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29654l;

    public /* synthetic */ C15116l(AbstractC16860l abstractC16860l, int i) {
        this.f29654l = i;
        this.f29653l = abstractC16860l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f29654l;
        AbstractC16860l abstractC16860l = this.f29653l;
        switch (i) {
            case 0:
                return ((InterfaceC11865l) obj).subs().subs(abstractC16860l.Signature());
            default:
                C3498l c3498l = (C3498l) obj;
                C10202l c10202lSmaato = abstractC16860l.smaato();
                C2312l c2312l = AbstractC3974l.firebase;
                C2144l c2144l = c10202lSmaato.mo2270l(c2312l).f21347l;
                if (c2144l == null) {
                    AbstractC16860l.yandex(11);
                    throw null;
                }
                InterfaceC15234l interfaceC15234lPurchase = c2144l.purchase(c3498l, EnumC11300l.f22777l);
                if (interfaceC15234lPurchase == null) {
                    throw new AssertionError("Built-in class " + c2312l.yandex(c3498l) + " is not found");
                }
                if (interfaceC15234lPurchase instanceof InterfaceC17477l) {
                    return (InterfaceC17477l) interfaceC15234lPurchase;
                }
                throw new AssertionError("Must be a class descriptor " + c3498l + ", but was " + interfaceC15234lPurchase);
        }
    }
}
