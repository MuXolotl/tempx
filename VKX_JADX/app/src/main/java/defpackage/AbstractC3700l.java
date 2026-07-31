package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِؕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3700l {
    public static final C15578l yandex = new C15578l(1121996006, false, new C1659l(17));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void admob(AbstractC14971l abstractC14971l, Function0 function0) {
        C15966l c15966l = abstractC14971l.f29451l;
        if (c15966l == null) {
            c15966l = new C15966l((InterfaceC1905l) abstractC14971l);
            abstractC14971l.f29451l = c15966l;
        }
        C5227l snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(abstractC14971l)).getSnapshotObserver();
        snapshotObserver.yandex.crashlytics(c15966l, C16274l.f31856l, function0);
    }

    public static final InterfaceC8714l amazon(InterfaceC2478l interfaceC2478l, C6956l c6956l, int i) {
        InterfaceC3177l interfaceC3177l = (InterfaceC3177l) c6956l.isPro(AbstractC2431l.yandex);
        Object value = interfaceC2478l.getValue();
        AbstractC6475l abstractC6475lLoadAd = interfaceC3177l.loadAd();
        int i2 = i & 14;
        int i3 = i << 3;
        return crashlytics(interfaceC2478l, value, abstractC6475lLoadAd, c6956l, i2 | (i3 & 7168) | (i3 & 57344), 0);
    }

    public static final long billing(C10312l c10312l, long j) {
        C1187l c1187l;
        InterfaceC18212l interfaceC18212lPurchase = c10312l.purchase();
        if (interfaceC18212lPurchase != null) {
            InterfaceC18212l interfaceC18212lLoadAd = c10312l.loadAd();
            if (interfaceC18212lLoadAd != null) {
                c1187l = new C1187l((interfaceC18212lPurchase.mopub() && interfaceC18212lLoadAd.mopub()) ? interfaceC18212lPurchase.mo2593throws(interfaceC18212lLoadAd, j) : j);
            } else {
                c1187l = null;
            }
            if (c1187l != null) {
                return c1187l.yandex;
            }
        }
        return j;
    }

    public static final InterfaceC8714l crashlytics(InterfaceC6942l interfaceC6942l, Object obj, AbstractC6475l abstractC6475l, C6956l c6956l, int i, int i2) {
        int i3 = 2;
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        boolean z = true;
        Object obj2 = C17218l.f33421l;
        Object[] objArr = {interfaceC6942l, abstractC6475l, enumC8981l, obj2};
        boolean zAdmob = c6956l.admob(abstractC6475l);
        if ((((i & 7168) ^ 3072) <= 2048 || !c6956l.amazon(enumC8981l.ordinal())) && (i & 3072) != 2048) {
            z = false;
        }
        boolean zAdmob2 = zAdmob | z | c6956l.admob(obj2) | c6956l.admob(interfaceC6942l);
        Object objM2132native = c6956l.m2132native();
        Object obj3 = C1867l.yandex;
        if (zAdmob2 || objM2132native == obj3) {
            Object c0469l = new C0469l(abstractC6475l, enumC8981l, obj2, interfaceC6942l, null, 7);
            c6956l.m2147try(c0469l);
            objM2132native = c0469l;
        }
        Function2 function2 = (Function2) objM2132native;
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == obj3) {
            objM2132native2 = AbstractC8020l.smaato(obj);
            c6956l.m2147try(objM2132native2);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zAdmob3 = c6956l.admob(function2);
        Object objM2132native3 = c6956l.m2132native();
        if (zAdmob3 || objM2132native3 == obj3) {
            objM2132native3 = new C4592l(function2, interfaceC8714l, null, i3);
            c6956l.m2147try(objM2132native3);
        }
        Function2 function3 = (Function2) objM2132native3;
        InterfaceC12932l interfaceC12932l = c6956l.f14592case;
        boolean zBilling = false;
        for (Object obj4 : Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)) {
            zBilling |= c6956l.billing(obj4);
        }
        Object objM2132native4 = c6956l.m2132native();
        if (!zBilling && objM2132native4 != obj3) {
            return interfaceC8714l;
        }
        c6956l.m2147try(new C13389l(interfaceC12932l, function3));
        return interfaceC8714l;
    }

    public static final InterfaceC8714l loadAd(InterfaceC6942l interfaceC6942l, Serializable serializable, C6956l c6956l, int i) {
        return crashlytics(interfaceC6942l, serializable, ((InterfaceC3177l) c6956l.isPro(AbstractC2431l.yandex)).loadAd(), c6956l, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (i & 57344), 0);
    }

    public static final int mopub(C10834l c10834l, Object obj, int i) {
        int i2 = c10834l.f21897l;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iLoadAd = AbstractC4918l.loadAd(i2, i, c10834l.f21899l);
            if (iLoadAd < 0 || AbstractC8576l.yandex(obj, c10834l.f21898l[iLoadAd])) {
                return iLoadAd;
            }
            int i3 = iLoadAd + 1;
            while (i3 < i2 && c10834l.f21899l[i3] == i) {
                if (AbstractC8576l.yandex(obj, c10834l.f21898l[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iLoadAd - 1; i4 >= 0 && c10834l.f21899l[i4] == i; i4--) {
                if (AbstractC8576l.yandex(obj, c10834l.f21898l[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            C8339l.mopub();
            return 0;
        }
    }

    public static final InterfaceC8714l purchase(C1008l c1008l, AbstractC6475l abstractC6475l, C6956l c6956l) {
        return crashlytics(c1008l, c1008l.getValue(), abstractC6475l, c6956l, 0, 0);
    }

    public static final long yandex(long j, C8896l c8896l) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = c8896l.yandex;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = c8896l.crashlytics;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = c8896l.loadAd;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = c8896l.amazon;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat5)));
    }
}
