package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٕ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15744l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C14933l f30925l = new C14933l(3, AbstractC18202l.yandex.loadAd(C15744l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f30926l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f30927l;

    public /* synthetic */ C15744l(float f, int i, boolean z) {
        this(z, (i & 2) != 0 ? 0.0f : f, C3844l.f7950l);
    }

    public static C15744l loadAd(C15744l c15744l, boolean z, float f, int i) {
        if ((i & 1) != 0) {
            z = c15744l.f30927l;
        }
        if ((i & 2) != 0) {
            f = c15744l.f30926l;
        }
        C3844l c3844lYandex = c15744l.yandex();
        c15744l.getClass();
        return new C15744l(z, f, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15744l)) {
            return false;
        }
        C15744l c15744l = (C15744l) obj;
        return AbstractC8576l.yandex(yandex(), c15744l.yandex()) && this.f30927l == c15744l.f30927l && this.f30926l == c15744l.f30926l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iFloatToIntBits = Float.floatToIntBits(this.f30926l) + (((yandex().hashCode() * 37) + (this.f30927l ? 1231 : 1237)) * 37);
        this.f23747l = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbMetrica = AbstractC9029l.metrica(new StringBuilder("enabled="), this.f30927l, arrayList, "value_=");
        sbMetrica.append(this.f30926l);
        arrayList.add(sbMetrica.toString());
        return AbstractC16901l.m4210case(arrayList, ", ", "LegacyEffect{", "}", null, 56);
    }

    public C15744l(boolean z, float f, C3844l c3844l) {
        super(f30925l, c3844l);
        this.f30927l = z;
        this.f30926l = f;
    }
}
