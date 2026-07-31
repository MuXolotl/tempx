package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙۜۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6771l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C17243l f14190l = new C17243l(3, AbstractC18202l.yandex.loadAd(C6771l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f14191l;

    public C6771l(C3844l c3844l, String str) {
        super(f14190l, c3844l);
        this.f14191l = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6771l)) {
            return false;
        }
        C6771l c6771l = (C6771l) obj;
        return AbstractC8576l.yandex(yandex(), c6771l.yandex()) && AbstractC8576l.yandex(this.f14191l, c6771l.f14191l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f14191l.hashCode() + (yandex().hashCode() * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f14191l, "version_code=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "EmuiExtendedMetadata{", "}", null, 56);
    }
}
