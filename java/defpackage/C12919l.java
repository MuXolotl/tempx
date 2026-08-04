package defpackage;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: lّۡٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12919l {
    public final C6705l admob;
    public final HostnameVerifier amazon;
    public final InterfaceC8038l billing;
    public final SSLSocketFactory crashlytics;
    public final List isPro;
    public final SocketFactory loadAd;
    public final ProxySelector mopub;
    public final C14511l purchase;
    public final List subs;
    public final C8565l yandex;

    public C12919l(String str, int i, C8565l c8565l, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C14511l c14511l, InterfaceC8038l interfaceC8038l, List list, List list2, ProxySelector proxySelector) {
        this.yandex = c8565l;
        this.loadAd = socketFactory;
        this.crashlytics = sSLSocketFactory;
        this.amazon = hostnameVerifier;
        this.purchase = c14511l;
        this.billing = interfaceC8038l;
        this.mopub = proxySelector;
        C13170l c13170l = new C13170l();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c13170l.purchase = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                C8339l.metrica("unexpected scheme: ".concat(str2));
                throw null;
            }
            c13170l.purchase = "https";
        }
        String strLoadAd = AbstractC3623l.loadAd(AbstractC1068l.purchase(0, 0, 7, str));
        if (strLoadAd == null) {
            C8339l.metrica("unexpected host: ".concat(str));
            throw null;
        }
        c13170l.admob = strLoadAd;
        if (1 > i || i >= 65536) {
            C10754l.metrica(AbstractC0653l.vip(i, "unexpected port: "));
            throw null;
        }
        c13170l.loadAd = i;
        this.admob = c13170l.crashlytics();
        this.subs = AbstractC11432l.isPro(list);
        this.isPro = AbstractC11432l.isPro(list2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12919l)) {
            return false;
        }
        C12919l c12919l = (C12919l) obj;
        return AbstractC8576l.yandex(this.admob, c12919l.admob) && yandex(c12919l);
    }

    public final int hashCode() {
        return Objects.hashCode(this.purchase) + ((Objects.hashCode(this.amazon) + ((Objects.hashCode(this.crashlytics) + ((this.mopub.hashCode() + AbstractC14814l.admob(AbstractC14814l.admob((this.billing.hashCode() + ((this.yandex.hashCode() + AbstractC12589l.advert(527, 31, this.admob.subs)) * 31)) * 31, 31, this.subs), 31, this.isPro)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C6705l c6705l = this.admob;
        sb.append(c6705l.amazon);
        sb.append(':');
        sb.append(c6705l.purchase);
        sb.append(", ");
        sb.append("proxySelector=" + this.mopub);
        sb.append('}');
        return sb.toString();
    }

    public final boolean yandex(C12919l c12919l) {
        return AbstractC8576l.yandex(this.yandex, c12919l.yandex) && AbstractC8576l.yandex(this.billing, c12919l.billing) && AbstractC8576l.yandex(this.subs, c12919l.subs) && AbstractC8576l.yandex(this.isPro, c12919l.isPro) && AbstractC8576l.yandex(this.mopub, c12919l.mopub) && AbstractC8576l.yandex(this.crashlytics, c12919l.crashlytics) && AbstractC8576l.yandex(this.amazon, c12919l.amazon) && AbstractC8576l.yandex(this.purchase, c12919l.purchase) && this.admob.purchase == c12919l.admob.purchase;
    }
}
