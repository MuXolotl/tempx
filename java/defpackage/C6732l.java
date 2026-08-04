package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙۚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6732l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14099l;

    public C6732l(int i) {
        this.f14099l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, this.f14099l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
