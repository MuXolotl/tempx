package defpackage;

import android.graphics.Canvas;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4918l {
    public static final int[] yandex = new int[0];
    public static final long[] loadAd = new long[0];
    public static final Object[] crashlytics = new Object[0];

    public static C9676l amazon(String str, AbstractC2017l abstractC2017l) {
        AbstractC16336l.amazon(abstractC2017l.f4542l.f16360l);
        return new C9676l(str, abstractC2017l);
    }

    public static final Object billing(Function1 function1, AbstractC0283l abstractC0283l) {
        if (abstractC0283l.metrica().mo245l(C15617l.f30510l) == null) {
            return AbstractC1789l.amazon(abstractC0283l.metrica()).mo1226super(function1, abstractC0283l);
        }
        C18725l.loadAd();
        return null;
    }

    public static final int crashlytics(int i, long j, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final int loadAd(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static C3498l purchase(C3498l c3498l, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!c3498l.f7383l) {
            String strCrashlytics = c3498l.crashlytics();
            if (AbstractC16648l.isVip(strCrashlytics, str, false) && strCrashlytics.length() != str.length() && ('a' > (cCharAt = strCrashlytics.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return C3498l.purchase(str2.concat(AbstractC12024l.m3334new(strCrashlytics, str)));
                }
                if (!z) {
                    return c3498l;
                }
                String strM3334new = AbstractC12024l.m3334new(strCrashlytics, str);
                if (strM3334new.length() != 0 && AbstractC15901l.mopub(0, strM3334new)) {
                    if (strM3334new.length() != 1 && AbstractC15901l.mopub(1, strM3334new)) {
                        Iterator it = new C8934l(0, strM3334new.length() - 1, 1).iterator();
                        do {
                            C16991l c16991l = (C16991l) it;
                            if (!c16991l.f33123l) {
                                next = null;
                                break;
                            }
                            next = c16991l.next();
                        } while (AbstractC15901l.mopub(((Number) next).intValue(), strM3334new));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strM3334new = AbstractC15901l.isPro(strM3334new.substring(0, iIntValue)).concat(strM3334new.substring(iIntValue));
                        } else {
                            strM3334new = AbstractC15901l.isPro(strM3334new);
                        }
                    } else if (strM3334new.length() != 0 && 'A' <= (cCharAt2 = strM3334new.charAt(0)) && cCharAt2 < '[') {
                        strM3334new = Character.toLowerCase(cCharAt2) + strM3334new.substring(1);
                    }
                }
                if (C3498l.billing(strM3334new)) {
                    return C3498l.purchase(strM3334new);
                }
            }
        }
        return null;
    }

    public static final C2151l yandex(C14115l c14115l) {
        Canvas canvas = AbstractC10071l.yandex;
        C2151l c2151l = new C2151l();
        c2151l.yandex = new Canvas(AbstractC5941l.loadAd(c14115l));
        return c2151l;
    }
}
