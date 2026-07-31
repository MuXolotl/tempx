package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًٟۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8188l extends AbstractC11904l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C13915l f17083l = new C13915l(3, AbstractC18202l.yandex.loadAd(C8188l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C18508l f17084l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final long f17085l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f17086l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f17087l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f17088l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final EnumC7878l f17089l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C4426l f17090l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Long f17091l;

    public C8188l(long j, String str, C4426l c4426l, C18508l c18508l, long j2, EnumC7878l enumC7878l, boolean z, Long l, C3844l c3844l) {
        super(f17083l, c3844l);
        this.f17088l = j;
        this.f17087l = str;
        this.f17090l = c4426l;
        this.f17084l = c18508l;
        this.f17085l = j2;
        this.f17089l = enumC7878l;
        this.f17086l = z;
        this.f17091l = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8188l)) {
            return false;
        }
        C8188l c8188l = (C8188l) obj;
        return AbstractC8576l.yandex(yandex(), c8188l.yandex()) && this.f17088l == c8188l.f17088l && AbstractC8576l.yandex(this.f17087l, c8188l.f17087l) && AbstractC8576l.yandex(this.f17090l, c8188l.f17090l) && AbstractC8576l.yandex(this.f17084l, c8188l.f17084l) && this.f17085l == c8188l.f17085l && this.f17089l == c8188l.f17089l && this.f17086l == c8188l.f17086l && AbstractC8576l.yandex(this.f17091l, c8188l.f17091l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f17088l;
        int iAdvert = AbstractC12589l.advert((iHashCode + ((int) (j ^ (j >>> 32)))) * 37, 37, this.f17087l);
        C4426l c4426l = this.f17090l;
        int iHashCode2 = (iAdvert + (c4426l != null ? c4426l.hashCode() : 0)) * 37;
        C18508l c18508l = this.f17084l;
        int iHashCode3 = c18508l != null ? c18508l.hashCode() : 0;
        long j2 = this.f17085l;
        int iHashCode4 = (((this.f17089l.hashCode() + ((((iHashCode2 + iHashCode3) * 37) + ((int) ((j2 >>> 32) ^ j2))) * 37)) * 37) + (this.f17086l ? 1231 : 1237)) * 37;
        Long l = this.f17091l;
        int iHashCode5 = iHashCode4 + (l != null ? l.hashCode() : 0);
        this.f23747l = iHashCode5;
        return iHashCode5;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.f17088l);
        AbstractC9029l.pro(this.f17087l, "title=", arrayList);
        C4426l c4426l = this.f17090l;
        if (c4426l != null) {
            arrayList.add("content=" + c4426l);
        }
        C18508l c18508l = this.f17084l;
        if (c18508l != null) {
            arrayList.add("action=" + c18508l);
        }
        arrayList.add("date=" + this.f17085l);
        arrayList.add("topic=" + this.f17089l);
        AbstractC9029l.ad(new StringBuilder("is_important="), this.f17086l, arrayList);
        Long l = this.f17091l;
        if (l != null) {
            arrayList.add("expiry_date=" + l);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "InboxMessage{", "}", null, 56);
    }
}
