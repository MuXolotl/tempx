package defpackage;

/* JADX INFO: renamed from: lُؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7190l {
    public static final C7190l yandex = new C7190l();

    public final int loadAd(Object obj) {
        if (!(obj instanceof C7819l)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        C7819l c7819l = (C7819l) obj;
        int iHashCode = (c7819l.loadAd.hashCode() + (c7819l.yandex.hashCode() * 31)) * 31;
        String str = c7819l.amazon;
        return AbstractC5020l.inmobi(c7819l.tapsense) + AbstractC0653l.firebase(c7819l.subscription, (c7819l.ads.hashCode() + ((c7819l.purchase.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 31, 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }

    public final boolean yandex(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof C7819l) || !(obj2 instanceof C7819l)) {
            return AbstractC8576l.yandex(obj, obj2);
        }
        C7819l c7819l = (C7819l) obj;
        C7819l c7819l2 = (C7819l) obj2;
        return AbstractC8576l.yandex(c7819l.yandex, c7819l2.yandex) && c7819l.loadAd.equals(c7819l2.loadAd) && AbstractC8576l.yandex(c7819l.amazon, c7819l2.amazon) && AbstractC8576l.yandex(c7819l.purchase, c7819l2.purchase) && AbstractC8576l.yandex(c7819l.ads, c7819l2.ads) && c7819l.subscription == c7819l2.subscription && c7819l.tapsense == c7819l2.tapsense;
    }
}
