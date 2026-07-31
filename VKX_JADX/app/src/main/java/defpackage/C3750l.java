package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؕۤٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3750l implements InterfaceC16588l {
    public static final C3750l loadAd = new C3750l();
    public final /* synthetic */ C5301l yandex = new C5301l(Unit.INSTANCE, "kotlin.Unit");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        this.yandex.crashlytics(interfaceC17739l, (Unit) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        this.yandex.loadAd(interfaceC10726l);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return this.yandex.purchase();
    }
}
