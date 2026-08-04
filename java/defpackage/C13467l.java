package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lْٙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13467l {
    public C18221l amazon;
    public final Set crashlytics;
    public final Map loadAd;
    public final C10685l yandex;

    public /* synthetic */ C13467l(C10685l c10685l, LinkedHashMap linkedHashMap, C18221l c18221l, int i) {
        this((i & 1) != 0 ? new C10685l(3) : c10685l, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : c18221l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13467l)) {
            return false;
        }
        C13467l c13467l = (C13467l) obj;
        return AbstractC8576l.yandex(this.yandex, c13467l.yandex) && AbstractC8576l.yandex(this.loadAd, c13467l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c13467l.crashlytics) && AbstractC8576l.yandex(this.amazon, c13467l.amazon);
    }

    public final int hashCode() {
        int iHashCode = (this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31;
        C18221l c18221l = this.amazon;
        return iHashCode + (c18221l == null ? 0 : c18221l.yandex);
    }

    public final String toString() {
        return "InfoBundle(options=" + this.yandex + ", tags=" + this.loadAd + ", listeners=" + this.crashlytics + ", template=" + this.amazon + ')';
    }

    public C13467l(C10685l c10685l, Map map, Set set, C18221l c18221l) {
        this.yandex = c10685l;
        this.loadAd = map;
        this.crashlytics = set;
        this.amazon = c18221l;
    }
}
