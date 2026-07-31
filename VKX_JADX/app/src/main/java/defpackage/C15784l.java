package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٕٛؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15784l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C1690l f30993l = new C1690l(3, AbstractC18202l.yandex.loadAd(C15784l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f30994l;

    public C15784l(C3844l c3844l, String str) {
        super(f30993l, c3844l);
        this.f30994l = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15784l)) {
            return false;
        }
        C15784l c15784l = (C15784l) obj;
        return AbstractC8576l.yandex(yandex(), c15784l.yandex()) && AbstractC8576l.yandex(this.f30994l, c15784l.f30994l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f30994l.hashCode() + (yandex().hashCode() * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f30994l, "code=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "CodeActivateRequest{", "}", null, 56);
    }
}
