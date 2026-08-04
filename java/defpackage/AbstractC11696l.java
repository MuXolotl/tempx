package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: renamed from: lِؚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11696l {
    public static final Hashtable crashlytics;
    public static final Hashtable loadAd;
    public static final Hashtable yandex;

    static {
        C5948l c5948l = new C5948l(3);
        C5948l c5948l2 = new C5948l(4);
        C5948l c5948l3 = new C5948l(5);
        C5948l c5948l4 = new C5948l(6);
        C5948l c5948l5 = new C5948l(7);
        C5948l c5948l6 = new C5948l(8);
        C5948l c5948l7 = new C5948l(9);
        yandex = new Hashtable();
        loadAd = new Hashtable();
        crashlytics = new Hashtable();
        crashlytics("GostR3410-2001-CryptoPro-A", InterfaceC11987l.subscription, c5948l);
        crashlytics("GostR3410-2001-CryptoPro-B", InterfaceC11987l.tapsense, c5948l2);
        crashlytics("GostR3410-2001-CryptoPro-C", InterfaceC11987l.Signature, c5948l3);
        crashlytics("GostR3410-2001-CryptoPro-XchA", InterfaceC11987l.license, c5948l);
        crashlytics("GostR3410-2001-CryptoPro-XchB", InterfaceC11987l.pro, c5948l3);
        crashlytics("Tc26-Gost-3410-12-256-paramSetA", InterfaceC18410l.firebase, c5948l4);
        crashlytics("Tc26-Gost-3410-12-256-paramSetB", InterfaceC18410l.smaato, c5948l);
        crashlytics("Tc26-Gost-3410-12-256-paramSetC", InterfaceC18410l.remoteconfig, c5948l2);
        crashlytics("Tc26-Gost-3410-12-256-paramSetD", InterfaceC18410l.vip, c5948l3);
        crashlytics("Tc26-Gost-3410-12-512-paramSetA", InterfaceC18410l.metrica, c5948l5);
        crashlytics("Tc26-Gost-3410-12-512-paramSetB", InterfaceC18410l.startapp, c5948l6);
        crashlytics("Tc26-Gost-3410-12-512-paramSetC", InterfaceC18410l.adcel, c5948l7);
    }

    public static C7100l amazon(Cfor cfor) {
        AbstractC18276l abstractC18276l = (AbstractC18276l) loadAd.get(cfor);
        if (abstractC18276l == null) {
            return null;
        }
        return abstractC18276l.amazon();
    }

    public static Cfor billing(String str) {
        return (Cfor) yandex.get(str);
    }

    public static void crashlytics(String str, Cfor cfor, AbstractC18276l abstractC18276l) {
        yandex.put(str, cfor);
        crashlytics.put(cfor, str);
        loadAd.put(cfor, abstractC18276l);
    }

    public static C16217l loadAd(AbstractC11918l abstractC11918l, BigInteger bigInteger, BigInteger bigInteger2) {
        AbstractC8859l abstractC8859lAmazon = abstractC11918l.amazon(bigInteger, bigInteger2);
        AbstractC6660l.amazon(abstractC8859lAmazon);
        return new C16217l(abstractC8859lAmazon, false);
    }

    public static String purchase(Cfor cfor) {
        return (String) crashlytics.get(cfor);
    }

    public static BigInteger yandex(String str) {
        return new BigInteger(1, AbstractC8535l.crashlytics(str));
    }
}
