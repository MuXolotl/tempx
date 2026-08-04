package defpackage;

import android.content.Context;
import android.view.WindowManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٌۚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9033l {
    public static final C15578l yandex = new C15578l(-2017607376, false, new C8918l(9));
    public static final C15578l loadAd = new C15578l(1987310914, false, new C8918l(10));

    public static final InterfaceC17477l amazon(InterfaceC11865l interfaceC11865l, C3624l c3624l) {
        InterfaceC15234l interfaceC15234lPurchase = purchase(interfaceC11865l, c3624l);
        if (interfaceC15234lPurchase instanceof InterfaceC17477l) {
            return (InterfaceC17477l) interfaceC15234lPurchase;
        }
        return null;
    }

    public static final InterfaceC17477l billing(InterfaceC11865l interfaceC11865l, C3624l c3624l, C12014l c12014l) {
        InterfaceC17477l interfaceC17477lAmazon = amazon(interfaceC11865l, c3624l);
        return interfaceC17477lAmazon != null ? interfaceC17477lAmazon : c12014l.tapsense(c3624l, AbstractC17587l.adcel(new C11100l(AbstractC17587l.remoteconfig(c3624l, C1676l.f4041l), C2100l.f4726l)));
    }

    public static void crashlytics(AppActivity appActivity, Function2 function2) {
        loadAd(AbstractC11990l.firebase(appActivity), appActivity, false, function2);
    }

    public static final void loadAd(InterfaceC2262l interfaceC2262l, Context context, boolean z, Function2 function2) {
        InterfaceC2262l interfaceC2262l2;
        Function2 function3;
        int i = 0;
        try {
            int i2 = AbstractC2950l.yandex;
            C16552l c16552l = AbstractC11463l.yandex;
            interfaceC2262l2 = interfaceC2262l;
            function3 = function2;
            try {
                AbstractC10999l.mopub(interfaceC2262l2, AbstractC17278l.yandex.f6462l, 0, new C0519l(context, z, interfaceC2262l2, function3, (InterfaceC14029l) null), 2);
            } catch (WindowManager.BadTokenException unused) {
                AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C7178l(function3, null, i), 3);
            }
        } catch (WindowManager.BadTokenException unused2) {
            interfaceC2262l2 = interfaceC2262l;
            function3 = function2;
        }
    }

    public static final boolean mopub(C16173l c16173l, boolean z) {
        InterfaceC18212l interfaceC18212lCrashlytics;
        C17812l c17812l = c16173l.amazon;
        if (c17812l == null || (interfaceC18212lCrashlytics = c17812l.crashlytics()) == null) {
            return false;
        }
        return AbstractC2044l.loadAd(c16173l.smaato(z), AbstractC2044l.admob(interfaceC18212lCrashlytics));
    }

    public static final InterfaceC15234l purchase(InterfaceC11865l interfaceC11865l, C3624l c3624l) {
        if (interfaceC11865l.mo2272switch(AbstractC11944l.yandex) != null) {
            C18725l.loadAd();
            return null;
        }
        C10486l c10486lMo2270l = interfaceC11865l.mo2270l(c3624l.yandex);
        C16781l c16781l = c3624l.loadAd.yandex;
        c16781l.getClass();
        List listBilling = C16781l.billing(c16781l);
        C2144l c2144l = c10486lMo2270l.f21347l;
        C3498l c3498l = (C3498l) AbstractC16901l.m4231native(listBilling);
        EnumC11300l enumC11300l = EnumC11300l.f22774l;
        InterfaceC15234l interfaceC15234lPurchase = c2144l.purchase(c3498l, enumC11300l);
        if (interfaceC15234lPurchase != null) {
            for (C3498l c3498l2 : listBilling.subList(1, listBilling.size())) {
                if (interfaceC15234lPurchase instanceof InterfaceC17477l) {
                    InterfaceC15234l interfaceC15234lPurchase2 = ((InterfaceC17477l) interfaceC15234lPurchase).mo2893l().purchase(c3498l2, enumC11300l);
                    interfaceC15234lPurchase = interfaceC15234lPurchase2 instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPurchase2 : null;
                    if (interfaceC15234lPurchase != null) {
                    }
                }
            }
            return interfaceC15234lPurchase;
        }
        return null;
    }

    public static final void yandex(final EnumC6302l enumC6302l, final C15578l c15578l, final C15578l c15578l2, final C15578l c15578l3, final InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1044974553);
        int i2 = i | (c6956l.amazon(enumC6302l.ordinal()) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 16384 : 8192);
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            final int iAdmob = AbstractC6363l.admob(6, 0, c6956l);
            AbstractC14460l.yandex(AbstractC14566l.amazon(-1053555375, new Function3() { // from class: lؔۦِ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C14632l c14632l = (C14632l) obj;
                    C6956l c6956l2 = (C6956l) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= c6956l2.billing(c14632l) ? 4 : 2;
                    }
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                        int i3 = iAdmob;
                        boolean zAmazon = c6956l2.amazon(i3);
                        Object objM2132native = c6956l2.m2132native();
                        if (zAmazon || objM2132native == C1867l.yandex) {
                            objM2132native = new C2221l(i3, 15);
                            c6956l2.m2147try(objM2132native);
                        }
                        AbstractC7741l.loadAd(enumC6302l, interfaceC17242l, (Function1) objM2132native, null, "[AbsolutionNP] Scene", null, AbstractC14566l.amazon(-798152234, new C2154l(c15578l, c14632l, c15578l3, c15578l2), c6956l2), c6956l2, 1597440, 40);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 6);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0843l(enumC6302l, c15578l, c15578l2, c15578l3, interfaceC17242l, i, 1);
        }
    }
}
