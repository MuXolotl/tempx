package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lَ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18364l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C2102l f35874l = new C2102l(3, AbstractC18202l.yandex.loadAd(C18364l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f35875l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final List f35876l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f35877l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f35878l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f35879l;

    public C18364l(boolean z, boolean z2, int i, int i2, List list, C3844l c3844l) {
        super(f35874l, c3844l);
        this.f35878l = z;
        this.f35877l = z2;
        this.f35879l = i;
        this.f35875l = i2;
        this.f35876l = AbstractC13457l.purchase("bands", list);
    }

    public static C18364l loadAd(C18364l c18364l, boolean z, boolean z2, int i, int i2, ArrayList arrayList, int i3) {
        if ((i3 & 1) != 0) {
            z = c18364l.f35878l;
        }
        boolean z3 = z;
        if ((i3 & 2) != 0) {
            z2 = c18364l.f35877l;
        }
        boolean z4 = z2;
        if ((i3 & 4) != 0) {
            i = c18364l.f35879l;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = c18364l.f35875l;
        }
        int i5 = i2;
        List list = arrayList;
        if ((i3 & 16) != 0) {
            list = c18364l.f35876l;
        }
        C3844l c3844lYandex = c18364l.yandex();
        c18364l.getClass();
        return new C18364l(z3, z4, i4, i5, list, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18364l)) {
            return false;
        }
        C18364l c18364l = (C18364l) obj;
        return AbstractC8576l.yandex(yandex(), c18364l.yandex()) && this.f35878l == c18364l.f35878l && this.f35877l == c18364l.f35877l && this.f35879l == c18364l.f35879l && this.f35875l == c18364l.f35875l && AbstractC8576l.yandex(this.f35876l, c18364l.f35876l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f35876l.hashCode() + (((((((((yandex().hashCode() * 37) + (this.f35878l ? 1231 : 1237)) * 37) + (this.f35877l ? 1231 : 1237)) * 37) + this.f35879l) * 37) + this.f35875l) * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbMetrica = AbstractC9029l.metrica(AbstractC9029l.metrica(new StringBuilder("enabled="), this.f35878l, arrayList, "advanced_mode="), this.f35877l, arrayList, "easy_bass_boost_value=");
        sbMetrica.append(this.f35879l);
        arrayList.add(sbMetrica.toString());
        arrayList.add("easy_treble_boost_value=" + this.f35875l);
        List list = this.f35876l;
        if (!list.isEmpty()) {
            arrayList.add("bands=" + list);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "Compressor{", "}", null, 56);
    }
}
