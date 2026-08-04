package defpackage;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: lِْۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11815l {
    public final boolean admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final C17778l firebase;
    public final C5501l isPro;
    public final C0093l loadAd;
    public C13003l metrica;
    public final boolean mopub;
    public final int purchase;
    public C7375l remoteconfig;
    public final boolean smaato;
    public final C11315l startapp = new C11315l();
    public final C12919l subs;
    public C4854l vip;
    public final C3097l yandex;

    public C11815l(C3097l c3097l, C0093l c0093l, int i, int i2, int i3, int i4, boolean z, boolean z2, C12919l c12919l, C5501l c5501l, C17778l c17778l, C17032l c17032l) {
        this.yandex = c3097l;
        this.loadAd = c0093l;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = i3;
        this.billing = i4;
        this.mopub = z;
        this.admob = z2;
        this.subs = c12919l;
        this.isPro = c5501l;
        this.firebase = c17778l;
        this.smaato = !AbstractC8576l.yandex(c17032l.loadAd, "GET");
    }

    public final C8665l amazon(C13003l c13003l, ArrayList arrayList) throws UnknownServiceException {
        EnumC9199l enumC9199l = EnumC9199l.H2_PRIOR_KNOWLEDGE;
        C12919l c12919l = c13003l.yandex;
        if (c12919l.crashlytics == null) {
            if (!c12919l.isPro.contains(C4800l.billing)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = c13003l.yandex.admob.amazon;
            AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
            if (!AbstractC16844l.yandex.admob(str)) {
                throw new UnknownServiceException(AbstractC15560l.Signature("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c12919l.subs.contains(enumC9199l)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        C17032l c17032l = null;
        if (c13003l.loadAd.type() == Proxy.Type.HTTP) {
            C12919l c12919l2 = c13003l.yandex;
            if (c12919l2.crashlytics != null || c12919l2.subs.contains(enumC9199l)) {
                C11644l c11644l = new C11644l(28);
                c11644l.f23358l = c13003l.yandex.admob;
                c11644l.m3145l("CONNECT", null);
                C12919l c12919l3 = c13003l.yandex;
                ((C16543l) c11644l.f23361l).signatures("Host", AbstractC11432l.subs(c12919l3.admob, true));
                ((C16543l) c11644l.f23361l).signatures("Proxy-Connection", "Keep-Alive");
                ((C16543l) c11644l.f23361l).signatures("User-Agent", "okhttp/5.4.0");
                C17032l c17032l2 = new C17032l(c11644l);
                C8552l c8552l = AbstractC6897l.f14438l;
                C14529l c14529l = InterfaceC14341l.f28087l;
                C16543l c16543l = new C16543l((byte) 0, 13);
                EnumC9199l enumC9199l2 = EnumC9199l.HTTP_1_1;
                c16543l.signatures("Proxy-Authenticate", "OkHttp-Preemptive");
                C17032l c17032lRemoteconfig = c12919l3.billing.remoteconfig(c13003l, new C18389l(c17032l2, enumC9199l2, "Preemptive Authenticate", 407, null, c16543l.smaato(), c8552l, null, null, null, null, -1L, -1L, null, c14529l));
                c17032l = c17032lRemoteconfig == null ? c17032l2 : c17032lRemoteconfig;
            }
        }
        return new C8665l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.firebase, this, c13003l, arrayList, 0, c17032l, -1, false);
    }

    public final C8665l crashlytics() throws IOException {
        String hostName;
        int port;
        List listM2415super;
        boolean zContains;
        C13003l c13003l = this.metrica;
        if (c13003l != null) {
            this.metrica = null;
            return amazon(c13003l, null);
        }
        C7375l c7375l = this.remoteconfig;
        if (c7375l != null && c7375l.yandex < c7375l.loadAd.size()) {
            int i = c7375l.yandex;
            ArrayList arrayList = c7375l.loadAd;
            if (i >= arrayList.size()) {
                C4875l.firebase();
                return null;
            }
            int i2 = c7375l.yandex;
            c7375l.yandex = i2 + 1;
            return amazon((C13003l) arrayList.get(i2), null);
        }
        C4854l c4854l = this.vip;
        if (c4854l == null) {
            c4854l = new C4854l(this.subs, this.isPro, this.firebase, this.admob);
            this.vip = c4854l;
        }
        if (!c4854l.crashlytics()) {
            C18262l.metrica("exhausted all routes");
            return null;
        }
        if (!c4854l.crashlytics()) {
            C4875l.firebase();
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        while (c4854l.loadAd < ((List) c4854l.billing).size()) {
            if (c4854l.loadAd >= ((List) c4854l.billing).size()) {
                throw new SocketException("No route to " + ((C12919l) c4854l.crashlytics).admob.amazon + "; exhausted proxy configurations: " + ((List) c4854l.billing));
            }
            List list = (List) c4854l.billing;
            int i3 = c4854l.loadAd;
            c4854l.loadAd = i3 + 1;
            Proxy proxy = (Proxy) list.get(i3);
            ArrayList arrayList3 = new ArrayList();
            c4854l.mopub = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                C6705l c6705l = ((C12919l) c4854l.crashlytics).admob;
                hostName = c6705l.amazon;
                port = c6705l.purchase;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    C8936l.smaato(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                    return null;
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostName, port));
            } else {
                if (AbstractC3623l.yandex.amazon(hostName)) {
                    listM2415super = Collections.singletonList(InetAddress.getByName(hostName));
                } else {
                    ((C17778l) c4854l.purchase).f34630l.getClass();
                    ((C12919l) c4854l.crashlytics).yandex.getClass();
                    try {
                        listM2415super = AbstractC8669l.m2415super(InetAddress.getAllByName(hostName));
                        if (listM2415super.isEmpty()) {
                            throw new UnknownHostException(((C12919l) c4854l.crashlytics).yandex + " returned no addresses for " + hostName);
                        }
                        ((C17778l) c4854l.purchase).f34630l.getClass();
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                if (c4854l.yandex && listM2415super.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listM2415super) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = AbstractC7712l.yandex;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        C10227l c10227lAdmob = AbstractC14055l.admob();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                c10227lAdmob.add(it.next());
                            }
                            if (it2.hasNext()) {
                                c10227lAdmob.add(it2.next());
                            }
                        }
                        listM2415super = AbstractC14055l.purchase(c10227lAdmob);
                    }
                }
                Iterator it3 = listM2415super.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = ((List) c4854l.mopub).iterator();
            while (it4.hasNext()) {
                C13003l c13003l2 = new C13003l((C12919l) c4854l.crashlytics, proxy, (InetSocketAddress) it4.next());
                C5501l c5501l = (C5501l) c4854l.amazon;
                synchronized (c5501l) {
                    zContains = ((LinkedHashSet) c5501l.f11764l).contains(c13003l2);
                }
                if (zContains) {
                    ((ArrayList) c4854l.admob).add(c13003l2);
                } else {
                    arrayList2.add(c13003l2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC3984l.license(arrayList2, (ArrayList) c4854l.admob);
            ((ArrayList) c4854l.admob).clear();
        }
        C7375l c7375l2 = new C7375l(3, arrayList2);
        this.remoteconfig = c7375l2;
        if (this.firebase.f34637l) {
            C18262l.metrica("Canceled");
            return null;
        }
        if (c7375l2.yandex >= arrayList2.size()) {
            C4875l.firebase();
            return null;
        }
        int i4 = c7375l2.yandex;
        c7375l2.yandex = i4 + 1;
        return amazon((C13003l) arrayList2.get(i4), arrayList2);
    }

    public final InterfaceC7476l loadAd() {
        Socket socketSmaato;
        C2014l c2014l;
        C13247l c13247l = this.firebase.f34628l;
        if (c13247l == null) {
            c2014l = null;
        } else {
            boolean zSubs = c13247l.subs(this.smaato);
            synchronized (c13247l) {
                boolean z = c13247l.isPro;
                boolean z2 = true;
                try {
                    if (!zSubs) {
                        c13247l.isPro = true;
                        socketSmaato = this.firebase.smaato();
                    } else if (!z) {
                        C6705l c6705l = c13247l.crashlytics.yandex.admob;
                        C6705l c6705l2 = this.subs.admob;
                        if (c6705l.purchase != c6705l2.purchase || !AbstractC8576l.yandex(c6705l.amazon, c6705l2.amazon)) {
                            z2 = false;
                        }
                        socketSmaato = !z2 ? this.firebase.smaato() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.firebase.f34628l == null) {
                if (socketSmaato != null) {
                    AbstractC11432l.crashlytics(socketSmaato);
                }
                this.firebase.f34630l.getClass();
                c2014l = null;
            } else {
                if (socketSmaato != null) {
                    C8339l.smaato("Check failed.");
                    return null;
                }
                c2014l = new C2014l(c13247l);
            }
        }
        if (c2014l != null) {
            return c2014l;
        }
        C2014l c2014lPurchase = purchase(null, null);
        if (c2014lPurchase != null) {
            return c2014lPurchase;
        }
        if (!this.startapp.isEmpty()) {
            return (InterfaceC7476l) this.startapp.removeFirst();
        }
        C8665l c8665lCrashlytics = crashlytics();
        C2014l c2014lPurchase2 = purchase(c8665lCrashlytics, c8665lCrashlytics.firebase);
        return c2014lPurchase2 != null ? c2014lPurchase2 : c8665lCrashlytics;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x002d, B:22:0x003a, B:25:0x0041), top: B:51:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x002d, B:22:0x003a, B:25:0x0041), top: B:51:0x002d }] */
    public final C2014l purchase(C8665l c8665l, List list) {
        C13247l c13247l;
        boolean z;
        Socket socketSmaato;
        C0093l c0093l = this.loadAd;
        boolean z2 = this.smaato;
        C12919l c12919l = this.subs;
        C17778l c17778l = this.firebase;
        boolean z3 = c8665l != null && c8665l.yandex();
        Iterator it = ((ConcurrentLinkedQueue) c0093l.f1007l).iterator();
        while (true) {
            if (!it.hasNext()) {
                c13247l = null;
                break;
            }
            c13247l = (C13247l) it.next();
            synchronized (c13247l) {
                if (z3) {
                    try {
                        if (!(c13247l.subs != null)) {
                            z = false;
                        } else if (c13247l.mopub(c12919l, list)) {
                            c17778l.loadAd(c13247l);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (c13247l.mopub(c12919l, list)) {
                    z = false;
                } else {
                    c17778l.loadAd(c13247l);
                    z = true;
                }
            }
            if (z) {
                if (c13247l.subs(z2)) {
                    break;
                }
                synchronized (c13247l) {
                    c13247l.isPro = true;
                    socketSmaato = c17778l.smaato();
                }
                if (socketSmaato != null) {
                    AbstractC11432l.crashlytics(socketSmaato);
                }
            }
        }
        if (c13247l == null) {
            return null;
        }
        if (c8665l != null) {
            this.metrica = c8665l.isPro;
            Socket socket = c8665l.ads;
            if (socket != null) {
                AbstractC11432l.crashlytics(socket);
            }
        }
        this.firebase.f34630l.getClass();
        return new C2014l(c13247l);
    }

    public final boolean yandex(C13247l c13247l) {
        C4854l c4854l;
        C13003l c13003l;
        if (this.startapp.isEmpty() && this.metrica == null) {
            if (c13247l != null) {
                synchronized (c13247l) {
                    c13003l = null;
                    if (c13247l.smaato == 0 && c13247l.isPro && AbstractC11432l.yandex(c13247l.crashlytics.yandex.admob, this.subs.admob)) {
                        c13003l = c13247l.crashlytics;
                    }
                }
                if (c13003l != null) {
                    this.metrica = c13003l;
                    return true;
                }
            }
            C7375l c7375l = this.remoteconfig;
            if ((c7375l == null || c7375l.yandex >= c7375l.loadAd.size()) && (c4854l = this.vip) != null) {
                return c4854l.crashlytics();
            }
        }
        return true;
    }
}
