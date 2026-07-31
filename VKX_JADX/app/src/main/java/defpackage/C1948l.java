package defpackage;

/* JADX INFO: renamed from: lٌؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1948l implements InterfaceC16588l {
    public static final InterfaceC18035l crashlytics;
    public static final InterfaceC16588l loadAd;
    public static final C1948l yandex = new C1948l();

    static {
        InterfaceC16588l interfaceC16588lSerializer = C2060l.Companion.serializer();
        loadAd = interfaceC16588lSerializer;
        crashlytics = interfaceC16588lSerializer.purchase();
    }

    public static void billing(InterfaceC17739l interfaceC17739l, C4058l c4058l) {
        if (!(interfaceC17739l instanceof C16044l)) {
            C6541l.firebase(AbstractC12900l.isPro("Unknown encoder type: ", interfaceC17739l));
        } else {
            loadAd.crashlytics(interfaceC17739l, new C2060l(c4058l));
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final /* bridge */ /* synthetic */ void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        billing(interfaceC17739l, (C4058l) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        if (interfaceC10726l instanceof InterfaceC17487l) {
            C17462l c17462l = ((C2060l) loadAd.loadAd(interfaceC10726l)).yandex;
            return new C4058l(c17462l.yandex, c17462l.loadAd);
        }
        C6541l.firebase(AbstractC12900l.subs("Unknown decoder type: ", interfaceC10726l));
        return null;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return crashlytics;
    }
}
