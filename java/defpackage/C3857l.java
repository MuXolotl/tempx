package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؖؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3857l {
    public static final String amazon;
    public static final String crashlytics;
    public final String loadAd;
    public final String yandex;

    static {
        String str = AbstractC15323l.yandex;
        crashlytics = Integer.toString(0, 36);
        amazon = Integer.toString(1, 36);
    }

    public C3857l(String str, String str2) {
        this.yandex = AbstractC15323l.m3961class(str);
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3857l.class == obj.getClass()) {
            C3857l c3857l = (C3857l) obj;
            if (Objects.equals(this.yandex, c3857l.yandex) && Objects.equals(this.loadAd, c3857l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.loadAd.hashCode() * 31;
        String str = this.yandex;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
