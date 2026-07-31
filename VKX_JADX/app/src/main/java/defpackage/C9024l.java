package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٌۚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9024l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C12980l f18583l = new C12980l(3, AbstractC18202l.yandex.loadAd(C9024l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2729l f18584l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C15968l f18585l;

    public C9024l(C15968l c15968l, C2729l c2729l, C3844l c3844l) {
        super(f18583l, c3844l);
        this.f18585l = c15968l;
        this.f18584l = c2729l;
        if ((c15968l != null ? 1 : 0) + (c2729l != null ? 1 : 0) <= 1) {
            return;
        }
        C8339l.metrica("At most one of purchase, code_activation may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9024l)) {
            return false;
        }
        C9024l c9024l = (C9024l) obj;
        return AbstractC8576l.yandex(yandex(), c9024l.yandex()) && AbstractC8576l.yandex(this.f18585l, c9024l.f18585l) && AbstractC8576l.yandex(this.f18584l, c9024l.f18584l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        C15968l c15968l = this.f18585l;
        int iHashCode2 = (iHashCode + (c15968l != null ? c15968l.hashCode() : 0)) * 37;
        C2729l c2729l = this.f18584l;
        int iHashCode3 = iHashCode2 + (c2729l != null ? c2729l.hashCode() : 0);
        this.f23747l = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C15968l c15968l = this.f18585l;
        if (c15968l != null) {
            arrayList.add("purchase=" + c15968l);
        }
        C2729l c2729l = this.f18584l;
        if (c2729l != null) {
            arrayList.add("code_activation=" + c2729l);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "Entry{", "}", null, 56);
    }
}
