package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: lُؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C10806l {
    public int Signature;
    public boolean ad;
    public AbstractC1186l adcel;
    public int admob;
    public AbstractC1186l ads;
    public AbstractC1186l advert;
    public int applovin;
    public boolean appmetrica;
    public int billing;
    public boolean inmobi;
    public int isVip;
    public AbstractC1186l license;
    public AbstractC1186l metrica;
    public int mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean f21850package;
    public AbstractC1186l premium;
    public C2171l pro;
    public int purchase;
    public AbstractC1186l remoteconfig;
    public boolean signatures;
    public int startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public HashSet f21851strictfp;
    public int subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public HashMap f21852synchronized;
    public int tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean f21853throws;
    public AbstractC1186l vip;
    public int yandex = Alert.DURATION_SHOW_INDEFINITELY;
    public int loadAd = Alert.DURATION_SHOW_INDEFINITELY;
    public int crashlytics = Alert.DURATION_SHOW_INDEFINITELY;
    public int amazon = Alert.DURATION_SHOW_INDEFINITELY;
    public int subs = Alert.DURATION_SHOW_INDEFINITELY;
    public int isPro = Alert.DURATION_SHOW_INDEFINITELY;
    public boolean firebase = true;
    public boolean smaato = true;

    public C10806l() {
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        this.remoteconfig = c13708l;
        this.vip = c13708l;
        this.metrica = c13708l;
        this.startapp = 0;
        this.adcel = c13708l;
        this.ads = c13708l;
        this.subscription = 0;
        this.tapsense = Alert.DURATION_SHOW_INDEFINITELY;
        this.Signature = Alert.DURATION_SHOW_INDEFINITELY;
        this.license = c13708l;
        this.pro = C2171l.amazon;
        this.ad = false;
        this.advert = c13708l;
        this.isVip = 0;
        this.signatures = true;
        this.premium = c13708l;
        this.applovin = 0;
        this.appmetrica = false;
        this.inmobi = false;
        this.f21853throws = false;
        this.f21850package = false;
        this.f21852synchronized = new HashMap();
        this.f21851strictfp = new HashSet();
    }

    public static C13708l purchase(String[] strArr) {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (String str : strArr) {
            str.getClass();
            c16971lMetrica.crashlytics(AbstractC15323l.m3961class(str));
        }
        return c16971lMetrica.mopub();
    }

    public final void amazon(C4970l c4970l) {
        this.yandex = c4970l.yandex;
        this.loadAd = c4970l.loadAd;
        this.crashlytics = c4970l.crashlytics;
        this.amazon = c4970l.amazon;
        this.purchase = c4970l.purchase;
        this.billing = c4970l.billing;
        this.mopub = c4970l.mopub;
        this.admob = c4970l.admob;
        this.subs = c4970l.subs;
        this.isPro = c4970l.isPro;
        this.firebase = c4970l.firebase;
        this.smaato = c4970l.smaato;
        this.vip = c4970l.vip;
        this.remoteconfig = c4970l.remoteconfig;
        this.metrica = c4970l.metrica;
        this.startapp = c4970l.startapp;
        this.adcel = c4970l.adcel;
        this.subscription = c4970l.subscription;
        this.ads = c4970l.ads;
        this.tapsense = c4970l.tapsense;
        this.Signature = c4970l.Signature;
        this.license = c4970l.license;
        this.pro = c4970l.pro;
        this.ad = c4970l.ad;
        this.advert = c4970l.advert;
        this.isVip = c4970l.signatures;
        this.signatures = c4970l.premium;
        this.premium = c4970l.isVip;
        this.applovin = c4970l.applovin;
        this.appmetrica = c4970l.appmetrica;
        this.inmobi = c4970l.inmobi;
        this.f21853throws = c4970l.f10157throws;
        this.f21850package = c4970l.f10154package;
        this.f21851strictfp = new HashSet(c4970l.f10155strictfp);
        this.f21852synchronized = new HashMap(c4970l.f10156synchronized);
    }

    public C10806l crashlytics() {
        this.f21852synchronized.clear();
        return this;
    }

    public C4970l loadAd() {
        return new C4970l(this);
    }

    public void yandex(C0815l c0815l) {
        this.f21852synchronized.put(c0815l.yandex, c0815l);
    }
}
