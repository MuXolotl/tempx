package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lّۗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12788l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C18259l f25163l = new C18259l(3, AbstractC18202l.yandex.loadAd(C12788l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f25164l;

    public C12788l(boolean z, C3844l c3844l) {
        super(f25163l, c3844l);
        this.f25164l = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12788l)) {
            return false;
        }
        C12788l c12788l = (C12788l) obj;
        return AbstractC8576l.yandex(yandex(), c12788l.yandex()) && this.f25164l == c12788l.f25164l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = (yandex().hashCode() * 37) + (this.f25164l ? 1231 : 1237);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.ad(new StringBuilder("success="), this.f25164l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "IacAuthorizationFinishSessionResponse{", "}", null, 56);
    }
}
