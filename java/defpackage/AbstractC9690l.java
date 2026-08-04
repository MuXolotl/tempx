package defpackage;

/* JADX INFO: renamed from: lًٍٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9690l {
    public static final StackTraceElement[] yandex = new StackTraceElement[0];

    public static final C1809l amazon(InterfaceC6357l interfaceC6357l) {
        Object objSignature = interfaceC6357l.Signature();
        if (objSignature instanceof C1809l) {
            return (C1809l) objSignature;
        }
        return null;
    }

    public static final Object billing(InterfaceC18556l interfaceC18556l, AbstractC5189l abstractC5189l) {
        C11890l c11890l = (C11890l) interfaceC18556l;
        Object objLoadAd = c11890l.get(abstractC5189l);
        if (objLoadAd == null) {
            objLoadAd = abstractC5189l.loadAd();
        }
        return ((InterfaceC2180l) objLoadAd).yandex(c11890l);
    }

    public static final InterfaceC18212l crashlytics(InterfaceC18212l interfaceC18212l) {
        InterfaceC18212l interfaceC18212l2;
        InterfaceC18212l interfaceC18212lPro = interfaceC18212l.pro();
        while (true) {
            InterfaceC18212l interfaceC18212l3 = interfaceC18212lPro;
            interfaceC18212l2 = interfaceC18212l;
            interfaceC18212l = interfaceC18212l3;
            if (interfaceC18212l == null) {
                break;
            }
            interfaceC18212lPro = interfaceC18212l.pro();
        }
        AbstractC18026l abstractC18026l = interfaceC18212l2 instanceof AbstractC18026l ? (AbstractC18026l) interfaceC18212l2 : null;
        if (abstractC18026l == null) {
            return interfaceC18212l2;
        }
        AbstractC18026l abstractC18026l2 = abstractC18026l.f35294l;
        while (true) {
            AbstractC18026l abstractC18026l3 = abstractC18026l2;
            AbstractC18026l abstractC18026l4 = abstractC18026l;
            abstractC18026l = abstractC18026l3;
            if (abstractC18026l == null) {
                return abstractC18026l4;
            }
            abstractC18026l2 = abstractC18026l.f35294l;
        }
    }

    public static final C8896l loadAd(InterfaceC18212l interfaceC18212l, boolean z) {
        InterfaceC18212l interfaceC18212lCrashlytics = crashlytics(interfaceC18212l);
        float fSmaato = (int) (interfaceC18212lCrashlytics.smaato() >> 32);
        float fSmaato2 = (int) (interfaceC18212lCrashlytics.smaato() & 4294967295L);
        C8896l c8896lMo2592synchronized = interfaceC18212lCrashlytics.mo2592synchronized(interfaceC18212l, z);
        float f = c8896lMo2592synchronized.yandex;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fSmaato) {
                f = fSmaato;
            }
        }
        float f2 = c8896lMo2592synchronized.loadAd;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fSmaato2) {
                f2 = fSmaato2;
            }
        }
        float f3 = c8896lMo2592synchronized.crashlytics;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fSmaato) {
                fSmaato = f3;
            }
            f3 = fSmaato;
        }
        float f4 = c8896lMo2592synchronized.amazon;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fSmaato2) {
                fSmaato2 = f5;
            }
            f4 = fSmaato2;
        }
        if (f == f3 || f2 == f4) {
            return C8896l.purchase;
        }
        long jAmazon = interfaceC18212lCrashlytics.amazon((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jAmazon2 = interfaceC18212lCrashlytics.amazon((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jAmazon3 = interfaceC18212lCrashlytics.amazon((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jAmazon4 = interfaceC18212lCrashlytics.amazon((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jAmazon >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jAmazon2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jAmazon4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jAmazon3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jAmazon & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jAmazon2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jAmazon4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jAmazon3 & 4294967295L));
        return new C8896l(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final C11890l mopub(C10092l[] c10092lArr, InterfaceC18556l interfaceC18556l, InterfaceC18556l interfaceC18556l2) {
        C11890l c11890l = C11890l.f23708l;
        C12992l c12992l = new C12992l(c11890l);
        c12992l.f25462l = c11890l;
        for (C10092l c10092l : c10092lArr) {
            AbstractC5189l abstractC5189l = c10092l.yandex;
            if (c10092l.mopub || !((C11890l) interfaceC18556l).containsKey(abstractC5189l)) {
                c12992l.put(abstractC5189l, abstractC5189l.amazon(c10092l, (InterfaceC2180l) ((C11890l) interfaceC18556l2).get(abstractC5189l)));
            }
        }
        return c12992l.build();
    }

    public static final float purchase(C1809l c1809l) {
        if (c1809l != null) {
            return c1809l.yandex;
        }
        return 0.0f;
    }

    public static final C8896l yandex(InterfaceC18212l interfaceC18212l) {
        InterfaceC18212l interfaceC18212lPro = interfaceC18212l.pro();
        return interfaceC18212lPro != null ? interfaceC18212lPro.mo2592synchronized(interfaceC18212l, true) : new C8896l(0.0f, 0.0f, (int) (interfaceC18212l.smaato() >> 32), (int) (interfaceC18212l.smaato() & 4294967295L));
    }
}
