package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;

/* JADX INFO: renamed from: lؙٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3961l extends C0114l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C3961l f8143l = new C3961l(CachedPlaylistLibrary.class, "uid", "getUid()J", 0);

    @Override // defpackage.C0114l, defpackage.InterfaceC2463l
    public final void appmetrica(Object obj, Object obj2) {
        ((CachedPlaylistLibrary) obj).purchase(((Number) obj2).longValue());
    }

    @Override // defpackage.C0114l, defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        return Long.valueOf(((CachedPlaylistLibrary) obj).loadAd());
    }
}
