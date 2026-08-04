package defpackage;

/* JADX INFO: renamed from: lؖۧؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C4530l {
    public static final C13574l Companion = new C13574l();
    public static final InterfaceC1220l[] billing = {AbstractC9968l.crashlytics(2, new C3321l(26)), null, null, null, null};
    public final String amazon;
    public final Integer crashlytics;
    public final Integer loadAd;
    public final Boolean purchase;
    public final EnumC11781l yandex;

    public /* synthetic */ C4530l(int i, EnumC11781l enumC11781l, Integer num, Integer num2, String str, Boolean bool) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = enumC11781l;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = num;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = num2;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4530l)) {
            return false;
        }
        C4530l c4530l = (C4530l) obj;
        return this.yandex == c4530l.yandex && AbstractC8576l.yandex(this.loadAd, c4530l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c4530l.crashlytics) && AbstractC8576l.yandex(this.amazon, c4530l.amazon) && AbstractC8576l.yandex(this.purchase, c4530l.purchase);
    }

    public final int hashCode() {
        EnumC11781l enumC11781l = this.yandex;
        int iHashCode = (enumC11781l == null ? 0 : enumC11781l.hashCode()) * 31;
        Integer num = this.loadAd;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.amazon;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.purchase;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "EcosystemVerificationMethodDto(name=" + this.yandex + ", priority=" + this.loadAd + ", timeout=" + this.crashlytics + ", info=" + this.amazon + ", canFallback=" + this.purchase + ')';
    }
}
