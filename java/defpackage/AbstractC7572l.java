package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7572l {
    public static Boolean firebase;
    public static Boolean isPro;
    public static Boolean smaato;
    public static Boolean subs;
    public static final C9958l yandex = new C9958l(2);
    public static final String[] loadAd = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] crashlytics = {"ad_impression"};
    public static final String[] amazon = {"ad_impression", "in_app_purchase"};
    public static final String[] purchase = {"ad_impression"};
    public static final String[] billing = {"ad_impression", "in_app_purchase"};
    public static final String[] mopub = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] admob = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static final C13400l Signature(InterfaceC2262l interfaceC2262l, InterfaceC12932l interfaceC12932l, C4993l c4993l, Function2 function2) {
        C7504l c7504lMopub = AbstractC10999l.mopub(interfaceC2262l, interfaceC12932l, 0, new C3678l(function2, c4993l, null, 1), 2);
        c7504lMopub.mo2154l(new C6383l(c4993l, 2));
        return new C13400l(c4993l, c7504lMopub);
    }

    public static void adcel() {
        boolean z;
        synchronized (AbstractC9620l.crashlytics) {
            C6295l c6295l = AbstractC9620l.isPro.admob;
            z = false;
            if (c6295l != null && c6295l.subs()) {
                z = true;
            }
        }
        if (z) {
            AbstractC9620l.yandex();
        }
    }

    public static final boolean admob(InterfaceC18672l interfaceC18672l) {
        return interfaceC18672l.inmobi() != C11128l.f22339l;
    }

    public static final Object ads(InterfaceC8639l interfaceC8639l, byte b, AbstractC0283l abstractC0283l) {
        interfaceC8639l.purchase().m4562synchronized(b);
        Object objPurchase = AbstractC10433l.purchase(interfaceC8639l, abstractC0283l);
        return objPurchase == EnumC9342l.f19165l ? objPurchase : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void amazon(Function1 function1) {
        C9958l c9958l = yandex;
        try {
            AbstractC9853l.yandex(AbstractC17082l.billing(function1 instanceof AbstractC12050l ? ((AbstractC12050l) function1).adcel(c9958l) : new C10081l(function1)), Unit.INSTANCE);
        } catch (Throwable th) {
            AbstractC17764l.crashlytics(c9958l, th);
            throw null;
        }
    }

    public static AbstractC18620l billing() {
        return (AbstractC18620l) AbstractC9620l.loadAd.get();
    }

    public static final float crashlytics(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final float firebase(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static boolean isPro(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (subs == null) {
            subs = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (subs.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (isPro == null) {
            isPro = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (isPro.booleanValue()) {
            return !AbstractC12300l.subs() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static C13400l license(int i, InterfaceC12932l interfaceC12932l, InterfaceC2262l interfaceC2262l, Function2 function2) {
        if ((i & 1) != 0) {
            interfaceC12932l = C17218l.f33421l;
        }
        return Signature(interfaceC2262l, interfaceC12932l, new C4993l(false), function2);
    }

    public static final Object loadAd(InterfaceC13012l interfaceC13012l) {
        Class clsMo1730private = ((InterfaceC13937l) AbstractC7370l.admob(interfaceC13012l)).mo1730private();
        if (clsMo1730private.isArray()) {
            return Array.newInstance(clsMo1730private.getComponentType(), 0);
        }
        throw new C3150l("Cannot instantiate the default empty array of type " + clsMo1730private.getSimpleName() + ", because it is not an array type");
    }

    public static C4568l metrica(C4951l c4951l) {
        AbstractC9620l.purchase(AbstractC9620l.yandex);
        synchronized (AbstractC9620l.crashlytics) {
            AbstractC9620l.admob = AbstractC16901l.m4218final(c4951l, AbstractC9620l.admob);
            Unit unit = Unit.INSTANCE;
        }
        return new C4568l(4, c4951l);
    }

    public static final boolean mopub(InterfaceC18672l interfaceC18672l) {
        return subs(interfaceC18672l) && interfaceC18672l.ad().mo1730private().isAnnotation();
    }

    public static final Object purchase(InterfaceC18672l interfaceC18672l) {
        Class clsSmaato;
        Method methodAmazon;
        Object objInmobi = interfaceC18672l.inmobi();
        if (!(interfaceC18672l instanceof InterfaceC2957l) || !AbstractC13457l.admob((InterfaceC2957l) interfaceC18672l)) {
            Iterator it = interfaceC18672l.admob().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Object next = it.next();
                if (((AbstractC9707l) next).premium() != 4) {
                    if (!z) {
                        z = true;
                        obj = next;
                    }
                }
                obj = null;
                break;
            }
            AbstractC9707l abstractC9707l = (AbstractC9707l) obj;
            InterfaceC13012l interfaceC13012lMo1109synchronized = abstractC9707l != null ? abstractC9707l.mo1109synchronized() : null;
            if (interfaceC13012lMo1109synchronized != null && (clsSmaato = AbstractC13457l.smaato(interfaceC13012lMo1109synchronized)) != null && (methodAmazon = AbstractC13457l.amazon(clsSmaato, interfaceC18672l)) != null) {
                return methodAmazon.invoke(objInmobi, null);
            }
        }
        return objInmobi;
    }

    public static AbstractC18620l remoteconfig(AbstractC18620l abstractC18620l) {
        if (abstractC18620l instanceof C15720l) {
            C15720l c15720l = (C15720l) abstractC18620l;
            if (c15720l.tapsense == AbstractC4071l.loadAd()) {
                c15720l.ads = null;
                return abstractC18620l;
            }
        }
        if (abstractC18620l instanceof C5429l) {
            C5429l c5429l = (C5429l) abstractC18620l;
            if (c5429l.subs == AbstractC4071l.loadAd()) {
                c5429l.admob = null;
                return abstractC18620l;
            }
        }
        AbstractC18620l abstractC18620lMopub = AbstractC9620l.mopub(abstractC18620l, null, false);
        abstractC18620lMopub.isPro();
        return abstractC18620lMopub;
    }

    public static final int smaato(int i, float f, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    public static void startapp(AbstractC18620l abstractC18620l, AbstractC18620l abstractC18620l2, Function1 function1) {
        if (abstractC18620l != abstractC18620l2) {
            abstractC18620l2.getClass();
            AbstractC18620l.adcel(abstractC18620l);
            abstractC18620l2.crashlytics();
        } else if (abstractC18620l instanceof C15720l) {
            ((C15720l) abstractC18620l).ads = function1;
        } else if (abstractC18620l instanceof C5429l) {
            ((C5429l) abstractC18620l).admob = function1;
        } else {
            C17132l.metrica(abstractC18620l, "Non-transparent snapshot was reused: ");
        }
    }

    public static final boolean subs(InterfaceC18672l interfaceC18672l) {
        return AbstractC8576l.yandex(interfaceC18672l.getName(), "<init>");
    }

    public static final Object subscription(InterfaceC8639l interfaceC8639l, byte[] bArr, int i, int i2, AbstractC0283l abstractC0283l) {
        interfaceC8639l.purchase().write(bArr, i, i2);
        Object objPurchase = AbstractC10433l.purchase(interfaceC8639l, abstractC0283l);
        return objPurchase == EnumC9342l.f19165l ? objPurchase : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object tapsense(InterfaceC8639l interfaceC8639l, C18476l c18476l, AbstractC0283l abstractC0283l) throws EOFException {
        C3449l c3449l;
        InterfaceC14189l interfaceC14189l;
        if (abstractC0283l instanceof C3449l) {
            c3449l = (C3449l) abstractC0283l;
            int i = c3449l.f7326l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3449l.f7326l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3449l = new C3449l(abstractC0283l);
            }
        } else {
            c3449l = new C3449l(abstractC0283l);
        }
        Object obj = c3449l.f7329l;
        int i2 = c3449l.f7326l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            interfaceC14189l = c18476l;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC14189l interfaceC14189l2 = c3449l.f7327l;
            InterfaceC8639l interfaceC8639l2 = c3449l.f7328l;
            AbstractC2829l.crashlytics(obj);
            interfaceC14189l = interfaceC14189l2;
            interfaceC8639l = interfaceC8639l2;
        }
        while (!interfaceC14189l.subs()) {
            C18476l c18476lPurchase = interfaceC8639l.purchase();
            long j = interfaceC14189l.crashlytics().f36079l;
            c18476lPurchase.getClass();
            if (j >= 0) {
                long j2 = j;
                while (j2 > 0) {
                    long jMo1064extends = interfaceC14189l.mo1064extends(c18476lPurchase, j2);
                    if (jMo1064extends == -1) {
                        throw new EOFException(AbstractC15560l.ads(j - j2, " were read.", AbstractC0653l.Signature(j, "Source exhausted before reading ", " bytes. Only ")));
                    }
                    j2 -= jMo1064extends;
                }
            } else {
                C10754l.metrica(AbstractC2812l.subscription(j, "byteCount (", ") < 0"));
            }
            c3449l.f7328l = interfaceC8639l;
            c3449l.f7327l = interfaceC14189l;
            c3449l.f7326l = 1;
            Object objPurchase = AbstractC10433l.purchase(interfaceC8639l, c3449l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPurchase == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    public static Object vip(C0237l c0237l, Function0 function0) {
        AbstractC18620l c15720l;
        AbstractC18620l abstractC18620l = (AbstractC18620l) AbstractC9620l.loadAd.get();
        if (abstractC18620l instanceof C15720l) {
            C15720l c15720l2 = (C15720l) abstractC18620l;
            if (c15720l2.tapsense == AbstractC4071l.loadAd()) {
                Function1 function1 = c15720l2.ads;
                Function1 function2 = c15720l2.subscription;
                try {
                    ((C15720l) abstractC18620l).ads = AbstractC9620l.firebase(c0237l, function1, true);
                    ((C15720l) abstractC18620l).subscription = function2;
                    return function0.invoke();
                } finally {
                    c15720l2.ads = function1;
                    c15720l2.subscription = function2;
                }
            }
        }
        if (abstractC18620l == null || (abstractC18620l instanceof C1852l)) {
            c15720l = new C15720l(abstractC18620l instanceof C1852l ? (C1852l) abstractC18620l : null, c0237l, null, true, false);
        } else {
            c15720l = abstractC18620l.Signature(c0237l);
        }
        try {
            AbstractC18620l abstractC18620lIsPro = c15720l.isPro();
            try {
                Object objInvoke = function0.invoke();
                AbstractC18620l.adcel(abstractC18620lIsPro);
                c15720l.crashlytics();
                return objInvoke;
            } catch (Throwable th) {
                AbstractC18620l.adcel(abstractC18620lIsPro);
                throw th;
            }
        } catch (Throwable th2) {
            c15720l.crashlytics();
            throw th2;
        }
    }

    public static final Object yandex(InterfaceC18672l interfaceC18672l, Map map, C14013l c14013l) throws C10756l {
        List<AbstractC9707l> parameters = interfaceC18672l.getParameters();
        boolean z = false;
        if (parameters.isEmpty()) {
            try {
                return interfaceC18672l.isPro().amazon(interfaceC18672l.firebase() ? new InterfaceC14029l[]{c14013l} : new InterfaceC14029l[0]);
            } catch (IllegalAccessException e) {
                throw new C10756l(e);
            }
        }
        int size = (interfaceC18672l.firebase() ? 1 : 0) + parameters.size();
        Object[] objArrPremium = ((AbstractC0061l) interfaceC18672l).premium();
        if (interfaceC18672l.firebase()) {
            objArrPremium[parameters.size()] = c14013l;
        }
        int i = 0;
        for (AbstractC9707l abstractC9707l : parameters) {
            if (map.containsKey(abstractC9707l)) {
                objArrPremium[abstractC9707l.pro()] = map.get(abstractC9707l);
            } else if (abstractC9707l.mo1108private()) {
                int i2 = (i / 32) + size;
                objArrPremium[i2] = Integer.valueOf(((Integer) objArrPremium[i2]).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!abstractC9707l.mo1106extends()) {
                C1759l.ads(abstractC9707l, "No argument provided for a required parameter: ");
                return null;
            }
            if (abstractC9707l.premium() == 4 || abstractC9707l.premium() == 2) {
                i++;
            }
        }
        if (!z) {
            try {
                return interfaceC18672l.isPro().amazon(Arrays.copyOf(objArrPremium, size));
            } catch (IllegalAccessException e2) {
                throw new C10756l(e2);
            }
        }
        InterfaceC16148l interfaceC16148lStartapp = interfaceC18672l.startapp();
        if (interfaceC16148lStartapp == null) {
            C11467l.Signature(interfaceC18672l, "This callable does not support a default call: ");
            return null;
        }
        try {
            return interfaceC16148lStartapp.amazon(objArrPremium);
        } catch (IllegalAccessException e3) {
            throw new C10756l(e3);
        }
    }
}
