package defpackage;

/* JADX INFO: renamed from: lًۣۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8370l implements InterfaceC16588l {
    public static final C8370l yandex = new C8370l();
    public static final InterfaceC16588l loadAd = C11950l.Companion.serializer();
    public static final C17606l crashlytics = AbstractC16814l.crashlytics("ZAZ");

    public static void billing(InterfaceC17739l interfaceC17739l, C12439l c12439l) {
        if (!(interfaceC17739l instanceof C16044l)) {
            C6541l.firebase(AbstractC12900l.isPro("Unknown encoder type: ", interfaceC17739l));
        } else {
            loadAd.crashlytics(interfaceC17739l, new C11950l(c12439l));
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final /* bridge */ /* synthetic */ void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        billing(interfaceC17739l, (C12439l) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        if (interfaceC10726l instanceof InterfaceC17487l) {
            C11950l c11950l = (C11950l) loadAd.loadAd(interfaceC10726l);
            return new C12439l(c11950l.yandex, c11950l.loadAd);
        }
        C6541l.firebase(AbstractC12900l.subs("Unknown decoder type: ", interfaceC10726l));
        return null;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return crashlytics;
    }
}
