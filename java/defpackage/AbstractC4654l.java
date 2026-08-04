package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4654l {
    public static final int[] yandex = {1, 0, 0, -1, -1, -1, -1};
    public static final int[] loadAd = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    public static final int[] crashlytics = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void adcel(int i, int i2) {
        String strMetrica;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strMetrica = AbstractC3461l.metrica("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
                    return;
                }
                strMetrica = AbstractC3461l.metrica("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strMetrica);
        }
    }

    public static final boolean admob(char c) {
        if (c < 0 || c >= '0') {
            return 'J' <= c && c < 256;
        }
        return true;
    }

    public static void ads(int i, int i2, int i3) {
        String strSubscription;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strSubscription = subscription(i, i3, "start index");
            } else {
                strSubscription = (i2 < 0 || i2 > i3) ? subscription(i2, i3, "end index") : AbstractC3461l.metrica("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strSubscription);
        }
    }

    public static final Collection amazon(Collection collection, Collection collection2) {
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final boolean billing(char c) {
        return '0' <= c && c < ':';
    }

    public static void crashlytics(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = (4294967295L & ((long) iArr[3])) + 1 + j2;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            AbstractC4952l.tapsense(7, 4, iArr);
        }
    }

    public static void firebase(int[] iArr, int[] iArr2) {
        int iSmaato = AbstractC4952l.smaato(iArr, 7);
        int[] iArr3 = yandex;
        if (iSmaato != 0) {
            AbstractC3292l.pro(iArr3, iArr3, iArr2);
        } else {
            AbstractC3292l.pro(iArr3, iArr, iArr2);
        }
    }

    public static void isPro(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        AbstractC3292l.tapsense(iArr, iArr2, iArr4);
        smaato(iArr4, iArr3);
    }

    public static void loadAd(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC3292l.amazon(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && AbstractC3292l.adcel(iArr3, yandex))) {
            crashlytics(iArr3);
        }
    }

    public static void metrica(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC3292l.pro(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = ((4294967295L & ((long) iArr3[3])) - 1) + j2;
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                AbstractC4952l.isPro(7, 4, iArr3);
            }
        }
    }

    public static final boolean mopub(char c) {
        if (c >= 0 && c < '\t') {
            return true;
        }
        if ('\n' <= c && c < ' ') {
            return true;
        }
        if (('0' <= c && c < ':') || c == ':') {
            return true;
        }
        if ('a' <= c && c < '{') {
            return true;
        }
        if ('A' > c || c >= '[') {
            return 127 <= c && c < 256;
        }
        return true;
    }

    public static final boolean purchase(char c) {
        if (c == '\t') {
            return true;
        }
        if (' ' <= c && c < '0') {
            return true;
        }
        if (';' <= c && c < 'A') {
            return true;
        }
        if ('[' > c || c >= 'a') {
            return '{' <= c && c < 127;
        }
        return true;
    }

    public static void remoteconfig(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) - j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (4294967295L & ((long) iArr[3])) + j2 + j4;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || AbstractC4952l.tapsense(7, 4, iArr) == 0) && !(iArr[6] == -1 && AbstractC3292l.adcel(iArr, yandex))) {
            return;
        }
        crashlytics(iArr);
    }

    public static void smaato(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = (((long) iArr[9]) & 4294967295L) + j4;
        long j8 = (((long) iArr[0]) & 4294967295L) - j5;
        long j9 = j8 & 4294967295L;
        long j10 = ((((long) iArr[1]) & 4294967295L) - j6) + (j8 >> 32);
        int i = (int) j10;
        iArr2[1] = i;
        long j11 = ((((long) iArr[2]) & 4294967295L) - j7) + (j10 >> 32);
        int i2 = (int) j11;
        iArr2[2] = i2;
        long j12 = (((((long) iArr[3]) & 4294967295L) + j5) - j) + (j11 >> 32);
        long j13 = j12 & 4294967295L;
        long j14 = (((((long) iArr[4]) & 4294967295L) + j6) - j2) + (j12 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (((((long) iArr[5]) & 4294967295L) + j7) - j3) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = (((((long) iArr[6]) & 4294967295L) + j) - j4) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + 1;
        long j18 = j13 + j17;
        long j19 = j9 - j17;
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (((long) i) & 4294967295L);
            iArr2[1] = (int) j21;
            long j22 = (j21 >> 32) + (((long) i2) & 4294967295L);
            iArr2[2] = (int) j22;
            j18 += j22 >> 32;
        }
        iArr2[3] = (int) j18;
        if (((j18 >> 32) == 0 || AbstractC4952l.tapsense(7, 4, iArr2) == 0) && !(iArr2[6] == -1 && AbstractC3292l.adcel(iArr2, yandex))) {
            return;
        }
        crashlytics(iArr2);
    }

    public static void startapp(int[] iArr, int[] iArr2) {
        if (AbstractC4952l.premium(7, 0, iArr, iArr2) != 0 || (iArr2[6] == -1 && AbstractC3292l.adcel(iArr2, yandex))) {
            crashlytics(iArr2);
        }
    }

    public static final C5047l subs(ArrayList arrayList) {
        C5047l c5047l = new C5047l();
        for (Object obj : arrayList) {
            InterfaceC7637l interfaceC7637l = (InterfaceC7637l) obj;
            if (interfaceC7637l != null && interfaceC7637l != C3198l.loadAd) {
                c5047l.add(obj);
            }
        }
        return c5047l;
    }

    public static String subscription(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC3461l.metrica("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC3461l.metrica("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
        return null;
    }

    public static void vip(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC3292l.license(iArr, iArr3);
        smaato(iArr3, iArr2);
    }

    public static final void yandex(final C6893l c6893l, final InterfaceC17242l interfaceC17242l, C7583l c7583l, final C17253l c17253l, final float f, InterfaceC5404l interfaceC5404l, InterfaceC14745l interfaceC14745l, boolean z, C10306l c10306l, final Function1 function1, C6956l c6956l, final int i) {
        InterfaceC5404l interfaceC5404l2;
        final C7583l c7583l2;
        final InterfaceC14745l interfaceC14745l2;
        final boolean z2;
        final C10306l c10306l2;
        C7583l c7583l3;
        InterfaceC14745l interfaceC14745l3;
        int i2;
        boolean z3;
        C10306l c10306lLoadAd;
        boolean z4;
        C17253l c17253l2;
        c6956l.m2133new(-578931208);
        int i3 = i | (c6956l.billing(c6893l) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | 373317760;
        int i4 = c6956l.admob(function1) ? 4 : 2;
        if (c6956l.m2127for(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            c6956l.m2141switch();
            int i5 = i & 1;
            Object obj = C1867l.yandex;
            if (i5 == 0 || c6956l.ad()) {
                Object[] objArr = new Object[0];
                C13645l c13645l = C7583l.ad;
                boolean zAmazon = c6956l.amazon(0) | c6956l.amazon(0);
                Object objM2132native = c6956l.m2132native();
                if (zAmazon || objM2132native == obj) {
                    objM2132native = new C1990l(9);
                    c6956l.m2147try(objM2132native);
                }
                c7583l3 = (C7583l) AbstractC0825l.smaato(objArr, c13645l, (Function0) objM2132native, c6956l, 0);
                C17308l c17308lYandex = AbstractC0310l.yandex(c6956l);
                boolean zBilling = c6956l.billing(c17308lYandex);
                Object objM2132native2 = c6956l.m2132native();
                if (zBilling || objM2132native2 == obj) {
                    objM2132native2 = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native2);
                }
                interfaceC14745l3 = (C1192l) objM2132native2;
                i2 = i3 & (-1908409217);
                z3 = true;
                c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                z4 = true;
            } else {
                c6956l.m2124else();
                c7583l3 = c7583l;
                interfaceC14745l3 = interfaceC14745l;
                i2 = i3 & (-1908409217);
                z4 = true;
                z3 = z;
                c10306lLoadAd = c10306l;
            }
            c6956l.adcel();
            float fAmazon = interfaceC5404l.amazon();
            int i6 = (i2 & 14) | 432;
            boolean z5 = ((((i6 & 14) ^ 6) > 4 && c6956l.billing(c6893l)) || (i6 & 6) == 4) ? z4 : false;
            Object objM2132native3 = c6956l.m2132native();
            if (z5 || objM2132native3 == obj) {
                c17253l2 = c17253l;
                interfaceC5404l2 = interfaceC5404l;
                objM2132native3 = new C6330l(new C14601l(c17253l2, c6893l, interfaceC5404l2));
                c6956l.m2147try(objM2132native3);
            } else {
                c17253l2 = c17253l;
                interfaceC5404l2 = interfaceC5404l;
            }
            boolean z6 = z3;
            AbstractC12359l.yandex(c7583l3, (C6330l) objM2132native3, interfaceC17242l, c17253l2, interfaceC14745l3, z6, c10306lLoadAd, f, fAmazon, function1, c6956l, ((i2 << 6) & 7168) | 818110512, (i4 << 3) & 112);
            c7583l2 = c7583l3;
            c10306l2 = c10306lLoadAd;
            z2 = z6;
            interfaceC14745l2 = interfaceC14745l3;
        } else {
            interfaceC5404l2 = interfaceC5404l;
            c6956l.m2124else();
            c7583l2 = c7583l;
            interfaceC14745l2 = interfaceC14745l;
            z2 = z;
            c10306l2 = c10306l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            final InterfaceC5404l interfaceC5404l3 = interfaceC5404l2;
            c4224lAds.amazon = new Function2(interfaceC17242l, c7583l2, c17253l, f, interfaceC5404l3, interfaceC14745l2, z2, c10306l2, function1, i) { // from class: lٟؗٙ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ C7583l f10164l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC14745l f10165l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ boolean f10166l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f10167l;

                /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f10169l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ float f10170l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ C17253l f10171l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ C10306l f10172l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC5404l f10173l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iPurchase = AbstractC0545l.purchase(1772545);
                    AbstractC4654l.yandex(this.f10168l, this.f10167l, this.f10164l, this.f10171l, this.f10170l, this.f10173l, this.f10165l, this.f10166l, this.f10172l, this.f10169l, (C6956l) obj2, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
