package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒۧؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1491l implements InterfaceC0084l {
    public final C14218l amazon;
    public final C14218l billing;
    public final C14218l crashlytics;
    public final C14218l loadAd;
    public final C14218l purchase;
    public final C14218l yandex;

    public /* synthetic */ C1491l(C14218l c14218l, C14218l c14218l2, C14218l c14218l3, C14218l c14218l4) {
        this(new C14218l(3, 0.0f), c14218l, c14218l2, new C14218l(3, 0.0f), c14218l3, c14218l4);
    }

    @Override // defpackage.InterfaceC12001l
    public final boolean admob(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC12001l
    public final /* synthetic */ InterfaceC12001l billing(InterfaceC12001l interfaceC12001l) {
        return AbstractC2812l.crashlytics(this, interfaceC12001l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1491l)) {
            return false;
        }
        C1491l c1491l = (C1491l) obj;
        return AbstractC8576l.yandex(this.yandex, c1491l.yandex) && AbstractC8576l.yandex(this.loadAd, c1491l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c1491l.crashlytics) && AbstractC8576l.yandex(this.amazon, c1491l.amazon) && AbstractC8576l.yandex(this.purchase, c1491l.purchase) && AbstractC8576l.yandex(this.billing, c1491l.billing);
    }

    public final int hashCode() {
        return this.billing.hashCode() + ((this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
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
        return "PaddingModifier(left=" + this.yandex + ", start=" + this.loadAd + ", top=" + this.crashlytics + ", right=" + this.amazon + ", end=" + this.purchase + ", bottom=" + this.billing + ')';
    }

    public C1491l(C14218l c14218l, C14218l c14218l2, C14218l c14218l3, C14218l c14218l4, C14218l c14218l5, C14218l c14218l6) {
        this.yandex = c14218l;
        this.loadAd = c14218l2;
        this.crashlytics = c14218l3;
        this.amazon = c14218l4;
        this.purchase = c14218l5;
        this.billing = c14218l6;
    }
}
