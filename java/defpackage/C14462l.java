package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٟٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14462l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C17380l f28329l = new C17380l(3, AbstractC18202l.yandex.loadAd(C14462l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f28330l;

    public C14462l(C3844l c3844l, String str) {
        super(f28329l, c3844l);
        this.f28330l = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14462l)) {
            return false;
        }
        C14462l c14462l = (C14462l) obj;
        return AbstractC8576l.yandex(yandex(), c14462l.yandex()) && AbstractC8576l.yandex(this.f28330l, c14462l.f28330l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f28330l.hashCode() + (yandex().hashCode() * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f28330l, "url=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "PaymentBuildUrlResponse{", "}", null, 56);
    }
}
