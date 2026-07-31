package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؓٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1887l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C6888l f4312l = new C6888l(3, AbstractC18202l.yandex.loadAd(C1887l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final float f4313l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final float f4314l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f4315l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f4316l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final float f4317l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final float f4318l;

    public C1887l(boolean z, float f, float f2, float f3, float f4, float f5, C3844l c3844l) {
        super(f4312l, c3844l);
        this.f4316l = z;
        this.f4315l = f;
        this.f4318l = f2;
        this.f4313l = f3;
        this.f4314l = f4;
        this.f4317l = f5;
    }

    public static C1887l loadAd(C1887l c1887l, boolean z, float f, float f2, float f3, float f4, float f5, int i) {
        if ((i & 1) != 0) {
            z = c1887l.f4316l;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            f = c1887l.f4315l;
        }
        float f6 = f;
        if ((i & 4) != 0) {
            f2 = c1887l.f4318l;
        }
        float f7 = f2;
        if ((i & 8) != 0) {
            f3 = c1887l.f4313l;
        }
        float f8 = f3;
        if ((i & 16) != 0) {
            f4 = c1887l.f4314l;
        }
        float f9 = f4;
        if ((i & 32) != 0) {
            f5 = c1887l.f4317l;
        }
        C3844l c3844lYandex = c1887l.yandex();
        c1887l.getClass();
        return new C1887l(z2, f6, f7, f8, f9, f5, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1887l)) {
            return false;
        }
        C1887l c1887l = (C1887l) obj;
        return AbstractC8576l.yandex(yandex(), c1887l.yandex()) && this.f4316l == c1887l.f4316l && this.f4315l == c1887l.f4315l && this.f4318l == c1887l.f4318l && this.f4313l == c1887l.f4313l && this.f4314l == c1887l.f4314l && this.f4317l == c1887l.f4317l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iFloatToIntBits = Float.floatToIntBits(this.f4317l) + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(((yandex().hashCode() * 37) + (this.f4316l ? 1231 : 1237)) * 37, this.f4315l, 37), this.f4318l, 37), this.f4313l, 37), this.f4314l, 37);
        this.f23747l = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbMetrica = AbstractC9029l.metrica(new StringBuilder("enabled="), this.f4316l, arrayList, "attack_time=");
        sbMetrica.append(this.f4315l);
        arrayList.add(sbMetrica.toString());
        arrayList.add("release_time=" + this.f4318l);
        arrayList.add("ratio=" + this.f4313l);
        arrayList.add("threshold=" + this.f4314l);
        arrayList.add("post_gain=" + this.f4317l);
        return AbstractC16901l.m4210case(arrayList, ", ", "Limiter{", "}", null, 56);
    }
}
