package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C4757l {
    public static final C8641l Companion = new C8641l();
    public static final InterfaceC1220l[] purchase = {null, null, AbstractC9968l.crashlytics(2, new C5146l(5)), AbstractC9968l.crashlytics(2, new C5146l(6))};
    public final List amazon;
    public final List crashlytics;
    public final int loadAd;
    public final int yandex;

    public /* synthetic */ C4757l(int i, int i2, int i3, List list, List list2) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C13839l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = i3;
        this.crashlytics = list;
        this.amazon = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4757l)) {
            return false;
        }
        C4757l c4757l = (C4757l) obj;
        return this.yandex == c4757l.yandex && this.loadAd == c4757l.loadAd && AbstractC8576l.yandex(this.crashlytics, c4757l.crashlytics) && AbstractC8576l.yandex(this.amazon, c4757l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC14814l.admob(((this.yandex * 31) + this.loadAd) * 31, 31, this.crashlytics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RootThemeCatalog(defaultThemeId=");
        sb.append(this.yandex);
        sb.append(", defaultAccentId=");
        sb.append(this.loadAd);
        sb.append(", themes=");
        sb.append(this.crashlytics);
        sb.append(", accents=");
        return AbstractC0653l.subscription(sb, this.amazon, ')');
    }
}
