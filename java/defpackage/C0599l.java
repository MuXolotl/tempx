package defpackage;

import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘؑۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0599l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final String f2031l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final List f2032l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final List f2033l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final String f2034l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final long f2035l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f2036l;

    public C0599l(long j, String str, String str2) {
        super(1);
        this.f2035l = j;
        this.f2036l = str;
        this.f2034l = str2;
        this.f2033l = AbstractC14055l.remoteconfig(new C15191l(new C1329l(AbstractC2812l.ads(j, "https://vk.com/audios"), 3)), new C9512l(j), new C2935l(j));
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.f2032l = AbstractC14055l.remoteconfig(VKXApplication.Companion.loadAd(R.string.pv_lib), VKXApplication.Companion.loadAd(R.string.wall_audios), VKXApplication.Companion.loadAd(R.string.wall_playlists));
        this.f2031l = "";
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final AbstractC14412l mo647case() {
        return new C3659l(this.f2035l, this.f2036l, this.f2034l);
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final String mo648continue() {
        return this.f2031l;
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final List mo649goto() {
        return this.f2033l;
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final List mo650super() {
        return this.f2032l;
    }
}
