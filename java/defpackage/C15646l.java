package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15646l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C9461l f30583l = new C9461l(3, AbstractC18202l.yandex.loadAd(C15646l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Integer f30584l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f30585l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f30586l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f30587l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Long f30588l;

    public C15646l(String str, String str2, Long l, Integer num, String str3, C3844l c3844l) {
        super(f30583l, c3844l);
        this.f30587l = str;
        this.f30586l = str2;
        this.f30588l = l;
        this.f30584l = num;
        this.f30585l = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15646l)) {
            return false;
        }
        C15646l c15646l = (C15646l) obj;
        return AbstractC8576l.yandex(yandex(), c15646l.yandex()) && AbstractC8576l.yandex(this.f30587l, c15646l.f30587l) && AbstractC8576l.yandex(this.f30586l, c15646l.f30586l) && AbstractC8576l.yandex(this.f30588l, c15646l.f30588l) && AbstractC8576l.yandex(this.f30584l, c15646l.f30584l) && AbstractC8576l.yandex(this.f30585l, c15646l.f30585l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f30587l), 37, this.f30586l);
        Long l = this.f30588l;
        int iHashCode = (iAdvert + (l != null ? l.hashCode() : 0)) * 37;
        Integer num = this.f30584l;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.f30585l;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.f23747l = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f30587l, "variant_id=", arrayList);
        AbstractC9029l.pro(this.f30586l, "method_id=", arrayList);
        Long l = this.f30588l;
        if (l != null) {
            arrayList.add("gift_to_vk_id=" + l);
        }
        Integer num = this.f30584l;
        if (num != null) {
            arrayList.add("ref=" + num);
        }
        String str = this.f30585l;
        if (str != null) {
            AbstractC9029l.pro(str, "promo_code=", arrayList);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "PaymentBuildUrlRequest{", "}", null, 56);
    }
}
