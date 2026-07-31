package defpackage;

/* JADX INFO: renamed from: lَؘٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10117l implements InterfaceC17460l {
    public final Object loadAd;
    public final Object yandex;

    public C10117l(Object obj, Object obj2) {
        this.yandex = obj;
        this.loadAd = obj2;
    }

    @Override // defpackage.InterfaceC17460l
    public final Object amazon() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC17460l
    public final boolean crashlytics(Object obj, Object obj2) {
        return obj.equals(loadAd()) && obj2.equals(amazon());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC17460l)) {
            return false;
        }
        InterfaceC17460l interfaceC17460l = (InterfaceC17460l) obj;
        return AbstractC8576l.yandex(this.yandex, interfaceC17460l.loadAd()) && AbstractC8576l.yandex(this.loadAd, interfaceC17460l.amazon());
    }

    public final int hashCode() {
        Object obj = this.yandex;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.loadAd;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC17460l
    public final Object loadAd() {
        return this.yandex;
    }
}
