package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: renamed from: lؑٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0317l {
    public static final Hashtable crashlytics;
    public static final Hashtable loadAd;
    public static final Hashtable yandex;

    static {
        C4334l c4334l = new C4334l(20);
        C4334l c4334l2 = new C4334l(21);
        C4334l c4334l3 = new C4334l(22);
        C4334l c4334l4 = new C4334l(23);
        C4334l c4334l5 = new C4334l(24);
        C4334l c4334l6 = new C4334l(25);
        C4334l c4334l7 = new C4334l(26);
        C4334l c4334l8 = new C4334l(27);
        C4334l c4334l9 = new C4334l(28);
        C4334l c4334l10 = new C4334l(15);
        C4334l c4334l11 = new C4334l(16);
        C4334l c4334l12 = new C4334l(17);
        C4334l c4334l13 = new C4334l(18);
        C4334l c4334l14 = new C4334l(19);
        yandex = new Hashtable();
        loadAd = new Hashtable();
        crashlytics = new Hashtable();
        crashlytics("brainpoolP160r1", InterfaceC4368l.subs, c4334l);
        crashlytics("brainpoolP160t1", InterfaceC4368l.isPro, c4334l2);
        crashlytics("brainpoolP192r1", InterfaceC4368l.firebase, c4334l3);
        crashlytics("brainpoolP192t1", InterfaceC4368l.smaato, c4334l4);
        crashlytics("brainpoolP224r1", InterfaceC4368l.remoteconfig, c4334l5);
        crashlytics("brainpoolP224t1", InterfaceC4368l.vip, c4334l6);
        crashlytics("brainpoolP256r1", InterfaceC4368l.metrica, c4334l7);
        crashlytics("brainpoolP256t1", InterfaceC4368l.startapp, c4334l8);
        crashlytics("brainpoolP320r1", InterfaceC4368l.adcel, c4334l9);
        crashlytics("brainpoolP320t1", InterfaceC4368l.ads, c4334l10);
        crashlytics("brainpoolP384r1", InterfaceC4368l.subscription, c4334l11);
        crashlytics("brainpoolP384t1", InterfaceC4368l.tapsense, c4334l12);
        crashlytics("brainpoolP512r1", InterfaceC4368l.Signature, c4334l13);
        crashlytics("brainpoolP512t1", InterfaceC4368l.license, c4334l14);
    }

    public static void crashlytics(String str, Cfor cfor, AbstractC18276l abstractC18276l) {
        yandex.put(AbstractC9008l.amazon(str), cfor);
        crashlytics.put(cfor, str);
        loadAd.put(cfor, abstractC18276l);
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
