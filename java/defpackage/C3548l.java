package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٟؕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3548l {
    public static final C3548l loadAd = new C3548l(AbstractC18296l.subs(new LinkedHashMap()));
    public final Map yandex;

    public C3548l(Map map) {
        this.yandex = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3548l) && AbstractC8576l.yandex(this.yandex, ((C3548l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.yandex + ")";
    }
}
