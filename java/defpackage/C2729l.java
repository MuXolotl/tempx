package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؔٚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2729l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C3814l f5921l = new C3814l(3, AbstractC18202l.yandex.loadAd(C2729l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final long f5922l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final long f5923l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f5924l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f5925l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final String f5926l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f5927l;

    public C2729l(long j, String str, boolean z, long j2, long j3, String str2, C3844l c3844l) {
        super(f5921l, c3844l);
        this.f5925l = j;
        this.f5924l = str;
        this.f5927l = z;
        this.f5922l = j2;
        this.f5923l = j3;
        this.f5926l = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2729l)) {
            return false;
        }
        C2729l c2729l = (C2729l) obj;
        return AbstractC8576l.yandex(yandex(), c2729l.yandex()) && this.f5925l == c2729l.f5925l && AbstractC8576l.yandex(this.f5924l, c2729l.f5924l) && this.f5927l == c2729l.f5927l && this.f5922l == c2729l.f5922l && this.f5923l == c2729l.f5923l && AbstractC8576l.yandex(this.f5926l, c2729l.f5926l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f5925l;
        int iAdvert = (AbstractC12589l.advert((iHashCode + ((int) (j ^ (j >>> 32)))) * 37, 37, this.f5924l) + (this.f5927l ? 1231 : 1237)) * 37;
        long j2 = this.f5922l;
        int i2 = (iAdvert + ((int) (j2 ^ (j2 >>> 32)))) * 37;
        long j3 = this.f5923l;
        int iHashCode2 = this.f5926l.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 37);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.f5925l);
        StringBuilder sbMetrica = AbstractC9029l.metrica(AbstractC9029l.vip(this.f5924l, "code=", arrayList, "is_used="), this.f5927l, arrayList, "acquisition_date=");
        sbMetrica.append(this.f5922l);
        arrayList.add(sbMetrica.toString());
        arrayList.add("activation_date=" + this.f5923l);
        AbstractC9029l.pro(this.f5926l, "product_title=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "CodeActivation{", "}", null, 56);
    }
}
