package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7315l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C9017l f15167l = new C9017l(3, AbstractC18202l.yandex.loadAd(C7315l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final float f15168l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final float f15169l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f15170l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f15171l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f15172l;

    public C7315l(boolean z, boolean z2, boolean z3, float f, float f2, C3844l c3844l) {
        super(f15167l, c3844l);
        this.f15171l = z;
        this.f15170l = z2;
        this.f15172l = z3;
        this.f15168l = f;
        this.f15169l = f2;
    }

    public static C7315l loadAd(C7315l c7315l, boolean z, boolean z2, boolean z3, float f, float f2, int i) {
        if ((i & 1) != 0) {
            z = c7315l.f15171l;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = c7315l.f15170l;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = c7315l.f15172l;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            f = c7315l.f15168l;
        }
        float f3 = f;
        if ((i & 16) != 0) {
            f2 = c7315l.f15169l;
        }
        C3844l c3844lYandex = c7315l.yandex();
        c7315l.getClass();
        return new C7315l(z4, z5, z6, f3, f2, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7315l)) {
            return false;
        }
        C7315l c7315l = (C7315l) obj;
        return AbstractC8576l.yandex(yandex(), c7315l.yandex()) && this.f15171l == c7315l.f15171l && this.f15170l == c7315l.f15170l && this.f15172l == c7315l.f15172l && this.f15168l == c7315l.f15168l && this.f15169l == c7315l.f15169l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iFloatToIntBits = Float.floatToIntBits(this.f15169l) + AbstractC9029l.mopub(((((((yandex().hashCode() * 37) + (this.f15171l ? 1231 : 1237)) * 37) + (this.f15170l ? 1231 : 1237)) * 37) + (this.f15172l ? 1231 : 1237)) * 37, this.f15168l, 37);
        this.f23747l = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbMetrica = AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(new StringBuilder("enabled="), this.f15171l, arrayList, "use_automatic_gain_instead="), this.f15170l, arrayList, "use_lower_automatic_gain_factor="), this.f15172l, arrayList, "gain_left=");
        sbMetrica.append(this.f15168l);
        arrayList.add(sbMetrica.toString());
        arrayList.add("gain_right=" + this.f15169l);
        return AbstractC16901l.m4210case(arrayList, ", ", "Gain{", "}", null, 56);
    }

    public /* synthetic */ C7315l(boolean z, float f, float f2, int i) {
        this(true, z, false, f, f2, C3844l.f7950l);
    }
}
