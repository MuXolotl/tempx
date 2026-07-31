package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lَْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2525l implements InterfaceC1837l {
    public final InterfaceC1837l loadAd;
    public final AtomicBoolean yandex = new AtomicBoolean(false);

    public C2525l(InterfaceC1837l interfaceC1837l) {
        this.loadAd = interfaceC1837l;
    }

    public final void loadAd() {
        this.yandex.set(true);
    }

    @Override // defpackage.InterfaceC1837l
    public final void yandex(C10814l c10814l) {
        if (this.yandex.get()) {
            return;
        }
        this.loadAd.yandex(c10814l);
    }
}
