package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3203l implements InterfaceC15267l {
    public final C2607l loadAd;
    public final C7552l yandex;

    public C3203l(C7552l c7552l, C2607l c2607l) {
        this.yandex = c7552l;
        this.loadAd = c2607l;
    }

    @Override // defpackage.InterfaceC12001l
    public final boolean admob(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC12001l
    public final /* synthetic */ InterfaceC12001l billing(InterfaceC12001l interfaceC12001l) {
        return AbstractC2812l.crashlytics(this, interfaceC12001l);
    }

    @Override // defpackage.InterfaceC12001l
    public final boolean mopub(C2613l c2613l) {
        return ((Boolean) c2613l.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC12001l
    public final Object purchase(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final String toString() {
        return "BackgroundModifier(colorFilter=" + this.loadAd + ", imageProvider=" + this.yandex + ", contentScale=" + ((Object) C0219l.yandex(1)) + ", alpha=null)";
    }
}
