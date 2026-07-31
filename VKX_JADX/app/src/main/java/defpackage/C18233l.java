package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚ٘۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18233l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C2092l f35742l = new C2092l(3, AbstractC18202l.yandex.loadAd(C18233l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f35743l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final EnumC14435l f35744l;

    public C18233l(EnumC14435l enumC14435l, boolean z, C3844l c3844l) {
        super(f35742l, c3844l);
        this.f35744l = enumC14435l;
        this.f35743l = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18233l)) {
            return false;
        }
        C18233l c18233l = (C18233l) obj;
        return AbstractC8576l.yandex(yandex(), c18233l.yandex()) && this.f35744l == c18233l.f35744l && this.f35743l == c18233l.f35743l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.f35744l.hashCode() + (yandex().hashCode() * 37)) * 37) + (this.f35743l ? 1231 : 1237);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("provider=" + this.f35744l);
        AbstractC9029l.ad(new StringBuilder("enabled="), this.f35743l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "LyricsProviderConfig{", "}", null, 56);
    }
}
