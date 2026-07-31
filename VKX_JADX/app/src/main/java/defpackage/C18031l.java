package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؘ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18031l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C17007l f35314l = new C17007l(3, AbstractC18202l.yandex.loadAd(C18031l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f35315l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f35316l;

    public C18031l(long j, String str, C3844l c3844l) {
        super(f35314l, c3844l);
        this.f35316l = j;
        this.f35315l = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18031l)) {
            return false;
        }
        C18031l c18031l = (C18031l) obj;
        return AbstractC8576l.yandex(yandex(), c18031l.yandex()) && this.f35316l == c18031l.f35316l && AbstractC8576l.yandex(this.f35315l, c18031l.f35315l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f35316l;
        int iHashCode2 = this.f35315l.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 37);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.f35316l);
        AbstractC9029l.pro(this.f35315l, "service=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "IacAuthAccountTag{", "}", null, 56);
    }
}
