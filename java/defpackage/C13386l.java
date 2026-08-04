package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lْٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13386l extends AbstractC11904l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C18614l f26277l = new C18614l(3, AbstractC18202l.yandex.loadAd(C13386l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f26278l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f26279l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f26280l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f26281l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f26282l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f26283l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f26284l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f26285l;

    public C13386l(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, C3844l c3844l) {
        super(f26277l, c3844l);
        this.f26282l = str;
        this.f26281l = str2;
        this.f26284l = i;
        this.f26278l = i2;
        this.f26279l = i3;
        this.f26283l = i4;
        this.f26280l = i5;
        this.f26285l = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13386l)) {
            return false;
        }
        C13386l c13386l = (C13386l) obj;
        return AbstractC8576l.yandex(yandex(), c13386l.yandex()) && AbstractC8576l.yandex(this.f26282l, c13386l.f26282l) && AbstractC8576l.yandex(this.f26281l, c13386l.f26281l) && this.f26284l == c13386l.f26284l && this.f26278l == c13386l.f26278l && this.f26279l == c13386l.f26279l && this.f26283l == c13386l.f26283l && this.f26280l == c13386l.f26280l && this.f26285l == c13386l.f26285l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdvert = ((((((((((AbstractC12589l.advert(AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f26282l), 37, this.f26281l) + this.f26284l) * 37) + this.f26278l) * 37) + this.f26279l) * 37) + this.f26283l) * 37) + this.f26280l) * 37) + this.f26285l;
        this.f23747l = iAdvert;
        return iAdvert;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f26282l, "id=", arrayList);
        StringBuilder sbVip = AbstractC9029l.vip(this.f26281l, "title=", arrayList, "price_rub=");
        sbVip.append(this.f26284l);
        arrayList.add(sbVip.toString());
        arrayList.add("price_rub_original=" + this.f26278l);
        arrayList.add("price_rub_subscription_before_sale=" + this.f26279l);
        arrayList.add("calculated_discount=" + this.f26283l);
        arrayList.add("price_usd_final_cents=" + this.f26280l);
        arrayList.add("price_uah=" + this.f26285l);
        return AbstractC16901l.m4210case(arrayList, ", ", "Variant{", "}", null, 56);
    }
}
