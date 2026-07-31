package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1682l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C1681l f4044l = new C1681l(3, AbstractC18202l.yandex.loadAd(C1682l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f4045l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f4046l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final EnumC16913l f4047l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f4048l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final String f4049l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f4050l;

    public C1682l(String str, EnumC16913l enumC16913l, String str2, int i, String str3, String str4, C3844l c3844l) {
        super(f4044l, c3844l);
        this.f4048l = str;
        this.f4047l = enumC16913l;
        this.f4050l = str2;
        this.f4045l = i;
        this.f4046l = str3;
        this.f4049l = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1682l)) {
            return false;
        }
        C1682l c1682l = (C1682l) obj;
        return AbstractC8576l.yandex(yandex(), c1682l.yandex()) && AbstractC8576l.yandex(this.f4048l, c1682l.f4048l) && this.f4047l == c1682l.f4047l && AbstractC8576l.yandex(this.f4050l, c1682l.f4050l) && this.f4045l == c1682l.f4045l && AbstractC8576l.yandex(this.f4046l, c1682l.f4046l) && AbstractC8576l.yandex(this.f4049l, c1682l.f4049l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f4049l.hashCode() + AbstractC12589l.advert((AbstractC12589l.advert((this.f4047l.hashCode() + AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f4048l)) * 37, 37, this.f4050l) + this.f4045l) * 37, 37, this.f4046l);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbVip = AbstractC9029l.vip(this.f4048l, "id=", arrayList, "type=");
        sbVip.append(this.f4047l);
        arrayList.add(sbVip.toString());
        StringBuilder sbVip2 = AbstractC9029l.vip(this.f4050l, "host=", arrayList, "port=");
        sbVip2.append(this.f4045l);
        arrayList.add(sbVip2.toString());
        AbstractC9029l.pro(this.f4046l, "username=", arrayList);
        AbstractC9029l.pro(this.f4049l, "password=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "Proxy{", "}", null, 56);
    }
}
