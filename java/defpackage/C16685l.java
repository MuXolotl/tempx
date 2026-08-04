package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖۣ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16685l {
    public final InterfaceC1220l amazon;
    public final C9395l crashlytics;
    public final C7686l loadAd;
    public final Function1 yandex;

    public C16685l(Function1 function1, C7686l c7686l, C9395l c9395l, InterfaceC1220l interfaceC1220l) {
        this.yandex = function1;
        this.loadAd = c7686l;
        this.crashlytics = c9395l;
        this.amazon = interfaceC1220l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C16685l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C16685l c16685l = (C16685l) obj;
        return this.crashlytics == c16685l.crashlytics && this.loadAd == c16685l.loadAd;
    }

    public final int hashCode() {
        return (this.loadAd.hashCode() + (this.crashlytics.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.yandex + ", graphStateToCameraStateAdapter=" + this.loadAd + ", sessionConfigAdapter=" + this.crashlytics + ", sessionProcessor=null, lazyCreationResult=" + this.amazon + ')';
    }
}
