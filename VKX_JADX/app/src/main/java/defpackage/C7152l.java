package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٍؙؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7152l {
    public final C11362l yandex = new C11362l();

    public static void loadAd(C7152l c7152l, Function2 function2, C15578l c15578l, Function0 function0, int i) {
        if ((i & 8) != 0) {
            c15578l = null;
        }
        c7152l.yandex.add(new C15578l(-1789283891, true, new C11223l(function2, c7152l, c15578l, function0, 6)));
    }

    public final void yandex(C3541l c3541l, C6956l c6956l, int i) {
        c6956l.m2133new(-798501095);
        int i2 = (c6956l.billing(c3541l) ? 4 : 2) | i | (c6956l.billing(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C11362l c11362l = this.yandex;
            int size = c11362l.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((Function3) c11362l.get(i3)).invoke(c3541l, c6956l, Integer.valueOf(i2 & 14));
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, c3541l, i, 19);
        }
    }
}
