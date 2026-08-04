package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lَٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14417l implements InterfaceC16588l {
    public static final C14417l yandex = new C14417l();
    public static final C9290l loadAd = C9290l.loadAd;

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C18427l c18427l = (C18427l) obj;
        AbstractC7470l.metrica(interfaceC17739l);
        C12976l c12976l = C12976l.yandex;
        C9304l c9304l = new C9304l(c12976l.purchase(), 1);
        int size = c18427l.size();
        InterfaceC0039l interfaceC0039lTapsense = interfaceC17739l.tapsense(c9304l, size);
        Iterator<AbstractC9914l> it = c18427l.iterator();
        for (int i = 0; i < size; i++) {
            ((AbstractC4072l) interfaceC0039lTapsense).applovin(c9304l, i, c12976l, it.next());
        }
        interfaceC0039lTapsense.yandex(c9304l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        AbstractC7470l.startapp(interfaceC10726l);
        return new C18427l((List) new C0087l(C12976l.yandex, 0).isPro(interfaceC10726l));
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
