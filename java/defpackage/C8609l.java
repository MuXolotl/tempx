package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؙِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8609l implements InterfaceC13898l {
    public final C15578l amazon;
    public final Function1 crashlytics;
    public final Function1 loadAd;
    public final Function1 yandex;

    public C8609l(Function1 function1, Function1 function2, Function1 function3, C15578l c15578l) {
        this.yandex = function1;
        this.loadAd = function2;
        this.crashlytics = function3;
        this.amazon = c15578l;
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
