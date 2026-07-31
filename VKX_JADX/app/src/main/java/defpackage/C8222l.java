package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًۘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8222l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C9266l f17120l = new C9266l(3, AbstractC18202l.yandex.loadAd(C8222l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final List f17121l;

    public C8222l(ArrayList arrayList, C3844l c3844l) {
        super(f17120l, c3844l);
        this.f17121l = AbstractC13457l.purchase("changelogs", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8222l)) {
            return false;
        }
        C8222l c8222l = (C8222l) obj;
        return AbstractC8576l.yandex(yandex(), c8222l.yandex()) && AbstractC8576l.yandex(this.f17121l, c8222l.f17121l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f17121l.hashCode() + (yandex().hashCode() * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.f17121l;
        if (!list.isEmpty()) {
            arrayList.add("changelogs=" + list);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "QueryChangelogResponse{", "}", null, 56);
    }
}
