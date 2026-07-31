package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؑٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0318l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C9170l f1363l = new C9170l(3, AbstractC18202l.yandex.loadAd(C0318l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f1364l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f1365l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f1366l;

    public C0318l(String str, String str2, String str3, C3844l c3844l) {
        super(f1363l, c3844l);
        this.f1365l = str;
        this.f1364l = str2;
        this.f1366l = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0318l)) {
            return false;
        }
        C0318l c0318l = (C0318l) obj;
        return AbstractC8576l.yandex(yandex(), c0318l.yandex()) && AbstractC8576l.yandex(this.f1365l, c0318l.f1365l) && AbstractC8576l.yandex(this.f1364l, c0318l.f1364l) && AbstractC8576l.yandex(this.f1366l, c0318l.f1366l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f1366l.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f1365l), 37, this.f1364l);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f1365l, "version_name=", arrayList);
        AbstractC9029l.pro(this.f1364l, "version_code=", arrayList);
        AbstractC9029l.pro(this.f1366l, "version_incremental_code=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "MiuiExtendedMetadata{", "}", null, 56);
    }
}
