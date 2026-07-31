package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘِٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C5619l {
    public static final C10084l Companion = new C10084l();
    public static final InterfaceC1220l[] crashlytics = {null, AbstractC9968l.crashlytics(2, new C8631l(11))};
    public final List loadAd;
    public final int yandex;

    public /* synthetic */ C5619l(int i, int i2, List list) {
        this.yandex = (i & 1) == 0 ? 0 : i2;
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
        if (!(obj instanceof C5619l)) {
            return false;
        }
        C5619l c5619l = (C5619l) obj;
        return this.yandex == c5619l.yandex && AbstractC8576l.yandex(this.loadAd, c5619l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSearchResponseDto(count=");
        sb.append(this.yandex);
        sb.append(", items=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}
