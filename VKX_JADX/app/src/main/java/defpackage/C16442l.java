package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lٍٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16442l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ CachedPlaylist f32149l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17003l f32150l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32151l = 1;

    public C16442l(C17003l c17003l, CachedPlaylist cachedPlaylist) {
        this.f32150l = c17003l;
        this.f32149l = cachedPlaylist;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f32151l;
        CachedPlaylist cachedPlaylist = this.f32149l;
        C17003l c17003l = this.f32150l;
        switch (i) {
            case 0:
                int i2 = C4456l.f9065l;
                AudioPlaylist audioPlaylistCrashlytics = cachedPlaylist.crashlytics();
                String strIsVip = cachedPlaylist.isVip();
                if (strIsVip == null) {
                    strIsVip = "";
                }
                new C4456l(new C5218l(audioPlaylistCrashlytics, strIsVip)).Signature(c17003l.isVip());
                break;
            default:
                c17003l.m4125private(new C18306l(cachedPlaylist.crashlytics(), new VKProfile(cachedPlaylist.pro(), null, null, null, cachedPlaylist.isVip(), null, null, 110)));
                break;
        }
        return Unit.INSTANCE;
    }

    public C16442l(CachedPlaylist cachedPlaylist, C17003l c17003l) {
        this.f32149l = cachedPlaylist;
        this.f32150l = c17003l;
    }
}
