package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: renamed from: lؘٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5730l {
    public static final Hashtable crashlytics;
    public static final Hashtable loadAd;
    public static final Hashtable yandex;

    static {
        C12916l c12916l = new C12916l(9);
        C12916l c12916l2 = new C12916l(14);
        C12916l c12916l3 = new C12916l(15);
        C12916l c12916l4 = new C12916l(16);
        C12916l c12916l5 = new C12916l(17);
        C12916l c12916l6 = new C12916l(18);
        C12916l c12916l7 = new C12916l(19);
        C12916l c12916l8 = new C12916l(20);
        C12916l c12916l9 = new C12916l(21);
        C4334l c4334l = new C4334l(29);
        C12916l c12916l10 = new C12916l(0);
        C12916l c12916l11 = new C12916l(1);
        C12916l c12916l12 = new C12916l(2);
        C12916l c12916l13 = new C12916l(3);
        C12916l c12916l14 = new C12916l(4);
        C12916l c12916l15 = new C12916l(5);
        C12916l c12916l16 = new C12916l(6);
        C12916l c12916l17 = new C12916l(7);
        C12916l c12916l18 = new C12916l(8);
        C12916l c12916l19 = new C12916l(10);
        C12916l c12916l20 = new C12916l(11);
        C12916l c12916l21 = new C12916l(12);
        C12916l c12916l22 = new C12916l(13);
        yandex = new Hashtable();
        loadAd = new Hashtable();
        crashlytics = new Hashtable();
        crashlytics("prime192v1", InterfaceC15427l.f30171l, c12916l);
        crashlytics("prime192v2", InterfaceC15427l.f30143l, c12916l2);
        crashlytics("prime192v3", InterfaceC15427l.f30168l, c12916l3);
        crashlytics("prime239v1", InterfaceC15427l.f30151l, c12916l4);
        crashlytics("prime239v2", InterfaceC15427l.f30157l, c12916l5);
        crashlytics("prime239v3", InterfaceC15427l.f30172l, c12916l6);
        crashlytics("prime256v1", InterfaceC15427l.f30145l, c12916l7);
        crashlytics("c2pnb163v1", InterfaceC15427l.f30165l, c12916l8);
        crashlytics("c2pnb163v2", InterfaceC15427l.f30174l, c12916l9);
        crashlytics("c2pnb163v3", InterfaceC15427l.f30142l, c4334l);
        crashlytics("c2pnb176w1", InterfaceC15427l.f30161l, c12916l10);
        crashlytics("c2tnb191v1", InterfaceC15427l.f30160l, c12916l11);
        crashlytics("c2tnb191v2", InterfaceC15427l.f30184l, c12916l12);
        crashlytics("c2tnb191v3", InterfaceC15427l.f30144l, c12916l13);
        crashlytics("c2pnb208w1", InterfaceC15427l.f30152l, c12916l14);
        crashlytics("c2tnb239v1", InterfaceC15427l.f30155l, c12916l15);
        crashlytics("c2tnb239v2", InterfaceC15427l.f30162l, c12916l16);
        crashlytics("c2tnb239v3", InterfaceC15427l.f30185l, c12916l17);
        crashlytics("c2pnb272w1", InterfaceC15427l.f30167l, c12916l18);
        crashlytics("c2pnb304w1", InterfaceC15427l.f30149l, c12916l19);
        crashlytics("c2tnb359v1", InterfaceC15427l.f30170l, c12916l20);
        crashlytics("c2pnb368w1", InterfaceC15427l.f30150l, c12916l21);
        crashlytics("c2tnb431r1", InterfaceC15427l.f30154l, c12916l22);
    }

    public static void crashlytics(String str, Cfor cfor, AbstractC18276l abstractC18276l) {
        yandex.put(str, cfor);
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
