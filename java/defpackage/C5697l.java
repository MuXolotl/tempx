package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؘٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5697l {
    public final Map crashlytics;
    public final int loadAd;
    public final int yandex;

    public /* synthetic */ C5697l(int i, int i2, Map map, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? C14054l.f27396l : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5697l)) {
            return false;
        }
        C5697l c5697l = (C5697l) obj;
        return this.yandex == c5697l.yandex && this.loadAd == c5697l.loadAd && AbstractC8576l.yandex(this.crashlytics, c5697l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.yandex + ", complexViewId=" + this.loadAd + ", children=" + this.crashlytics + ')';
    }

    public C5697l(int i, int i2, Map map) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = map;
    }
}
