package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَۥؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10691l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C7729l f21698l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10113l[] f21699l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f21700l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f21701l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10691l(AbstractC10113l[] abstractC10113lArr, C7729l c7729l, int i, int i2) {
        super(1);
        this.f21699l = abstractC10113lArr;
        this.f21698l = c7729l;
        this.f21701l = i;
        this.f21700l = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
        for (AbstractC10113l abstractC10113l : this.f21699l) {
            if (abstractC10113l != null) {
                long jYandex = this.f21698l.yandex.loadAd.yandex((((long) abstractC10113l.f20592l) << 32) | (((long) abstractC10113l.f20591l) & 4294967295L), (((long) this.f21700l) & 4294967295L) | (((long) this.f21701l) << 32), EnumC9931l.f20223l);
                abstractC9601l.mopub(abstractC10113l, (int) (jYandex >> 32), (int) (jYandex & 4294967295L), 0.0f);
            }
        }
        return Unit.INSTANCE;
    }
}
