package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؒ۟ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C1358l {
    public static final C13525l Companion = new C13525l();
    public static final InterfaceC1220l[] mopub = {null, null, null, null, AbstractC9968l.crashlytics(2, new C0063l(20)), AbstractC9968l.crashlytics(2, new C0063l(21))};
    public final String amazon;
    public final List billing;
    public final C7412l crashlytics;
    public final Integer loadAd;
    public final List purchase;
    public final String yandex;

    public /* synthetic */ C1358l(int i, String str, Integer num, C7412l c7412l, String str2, List list, List list2) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = num;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = c7412l;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str2;
        }
        int i2 = i & 16;
        C2580l c2580l = C2580l.f5619l;
        if (i2 == 0) {
            this.purchase = c2580l;
        } else {
            this.purchase = list;
        }
        if ((i & 32) == 0) {
            this.billing = c2580l;
        } else {
            this.billing = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358l)) {
            return false;
        }
        C1358l c1358l = (C1358l) obj;
        return AbstractC8576l.yandex(this.yandex, c1358l.yandex) && AbstractC8576l.yandex(this.loadAd, c1358l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c1358l.crashlytics) && AbstractC8576l.yandex(this.amazon, c1358l.amazon) && AbstractC8576l.yandex(this.purchase, c1358l.purchase) && AbstractC8576l.yandex(this.billing, c1358l.billing);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.loadAd;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C7412l c7412l = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (c7412l == null ? 0 : c7412l.hashCode())) * 31;
        String str2 = this.amazon;
        return this.billing.hashCode() + AbstractC14814l.admob((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.purchase);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksItemPersonDto(description=");
        sb.append(this.yandex);
        sb.append(", id=");
        sb.append(this.loadAd);
        sb.append(", legalNotice=");
        sb.append(this.crashlytics);
        sb.append(", name=");
        sb.append(this.amazon);
        sb.append(", photo=");
        sb.append(this.purchase);
        sb.append(", roles=");
        return AbstractC0653l.subscription(sb, this.billing, ')');
    }
}
