package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lَۣؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10036l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C0356l f20456l = new C0356l(3, AbstractC18202l.yandex.loadAd(C10036l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f20457l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C11193l f20458l;

    public C10036l(C11193l c11193l, boolean z, C3844l c3844l) {
        super(f20456l, c3844l);
        this.f20458l = c11193l;
        this.f20457l = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10036l)) {
            return false;
        }
        C10036l c10036l = (C10036l) obj;
        return AbstractC8576l.yandex(yandex(), c10036l.yandex()) && AbstractC8576l.yandex(this.f20458l, c10036l.f20458l) && this.f20457l == c10036l.f20457l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        C11193l c11193l = this.f20458l;
        int iHashCode2 = ((iHashCode + (c11193l != null ? c11193l.hashCode() : 0)) * 37) + (this.f20457l ? 1231 : 1237);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C11193l c11193l = this.f20458l;
        if (c11193l != null) {
            arrayList.add("page=" + c11193l);
        }
        AbstractC9029l.ad(new StringBuilder("return_codes="), this.f20457l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "QueryBillingHistoryRequest{", "}", null, 56);
    }
}
