package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍٗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17002l {
    public static final C15578l yandex = new C15578l(932383035, false, new C8337l(2));
    public static final C15578l loadAd = new C15578l(572279132, false, new C8337l(3));

    public static boolean amazon(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC11965l.subscription(context);
        }
        return true;
    }

    public static InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, boolean z, InterfaceC17242l interfaceC17242l2) {
        if (!z) {
            interfaceC17242l2 = C4346l.f8873l;
        }
        return interfaceC17242l.premium(interfaceC17242l2);
    }

    public static AbstractC4829l loadAd(AbstractC4829l... abstractC4829lArr) {
        List listAsList = Arrays.asList(abstractC4829lArr);
        if (listAsList.isEmpty()) {
            return new C14737l();
        }
        return listAsList.size() == 1 ? (AbstractC4829l) listAsList.get(0) : new C16815l(listAsList);
    }

    public static final void yandex(boolean z, Function2 function2, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-642000585);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function2) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objYandex = (InterfaceC6923l) c6956l.isPro(AbstractC0127l.yandex);
            if (objYandex == null) {
                c6956l.m2123default(1512740606);
                objYandex = AbstractC1627l.yandex(c6956l);
            } else {
                c6956l.m2123default(1512737723);
            }
            c6956l.startapp(false);
            if (objYandex == null) {
                C8339l.smaato("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zBilling = c6956l.billing(objYandex);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                InterfaceC6923l interfaceC6923l = objYandex instanceof InterfaceC6923l ? (InterfaceC6923l) objYandex : null;
                C1527l navigationEventDispatcher = interfaceC6923l != null ? interfaceC6923l.getNavigationEventDispatcher() : null;
                InterfaceC14926l interfaceC14926l = objYandex instanceof InterfaceC14926l ? (InterfaceC14926l) objYandex : null;
                objM2132native = new C16590l(navigationEventDispatcher, interfaceC14926l != null ? interfaceC14926l.yandex() : null);
                c6956l.m2147try(objM2132native);
            }
            C16590l c16590l = (C16590l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native2;
            long j = c6956l.f14595continue;
            boolean zBilling2 = c6956l.billing(c16590l) | c6956l.purchase(j);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling2 || objM2132native3 == c13863l) {
                objM2132native3 = new C6449l(interfaceC2262l, new C5541l(j, objYandex));
                c6956l.m2147try(objM2132native3);
            }
            C6449l c6449l = (C6449l) objM2132native3;
            c6956l.m2123default(-348514256);
            boolean zAdmob = c6956l.admob(c6449l) | c6956l.admob(function2);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob || objM2132native4 == c13863l) {
                objM2132native4 = new C8652l(c6449l, function2, 5);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC12311l.billing((Function0) objM2132native4, c6956l);
            int i3 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean zAdmob2 = c6956l.admob(c6449l) | (i4 == 4);
            Object objM2132native5 = c6956l.m2132native();
            if (zAdmob2 || objM2132native5 == c13863l) {
                objM2132native5 = new C9012l(c6449l, z, 3);
                c6956l.m2147try(objM2132native5);
            }
            AbstractC17122l.yandex(boolValueOf, c6449l, null, (Function1) objM2132native5, c6956l, i4);
            boolean zAdmob3 = c6956l.admob(c16590l) | c6956l.admob(c6449l);
            Object objM2132native6 = c6956l.m2132native();
            if (zAdmob3 || objM2132native6 == c13863l) {
                objM2132native6 = new C8854l(c16590l, c6449l, 24);
                c6956l.m2147try(objM2132native6);
            }
            AbstractC12311l.yandex(c16590l, c6449l, (Function1) objM2132native6, c6956l);
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10994l(z, function2, i);
        }
    }
}
