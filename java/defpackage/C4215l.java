package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedArtist;

/* JADX INFO: renamed from: lٍؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4215l extends C0114l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C4215l f8644l = new C4215l(CachedArtist.class, "id", "getId()Ljava/lang/String;", 0);

    @Override // defpackage.C0114l, defpackage.InterfaceC2463l
    public final void appmetrica(Object obj, Object obj2) {
        ((CachedArtist) obj).purchase((String) obj2);
    }

    @Override // defpackage.C0114l, defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        return ((CachedArtist) obj).loadAd();
    }
}
