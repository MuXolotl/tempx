package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٗٝۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17279l {
    public final ArrayList amazon;
    public final List crashlytics;
    public final List loadAd;
    public final List yandex;

    public C17279l(List list, List list2, List list3, ArrayList arrayList) {
        this.yandex = list;
        this.loadAd = list2;
        this.crashlytics = list3;
        this.amazon = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17279l)) {
            return false;
        }
        C17279l c17279l = (C17279l) obj;
        return AbstractC8576l.yandex(this.yandex, c17279l.yandex) && AbstractC8576l.yandex(this.loadAd, c17279l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c17279l.crashlytics) && this.amazon.equals(c17279l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC14814l.admob(AbstractC14814l.admob(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
    }

    public final String toString() {
        return "Available(ips=" + this.yandex + ", ipWeights=" + this.loadAd + ", allowedDomains=" + this.crashlytics + ", certificates=" + this.amazon + ')';
    }
}
