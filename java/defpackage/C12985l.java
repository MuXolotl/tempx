package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lّۦؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12985l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C14252l f25449l = new C14252l(3, AbstractC18202l.yandex.loadAd(C12985l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Long f25450l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f25451l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final EnumC13392l f25452l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f25453l;

    public C12985l(EnumC13392l enumC13392l, String str, String str2, Long l, C3844l c3844l) {
        super(f25449l, c3844l);
        this.f25452l = enumC13392l;
        this.f25451l = str;
        this.f25453l = str2;
        this.f25450l = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12985l)) {
            return false;
        }
        C12985l c12985l = (C12985l) obj;
        return AbstractC8576l.yandex(yandex(), c12985l.yandex()) && this.f25452l == c12985l.f25452l && AbstractC8576l.yandex(this.f25451l, c12985l.f25451l) && AbstractC8576l.yandex(this.f25453l, c12985l.f25453l) && AbstractC8576l.yandex(this.f25450l, c12985l.f25450l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = (this.f25452l.hashCode() + (yandex().hashCode() * 37)) * 37;
        String str = this.f25451l;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f25453l;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.f25450l;
        int iHashCode4 = iHashCode3 + (l != null ? l.hashCode() : 0);
        this.f23747l = iHashCode4;
        return iHashCode4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("result=" + this.f25452l);
        String str = this.f25451l;
        if (str != null) {
            AbstractC9029l.pro(str, "product_id=", arrayList);
        }
        String str2 = this.f25453l;
        if (str2 != null) {
            AbstractC9029l.pro(str2, "product_name=", arrayList);
        }
        Long l = this.f25450l;
        if (l != null) {
            arrayList.add("product_expires_at=" + l);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "CodeActivateResponse{", "}", null, 56);
    }
}
