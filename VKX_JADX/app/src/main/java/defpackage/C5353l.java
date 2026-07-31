package defpackage;

import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘؑؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5353l extends AbstractC11801l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final String f11491l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final List f11492l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final List f11493l;

    public C5353l() {
        super(1);
        C16287l.yandex.getClass();
        this.f11492l = AbstractC14055l.remoteconfig(new C9512l(C16287l.crashlytics()), new C2935l(C16287l.crashlytics()));
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.f11493l = AbstractC14055l.remoteconfig(VKXApplication.Companion.loadAd(R.string.news_audios), VKXApplication.Companion.loadAd(R.string.news_playlists));
        this.f11491l = VKXApplication.Companion.loadAd(R.string.acc_wall);
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: continue */
    public final String mo648continue() {
        return this.f11491l;
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: goto */
    public final List mo649goto() {
        return this.f11492l;
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: super */
    public final List mo650super() {
        return this.f11493l;
    }
}
