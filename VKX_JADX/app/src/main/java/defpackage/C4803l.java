package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C4803l {
    public static final C10811l Companion = new C10811l();
    public static final InterfaceC1220l[] amazon = {AbstractC9968l.crashlytics(2, new C8810l(13)), AbstractC9968l.crashlytics(2, new C8810l(14)), AbstractC9968l.crashlytics(2, new C8810l(15))};
    public final List crashlytics;
    public final List loadAd;
    public final List yandex;

    public /* synthetic */ C4803l(int i, List list, List list2, List list3) {
        int i2 = i & 1;
        C2580l c2580l = C2580l.f5619l;
        if (i2 == 0) {
            this.yandex = c2580l;
        } else {
            this.yandex = list;
        }
        if ((i & 2) == 0) {
            this.loadAd = c2580l;
        } else {
            this.loadAd = list2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = c2580l;
        } else {
            this.crashlytics = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4803l)) {
            return false;
        }
        C4803l c4803l = (C4803l) obj;
        return AbstractC8576l.yandex(this.yandex, c4803l.yandex) && AbstractC8576l.yandex(this.loadAd, c4803l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c4803l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC14814l.admob(this.yandex.hashCode() * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkConfigNetworkProxy(ip=");
        sb.append(this.yandex);
        sb.append(", weight=");
        sb.append(this.loadAd);
        sb.append(", domains=");
        return AbstractC0653l.subscription(sb, this.crashlytics, ')');
    }

    public C4803l() {
        C2580l c2580l = C2580l.f5619l;
        this.yandex = c2580l;
        this.loadAd = c2580l;
        this.crashlytics = c2580l;
    }
}
