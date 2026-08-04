package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lْۤؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13767l {
    public final LinkedHashMap yandex;

    public C13767l(C3548l c3548l) {
        this.yandex = new LinkedHashMap(c3548l.yandex);
    }

    public final void yandex(C16543l c16543l, Object obj) {
        LinkedHashMap linkedHashMap = this.yandex;
        if (obj != null) {
            linkedHashMap.put(c16543l, obj);
        } else {
            linkedHashMap.remove(c16543l);
        }
    }

    public C13767l() {
        this.yandex = new LinkedHashMap();
    }
}
