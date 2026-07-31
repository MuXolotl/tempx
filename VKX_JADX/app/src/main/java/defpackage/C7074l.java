package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؘؚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7074l {
    public InterfaceC2800l admob;
    public boolean amazon;
    public boolean billing;
    public boolean crashlytics;
    public final /* synthetic */ int isPro;
    public boolean mopub;
    public boolean purchase;
    public final InterfaceC2800l yandex;
    public boolean loadAd = true;
    public final HashMap subs = new HashMap();

    public C7074l(InterfaceC2800l interfaceC2800l, int i) {
        this.isPro = i;
        this.yandex = interfaceC2800l;
    }

    public static final void yandex(C7074l c7074l, AbstractC12914l abstractC12914l, int i, AbstractC18026l abstractC18026l) {
        HashMap map = c7074l.subs;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jSubs = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (c7074l.isPro) {
                    case 0:
                        InterfaceC10702l interfaceC10702l = abstractC18026l.f35287l;
                        if (interfaceC10702l != null) {
                            C6577l c6577l = (C6577l) interfaceC10702l;
                            float[] fArrLoadAd = c6577l.loadAd();
                            if (!c6577l.f13738l) {
                                jSubs = C10924l.loadAd(jSubs, fArrLoadAd);
                            }
                        }
                        jSubs = AbstractC3383l.subs(jSubs, abstractC18026l.f35291l);
                        break;
                    default:
                        long j = abstractC18026l.mo2645l().f4024l;
                        jSubs = C1187l.subs((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jSubs);
                        break;
                }
                abstractC18026l = abstractC18026l.f35294l;
                if (AbstractC8576l.yandex(abstractC18026l, c7074l.yandex.purchase())) {
                    int iRound = Math.round(abstractC12914l instanceof C17857l ? Float.intBitsToFloat((int) (jSubs & 4294967295L)) : Float.intBitsToFloat((int) (jSubs >> 32)));
                    if (map.containsKey(abstractC12914l)) {
                        int iIntValue = ((Number) AbstractC8676l.smaato(abstractC12914l, map)).intValue();
                        C17857l c17857l = AbstractC12013l.yandex;
                        iRound = ((Number) abstractC12914l.yandex.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(abstractC12914l, Integer.valueOf(iRound));
                    return;
                }
            } while (!c7074l.loadAd(abstractC18026l).containsKey(abstractC12914l));
            float fCrashlytics = c7074l.crashlytics(abstractC18026l, abstractC12914l);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fCrashlytics);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fCrashlytics);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final void admob() {
        C7074l c7074lYandex;
        C7074l c7074lYandex2;
        boolean zAmazon = amazon();
        InterfaceC2800l interfaceC2800l = this.yandex;
        if (!zAmazon) {
            InterfaceC2800l interfaceC2800lBilling = interfaceC2800l.billing();
            if (interfaceC2800lBilling == null) {
                return;
            }
            interfaceC2800l = interfaceC2800lBilling.yandex().admob;
            if (interfaceC2800l == null || !interfaceC2800l.yandex().amazon()) {
                InterfaceC2800l interfaceC2800l2 = this.admob;
                if (interfaceC2800l2 == null || interfaceC2800l2.yandex().amazon()) {
                    return;
                }
                InterfaceC2800l interfaceC2800lBilling2 = interfaceC2800l2.billing();
                if (interfaceC2800lBilling2 != null && (c7074lYandex2 = interfaceC2800lBilling2.yandex()) != null) {
                    c7074lYandex2.admob();
                }
                InterfaceC2800l interfaceC2800lBilling3 = interfaceC2800l2.billing();
                interfaceC2800l = (interfaceC2800lBilling3 == null || (c7074lYandex = interfaceC2800lBilling3.yandex()) == null) ? null : c7074lYandex.admob;
            }
        }
        this.admob = interfaceC2800l;
    }

    public final boolean amazon() {
        return this.crashlytics || this.purchase || this.billing || this.mopub;
    }

    public final void billing() {
        this.loadAd = true;
        InterfaceC2800l interfaceC2800l = this.yandex;
        InterfaceC2800l interfaceC2800lBilling = interfaceC2800l.billing();
        if (interfaceC2800lBilling == null) {
            return;
        }
        if (this.crashlytics) {
            interfaceC2800lBilling.mo1263extends();
        } else if (this.purchase || this.amazon) {
            interfaceC2800lBilling.requestLayout();
        }
        if (this.billing) {
            interfaceC2800l.mo1263extends();
        }
        if (this.mopub) {
            interfaceC2800l.requestLayout();
        }
        interfaceC2800lBilling.yandex().billing();
    }

    public final int crashlytics(AbstractC18026l abstractC18026l, AbstractC12914l abstractC12914l) {
        switch (this.isPro) {
            case 0:
                return abstractC18026l.mo884throw(abstractC12914l);
            default:
                return abstractC18026l.mo2645l().mo884throw(abstractC12914l);
        }
    }

    public final Map loadAd(AbstractC18026l abstractC18026l) {
        switch (this.isPro) {
            case 0:
                return abstractC18026l.mo1000l().yandex();
            default:
                return abstractC18026l.mo2645l().mo1000l().yandex();
        }
    }

    public final void mopub() {
        HashMap map = this.subs;
        map.clear();
        C3006l c3006l = new C3006l(0, this);
        InterfaceC2800l interfaceC2800l = this.yandex;
        interfaceC2800l.signatures(c3006l);
        map.putAll(loadAd(interfaceC2800l.purchase()));
        this.loadAd = false;
    }

    public final boolean purchase() {
        admob();
        return this.admob != null;
    }
}
