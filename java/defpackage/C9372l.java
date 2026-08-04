package defpackage;

/* JADX INFO: renamed from: lٍؙُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9372l implements InterfaceC16588l {
    public static final InterfaceC18035l crashlytics;
    public static final C0185l loadAd;
    public static final C9372l yandex = new C9372l();

    static {
        C0185l c0185l = new C0185l(C12548l.yandex, C12623l.yandex, 1);
        loadAd = c0185l;
        crashlytics = c0185l.amazon;
    }

    public static void billing(InterfaceC17739l interfaceC17739l, C14705l c14705l) {
        if (interfaceC17739l instanceof C16044l) {
            loadAd.crashlytics(interfaceC17739l, c14705l);
        } else {
            C6541l.firebase(AbstractC12900l.isPro("Unknown encoder type: ", interfaceC17739l));
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final /* bridge */ /* synthetic */ void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        billing(interfaceC17739l, (C14705l) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        if (!(interfaceC10726l instanceof InterfaceC17487l)) {
            C6541l.firebase(AbstractC12900l.subs("Unknown decoder type: ", interfaceC10726l));
            return null;
        }
        C12623l c12623l = C12623l.yandex;
        AbstractC3160l abstractC3160lBilling = C12623l.billing(interfaceC10726l);
        abstractC3160lBilling.billing(4);
        return (C14705l) abstractC3160lBilling;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return crashlytics;
    }
}
