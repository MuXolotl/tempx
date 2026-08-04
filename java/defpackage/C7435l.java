package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚٟۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7435l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f15392l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15393l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C17249l f15394l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7435l(Function1 function1, C17249l c17249l, int i) {
        super(1);
        this.f15393l = i;
        this.f15392l = function1;
        this.f15394l = c17249l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15393l;
        C17249l c17249l = this.f15394l;
        Function1 function1 = this.f15392l;
        switch (i) {
            case 0:
                C15730l c15730l = (C15730l) obj;
                if (!C1187l.loadAd(AbstractC3474l.subs(c15730l, false), 0L)) {
                    c15730l.yandex();
                }
                function1.invoke(Float.valueOf(AbstractC8576l.amazon(1.0f - (C1187l.purchase(c15730l.crashlytics) / ((int) (c17249l.f33476l.f9260l >> 32))), 0.0f, 1.0f)));
                break;
            default:
                C15730l c15730l2 = (C15730l) obj;
                if (!C1187l.loadAd(AbstractC3474l.subs(c15730l2, false), 0L)) {
                    c15730l2.yandex();
                }
                float fBilling = C1187l.billing(c15730l2.crashlytics);
                float f = (int) (c17249l.f33476l.f9260l & 4294967295L);
                function1.invoke(Float.valueOf(360.0f - ((AbstractC8576l.amazon(fBilling, 0.0f, f) * 360.0f) / f)));
                break;
        }
        return Unit.INSTANCE;
    }
}
