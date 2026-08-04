package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙۣؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6170l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C5087l f13007l = new C5087l(3, AbstractC18202l.yandex.loadAd(C6170l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f13008l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f13009l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f13010l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f13011l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f13012l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f13013l;

    public C6170l(long j, long j2, String str, String str2, String str3, boolean z, C3844l c3844l) {
        super(f13007l, c3844l);
        this.f13011l = j;
        this.f13010l = j2;
        this.f13013l = str;
        this.f13008l = str2;
        this.f13009l = str3;
        this.f13012l = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6170l)) {
            return false;
        }
        C6170l c6170l = (C6170l) obj;
        return AbstractC8576l.yandex(yandex(), c6170l.yandex()) && this.f13011l == c6170l.f13011l && this.f13010l == c6170l.f13010l && AbstractC8576l.yandex(this.f13013l, c6170l.f13013l) && AbstractC8576l.yandex(this.f13008l, c6170l.f13008l) && AbstractC8576l.yandex(this.f13009l, c6170l.f13009l) && this.f13012l == c6170l.f13012l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f13011l;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 37;
        long j2 = this.f13010l;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 37;
        String str = this.f13013l;
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert((i3 + (str != null ? str.hashCode() : 0)) * 37, 37, this.f13008l), 37, this.f13009l) + (this.f13012l ? 1231 : 1237);
        this.f23747l = iAdvert;
        return iAdvert;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.f13011l);
        arrayList.add("owner_id=" + this.f13010l);
        String str = this.f13013l;
        if (str != null) {
            AbstractC9029l.pro(str, "access_key=", arrayList);
        }
        AbstractC9029l.pro(this.f13008l, "name=", arrayList);
        AbstractC9029l.ad(AbstractC9029l.vip(this.f13009l, "artwork_preview=", arrayList, "cached="), this.f13012l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "PlaylistSource{", "}", null, 56);
    }
}
