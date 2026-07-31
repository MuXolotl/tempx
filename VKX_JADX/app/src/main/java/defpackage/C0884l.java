package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0884l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C1893l f2536l = new C1893l(3, AbstractC18202l.yandex.loadAd(C0884l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f2537l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f2538l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f2539l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f2540l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f2541l;

    public C0884l(String str, String str2, String str3, String str4, String str5, C3844l c3844l) {
        super(f2536l, c3844l);
        this.f2540l = str;
        this.f2539l = str2;
        this.f2541l = str3;
        this.f2537l = str4;
        this.f2538l = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0884l)) {
            return false;
        }
        C0884l c0884l = (C0884l) obj;
        return AbstractC8576l.yandex(yandex(), c0884l.yandex()) && AbstractC8576l.yandex(this.f2540l, c0884l.f2540l) && AbstractC8576l.yandex(this.f2539l, c0884l.f2539l) && AbstractC8576l.yandex(this.f2541l, c0884l.f2541l) && AbstractC8576l.yandex(this.f2537l, c0884l.f2537l) && AbstractC8576l.yandex(this.f2538l, c0884l.f2538l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f2538l.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f2540l), 37, this.f2539l), 37, this.f2541l), 37, this.f2537l);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f2540l, "type=", arrayList);
        AbstractC9029l.pro(this.f2539l, "title=", arrayList);
        AbstractC9029l.pro(this.f2541l, "subtitle=", arrayList);
        AbstractC9029l.pro(this.f2537l, "photo_url=", arrayList);
        AbstractC9029l.pro(this.f2538l, "element_url=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "WidgetItem{", "}", null, 56);
    }
}
