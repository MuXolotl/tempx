package defpackage;

import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٟ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17981l {
    public static final /* synthetic */ int yandex = 0;

    static {
        C17251l c17251l = new C17251l(7);
        C8125l c8125l = new C8125l(3);
        AbstractC15212l.purchase(new C8250l(1, c8125l), new C4951l(7, c17251l));
    }

    public static final void loadAd(C6576l c6576l, FrameLayout.LayoutParams layoutParams, boolean z, C16875l c16875l, Function1 function1, Function1 function2, C7363l c7363l, C14766l c14766l, C6956l c6956l, int i) {
        Object c2831l;
        boolean z2;
        c6956l.m2133new(-1111858253);
        int i2 = (c6956l.admob(null) ? 536870912 : 268435456) | i | (c6956l.billing(c6576l) ? 4 : 2) | (c6956l.admob(layoutParams) ? 32 : 16) | (c6956l.mopub(z) ? 2048 : 1024) | (c6956l.billing(c16875l) ? 16384 : 8192) | (c6956l.admob(function1) ? 131072 : 65536) | (c6956l.admob(function2) ? 1048576 : 524288) | (c6956l.admob(c7363l) ? 8388608 : 4194304) | (c6956l.admob(c14766l) ? 67108864 : 33554432);
        if (c6956l.m2127for(i2 & 1, (306783379 & i2) != 306783378)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            WebView webView = (WebView) c6576l.admob.getValue();
            boolean z3 = z && ((Boolean) c16875l.loadAd.getValue()).booleanValue();
            boolean zAdmob = c6956l.admob(webView);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C13932l(12, webView);
                c6956l.m2147try(objM2132native);
            }
            AbstractC10851l.loadAd(z3, (Function0) objM2132native, c6956l, 0);
            if (webView == null) {
                c6956l.m2123default(-580722624);
            } else {
                c6956l.m2123default(-580722623);
                boolean zAdmob2 = ((((57344 & i2) ^ 24576) > 16384 && c6956l.billing(c16875l)) || (i2 & 24576) == 16384) | c6956l.admob(webView);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob2 || objM2132native2 == c13863l) {
                    objM2132native2 = new C13026l(c16875l, webView, null, 0);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC12311l.purchase(webView, c16875l, (Function2) objM2132native2, c6956l);
                boolean zAdmob3 = ((i2 & 14) == 4) | c6956l.admob(webView);
                Object objM2132native3 = c6956l.m2132native();
                if (zAdmob3 || objM2132native3 == c13863l) {
                    objM2132native3 = new C15556l(c6576l, webView, null, 18);
                    c6956l.m2147try(objM2132native3);
                }
                AbstractC12311l.purchase(webView, c6576l, (Function2) objM2132native3, c6956l);
            }
            c6956l.startapp(false);
            c7363l.yandex = c6576l;
            c7363l.loadAd = c16875l;
            c14766l.yandex = c6576l;
            boolean zAdmob4 = ((1879048192 & i2) == 536870912) | ((458752 & i2) == 131072) | c6956l.admob(layoutParams) | ((i2 & 14) == 4) | c6956l.admob(c14766l) | c6956l.admob(c7363l);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob4 || objM2132native4 == c13863l) {
                z2 = false;
                c2831l = new C2831l(function1, layoutParams, c6576l, c14766l, c7363l, 7);
                c6956l.m2147try(c2831l);
            } else {
                z2 = false;
                c2831l = objM2132native4;
            }
            Function1 function3 = (Function1) c2831l;
            boolean z4 = (3670016 & i2) != 1048576 ? z2 : true;
            Object objM2132native5 = c6956l.m2132native();
            if (z4 || objM2132native5 == c13863l) {
                objM2132native5 = new C0786l(17, function2);
                c6956l.m2147try(objM2132native5);
            }
            AbstractC11397l.loadAd(function3, C4346l.f8873l, (Function1) objM2132native5, null, c6956l, 48, 20);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6202l(c6576l, layoutParams, z, c16875l, function1, function2, c7363l, c14766l, i);
        }
    }

    public static final void yandex(final C6576l c6576l, InterfaceC17242l interfaceC17242l, boolean z, C16875l c16875l, final Function1 function1, Function1 function2, final C7363l c7363l, C14766l c14766l, C6956l c6956l, int i) {
        boolean z2;
        C16875l c16875l2;
        Function1 function3;
        C14766l c14766l2;
        int i2;
        final C14766l c14766l3;
        final Function1 function4;
        final boolean z3;
        c6956l.m2133new(1438728645);
        int i3 = i | (c6956l.billing(c6576l) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | 1408 | (c6956l.admob(function1) ? 16384 : 8192) | 196608 | (c6956l.admob(c7363l) ? 1048576 : 524288) | 104857600;
        if (c6956l.m2127for(i3 & 1, (38347923 & i3) != 38347922)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                Object objM2132native = c6956l.m2132native();
                C13863l c13863l = C1867l.yandex;
                if (objM2132native == c13863l) {
                    objM2132native = AbstractC12311l.isPro(c6956l);
                    c6956l.m2147try(objM2132native);
                }
                boolean zBilling = c6956l.billing((InterfaceC2262l) objM2132native);
                Object objM2132native2 = c6956l.m2132native();
                if (zBilling || objM2132native2 == c13863l) {
                    objM2132native2 = new C16875l();
                    c6956l.m2147try(objM2132native2);
                }
                C16875l c16875l3 = (C16875l) objM2132native2;
                Object objM2132native3 = c6956l.m2132native();
                if (objM2132native3 == c13863l) {
                    objM2132native3 = new C8125l(4);
                    c6956l.m2147try(objM2132native3);
                }
                Function1 function5 = (Function1) objM2132native3;
                Object objM2132native4 = c6956l.m2132native();
                if (objM2132native4 == c13863l) {
                    objM2132native4 = new C14766l();
                    c6956l.m2147try(objM2132native4);
                }
                i2 = i3 & (-29367297);
                c14766l3 = (C14766l) objM2132native4;
                function4 = function5;
                z3 = true;
                c16875l = c16875l3;
            } else {
                c6956l.m2124else();
                i2 = i3 & (-29367297);
                z3 = z;
                function4 = function2;
                c14766l3 = c14766l;
            }
            c6956l.adcel();
            final C16875l c16875l4 = c16875l;
            AbstractC11308l.yandex(interfaceC17242l, null, AbstractC14566l.amazon(-357818469, new Function3() { // from class: lٍٕۨ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C0923l c0923l = (C0923l) obj;
                    C6956l c6956l2 = (C6956l) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= c6956l2.billing(c0923l) ? 4 : 2;
                    }
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                        long j = c0923l.loadAd;
                        AbstractC17981l.loadAd(c6576l, new FrameLayout.LayoutParams(C15519l.billing(j) ? -1 : -2, C15519l.purchase(j) ? -1 : -2), z3, c16875l4, function1, function4, c7363l, c14766l3, c6956l2, 384);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, ((i2 >> 3) & 14) | 3072, 6);
            z2 = z3;
            c16875l2 = c16875l4;
            function3 = function4;
            c14766l2 = c14766l3;
        } else {
            c6956l.m2124else();
            z2 = z;
            c16875l2 = c16875l;
            function3 = function2;
            c14766l2 = c14766l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6202l(c6576l, interfaceC17242l, z2, c16875l2, function1, function3, c7363l, c14766l2, i);
        }
    }
}
