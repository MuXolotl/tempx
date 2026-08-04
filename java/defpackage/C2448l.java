package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: lؙؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2448l implements InterfaceC2332l {
    public InterfaceC2332l loadAd;
    public final InterfaceC8982l yandex;

    public C2448l(InterfaceC8982l interfaceC8982l) {
        this.yandex = interfaceC8982l;
    }

    @Override // defpackage.InterfaceC2332l
    public final boolean amazon(SSLSocket sSLSocket) {
        return this.yandex.amazon(sSLSocket);
    }

    @Override // defpackage.InterfaceC2332l
    public final void crashlytics(SSLSocket sSLSocket, String str, List list) {
        InterfaceC2332l interfaceC2332lPurchase = purchase(sSLSocket);
        if (interfaceC2332lPurchase != null) {
            interfaceC2332lPurchase.crashlytics(sSLSocket, str, list);
        }
    }

    @Override // defpackage.InterfaceC2332l
    public final String loadAd(SSLSocket sSLSocket) {
        InterfaceC2332l interfaceC2332lPurchase = purchase(sSLSocket);
        if (interfaceC2332lPurchase != null) {
            return interfaceC2332lPurchase.loadAd(sSLSocket);
        }
        return null;
    }

    public final synchronized InterfaceC2332l purchase(SSLSocket sSLSocket) {
        try {
            if (this.loadAd == null && this.yandex.amazon(sSLSocket)) {
                this.loadAd = this.yandex.isPro(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC2332l
    public final boolean yandex() {
        return true;
    }
}
