package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۣؑۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0676l {
    public static final char[] yandex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final boolean admob(long j) {
        return (j & 2147483648L) != 0;
    }

    public static final long amazon(int i, int i2, boolean z, boolean z2) {
        long j = i;
        long j2 = ((long) i2) & 2147483647L;
        long j3 = z ? (j << 32) | Long.MIN_VALUE : (j << 32) & Long.MAX_VALUE;
        if (z2) {
            j2 |= 2147483648L;
        }
        return j2 | j3;
    }

    public static final Object billing(InterfaceC0389l interfaceC0389l, Object obj) {
        Object objAmazon = interfaceC0389l.amazon(obj);
        if (!(objAmazon instanceof C15230l)) {
            return Unit.INSTANCE;
        }
        return ((C0381l) AbstractC10999l.subs(C17218l.f33421l, new C7641l(interfaceC0389l, obj, null, 23))).yandex;
    }

    public static final boolean crashlytics(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
        return !(accessibilityManager != null ? accessibilityManager.isTouchExplorationEnabled() : false);
    }

    public static final void loadAd(InterfaceC14592l interfaceC14592l, Throwable th) {
        CancellationException cancellationExceptionYandex = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionYandex == null) {
            cancellationExceptionYandex = AbstractC4952l.yandex("Channel was consumed, consumer had failed", th);
        }
        interfaceC14592l.ads(cancellationExceptionYandex);
    }

    public static final boolean mopub(long j) {
        return (j & Long.MIN_VALUE) != 0;
    }

    public static final C2403l purchase(C6956l c6956l) {
        View view = (View) c6956l.isPro(AbstractC1242l.billing);
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            objM2132native = AbstractC14814l.isPro(c6956l);
        }
        C2403l c2403l = (C2403l) objM2132native;
        boolean zAmazon = c6956l.amazon(6) | c6956l.admob(view);
        Object objM2132native2 = c6956l.m2132native();
        if (zAmazon || objM2132native2 == c13863l) {
            objM2132native2 = new C15352l(c2403l, view, null, 28);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.purchase(c2403l, 6, (Function2) objM2132native2, c6956l);
        return c2403l;
    }

    public static final void yandex(boolean z, Function0 function0, InterfaceC17242l interfaceC17242l, boolean z2, C16267l c16267l, C6956l c6956l, int i) {
        C6956l c6956l2;
        InterfaceC17242l interfaceC17242l2;
        boolean z3;
        C16267l c16267l2;
        C16267l c16267l3;
        boolean z4;
        C16267l c16267l4;
        InterfaceC17242l interfaceC17242l3;
        long j;
        InterfaceC12244l interfaceC12244l;
        InterfaceC12244l interfaceC12244lVip;
        InterfaceC17242l interfaceC17242lAdmob;
        c6956l.m2133new(408580840);
        int i2 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16) | 208256;
        if (c6956l.m2127for(i2 & 1, (74899 & i2) != 74898)) {
            c6956l.m2141switch();
            int i3 = i & 1;
            InterfaceC17242l interfaceC17242l4 = C4346l.f8873l;
            if (i3 == 0 || c6956l.ad()) {
                C0764l c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                C16267l c16267l5 = c0764l.f2324while;
                if (c16267l5 == null) {
                    c16267l3 = new C16267l(AbstractC15038l.amazon(c0764l, 26), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)));
                    c0764l.f2324while = c16267l3;
                } else {
                    c16267l3 = c16267l5;
                }
                z4 = true;
                c16267l4 = c16267l3;
                interfaceC17242l3 = interfaceC17242l4;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l;
                z4 = z2;
                c16267l4 = c16267l;
            }
            c6956l.adcel();
            InterfaceC12244l interfaceC12244lYandex = AbstractC16245l.yandex(z ? 6.0f : 0.0f, C17423l.remoteconfig(c6956l, 2), null, c6956l, 0, 12);
            c16267l4.getClass();
            if (z4 && z) {
                j = c16267l4.yandex;
            } else if (!z4 || z) {
                j = (z4 || !z) ? c16267l4.amazon : c16267l4.crashlytics;
            } else {
                j = c16267l4.loadAd;
            }
            if (z4) {
                c6956l.m2123default(1194671677);
                interfaceC12244l = interfaceC12244lYandex;
                c6956l2 = c6956l;
                interfaceC12244lVip = AbstractC0703l.yandex(j, C17423l.remoteconfig(c6956l, 4), null, null, c6956l2, 0, 12);
                c6956l2.startapp(false);
            } else {
                interfaceC12244l = interfaceC12244lYandex;
                c6956l2 = c6956l;
                c6956l2.m2123default(1194849338);
                interfaceC12244lVip = AbstractC8020l.vip(new C9735l(j), c6956l2);
                c6956l2.startapp(false);
            }
            InterfaceC12244l interfaceC12244l2 = interfaceC12244lVip;
            if (function0 != null) {
                z3 = z4;
                interfaceC17242lAdmob = AbstractC10586l.admob(interfaceC17242l4, z, null, AbstractC10493l.yandex(false, 20.0f, 0L, AbstractC7497l.yandex, 244), z3, new C6402l(3), function0);
            } else {
                z3 = z4;
                interfaceC17242lAdmob = interfaceC17242l4;
            }
            if (function0 != null) {
                C17857l c17857l = AbstractC16434l.yandex;
                interfaceC17242l4 = C18158l.f35556l;
            }
            InterfaceC17242l interfaceC17242lAdmob2 = AbstractC0080l.admob(AbstractC3605l.smaato(AbstractC0080l.adcel(interfaceC17242l3.premium(interfaceC17242l4).premium(interfaceC17242lAdmob), C18450l.f36043l), 2.0f));
            boolean zBilling = c6956l2.billing(interfaceC12244l2) | c6956l2.billing(interfaceC12244l);
            Object objM2132native = c6956l2.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C4570l(interfaceC12244l2, interfaceC12244l, 1);
                c6956l2.m2147try(objM2132native);
            }
            AbstractC12155l.yandex(interfaceC17242lAdmob2, (Function1) objM2132native, c6956l2, 0);
            interfaceC17242l2 = interfaceC17242l3;
            c16267l2 = c16267l4;
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            z3 = z2;
            c16267l2 = c16267l;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5322l(z, function0, interfaceC17242l2, z3, c16267l2, i, 1);
        }
    }
}
