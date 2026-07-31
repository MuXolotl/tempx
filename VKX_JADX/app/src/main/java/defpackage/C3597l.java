package defpackage;

import java.util.ArrayList;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3597l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C10180l f7518l = new C10180l(AbstractC18202l.yandex.loadAd(C3597l.class));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C15744l f7519l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C18364l f7520l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C1887l f7521l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C15697l f7522l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final Map f7523l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f7524l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C11656l f7525l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f7526l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C3554l f7527l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C3554l f7528l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C15744l f7529l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C7315l f7530l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f7531l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C15744l f7532l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C15744l f7533l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f7534l;

    public /* synthetic */ C3597l(C3554l c3554l, C18364l c18364l, C1887l c1887l, C7315l c7315l, C15744l c15744l, C15744l c15744l2, C15744l c15744l3, C15744l c15744l4, C15697l c15697l, int i) {
        this(c3554l, null, false, c18364l, c1887l, c7315l, null, c15744l, c15744l2, c15744l3, (i & 1024) != 0 ? null : c15744l4, false, (i & 4096) != 0 ? null : c15697l, false, null, C14054l.f27396l, C3844l.f7950l);
    }

    public static C3597l loadAd(C3597l c3597l, C3554l c3554l, C18364l c18364l, C1887l c1887l, C7315l c7315l, C15744l c15744l, C15744l c15744l2, C15744l c15744l3, C15744l c15744l4, int i) {
        C3554l c3554l2 = (i & 1) != 0 ? c3597l.f7528l : c3554l;
        C3554l c3554l3 = c3597l.f7527l;
        boolean z = c3597l.f7531l;
        C18364l c18364l2 = (i & 8) != 0 ? c3597l.f7520l : c18364l;
        C1887l c1887l2 = (i & 16) != 0 ? c3597l.f7521l : c1887l;
        C7315l c7315l2 = (i & 32) != 0 ? c3597l.f7530l : c7315l;
        C11656l c11656l = c3597l.f7525l;
        C15744l c15744l5 = (i & 128) != 0 ? c3597l.f7532l : c15744l;
        C15744l c15744l6 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c3597l.f7529l : c15744l2;
        C15744l c15744l7 = (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c3597l.f7519l : c15744l3;
        C15744l c15744l8 = (i & 1024) != 0 ? c3597l.f7533l : c15744l4;
        boolean z2 = c3597l.f7526l;
        C15697l c15697l = c3597l.f7522l;
        boolean z3 = c3597l.f7524l;
        String str = c3597l.f7534l;
        Map map = c3597l.f7523l;
        C3844l c3844lYandex = c3597l.yandex();
        c3597l.getClass();
        return new C3597l(c3554l2, c3554l3, z, c18364l2, c1887l2, c7315l2, c11656l, c15744l5, c15744l6, c15744l7, c15744l8, z2, c15697l, z3, str, map, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3597l)) {
            return false;
        }
        C3597l c3597l = (C3597l) obj;
        return AbstractC8576l.yandex(yandex(), c3597l.yandex()) && AbstractC8576l.yandex(this.f7528l, c3597l.f7528l) && AbstractC8576l.yandex(this.f7527l, c3597l.f7527l) && this.f7531l == c3597l.f7531l && AbstractC8576l.yandex(this.f7520l, c3597l.f7520l) && AbstractC8576l.yandex(this.f7521l, c3597l.f7521l) && AbstractC8576l.yandex(this.f7530l, c3597l.f7530l) && AbstractC8576l.yandex(this.f7525l, c3597l.f7525l) && AbstractC8576l.yandex(this.f7532l, c3597l.f7532l) && AbstractC8576l.yandex(this.f7529l, c3597l.f7529l) && AbstractC8576l.yandex(this.f7519l, c3597l.f7519l) && AbstractC8576l.yandex(this.f7533l, c3597l.f7533l) && this.f7526l == c3597l.f7526l && AbstractC8576l.yandex(this.f7522l, c3597l.f7522l) && this.f7524l == c3597l.f7524l && AbstractC8576l.yandex(this.f7534l, c3597l.f7534l) && AbstractC8576l.yandex(this.f7523l, c3597l.f7523l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        C3554l c3554l = this.f7528l;
        int iHashCode2 = (iHashCode + (c3554l != null ? c3554l.hashCode() : 0)) * 37;
        C3554l c3554l2 = this.f7527l;
        int iHashCode3 = (((iHashCode2 + (c3554l2 != null ? c3554l2.hashCode() : 0)) * 37) + (this.f7531l ? 1231 : 1237)) * 37;
        C18364l c18364l = this.f7520l;
        int iHashCode4 = (iHashCode3 + (c18364l != null ? c18364l.hashCode() : 0)) * 37;
        C1887l c1887l = this.f7521l;
        int iHashCode5 = (iHashCode4 + (c1887l != null ? c1887l.hashCode() : 0)) * 37;
        C7315l c7315l = this.f7530l;
        int iHashCode6 = (iHashCode5 + (c7315l != null ? c7315l.hashCode() : 0)) * 37;
        C11656l c11656l = this.f7525l;
        int iHashCode7 = (iHashCode6 + (c11656l != null ? c11656l.hashCode() : 0)) * 37;
        C15744l c15744l = this.f7532l;
        int iHashCode8 = (iHashCode7 + (c15744l != null ? c15744l.hashCode() : 0)) * 37;
        C15744l c15744l2 = this.f7529l;
        int iHashCode9 = (iHashCode8 + (c15744l2 != null ? c15744l2.hashCode() : 0)) * 37;
        C15744l c15744l3 = this.f7519l;
        int iHashCode10 = (iHashCode9 + (c15744l3 != null ? c15744l3.hashCode() : 0)) * 37;
        C15744l c15744l4 = this.f7533l;
        int iHashCode11 = (((iHashCode10 + (c15744l4 != null ? c15744l4.hashCode() : 0)) * 37) + (this.f7526l ? 1231 : 1237)) * 37;
        C15697l c15697l = this.f7522l;
        int iHashCode12 = (((iHashCode11 + (c15697l != null ? c15697l.hashCode() : 0)) * 37) + (this.f7524l ? 1231 : 1237)) * 37;
        String str = this.f7534l;
        int iHashCode13 = this.f7523l.hashCode() + ((iHashCode12 + (str != null ? str.hashCode() : 0)) * 37);
        this.f23747l = iHashCode13;
        return iHashCode13;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C3554l c3554l = this.f7528l;
        if (c3554l != null) {
            arrayList.add("equalizer_10band=" + c3554l);
        }
        C3554l c3554l2 = this.f7527l;
        if (c3554l2 != null) {
            arrayList.add("equalizer_5band=" + c3554l2);
        }
        AbstractC9029l.ad(new StringBuilder("use_5band_equalizer="), this.f7531l, arrayList);
        C18364l c18364l = this.f7520l;
        if (c18364l != null) {
            arrayList.add("compressor=" + c18364l);
        }
        C1887l c1887l = this.f7521l;
        if (c1887l != null) {
            arrayList.add("limiter=" + c1887l);
        }
        C7315l c7315l = this.f7530l;
        if (c7315l != null) {
            arrayList.add("gain=" + c7315l);
        }
        C11656l c11656l = this.f7525l;
        if (c11656l != null) {
            arrayList.add("exported=" + c11656l);
        }
        C15744l c15744l = this.f7532l;
        if (c15744l != null) {
            arrayList.add("legacy_virtualization=" + c15744l);
        }
        C15744l c15744l2 = this.f7529l;
        if (c15744l2 != null) {
            arrayList.add("legacy_bass_boost=" + c15744l2);
        }
        C15744l c15744l3 = this.f7519l;
        if (c15744l3 != null) {
            arrayList.add("legacy_reverb=" + c15744l3);
        }
        C15744l c15744l4 = this.f7533l;
        if (c15744l4 != null) {
            arrayList.add("legacy_env_reverb=" + c15744l4);
        }
        AbstractC9029l.ad(new StringBuilder("use_haptic_generator="), this.f7526l, arrayList);
        C15697l c15697l = this.f7522l;
        if (c15697l != null) {
            arrayList.add("crossfade=" + c15697l);
        }
        AbstractC9029l.ad(new StringBuilder("auto_eq_enabled="), this.f7524l, arrayList);
        String str = this.f7534l;
        if (str != null) {
            AbstractC9029l.pro(str, "auto_eq_preset_id=", arrayList);
        }
        Map map = this.f7523l;
        if (!map.isEmpty()) {
            arrayList.add("auto_eq_map_cache=" + map);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "VkxDspBundle{", "}", null, 56);
    }

    public C3597l(C3554l c3554l, C3554l c3554l2, boolean z, C18364l c18364l, C1887l c1887l, C7315l c7315l, C11656l c11656l, C15744l c15744l, C15744l c15744l2, C15744l c15744l3, C15744l c15744l4, boolean z2, C15697l c15697l, boolean z3, String str, Map map, C3844l c3844l) {
        super(f7518l, c3844l);
        this.f7528l = c3554l;
        this.f7527l = c3554l2;
        this.f7531l = z;
        this.f7520l = c18364l;
        this.f7521l = c1887l;
        this.f7530l = c7315l;
        this.f7525l = c11656l;
        this.f7532l = c15744l;
        this.f7529l = c15744l2;
        this.f7519l = c15744l3;
        this.f7533l = c15744l4;
        this.f7526l = z2;
        this.f7522l = c15697l;
        this.f7524l = z3;
        this.f7534l = str;
        this.f7523l = AbstractC13457l.billing("auto_eq_map_cache", map);
    }
}
