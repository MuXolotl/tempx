package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٓٝؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14283l implements InterfaceC16588l {
    public static final C14283l yandex = new C14283l();
    public static final C13369l loadAd = C13369l.loadAd;

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        AbstractC7470l.metrica(interfaceC17739l);
        new C0185l(C0194l.yandex, C12976l.yandex, 1).crashlytics(interfaceC17739l, (C18010l) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        AbstractC7470l.startapp(interfaceC10726l);
        return new C18010l((Map) new C0185l(C0194l.yandex, C12976l.yandex, 1).isPro(interfaceC10726l));
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
