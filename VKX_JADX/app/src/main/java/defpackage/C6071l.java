package defpackage;

import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;

/* JADX INFO: renamed from: lؘؚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6071l extends C0114l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C6071l f12845l = new C6071l(XTrackLyrics.class, "id", "getId()Ljava/lang/String;", 0);

    @Override // defpackage.C0114l, defpackage.InterfaceC2463l
    public final void appmetrica(Object obj, Object obj2) {
        ((XTrackLyrics) obj).purchase((String) obj2);
    }

    @Override // defpackage.C0114l, defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        return ((XTrackLyrics) obj).loadAd();
    }
}
