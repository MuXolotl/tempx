package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lُٟٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11193l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C7187l f22546l = new C7187l(3, AbstractC18202l.yandex.loadAd(C11193l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f22547l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f22548l;

    public C11193l(int i, int i2, C3844l c3844l) {
        super(f22546l, c3844l);
        this.f22548l = i;
        this.f22547l = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11193l)) {
            return false;
        }
        C11193l c11193l = (C11193l) obj;
        return AbstractC8576l.yandex(yandex(), c11193l.yandex()) && this.f22548l == c11193l.f22548l && this.f22547l == c11193l.f22547l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((yandex().hashCode() * 37) + this.f22548l) * 37) + this.f22547l;
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count=" + this.f22548l);
        arrayList.add("offset=" + this.f22547l);
        return AbstractC16901l.m4210case(arrayList, ", ", "SparkPaging{", "}", null, 56);
    }

    public /* synthetic */ C11193l(int i, int i2) {
        this(i, i2, C3844l.f7950l);
    }
}
