package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lٌَٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10393l {
    public final Object yandex = new Object();
    public final LinkedHashMap loadAd = new LinkedHashMap();

    public final void yandex(String str, boolean z, int i) {
        C17266l c17266l;
        synchronized (this.yandex) {
            c17266l = (C17266l) this.loadAd.get(new C10160l(str));
        }
        if (c17266l == null) {
            return;
        }
        c17266l.loadAd.yandex(new C11769l(i, z));
    }
}
