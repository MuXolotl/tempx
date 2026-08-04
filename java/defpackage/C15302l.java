package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٔۥۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15302l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C16812l f29910l = new C16812l(3, AbstractC18202l.yandex.loadAd(C15302l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f29911l;

    public C15302l(int i, C3844l c3844l) {
        super(f29910l, c3844l);
        this.f29911l = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15302l)) {
            return false;
        }
        C15302l c15302l = (C15302l) obj;
        return AbstractC8576l.yandex(yandex(), c15302l.yandex()) && this.f29911l == c15302l.f29911l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = (yandex().hashCode() * 37) + this.f29911l;
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("error_code=" + this.f29911l);
        return AbstractC16901l.m4210case(arrayList, ", ", "IacGenericExceptionResponse{", "}", null, 56);
    }

    public /* synthetic */ C15302l(int i) {
        this(i, C3844l.f7950l);
    }
}
