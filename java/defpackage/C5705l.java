package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؘٕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5705l {
    public final double crashlytics;
    public final List loadAd;
    public final String yandex;

    public C5705l(String str, List list) {
        Double d;
        Object next;
        String str2;
        Double dVip;
        this.yandex = str;
        this.loadAd = list;
        Iterator it = list.iterator();
        do {
            d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC8576l.yandex(((C14345l) next).yandex, "q"));
        C14345l c14345l = (C14345l) next;
        double dDoubleValue = 1.0d;
        if (c14345l != null && (str2 = c14345l.loadAd) != null && (dVip = AbstractC12673l.vip(str2)) != null) {
            double dDoubleValue2 = dVip.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d = dVip;
            }
            if (d != null) {
                dDoubleValue = d.doubleValue();
            }
        }
        this.crashlytics = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5705l)) {
            return false;
        }
        C5705l c5705l = (C5705l) obj;
        return AbstractC8576l.yandex(this.yandex, c5705l.yandex) && AbstractC8576l.yandex(this.loadAd, c5705l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValue(value=");
        sb.append(this.yandex);
        sb.append(", params=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}
