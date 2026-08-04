package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lِؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4053l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C6111l f8348l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f8349l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8350l = 0;

    public /* synthetic */ C4053l(C6111l c6111l, CachedTrack cachedTrack) {
        this.f8348l = c6111l;
        this.f8349l = cachedTrack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f8350l;
        C6111l c6111l = this.f8348l;
        CachedTrack cachedTrack = this.f8349l;
        switch (i) {
            case 0:
                C6111l.m1938l(c6111l, cachedTrack, 2);
                break;
            default:
                int i2 = C4456l.f9065l;
                AbstractC4115l.crashlytics(cachedTrack.crashlytics()).Signature(c6111l.isVip());
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4053l(CachedTrack cachedTrack, C6111l c6111l) {
        this.f8349l = cachedTrack;
        this.f8348l = c6111l;
    }
}
