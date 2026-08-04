package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lُۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10853l {
    public final C1028l crashlytics;
    public final List loadAd;
    public final C18625l yandex;

    public C10853l(C18625l c18625l, List list) {
        this.yandex = c18625l;
        this.loadAd = list;
        this.crashlytics = new C1028l(list.size() + 1, new C1412l(29, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10853l)) {
            return false;
        }
        C10853l c10853l = (C10853l) obj;
        return AbstractC8576l.yandex(this.yandex, c10853l.yandex) && this.loadAd.equals(c10853l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildStack(active=");
        sb.append(this.yandex);
        sb.append(", backStack=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}
