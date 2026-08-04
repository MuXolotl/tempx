package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: lؙٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5012l {
    public static final C5012l purchase = new C5012l(InterfaceC2360l.yandex, 1, C5746l.f12138l);
    public final int loadAd;
    public final InterfaceC2360l yandex;
    public final LinkedHashMap crashlytics = new LinkedHashMap();
    public final LinkedHashMap amazon = new LinkedHashMap();

    public C5012l(InterfaceC2360l interfaceC2360l, int i, Set set) {
        this.yandex = interfaceC2360l;
        this.loadAd = i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C15421l c15421l = (C15421l) it.next();
            C4805l c4805l = new C4805l(new C9075l(this.yandex, c15421l), this.loadAd);
            if (!new ArrayList(c4805l.yandex.keySet()).isEmpty()) {
                this.crashlytics.put(c15421l, c4805l);
            }
        }
        this.crashlytics.keySet();
    }

    public final C4805l yandex(C15421l c15421l) {
        boolean zLoadAd = c15421l.loadAd();
        LinkedHashMap linkedHashMap = this.crashlytics;
        if (zLoadAd) {
            return (C4805l) linkedHashMap.get(c15421l);
        }
        LinkedHashMap linkedHashMap2 = this.amazon;
        Object c4805l = linkedHashMap2.get(c15421l);
        if (c4805l == null) {
            c4805l = AbstractC3352l.yandex(c15421l, linkedHashMap.keySet()) ? new C4805l(new C9075l(this.yandex, c15421l), this.loadAd) : null;
            linkedHashMap2.put(c15421l, c4805l);
        }
        return (C4805l) c4805l;
    }
}
