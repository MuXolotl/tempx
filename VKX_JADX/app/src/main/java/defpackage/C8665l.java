package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌٌٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8665l implements InterfaceC7476l, InterfaceC17673l {
    public C10111l Signature;
    public Socket adcel;
    public final C17778l admob;
    public Socket ads;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final List firebase;
    public final C13003l isPro;
    public C13247l license;
    public final C0093l loadAd;
    public final boolean metrica;
    public final boolean mopub;
    public final int purchase;
    public final C17032l remoteconfig;
    public final int smaato;
    public volatile boolean startapp;
    public final C11815l subs;
    public C13478l subscription;
    public EnumC9199l tapsense;
    public final int vip;
    public final C3097l yandex;

    public C8665l(C3097l c3097l, C0093l c0093l, int i, int i2, int i3, int i4, boolean z, C17778l c17778l, C11815l c11815l, C13003l c13003l, List list, int i5, C17032l c17032l, int i6, boolean z2) {
        this.yandex = c3097l;
        this.loadAd = c0093l;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = i3;
        this.billing = i4;
        this.mopub = z;
        this.admob = c17778l;
        this.subs = c11815l;
        this.isPro = c13003l;
        this.firebase = list;
        this.smaato = i5;
        this.remoteconfig = c17032l;
        this.vip = i6;
        this.metrica = z2;
    }

    public static C8665l smaato(C8665l c8665l, int i, C17032l c17032l, int i2, boolean z, int i3) {
        return new C8665l(c8665l.yandex, c8665l.loadAd, c8665l.crashlytics, c8665l.amazon, c8665l.purchase, c8665l.billing, c8665l.mopub, c8665l.admob, c8665l.subs, c8665l.isPro, c8665l.firebase, (i3 & 1) != 0 ? c8665l.smaato : i, (i3 & 2) != 0 ? c8665l.remoteconfig : c17032l, (i3 & 4) != 0 ? c8665l.vip : i2, (i3 & 8) != 0 ? c8665l.metrica : z);
    }

    @Override // defpackage.InterfaceC17673l
    public final C13003l admob() {
        return this.isPro;
    }

    @Override // defpackage.InterfaceC7476l
    public final C3329l amazon() {
        Socket socket;
        Socket socket2;
        if (this.adcel != null) {
            C8339l.smaato("TCP already connected");
            return null;
        }
        this.admob.f34621l.add(this);
        boolean z = false;
        try {
            try {
                AbstractC17567l abstractC17567l = this.admob.f34630l;
                InetSocketAddress inetSocketAddress = this.isPro.crashlytics;
                abstractC17567l.getClass();
                this.loadAd.getClass();
                subs();
                z = true;
                C3329l c3329l = new C3329l(this, null, null, 6);
                this.admob.f34621l.remove(this);
                return c3329l;
            } catch (IOException e) {
                C13003l c13003l = this.isPro;
                C12919l c12919l = c13003l.yandex;
                if (c13003l.loadAd.type() != Proxy.Type.DIRECT) {
                    C12919l c12919l2 = this.isPro.yandex;
                    c12919l2.mopub.connectFailed(c12919l2.admob.admob(), this.isPro.loadAd.address(), e);
                }
                AbstractC17567l abstractC17567l2 = this.admob.f34630l;
                InetSocketAddress inetSocketAddress2 = this.isPro.crashlytics;
                abstractC17567l2.getClass();
                this.loadAd.getClass();
                C3329l c3329l2 = new C3329l(this, null, e, 2);
                this.admob.f34621l.remove(this);
                if (!z && (socket2 = this.adcel) != null) {
                    AbstractC11432l.crashlytics(socket2);
                }
                return c3329l2;
            }
        } catch (Throwable th) {
            this.admob.f34621l.remove(this);
            if (!z && (socket = this.adcel) != null) {
                AbstractC11432l.crashlytics(socket);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC7476l
    public final void cancel() {
        this.startapp = true;
        Socket socket = this.adcel;
        if (socket != null) {
            AbstractC11432l.crashlytics(socket);
        }
    }

    @Override // defpackage.InterfaceC7476l
    public final C13247l crashlytics() {
        this.admob.f34625l.premium.m1811implements(this.isPro);
        C13247l c13247l = this.license;
        c13247l.getClass();
        C2014l c2014lPurchase = this.subs.purchase(this, this.firebase);
        if (c2014lPurchase != null) {
            return c2014lPurchase.yandex;
        }
        synchronized (c13247l) {
            C0093l c0093l = this.loadAd;
            c0093l.getClass();
            TimeZone timeZone = AbstractC11432l.yandex;
            ((ConcurrentLinkedQueue) c0093l.f1007l).add(c13247l);
            ((C7522l) c0093l.f1005l).amazon((C5973l) c0093l.f1004l, 0L);
            this.admob.loadAd(c13247l);
            Unit unit = Unit.INSTANCE;
        }
        this.admob.f34630l.getClass();
        return c13247l;
    }

    public final C3329l firebase() throws IOException {
        C17032l c17032l;
        C17032l c17032l2 = this.remoteconfig;
        C13003l c13003l = this.isPro;
        String str = "CONNECT " + AbstractC11432l.subs(c13003l.yandex.admob, true) + " HTTP/1.1";
        while (true) {
            C10111l c10111l = this.Signature;
            if (c10111l == null) {
                c10111l = null;
            }
            C8417l c8417l = new C8417l(null, this, c10111l);
            C10111l c10111l2 = this.Signature;
            if (c10111l2 == null) {
                c10111l2 = null;
            }
            C3446l c3446lIsPro = ((C1503l) c10111l2.f20586l).f3756l.isPro();
            long j = this.crashlytics;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c3446lIsPro.mopub(j, timeUnit);
            C10111l c10111l3 = this.Signature;
            if (c10111l3 == null) {
                c10111l3 = null;
            }
            ((C7167l) c10111l3.f20589l).f14999l.isPro().mopub(this.amazon, timeUnit);
            c8417l.smaato(c17032l2.crashlytics, str);
            c8417l.loadAd();
            C10049l c10049lPurchase = c8417l.purchase(false);
            c10049lPurchase.yandex = c17032l2;
            C18389l c18389lYandex = c10049lPurchase.yandex();
            int i = c18389lYandex.f35915l;
            long jPurchase = AbstractC11432l.purchase(c18389lYandex);
            if (jPurchase != -1) {
                C0789l c0789lFirebase = c8417l.firebase(c18389lYandex.f35911l.yandex, jPurchase);
                AbstractC11432l.mopub(c0789lFirebase, Alert.DURATION_SHOW_INDEFINITELY);
                c0789lFirebase.close();
            }
            if (i == 200) {
                c17032l = null;
                break;
            }
            if (i != 407) {
                C18262l.metrica(AbstractC0653l.vip(i, "Unexpected response code for CONNECT: "));
                return null;
            }
            C17032l c17032lRemoteconfig = c13003l.yandex.billing.remoteconfig(c13003l, c18389lYandex);
            if (c17032lRemoteconfig == null) {
                C18262l.metrica("Failed to authenticate with proxy");
                return null;
            }
            String strAmazon = c18389lYandex.f35918l.amazon("Connection");
            if (strAmazon == null) {
                strAmazon = null;
            }
            if ("close".equalsIgnoreCase(strAmazon)) {
                c17032l = c17032lRemoteconfig;
                break;
            }
            c17032l2 = c17032lRemoteconfig;
        }
        if (c17032l == null) {
            return new C3329l(this, null, null, 6);
        }
        Socket socket = this.adcel;
        if (socket != null) {
            AbstractC11432l.crashlytics(socket);
        }
        int i2 = this.smaato + 1;
        if (i2 < 21) {
            AbstractC17567l abstractC17567l = this.admob.f34630l;
            InetSocketAddress inetSocketAddress = this.isPro.crashlytics;
            abstractC17567l.getClass();
            return new C3329l(this, smaato(this, i2, c17032l, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        AbstractC17567l abstractC17567l2 = this.admob.f34630l;
        InetSocketAddress inetSocketAddress2 = this.isPro.crashlytics;
        abstractC17567l2.getClass();
        this.loadAd.getClass();
        return new C3329l(this, null, protocolException, 2);
    }

    public final void isPro(SSLSocket sSLSocket, C4800l c4800l) {
        C12919l c12919l = this.isPro.yandex;
        try {
            if (c4800l.loadAd) {
                AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
                AbstractC16844l.yandex.amazon(sSLSocket, c12919l.admob.amazon, c12919l.subs);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C13478l c13478lSubs = AbstractC11852l.subs(session);
            int i = 7;
            if (c12919l.amazon.verify(c12919l.admob.amazon, session)) {
                C14511l c14511l = c12919l.purchase;
                this.subscription = new C13478l(c13478lSubs.yandex, c13478lSubs.loadAd, c13478lSubs.crashlytics, new Cfinally(c14511l, c13478lSubs, c12919l, i));
                String str = c12919l.admob.amazon;
                Iterator it = c14511l.yandex.iterator();
                String strBilling = null;
                if (it.hasNext()) {
                    AbstractC12589l.m3424strictfp(it.next());
                    throw null;
                }
                if (c4800l.loadAd) {
                    AbstractC16844l abstractC16844l2 = AbstractC16844l.yandex;
                    strBilling = AbstractC16844l.yandex.billing(sSLSocket);
                }
                this.ads = sSLSocket;
                this.Signature = new C10111l(new C10038l(sSLSocket));
                this.tapsense = strBilling != null ? AbstractC13880l.loadAd(strBilling) : EnumC9199l.HTTP_1_1;
                AbstractC16844l abstractC16844l3 = AbstractC16844l.yandex;
                AbstractC16844l.yandex.getClass();
                return;
            }
            List listYandex = c13478lSubs.yandex();
            if (listYandex.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c12919l.admob.amazon + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) listYandex.get(0);
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(c12919l.admob.amazon);
            sb.append(" not verified:\n            |    certificate: ");
            C14511l c14511l2 = C14511l.crashlytics;
            sb.append(AbstractC13041l.isPro(x509Certificate));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(AbstractC16901l.m4232new(C15931l.yandex(x509Certificate, 7), C15931l.yandex(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(AbstractC1833l.smaato(sb.toString()));
        } catch (Throwable th) {
            AbstractC16844l abstractC16844l4 = AbstractC16844l.yandex;
            AbstractC16844l.yandex.getClass();
            AbstractC11432l.crashlytics(sSLSocket);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC7476l
    public final InterfaceC7476l loadAd() {
        return new C8665l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, this.remoteconfig, this.vip, this.metrica);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x014d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0151  */
    @Override // defpackage.InterfaceC7476l
    public final C3329l mopub() throws Throwable {
        C8665l c8665lRemoteconfig;
        Socket socket;
        C8665l c8665l;
        Socket socket2 = this.adcel;
        C8665l c8665l2 = null;
        if (socket2 == null) {
            C8339l.metrica("TCP not connected");
            return null;
        }
        if (yandex()) {
            C8339l.smaato("already connected");
            return null;
        }
        List list = this.isPro.yandex.isPro;
        this.admob.f34621l.add(this);
        boolean z = false;
        try {
            try {
                if (this.remoteconfig != null) {
                    C3329l c3329lFirebase = firebase();
                    if (c3329lFirebase.loadAd != null || c3329lFirebase.crashlytics != null) {
                        this.admob.f34621l.remove(this);
                        Socket socket3 = this.ads;
                        if (socket3 != null) {
                            AbstractC11432l.crashlytics(socket3);
                        }
                        AbstractC11432l.crashlytics(socket2);
                        return c3329lFirebase;
                    }
                }
                C12919l c12919l = this.isPro.yandex;
                if (c12919l.crashlytics != null) {
                    C10111l c10111l = this.Signature;
                    if (c10111l == null) {
                        c10111l = null;
                    }
                    if (((C1503l) c10111l.f20586l).f3755l.subs()) {
                        C10111l c10111l2 = this.Signature;
                        if (c10111l2 == null) {
                            c10111l2 = null;
                        }
                        if (((C7167l) c10111l2.f20589l).f14998l.subs()) {
                            this.admob.f34630l.getClass();
                            C12919l c12919l2 = this.isPro.yandex;
                            SSLSocketFactory sSLSocketFactory = c12919l2.crashlytics;
                            C6705l c6705l = c12919l2.admob;
                            SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket2, c6705l.amazon, c6705l.purchase, true);
                            C8665l c8665lVip = vip(sSLSocket, list);
                            C4800l c4800l = (C4800l) list.get(c8665lVip.vip);
                            c8665lRemoteconfig = c8665lVip.remoteconfig(sSLSocket, list);
                            try {
                                c4800l.yandex(sSLSocket, c8665lVip.metrica);
                                isPro(sSLSocket, c4800l);
                                this.admob.f34630l.getClass();
                                c8665l = c8665lRemoteconfig;
                            } catch (IOException e) {
                                e = e;
                                AbstractC17567l abstractC17567l = this.admob.f34630l;
                                InetSocketAddress inetSocketAddress = this.isPro.crashlytics;
                                abstractC17567l.getClass();
                                this.loadAd.getClass();
                                if (this.mopub && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    c8665l2 = c8665lRemoteconfig;
                                }
                                C3329l c3329l = new C3329l(this, c8665l2, e);
                                this.admob.f34621l.remove(this);
                                if (!z) {
                                    socket = this.ads;
                                    if (socket != null) {
                                        AbstractC11432l.crashlytics(socket);
                                    }
                                    AbstractC11432l.crashlytics(socket2);
                                }
                                return c3329l;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.ads = socket2;
                List list2 = c12919l.subs;
                EnumC9199l enumC9199l = EnumC9199l.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(enumC9199l)) {
                    enumC9199l = EnumC9199l.HTTP_1_1;
                }
                this.tapsense = enumC9199l;
                c8665l = null;
                try {
                    C3097l c3097l = this.yandex;
                    C0093l c0093l = this.loadAd;
                    C13003l c13003l = this.isPro;
                    Socket socket4 = this.ads;
                    C13478l c13478l = this.subscription;
                    EnumC9199l enumC9199l2 = this.tapsense;
                    C10111l c10111l3 = this.Signature;
                    if (c10111l3 == null) {
                        c10111l3 = null;
                    }
                    c0093l.getClass();
                    C13247l c13247l = new C13247l(c3097l, c13003l, socket2, socket4, c13478l, enumC9199l2, c10111l3);
                    this.license = c13247l;
                    c13247l.isPro();
                    AbstractC17567l abstractC17567l2 = this.admob.f34630l;
                    InetSocketAddress inetSocketAddress2 = this.isPro.crashlytics;
                    abstractC17567l2.getClass();
                    try {
                        C3329l c3329l2 = new C3329l(this, null, null, 6);
                        this.admob.f34621l.remove(this);
                        return c3329l2;
                    } catch (IOException e2) {
                        e = e2;
                        z = true;
                        c8665lRemoteconfig = c8665l;
                        AbstractC17567l abstractC17567l3 = this.admob.f34630l;
                        InetSocketAddress inetSocketAddress3 = this.isPro.crashlytics;
                        abstractC17567l3.getClass();
                        this.loadAd.getClass();
                        if (this.mopub) {
                            c8665l2 = c8665lRemoteconfig;
                        }
                        C3329l c3329l3 = new C3329l(this, c8665l2, e);
                        this.admob.f34621l.remove(this);
                        if (!z) {
                            socket = this.ads;
                            if (socket != null) {
                                AbstractC11432l.crashlytics(socket);
                            }
                            AbstractC11432l.crashlytics(socket2);
                        }
                        return c3329l3;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        this.admob.f34621l.remove(this);
                        if (!z) {
                            Socket socket5 = this.ads;
                            if (socket5 != null) {
                                AbstractC11432l.crashlytics(socket5);
                            }
                            AbstractC11432l.crashlytics(socket2);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e = e4;
                c8665lRemoteconfig = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final C8665l remoteconfig(SSLSocket sSLSocket, List list) {
        String[] strArr;
        String[] strArr2;
        int i = this.vip;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            C4800l c4800l = (C4800l) list.get(i2);
            if (c4800l.yandex && (((strArr = c4800l.amazon) == null || AbstractC7712l.billing(strArr, sSLSocket.getEnabledProtocols(), C5298l.f11412l)) && ((strArr2 = c4800l.crashlytics) == null || AbstractC7712l.billing(strArr2, sSLSocket.getEnabledCipherSuites(), C5628l.crashlytics)))) {
                return smaato(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    public final void subs() throws IOException {
        Proxy.Type type = this.isPro.loadAd.type();
        int i = type == null ? -1 : AbstractC0570l.yandex[type.ordinal()];
        Socket socketCreateSocket = (i == 1 || i == 2) ? this.isPro.yandex.loadAd.createSocket() : new Socket(this.isPro.loadAd);
        this.adcel = socketCreateSocket;
        if (this.startapp) {
            C18262l.metrica("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.billing);
        try {
            AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
            AbstractC16844l.yandex.purchase(socketCreateSocket, this.isPro.crashlytics, this.purchase);
            try {
                this.Signature = new C10111l(new C10038l(socketCreateSocket));
            } catch (NullPointerException e) {
                if (AbstractC8576l.yandex(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.isPro.crashlytics);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final C8665l vip(SSLSocket sSLSocket, List list) throws UnknownServiceException {
        if (this.vip != -1) {
            return this;
        }
        C8665l c8665lRemoteconfig = remoteconfig(sSLSocket, list);
        if (c8665lRemoteconfig != null) {
            return c8665lRemoteconfig;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.metrica);
        sb.append(", modes=");
        sb.append(list);
        String string = Arrays.toString(sSLSocket.getEnabledProtocols());
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // defpackage.InterfaceC7476l
    public final boolean yandex() {
        return this.tapsense != null;
    }

    @Override // defpackage.InterfaceC17673l
    public final void purchase() {
    }

    @Override // defpackage.InterfaceC17673l
    public final void billing(C17778l c17778l, IOException iOException) {
    }
}
