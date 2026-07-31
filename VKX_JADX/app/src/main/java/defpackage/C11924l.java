package defpackage;

/* JADX INFO: renamed from: lِٙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11924l implements InterfaceC7697l {
    public Integer amazon;
    public Integer crashlytics;
    public Integer loadAd;
    public Boolean yandex;

    public C11924l(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.yandex = bool;
        this.loadAd = num;
        this.crashlytics = num2;
        this.amazon = num3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11924l)) {
            return false;
        }
        C11924l c11924l = (C11924l) obj;
        return AbstractC8576l.yandex(this.yandex, c11924l.yandex) && AbstractC8576l.yandex(this.loadAd, c11924l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c11924l.crashlytics) && AbstractC8576l.yandex(this.amazon, c11924l.amazon);
    }

    public final int hashCode() {
        Boolean bool = this.yandex;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.loadAd;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.crashlytics;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.amazon;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.yandex;
        if (bool != null) {
            str = bool.booleanValue() ? "-" : "+";
        } else {
            str = " ";
        }
        sb.append(str);
        Object obj = this.loadAd;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.crashlytics;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.amazon;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC7697l
    public final Object yandex() {
        return new C11924l(this.yandex, this.loadAd, this.crashlytics, this.amazon);
    }
}
