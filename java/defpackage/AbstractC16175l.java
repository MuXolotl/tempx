package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16175l {
    public Function1 yandex;

    public void amazon(C3006l c3006l) {
        this.yandex = c3006l;
    }

    public final void crashlytics() {
        Function1 function1LoadAd = loadAd();
        if (function1LoadAd != null) {
            function1LoadAd.invoke(this);
        }
    }

    public Function1 loadAd() {
        return this.yandex;
    }

    public abstract void yandex(InterfaceC13349l interfaceC13349l);
}
