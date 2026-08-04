package defpackage;

/* JADX INFO: renamed from: lؕۦۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C3779l {
    public static final C4607l Companion = new C4607l();
    public static final InterfaceC1220l[] billing = {null, null, null, null, AbstractC9968l.crashlytics(2, new C7703l(9))};
    public final String amazon;
    public final int crashlytics;
    public final int loadAd;
    public final EnumC10566l purchase;
    public final String yandex;

    public /* synthetic */ C3779l(int i, String str, int i2, int i3, String str2, EnumC10566l enumC10566l) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C9803l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = i2;
        this.crashlytics = i3;
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str2;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = enumC10566l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3779l)) {
            return false;
        }
        C3779l c3779l = (C3779l) obj;
        return AbstractC8576l.yandex(this.yandex, c3779l.yandex) && this.loadAd == c3779l.loadAd && this.crashlytics == c3779l.crashlytics && AbstractC8576l.yandex(this.amazon, c3779l.amazon) && this.purchase == c3779l.purchase;
    }

    public final int hashCode() {
        int iHashCode = ((((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics) * 31;
        String str = this.amazon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC10566l enumC10566l = this.purchase;
        return iHashCode2 + (enumC10566l != null ? enumC10566l.hashCode() : 0);
    }

    public final String toString() {
        return "BaseImageDto(url=" + this.yandex + ", width=" + this.loadAd + ", height=" + this.crashlytics + ", id=" + this.amazon + ", theme=" + this.purchase + ')';
    }
}
