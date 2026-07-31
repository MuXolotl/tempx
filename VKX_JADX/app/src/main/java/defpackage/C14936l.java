package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٔٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14936l {
    public final int amazon;
    public final List crashlytics;
    public final List loadAd;
    public C10227l purchase;
    public final AbstractC5103l yandex;

    public C14936l(AbstractC5103l abstractC5103l, List list, List list2, int i) {
        this.yandex = abstractC5103l;
        this.loadAd = list;
        this.crashlytics = list2;
        this.amazon = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14936l.class != obj.getClass()) {
            return false;
        }
        C14936l c14936l = (C14936l) obj;
        return this.amazon == c14936l.amazon && AbstractC8576l.yandex(yandex(), c14936l.yandex());
    }

    public final int hashCode() {
        return yandex().hashCode() + (this.amazon * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.amazon + ", mergedHistory=" + yandex() + ')';
    }

    public final List yandex() {
        if (this.purchase == null) {
            C10227l c10227lAdmob = AbstractC14055l.admob();
            c10227lAdmob.addAll(this.loadAd);
            AbstractC5103l abstractC5103l = this.yandex;
            if (abstractC5103l != null) {
                c10227lAdmob.add(abstractC5103l);
            }
            c10227lAdmob.addAll(this.crashlytics);
            this.purchase = AbstractC14055l.purchase(c10227lAdmob);
        }
        return this.purchase;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14936l() {
        C2580l c2580l = C2580l.f5619l;
        this(null, c2580l, c2580l, -1);
    }
}
