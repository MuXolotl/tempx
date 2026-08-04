package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٕٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1864l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C2348l f4276l = new C2348l(3, AbstractC18202l.yandex.loadAd(C1864l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Integer f4277l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f4278l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f4279l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f4280l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final List f4281l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f4282l;

    public C1864l(String str, boolean z, boolean z2, ArrayList arrayList, Integer num, boolean z3, C3844l c3844l) {
        super(f4276l, c3844l);
        this.f4280l = str;
        this.f4279l = z;
        this.f4282l = z2;
        this.f4277l = num;
        this.f4278l = z3;
        this.f4281l = AbstractC13457l.purchase("available_variants", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1864l)) {
            return false;
        }
        C1864l c1864l = (C1864l) obj;
        return AbstractC8576l.yandex(yandex(), c1864l.yandex()) && AbstractC8576l.yandex(this.f4280l, c1864l.f4280l) && this.f4279l == c1864l.f4279l && this.f4282l == c1864l.f4282l && AbstractC8576l.yandex(this.f4281l, c1864l.f4281l) && AbstractC8576l.yandex(this.f4277l, c1864l.f4277l) && this.f4278l == c1864l.f4278l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdmob = AbstractC14814l.admob((((AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f4280l) + (this.f4279l ? 1231 : 1237)) * 37) + (this.f4282l ? 1231 : 1237)) * 37, 37, this.f4281l);
        Integer num = this.f4277l;
        int iHashCode = ((iAdmob + (num != null ? num.hashCode() : 0)) * 37) + (this.f4278l ? 1231 : 1237);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.ad(AbstractC9029l.metrica(AbstractC9029l.vip(this.f4280l, "title=", arrayList, "is_subscription="), this.f4279l, arrayList, "is_giftable="), this.f4282l, arrayList);
        List list = this.f4281l;
        if (!list.isEmpty()) {
            arrayList.add("available_variants=" + list);
        }
        Integer num = this.f4277l;
        if (num != null) {
            arrayList.add("loyalty_discount_applied=" + num);
        }
        AbstractC9029l.ad(new StringBuilder("is_available="), this.f4278l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "ProductInformation{", "}", null, 56);
    }
}
