package defpackage;

import androidx.car.app.model.Alert;
import java.util.Collections;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍُۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11308l {
    public static C14115l amazon;
    public static C13601l billing;
    public static C2151l purchase;
    public static final C15578l yandex = new C15578l(-1022579475, false, new C0263l(18));
    public static final C15578l loadAd = new C15578l(-1111347741, false, new C0263l(19));
    public static final C15578l crashlytics = new C15578l(1086138917, false, new C0263l(20));

    public static final C8195l amazon(Object obj, Object obj2) {
        return new C8195l(obj, obj2);
    }

    public static final C14329l crashlytics(boolean z, C1243l c1243l, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            C8339l.smaato("Check failed.");
            return null;
        }
        C10227l c10227lAdmob = AbstractC14055l.admob();
        if (z) {
            c10227lAdmob.add(new C15699l("-"));
        }
        c10227lAdmob.add(new C6994l(Collections.singletonList(new C6040l(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), c1243l, str, z))));
        return new C14329l(AbstractC14055l.purchase(c10227lAdmob), C2580l.f5619l);
    }

    public static final C14329l loadAd(Integer num, Integer num2, Integer num3, C1243l c1243l, String str, boolean z) {
        int iIntValue;
        C2580l c2580l;
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Alert.DURATION_SHOW_INDEFINITELY;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return crashlytics(z, c1243l, str, iIntValue2, iIntValue);
        }
        C14329l c14329lCrashlytics = crashlytics(z, c1243l, str, iIntValue2, iIntValue2);
        while (true) {
            c2580l = C2580l.f5619l;
            if (iIntValue2 >= iMin) {
                break;
            }
            iIntValue2++;
            c14329lCrashlytics = new C14329l(c2580l, AbstractC14055l.remoteconfig(crashlytics(z, c1243l, str, iIntValue2, iIntValue2), AbstractC1889l.loadAd(AbstractC14055l.remoteconfig(new C14329l(Collections.singletonList(new C15699l(" ")), c2580l), c14329lCrashlytics))));
        }
        if (iIntValue3 > iIntValue) {
            return AbstractC1889l.loadAd(AbstractC14055l.remoteconfig(new C14329l(Collections.singletonList(new C15699l(AbstractC16648l.ad(iIntValue3 - iIntValue, " "))), c2580l), c14329lCrashlytics));
        }
        return iIntValue3 == iIntValue ? c14329lCrashlytics : new C14329l(c2580l, AbstractC14055l.remoteconfig(crashlytics(z, c1243l, str, iIntValue3 + 1, iIntValue), c14329lCrashlytics));
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, InterfaceC13460l interfaceC13460l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        c6956l.m2133new(380139498);
        if ((i & 6) == 0) {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c6956l.billing(interfaceC13460l) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i & 3072) == 0) {
            i5 |= c6956l.admob(c15578l) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                interfaceC13460l = C18450l.f36026l;
            }
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(interfaceC13460l, false);
            boolean zBilling = c6956l.billing(interfaceC10835lAmazon) | ((i5 & 7168) == 2048);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new Cpublic(interfaceC10835lAmazon, c15578l, 24);
                c6956l.m2147try(objM2132native);
            }
            AbstractC4333l.yandex(interfaceC17242l, (Function2) objM2132native, c6956l, i5 & 14, 0);
        } else {
            c6956l.m2124else();
        }
        InterfaceC13460l interfaceC13460l2 = interfaceC13460l;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12348l(interfaceC17242l, interfaceC13460l2, c15578l, i, i2);
        }
    }
}
