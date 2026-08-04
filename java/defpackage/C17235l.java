package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٗٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17235l {
    public static final AbstractC8481l amazon = AbstractC8481l.metrica(3, "_syn", "_err", "_el");
    public final HashMap crashlytics;
    public final long loadAd;
    public String yandex;

    public C17235l(String str, long j, HashMap map) {
        this.yandex = str;
        this.loadAd = j;
        HashMap map2 = new HashMap();
        this.crashlytics = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object loadAd(Object obj, Object obj2, String str) {
        if (amazon.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17235l)) {
            return false;
        }
        C17235l c17235l = (C17235l) obj;
        if (this.loadAd == c17235l.loadAd && this.yandex.equals(c17235l.yandex)) {
            return this.crashlytics.equals(c17235l.crashlytics);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return this.crashlytics.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.yandex;
        String string = this.crashlytics.toString();
        int length = String.valueOf(str).length();
        long j = this.loadAd;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public final C17235l clone() {
        return new C17235l(this.yandex, this.loadAd, new HashMap(this.crashlytics));
    }
}
