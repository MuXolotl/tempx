package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙّۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6419l {
    public static final C15578l yandex = new C15578l(-94136866, false, new C10673l(7));
    public static final C15578l loadAd = new C15578l(-1578602681, false, new C10673l(8));

    public static String admob(long j) {
        String hexString = Long.toHexString(j);
        return hexString.length() == 1 ? "0x0".concat(hexString) : "0x".concat(hexString);
    }

    public static final void amazon(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i2;
        c6956l.m2133new(155925518);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        int i3 = 3;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            boolean z = c6956l.isPro(AbstractC8574l.yandex) != null;
            boolean z2 = c6956l.isPro(AbstractC8574l.loadAd) != null;
            if (z && z2) {
                c6956l.m2123default(-1977187922);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
                long j = c6956l.f14595continue;
                int i4 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                c15578l.invoke(c6956l, Integer.valueOf((i2 >> 3) & 14));
                c6956l.startapp(true);
                c6956l.startapp(false);
            } else if (z) {
                c6956l.m2123default(-1976997706);
                AbstractC1213l.yandex(i2 & 126, c15578l, c6956l, interfaceC17242l);
                c6956l.startapp(false);
            } else if (z2) {
                c6956l.m2123default(-1976846922);
                AbstractC10216l.amazon(i2 & 126, c15578l, c6956l, interfaceC17242l);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1976716505);
                crashlytics(i2 & 126, c15578l, c6956l, interfaceC17242l);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13085l(interfaceC17242l, c15578l, i, i3);
        }
    }

    public static String billing(byte b) {
        return "0x" + Integer.toHexString(b);
    }

    public static final void crashlytics(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i2;
        c6956l.m2133new(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                C10086l c10086l = new C10086l(null, C18450l.f36015l);
                c6956l.m2147try(c10086l);
                objM2132native = c10086l;
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C0289l(interfaceC8714l, 27);
                c6956l.m2147try(objM2132native2);
            }
            Function0 function0 = (Function0) objM2132native2;
            C12288l c12288l = AbstractC10216l.yandex;
            C2769l c2769lAmazon = C2287l.amazon(AbstractC5998l.loadAd, c6956l, 6);
            AbstractC10478l.loadAd(new C10092l[]{AbstractC8574l.loadAd.yandex(AbstractC1213l.mopub(function0, c6956l, 2)), AbstractC8574l.yandex.yandex(c2769lAmazon)}, AbstractC14566l.amazon(1070596993, new C0843l(interfaceC17242l, interfaceC8714l, c15578l, c2769lAmazon, function0), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13085l(interfaceC17242l, c15578l, i, i3);
        }
    }

    public static AbstractC18041l firebase(AbstractC18041l abstractC18041l, List list, InterfaceC3841l interfaceC3841l, int i) {
        if ((i & 2) != 0) {
            interfaceC3841l = abstractC18041l.getAnnotations();
        }
        if ((list.isEmpty() || list == abstractC18041l.inmobi()) && interfaceC3841l == abstractC18041l.getAnnotations()) {
            return abstractC18041l;
        }
        C16017l c16017lMo1340package = abstractC18041l.mo1340package();
        if ((interfaceC3841l instanceof C18341l) && ((C18341l) interfaceC3841l).isEmpty()) {
            interfaceC3841l = C2782l.f6058l;
        }
        C16017l c16017lSubscription = AbstractC3058l.subscription(c16017lMo1340package, interfaceC3841l);
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        if (abstractC14318lMo3847class instanceof AbstractC4317l) {
            AbstractC4317l abstractC4317l = (AbstractC4317l) abstractC14318lMo3847class;
            return AbstractC3605l.subs(isPro(abstractC4317l.f8857l, list, c16017lSubscription), isPro(abstractC4317l.f8856l, list, c16017lSubscription));
        }
        if (abstractC14318lMo3847class instanceof AbstractC15211l) {
            return isPro((AbstractC15211l) abstractC14318lMo3847class, list, c16017lSubscription);
        }
        C18725l.billing();
        return null;
    }

    public static final AbstractC15211l isPro(AbstractC15211l abstractC15211l, List list, C16017l c16017l) {
        if (list.isEmpty() && c16017l == abstractC15211l.mo1340package()) {
            return abstractC15211l;
        }
        if (list.isEmpty()) {
            return abstractC15211l.mo686abstract(c16017l);
        }
        if (!(abstractC15211l instanceof C14487l)) {
            return AbstractC3605l.ads(c16017l, abstractC15211l.mo1339native(), list, abstractC15211l.mo1342throw());
        }
        C14487l c14487l = (C14487l) abstractC15211l;
        InterfaceC1925l interfaceC1925l = c14487l.f28364l;
        C7662l c7662l = c14487l.f28361l;
        EnumC5123l enumC5123l = c14487l.f28366l;
        boolean z = c14487l.f28367l;
        String[] strArr = c14487l.f28362l;
        return new C14487l(interfaceC1925l, c7662l, enumC5123l, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final void loadAd(Function0 function0, InterfaceC17242l interfaceC17242l, C5069l c5069l, C3665l c3665l, C5894l c5894l, C9103l c9103l, C8013l c8013l, InterfaceC11780l interfaceC11780l, Function3 function3, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-2020606796);
        if ((i & 6) == 0) {
            i2 = i | (c6956l.admob(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (c6956l.billing(interfaceC17242l) ? 32 : 16) | (c6956l.admob(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.mopub(true) ? 2048 : 1024) | (c6956l.billing(c5069l) ? 16384 : 8192) | (c6956l.billing(c3665l) ? 131072 : 65536) | (c6956l.billing(c5894l) ? 1048576 : 524288) | (c6956l.billing(c9103l) ? 8388608 : 4194304) | (c6956l.crashlytics(0.0f) ? 67108864 : 33554432) | (c6956l.billing(c8013l) ? 536870912 : 268435456);
        int i4 = (c6956l.billing(interfaceC11780l) ? 4 : 2) | 384 | (c6956l.billing(null) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C10351l(21);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242l, false, (Function1) objM2132native);
            int i5 = AbstractC2798l.yandex;
            AbstractC16291l.loadAd(function0, interfaceC17242lYandex, true, new C8886l(c5894l.yandex, c5894l.loadAd, c5894l.crashlytics, c5894l.amazon, c5894l.purchase), new C7568l(c9103l.yandex, c9103l.loadAd, c9103l.crashlytics, c9103l.amazon, c9103l.purchase, c9103l.billing, c9103l.mopub, c9103l.admob), new C10513l(1.0f, 1.1f, 1.0f, 1.0f, 1.0f), new C9486l(c8013l.yandex, c8013l.loadAd, c8013l.crashlytics, c8013l.amazon, c8013l.purchase), new C11568l(c3665l.yandex, c3665l.loadAd, c3665l.crashlytics), null, AbstractC14566l.amazon(-86283501, new C7442l(interfaceC11780l, function3, 12), c6956l), c6956l, ((i3 >> 12) & 57344) | (i3 & 8078), ((i4 >> 3) & 14) | 48, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16333l(function0, interfaceC17242l, c5069l, c3665l, c5894l, c9103l, c8013l, interfaceC11780l, function3, i, 0);
        }
    }

    public static String mopub(int i) {
        return "0x" + Integer.toHexString(i);
    }

    public static String purchase(long j) {
        return j + " (" + admob(j) + ")";
    }

    public static /* synthetic */ AbstractC15211l smaato(AbstractC15211l abstractC15211l, List list, C16017l c16017l, int i) {
        if ((i & 1) != 0) {
            list = abstractC15211l.inmobi();
        }
        if ((i & 2) != 0) {
            c16017l = abstractC15211l.mo1340package();
        }
        return isPro(abstractC15211l, list, c16017l);
    }

    public static final AbstractC15211l subs(AbstractC18041l abstractC18041l) {
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        AbstractC15211l abstractC15211l = abstractC14318lMo3847class instanceof AbstractC15211l ? (AbstractC15211l) abstractC14318lMo3847class : null;
        if (abstractC15211l != null) {
            return abstractC15211l;
        }
        C17132l.metrica(abstractC18041l, "This is should be simple type: ");
        return null;
    }

    public static final void yandex(Function0 function0, InterfaceC17242l interfaceC17242l, C9103l c9103l, InterfaceC11780l interfaceC11780l, Function3 function3, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2 = (i2 & 2) != 0 ? C4346l.f8873l : interfaceC17242l;
        C6839l c6839l = AbstractC14927l.yandex;
        C5069l c5069l = new C5069l();
        C4442l c4442l = C4442l.loadAd;
        C3665l c3665l = new C3665l(c4442l, c4442l, c4442l);
        C6839l c6839l2 = AbstractC14927l.yandex;
        C5894l c5894l = new C5894l(c6839l2, c6839l2, c6839l2, c6839l2, c6839l2);
        C9103l c9103lYandex = (i2 & 128) != 0 ? AbstractC14927l.yandex(0L, c6956l, 255) : c9103l;
        C2209l c2209l = C2209l.crashlytics;
        loadAd(function0, interfaceC17242l2, c5069l, c3665l, c5894l, c9103lYandex, new C8013l(c2209l, c2209l, c2209l, c2209l, new C2209l(AbstractC2576l.yandex(1.5f, C9735l.loadAd(0.2f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).billing())), c6839l2, 2)), (i2 & 1024) != 0 ? AbstractC14927l.loadAd : interfaceC11780l, function3, c6956l, i & 2147483646);
    }
}
