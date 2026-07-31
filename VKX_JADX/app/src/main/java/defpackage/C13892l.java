package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lِٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C13892l {
    public static final C3279l Companion = new C3279l();
    public static final InterfaceC1220l[] admob = {AbstractC9968l.crashlytics(2, new C8631l(16)), null, null, null, null, null, AbstractC9968l.crashlytics(2, new C8631l(17))};
    public final int amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final List mopub;
    public final boolean purchase;
    public final List yandex;

    public /* synthetic */ C13892l(int i, List list, String str, String str2, int i2, boolean z, String str3, List list2) {
        if (40 != (i & 40)) {
            AbstractC11036l.isPro(i, 40, C14557l.yandex.purchase());
            throw null;
        }
        int i3 = i & 1;
        C2580l c2580l = C2580l.f5619l;
        if (i3 == 0) {
            this.yandex = c2580l;
        } else {
            this.yandex = list;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str2;
        }
        this.amazon = i2;
        if ((i & 16) == 0) {
            this.purchase = false;
        } else {
            this.purchase = z;
        }
        this.billing = str3;
        if ((i & 64) == 0) {
            this.mopub = c2580l;
        } else {
            this.mopub = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13892l)) {
            return false;
        }
        C13892l c13892l = (C13892l) obj;
        return AbstractC8576l.yandex(this.yandex, c13892l.yandex) && AbstractC8576l.yandex(this.loadAd, c13892l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c13892l.crashlytics) && this.amazon == c13892l.amazon && this.purchase == c13892l.purchase && AbstractC8576l.yandex(this.billing, c13892l.billing) && AbstractC8576l.yandex(this.mopub, c13892l.mopub);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.crashlytics;
        return this.mopub.hashCode() + AbstractC12589l.advert((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.amazon) * 31) + (this.purchase ? 1231 : 1237)) * 31, 31, this.billing);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCodeAuthClientInfoDto(agreements=");
        sb.append(this.yandex);
        sb.append(", icon150=");
        sb.append(this.loadAd);
        sb.append(", icon75=");
        sb.append(this.crashlytics);
        sb.append(", id=");
        sb.append(this.amazon);
        sb.append(", isOfficial=");
        sb.append(this.purchase);
        sb.append(", name=");
        sb.append(this.billing);
        sb.append(", scopes=");
        return AbstractC0653l.subscription(sb, this.mopub, ')');
    }
}
