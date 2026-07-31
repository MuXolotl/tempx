package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؔۥۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3039l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C12012l f6555l = new C12012l(3, AbstractC18202l.yandex.loadAd(C3039l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f6556l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f6557l;

    public C3039l(int i, String str, C3844l c3844l) {
        super(f6555l, c3844l);
        this.f6557l = i;
        this.f6556l = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3039l)) {
            return false;
        }
        C3039l c3039l = (C3039l) obj;
        return AbstractC8576l.yandex(yandex(), c3039l.yandex()) && this.f6557l == c3039l.f6557l && AbstractC8576l.yandex(this.f6556l, c3039l.f6556l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f6556l.hashCode() + (((yandex().hashCode() * 37) + this.f6557l) * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("code=" + this.f6557l);
        AbstractC9029l.pro(this.f6556l, "message=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "SparkErrorResponse{", "}", null, 56);
    }
}
