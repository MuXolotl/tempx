package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؑٚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0415l {
    public static final C16355l Companion = new C16355l();
    public static final InterfaceC1220l[] crashlytics = {null, AbstractC9968l.crashlytics(2, new C15687l(26))};
    public final List loadAd;
    public final String yandex;

    public /* synthetic */ C0415l(int i, String str, List list) {
        this.yandex = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.loadAd = C2580l.f5619l;
        } else {
            this.loadAd = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0415l)) {
            return false;
        }
        C0415l c0415l = (C0415l) obj;
        return AbstractC8576l.yandex(this.yandex, c0415l.yandex) && AbstractC8576l.yandex(this.loadAd, c0415l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Y25Content(coverUrl=");
        sb.append(this.yandex);
        sb.append(", video=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }

    public C0415l(String str, int i) {
        this.yandex = (i & 1) != 0 ? "" : str;
        this.loadAd = C2580l.f5619l;
    }
}
