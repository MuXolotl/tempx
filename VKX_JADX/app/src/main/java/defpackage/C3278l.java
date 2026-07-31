package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٌَؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3278l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C17661l f7014l = new C17661l(3, AbstractC18202l.yandex.loadAd(C3278l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f7015l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f7016l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final List f7017l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f7018l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f7019l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f7020l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f7021l;

    public C3278l(boolean z, String str, List list, boolean z2, boolean z3, boolean z4, boolean z5, C3844l c3844l) {
        super(f7014l, c3844l);
        this.f7019l = z;
        this.f7018l = str;
        this.f7021l = z2;
        this.f7015l = z3;
        this.f7016l = z4;
        this.f7020l = z5;
        this.f7017l = AbstractC13457l.purchase("proxy_user_list", list);
    }

    public static C3278l loadAd(C3278l c3278l, boolean z, String str, ArrayList arrayList, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c3278l.f7019l;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            str = c3278l.f7018l;
        }
        String str2 = str;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = c3278l.f7017l;
        }
        List list2 = list;
        boolean z4 = c3278l.f7021l;
        boolean z5 = c3278l.f7015l;
        boolean z6 = c3278l.f7016l;
        if ((i & 64) != 0) {
            z2 = c3278l.f7020l;
        }
        C3844l c3844lYandex = c3278l.yandex();
        c3278l.getClass();
        return new C3278l(z3, str2, list2, z4, z5, z6, z2, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3278l)) {
            return false;
        }
        C3278l c3278l = (C3278l) obj;
        return AbstractC8576l.yandex(yandex(), c3278l.yandex()) && this.f7019l == c3278l.f7019l && AbstractC8576l.yandex(this.f7018l, c3278l.f7018l) && AbstractC8576l.yandex(this.f7017l, c3278l.f7017l) && this.f7021l == c3278l.f7021l && this.f7015l == c3278l.f7015l && this.f7016l == c3278l.f7016l && this.f7020l == c3278l.f7020l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdmob = ((((((AbstractC14814l.admob(AbstractC12589l.advert(((yandex().hashCode() * 37) + (this.f7019l ? 1231 : 1237)) * 37, 37, this.f7018l), 37, this.f7017l) + (this.f7021l ? 1231 : 1237)) * 37) + (this.f7015l ? 1231 : 1237)) * 37) + (this.f7016l ? 1231 : 1237)) * 37) + (this.f7020l ? 1231 : 1237);
        this.f23747l = iAdmob;
        return iAdmob;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.ad(new StringBuilder("proxy_enabled="), this.f7019l, arrayList);
        AbstractC9029l.pro(this.f7018l, "proxy_selected=", arrayList);
        List list = this.f7017l;
        if (!list.isEmpty()) {
            arrayList.add("proxy_user_list=" + list);
        }
        AbstractC9029l.ad(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(new StringBuilder("proxy_vk_enabled="), this.f7021l, arrayList, "cronet_manual_disabled="), this.f7015l, arrayList, "cronet_disable_quic="), this.f7016l, arrayList, "use_vk_ru_domain="), this.f7020l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "VkxNetworkPreferences{", "}", null, 56);
    }
}
