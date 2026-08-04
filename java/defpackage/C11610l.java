package defpackage;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;

/* JADX INFO: renamed from: lِؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11610l {
    public static final List inmobi = AbstractC11432l.firebase(new EnumC9199l[]{EnumC9199l.HTTP_2, EnumC9199l.HTTP_1_1});

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final List f23324throws = AbstractC11432l.firebase(new C4800l[]{C4800l.purchase, C4800l.billing});
    public final AbstractC5711l Signature;
    public final int ad;
    public final List adcel;
    public final boolean admob;
    public final List ads;
    public final int advert;
    public final C18262l amazon;
    public final C3097l applovin;
    public final C5008l appmetrica;
    public final boolean billing;
    public final List crashlytics;
    public final C8565l firebase;
    public final C13863l isPro;
    public final int isVip;
    public final int license;
    public final List loadAd;
    public final SSLSocketFactory metrica;
    public final C13863l mopub;
    public final C5501l premium;
    public final int pro;
    public final boolean purchase;
    public final InterfaceC8038l remoteconfig;
    public final long signatures;
    public final ProxySelector smaato;
    public final X509TrustManager startapp;
    public final boolean subs;
    public final C15931l subscription;
    public final C14511l tapsense;
    public final SocketFactory vip;
    public final C12014l yandex;

    public C11610l(C10094l c10094l) throws NoSuchAlgorithmException, KeyStoreException {
        this.yandex = c10094l.yandex;
        this.loadAd = AbstractC11432l.isPro(c10094l.crashlytics);
        this.crashlytics = AbstractC11432l.isPro(c10094l.amazon);
        this.amazon = c10094l.purchase;
        this.purchase = c10094l.billing;
        this.billing = c10094l.mopub;
        this.mopub = c10094l.admob;
        this.admob = c10094l.subs;
        this.subs = c10094l.isPro;
        this.isPro = c10094l.firebase;
        this.firebase = c10094l.smaato;
        ProxySelector proxySelector = c10094l.remoteconfig;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = C2247l.yandex;
        }
        this.smaato = proxySelector;
        this.remoteconfig = c10094l.vip;
        this.vip = c10094l.metrica;
        List list = c10094l.ads;
        this.adcel = list;
        this.ads = c10094l.subscription;
        this.subscription = c10094l.tapsense;
        this.license = c10094l.pro;
        this.pro = c10094l.ad;
        this.ad = c10094l.advert;
        this.advert = c10094l.isVip;
        this.isVip = c10094l.signatures;
        this.signatures = c10094l.premium;
        C5501l c5501l = c10094l.applovin;
        this.premium = c5501l == null ? new C5501l(24) : c5501l;
        C3097l c3097l = c10094l.appmetrica;
        this.applovin = c3097l == null ? C3097l.smaato : c3097l;
        C5008l c5008l = c10094l.loadAd;
        if (c5008l == null) {
            c5008l = new C5008l(4);
            c10094l.loadAd = c5008l;
        }
        this.appmetrica = c5008l;
        if (list != null && list.isEmpty()) {
            this.metrica = null;
            this.Signature = null;
            this.startapp = null;
            this.tapsense = C14511l.crashlytics;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.metrica = null;
                this.Signature = null;
                this.startapp = null;
                this.tapsense = C14511l.crashlytics;
                break;
            }
            if (((C4800l) it.next()).yandex) {
                SSLSocketFactory sSLSocketFactory = c10094l.startapp;
                if (sSLSocketFactory == null) {
                    AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
                    AbstractC16844l.yandex.getClass();
                    X509TrustManager x509TrustManagerRemoteconfig = AbstractC16844l.remoteconfig();
                    this.startapp = x509TrustManagerRemoteconfig;
                    this.metrica = AbstractC16844l.yandex.smaato(x509TrustManagerRemoteconfig);
                    AbstractC5711l abstractC5711lCrashlytics = AbstractC16844l.yandex.crashlytics(x509TrustManagerRemoteconfig);
                    this.Signature = abstractC5711lCrashlytics;
                    C14511l c14511l = c10094l.Signature;
                    this.tapsense = AbstractC8576l.yandex(c14511l.loadAd, abstractC5711lCrashlytics) ? c14511l : new C14511l(c14511l.yandex, abstractC5711lCrashlytics);
                    break;
                }
                this.metrica = sSLSocketFactory;
                AbstractC5711l abstractC5711l = c10094l.license;
                this.Signature = abstractC5711l;
                this.startapp = c10094l.adcel;
                C14511l c14511l2 = c10094l.Signature;
                this.tapsense = AbstractC8576l.yandex(c14511l2.loadAd, abstractC5711l) ? c14511l2 : new C14511l(c14511l2.yandex, abstractC5711l);
                break;
            }
        }
        X509TrustManager x509TrustManager = this.startapp;
        AbstractC5711l abstractC5711l2 = this.Signature;
        SSLSocketFactory sSLSocketFactory2 = this.metrica;
        List list2 = this.crashlytics;
        List list3 = this.loadAd;
        if (list3.contains(null)) {
            C18073l.firebase(list3, "Null interceptor: ");
            throw null;
        }
        if (list2.contains(null)) {
            C18073l.firebase(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.adcel;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C4800l) it2.next()).yandex) {
                    if (sSLSocketFactory2 == null) {
                        C8339l.smaato("sslSocketFactory == null");
                        throw null;
                    }
                    if (abstractC5711l2 == null) {
                        C8339l.smaato("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        return;
                    }
                    C8339l.smaato("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            C8339l.smaato("Check failed.");
            throw null;
        }
        if (abstractC5711l2 != null) {
            C8339l.smaato("Check failed.");
            throw null;
        }
        if (x509TrustManager != null) {
            C8339l.smaato("Check failed.");
            throw null;
        }
        if (AbstractC8576l.yandex(this.tapsense, C14511l.crashlytics)) {
            Unit unit = Unit.INSTANCE;
        } else {
            C8339l.smaato("Check failed.");
            throw null;
        }
    }

    public final C17778l yandex(C17032l c17032l) {
        return new C17778l(this, c17032l, false);
    }
}
