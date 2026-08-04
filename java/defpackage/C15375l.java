package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٕؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C15375l {
    public static final C9728l Companion = new C9728l();
    public static final InterfaceC1220l[] admob = {null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C14499l(0))};
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final List mopub;
    public final String purchase;
    public final String yandex;

    public /* synthetic */ C15375l(int i, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        if ((i & 1) == 0) {
            this.yandex = "";
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = "";
        } else {
            this.crashlytics = str3;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str4;
        }
        if ((i & 16) == 0) {
            this.purchase = "";
        } else {
            this.purchase = str5;
        }
        if ((i & 32) == 0) {
            this.billing = "";
        } else {
            this.billing = str6;
        }
        if ((i & 64) == 0) {
            this.mopub = C2580l.f5619l;
        } else {
            this.mopub = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15375l)) {
            return false;
        }
        C15375l c15375l = (C15375l) obj;
        return AbstractC8576l.yandex(this.yandex, c15375l.yandex) && AbstractC8576l.yandex(this.loadAd, c15375l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c15375l.crashlytics) && AbstractC8576l.yandex(this.amazon, c15375l.amazon) && AbstractC8576l.yandex(this.purchase, c15375l.purchase) && AbstractC8576l.yandex(this.billing, c15375l.billing) && AbstractC8576l.yandex(this.mopub, c15375l.mopub);
    }

    public final int hashCode() {
        return this.mopub.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon), 31, this.purchase), 31, this.billing);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Value(title=");
        sb.append(this.yandex);
        sb.append(", subtitle=");
        sb.append(this.loadAd);
        sb.append(", caption=");
        sb.append(this.crashlytics);
        sb.append(", name=");
        sb.append(this.amazon);
        sb.append(", value=");
        sb.append(this.purchase);
        sb.append(", photoUrl=");
        sb.append(this.billing);
        sb.append(", photoUrls=");
        return AbstractC0653l.subscription(sb, this.mopub, ')');
    }
}
