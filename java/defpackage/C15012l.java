package defpackage;

/* JADX INFO: renamed from: lٜٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15012l {
    public final String amazon;
    public final int crashlytics;
    public final int loadAd;
    public final Object yandex;

    public C15012l(int i, int i2, Object obj, String str) {
        this.yandex = obj;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = str;
        if (i <= i2) {
            return;
        }
        AbstractC1786l.yandex("Reversed range is not supported");
    }

    public static C15012l yandex(C15012l c15012l, InterfaceC18302l interfaceC18302l, int i, int i2, int i3) {
        Object obj = interfaceC18302l;
        if ((i3 & 1) != 0) {
            obj = c15012l.yandex;
        }
        if ((i3 & 2) != 0) {
            i = c15012l.loadAd;
        }
        if ((i3 & 4) != 0) {
            i2 = c15012l.crashlytics;
        }
        String str = c15012l.amazon;
        c15012l.getClass();
        return new C15012l(i, i2, obj, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15012l)) {
            return false;
        }
        C15012l c15012l = (C15012l) obj;
        return AbstractC8576l.yandex(this.yandex, c15012l.yandex) && this.loadAd == c15012l.loadAd && this.crashlytics == c15012l.crashlytics && AbstractC8576l.yandex(this.amazon, c15012l.amazon);
    }

    public final int hashCode() {
        Object obj = this.yandex;
        return this.amazon.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.loadAd) * 31) + this.crashlytics) * 31);
    }

    public final String toString() {
        return "Range(item=" + this.yandex + ", start=" + this.loadAd + ", end=" + this.crashlytics + ", tag=" + this.amazon + ")";
    }

    public C15012l(Object obj, int i, int i2) {
        this(i, i2, obj, "");
    }
}
