package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚؚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7117l extends AbstractC11904l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C2850l f14902l = new C2850l(3, AbstractC18202l.yandex.loadAd(C7117l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final float f14903l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final float f14904l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final float f14905l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f14906l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f14907l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final float f14908l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final float f14909l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final float f14910l;

    public C7117l(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, C3844l c3844l) {
        super(f14902l, c3844l);
        this.f14907l = f;
        this.f14906l = f2;
        this.f14909l = f3;
        this.f14903l = f4;
        this.f14904l = f5;
        this.f14908l = f6;
        this.f14905l = f7;
        this.f14910l = f8;
    }

    public static C7117l loadAd(C7117l c7117l, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        if ((i & 1) != 0) {
            f = c7117l.f14907l;
        }
        float f9 = f;
        if ((i & 2) != 0) {
            f2 = c7117l.f14906l;
        }
        float f10 = f2;
        if ((i & 4) != 0) {
            f3 = c7117l.f14909l;
        }
        float f11 = f3;
        if ((i & 8) != 0) {
            f4 = c7117l.f14903l;
        }
        float f12 = f4;
        if ((i & 16) != 0) {
            f5 = c7117l.f14904l;
        }
        float f13 = f5;
        float f14 = (i & 32) != 0 ? c7117l.f14908l : f6;
        float f15 = (i & 64) != 0 ? c7117l.f14905l : f7;
        float f16 = (i & 128) != 0 ? c7117l.f14910l : f8;
        C3844l c3844lYandex = c7117l.yandex();
        c7117l.getClass();
        return new C7117l(f9, f10, f11, f12, f13, f14, f15, f16, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7117l)) {
            return false;
        }
        C7117l c7117l = (C7117l) obj;
        return AbstractC8576l.yandex(yandex(), c7117l.yandex()) && this.f14907l == c7117l.f14907l && this.f14906l == c7117l.f14906l && this.f14909l == c7117l.f14909l && this.f14903l == c7117l.f14903l && this.f14904l == c7117l.f14904l && this.f14908l == c7117l.f14908l && this.f14905l == c7117l.f14905l && this.f14910l == c7117l.f14910l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iFloatToIntBits = Float.floatToIntBits(this.f14910l) + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(yandex().hashCode() * 37, this.f14907l, 37), this.f14906l, 37), this.f14909l, 37), this.f14903l, 37), this.f14904l, 37), this.f14908l, 37), this.f14905l, 37);
        this.f23747l = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cutoff_frequency=" + this.f14907l);
        arrayList.add("attack_time=" + this.f14906l);
        arrayList.add("release_time=" + this.f14909l);
        arrayList.add("ratio=" + this.f14903l);
        arrayList.add("threshold=" + this.f14904l);
        arrayList.add("noise_gate_threshold=" + this.f14908l);
        arrayList.add("expander_ratio=" + this.f14905l);
        arrayList.add("post_gain=" + this.f14910l);
        return AbstractC16901l.m4210case(arrayList, ", ", "Band{", "}", null, 56);
    }

    public /* synthetic */ C7117l(float f, float f2, float f3, float f4) {
        this(f, 3.0f, 80.0f, f2, f3, -90.0f, 1.0f, f4, C3844l.f7950l);
    }
}
