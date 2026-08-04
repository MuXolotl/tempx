package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;

/* JADX INFO: renamed from: lُۖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11243l extends C0114l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C11243l f22636l = new C11243l(CachedAlbum.class, "ownerId", "getOwnerId()J", 0);

    @Override // defpackage.C0114l, defpackage.InterfaceC2463l
    public final void appmetrica(Object obj, Object obj2) {
        ((CachedAlbum) obj).license(((Number) obj2).longValue());
    }

    @Override // defpackage.C0114l, defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        return Long.valueOf(((CachedAlbum) obj).billing());
    }
}
