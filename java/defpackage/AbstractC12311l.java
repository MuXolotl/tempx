package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّؑ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12311l {
    public static final C0349l yandex = new C0349l();

    public static final void admob(C10954l c10954l, String str, int i, int i2, int i3, boolean z) {
        if (i2 == -1) {
            int iVip = vip(i, i3, str);
            int iRemoteconfig = remoteconfig(iVip, i3, str);
            if (iRemoteconfig > iVip) {
                c10954l.mo199class(z ? AbstractC2208l.amazon(iVip, iRemoteconfig, 12, str) : str.substring(iVip, iRemoteconfig), C2580l.f5619l);
                return;
            }
            return;
        }
        int iVip2 = vip(i, i2, str);
        int iRemoteconfig2 = remoteconfig(iVip2, i2, str);
        if (iRemoteconfig2 > iVip2) {
            String strAmazon = z ? AbstractC2208l.amazon(iVip2, iRemoteconfig2, 12, str) : str.substring(iVip2, iRemoteconfig2);
            int iVip3 = vip(i2 + 1, i3, str);
            int iRemoteconfig3 = remoteconfig(iVip3, i3, str);
            c10954l.mo214l(strAmazon, z ? AbstractC2208l.amazon(iVip3, iRemoteconfig3, 8, str) : str.substring(iVip3, iRemoteconfig3));
        }
    }

    public static final void amazon(C6956l c6956l, Object obj, Function2 function2) {
        InterfaceC12932l interfaceC12932l = c6956l.f14592case;
        boolean zBilling = c6956l.billing(obj);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            objM2132native = new C13389l(interfaceC12932l, function2);
            c6956l.m2147try(objM2132native);
        }
    }

    public static final void billing(Function0 function0, C6956l c6956l) {
        C6323l c6323l = c6956l.f14597extends.loadAd.yandex;
        c6323l.isPro(C10432l.amazon);
        AbstractC12225l.smaato(c6323l, 0, function0);
    }

    public static final void crashlytics(Object[] objArr, Function1 function1, C6956l c6956l) {
        boolean zBilling = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zBilling |= c6956l.billing(obj);
        }
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            c6956l.m2147try(new C10574l(function1));
        }
    }

    public static int firebase(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    public static final InterfaceC2262l isPro(C6956l c6956l) {
        return new C3800l(c6956l.f14592case);
    }

    public static final void loadAd(Object obj, Function1 function1, C6956l c6956l) {
        boolean zBilling = c6956l.billing(obj);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            objM2132native = new C10574l(function1);
            c6956l.m2147try(objM2132native);
        }
    }

    public static final long mopub(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void purchase(Object obj, Object obj2, Function2 function2, C6956l c6956l) {
        InterfaceC12932l interfaceC12932l = c6956l.f14592case;
        boolean zBilling = c6956l.billing(obj) | c6956l.billing(obj2);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            objM2132native = new C13389l(interfaceC12932l, function2);
            c6956l.m2147try(objM2132native);
        }
    }

    public static final int remoteconfig(int i, int i2, String str) {
        while (i2 > i && AbstractC8576l.remoteconfig(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static InterfaceC14665l smaato(int i, int i2, String str) {
        String str2;
        int i3;
        int i4;
        int i5 = 0;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        boolean z = (i2 & 8) != 0;
        if (i > AbstractC12024l.m3350volatile(str)) {
            InterfaceC14665l.loadAd.getClass();
            return C8070l.crashlytics;
        }
        C6928l c6928l = InterfaceC14665l.loadAd;
        C10954l c10954l = new C10954l(13);
        int iM3350volatile = AbstractC12024l.m3350volatile(str);
        if (i <= iM3350volatile) {
            i3 = i;
            int i6 = i3;
            i4 = -1;
            while (true) {
                if (i5 != 1000) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt == '&') {
                        str2 = str;
                        admob(c10954l, str2, i3, i4, i6, z);
                        i5++;
                        i3 = i6 + 1;
                        i4 = -1;
                    } else if (cCharAt == '=' && i4 == -1) {
                        str2 = str;
                        i4 = i6;
                    } else {
                        str2 = str;
                    }
                    if (i6 == iM3350volatile) {
                        break;
                    }
                    i6++;
                    str = str2;
                }
                return c10954l.build();
            }
        }
        str2 = str;
        i3 = i;
        i4 = -1;
        if (i5 != 1000) {
            admob(c10954l, str2, i3, i4, str2.length(), z);
        }
        return c10954l.build();
    }

    public static InterfaceC7637l subs(String str, List list) {
        C3198l c3198l;
        C5047l c5047l = new C5047l();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c3198l = C3198l.loadAd;
            if (!zHasNext) {
                break;
            }
            InterfaceC7637l interfaceC7637l = (InterfaceC7637l) it.next();
            if (interfaceC7637l != c3198l) {
                if (interfaceC7637l instanceof C0116l) {
                    AbstractC3984l.pro(c5047l, ((C0116l) interfaceC7637l).crashlytics);
                } else {
                    c5047l.add(interfaceC7637l);
                }
            }
        }
        int i = c5047l.f10316l;
        if (i != 0) {
            return i != 1 ? new C0116l(str, (InterfaceC7637l[]) c5047l.toArray(new InterfaceC7637l[0])) : (InterfaceC7637l) c5047l.get(0);
        }
        return c3198l;
    }

    public static final int vip(int i, int i2, String str) {
        while (i < i2 && AbstractC8576l.remoteconfig(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static final void yandex(Object obj, Object obj2, Function1 function1, C6956l c6956l) {
        boolean zBilling = c6956l.billing(obj) | c6956l.billing(obj2);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            objM2132native = new C10574l(function1);
            c6956l.m2147try(objM2132native);
        }
    }
}
