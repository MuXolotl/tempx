package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚؕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3259l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C16319l f6978l = new C16319l(3, AbstractC18202l.yandex.loadAd(C3259l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f6979l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f6980l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f6981l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f6982l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final EnumC3503l f6983l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f6984l;

    public C3259l(boolean z, boolean z2, String str, String str2, String str3, EnumC3503l enumC3503l, C3844l c3844l) {
        super(f6978l, c3844l);
        this.f6982l = z;
        this.f6981l = z2;
        this.f6984l = str;
        this.f6979l = str2;
        this.f6980l = str3;
        this.f6983l = enumC3503l;
    }

    public static C3259l loadAd(C3259l c3259l, boolean z, String str, String str2, String str3, EnumC3503l enumC3503l, int i) {
        boolean z2 = (i & 1) != 0 ? c3259l.f6982l : true;
        if ((i & 2) != 0) {
            z = c3259l.f6981l;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str = c3259l.f6984l;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = c3259l.f6979l;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = c3259l.f6980l;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            enumC3503l = c3259l.f6983l;
        }
        C3844l c3844lYandex = c3259l.yandex();
        c3259l.getClass();
        return new C3259l(z2, z3, str4, str5, str6, enumC3503l, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3259l)) {
            return false;
        }
        C3259l c3259l = (C3259l) obj;
        return AbstractC8576l.yandex(yandex(), c3259l.yandex()) && this.f6982l == c3259l.f6982l && this.f6981l == c3259l.f6981l && AbstractC8576l.yandex(this.f6984l, c3259l.f6984l) && AbstractC8576l.yandex(this.f6979l, c3259l.f6979l) && AbstractC8576l.yandex(this.f6980l, c3259l.f6980l) && this.f6983l == c3259l.f6983l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f6983l.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(((((yandex().hashCode() * 37) + (this.f6982l ? 1231 : 1237)) * 37) + (this.f6981l ? 1231 : 1237)) * 37, 37, this.f6984l), 37, this.f6979l), 37, this.f6980l);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.ad(AbstractC9029l.metrica(new StringBuilder("is_queue_available="), this.f6982l, arrayList, "is_paused="), this.f6981l, arrayList);
        AbstractC9029l.pro(this.f6984l, "current_track_name=", arrayList);
        AbstractC9029l.pro(this.f6979l, "current_track_artist=", arrayList);
        StringBuilder sbVip = AbstractC9029l.vip(this.f6980l, "current_track_artwork_url=", arrayList, "bg_mode=");
        sbVip.append(this.f6983l);
        arrayList.add(sbVip.toString());
        return AbstractC16901l.m4210case(arrayList, ", ", "VkxSmallPlayerWidgetState{", "}", null, 56);
    }
}
