package defpackage;

/* JADX INFO: renamed from: lؘِؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11658l {
    public final C17360l amazon;
    public final EnumC14251l crashlytics;
    public final Object loadAd;
    public final Integer yandex;

    public C11658l(Integer num, Object obj, EnumC14251l enumC14251l, C17360l c17360l) {
        this.yandex = num;
        if (obj == null) {
            C6541l.subs("Null payload");
            throw null;
        }
        this.loadAd = obj;
        this.crashlytics = enumC14251l;
        this.amazon = c17360l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11658l)) {
            return false;
        }
        C11658l c11658l = (C11658l) obj;
        Integer num = c11658l.yandex;
        Integer num2 = this.yandex;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.loadAd.equals(c11658l.loadAd) || !this.crashlytics.equals(c11658l.crashlytics)) {
            return false;
        }
        C17360l c17360l = c11658l.amazon;
        C17360l c17360l2 = this.amazon;
        if (c17360l2 == null) {
            return c17360l == null;
        }
        return c17360l2.equals(c17360l);
    }

    public final int hashCode() {
        Integer num = this.yandex;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003;
        C17360l c17360l = this.amazon;
        return (iHashCode ^ (c17360l != null ? c17360l.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.yandex + ", payload=" + this.loadAd + ", priority=" + this.crashlytics + ", productData=" + this.amazon + ", eventContext=null}";
    }
}
