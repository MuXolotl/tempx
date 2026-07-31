package defpackage;

/* JADX INFO: renamed from: l۟ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18607l implements InterfaceC16588l {
    public static final InterfaceC18035l crashlytics;
    public static final InterfaceC16588l loadAd;
    public static final C18607l yandex = new C18607l();

    static {
        InterfaceC16588l interfaceC16588lSerializer = C11549l.Companion.serializer();
        loadAd = interfaceC16588lSerializer;
        crashlytics = interfaceC16588lSerializer.purchase();
    }

    public static void billing(InterfaceC17739l interfaceC17739l, C0873l c0873l) {
        if (!(interfaceC17739l instanceof C16044l)) {
            C6541l.firebase(AbstractC12900l.isPro("Unknown encoder type: ", interfaceC17739l));
        } else {
            loadAd.crashlytics(interfaceC17739l, new C11549l(c0873l));
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final /* bridge */ /* synthetic */ void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        billing(interfaceC17739l, (C0873l) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        if (interfaceC10726l instanceof InterfaceC17487l) {
            return new C0873l(((C11549l) loadAd.loadAd(interfaceC10726l)).yandex);
        }
        C6541l.firebase(AbstractC12900l.subs("Unknown decoder type: ", interfaceC10726l));
        return null;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return crashlytics;
    }
}
