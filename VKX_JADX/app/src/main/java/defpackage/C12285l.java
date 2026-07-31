package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lّؐؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12285l {
    public static final C12285l yandex = new C12285l();

    public final void yandex(C10038l c10038l, C6956l c6956l, int i) {
        c6956l.m2133new(1565826668);
        int i2 = (c6956l.billing(c10038l) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0124l.yandex((Function0) c10038l.f20463l, (C9401l) c10038l.f20466l, AbstractC14566l.amazon(1163527043, new C15707l(20, c10038l), c6956l), c6956l, 384);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, c10038l, i, 24);
        }
    }
}
