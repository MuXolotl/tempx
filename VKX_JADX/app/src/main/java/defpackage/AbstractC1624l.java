package defpackage;

import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: renamed from: lؓؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1624l {
    public static final Hashtable amazon;
    public static final Hashtable crashlytics;
    public static final Hashtable loadAd;
    public static final Vector purchase;
    public static final Hashtable yandex;

    static {
        subscription subscriptionVar = new subscription(11);
        subscription subscriptionVar2 = new subscription(22);
        subscription subscriptionVar3 = new subscription(26);
        subscription subscriptionVar4 = new subscription(27);
        subscription subscriptionVar5 = new subscription(28);
        subscription subscriptionVar6 = new subscription(29);
        C5948l c5948l = new C5948l(0);
        C5948l c5948l2 = new C5948l(1);
        C5948l c5948l3 = new C5948l(2);
        subscription subscriptionVar7 = new subscription(1);
        subscription subscriptionVar8 = new subscription(2);
        subscription subscriptionVar9 = new subscription(3);
        subscription subscriptionVar10 = new subscription(4);
        subscription subscriptionVar11 = new subscription(5);
        subscription subscriptionVar12 = new subscription(6);
        subscription subscriptionVar13 = new subscription(7);
        subscription subscriptionVar14 = new subscription(8);
        subscription subscriptionVar15 = new subscription(9);
        subscription subscriptionVar16 = new subscription(10);
        subscription subscriptionVar17 = new subscription(12);
        subscription subscriptionVar18 = new subscription(13);
        subscription subscriptionVar19 = new subscription(14);
        subscription subscriptionVar20 = new subscription(15);
        subscription subscriptionVar21 = new subscription(16);
        subscription subscriptionVar22 = new subscription(17);
        subscription subscriptionVar23 = new subscription(18);
        subscription subscriptionVar24 = new subscription(19);
        subscription subscriptionVar25 = new subscription(20);
        subscription subscriptionVar26 = new subscription(21);
        subscription subscriptionVar27 = new subscription(23);
        subscription subscriptionVar28 = new subscription(24);
        subscription subscriptionVar29 = new subscription(25);
        yandex = new Hashtable();
        loadAd = new Hashtable();
        crashlytics = new Hashtable();
        amazon = new Hashtable();
        purchase = new Vector();
        amazon("curve25519", AbstractC5723l.yandex, subscriptionVar);
        amazon("secp128r1", InterfaceC16863l.Signature, subscriptionVar2);
        amazon("secp160k1", InterfaceC16863l.isPro, subscriptionVar3);
        amazon("secp160r1", InterfaceC16863l.subs, subscriptionVar4);
        amazon("secp160r2", InterfaceC16863l.pro, subscriptionVar5);
        amazon("secp192k1", InterfaceC16863l.ad, subscriptionVar6);
        Cfor cfor = InterfaceC16863l.f32903package;
        amazon("secp192r1", cfor, c5948l);
        amazon("secp224k1", InterfaceC16863l.advert, c5948l2);
        Cfor cfor2 = InterfaceC16863l.isVip;
        amazon("secp224r1", cfor2, c5948l3);
        amazon("secp256k1", InterfaceC16863l.firebase, subscriptionVar7);
        Cfor cfor3 = InterfaceC16863l.f32907synchronized;
        amazon("secp256r1", cfor3, subscriptionVar8);
        Cfor cfor4 = InterfaceC16863l.signatures;
        amazon("secp384r1", cfor4, subscriptionVar9);
        Cfor cfor5 = InterfaceC16863l.premium;
        amazon("secp521r1", cfor5, subscriptionVar10);
        amazon("sect113r1", InterfaceC16863l.purchase, subscriptionVar11);
        amazon("sect113r2", InterfaceC16863l.billing, subscriptionVar12);
        amazon("sect131r1", InterfaceC16863l.metrica, subscriptionVar13);
        amazon("sect131r2", InterfaceC16863l.startapp, subscriptionVar14);
        Cfor cfor6 = InterfaceC16863l.loadAd;
        amazon("sect163k1", cfor6, subscriptionVar15);
        amazon("sect163r1", InterfaceC16863l.crashlytics, subscriptionVar16);
        Cfor cfor7 = InterfaceC16863l.smaato;
        amazon("sect163r2", cfor7, subscriptionVar17);
        amazon("sect193r1", InterfaceC16863l.adcel, subscriptionVar18);
        amazon("sect193r2", InterfaceC16863l.ads, subscriptionVar19);
        Cfor cfor8 = InterfaceC16863l.subscription;
        amazon("sect233k1", cfor8, subscriptionVar20);
        Cfor cfor9 = InterfaceC16863l.tapsense;
        amazon("sect233r1", cfor9, subscriptionVar21);
        amazon("sect239k1", InterfaceC16863l.amazon, subscriptionVar22);
        Cfor cfor10 = InterfaceC16863l.remoteconfig;
        amazon("sect283k1", cfor10, subscriptionVar23);
        Cfor cfor11 = InterfaceC16863l.vip;
        amazon("sect283r1", cfor11, subscriptionVar24);
        Cfor cfor12 = InterfaceC16863l.applovin;
        amazon("sect409k1", cfor12, subscriptionVar25);
        Cfor cfor13 = InterfaceC16863l.appmetrica;
        amazon("sect409r1", cfor13, subscriptionVar26);
        Cfor cfor14 = InterfaceC16863l.inmobi;
        amazon("sect571k1", cfor14, subscriptionVar27);
        Cfor cfor15 = InterfaceC16863l.f32909throws;
        amazon("sect571r1", cfor15, subscriptionVar28);
        amazon("sm2p256v1", InterfaceC13724l.crashlytics, subscriptionVar29);
        crashlytics("B-163", cfor7);
        crashlytics("B-233", cfor9);
        crashlytics("B-283", cfor11);
        crashlytics("B-409", cfor13);
        crashlytics("B-571", cfor15);
        crashlytics("K-163", cfor6);
        crashlytics("K-233", cfor8);
        crashlytics("K-283", cfor10);
        crashlytics("K-409", cfor12);
        crashlytics("K-571", cfor14);
        crashlytics("P-192", cfor);
        crashlytics("P-224", cfor2);
        crashlytics("P-256", cfor3);
        crashlytics("P-384", cfor4);
        crashlytics("P-521", cfor5);
    }

    public static void amazon(String str, Cfor cfor, AbstractC18276l abstractC18276l) {
        purchase.addElement(str);
        amazon.put(cfor, str);
        crashlytics.put(cfor, abstractC18276l);
        String strAmazon = AbstractC9008l.amazon(str);
        loadAd.put(strAmazon, cfor);
        yandex.put(strAmazon, abstractC18276l);
    }

    public static void crashlytics(String str, Cfor cfor) {
        Object obj = crashlytics.get(cfor);
        if (obj == null) {
            C18073l.admob();
            return;
        }
        String strAmazon = AbstractC9008l.amazon(str);
        loadAd.put(strAmazon, cfor);
        yandex.put(strAmazon, obj);
    }

    public static AbstractC11918l loadAd(AbstractC11861l abstractC11861l, C0458l c0458l) {
        C17219l c17219l;
        synchronized (abstractC11861l) {
            c17219l = new C17219l(abstractC11861l, abstractC11861l.billing, abstractC11861l.mopub, abstractC11861l.admob);
        }
        c17219l.f33423l = new C2723l(abstractC11861l, c0458l);
        return c17219l.tapsense();
    }

    public static AbstractC18276l purchase(String str) {
        return (AbstractC18276l) yandex.get(AbstractC9008l.amazon(str));
    }

    public static C16217l yandex(AbstractC11918l abstractC11918l, String str) {
        C16217l c16217l = new C16217l(abstractC11918l, AbstractC8535l.crashlytics(str));
        AbstractC6660l.amazon(c16217l.vip());
        return c16217l;
    }
}
