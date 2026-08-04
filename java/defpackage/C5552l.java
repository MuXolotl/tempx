package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٌؘِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5552l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C12619l f11835l = new C12619l(3, AbstractC18202l.yandex.loadAd(C5552l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f11836l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C3844l f11837l;

    public C5552l(C3844l c3844l, int i, C3844l c3844l2) {
        super(f11835l, c3844l2);
        this.f11837l = c3844l;
        this.f11836l = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5552l)) {
            return false;
        }
        C5552l c5552l = (C5552l) obj;
        return AbstractC8576l.yandex(yandex(), c5552l.yandex()) && AbstractC8576l.yandex(this.f11837l, c5552l.f11837l) && this.f11836l == c5552l.f11836l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.f11837l.hashCode() + (yandex().hashCode() * 37)) * 37) + this.f11836l;
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("key=" + this.f11837l);
        arrayList.add("duration=" + this.f11836l);
        return AbstractC16901l.m4210case(arrayList, ", ", "IacAuthorizationStartSessionResponse{", "}", null, 56);
    }
}
