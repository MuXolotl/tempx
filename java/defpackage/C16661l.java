package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16661l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C9023l f32662l = new C9023l(3, AbstractC18202l.yandex.loadAd(C16661l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C11193l f32663l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final EnumC1428l f32664l;

    public C16661l(EnumC1428l enumC1428l, C11193l c11193l, C3844l c3844l) {
        super(f32662l, c3844l);
        this.f32664l = enumC1428l;
        this.f32663l = c11193l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16661l)) {
            return false;
        }
        C16661l c16661l = (C16661l) obj;
        return AbstractC8576l.yandex(yandex(), c16661l.yandex()) && this.f32664l == c16661l.f32664l && AbstractC8576l.yandex(this.f32663l, c16661l.f32663l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = (this.f32664l.hashCode() + (yandex().hashCode() * 37)) * 37;
        C11193l c11193l = this.f32663l;
        int iHashCode2 = iHashCode + (c11193l != null ? c11193l.hashCode() : 0);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.f32664l);
        C11193l c11193l = this.f32663l;
        if (c11193l != null) {
            arrayList.add("page=" + c11193l);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "QueryChangelogRequest{", "}", null, 56);
    }
}
