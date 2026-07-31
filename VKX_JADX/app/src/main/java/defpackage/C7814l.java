package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًؘِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7814l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C6339l f16325l = new C6339l(3, AbstractC18202l.yandex.loadAd(C7814l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f16326l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f16327l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f16328l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f16329l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f16330l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final List f16331l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final long f16332l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f16333l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final EnumC3503l f16334l;

    public C7814l(boolean z, boolean z2, boolean z3, boolean z4, List list, String str, long j, boolean z5, EnumC3503l enumC3503l, C3844l c3844l) {
        super(f16325l, c3844l);
        this.f16330l = z;
        this.f16329l = z2;
        this.f16333l = z3;
        this.f16326l = z4;
        this.f16327l = str;
        this.f16332l = j;
        this.f16328l = z5;
        this.f16334l = enumC3503l;
        this.f16331l = AbstractC13457l.purchase("lyrics_chain_configuration", list);
    }

    public static C7814l loadAd(C7814l c7814l, ArrayList arrayList, String str, long j, EnumC3503l enumC3503l, int i) {
        boolean z = c7814l.f16330l;
        boolean z2 = c7814l.f16329l;
        boolean z3 = c7814l.f16333l;
        boolean z4 = c7814l.f16326l;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = c7814l.f16331l;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            str = c7814l.f16327l;
        }
        String str2 = str;
        long j2 = (i & 64) != 0 ? c7814l.f16332l : j;
        boolean z5 = c7814l.f16328l;
        EnumC3503l enumC3503l2 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c7814l.f16334l : enumC3503l;
        C3844l c3844lYandex = c7814l.yandex();
        c7814l.getClass();
        return new C7814l(z, z2, z3, z4, list2, str2, j2, z5, enumC3503l2, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7814l)) {
            return false;
        }
        C7814l c7814l = (C7814l) obj;
        return AbstractC8576l.yandex(yandex(), c7814l.yandex()) && this.f16330l == c7814l.f16330l && this.f16329l == c7814l.f16329l && this.f16333l == c7814l.f16333l && this.f16326l == c7814l.f16326l && AbstractC8576l.yandex(this.f16331l, c7814l.f16331l) && AbstractC8576l.yandex(this.f16327l, c7814l.f16327l) && this.f16332l == c7814l.f16332l && this.f16328l == c7814l.f16328l && this.f16334l == c7814l.f16334l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdvert = AbstractC12589l.advert(AbstractC14814l.admob(((((((((yandex().hashCode() * 37) + (this.f16330l ? 1231 : 1237)) * 37) + (this.f16329l ? 1231 : 1237)) * 37) + (this.f16333l ? 1231 : 1237)) * 37) + (this.f16326l ? 1231 : 1237)) * 37, 37, this.f16331l), 37, this.f16327l);
        long j = this.f16332l;
        int iHashCode = this.f16334l.hashCode() + ((((iAdvert + ((int) (j ^ (j >>> 32)))) * 37) + (this.f16328l ? 1231 : 1237)) * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.ad(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(new StringBuilder("enable_musixmatch_for_lyrics="), this.f16330l, arrayList, "enable_genius_for_lyrics="), this.f16329l, arrayList, "enable_vk_for_lyrics="), this.f16333l, arrayList, "enable_lrclib_for_lyrics="), this.f16326l, arrayList);
        List list = this.f16331l;
        if (!list.isEmpty()) {
            arrayList.add("lyrics_chain_configuration=" + list);
        }
        StringBuilder sbVip = AbstractC9029l.vip(this.f16327l, "musixmatch_access_token=", arrayList, "musixmatch_access_token_creation_date=");
        sbVip.append(this.f16332l);
        arrayList.add(sbVip.toString());
        StringBuilder sbMetrica = AbstractC9029l.metrica(new StringBuilder("disable_libvkx_verification="), this.f16328l, arrayList, "default_new_hs_widget_bg_mode=");
        sbMetrica.append(this.f16334l);
        arrayList.add(sbMetrica.toString());
        return AbstractC16901l.m4210case(arrayList, ", ", "VkxIntegrationPreferences{", "}", null, 56);
    }
}
