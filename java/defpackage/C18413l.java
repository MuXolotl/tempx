package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٍٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18413l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C5679l f35957l = new C5679l(3, AbstractC18202l.yandex.loadAd(C18413l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f35958l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f35959l;

    public C18413l(String str, String str2, C3844l c3844l) {
        super(f35957l, c3844l);
        this.f35959l = str;
        this.f35958l = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18413l)) {
            return false;
        }
        C18413l c18413l = (C18413l) obj;
        return AbstractC8576l.yandex(yandex(), c18413l.yandex()) && AbstractC8576l.yandex(this.f35959l, c18413l.f35959l) && AbstractC8576l.yandex(this.f35958l, c18413l.f35958l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f35958l.hashCode() + AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f35959l);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f35959l, "major_version=", arrayList);
        AbstractC9029l.pro(this.f35958l, "minor_version=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "OneUIExtendedMetadata{", "}", null, 56);
    }
}
