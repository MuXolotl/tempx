package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؔٗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2663l implements InterfaceC3102l {
    public final C8645l crashlytics = new C8645l(this, 1);
    public final Function0 loadAd;
    public final C6935l yandex;

    public C2663l(C6935l c6935l, Function0 function0) {
        this.yandex = c6935l;
        this.loadAd = function0;
    }

    @Override // defpackage.InterfaceC3102l
    public final InterfaceC1489l amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC3102l
    public final C17308l crashlytics() {
        return null;
    }

    @Override // defpackage.InterfaceC3102l
    public final InterfaceC12499l loadAd() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC3102l
    public final boolean purchase() {
        return true;
    }

    @Override // defpackage.InterfaceC3102l
    public final C6935l yandex() {
        return this.yandex;
    }
}
