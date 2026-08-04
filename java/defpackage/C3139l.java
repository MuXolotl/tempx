package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3139l implements InterfaceC12001l {
    public final InterfaceC12001l loadAd;
    public final InterfaceC12001l yandex;

    public C3139l(InterfaceC12001l interfaceC12001l, InterfaceC12001l interfaceC12001l2) {
        this.yandex = interfaceC12001l;
        this.loadAd = interfaceC12001l2;
    }

    @Override // defpackage.InterfaceC12001l
    public final boolean admob(Function1 function1) {
        return this.yandex.admob(function1) || this.loadAd.admob(function1);
    }

    @Override // defpackage.InterfaceC12001l
    public final /* synthetic */ InterfaceC12001l billing(InterfaceC12001l interfaceC12001l) {
        return AbstractC2812l.crashlytics(this, interfaceC12001l);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3139l)) {
            return false;
        }
        C3139l c3139l = (C3139l) obj;
        return AbstractC8576l.yandex(this.yandex, c3139l.yandex) && AbstractC8576l.yandex(this.loadAd, c3139l.loadAd);
    }

    public final int hashCode() {
        return (this.loadAd.hashCode() * 31) + this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC12001l
    public final boolean mopub(C2613l c2613l) {
        return this.yandex.mopub(c2613l) && this.loadAd.mopub(c2613l);
    }

    @Override // defpackage.InterfaceC12001l
    public final Object purchase(Object obj, Function2 function2) {
        return this.loadAd.purchase(this.yandex.purchase(obj, function2), function2);
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("["), (String) purchase("", new C3755l(16)), ']');
    }
}
