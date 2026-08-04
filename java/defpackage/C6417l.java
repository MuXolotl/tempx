package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؙّٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C6417l {
    public static final C0076l Companion = new C0076l();
    public static final InterfaceC1220l[] mopub = {null, null, null, null, null, AbstractC9968l.crashlytics(2, new C8241l(1))};
    public final boolean amazon;
    public final Map billing;
    public final String crashlytics;
    public final String loadAd;
    public final int purchase;
    public final int yandex;

    public /* synthetic */ C6417l(int i, int i2, String str, String str2, boolean z, int i3, Map map) {
        if (35 != (i & 35)) {
            AbstractC11036l.isPro(i, 35, C4731l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str2;
        }
        if ((i & 8) == 0) {
            this.amazon = false;
        } else {
            this.amazon = z;
        }
        if ((i & 16) == 0) {
            this.purchase = 0;
        } else {
            this.purchase = i3;
        }
        this.billing = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6417l)) {
            return false;
        }
        C6417l c6417l = (C6417l) obj;
        return this.yandex == c6417l.yandex && AbstractC8576l.yandex(this.loadAd, c6417l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c6417l.crashlytics) && this.amazon == c6417l.amazon && this.purchase == c6417l.purchase && AbstractC8576l.yandex(this.billing, c6417l.billing);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd);
        String str = this.crashlytics;
        return this.billing.hashCode() + ((((((iAdvert + (str == null ? 0 : str.hashCode())) * 31) + (this.amazon ? 1231 : 1237)) * 31) + this.purchase) * 31);
    }

    public final String toString() {
        return "EngineTheme(id=" + this.yandex + ", name=" + this.loadAd + ", author=" + this.crashlytics + ", light=" + this.amazon + ", associatedAccent=" + this.purchase + ", themeAttributes=" + this.billing + ')';
    }
}
