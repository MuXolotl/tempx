package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٕٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15697l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C14175l f30835l = new C14175l(3, AbstractC18202l.yandex.loadAd(C15697l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f30836l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f30837l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final EnumC1177l f30838l;

    public C15697l(boolean z, int i, EnumC1177l enumC1177l, C3844l c3844l) {
        super(f30835l, c3844l);
        this.f30837l = z;
        this.f30836l = i;
        this.f30838l = enumC1177l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15697l)) {
            return false;
        }
        C15697l c15697l = (C15697l) obj;
        return AbstractC8576l.yandex(yandex(), c15697l.yandex()) && this.f30837l == c15697l.f30837l && this.f30836l == c15697l.f30836l && this.f30838l == c15697l.f30838l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f30838l.hashCode() + (((((yandex().hashCode() * 37) + (this.f30837l ? 1231 : 1237)) * 37) + this.f30836l) * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbMetrica = AbstractC9029l.metrica(new StringBuilder("enabled="), this.f30837l, arrayList, "duration_msec=");
        sbMetrica.append(this.f30836l);
        arrayList.add(sbMetrica.toString());
        arrayList.add("curve=" + this.f30838l);
        return AbstractC16901l.m4210case(arrayList, ", ", "Crossfade{", "}", null, 56);
    }
}
