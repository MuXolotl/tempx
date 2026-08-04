package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: lٌْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8795l {
    public final AbstractC5711l Signature;
    public final boolean adcel;
    public final int admob;
    public final SocketFactory ads;
    public final C4619l amazon;
    public final int billing;
    public final int crashlytics;
    public final C5008l firebase;
    public final C14511l isPro;
    public int license;
    public final ArrayList loadAd;
    public final InterfaceC8038l metrica;
    public final int mopub;
    public final C17032l purchase;
    public final C8565l remoteconfig;
    public final C13863l smaato;
    public final ProxySelector startapp;
    public final InterfaceC8038l subs;
    public final SSLSocketFactory subscription;
    public final X509TrustManager tapsense;
    public final HostnameVerifier vip;
    public final C17778l yandex;

    public C8795l(C17778l c17778l, ArrayList arrayList, int i, C4619l c4619l, C17032l c17032l, int i2, int i3, int i4, InterfaceC8038l interfaceC8038l, C14511l c14511l, C5008l c5008l, C13863l c13863l, C8565l c8565l, HostnameVerifier hostnameVerifier, InterfaceC8038l interfaceC8038l2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, AbstractC5711l abstractC5711l) {
        this.yandex = c17778l;
        this.loadAd = arrayList;
        this.crashlytics = i;
        this.amazon = c4619l;
        this.purchase = c17032l;
        this.billing = i2;
        this.mopub = i3;
        this.admob = i4;
        this.subs = interfaceC8038l;
        this.isPro = c14511l;
        this.firebase = c5008l;
        this.smaato = c13863l;
        this.remoteconfig = c8565l;
        this.vip = hostnameVerifier;
        this.metrica = interfaceC8038l2;
        this.startapp = proxySelector;
        this.adcel = z;
        this.ads = socketFactory;
        this.subscription = sSLSocketFactory;
        this.tapsense = x509TrustManager;
        this.Signature = abstractC5711l;
    }

    public static C8795l yandex(C8795l c8795l, int i, C4619l c4619l, C17032l c17032l, int i2) {
        return new C8795l(c8795l.yandex, c8795l.loadAd, (i2 & 1) != 0 ? c8795l.crashlytics : i, (i2 & 2) != 0 ? c8795l.amazon : c4619l, (i2 & 4) != 0 ? c8795l.purchase : c17032l, c8795l.billing, c8795l.mopub, c8795l.admob, c8795l.subs, c8795l.isPro, c8795l.firebase, c8795l.smaato, c8795l.remoteconfig, c8795l.vip, c8795l.metrica, c8795l.startapp, c8795l.adcel, c8795l.ads, c8795l.subscription, c8795l.tapsense, c8795l.Signature);
    }

    public final C18389l loadAd(C17032l c17032l) {
        ArrayList arrayList = this.loadAd;
        int size = arrayList.size();
        int i = this.crashlytics;
        if (i >= size) {
            C8339l.smaato("Check failed.");
            return null;
        }
        this.license++;
        C4619l c4619l = this.amazon;
        if (c4619l != null) {
            C11815l c11815lBilling = ((InterfaceC11772l) c4619l.f9372l).billing();
            C6705l c6705l = c17032l.yandex;
            C6705l c6705l2 = c11815lBilling.subs.admob;
            if (c6705l.purchase != c6705l2.purchase || !AbstractC8576l.yandex(c6705l.amazon, c6705l2.amazon)) {
                C8936l.firebase(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.license != 1) {
                C8936l.firebase(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        C8795l c8795lYandex = yandex(this, i2, null, c17032l, 2097146);
        InterfaceC5329l interfaceC5329l = (InterfaceC5329l) arrayList.get(i);
        C18389l c18389lYandex = interfaceC5329l.yandex(c8795lYandex);
        if (c18389lYandex == null) {
            throw new NullPointerException("interceptor " + interfaceC5329l + " returned null");
        }
        if (c4619l == null || i2 >= arrayList.size() || c8795lYandex.license == 1) {
            return c18389lYandex;
        }
        C8936l.firebase(interfaceC5329l, " must call proceed() exactly once", "network interceptor ");
        return null;
    }
}
