package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٗۨۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17584l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C2650l f34223l = new C2650l(3, AbstractC18202l.yandex.loadAd(C17584l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f34224l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f34225l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final String f34226l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f34227l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1864l f34228l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final List f34229l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final String f34230l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f34231l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f34232l;

    public C17584l(C1864l c1864l, ArrayList arrayList, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, C3844l c3844l) {
        super(f34223l, c3844l);
        this.f34228l = c1864l;
        this.f34227l = z;
        this.f34231l = z2;
        this.f34224l = z3;
        this.f34225l = str;
        this.f34230l = str2;
        this.f34226l = str3;
        this.f34232l = str4;
        this.f34229l = AbstractC13457l.purchase("methods", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17584l)) {
            return false;
        }
        C17584l c17584l = (C17584l) obj;
        return AbstractC8576l.yandex(yandex(), c17584l.yandex()) && AbstractC8576l.yandex(this.f34228l, c17584l.f34228l) && AbstractC8576l.yandex(this.f34229l, c17584l.f34229l) && this.f34227l == c17584l.f34227l && this.f34231l == c17584l.f34231l && this.f34224l == c17584l.f34224l && AbstractC8576l.yandex(this.f34225l, c17584l.f34225l) && AbstractC8576l.yandex(this.f34230l, c17584l.f34230l) && AbstractC8576l.yandex(this.f34226l, c17584l.f34226l) && AbstractC8576l.yandex(this.f34232l, c17584l.f34232l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        C1864l c1864l = this.f34228l;
        int iHashCode2 = this.f34232l.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert((((((AbstractC14814l.admob((iHashCode + (c1864l != null ? c1864l.hashCode() : 0)) * 37, 37, this.f34229l) + (this.f34227l ? 1231 : 1237)) * 37) + (this.f34231l ? 1231 : 1237)) * 37) + (this.f34224l ? 1231 : 1237)) * 37, 37, this.f34225l), 37, this.f34230l), 37, this.f34226l);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C1864l c1864l = this.f34228l;
        if (c1864l != null) {
            arrayList.add("product=" + c1864l);
        }
        List list = this.f34229l;
        if (!list.isEmpty()) {
            arrayList.add("methods=" + list);
        }
        AbstractC9029l.ad(AbstractC9029l.metrica(AbstractC9029l.metrica(new StringBuilder("supports_checkout_promo_codes="), this.f34227l, arrayList, "eligible_for_referral="), this.f34231l, arrayList, "has_purchased_once="), this.f34224l, arrayList);
        AbstractC9029l.pro(this.f34225l, "terms_url=", arrayList);
        AbstractC9029l.pro(this.f34230l, "refund_terms_url=", arrayList);
        AbstractC9029l.pro(this.f34226l, "payment_terms_url=", arrayList);
        AbstractC9029l.pro(this.f34232l, "payment_support_url=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "CombinedPaymentPage{", "}", null, 56);
    }
}
