package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٟ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17642l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C10880l f34327l = new C10880l(3, AbstractC18202l.yandex.loadAd(C17642l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f34328l;

    public C17642l(long j, C3844l c3844l) {
        super(f34327l, c3844l);
        this.f34328l = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17642l)) {
            return false;
        }
        C17642l c17642l = (C17642l) obj;
        return AbstractC8576l.yandex(yandex(), c17642l.yandex()) && this.f34328l == c17642l.f34328l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f34328l;
        int i2 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.f23747l = i2;
        return i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("date=" + this.f34328l);
        return AbstractC16901l.m4210case(arrayList, ", ", "InboxSetReadDateRequest{", "}", null, 56);
    }
}
