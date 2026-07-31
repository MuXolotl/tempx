package defpackage;

import android.graphics.PointF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3058l {
    public static final C15578l yandex = new C15578l(582825681, false, new C5974l(23));
    public static final C15578l loadAd = new C15578l(1850464817, false, new C5974l(24));
    public static final C15578l crashlytics = new C15578l(-1553632184, false, new C5974l(25));

    public static final long adcel(long j, long j2, float f) {
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            return AbstractC2296l.billing(j, j2, f);
        }
        return f < 0.5f ? j : j2;
    }

    public static final int admob(C6222l c6222l, long j, InterfaceC3114l interfaceC3114l) {
        float fMopub = interfaceC3114l != null ? interfaceC3114l.mopub() : 0.0f;
        int i = (int) (4294967295L & j);
        int iPurchase = c6222l.purchase(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < c6222l.billing(iPurchase) - fMopub || Float.intBitsToFloat(i) > c6222l.loadAd(iPurchase) + fMopub) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fMopub) || Float.intBitsToFloat(i2) > c6222l.amazon + fMopub) {
            return -1;
        }
        return iPurchase;
    }

    public static int ads() {
        return Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
    }

    public static final long amazon(C10312l c10312l, C8896l c8896l, C8896l c8896l2, int i) {
        long jFirebase = firebase(c10312l, c8896l, i);
        if (C12814l.amazon(jFirebase)) {
            return C12814l.loadAd;
        }
        long jFirebase2 = firebase(c10312l, c8896l2, i);
        if (C12814l.amazon(jFirebase2)) {
            return C12814l.loadAd;
        }
        int i2 = (int) (jFirebase >> 32);
        int i3 = (int) (jFirebase2 & 4294967295L);
        return AbstractC2296l.loadAd(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final long billing(CharSequence charSequence, int i) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!remoteconfig(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (!remoteconfig(iCodePointAt)) {
                break;
            }
            i += Character.charCount(iCodePointAt);
        }
        return AbstractC2296l.loadAd(iCharCount, i);
    }

    public static final long crashlytics(C17812l c17812l, C8896l c8896l, C8896l c8896l2, int i) {
        long jIsPro = isPro(c17812l, c8896l, i);
        if (C12814l.amazon(jIsPro)) {
            return C12814l.loadAd;
        }
        long jIsPro2 = isPro(c17812l, c8896l2, i);
        if (C12814l.amazon(jIsPro2)) {
            return C12814l.loadAd;
        }
        int i2 = (int) (jIsPro >> 32);
        int i3 = (int) (jIsPro2 & 4294967295L);
        return AbstractC2296l.loadAd(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final long firebase(C10312l c10312l, C8896l c8896l, int i) {
        C0327l c0327lCrashlytics = c10312l.crashlytics();
        C6222l c6222l = c0327lCrashlytics != null ? c0327lCrashlytics.loadAd : null;
        InterfaceC18212l interfaceC18212lPurchase = c10312l.purchase();
        return (c6222l == null || interfaceC18212lPurchase == null) ? C12814l.loadAd : c6222l.admob(c8896l.vip(interfaceC18212lPurchase.mo2590package(0L)), i, C6168l.f13003l);
    }

    public static final long isPro(C17812l c17812l, C8896l c8896l, int i) {
        C11224l c11224lAmazon = c17812l.amazon();
        C6222l c6222l = c11224lAmazon != null ? c11224lAmazon.yandex.loadAd : null;
        InterfaceC18212l interfaceC18212lCrashlytics = c17812l.crashlytics();
        return (c6222l == null || interfaceC18212lCrashlytics == null) ? C12814l.loadAd : c6222l.admob(c8896l.vip(interfaceC18212lCrashlytics.mo2590package(0L)), i, C6168l.f13003l);
    }

    public static final long loadAd(C0327l c0327l, long j, long j2, InterfaceC18212l interfaceC18212l, InterfaceC3114l interfaceC3114l) {
        if (c0327l != null) {
            C6222l c6222l = c0327l.loadAd;
            if (interfaceC18212l != null) {
                long jMo2590package = interfaceC18212l.mo2590package(j);
                long jMo2590package2 = interfaceC18212l.mo2590package(j2);
                int iAdmob = admob(c6222l, jMo2590package, interfaceC3114l);
                int iAdmob2 = admob(c6222l, jMo2590package2, interfaceC3114l);
                if (iAdmob != -1) {
                    if (iAdmob2 != -1) {
                        iAdmob = Math.min(iAdmob, iAdmob2);
                    }
                    iAdmob2 = iAdmob;
                } else if (iAdmob2 == -1) {
                    return C12814l.loadAd;
                }
                float fLoadAd = (c6222l.loadAd(iAdmob2) + c6222l.billing(iAdmob2)) / 2.0f;
                int i = (int) (jMo2590package >> 32);
                int i2 = (int) (jMo2590package2 >> 32);
                return c6222l.admob(new C8896l(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), fLoadAd - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), fLoadAd + 0.1f), 0, C6168l.f12983l);
            }
        }
        return C12814l.loadAd;
    }

    public static final ArrayList metrica(List list, List list2, float f) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(new C9735l(AbstractC12953l.remoteconfig(((C9735l) list.get(Math.min(i, list.size() - 1))).yandex, ((C9735l) list2.get(Math.min(i, list2.size() - 1))).yandex, f)));
        }
        return arrayList;
    }

    public static final long mopub(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final boolean purchase(C0327l c0327l, int i) {
        C6222l c6222l = c0327l.loadAd;
        int iAmazon = c6222l.amazon(i);
        return i == c0327l.subs(iAmazon) || i == c6222l.crashlytics(iAmazon, false) ? c0327l.isPro(i) != c0327l.yandex(i) : c0327l.yandex(i) != c0327l.yandex(i - 1);
    }

    public static final boolean remoteconfig(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean smaato(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final ArrayList startapp(List list, List list2, float f) {
        if (list2 == null || list == null) {
            return null;
        }
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(Float.valueOf(AbstractC7572l.firebase(((Number) list.get(Math.min(i, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i, list2.size() - 1))).floatValue(), f)));
        }
        return arrayList;
    }

    public static final int subs(C6222l c6222l, long j, InterfaceC18212l interfaceC18212l, InterfaceC3114l interfaceC3114l) {
        long jMo2590package;
        int iAdmob;
        if (interfaceC18212l == null || (iAdmob = admob(c6222l, (jMo2590package = interfaceC18212l.mo2590package(j)), interfaceC3114l)) == -1) {
            return -1;
        }
        return c6222l.mopub(C1187l.yandex((c6222l.loadAd(iAdmob) + c6222l.billing(iAdmob)) / 2.0f, 1, jMo2590package));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public static final C16017l subscription(C16017l c16017l, InterfaceC3841l interfaceC3841l) {
        InterfaceC3841l interfaceC3841l2;
        C16017l c16017lAds;
        C14513l c14513l = AbstractC3791l.loadAd;
        InterfaceC13922l[] interfaceC13922lArr = AbstractC3791l.yandex;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[0];
        C7687l c7687l = (C7687l) c14513l.advert(c16017l);
        if (c7687l == null || (interfaceC3841l2 = c7687l.yandex) == null) {
            interfaceC3841l2 = C2782l.f6058l;
        }
        if (interfaceC3841l2 == interfaceC3841l) {
            return c16017l;
        }
        InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[0];
        C7687l c7687l2 = (C7687l) c14513l.advert(c16017l);
        if (c7687l2 != null) {
            if (c16017l.isEmpty()) {
                c16017lAds = c16017l;
            } else {
                AbstractC18650l abstractC18650l = c16017l.f31396l;
                ArrayList arrayList = new ArrayList();
                for (Object obj : abstractC18650l) {
                    if (!AbstractC8576l.yandex((C7687l) obj, c7687l2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == c16017l.f31396l.amazon()) {
                    c16017lAds = c16017l;
                } else {
                    C16017l.f31395l.getClass();
                    c16017lAds = C13645l.ads(arrayList);
                }
            }
            if (c16017lAds != null) {
                c16017l = c16017lAds;
            }
        }
        if (interfaceC3841l.iterator().hasNext() || !interfaceC3841l.isEmpty()) {
            C7687l c7687l3 = new C7687l(interfaceC3841l);
            C13645l c13645l = C16017l.f31395l;
            InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C7687l.class);
            c13645l.getClass();
            if (c16017l.f31396l.get(c13645l.Signature(interfaceC1388lLoadAd.billing())) == null) {
                return c16017l.isEmpty() ? new C16017l(Collections.singletonList(c7687l3)) : C13645l.ads(AbstractC16901l.m4218final(c7687l3, AbstractC16901l.m4213const(c16017l)));
            }
        }
        return c16017l;
    }

    public static final C16017l tapsense(InterfaceC3841l interfaceC3841l) {
        if (interfaceC3841l.isEmpty()) {
            C16017l.f31395l.getClass();
            return C16017l.f31394l;
        }
        C13645l c13645l = C16017l.f31395l;
        List listSingletonList = Collections.singletonList(new C7687l(interfaceC3841l));
        c13645l.getClass();
        return C13645l.ads(listSingletonList);
    }

    public static final boolean vip(int i) {
        int type;
        return (!remoteconfig(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final long yandex(long j, CharSequence charSequence) {
        int i = C12814l.crashlytics;
        int iCharCount = (int) (j >> 32);
        int iCharCount2 = (int) (4294967295L & j);
        int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(charSequence, iCharCount) : 10;
        int iCodePointAt = iCharCount2 < charSequence.length() ? Character.codePointAt(charSequence, iCharCount2) : 10;
        if (vip(iCodePointBefore) && (remoteconfig(iCodePointAt) || smaato(iCodePointAt))) {
            do {
                iCharCount -= Character.charCount(iCodePointBefore);
                if (iCharCount == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            } while (vip(iCodePointBefore));
            return AbstractC2296l.loadAd(iCharCount, iCharCount2);
        }
        if (!vip(iCodePointAt)) {
            return j;
        }
        if (!remoteconfig(iCodePointBefore) && !smaato(iCodePointBefore)) {
            return j;
        }
        do {
            iCharCount2 += Character.charCount(iCodePointAt);
            if (iCharCount2 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
        } while (vip(iCodePointAt));
        return AbstractC2296l.loadAd(iCharCount, iCharCount2);
    }
}
