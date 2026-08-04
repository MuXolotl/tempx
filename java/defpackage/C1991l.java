package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؓٝۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1991l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f4500l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11655l f4501l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4502l = 1;

    public /* synthetic */ C1991l(C11655l c11655l, CachedTrack cachedTrack) {
        this.f4501l = c11655l;
        this.f4500l = cachedTrack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f4502l;
        CachedTrack cachedTrack = this.f4500l;
        C11655l c11655l = this.f4501l;
        switch (i) {
            case 0:
                int i2 = C4456l.f9065l;
                AbstractC4115l.crashlytics(cachedTrack.crashlytics()).Signature(c11655l.isVip());
                break;
            default:
                C11655l.m3179break(c11655l, cachedTrack, false, 2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1991l(CachedTrack cachedTrack, C11655l c11655l) {
        this.f4500l = cachedTrack;
        this.f4501l = c11655l;
    }
}
