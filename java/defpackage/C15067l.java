package defpackage;

/* JADX INFO: renamed from: lٍٟٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C15067l {
    public static final C7301l Companion = new C7301l();
    public final Integer amazon;
    public final Integer crashlytics;
    public final Double loadAd;
    public final Long purchase;
    public final Boolean yandex;

    public /* synthetic */ C15067l(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            AbstractC11036l.isPro(i, 31, C5082l.yandex.purchase());
            throw null;
        }
        this.yandex = bool;
        this.loadAd = d;
        this.crashlytics = num;
        this.amazon = num2;
        this.purchase = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15067l)) {
            return false;
        }
        C15067l c15067l = (C15067l) obj;
        return AbstractC8576l.yandex(this.yandex, c15067l.yandex) && AbstractC8576l.yandex(this.loadAd, c15067l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c15067l.crashlytics) && AbstractC8576l.yandex(this.amazon, c15067l.amazon) && AbstractC8576l.yandex(this.purchase, c15067l.purchase);
    }

    public final int hashCode() {
        Boolean bool = this.yandex;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.loadAd;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.amazon;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.purchase;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.yandex + ", sessionSamplingRate=" + this.loadAd + ", sessionTimeoutSeconds=" + this.crashlytics + ", cacheDurationSeconds=" + this.amazon + ", cacheUpdatedTimeSeconds=" + this.purchase + ')';
    }

    public C15067l(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.yandex = bool;
        this.loadAd = d;
        this.crashlytics = num;
        this.amazon = num2;
        this.purchase = l;
    }
}
