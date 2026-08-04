package defpackage;

/* JADX INFO: renamed from: lْؓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1822l implements InterfaceC11068l, InterfaceC7697l {
    public Integer loadAd;
    public Integer yandex;

    public C1822l(Integer num, Integer num2) {
        this.yandex = num;
        this.loadAd = num2;
    }

    @Override // defpackage.InterfaceC11068l
    public final Integer billing() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC11068l
    public final void crashlytics(Integer num) {
        this.loadAd = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1822l)) {
            return false;
        }
        C1822l c1822l = (C1822l) obj;
        return AbstractC8576l.yandex(this.yandex, c1822l.yandex) && AbstractC8576l.yandex(this.loadAd, c1822l.loadAd);
    }

    @Override // defpackage.InterfaceC11068l
    public final Integer firebase() {
        return this.loadAd;
    }

    public final int hashCode() {
        Integer num = this.yandex;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.loadAd;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC11068l
    public final void isPro(Integer num) {
        this.yandex = num;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.yandex;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Integer num = this.loadAd;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC7697l
    public final Object yandex() {
        return new C1822l(this.yandex, this.loadAd);
    }
}
