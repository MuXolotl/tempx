package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3423l implements InterfaceC4121l {
    public final String loadAd;
    public final Function1 yandex;

    public AbstractC3423l(String str, Function1 function1) {
        this.yandex = function1;
        this.loadAd = "must return ".concat(str);
    }

    @Override // defpackage.InterfaceC4121l
    public final /* bridge */ String crashlytics(C12113l c12113l) {
        return AbstractC9966l.smaato(this, c12113l);
    }

    @Override // defpackage.InterfaceC4121l
    public final boolean loadAd(C12113l c12113l) {
        return AbstractC8576l.yandex(c12113l.f20715l, this.yandex.invoke(AbstractC3759l.purchase(c12113l)));
    }

    @Override // defpackage.InterfaceC4121l
    public final String yandex() {
        return this.loadAd;
    }
}
