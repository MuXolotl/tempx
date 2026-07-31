package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘَؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5582l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C3000l f11852l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11853l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C13551l f11854l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C0274l f11855l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5582l(C3000l c3000l, C0274l c0274l, C13551l c13551l, int i) {
        super(1);
        this.f11853l = i;
        this.f11852l = c3000l;
        this.f11855l = c0274l;
        this.f11854l = c13551l;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f11853l;
        C3000l c3000l = this.f11852l;
        C13551l c13551l = this.f11854l;
        C0274l c0274l = this.f11855l;
        float f = 1.0f;
        switch (i) {
            case 0:
                int iOrdinal = ((EnumC18226l) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            C18725l.billing();
                            return null;
                        }
                        if (c0274l.yandex.yandex != null) {
                            f = 0.0f;
                        } else {
                            f = c13551l.billing;
                        }
                    }
                } else if (c3000l.yandex.yandex != null) {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            default:
                int iOrdinal2 = ((EnumC18226l) obj).ordinal();
                if (iOrdinal2 == 0) {
                    C11700l c11700l = c3000l.yandex.amazon;
                    if (c11700l != null) {
                        f = c11700l.yandex;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        C18725l.billing();
                        return null;
                    }
                    C11700l c11700l2 = c0274l.yandex.amazon;
                    f = c11700l2 != null ? c11700l2.yandex : c13551l.mopub;
                }
                return Float.valueOf(f);
        }
    }
}
