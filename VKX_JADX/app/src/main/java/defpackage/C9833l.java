package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9833l extends View.DragShadowBuilder {
    public final Function1 crashlytics;
    public final long loadAd;
    public final C15294l yandex;

    public C9833l(C15294l c15294l, long j, Function1 function1) {
        this.yandex = c15294l;
        this.loadAd = j;
        this.crashlytics = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C13601l c13601l = new C13601l();
        Canvas canvas2 = AbstractC10071l.yandex;
        C2151l c2151l = new C2151l();
        c2151l.yandex = canvas;
        C4417l c4417l = c13601l.f26630l;
        InterfaceC13490l interfaceC13490l = c4417l.yandex;
        EnumC9931l enumC9931l = c4417l.loadAd;
        InterfaceC14859l interfaceC14859l = c4417l.crashlytics;
        long j = c4417l.amazon;
        c4417l.yandex = this.yandex;
        c4417l.loadAd = EnumC9931l.f20223l;
        c4417l.crashlytics = c2151l;
        c4417l.amazon = this.loadAd;
        c2151l.mopub();
        this.crashlytics.invoke(c13601l);
        c2151l.ads();
        c4417l.yandex = interfaceC13490l;
        c4417l.loadAd = enumC9931l;
        c4417l.crashlytics = interfaceC14859l;
        c4417l.amazon = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.loadAd;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        C15294l c15294l = this.yandex;
        point.set(AbstractC9361l.yandex(c15294l, fIntBitsToFloat / c15294l.loadAd()), AbstractC9361l.yandex(c15294l, Float.intBitsToFloat((int) (j & 4294967295L)) / c15294l.loadAd()));
        point2.set(point.x / 2, point.y / 2);
    }
}
