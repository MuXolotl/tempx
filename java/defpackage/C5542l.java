package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًؘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5542l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C13838l f11822l = new C13838l(3, AbstractC18202l.yandex.loadAd(C5542l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final List f11823l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C15589l f11824l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f11825l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C18482l f11826l;

    public C5542l(long j, C15589l c15589l, C18482l c18482l, ArrayList arrayList, C3844l c3844l) {
        super(f11822l, c3844l);
        this.f11825l = j;
        this.f11824l = c15589l;
        this.f11826l = c18482l;
        this.f11823l = AbstractC13457l.purchase("lines", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5542l)) {
            return false;
        }
        C5542l c5542l = (C5542l) obj;
        return AbstractC8576l.yandex(yandex(), c5542l.yandex()) && this.f11825l == c5542l.f11825l && AbstractC8576l.yandex(this.f11824l, c5542l.f11824l) && AbstractC8576l.yandex(this.f11826l, c5542l.f11826l) && AbstractC8576l.yandex(this.f11823l, c5542l.f11823l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f11825l;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 37;
        C15589l c15589l = this.f11824l;
        int iHashCode2 = (i2 + (c15589l != null ? c15589l.hashCode() : 0)) * 37;
        C18482l c18482l = this.f11826l;
        int iHashCode3 = this.f11823l.hashCode() + ((iHashCode2 + (c18482l != null ? c18482l.hashCode() : 0)) * 37);
        this.f23747l = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("start_time=" + this.f11825l);
        C15589l c15589l = this.f11824l;
        if (c15589l != null) {
            arrayList.add("application=" + c15589l);
        }
        C18482l c18482l = this.f11826l;
        if (c18482l != null) {
            arrayList.add("device=" + c18482l);
        }
        List list = this.f11823l;
        if (!list.isEmpty()) {
            arrayList.add("lines=" + list);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "OrbitCoreLogcat{", "}", null, 56);
    }
}
