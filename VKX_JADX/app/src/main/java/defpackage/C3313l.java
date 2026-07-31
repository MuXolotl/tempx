package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lُؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3313l {
    public final C11700l amazon;
    public final Map billing;
    public final C15457l crashlytics;
    public final C5487l loadAd;
    public final boolean purchase;
    public final C4610l yandex;

    public /* synthetic */ C3313l(C4610l c4610l, C5487l c5487l, C15457l c15457l, C11700l c11700l, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : c4610l, (i & 2) != 0 ? null : c5487l, (i & 4) != 0 ? null : c15457l, (i & 8) != 0 ? null : c11700l, (i & 32) == 0, (i & 64) != 0 ? C14054l.f27396l : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3313l)) {
            return false;
        }
        C3313l c3313l = (C3313l) obj;
        return AbstractC8576l.yandex(this.yandex, c3313l.yandex) && AbstractC8576l.yandex(this.loadAd, c3313l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c3313l.crashlytics) && AbstractC8576l.yandex(this.amazon, c3313l.amazon) && this.purchase == c3313l.purchase && AbstractC8576l.yandex(this.billing, c3313l.billing);
    }

    public final int hashCode() {
        C4610l c4610l = this.yandex;
        int iHashCode = (c4610l == null ? 0 : c4610l.hashCode()) * 31;
        C5487l c5487l = this.loadAd;
        int iHashCode2 = (iHashCode + (c5487l == null ? 0 : c5487l.hashCode())) * 31;
        C15457l c15457l = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (c15457l == null ? 0 : c15457l.hashCode())) * 31;
        C11700l c11700l = this.amazon;
        return this.billing.hashCode() + ((((iHashCode3 + (c11700l != null ? c11700l.hashCode() : 0)) * 961) + (this.purchase ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.yandex + ", slide=" + this.loadAd + ", changeSize=" + this.crashlytics + ", scale=" + this.amazon + ", veil=null, hold=" + this.purchase + ", effectsMap=" + this.billing + ")";
    }

    public C3313l(C4610l c4610l, C5487l c5487l, C15457l c15457l, C11700l c11700l, boolean z, Map map) {
        this.yandex = c4610l;
        this.loadAd = c5487l;
        this.crashlytics = c15457l;
        this.amazon = c11700l;
        this.purchase = z;
        this.billing = map;
    }
}
