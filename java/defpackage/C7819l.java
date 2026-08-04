package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؘۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7819l {
    public final C3548l Signature;
    public final Function1 adcel;
    public final InterfaceC12932l admob;
    public final InterfaceC0476l ads;
    public final String amazon;
    public final AbstractC5921l billing;
    public final InterfaceC3710l crashlytics;
    public final int firebase;
    public final InterfaceC12932l isPro;
    public final C7934l license;
    public final Object loadAd;
    public final Function1 metrica;
    public final InterfaceC3525l mopub;
    public final C4865l pro;
    public final Map purchase;
    public final int remoteconfig;
    public final int smaato;
    public final Function1 startapp;
    public final InterfaceC12932l subs;
    public final int subscription;
    public final int tapsense;
    public final C1791l vip;
    public final Context yandex;

    public C7819l(Context context, Object obj, InterfaceC3710l interfaceC3710l, String str, Map map, AbstractC5921l abstractC5921l, InterfaceC3525l interfaceC3525l, InterfaceC12932l interfaceC12932l, InterfaceC12932l interfaceC12932l2, InterfaceC12932l interfaceC12932l3, int i, int i2, int i3, C1791l c1791l, Function1 function1, Function1 function2, Function1 function3, InterfaceC0476l interfaceC0476l, int i4, int i5, C3548l c3548l, C7934l c7934l, C4865l c4865l) {
        this.yandex = context;
        this.loadAd = obj;
        this.crashlytics = interfaceC3710l;
        this.amazon = str;
        this.purchase = map;
        this.billing = abstractC5921l;
        this.mopub = interfaceC3525l;
        this.admob = interfaceC12932l;
        this.subs = interfaceC12932l2;
        this.isPro = interfaceC12932l3;
        this.firebase = i;
        this.smaato = i2;
        this.remoteconfig = i3;
        this.vip = c1791l;
        this.metrica = function1;
        this.startapp = function2;
        this.adcel = function3;
        this.ads = interfaceC0476l;
        this.subscription = i4;
        this.tapsense = i5;
        this.Signature = c3548l;
        this.license = c7934l;
        this.pro = c4865l;
    }

    public static C9477l yandex(C7819l c7819l) {
        Context context = c7819l.yandex;
        c7819l.getClass();
        return new C9477l(c7819l, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7819l)) {
            return false;
        }
        C7819l c7819l = (C7819l) obj;
        return AbstractC8576l.yandex(this.yandex, c7819l.yandex) && this.loadAd.equals(c7819l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c7819l.crashlytics) && AbstractC8576l.yandex(this.amazon, c7819l.amazon) && AbstractC8576l.yandex(this.purchase, c7819l.purchase) && AbstractC8576l.yandex(this.billing, c7819l.billing) && AbstractC8576l.yandex(this.mopub, c7819l.mopub) && AbstractC8576l.yandex(this.admob, c7819l.admob) && AbstractC8576l.yandex(this.subs, c7819l.subs) && AbstractC8576l.yandex(this.isPro, c7819l.isPro) && this.firebase == c7819l.firebase && this.smaato == c7819l.smaato && this.remoteconfig == c7819l.remoteconfig && AbstractC8576l.yandex(this.vip, c7819l.vip) && AbstractC8576l.yandex(this.metrica, c7819l.metrica) && AbstractC8576l.yandex(this.startapp, c7819l.startapp) && AbstractC8576l.yandex(this.adcel, c7819l.adcel) && AbstractC8576l.yandex(this.ads, c7819l.ads) && this.subscription == c7819l.subscription && this.tapsense == c7819l.tapsense && this.Signature.equals(c7819l.Signature) && this.license.equals(c7819l.license) && AbstractC8576l.yandex(this.pro, c7819l.pro);
    }

    public final int hashCode() {
        int iHashCode = (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31;
        InterfaceC3710l interfaceC3710l = this.crashlytics;
        int iHashCode2 = (iHashCode + (interfaceC3710l == null ? 0 : interfaceC3710l.hashCode())) * 961;
        String str = this.amazon;
        int iHashCode3 = (this.billing.hashCode() + ((this.purchase.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 961)) * 961;
        InterfaceC3525l interfaceC3525l = this.mopub;
        int iFirebase = AbstractC0653l.firebase(this.remoteconfig, AbstractC0653l.firebase(this.smaato, AbstractC0653l.firebase(this.firebase, (this.isPro.hashCode() + ((this.subs.hashCode() + ((this.admob.hashCode() + ((iHashCode3 + (interfaceC3525l == null ? 0 : interfaceC3525l.hashCode())) * 31)) * 31)) * 31)) * 31, 31), 31), 31);
        C1791l c1791l = this.vip;
        return this.pro.hashCode() + ((this.license.hashCode() + ((this.Signature.yandex.hashCode() + AbstractC0653l.firebase(this.tapsense, AbstractC0653l.firebase(this.subscription, (this.ads.hashCode() + ((this.adcel.hashCode() + ((this.startapp.hashCode() + ((this.metrica.hashCode() + ((iFirebase + (c1791l != null ? c1791l.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.yandex + ", data=" + this.loadAd + ", target=" + this.crashlytics + ", listener=null, memoryCacheKey=" + this.amazon + ", memoryCacheKeyExtras=" + this.purchase + ", diskCacheKey=null, fileSystem=" + this.billing + ", fetcherFactory=null, decoderFactory=" + this.mopub + ", interceptorCoroutineContext=" + this.admob + ", fetcherCoroutineContext=" + this.subs + ", decoderCoroutineContext=" + this.isPro + ", memoryCachePolicy=" + AbstractC14814l.signatures(this.firebase) + ", diskCachePolicy=" + AbstractC14814l.signatures(this.smaato) + ", networkCachePolicy=" + AbstractC14814l.signatures(this.remoteconfig) + ", placeholderMemoryCacheKey=" + this.vip + ", placeholderFactory=" + this.metrica + ", errorFactory=" + this.startapp + ", fallbackFactory=" + this.adcel + ", sizeResolver=" + this.ads + ", scale=" + AbstractC0653l.ad(this.subscription) + ", precision=" + AbstractC15560l.isVip(this.tapsense) + ", extras=" + this.Signature + ", defined=" + this.license + ", defaults=" + this.pro + ")";
    }
}
