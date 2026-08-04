package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٌٌٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8903l extends AbstractC0155l {
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC13547l loadAd;
    public final /* synthetic */ C11154l yandex;

    public C8903l(ViewTreeObserverOnPreDrawListenerC13547l viewTreeObserverOnPreDrawListenerC13547l, C11154l c11154l) {
        this.loadAd = viewTreeObserverOnPreDrawListenerC13547l;
        this.yandex = c11154l;
    }

    @Override // defpackage.AbstractC0155l, defpackage.InterfaceC4788l
    public final void yandex(AbstractC1299l abstractC1299l) {
        ((ArrayList) this.yandex.get(this.loadAd.f26565l)).remove(abstractC1299l);
        abstractC1299l.signatures(this);
    }
}
