package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٌؘؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8592l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C0017l f17707l = new C0017l(3, AbstractC18202l.yandex.loadAd(C8592l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f17708l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f17709l;

    public C8592l(int i, int i2, C3844l c3844l) {
        super(f17707l, c3844l);
        this.f17709l = i;
        this.f17708l = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8592l)) {
            return false;
        }
        C8592l c8592l = (C8592l) obj;
        return AbstractC8576l.yandex(yandex(), c8592l.yandex()) && this.f17709l == c8592l.f17709l && this.f17708l == c8592l.f17708l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((yandex().hashCode() * 37) + this.f17709l) * 37) + this.f17708l;
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("host_ip=" + this.f17709l);
        arrayList.add("host_port=" + this.f17708l);
        return AbstractC16901l.m4210case(arrayList, ", ", "IacAuthorizationDeeplink{", "}", null, 56);
    }
}
