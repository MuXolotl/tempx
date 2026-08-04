package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lّۚۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12843l {
    public static final C12843l amazon = new C12843l(C2580l.f5619l, C14054l.f27396l, null);
    public final C12843l crashlytics;
    public final Map loadAd;
    public final List yandex;

    public C12843l(List list, Map map, C12843l c12843l) {
        this.yandex = list;
        this.loadAd = map;
        this.crashlytics = c12843l;
    }

    public final AbstractC11726l yandex(int i) {
        AbstractC11726l abstractC11726l = (AbstractC11726l) this.loadAd.get(Integer.valueOf(i));
        if (abstractC11726l != null) {
            return abstractC11726l;
        }
        C12843l c12843l = this.crashlytics;
        if (c12843l != null) {
            return c12843l.yandex(i);
        }
        return null;
    }
}
