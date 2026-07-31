package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: lؙؚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6952l {
    public static final C6952l loadAd = new C6952l(AbstractC8676l.tapsense(new LinkedHashMap()));
    public final Map yandex;

    public C6952l(Map map) {
        this.yandex = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6952l) && this.yandex.equals(((C6952l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.yandex + ")";
    }

    public final String yandex() {
        List list = (List) this.yandex.get("Content-Type".toLowerCase(Locale.ROOT));
        if (list != null) {
            return (String) AbstractC16901l.m4212class(list);
        }
        return null;
    }
}
