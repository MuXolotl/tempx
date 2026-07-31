package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lِؗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11656l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C13045l f23372l = new C13045l(3, AbstractC18202l.yandex.loadAd(C11656l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f23373l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f23374l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f23375l;

    public C11656l(String str, long j, String str2, C3844l c3844l) {
        super(f23372l, c3844l);
        this.f23374l = str;
        this.f23373l = j;
        this.f23375l = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11656l)) {
            return false;
        }
        C11656l c11656l = (C11656l) obj;
        return AbstractC8576l.yandex(yandex(), c11656l.yandex()) && AbstractC8576l.yandex(this.f23374l, c11656l.f23374l) && this.f23373l == c11656l.f23373l && AbstractC8576l.yandex(this.f23375l, c11656l.f23375l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdvert = AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f23374l);
        long j = this.f23373l;
        int iHashCode = this.f23375l.hashCode() + ((iAdvert + ((int) (j ^ (j >>> 32)))) * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbVip = AbstractC9029l.vip(this.f23374l, "bundle_name=", arrayList, "vk_account_id=");
        sbVip.append(this.f23373l);
        arrayList.add(sbVip.toString());
        AbstractC9029l.pro(this.f23375l, "vk_author_name=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "ShareInformation{", "}", null, 56);
    }
}
