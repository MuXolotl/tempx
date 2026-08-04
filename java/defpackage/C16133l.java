package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16133l implements InterfaceC3525l {
    public final C13258l yandex = C13258l.f26032l;
    public final Function1 loadAd = C4329l.mopub;
    public final boolean crashlytics = true;
    public final boolean amazon = true;

    @Override // defpackage.InterfaceC3525l
    public final InterfaceC3773l yandex(C6669l c6669l, C15106l c15106l) {
        if (!AbstractC8576l.yandex(c6669l.loadAd, "image/svg+xml")) {
            InterfaceC9473l interfaceC9473lMo2151l = c6669l.yandex.mo2151l();
            if (!interfaceC9473lMo2151l.mo716l(0L, AbstractC10650l.loadAd) || interfaceC9473lMo2151l.mo719l(1024L, AbstractC10650l.yandex) == -1) {
                return null;
            }
        }
        return new C4329l(c6669l.yandex, c15106l, this.yandex, this.loadAd, this.crashlytics, this.amazon);
    }
}
