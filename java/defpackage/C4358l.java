package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؖۘۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4358l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2037l f8894l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8895l;

    public /* synthetic */ C4358l(C2037l c2037l, int i) {
        this.f8895l = i;
        this.f8894l = c2037l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f8895l;
        C2037l c2037l = this.f8894l;
        switch (i) {
            case 0:
                long j = ((C9735l) AbstractC13402l.loadAd(c2037l, AbstractC11892l.yandex)).yandex;
                if (((C10236l) AbstractC13402l.loadAd(c2037l, AbstractC17200l.yandex)).yandex()) {
                    return ((double) AbstractC12953l.vip(j)) > 0.5d ? AbstractC13609l.amazon : AbstractC13609l.purchase;
                }
                return AbstractC13609l.billing;
            default:
                C1765l c1765l = (C1765l) AbstractC13402l.loadAd(c2037l, AbstractC13609l.yandex);
                C6009l c6009l = c2037l.f4569l;
                if (c1765l == null) {
                    if (c6009l != null) {
                        c2037l.m3073l(c6009l);
                    }
                    c2037l.f4569l = null;
                } else if (c6009l == null) {
                    int i2 = 0;
                    C9007l c9007l = new C9007l(i2, c2037l);
                    C4358l c4358l = new C4358l(c2037l, i2);
                    C2403l c2403l = c2037l.f4572l;
                    boolean z = c2037l.f4573l;
                    float f = c2037l.f4571l;
                    C4776l c4776l = AbstractC15008l.yandex;
                    C6009l c6009l2 = new C6009l(c2403l, z, f, c9007l, c4358l);
                    c2037l.m3069l(c6009l2);
                    c2037l.f4569l = c6009l2;
                }
                return Unit.INSTANCE;
        }
    }
}
