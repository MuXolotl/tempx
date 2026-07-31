package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13072l implements InterfaceC3102l {
    public final Function0 amazon;
    public final C17308l crashlytics;
    public final InterfaceC1489l loadAd;
    public final C8645l purchase = new C8645l(this, 0);
    public final C6935l yandex;

    public C13072l(C6935l c6935l, InterfaceC17807l interfaceC17807l, C17308l c17308l, Function0 function0) {
        this.yandex = c6935l;
        this.loadAd = interfaceC17807l;
        this.crashlytics = c17308l;
        this.amazon = function0;
    }

    @Override // defpackage.InterfaceC3102l
    public final InterfaceC1489l amazon() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC3102l
    public final C17308l crashlytics() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC3102l
    public final InterfaceC12499l loadAd() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC3102l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC3102l
    public final C6935l yandex() {
        return this.yandex;
    }
}
