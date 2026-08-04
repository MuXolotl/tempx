package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0278l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C10281l f1278l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1279l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0278l(C10281l c10281l, int i) {
        super(1);
        this.f1279l = i;
        this.f1278l = c10281l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i = this.f1279l;
        C10281l c10281l = this.f1278l;
        switch (i) {
            case 0:
                InterfaceC17460l interfaceC17460l = (InterfaceC17460l) obj;
                EnumC18226l enumC18226l = EnumC18226l.f35694l;
                EnumC18226l enumC18226l2 = EnumC18226l.f35693l;
                if (interfaceC17460l.crashlytics(enumC18226l, enumC18226l2)) {
                    C3313l c3313l = c10281l.f20920l.yandex;
                    return AbstractC4523l.crashlytics;
                }
                if (!interfaceC17460l.crashlytics(enumC18226l2, EnumC18226l.f35692l)) {
                    return AbstractC4523l.crashlytics;
                }
                C3313l c3313l2 = c10281l.f20921l.yandex;
                return AbstractC4523l.crashlytics;
            default:
                int iOrdinal = ((EnumC18226l) obj).ordinal();
                if (iOrdinal == 0) {
                    C3313l c3313l3 = c10281l.f20920l.yandex;
                    j = C9735l.isPro;
                } else if (iOrdinal == 1) {
                    C3313l c3313l4 = c10281l.f20920l.yandex;
                    C3313l c3313l5 = c10281l.f20921l.yandex;
                    j = C9735l.isPro;
                } else {
                    if (iOrdinal != 2) {
                        C18725l.billing();
                        return null;
                    }
                    C3313l c3313l6 = c10281l.f20921l.yandex;
                    j = c10281l.f20923l.purchase;
                }
                return new C9735l(j);
        }
    }
}
