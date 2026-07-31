package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْۦۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13810l implements InterfaceC13898l {
    public final C15578l crashlytics;
    public final Function1 loadAd;
    public final Function1 yandex;

    public C13810l(Function1 function1, Function1 function2, C15578l c15578l) {
        this.yandex = function1;
        this.loadAd = function2;
        this.crashlytics = c15578l;
    }

    @Override // defpackage.InterfaceC13898l
    public final Function1 getKey() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC13898l
    public final Function1 yandex() {
        return this.loadAd;
    }
}
