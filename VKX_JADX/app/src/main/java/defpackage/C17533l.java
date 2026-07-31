package defpackage;

/* JADX INFO: renamed from: lٗۥّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17533l {
    public static final C12241l Companion = new C12241l();
    public static final InterfaceC1220l[] mopub = {null, null, null, AbstractC9968l.crashlytics(2, new C8631l(26)), null, null};
    public final EnumC8967l amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final C11555l purchase;
    public final String yandex;

    public /* synthetic */ C17533l(int i, String str, String str2, String str3, EnumC8967l enumC8967l, C11555l c11555l, String str4) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str3;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = enumC8967l;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = c11555l;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17533l)) {
            return false;
        }
        C17533l c17533l = (C17533l) obj;
        return AbstractC8576l.yandex(this.yandex, c17533l.yandex) && AbstractC8576l.yandex(this.loadAd, c17533l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c17533l.crashlytics) && this.amazon == c17533l.amazon && AbstractC8576l.yandex(this.purchase, c17533l.purchase) && AbstractC8576l.yandex(this.billing, c17533l.billing);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadAd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC8967l enumC8967l = this.amazon;
        int iHashCode4 = (iHashCode3 + (enumC8967l == null ? 0 : enumC8967l.hashCode())) * 31;
        C11555l c11555l = this.purchase;
        int iHashCode5 = (iHashCode4 + (c11555l == null ? 0 : c11555l.hashCode())) * 31;
        String str4 = this.billing;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSignupFieldsValuesDto(firstName=");
        sb.append(this.yandex);
        sb.append(", lastName=");
        sb.append(this.loadAd);
        sb.append(", middleName=");
        sb.append(this.crashlytics);
        sb.append(", gender=");
        sb.append(this.amazon);
        sb.append(", birthday=");
        sb.append(this.purchase);
        sb.append(", avatar=");
        return AbstractC2812l.tapsense(sb, this.billing, ')');
    }
}
