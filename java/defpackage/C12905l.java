package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lّ۠ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C12905l {
    public static final C5093l Companion = new C5093l();
    public static final InterfaceC1220l[] loadAd = {AbstractC9968l.crashlytics(2, new C3342l(9))};
    public final List yandex;

    public /* synthetic */ C12905l(int i, List list) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12905l) && AbstractC8576l.yandex(this.yandex, ((C12905l) obj).yandex);
    }

    public final int hashCode() {
        List list = this.yandex;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.subscription(new StringBuilder("PodcastCoverDto(sizes="), this.yandex, ')');
    }
}
