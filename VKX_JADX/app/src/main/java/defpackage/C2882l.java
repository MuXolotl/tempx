package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؔۙۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2882l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C4382l f6278l = new C4382l(3, AbstractC18202l.yandex.loadAd(C2882l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f6279l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f6280l;

    public C2882l(float f, float f2, C3844l c3844l) {
        super(f6278l, c3844l);
        this.f6280l = f;
        this.f6279l = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2882l)) {
            return false;
        }
        C2882l c2882l = (C2882l) obj;
        return AbstractC8576l.yandex(yandex(), c2882l.yandex()) && this.f6280l == c2882l.f6280l && this.f6279l == c2882l.f6279l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iFloatToIntBits = Float.floatToIntBits(this.f6279l) + AbstractC9029l.mopub(yandex().hashCode() * 37, this.f6280l, 37);
        this.f23747l = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cutoff_frequency=" + this.f6280l);
        arrayList.add("gain=" + this.f6279l);
        return AbstractC16901l.m4210case(arrayList, ", ", "Band{", "}", null, 56);
    }

    public /* synthetic */ C2882l(float f, float f2) {
        this(f, f2, C3844l.f7950l);
    }
}
