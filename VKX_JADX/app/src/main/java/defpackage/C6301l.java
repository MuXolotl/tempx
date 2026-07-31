package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lٌؙؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6301l implements InterfaceC9354l {
    private volatile C15957l closed;
    public final InterfaceC14189l loadAd;

    public C6301l(InterfaceC14189l interfaceC14189l) {
        this.loadAd = interfaceC14189l;
    }

    @Override // defpackage.InterfaceC9354l
    public final boolean admob() {
        return this.loadAd.subs();
    }

    @Override // defpackage.InterfaceC9354l
    public final Object amazon(int i, AbstractC0283l abstractC0283l) throws Throwable {
        Throwable thLoadAd = loadAd();
        if (thLoadAd == null) {
            return Boolean.valueOf(this.loadAd.request(i));
        }
        throw thLoadAd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC9354l
    public final Throwable loadAd() {
        Throwable th;
        C15957l c15957l = this.closed;
        if (c15957l == null || (th = c15957l.yandex) == 0) {
            return null;
        }
        if (th instanceof InterfaceC14404l) {
            return ((InterfaceC14404l) th).yandex();
        }
        return th instanceof CancellationException ? AbstractC4952l.yandex(((CancellationException) th).getMessage(), c15957l.yandex) : new C8413l(th);
    }

    @Override // defpackage.InterfaceC9354l
    public final C18476l mopub() throws Throwable {
        Throwable thLoadAd = loadAd();
        if (thLoadAd == null) {
            return this.loadAd.crashlytics();
        }
        throw thLoadAd;
    }

    @Override // defpackage.InterfaceC9354l
    public final void yandex(Throwable th) throws Exception {
        String message;
        if (this.closed != null) {
            return;
        }
        this.loadAd.close();
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new C15957l(new IOException(message, th));
    }
}
