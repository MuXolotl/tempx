package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lًؚِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7846l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f16364l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f16365l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC9473l f16366l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f16367l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f16368l;

    public C7846l(InterfaceC9473l interfaceC9473l) {
        this.f16366l = interfaceC9473l;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f16368l;
            InterfaceC9473l interfaceC9473l = this.f16366l;
            if (i3 == 0) {
                interfaceC9473l.skip(this.f16367l);
                this.f16367l = 0;
                if ((this.f16365l & 4) == 0) {
                    i = this.f16364l;
                    int iRemoteconfig = AbstractC7712l.remoteconfig(interfaceC9473l);
                    this.f16368l = iRemoteconfig;
                    int i4 = interfaceC9473l.readByte() & 255;
                    this.f16365l = interfaceC9473l.readByte() & 255;
                    Logger logger = C4593l.f9330l;
                    if (logger.isLoggable(Level.FINE)) {
                        C3844l c3844l = AbstractC14207l.yandex;
                        logger.fine(AbstractC14207l.loadAd(true, this.f16364l, iRemoteconfig, i4, this.f16365l));
                    }
                    i2 = interfaceC9473l.readInt() & Alert.DURATION_SHOW_INDEFINITELY;
                    this.f16364l = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jAd = interfaceC9473l.ad(c0869l, Math.min(j, i3));
                if (jAd != -1) {
                    this.f16368l -= (int) jAd;
                    return jAd;
                }
            }
            return -1L;
        } while (i2 == i);
        C18262l.metrica("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f16366l.isPro();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
