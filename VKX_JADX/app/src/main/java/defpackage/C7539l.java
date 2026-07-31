package defpackage;

import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؚ۟ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7539l implements InterfaceC14961l {
    public final InterfaceC14961l loadAd;
    public final Function3 yandex;

    public C7539l(Function3 function3, InterfaceC14961l interfaceC14961l) {
        this.yandex = function3;
        this.loadAd = interfaceC14961l;
    }

    @Override // defpackage.InterfaceC14961l
    public final Object yandex(C6806l c6806l, AbstractC0283l abstractC0283l) {
        return this.yandex.invoke(this.loadAd, c6806l, abstractC0283l);
    }
}
