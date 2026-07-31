package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؘٓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13969l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8748l f27259l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f27260l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27261l;

    public /* synthetic */ C13969l(CachedTrack cachedTrack, C8748l c8748l, int i) {
        this.f27261l = i;
        this.f27260l = cachedTrack;
        this.f27259l = c8748l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f27261l;
        C8748l c8748l = this.f27259l;
        CachedTrack cachedTrack = this.f27260l;
        switch (i) {
            case 0:
                int i2 = C4456l.f9065l;
                AbstractC4115l.crashlytics(cachedTrack.crashlytics()).Signature(c8748l.isVip());
                break;
            default:
                int i3 = C4456l.f9065l;
                AbstractC4115l.crashlytics(cachedTrack.crashlytics()).Signature(c8748l.isVip());
                break;
        }
        return Unit.INSTANCE;
    }
}
