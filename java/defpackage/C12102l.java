package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lِۚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12102l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C18320l f24048l = new C18320l(3, AbstractC18202l.yandex.loadAd(C12102l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C18031l f24049l;

    public C12102l(C18031l c18031l, C3844l c3844l) {
        super(f24048l, c3844l);
        this.f24049l = c18031l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12102l)) {
            return false;
        }
        C12102l c12102l = (C12102l) obj;
        return AbstractC8576l.yandex(yandex(), c12102l.yandex()) && AbstractC8576l.yandex(this.f24049l, c12102l.f24049l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        C18031l c18031l = this.f24049l;
        int iHashCode2 = iHashCode + (c18031l != null ? c18031l.hashCode() : 0);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C18031l c18031l = this.f24049l;
        if (c18031l != null) {
            arrayList.add("tag=" + c18031l);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "IacAuthorizationStartSession{", "}", null, 56);
    }
}
