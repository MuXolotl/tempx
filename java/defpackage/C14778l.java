package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٌٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14778l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f28872l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15068l f28873l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28874l = 1;

    public /* synthetic */ C14778l(C15068l c15068l, CachedTrack cachedTrack) {
        this.f28873l = c15068l;
        this.f28872l = cachedTrack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f28874l;
        CachedTrack cachedTrack = this.f28872l;
        C15068l c15068l = this.f28873l;
        switch (i) {
            case 0:
                int i2 = C4456l.f9065l;
                AbstractC4115l.crashlytics(cachedTrack.crashlytics()).Signature(c15068l.isVip());
                break;
            default:
                C15068l.m3920this(c15068l, cachedTrack, false, 2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14778l(CachedTrack cachedTrack, C15068l c15068l) {
        this.f28872l = cachedTrack;
        this.f28873l = c15068l;
    }
}
