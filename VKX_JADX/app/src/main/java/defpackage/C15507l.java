package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؘٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15507l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C12274l f30306l = new C12274l(3, AbstractC18202l.yandex.loadAd(C15507l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f30307l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final EnumC6418l f30308l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f30309l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f30310l;

    public C15507l(long j, EnumC6418l enumC6418l, String str, String str2, C3844l c3844l) {
        super(f30306l, c3844l);
        this.f30309l = j;
        this.f30308l = enumC6418l;
        this.f30310l = str;
        this.f30307l = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15507l)) {
            return false;
        }
        C15507l c15507l = (C15507l) obj;
        return AbstractC8576l.yandex(yandex(), c15507l.yandex()) && this.f30309l == c15507l.f30309l && this.f30308l == c15507l.f30308l && AbstractC8576l.yandex(this.f30310l, c15507l.f30310l) && AbstractC8576l.yandex(this.f30307l, c15507l.f30307l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f30309l;
        int iHashCode2 = this.f30307l.hashCode() + AbstractC12589l.advert((this.f30308l.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 37)) * 37, 37, this.f30310l);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("time=" + this.f30309l);
        arrayList.add("severity=" + this.f30308l);
        AbstractC9029l.pro(this.f30310l, "tag=", arrayList);
        AbstractC9029l.pro(this.f30307l, "message=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "Line{", "}", null, 56);
    }
}
