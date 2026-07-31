package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15968l extends AbstractC11904l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C7397l f31336l = new C7397l(3, AbstractC18202l.yandex.loadAd(C15968l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f31337l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f31338l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f31339l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final EnumC11976l f31340l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f31341l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Long f31342l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f31343l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f31344l;

    public C15968l(long j, EnumC11976l enumC11976l, long j2, String str, String str2, Long l, int i, String str3, C3844l c3844l) {
        super(f31336l, c3844l);
        this.f31341l = j;
        this.f31340l = enumC11976l;
        this.f31343l = j2;
        this.f31337l = str;
        this.f31338l = str2;
        this.f31342l = l;
        this.f31339l = i;
        this.f31344l = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15968l)) {
            return false;
        }
        C15968l c15968l = (C15968l) obj;
        return AbstractC8576l.yandex(yandex(), c15968l.yandex()) && this.f31341l == c15968l.f31341l && this.f31340l == c15968l.f31340l && this.f31343l == c15968l.f31343l && AbstractC8576l.yandex(this.f31337l, c15968l.f31337l) && AbstractC8576l.yandex(this.f31338l, c15968l.f31338l) && AbstractC8576l.yandex(this.f31342l, c15968l.f31342l) && this.f31339l == c15968l.f31339l && AbstractC8576l.yandex(this.f31344l, c15968l.f31344l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f31341l;
        int iHashCode2 = (this.f31340l.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 37)) * 37;
        long j2 = this.f31343l;
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert((iHashCode2 + ((int) ((j2 >>> 32) ^ j2))) * 37, 37, this.f31337l), 37, this.f31338l);
        Long l = this.f31342l;
        int iHashCode3 = this.f31344l.hashCode() + ((((iAdvert + (l != null ? l.hashCode() : 0)) * 37) + this.f31339l) * 37);
        this.f23747l = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.f31341l);
        arrayList.add("status=" + this.f31340l);
        arrayList.add("date=" + this.f31343l);
        AbstractC9029l.pro(this.f31337l, "product_title=", arrayList);
        AbstractC9029l.pro(this.f31338l, "payment_method_title=", arrayList);
        Long l = this.f31342l;
        if (l != null) {
            arrayList.add("gift_to_vk_id=" + l);
        }
        arrayList.add("amount=" + this.f31339l);
        AbstractC9029l.pro(this.f31344l, "currency=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "Purchase{", "}", null, 56);
    }
}
