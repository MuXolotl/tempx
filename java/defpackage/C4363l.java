package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٖؖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C4363l {
    public static final C16715l Companion = new C16715l();
    public static final InterfaceC1220l[] purchase = {null, AbstractC9968l.crashlytics(2, new C14499l(7)), AbstractC9968l.crashlytics(2, new C14499l(8)), AbstractC9968l.crashlytics(2, new C14499l(9))};
    public final List amazon;
    public final List crashlytics;
    public final List loadAd;
    public final int yandex;

    public /* synthetic */ C4363l(int i, int i2, List list, List list2, List list3) {
        this.yandex = (i & 1) == 0 ? 0 : i2;
        int i3 = i & 2;
        C2580l c2580l = C2580l.f5619l;
        if (i3 == 0) {
            this.loadAd = c2580l;
        } else {
            this.loadAd = list;
        }
        if ((i & 4) == 0) {
            this.crashlytics = c2580l;
        } else {
            this.crashlytics = list2;
        }
        if ((i & 8) == 0) {
            this.amazon = c2580l;
        } else {
            this.amazon = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4363l)) {
            return false;
        }
        C4363l c4363l = (C4363l) obj;
        return this.yandex == c4363l.yandex && AbstractC8576l.yandex(this.loadAd, c4363l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c4363l.crashlytics) && AbstractC8576l.yandex(this.amazon, c4363l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC14814l.admob(AbstractC14814l.admob(this.yandex * 31, 31, this.loadAd), 31, this.crashlytics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetResponseDto(count=");
        sb.append(this.yandex);
        sb.append(", items=");
        sb.append(this.loadAd);
        sb.append(", groups=");
        sb.append(this.crashlytics);
        sb.append(", profiles=");
        return AbstractC0653l.subscription(sb, this.amazon, ')');
    }
}
