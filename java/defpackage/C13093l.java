package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lْؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13093l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f25612l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9430l f25613l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25614l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f25615l;

    public /* synthetic */ C13093l(C9430l c9430l, CachedTrack cachedTrack, InterfaceC12244l interfaceC12244l, int i) {
        this.f25614l = i;
        this.f25613l = c9430l;
        this.f25612l = cachedTrack;
        this.f25615l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f25614l;
        InterfaceC12244l interfaceC12244l = this.f25615l;
        CachedTrack cachedTrack = this.f25612l;
        C9430l c9430l = this.f25613l;
        switch (i) {
            case 0:
                C9430l.m2650protected(c9430l, cachedTrack, ((C16187l) interfaceC12244l.getValue()).yandex);
                break;
            default:
                C9430l.m2650protected(c9430l, cachedTrack, ((C16187l) interfaceC12244l.getValue()).loadAd);
                break;
        }
        return Unit.INSTANCE;
    }
}
