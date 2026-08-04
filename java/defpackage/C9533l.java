package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٍْۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9533l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C6566l f19428l = new C6566l(AbstractC18202l.yandex.loadAd(C9533l.class));

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C18482l f19429l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f19430l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C5542l f19431l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final EnumC4900l f19432l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f19433l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final Map f19434l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C17937l f19435l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C15589l f19436l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final List f19437l;

    public C9533l(long j, EnumC4900l enumC4900l, C15589l c15589l, C18482l c18482l, String str, C17937l c17937l, C5542l c5542l, List list, Map map, C3844l c3844l) {
        super(f19428l, c3844l);
        this.f19433l = j;
        this.f19432l = enumC4900l;
        this.f19436l = c15589l;
        this.f19429l = c18482l;
        this.f19430l = str;
        this.f19435l = c17937l;
        this.f19431l = c5542l;
        this.f19437l = AbstractC13457l.purchase("threads", list);
        this.f19434l = AbstractC13457l.billing("custom_attributes", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9533l)) {
            return false;
        }
        C9533l c9533l = (C9533l) obj;
        return AbstractC8576l.yandex(yandex(), c9533l.yandex()) && this.f19433l == c9533l.f19433l && this.f19432l == c9533l.f19432l && AbstractC8576l.yandex(this.f19436l, c9533l.f19436l) && AbstractC8576l.yandex(this.f19429l, c9533l.f19429l) && AbstractC8576l.yandex(this.f19430l, c9533l.f19430l) && AbstractC8576l.yandex(this.f19435l, c9533l.f19435l) && AbstractC8576l.yandex(this.f19431l, c9533l.f19431l) && AbstractC8576l.yandex(this.f19437l, c9533l.f19437l) && AbstractC8576l.yandex(this.f19434l, c9533l.f19434l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f19433l;
        int iHashCode2 = (this.f19432l.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 37)) * 37;
        C15589l c15589l = this.f19436l;
        int iHashCode3 = (iHashCode2 + (c15589l != null ? c15589l.hashCode() : 0)) * 37;
        C18482l c18482l = this.f19429l;
        int iAdvert = AbstractC12589l.advert((iHashCode3 + (c18482l != null ? c18482l.hashCode() : 0)) * 37, 37, this.f19430l);
        C17937l c17937l = this.f19435l;
        int iHashCode4 = (iAdvert + (c17937l != null ? c17937l.hashCode() : 0)) * 37;
        C5542l c5542l = this.f19431l;
        int iHashCode5 = this.f19434l.hashCode() + AbstractC14814l.admob((iHashCode4 + (c5542l != null ? c5542l.hashCode() : 0)) * 37, 37, this.f19437l);
        this.f23747l = iHashCode5;
        return iHashCode5;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("taken_at=" + this.f19433l);
        arrayList.add("bugreportType=" + this.f19432l);
        C15589l c15589l = this.f19436l;
        if (c15589l != null) {
            arrayList.add("application=" + c15589l);
        }
        C18482l c18482l = this.f19429l;
        if (c18482l != null) {
            arrayList.add("device=" + c18482l);
        }
        AbstractC9029l.pro(this.f19430l, "exception_thread_name=", arrayList);
        C17937l c17937l = this.f19435l;
        if (c17937l != null) {
            arrayList.add("exception=" + c17937l);
        }
        C5542l c5542l = this.f19431l;
        if (c5542l != null) {
            arrayList.add("logcat=" + c5542l);
        }
        List list = this.f19437l;
        if (!list.isEmpty()) {
            arrayList.add("threads=" + list);
        }
        Map map = this.f19434l;
        if (!map.isEmpty()) {
            arrayList.add("custom_attributes=" + map);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "OrbitCoreBugReport{", "}", null, 56);
    }
}
