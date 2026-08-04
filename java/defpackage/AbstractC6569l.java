package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: renamed from: lؙٚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6569l {
    public static final Hashtable crashlytics;
    public static final Hashtable loadAd;
    public static final Hashtable yandex;

    static {
        C5948l c5948l = new C5948l(22);
        C4334l c4334l = new C4334l(3);
        C4334l c4334l2 = new C4334l(8);
        C4334l c4334l3 = new C4334l(9);
        C4334l c4334l4 = new C4334l(10);
        C4334l c4334l5 = new C4334l(11);
        C4334l c4334l6 = new C4334l(12);
        C4334l c4334l7 = new C4334l(13);
        C4334l c4334l8 = new C4334l(14);
        C5948l c5948l2 = new C5948l(12);
        C5948l c5948l3 = new C5948l(13);
        C5948l c5948l4 = new C5948l(14);
        C5948l c5948l5 = new C5948l(15);
        C5948l c5948l6 = new C5948l(16);
        C5948l c5948l7 = new C5948l(17);
        C5948l c5948l8 = new C5948l(18);
        C5948l c5948l9 = new C5948l(19);
        C5948l c5948l10 = new C5948l(20);
        C5948l c5948l11 = new C5948l(21);
        C5948l c5948l12 = new C5948l(23);
        C5948l c5948l13 = new C5948l(24);
        C5948l c5948l14 = new C5948l(25);
        C5948l c5948l15 = new C5948l(26);
        C5948l c5948l16 = new C5948l(27);
        C5948l c5948l17 = new C5948l(28);
        C5948l c5948l18 = new C5948l(29);
        C4334l c4334l9 = new C4334l(0);
        C4334l c4334l10 = new C4334l(1);
        C4334l c4334l11 = new C4334l(2);
        C4334l c4334l12 = new C4334l(4);
        C4334l c4334l13 = new C4334l(5);
        C4334l c4334l14 = new C4334l(6);
        C4334l c4334l15 = new C4334l(7);
        yandex = new Hashtable();
        loadAd = new Hashtable();
        crashlytics = new Hashtable();
        amazon("secp112r1", InterfaceC16863l.mopub, c5948l);
        amazon("secp112r2", InterfaceC16863l.admob, c4334l);
        amazon("secp128r1", InterfaceC16863l.Signature, c4334l2);
        amazon("secp128r2", InterfaceC16863l.license, c4334l3);
        amazon("secp160k1", InterfaceC16863l.isPro, c4334l4);
        amazon("secp160r1", InterfaceC16863l.subs, c4334l5);
        amazon("secp160r2", InterfaceC16863l.pro, c4334l6);
        amazon("secp192k1", InterfaceC16863l.ad, c4334l7);
        amazon("secp192r1", InterfaceC16863l.f32903package, c4334l8);
        amazon("secp224k1", InterfaceC16863l.advert, c5948l2);
        amazon("secp224r1", InterfaceC16863l.isVip, c5948l3);
        amazon("secp256k1", InterfaceC16863l.firebase, c5948l4);
        amazon("secp256r1", InterfaceC16863l.f32907synchronized, c5948l5);
        amazon("secp384r1", InterfaceC16863l.signatures, c5948l6);
        amazon("secp521r1", InterfaceC16863l.premium, c5948l7);
        amazon("sect113r1", InterfaceC16863l.purchase, c5948l8);
        amazon("sect113r2", InterfaceC16863l.billing, c5948l9);
        amazon("sect131r1", InterfaceC16863l.metrica, c5948l10);
        amazon("sect131r2", InterfaceC16863l.startapp, c5948l11);
        amazon("sect163k1", InterfaceC16863l.loadAd, c5948l12);
        amazon("sect163r1", InterfaceC16863l.crashlytics, c5948l13);
        amazon("sect163r2", InterfaceC16863l.smaato, c5948l14);
        amazon("sect193r1", InterfaceC16863l.adcel, c5948l15);
        amazon("sect193r2", InterfaceC16863l.ads, c5948l16);
        amazon("sect233k1", InterfaceC16863l.subscription, c5948l17);
        amazon("sect233r1", InterfaceC16863l.tapsense, c5948l18);
        amazon("sect239k1", InterfaceC16863l.amazon, c4334l9);
        amazon("sect283k1", InterfaceC16863l.remoteconfig, c4334l10);
        amazon("sect283r1", InterfaceC16863l.vip, c4334l11);
        amazon("sect409k1", InterfaceC16863l.applovin, c4334l12);
        amazon("sect409r1", InterfaceC16863l.appmetrica, c4334l13);
        amazon("sect571k1", InterfaceC16863l.inmobi, c4334l14);
        amazon("sect571r1", InterfaceC16863l.f32909throws, c4334l15);
    }

    public static void amazon(String str, Cfor cfor, AbstractC18276l abstractC18276l) {
        yandex.put(str, cfor);
        crashlytics.put(cfor, str);
        loadAd.put(cfor, abstractC18276l);
    }

    public static AbstractC11918l crashlytics(C5277l c5277l, C0458l c0458l) {
        C17219l c17219l;
        synchronized (c5277l) {
            c17219l = new C17219l(c5277l, c5277l.billing, c5277l.mopub, c5277l.admob);
        }
        c17219l.f33423l = new C2723l(c5277l, c0458l);
        return c17219l.tapsense();
    }

    public static C16217l loadAd(AbstractC11918l abstractC11918l, String str) {
        C16217l c16217l = new C16217l(abstractC11918l, AbstractC8535l.crashlytics(str));
        AbstractC6660l.amazon(c16217l.vip());
        return c16217l;
    }

    public static BigInteger yandex(String str) {
        return new BigInteger(1, AbstractC8535l.crashlytics(str));
    }
}
