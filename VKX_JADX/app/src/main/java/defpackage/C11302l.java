package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُۚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11302l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9430l f22791l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f22792l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22793l;

    public /* synthetic */ C11302l(CachedTrack cachedTrack, C9430l c9430l, int i) {
        this.f22793l = i;
        this.f22792l = cachedTrack;
        this.f22791l = c9430l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f22793l;
        C9430l c9430l = this.f22791l;
        CachedTrack cachedTrack = this.f22792l;
        switch (i) {
            case 0:
                int i2 = C4456l.f9065l;
                AbstractC4115l.crashlytics(cachedTrack.crashlytics()).Signature(c9430l.isVip());
                break;
            default:
                int i3 = C4456l.f9065l;
                AbstractC4115l.crashlytics(cachedTrack.crashlytics()).Signature(c9430l.isVip());
                break;
        }
        return Unit.INSTANCE;
    }
}
