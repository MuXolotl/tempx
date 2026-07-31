package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lّٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15629l extends AbstractC13871l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final Executor f30554l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public InterfaceC11792l f30555l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C1282l f30556l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final Object f30557l = new Object();

    public C15629l(Executor executor) {
        this.f30554l = executor;
    }

    @Override // defpackage.AbstractC13871l
    public final void crashlytics() {
        synchronized (this.f30557l) {
            try {
                InterfaceC11792l interfaceC11792l = this.f30555l;
                if (interfaceC11792l != null) {
                    interfaceC11792l.close();
                    this.f30555l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC13871l
    public final void purchase(InterfaceC11792l interfaceC11792l) {
        synchronized (this.f30557l) {
            try {
                if (!this.f27129l) {
                    interfaceC11792l.close();
                    return;
                }
                if (this.f30556l != null) {
                    if (interfaceC11792l.mo1829const().crashlytics() <= this.f30556l.f24884l.mo1829const().crashlytics()) {
                        interfaceC11792l.close();
                    } else {
                        InterfaceC11792l interfaceC11792l2 = this.f30555l;
                        if (interfaceC11792l2 != null) {
                            interfaceC11792l2.close();
                        }
                        this.f30555l = interfaceC11792l;
                    }
                    return;
                }
                C1282l c1282l = new C1282l(interfaceC11792l, this);
                this.f30556l = c1282l;
                ListenableFuture listenableFutureLoadAd = loadAd(c1282l);
                C13161l c13161l = new C13161l(c1282l);
                listenableFutureLoadAd.yandex(new RunnableC9929l(listenableFutureLoadAd, c13161l, 0), AbstractC12272l.yandex());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC13871l
    public final InterfaceC11792l yandex(InterfaceC12679l interfaceC12679l) {
        return interfaceC12679l.smaato();
    }
}
