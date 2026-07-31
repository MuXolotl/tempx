package defpackage;

/* JADX INFO: renamed from: lِؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C11555l {
    public static final C15644l Companion = new C15644l();
    public final Integer crashlytics;
    public final Integer loadAd;
    public final Integer yandex;

    public /* synthetic */ C11555l(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = num;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = num2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11555l)) {
            return false;
        }
        C11555l c11555l = (C11555l) obj;
        return AbstractC8576l.yandex(this.yandex, c11555l.yandex) && AbstractC8576l.yandex(this.loadAd, c11555l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c11555l.crashlytics);
    }

    public final int hashCode() {
        Integer num = this.yandex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.loadAd;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.crashlytics;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "AuthBirthdayDto(year=" + this.yandex + ", month=" + this.loadAd + ", day=" + this.crashlytics + ')';
    }
}
