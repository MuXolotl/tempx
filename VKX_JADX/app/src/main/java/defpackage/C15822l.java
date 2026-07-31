package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٕٝٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15822l extends AbstractC4957l {
    public final /* synthetic */ int purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15822l(C16412l c16412l, AbstractC10170l abstractC10170l, int i) {
        super(c16412l, abstractC10170l);
        this.purchase = i;
    }

    @Override // defpackage.AbstractC4957l
    public final List admob() {
        int i = this.purchase;
        C2580l c2580l = C2580l.f5619l;
        switch (i) {
            case 0:
                C11012l c11012l = (C11012l) this.loadAd;
                AbstractC1514l abstractC1514l = c11012l.f22186l;
                if (AbstractC8576l.yandex(abstractC1514l, C1015l.amazon)) {
                    return Collections.singletonList(AbstractC14412l.crashlytics(c11012l, false));
                }
                return AbstractC8576l.yandex(abstractC1514l, C9392l.amazon) ? Collections.singletonList(AbstractC14412l.crashlytics(c11012l, true)) : c2580l;
            default:
                return c2580l;
        }
    }
}
