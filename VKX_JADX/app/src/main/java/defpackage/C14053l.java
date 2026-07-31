package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14053l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C7257l f27394l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27395l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14053l(C7257l c7257l, int i) {
        super(1);
        this.f27395l = i;
        this.f27394l = c7257l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f27395l;
        EnumC18226l enumC18226l = EnumC18226l.f35692l;
        EnumC18226l enumC18226l2 = EnumC18226l.f35693l;
        EnumC18226l enumC18226l3 = EnumC18226l.f35694l;
        C7257l c7257l = this.f27394l;
        switch (i) {
            case 0:
                InterfaceC17460l interfaceC17460l = (InterfaceC17460l) obj;
                boolean zCrashlytics = interfaceC17460l.crashlytics(enumC18226l3, enumC18226l2);
                Object obj2 = null;
                if (zCrashlytics) {
                    C15457l c15457l = c7257l.f15096l.yandex.crashlytics;
                    if (c15457l != null) {
                        obj2 = c15457l.crashlytics;
                    }
                } else if (interfaceC17460l.crashlytics(enumC18226l2, enumC18226l)) {
                    C15457l c15457l2 = c7257l.f15095l.yandex.crashlytics;
                    if (c15457l2 != null) {
                        obj2 = c15457l2.crashlytics;
                    }
                } else {
                    obj2 = AbstractC4523l.purchase;
                }
                return obj2 == null ? AbstractC4523l.purchase : obj2;
            default:
                InterfaceC17460l interfaceC17460l2 = (InterfaceC17460l) obj;
                if (interfaceC17460l2.crashlytics(enumC18226l3, enumC18226l2)) {
                    C5487l c5487l = c7257l.f15096l.yandex.loadAd;
                    return c5487l != null ? c5487l.loadAd : AbstractC4523l.amazon;
                }
                if (!interfaceC17460l2.crashlytics(enumC18226l2, enumC18226l)) {
                    return AbstractC4523l.amazon;
                }
                C5487l c5487l2 = c7257l.f15095l.yandex.loadAd;
                return c5487l2 != null ? c5487l2.loadAd : AbstractC4523l.amazon;
        }
    }
}
