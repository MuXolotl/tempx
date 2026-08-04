package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَٔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14804l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f28948l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28949l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f28950l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14804l(Object obj, int i, int i2) {
        super(1);
        this.f28949l = i2;
        this.f28948l = obj;
        this.f28950l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f28949l;
        int i2 = this.f28950l;
        Object obj2 = this.f28948l;
        switch (i) {
            case 0:
                return Boolean.valueOf(C8998l.crashlytics((C8998l) obj2, i2, ((Number) obj).longValue()));
            case 1:
                return Boolean.valueOf(C8998l.crashlytics((C8998l) obj2, i2, ((Number) obj).longValue()));
            default:
                Boolean boolValueOf = Boolean.valueOf(((C6543l) obj).m2026l(i2));
                ((C10700l) obj2).f21708l = boolValueOf;
                return boolValueOf;
        }
    }
}
