package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؘٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16223l extends AbstractC11133l {
    public final C4495l loadAd;

    public AbstractC16223l(InterfaceC16588l interfaceC16588l) {
        super(interfaceC16588l);
        this.loadAd = new C4495l(interfaceC16588l.purchase());
    }

    @Override // defpackage.AbstractC17645l
    public final Iterator admob(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.AbstractC17645l
    public final Object billing() {
        return (AbstractC2730l) smaato(metrica());
    }

    @Override // defpackage.AbstractC11133l, defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        int iSubs = subs(obj);
        C4495l c4495l = this.loadAd;
        InterfaceC0039l interfaceC0039lTapsense = interfaceC17739l.tapsense(c4495l, iSubs);
        startapp(interfaceC0039lTapsense, obj, iSubs);
        interfaceC0039lTapsense.yandex(c4495l);
    }

    @Override // defpackage.AbstractC17645l, defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        return isPro(interfaceC10726l);
    }

    public abstract Object metrica();

    @Override // defpackage.AbstractC17645l
    public final int mopub(Object obj) {
        return ((AbstractC2730l) obj).amazon();
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return this.loadAd;
    }

    @Override // defpackage.AbstractC17645l
    public final Object remoteconfig(Object obj) {
        return ((AbstractC2730l) obj).yandex();
    }

    public abstract void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i);

    @Override // defpackage.AbstractC11133l
    public final void vip(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }
}
