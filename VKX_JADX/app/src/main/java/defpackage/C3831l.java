package defpackage;

/* JADX INFO: renamed from: lؖؐۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3831l implements InterfaceC16588l {
    public static final InterfaceC18035l crashlytics;
    public static final InterfaceC16588l loadAd;
    public static final C3831l yandex = new C3831l();

    static {
        InterfaceC16588l interfaceC16588lSerializer = C5544l.INSTANCE.serializer();
        loadAd = interfaceC16588lSerializer;
        crashlytics = interfaceC16588lSerializer.purchase();
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        if (interfaceC17739l instanceof C16044l) {
            ((C16044l) interfaceC17739l).amazon();
        } else {
            C6541l.firebase(AbstractC12900l.isPro("Unknown encoder type: ", interfaceC17739l));
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        if (interfaceC10726l instanceof InterfaceC17487l) {
            loadAd.loadAd(interfaceC10726l);
            return C4395l.INSTANCE;
        }
        C6541l.firebase(AbstractC12900l.subs("Unknown decoder type: ", interfaceC10726l));
        return null;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return crashlytics;
    }
}
