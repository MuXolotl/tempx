package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3934l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C3000l f8110l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8111l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C0274l f8112l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3934l(C3000l c3000l, C0274l c0274l, int i) {
        super(1);
        this.f8111l = i;
        this.f8110l = c3000l;
        this.f8112l = c0274l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC17807l interfaceC17807l;
        InterfaceC17807l interfaceC17807l2;
        InterfaceC17807l interfaceC17807l3;
        InterfaceC17807l interfaceC17807l4;
        int i = this.f8111l;
        C0274l c0274l = this.f8112l;
        EnumC18226l enumC18226l = EnumC18226l.f35692l;
        C3000l c3000l = this.f8110l;
        EnumC18226l enumC18226l2 = EnumC18226l.f35693l;
        EnumC18226l enumC18226l3 = EnumC18226l.f35694l;
        switch (i) {
            case 0:
                InterfaceC17460l interfaceC17460l = (InterfaceC17460l) obj;
                if (interfaceC17460l.crashlytics(enumC18226l3, enumC18226l2)) {
                    C4610l c4610l = c3000l.yandex.yandex;
                    return (c4610l == null || (interfaceC17807l2 = c4610l.yandex) == null) ? AbstractC4523l.loadAd : interfaceC17807l2;
                }
                if (!interfaceC17460l.crashlytics(enumC18226l2, enumC18226l)) {
                    return AbstractC4523l.loadAd;
                }
                C4610l c4610l2 = c0274l.yandex.yandex;
                return (c4610l2 == null || (interfaceC17807l = c4610l2.yandex) == null) ? AbstractC4523l.loadAd : interfaceC17807l;
            default:
                InterfaceC17460l interfaceC17460l2 = (InterfaceC17460l) obj;
                if (interfaceC17460l2.crashlytics(enumC18226l3, enumC18226l2)) {
                    C11700l c11700l = c3000l.yandex.amazon;
                    return (c11700l == null || (interfaceC17807l4 = c11700l.crashlytics) == null) ? AbstractC4523l.loadAd : interfaceC17807l4;
                }
                if (!interfaceC17460l2.crashlytics(enumC18226l2, enumC18226l)) {
                    return AbstractC4523l.loadAd;
                }
                C11700l c11700l2 = c0274l.yandex.amazon;
                return (c11700l2 == null || (interfaceC17807l3 = c11700l2.crashlytics) == null) ? AbstractC4523l.loadAd : interfaceC17807l3;
        }
    }
}
