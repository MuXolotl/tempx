package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: lؒؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0775l implements InterfaceC10726l, InterfaceC14988l {
    public static final C15578l yandex = new C15578l(1932743544, false, new C2039l(23));
    public static final C15578l loadAd = new C15578l(1326988449, false, new C2039l(24));

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final void m673package(C7026l c7026l) {
        AbstractC3483l.mopub(c7026l, C0303l.Companion.serializer(), AbstractC0837l.yandex());
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static C12105l m674strictfp(String str) {
        C0711l c0711lLoadAd = C12105l.amazon.loadAd(0, str);
        if (c0711lLoadAd == null) {
            C8339l.metrica(AbstractC14814l.smaato('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((C8892l) c0711lLoadAd.yandex()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        ((String) ((C8892l) c0711lLoadAd.yandex()).get(2)).toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        int i = c0711lLoadAd.loadAd().f15487l;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new C12105l(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
            }
            C0711l c0711lLoadAd2 = C12105l.purchase.loadAd(i2, str);
            if (c0711lLoadAd2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            C7067l c7067l = c0711lLoadAd2.crashlytics;
            C1204l c1204lAd = c7067l.ad(1);
            String str3 = c1204lAd != null ? c1204lAd.yandex : null;
            if (str3 == null) {
                i = c0711lLoadAd2.loadAd().f15487l;
            } else {
                C1204l c1204lAd2 = c7067l.ad(2);
                String strM1035native = c1204lAd2 != null ? c1204lAd2.yandex : null;
                if (strM1035native == null) {
                    strM1035native = c7067l.ad(3).yandex;
                } else if (AbstractC12024l.m3349try(strM1035native, '\'') && AbstractC12024l.m3344synchronized(strM1035native, '\'') && strM1035native.length() > 2) {
                    strM1035native = AbstractC1757l.m1035native(1, 1, strM1035native);
                }
                arrayList.add(str3);
                arrayList.add(strM1035native);
                i = c0711lLoadAd2.loadAd().f15487l;
            }
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final void m675volatile(C7026l c7026l, C0303l c0303l) {
        C0303l.Companion.serializer().crashlytics(new C0901l(c7026l, AbstractC0837l.yandex(), AbstractC10651l.yandex), c0303l);
    }

    @Override // defpackage.InterfaceC10726l
    public int Signature(InterfaceC18035l interfaceC18035l) {
        m676synchronized();
        throw null;
    }

    @Override // defpackage.InterfaceC14988l
    public Object ad(InterfaceC18035l interfaceC18035l, int i, InterfaceC16588l interfaceC16588l, Object obj) {
        if (interfaceC16588l.purchase().crashlytics() || pro()) {
            return mopub(interfaceC16588l);
        }
        startapp();
        return null;
    }

    @Override // defpackage.InterfaceC14988l
    public Object ads(InterfaceC18035l interfaceC18035l, int i, InterfaceC16588l interfaceC16588l, Object obj) {
        return mopub(interfaceC16588l);
    }

    @Override // defpackage.InterfaceC14988l
    public InterfaceC10726l amazon(C4495l c4495l, int i) {
        return adcel(c4495l.isPro(i));
    }

    @Override // defpackage.InterfaceC10726l
    public abstract short applovin();

    @Override // defpackage.InterfaceC10726l
    public float appmetrica() {
        m676synchronized();
        throw null;
    }

    @Override // defpackage.InterfaceC10726l
    public char billing() {
        m676synchronized();
        throw null;
    }

    @Override // defpackage.InterfaceC14988l
    public long inmobi(InterfaceC18035l interfaceC18035l, int i) {
        return license();
    }

    @Override // defpackage.InterfaceC14988l
    public float isPro(C4495l c4495l, int i) {
        return appmetrica();
    }

    @Override // defpackage.InterfaceC14988l
    public boolean isVip(InterfaceC18035l interfaceC18035l, int i) {
        return purchase();
    }

    @Override // defpackage.InterfaceC10726l
    public abstract long license();

    @Override // defpackage.InterfaceC14988l
    public short metrica(C4495l c4495l, int i) {
        return applovin();
    }

    @Override // defpackage.InterfaceC10726l
    public Object mopub(InterfaceC16588l interfaceC16588l) {
        return interfaceC16588l.loadAd(this);
    }

    @Override // defpackage.InterfaceC14988l
    public double premium(InterfaceC18035l interfaceC18035l, int i) {
        return mo677throws();
    }

    @Override // defpackage.InterfaceC10726l
    public boolean pro() {
        return true;
    }

    @Override // defpackage.InterfaceC10726l
    public boolean purchase() {
        m676synchronized();
        throw null;
    }

    @Override // defpackage.InterfaceC14988l
    public String remoteconfig(InterfaceC18035l interfaceC18035l, int i) {
        return tapsense();
    }

    @Override // defpackage.InterfaceC10726l
    public abstract byte signatures();

    @Override // defpackage.InterfaceC14988l
    public byte smaato(C4495l c4495l, int i) {
        return signatures();
    }

    @Override // defpackage.InterfaceC14988l
    public char subs(C4495l c4495l, int i) {
        return billing();
    }

    @Override // defpackage.InterfaceC14988l
    public int subscription(InterfaceC18035l interfaceC18035l, int i) {
        return vip();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public Object m676synchronized() {
        throw new C14747l(AbstractC18202l.yandex.loadAd(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.InterfaceC10726l
    public String tapsense() {
        m676synchronized();
        throw null;
    }

    @Override // defpackage.InterfaceC10726l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public double mo677throws() {
        m676synchronized();
        throw null;
    }

    @Override // defpackage.InterfaceC10726l
    public abstract int vip();

    @Override // defpackage.InterfaceC10726l
    public void startapp() {
    }

    @Override // defpackage.InterfaceC10726l
    public InterfaceC10726l adcel(InterfaceC18035l interfaceC18035l) {
        return this;
    }

    @Override // defpackage.InterfaceC10726l
    public InterfaceC14988l crashlytics(InterfaceC18035l interfaceC18035l) {
        return this;
    }

    @Override // defpackage.InterfaceC14988l
    public void yandex(InterfaceC18035l interfaceC18035l) {
    }
}
