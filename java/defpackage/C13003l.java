package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: lّۧؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13003l {
    public final InetSocketAddress crashlytics;
    public final Proxy loadAd;
    public final C12919l yandex;

    public C13003l(C12919l c12919l, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.yandex = c12919l;
        this.loadAd = proxy;
        this.crashlytics = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13003l)) {
            return false;
        }
        C13003l c13003l = (C13003l) obj;
        return c13003l.yandex.equals(this.yandex) && c13003l.loadAd.equals(this.loadAd) && AbstractC8576l.yandex(c13003l.crashlytics, this.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + ((this.yandex.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C6705l c6705l = this.yandex.admob;
        String str = c6705l.amazon;
        InetSocketAddress inetSocketAddress = this.crashlytics;
        InetAddress address = inetSocketAddress.getAddress();
        String strLoadAd = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC3623l.loadAd(hostAddress);
        if (AbstractC12024l.inmobi(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (c6705l.purchase != inetSocketAddress.getPort() || str.equals(strLoadAd)) {
            sb.append(":");
            sb.append(c6705l.purchase);
        }
        if (!str.equals(strLoadAd)) {
            if (this.loadAd.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strLoadAd == null) {
                sb.append("<unresolved>");
            } else if (AbstractC12024l.inmobi(strLoadAd, ':')) {
                sb.append("[");
                sb.append(strLoadAd);
                sb.append("]");
            } else {
                sb.append(strLoadAd);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
