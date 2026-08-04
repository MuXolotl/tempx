package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lۖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18508l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C10787l f36132l = new C10787l(3, AbstractC18202l.yandex.loadAd(C18508l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f36133l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final EnumC13595l f36134l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f36135l;

    public C18508l(EnumC13595l enumC13595l, String str, String str2, C3844l c3844l) {
        super(f36132l, c3844l);
        this.f36134l = enumC13595l;
        this.f36133l = str;
        this.f36135l = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18508l)) {
            return false;
        }
        C18508l c18508l = (C18508l) obj;
        return AbstractC8576l.yandex(yandex(), c18508l.yandex()) && this.f36134l == c18508l.f36134l && AbstractC8576l.yandex(this.f36133l, c18508l.f36133l) && AbstractC8576l.yandex(this.f36135l, c18508l.f36135l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f36135l.hashCode() + AbstractC12589l.advert((this.f36134l.hashCode() + (yandex().hashCode() * 37)) * 37, 37, this.f36133l);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.f36134l);
        AbstractC9029l.pro(this.f36133l, "title=", arrayList);
        AbstractC9029l.pro(this.f36135l, "data_=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "Action{", "}", null, 56);
    }
}
