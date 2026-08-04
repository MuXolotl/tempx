package defpackage;

import java.util.ArrayList;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15343l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C3711l f29988l = new C3711l(AbstractC18202l.yandex.loadAd(C15343l.class));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final boolean f29989l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f29990l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f29991l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final Map f29992l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f29993l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f29994l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f29995l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f29996l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final boolean f29997l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f29998l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f29999l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final boolean f30000l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f30001l;

    public C15343l(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, Map map, int i7, boolean z5, C3844l c3844l) {
        super(f29988l, c3844l);
        this.f29996l = i;
        this.f29995l = i2;
        this.f29999l = i3;
        this.f29990l = i4;
        this.f29991l = i5;
        this.f29998l = i6;
        this.f29993l = z;
        this.f30000l = z2;
        this.f29997l = z3;
        this.f29989l = z4;
        this.f30001l = i7;
        this.f29994l = z5;
        this.f29992l = AbstractC13457l.billing("overrides", map);
    }

    public static C15343l loadAd(C15343l c15343l, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, Map map, int i7, boolean z5, int i8) {
        int i9 = (i8 & 1) != 0 ? c15343l.f29996l : i;
        int i10 = (i8 & 2) != 0 ? c15343l.f29995l : i2;
        int i11 = (i8 & 4) != 0 ? c15343l.f29999l : i3;
        int i12 = (i8 & 8) != 0 ? c15343l.f29990l : i4;
        int i13 = (i8 & 16) != 0 ? c15343l.f29991l : i5;
        int i14 = (i8 & 32) != 0 ? c15343l.f29998l : i6;
        boolean z6 = (i8 & 64) != 0 ? c15343l.f29993l : z;
        boolean z7 = (i8 & 128) != 0 ? c15343l.f30000l : z2;
        boolean z8 = (i8 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c15343l.f29997l : z3;
        boolean z9 = (i8 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c15343l.f29989l : z4;
        Map map2 = (i8 & 1024) != 0 ? c15343l.f29992l : map;
        int i15 = (i8 & 2048) != 0 ? c15343l.f30001l : i7;
        boolean z10 = (i8 & 4096) != 0 ? c15343l.f29994l : z5;
        C3844l c3844lYandex = c15343l.yandex();
        c15343l.getClass();
        return new C15343l(i9, i10, i11, i12, i13, i14, z6, z7, z8, z9, map2, i15, z10, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15343l)) {
            return false;
        }
        C15343l c15343l = (C15343l) obj;
        return AbstractC8576l.yandex(yandex(), c15343l.yandex()) && this.f29996l == c15343l.f29996l && this.f29995l == c15343l.f29995l && this.f29999l == c15343l.f29999l && this.f29990l == c15343l.f29990l && this.f29991l == c15343l.f29991l && this.f29998l == c15343l.f29998l && this.f29993l == c15343l.f29993l && this.f30000l == c15343l.f30000l && this.f29997l == c15343l.f29997l && this.f29989l == c15343l.f29989l && AbstractC8576l.yandex(this.f29992l, c15343l.f29992l) && this.f30001l == c15343l.f30001l && this.f29994l == c15343l.f29994l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((this.f29992l.hashCode() + (((((((((((((((((((((yandex().hashCode() * 37) + this.f29996l) * 37) + this.f29995l) * 37) + this.f29999l) * 37) + this.f29990l) * 37) + this.f29991l) * 37) + this.f29998l) * 37) + (this.f29993l ? 1231 : 1237)) * 37) + (this.f30000l ? 1231 : 1237)) * 37) + (this.f29997l ? 1231 : 1237)) * 37) + (this.f29989l ? 1231 : 1237)) * 37)) * 37) + this.f30001l) * 37) + (this.f29994l ? 1231 : 1237);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("current_theme_id=" + this.f29996l);
        arrayList.add("current_accent_id=" + this.f29995l);
        arrayList.add("last_light_theme_id=" + this.f29999l);
        arrayList.add("last_light_accent_id=" + this.f29990l);
        arrayList.add("last_dark_theme_id=" + this.f29991l);
        arrayList.add("last_dark_accent_id=" + this.f29998l);
        AbstractC9029l.ad(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(new StringBuilder("system_theme_switching="), this.f29993l, arrayList, "system_monet_theme="), this.f30000l, arrayList, "system_monet_accent="), this.f29997l, arrayList, "use_overrides="), this.f29989l, arrayList);
        Map map = this.f29992l;
        if (!map.isEmpty()) {
            arrayList.add("overrides=" + map);
        }
        arrayList.add("override_dpi=" + this.f30001l);
        AbstractC9029l.ad(new StringBuilder("override_dpi_enabled="), this.f29994l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "VkxThemingPreferences{", "}", null, 56);
    }
}
