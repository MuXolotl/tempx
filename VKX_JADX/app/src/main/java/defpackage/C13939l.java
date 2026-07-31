package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٓؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13939l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C3676l f27226l = new C3676l(AbstractC18202l.yandex.loadAd(C13939l.class));

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Map f27227l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C7968l f27228l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C7968l f27229l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C7968l f27230l;

    public C13939l(C7968l c7968l, C7968l c7968l2, C7968l c7968l3, Map map, C3844l c3844l) {
        super(f27226l, c3844l);
        this.f27229l = c7968l;
        this.f27228l = c7968l2;
        this.f27230l = c7968l3;
        this.f27227l = AbstractC13457l.billing("on_bluetooth_device", map);
    }

    public static C13939l loadAd(C13939l c13939l, C7968l c7968l, C7968l c7968l2, C7968l c7968l3, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            c7968l = c13939l.f27229l;
        }
        C7968l c7968l4 = c7968l;
        if ((i & 2) != 0) {
            c7968l2 = c13939l.f27228l;
        }
        C7968l c7968l5 = c7968l2;
        if ((i & 4) != 0) {
            c7968l3 = c13939l.f27230l;
        }
        C7968l c7968l6 = c7968l3;
        Map map = linkedHashMap;
        if ((i & 8) != 0) {
            map = c13939l.f27227l;
        }
        C3844l c3844lYandex = c13939l.yandex();
        c13939l.getClass();
        return new C13939l(c7968l4, c7968l5, c7968l6, map, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13939l)) {
            return false;
        }
        C13939l c13939l = (C13939l) obj;
        return AbstractC8576l.yandex(yandex(), c13939l.yandex()) && AbstractC8576l.yandex(this.f27229l, c13939l.f27229l) && AbstractC8576l.yandex(this.f27228l, c13939l.f27228l) && AbstractC8576l.yandex(this.f27230l, c13939l.f27230l) && AbstractC8576l.yandex(this.f27227l, c13939l.f27227l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        C7968l c7968l = this.f27229l;
        int iHashCode2 = (iHashCode + (c7968l != null ? c7968l.hashCode() : 0)) * 37;
        C7968l c7968l2 = this.f27228l;
        int iHashCode3 = (iHashCode2 + (c7968l2 != null ? c7968l2.hashCode() : 0)) * 37;
        C7968l c7968l3 = this.f27230l;
        int iHashCode4 = this.f27227l.hashCode() + ((iHashCode3 + (c7968l3 != null ? c7968l3.hashCode() : 0)) * 37);
        this.f23747l = iHashCode4;
        return iHashCode4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C7968l c7968l = this.f27229l;
        if (c7968l != null) {
            arrayList.add("on_headset_plug=" + c7968l);
        }
        C7968l c7968l2 = this.f27228l;
        if (c7968l2 != null) {
            arrayList.add("on_app_launch=" + c7968l2);
        }
        C7968l c7968l3 = this.f27230l;
        if (c7968l3 != null) {
            arrayList.add("on_bluetooth=" + c7968l3);
        }
        Map map = this.f27227l;
        if (!map.isEmpty()) {
            arrayList.add("on_bluetooth_device=" + map);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "VkxAutoplayPreferences{", "}", null, 56);
    }
}
