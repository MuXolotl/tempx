package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lّٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14851l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f29083l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8748l f29084l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29085l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f29086l;

    public /* synthetic */ C14851l(C8748l c8748l, CachedTrack cachedTrack, InterfaceC12244l interfaceC12244l, int i) {
        this.f29085l = i;
        this.f29084l = c8748l;
        this.f29083l = cachedTrack;
        this.f29086l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f29085l;
        InterfaceC12244l interfaceC12244l = this.f29086l;
        CachedTrack cachedTrack = this.f29083l;
        C8748l c8748l = this.f29084l;
        switch (i) {
            case 0:
                C8748l.m2422protected(c8748l, cachedTrack, ((C16187l) interfaceC12244l.getValue()).yandex);
                break;
            default:
                C8748l.m2422protected(c8748l, cachedTrack, ((C16187l) interfaceC12244l.getValue()).loadAd);
                break;
        }
        return Unit.INSTANCE;
    }
}
