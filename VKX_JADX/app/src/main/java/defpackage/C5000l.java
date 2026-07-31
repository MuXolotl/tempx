package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؗٛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5000l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C4359l f10235l = new C4359l(3, AbstractC18202l.yandex.loadAd(C5000l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final EnumC10564l f10236l;

    public C5000l(EnumC10564l enumC10564l, C3844l c3844l) {
        super(f10235l, c3844l);
        this.f10236l = enumC10564l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5000l)) {
            return false;
        }
        C5000l c5000l = (C5000l) obj;
        return AbstractC8576l.yandex(yandex(), c5000l.yandex()) && this.f10236l == c5000l.f10236l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f10236l.hashCode() + (yandex().hashCode() * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("product=" + this.f10236l);
        return AbstractC16901l.m4210case(arrayList, ", ", "ProductInformationRequest{", "}", null, 56);
    }
}
