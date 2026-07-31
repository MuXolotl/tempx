package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًْۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13654l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C12723l f26680l = new C12723l(3, AbstractC18202l.yandex.loadAd(C13654l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f26681l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final EnumC12598l f26682l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f26683l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f26684l;

    public C13654l(String str, EnumC12598l enumC12598l, String str2, int i, C3844l c3844l) {
        super(f26680l, c3844l);
        this.f26683l = str;
        this.f26682l = enumC12598l;
        this.f26684l = str2;
        this.f26681l = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13654l)) {
            return false;
        }
        C13654l c13654l = (C13654l) obj;
        return AbstractC8576l.yandex(yandex(), c13654l.yandex()) && AbstractC8576l.yandex(this.f26683l, c13654l.f26683l) && this.f26682l == c13654l.f26682l && AbstractC8576l.yandex(this.f26684l, c13654l.f26684l) && this.f26681l == c13654l.f26681l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdvert = AbstractC12589l.advert((this.f26682l.hashCode() + AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f26683l)) * 37, 37, this.f26684l) + this.f26681l;
        this.f23747l = iAdvert;
        return iAdvert;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbVip = AbstractC9029l.vip(this.f26683l, "device_name=", arrayList, "device_type=");
        sbVip.append(this.f26682l);
        arrayList.add(sbVip.toString());
        StringBuilder sbVip2 = AbstractC9029l.vip(this.f26684l, "app_version_name=", arrayList, "app_version_code=");
        sbVip2.append(this.f26681l);
        arrayList.add(sbVip2.toString());
        return AbstractC16901l.m4210case(arrayList, ", ", "IacDeviceInfo{", "}", null, 56);
    }
}
