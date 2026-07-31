package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٖؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16210l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C14962l f31719l = new C14962l(3, AbstractC18202l.yandex.loadAd(C16210l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C3844l f31720l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C18031l f31721l;

    public C16210l(C18031l c18031l, C3844l c3844l, C3844l c3844l2) {
        super(f31719l, c3844l2);
        this.f31721l = c18031l;
        this.f31720l = c3844l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16210l)) {
            return false;
        }
        C16210l c16210l = (C16210l) obj;
        return AbstractC8576l.yandex(yandex(), c16210l.yandex()) && AbstractC8576l.yandex(this.f31721l, c16210l.f31721l) && AbstractC8576l.yandex(this.f31720l, c16210l.f31720l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        C18031l c18031l = this.f31721l;
        int iHashCode2 = this.f31720l.hashCode() + ((iHashCode + (c18031l != null ? c18031l.hashCode() : 0)) * 37);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C18031l c18031l = this.f31721l;
        if (c18031l != null) {
            arrayList.add("tag=" + c18031l);
        }
        arrayList.add("obj=" + this.f31720l);
        return AbstractC16901l.m4210case(arrayList, ", ", "IacAuthorizationFinishSession{", "}", null, 56);
    }
}
