package defpackage;

/* JADX INFO: renamed from: lِّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12548l implements InterfaceC16588l {
    public static final C12548l yandex = new C12548l();
    public static final C17606l loadAd = AbstractC16814l.crashlytics("BsonDocumentKey");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        String str = (String) obj;
        if (AbstractC12024l.inmobi(str, (char) 0)) {
            throw new C10741l(1, "Contains null byte", null);
        }
        C0194l c0194l = C0194l.yandex;
        interfaceC17739l.subscription(str);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C0194l c0194l = C0194l.yandex;
        return interfaceC10726l.tapsense();
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
