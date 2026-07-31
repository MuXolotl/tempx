package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؘؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4700l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C13638l f9548l = new C13638l(3, AbstractC18202l.yandex.loadAd(C4700l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f9549l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f9550l;

    public C4700l(boolean z, int i, C3844l c3844l) {
        super(f9548l, c3844l);
        this.f9550l = z;
        this.f9549l = i;
    }

    public static C4700l loadAd(C4700l c4700l, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = c4700l.f9550l;
        }
        if ((i2 & 2) != 0) {
            i = c4700l.f9549l;
        }
        C3844l c3844lYandex = c4700l.yandex();
        c4700l.getClass();
        return new C4700l(z, i, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4700l)) {
            return false;
        }
        C4700l c4700l = (C4700l) obj;
        return AbstractC8576l.yandex(yandex(), c4700l.yandex()) && this.f9550l == c4700l.f9550l && this.f9549l == c4700l.f9549l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((yandex().hashCode() * 37) + (this.f9550l ? 1231 : 1237)) * 37) + this.f9549l;
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbMetrica = AbstractC9029l.metrica(new StringBuilder("enable_crossfade="), this.f9550l, arrayList, "enable_crossfade_seconds=");
        sbMetrica.append(this.f9549l);
        arrayList.add(sbMetrica.toString());
        return AbstractC16901l.m4210case(arrayList, ", ", "VkxPlaybackPreferences{", "}", null, 56);
    }
}
