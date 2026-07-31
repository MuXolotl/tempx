package defpackage;

import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lۙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18554l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C18194l f36214l = new C18194l(3, AbstractC18202l.yandex.loadAd(C18554l.class), 2, null);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final boolean f36215l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f36216l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final boolean f36217l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f36218l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final boolean f36219l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final boolean f36220l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f36221l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final EnumC14810l f36222l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f36223l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f36224l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f36225l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final boolean f36226l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final EnumC10468l f36227l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f36228l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final EnumC0972l f36229l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final boolean f36230l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final boolean f36231l;

    public C18554l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EnumC10468l enumC10468l, EnumC14810l enumC14810l, EnumC0972l enumC0972l, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C3844l c3844l) {
        super(f36214l, c3844l);
        this.f36225l = z;
        this.f36224l = z2;
        this.f36228l = z3;
        this.f36216l = z4;
        this.f36218l = z5;
        this.f36227l = enumC10468l;
        this.f36222l = enumC14810l;
        this.f36229l = enumC0972l;
        this.f36226l = z6;
        this.f36215l = z7;
        this.f36230l = z8;
        this.f36223l = z9;
        this.f36219l = z10;
        this.f36221l = z11;
        this.f36231l = z12;
        this.f36220l = z13;
        this.f36217l = z14;
    }

    public static C18554l loadAd(C18554l c18554l, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EnumC10468l enumC10468l, EnumC14810l enumC14810l, EnumC0972l enumC0972l, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i) {
        boolean z14 = (i & 1) != 0 ? c18554l.f36225l : z;
        boolean z15 = (i & 2) != 0 ? c18554l.f36224l : z2;
        boolean z16 = (i & 4) != 0 ? c18554l.f36228l : z3;
        boolean z17 = (i & 8) != 0 ? c18554l.f36216l : z4;
        boolean z18 = (i & 16) != 0 ? c18554l.f36218l : z5;
        EnumC10468l enumC10468l2 = (i & 32) != 0 ? c18554l.f36227l : enumC10468l;
        EnumC14810l enumC14810l2 = (i & 64) != 0 ? c18554l.f36222l : enumC14810l;
        EnumC0972l enumC0972l2 = (i & 128) != 0 ? c18554l.f36229l : enumC0972l;
        boolean z19 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c18554l.f36226l : z6;
        boolean z20 = (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c18554l.f36215l : z7;
        boolean z21 = (i & 1024) != 0 ? c18554l.f36230l : z8;
        boolean z22 = (i & 2048) != 0 ? c18554l.f36223l : z9;
        boolean z23 = (i & 4096) != 0 ? c18554l.f36219l : z10;
        boolean z24 = (i & 8192) != 0 ? c18554l.f36221l : z11;
        boolean z25 = c18554l.f36231l;
        boolean z26 = (32768 & i) != 0 ? c18554l.f36220l : z12;
        boolean z27 = (i & 65536) != 0 ? c18554l.f36217l : z13;
        C3844l c3844lYandex = c18554l.yandex();
        c18554l.getClass();
        return new C18554l(z14, z15, z16, z17, z18, enumC10468l2, enumC14810l2, enumC0972l2, z19, z20, z21, z22, z23, z24, z25, z26, z27, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18554l)) {
            return false;
        }
        C18554l c18554l = (C18554l) obj;
        return AbstractC8576l.yandex(yandex(), c18554l.yandex()) && this.f36225l == c18554l.f36225l && this.f36224l == c18554l.f36224l && this.f36228l == c18554l.f36228l && this.f36216l == c18554l.f36216l && this.f36218l == c18554l.f36218l && this.f36227l == c18554l.f36227l && this.f36222l == c18554l.f36222l && this.f36229l == c18554l.f36229l && this.f36226l == c18554l.f36226l && this.f36215l == c18554l.f36215l && this.f36230l == c18554l.f36230l && this.f36223l == c18554l.f36223l && this.f36219l == c18554l.f36219l && this.f36221l == c18554l.f36221l && this.f36231l == c18554l.f36231l && this.f36220l == c18554l.f36220l && this.f36217l == c18554l.f36217l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((this.f36229l.hashCode() + ((this.f36222l.hashCode() + ((this.f36227l.hashCode() + (((((((((((yandex().hashCode() * 37) + (this.f36225l ? 1231 : 1237)) * 37) + (this.f36224l ? 1231 : 1237)) * 37) + (this.f36228l ? 1231 : 1237)) * 37) + (this.f36216l ? 1231 : 1237)) * 37) + (this.f36218l ? 1231 : 1237)) * 37)) * 37)) * 37)) * 37) + (this.f36226l ? 1231 : 1237)) * 37) + (this.f36215l ? 1231 : 1237)) * 37) + (this.f36230l ? 1231 : 1237)) * 37) + (this.f36223l ? 1231 : 1237)) * 37) + (this.f36219l ? 1231 : 1237)) * 37) + (this.f36221l ? 1231 : 1237)) * 37) + (this.f36231l ? 1231 : 1237)) * 37) + (this.f36220l ? 1231 : 1237)) * 37) + (this.f36217l ? 1231 : 1237);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbMetrica = AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(new StringBuilder("enable_fullscreen_artwork="), this.f36225l, arrayList, "enable_artwork_swiping="), this.f36224l, arrayList, "enable_color_tining="), this.f36228l, arrayList, "enable_mini_player_swiping="), this.f36216l, arrayList, "enable_global_hearts="), this.f36218l, arrayList, "background_type=");
        sbMetrica.append(this.f36227l);
        arrayList.add(sbMetrica.toString());
        arrayList.add("background_blur_material_theme=" + this.f36222l);
        arrayList.add("background_blur_material_thickness=" + this.f36229l);
        AbstractC9029l.ad(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(new StringBuilder("enable_artwork_rounding="), this.f36226l, arrayList, "enable_system_bars_hiding="), this.f36215l, arrayList, "enable_keep_screen_on="), this.f36230l, arrayList, "enable_hide_dislikes="), this.f36223l, arrayList, "disable_vibration_effects="), this.f36219l, arrayList, "enable_volume_bar_in_np="), this.f36221l, arrayList, "hide_sharing_button="), this.f36231l, arrayList, "hide_controls_in_lyrics="), this.f36220l, arrayList, "hide_artwork_border="), this.f36217l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "VkxNowPlayingPreferences{", "}", null, 56);
    }
}
