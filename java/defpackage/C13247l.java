package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍْؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13247l extends AbstractC10039l implements InterfaceC17673l {
    public final C10111l admob;
    public final Socket amazon;
    public final C13478l billing;
    public final C13003l crashlytics;
    public boolean firebase;
    public boolean isPro;
    public final C3097l loadAd;
    public final EnumC9199l mopub;
    public final Socket purchase;
    public int remoteconfig;
    public int smaato;
    public C8050l subs;
    public int vip;
    public int metrica = 1;
    public final ArrayList startapp = new ArrayList();
    public long adcel = Long.MAX_VALUE;

    public C13247l(C3097l c3097l, C13003l c13003l, Socket socket, Socket socket2, C13478l c13478l, EnumC9199l enumC9199l, C10111l c10111l) {
        this.loadAd = c3097l;
        this.crashlytics = c13003l;
        this.amazon = socket;
        this.purchase = socket2;
        this.billing = c13478l;
        this.mopub = enumC9199l;
        this.admob = c10111l;
    }

    public static void crashlytics(C11610l c11610l, C13003l c13003l, IOException iOException) {
        if (c13003l.loadAd.type() != Proxy.Type.DIRECT) {
            C12919l c12919l = c13003l.yandex;
            c12919l.mopub.connectFailed(c12919l.admob.admob(), c13003l.loadAd.address(), iOException);
        }
        C5501l c5501l = c11610l.premium;
        synchronized (c5501l) {
            ((LinkedHashSet) c5501l.f11764l).add(c13003l);
        }
    }

    @Override // defpackage.InterfaceC17673l
    public final C13003l admob() {
        return this.crashlytics;
    }

    public final void amazon() {
        synchronized (this) {
            this.remoteconfig++;
        }
    }

    @Override // defpackage.InterfaceC17673l
    public final void billing(C17778l c17778l, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof C5333l)) {
                    if (!(this.subs != null) || (iOException instanceof C10085l)) {
                        this.isPro = true;
                        if (this.remoteconfig == 0) {
                            if (iOException != null) {
                                crashlytics(c17778l.f34625l, this.crashlytics, iOException);
                            }
                            this.smaato++;
                        }
                    }
                } else if (((C5333l) iOException).f11471l == 8) {
                    int i = this.vip + 1;
                    this.vip = i;
                    if (i > 1) {
                        this.isPro = true;
                        this.smaato++;
                    }
                } else if (((C5333l) iOException).f11471l != 9 || !c17778l.f34637l) {
                    this.isPro = true;
                    this.smaato++;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC17673l
    public final void cancel() {
        AbstractC11432l.crashlytics(this.amazon);
    }

    public final void isPro() throws SocketException {
        this.adcel = System.nanoTime();
        EnumC9199l enumC9199l = this.mopub;
        if (enumC9199l == EnumC9199l.HTTP_2 || enumC9199l == EnumC9199l.H2_PRIOR_KNOWLEDGE) {
            this.purchase.setSoTimeout(0);
            C8565l c8565l = C8565l.f17667l;
            C12682l c12682l = C12682l.yandex;
            C11644l c11644l = new C11644l(this.loadAd);
            C10111l c10111l = this.admob;
            String str = this.crashlytics.yandex.admob.amazon;
            c11644l.f23357l = c10111l;
            c11644l.f23361l = AbstractC11432l.loadAd + ' ' + str;
            c11644l.f23360l = this;
            c11644l.f23362l = c12682l;
            C8050l c8050l = new C8050l(c11644l);
            this.subs = c8050l;
            C8463l c8463l = C8050l.f16752l;
            this.metrica = (c8463l.yandex & 8) != 0 ? c8463l.loadAd[3] : Alert.DURATION_SHOW_INDEFINITELY;
            C13987l c13987l = c8050l.f16777l;
            synchronized (c13987l) {
                try {
                    if (c13987l.f27292l) {
                        throw new IOException("closed");
                    }
                    Logger logger = C13987l.f27287l;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC11432l.amazon(">> CONNECTION " + AbstractC14207l.yandex.billing(), new Object[0]));
                    }
                    c13987l.f27290l.appmetrica(AbstractC14207l.yandex);
                    c13987l.f27290l.flush();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c8050l.f16777l.signatures(c8050l.f16765l);
            int iYandex = c8050l.f16765l.yandex();
            if (iYandex != 65535) {
                c8050l.f16777l.inmobi(0, iYandex - 65535);
            }
            C7522l.crashlytics(c8050l.f16756l.amazon(), c8050l.f16755l, 0L, c8050l.f16761l, 6);
        }
    }

    @Override // defpackage.AbstractC10039l
    public final void loadAd(C0374l c0374l) {
        c0374l.crashlytics(8, null);
    }

    public final boolean mopub(C12919l c12919l, List list) {
        C6705l c6705l = c12919l.admob;
        TimeZone timeZone = AbstractC11432l.yandex;
        if (this.startapp.size() < this.metrica && !this.isPro) {
            C13003l c13003l = this.crashlytics;
            C12919l c12919l2 = c13003l.yandex;
            C12919l c12919l3 = c13003l.yandex;
            if (c12919l2.yandex(c12919l)) {
                if (!AbstractC8576l.yandex(c6705l.amazon, c12919l3.admob.amazon)) {
                    if (this.subs != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C13003l c13003l2 = (C13003l) it.next();
                            Proxy.Type type = c13003l2.loadAd.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && c13003l.loadAd.type() == type2 && AbstractC8576l.yandex(c13003l.crashlytics, c13003l2.crashlytics)) {
                                if (c12919l.amazon != C15931l.yandex) {
                                    break;
                                }
                                TimeZone timeZone2 = AbstractC11432l.yandex;
                                C6705l c6705l2 = c12919l3.admob;
                                int i = c6705l.purchase;
                                String str = c6705l.amazon;
                                if (i != c6705l2.purchase) {
                                    break;
                                }
                                boolean zYandex = AbstractC8576l.yandex(str, c6705l2.amazon);
                                C13478l c13478l = this.billing;
                                if (!zYandex) {
                                    if (!this.firebase && c13478l != null) {
                                        List listYandex = c13478l.yandex();
                                        if (listYandex.isEmpty() || !C15931l.loadAd(str, (X509Certificate) listYandex.get(0))) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    C14511l c14511l = c12919l.purchase;
                                    c13478l.yandex();
                                    Iterator it2 = c14511l.yandex.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    AbstractC12589l.m3424strictfp(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC17673l
    public final void purchase() {
        synchronized (this) {
            this.isPro = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean subs(boolean z) {
        long j;
        TimeZone timeZone = AbstractC11432l.yandex;
        long jNanoTime = System.nanoTime();
        if (this.amazon.isClosed() || this.purchase.isClosed() || this.purchase.isInputShutdown() || this.purchase.isOutputShutdown()) {
            return false;
        }
        C8050l c8050l = this.subs;
        if (c8050l != null) {
            return c8050l.mopub(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.adcel;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.purchase;
        C1503l c1503l = (C1503l) this.admob.f20586l;
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !c1503l.subs();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C13003l c13003l = this.crashlytics;
        sb.append(c13003l.yandex.admob.amazon);
        sb.append(':');
        sb.append(c13003l.yandex.admob.purchase);
        sb.append(", proxy=");
        sb.append(c13003l.loadAd);
        sb.append(" hostAddress=");
        sb.append(c13003l.crashlytics);
        sb.append(" cipherSuite=");
        C13478l c13478l = this.billing;
        sb.append(c13478l != null ? c13478l.loadAd : "none");
        sb.append(" protocol=");
        sb.append(this.mopub);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.AbstractC10039l
    public final void yandex(C8463l c8463l) {
        synchronized (this) {
            this.metrica = (c8463l.yandex & 8) != 0 ? c8463l.loadAd[3] : Alert.DURATION_SHOW_INDEFINITELY;
            Unit unit = Unit.INSTANCE;
        }
    }
}
