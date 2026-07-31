package defpackage;

import android.text.Spanned;

/* JADX INFO: renamed from: lؙٝۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6616l {
    public static final C15578l admob;
    public static final C15578l amazon;
    public static final C15578l billing;
    public static final C15578l crashlytics;
    public static final C15578l mopub;
    public static final C15578l purchase;
    public static final C15578l yandex = new C15578l(2094288676, false, new C4606l(13));
    public static final C15578l loadAd = new C15578l(-1342205566, false, new C2039l(13));

    static {
        new C15578l(-684072357, false, new C4606l(14));
        crashlytics = new C15578l(2136598717, false, new C2039l(14));
        new C15578l(-780193532, false, new C4606l(8));
        amazon = new C15578l(-1846660506, false, new C2039l(12));
        purchase = new C15578l(-661145402, false, new C4606l(9));
        billing = new C15578l(-1113422563, false, new C4606l(10));
        mopub = new C15578l(-2101264077, false, new C4606l(11));
        admob = new C15578l(37575796, false, new C4606l(12));
    }

    public static Integer amazon(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                return str.equals("REPEAT_ALL_AND_SHUFFLE") ? 3 : null;
            case -962896020:
                return str.equals("REPEAT_SINGLE") ? 2 : null;
            case 1645938909:
                return str.equals("REPEAT_ALL") ? 1 : null;
            case 1645952171:
                return str.equals("REPEAT_OFF") ? 0 : null;
            default:
                return null;
        }
    }

    public static final boolean crashlytics(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static C5222l loadAd(AbstractC3031l abstractC3031l, boolean z, boolean z2, Boolean bool, boolean z3, C15053l c15053l, C4995l c4995l) {
        C8269l c8269l;
        C5222l c5222l;
        C15627l c15627l;
        EnumC16667l enumC16667l;
        InterfaceC5706l interfaceC5706l = (InterfaceC5706l) abstractC3031l.f6547l;
        EnumC16667l enumC16667l2 = EnumC16667l.INTERFACE;
        if (z) {
            if (bool == null) {
                C17132l.smaato(41, abstractC3031l, "isConst should not be null for property (container=");
                return null;
            }
            if (abstractC3031l instanceof C15627l) {
                C15627l c15627l2 = (C15627l) abstractC3031l;
                if (c15627l2.f30550l == enumC16667l2) {
                    return AbstractC4115l.yandex(c15053l, c15627l2.f30549l.amazon(C3498l.purchase("DefaultImpls")), c4995l);
                }
            }
            if (bool.booleanValue() && (abstractC3031l instanceof C16059l)) {
                C8269l c8269l2 = interfaceC5706l instanceof C8269l ? (C8269l) interfaceC5706l : null;
                C8353l c8353l = c8269l2 != null ? c8269l2.f17172l : null;
                if (c8353l != null) {
                    C2312l c2312l = new C2312l(c8353l.amazon().replace('/', '.'));
                    C2312l c2312lLoadAd = c2312l.loadAd();
                    C3498l c3498lMopub = c2312l.yandex.mopub();
                    C2312l c2312l2 = C2312l.crashlytics;
                    C16781l c16781l = AbstractC2130l.admob(c3498lMopub).yandex;
                    c16781l.crashlytics();
                    String strReplace = c16781l.yandex.replace('.', '$');
                    if (!c2312lLoadAd.yandex.crashlytics()) {
                        strReplace = c2312lLoadAd + '.' + strReplace;
                    }
                    C15053l c15053lRemoteconfig = c15053l.remoteconfig(strReplace);
                    if (c15053lRemoteconfig != null) {
                        return (C5222l) c15053lRemoteconfig.f29576l;
                    }
                    return null;
                }
            }
        }
        if (z2 && (abstractC3031l instanceof C15627l)) {
            C15627l c15627l3 = (C15627l) abstractC3031l;
            if (c15627l3.f30550l == EnumC16667l.COMPANION_OBJECT && (c15627l = c15627l3.f30553l) != null && ((enumC16667l = c15627l.f30550l) == EnumC16667l.CLASS || enumC16667l == EnumC16667l.ENUM_CLASS || (z3 && (enumC16667l == enumC16667l2 || enumC16667l == EnumC16667l.ANNOTATION_CLASS)))) {
                InterfaceC5706l interfaceC5706l2 = (InterfaceC5706l) c15627l.f6547l;
                C3820l c3820l = interfaceC5706l2 instanceof C3820l ? (C3820l) interfaceC5706l2 : null;
                if (c3820l != null) {
                    return c3820l.f7939l;
                }
            } else if (abstractC3031l instanceof C16059l) {
                c8269l = (C8269l) interfaceC5706l;
                c5222l = c8269l.f17171l;
                if (c5222l == null) {
                    return AbstractC4115l.yandex(c15053l, c8269l.yandex(), c4995l);
                }
                return c5222l;
            }
        } else if ((abstractC3031l instanceof C16059l) && (interfaceC5706l instanceof C8269l)) {
            c8269l = (C8269l) interfaceC5706l;
            c5222l = c8269l.f17171l;
            if (c5222l == null) {
                return AbstractC4115l.yandex(c15053l, c8269l.yandex(), c4995l);
            }
            return c5222l;
        }
        return null;
    }

    public static final boolean yandex(C8449l c8449l, long j) {
        if (!c8449l.f29454l.f29462l) {
            return false;
        }
        C11103l c11103l = (C11103l) AbstractC5573l.metrica(c8449l).f7703l.amazon;
        if (!c11103l.f22307l.f29462l) {
            return false;
        }
        long jMo2591strictfp = c11103l.mo2591strictfp(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo2591strictfp >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo2591strictfp & 4294967295L));
        long j2 = c8449l.f17458l;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }
}
