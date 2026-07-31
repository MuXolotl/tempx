package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lَۡ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10638l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C1095l f21586l = new C1095l(3, AbstractC18202l.yandex.loadAd(C10638l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final List f21587l;

    public C10638l(ArrayList arrayList, C3844l c3844l) {
        super(f21586l, c3844l);
        this.f21587l = AbstractC13457l.purchase("entries", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10638l)) {
            return false;
        }
        C10638l c10638l = (C10638l) obj;
        return AbstractC8576l.yandex(yandex(), c10638l.yandex()) && AbstractC8576l.yandex(this.f21587l, c10638l.f21587l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f21587l.hashCode() + (yandex().hashCode() * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.f21587l;
        if (!list.isEmpty()) {
            arrayList.add("entries=" + list);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "QueryBillingHistoryResponse{", "}", null, 56);
    }
}
