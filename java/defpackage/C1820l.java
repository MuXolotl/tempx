package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘْؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C1820l {
    public static final C3041l Companion = new C3041l();
    public static final InterfaceC1220l[] purchase = {null, null, null, AbstractC9968l.crashlytics(2, new C8631l(12))};
    public final List amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C1820l(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C7717l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1820l)) {
            return false;
        }
        C1820l c1820l = (C1820l) obj;
        return AbstractC8576l.yandex(this.yandex, c1820l.yandex) && AbstractC8576l.yandex(this.loadAd, c1820l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c1820l.crashlytics) && AbstractC8576l.yandex(this.amazon, c1820l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixSettingsCategoryDto(id=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", type=");
        sb.append(this.crashlytics);
        sb.append(", options=");
        return AbstractC0653l.subscription(sb, this.amazon, ')');
    }
}
