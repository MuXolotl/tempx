package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘُ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5604l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3947l f11902l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11903l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f11904l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5604l(AbstractC3947l abstractC3947l, long j, int i) {
        super(1);
        this.f11903l = i;
        this.f11902l = abstractC3947l;
        this.f11904l = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function2;
        int iOrdinal;
        int i = this.f11903l;
        long jCrashlytics = 0;
        long j = this.f11904l;
        AbstractC3947l abstractC3947l = this.f11902l;
        switch (i) {
            case 0:
                C7257l c7257l = (C7257l) abstractC3947l;
                int iOrdinal2 = ((EnumC18226l) obj).ordinal();
                if (iOrdinal2 == 0) {
                    C15457l c15457l = c7257l.f15096l.yandex.crashlytics;
                    if (c15457l != null && (function1 = c15457l.loadAd) != null) {
                        j = ((C4999l) function1.invoke(new C4999l(j))).yandex;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        C18725l.billing();
                        return null;
                    }
                    C15457l c15457l2 = c7257l.f15095l.yandex.crashlytics;
                    if (c15457l2 != null && (function2 = c15457l2.loadAd) != null) {
                        j = ((C4999l) function2.invoke(new C4999l(j))).yandex;
                    }
                }
                return new C4999l(j);
            case 1:
                EnumC18226l enumC18226l = (EnumC18226l) obj;
                C7257l c7257l2 = (C7257l) abstractC3947l;
                if (enumC18226l == EnumC18226l.f35692l && c7257l2.f15095l.yandex.loadAd == null) {
                    jCrashlytics = c7257l2.f15094l.subs;
                } else {
                    C5487l c5487l = c7257l2.f15096l.yandex.loadAd;
                    long j2 = c5487l != null ? ((C5177l) c5487l.yandex.invoke(new C4999l(j))).yandex : 0L;
                    C5487l c5487l2 = c7257l2.f15095l.yandex.loadAd;
                    long j3 = c5487l2 != null ? ((C5177l) c5487l2.yandex.invoke(new C4999l(j))).yandex : 0L;
                    int iOrdinal3 = enumC18226l.ordinal();
                    if (iOrdinal3 == 0) {
                        jCrashlytics = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            C18725l.billing();
                            return null;
                        }
                        jCrashlytics = j3;
                    }
                }
                return new C5177l(jCrashlytics);
            case 2:
                EnumC18226l enumC18226l2 = (EnumC18226l) obj;
                C7257l c7257l3 = (C7257l) abstractC3947l;
                if (c7257l3.f15103l != null && c7257l3.m2187l() != null && !AbstractC8576l.yandex(c7257l3.f15103l, c7257l3.m2187l()) && (iOrdinal = enumC18226l2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C18725l.billing();
                        return null;
                    }
                    C15457l c15457l3 = c7257l3.f15095l.yandex.crashlytics;
                    if (c15457l3 != null) {
                        Function1 function3 = c15457l3.loadAd;
                        long j4 = this.f11904l;
                        long j5 = ((C4999l) function3.invoke(new C4999l(j4))).yandex;
                        InterfaceC13460l interfaceC13460lM2187l = c7257l3.m2187l();
                        EnumC9931l enumC9931l = EnumC9931l.f20223l;
                        jCrashlytics = C5177l.crashlytics(interfaceC13460lM2187l.yandex(j4, j5, enumC9931l), c7257l3.f15103l.yandex(j4, j5, enumC9931l));
                    }
                }
                return new C5177l(jCrashlytics);
            default:
                C13191l c13191l = (C13191l) abstractC3947l;
                if (AbstractC8576l.yandex(obj, c13191l.f25804l.loadAd())) {
                    jCrashlytics = C4999l.loadAd(c13191l.f25802l, -9223372034707292160L) ? j : c13191l.f25802l;
                } else {
                    InterfaceC12244l interfaceC12244l = (InterfaceC12244l) c13191l.f25804l.amazon.mopub(obj);
                    if (interfaceC12244l != null) {
                        jCrashlytics = ((C4999l) interfaceC12244l.getValue()).yandex;
                    }
                }
                return new C4999l(jCrashlytics);
        }
    }
}
