package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lََۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10216l {
    public static final C12288l yandex = new C12288l(true, 30);

    public static final void amazon(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i2;
        c6956l.m2133new(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C2287l.yandex(interfaceC17242l, AbstractC8574l.yandex, c15578l, c6956l, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13085l(interfaceC17242l, c15578l, i, i3);
        }
    }

    public static final void crashlytics(InterfaceC5912l interfaceC5912l, InterfaceC15209l interfaceC15209l, Function0 function0, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c6956l.billing(interfaceC5912l) : c6956l.admob(interfaceC5912l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c6956l.billing(interfaceC15209l) : c6956l.admob(interfaceC15209l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        boolean z = false;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && c6956l.billing(interfaceC15209l));
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z2 || objM2132native == c13863l) {
                objM2132native = new C9263l(new C10685l(new C12242l(interfaceC15209l, function0, 12)));
                c6956l.m2147try(objM2132native);
            }
            C9263l c9263l = (C9263l) objM2132native;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c6956l.admob(interfaceC5912l))) {
                z = true;
            }
            Object objM2132native2 = c6956l.m2132native();
            if (z || objM2132native2 == c13863l) {
                objM2132native2 = new C13802l(24, interfaceC5912l);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC3017l.yandex(c9263l, (Function0) objM2132native2, yandex, AbstractC14566l.amazon(1315155414, new C9772l(interfaceC15209l, interfaceC5912l, 26), c6956l), c6956l, 3456, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(interfaceC5912l, interfaceC15209l, function0, i, 12);
        }
    }

    public static final void loadAd(final int i, final long j, C6956l c6956l, final int i2) {
        final int i3;
        int i4;
        C4224l c4224lAds;
        Function2 function2;
        c6956l.m2133new(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (c6956l.amazon(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c6956l.purchase(j) ? 32 : 16;
        }
        if (c6956l.m2127for(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
            boolean zBilling = ((i4 & 14) == 4) | c6956l.billing(context);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (zBilling || objM2132native == obj) {
                objM2132native = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                c6956l.m2147try(objM2132native);
            }
            int iIntValue = ((Number) objM2132native).intValue();
            if (iIntValue == -1) {
                c4224lAds = c6956l.ads();
                if (c4224lAds == null) {
                    return;
                }
                final int i5 = 1;
                function2 = new Function2() { // from class: lًَّ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i6 = i5;
                        C6956l c6956l2 = (C6956l) obj2;
                        ((Integer) obj3).getClass();
                        switch (i6) {
                            case 0:
                                AbstractC10216l.loadAd(i3, j, c6956l2, AbstractC0545l.purchase(i2 | 1));
                                break;
                            default:
                                AbstractC10216l.loadAd(i3, j, c6956l2, AbstractC0545l.purchase(i2 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(iIntValue, 0, c6956l);
                boolean z = (i4 & 112) == 32;
                Object objM2132native2 = c6956l.m2132native();
                if (z || objM2132native2 == obj) {
                    objM2132native2 = j == 16 ? null : new C0534l(j, 5);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC9383l.yandex(AbstractC11748l.isPro(AbstractC0080l.isPro(C4346l.f8873l, AbstractC12259l.purchase), abstractC14165lCrashlytics, null, C4176l.loadAd, 0.0f, (AbstractC8939l) objM2132native2, 22), c6956l, 0);
            }
            c4224lAds.amazon = function2;
        }
        c6956l.m2124else();
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            final int i6 = 0;
            function2 = new Function2() { // from class: lًَّ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i7 = i6;
                    C6956l c6956l2 = (C6956l) obj2;
                    ((Integer) obj3).getClass();
                    switch (i7) {
                        case 0:
                            AbstractC10216l.loadAd(i, j, c6956l2, AbstractC0545l.purchase(i2 | 1));
                            break;
                        default:
                            AbstractC10216l.loadAd(i, j, c6956l2, AbstractC0545l.purchase(i2 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            c4224lAds.amazon = function2;
        }
    }

    public static final void yandex(InterfaceC5912l interfaceC5912l, C2863l c2863l, C6956l c6956l, int i) {
        C6956l c6956l2;
        Context context;
        c6956l.m2133new(1904307118);
        int i2 = 16;
        int i3 = (c6956l.billing(interfaceC5912l) ? 4 : 2) | i | (c6956l.admob(c2863l) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c6956l.m2123default(-1009482584);
                context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1009433480);
                c6956l.startapp(false);
                context = null;
            }
            boolean zAdmob = c6956l.admob(c2863l) | ((i3 & 14) == 4) | c6956l.admob(context);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new Ctransient(c2863l, context, interfaceC5912l, i2);
                c6956l.m2147try(objM2132native);
            }
            c6956l2 = c6956l;
            AbstractC4830l.loadAd(null, null, (Function1) objM2132native, c6956l2, 0, 3);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(interfaceC5912l, c2863l, i, 27);
        }
    }
}
