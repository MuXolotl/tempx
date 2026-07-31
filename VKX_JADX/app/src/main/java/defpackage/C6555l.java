package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙٙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6555l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C3064l f13685l = new C3064l(3, AbstractC18202l.yandex.loadAd(C6555l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f13686l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f13687l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f13688l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f13689l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f13690l;

    public C6555l(int i, String str, long j, String str2, boolean z, C3844l c3844l) {
        super(f13685l, c3844l);
        this.f13689l = i;
        this.f13688l = str;
        this.f13690l = j;
        this.f13686l = str2;
        this.f13687l = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6555l)) {
            return false;
        }
        C6555l c6555l = (C6555l) obj;
        return AbstractC8576l.yandex(yandex(), c6555l.yandex()) && this.f13689l == c6555l.f13689l && AbstractC8576l.yandex(this.f13688l, c6555l.f13688l) && this.f13690l == c6555l.f13690l && AbstractC8576l.yandex(this.f13686l, c6555l.f13686l) && this.f13687l == c6555l.f13687l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdvert = AbstractC12589l.advert(((yandex().hashCode() * 37) + this.f13689l) * 37, 37, this.f13688l);
        long j = this.f13690l;
        int iAdvert2 = AbstractC12589l.advert((iAdvert + ((int) (j ^ (j >>> 32)))) * 37, 37, this.f13686l) + (this.f13687l ? 1231 : 1237);
        this.f23747l = iAdvert2;
        return iAdvert2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("version_code=" + this.f13689l);
        StringBuilder sbVip = AbstractC9029l.vip(this.f13688l, "version_name=", arrayList, "release_date=");
        sbVip.append(this.f13690l);
        arrayList.add(sbVip.toString());
        AbstractC9029l.ad(AbstractC9029l.vip(this.f13686l, "changelog=", arrayList, "is_beta="), this.f13687l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "ApplicationUpdateChangelog{", "}", null, 56);
    }
}
