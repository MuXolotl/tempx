package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٕٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15801l {
    public static final C15801l yandex = new C15801l();

    static {
        int i = C9735l.smaato;
        long j = C9735l.isPro;
    }

    public final void loadAd(C6956l c6956l, int i) {
        c6956l.m2133new(-562414269);
        int i2 = i & 1;
        if (c6956l.m2127for(i2, i2 != 0)) {
            AbstractC9334l.yandex(c6956l, AbstractC0080l.vip(C4346l.f8873l, 8.0f));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1645l(this, i, 21);
        }
    }

    public final void yandex(final C7849l c7849l, final boolean z, InterfaceC17242l interfaceC17242l, long j, long j2, C6956l c6956l, final int i) {
        int i2;
        final InterfaceC17242l interfaceC17242l2;
        final long j3;
        final long j4;
        InterfaceC17242l interfaceC17242l3;
        long j5;
        long j6;
        c6956l.m2133new(154996744);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(c7849l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 9363) != 9362)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                C10707l c10707l = AbstractC10689l.yandex;
                long jPurchase = ((C10936l) c6956l.isPro(c10707l)).purchase();
                long jLoadAd = C9735l.loadAd(0.4f, ((C10936l) c6956l.isPro(c10707l)).admob());
                interfaceC17242l3 = C4346l.f8873l;
                j5 = jPurchase;
                j6 = jLoadAd;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l;
                j5 = j;
                j6 = j2;
            }
            c6956l.adcel();
            float f = c7849l.crashlytics;
            float f2 = c7849l.loadAd;
            InterfaceC12244l interfaceC12244lYandex = AbstractC16245l.yandex(f - c7849l.yandex, null, "PillIndicator.width", c6956l, 384, 10);
            float f3 = c7849l.amazon - f2;
            InterfaceC12244l interfaceC12244lYandex2 = AbstractC16245l.yandex(c7849l.yandex, null, "PillIndicator.leftOffset", c6956l, 384, 10);
            InterfaceC12244l interfaceC12244lYandex3 = AbstractC0703l.yandex(z ? j5 : j6, null, "PillIndicator.pillColor", null, c6956l, 384, 10);
            InterfaceC17242l interfaceC17242lAdcel = AbstractC0080l.adcel(AbstractC0080l.amazon(interfaceC17242l3, 1.0f), C18450l.f36021l);
            boolean zBilling = c6956l.billing(interfaceC12244lYandex2) | c6956l.crashlytics(f2);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C5724l(f2, interfaceC12244lYandex2, 3);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(AbstractC0080l.vip(AbstractC4115l.purchase(interfaceC17242lAdcel, (Function1) objM2132native), ((C14467l) interfaceC12244lYandex.getValue()).f28331l), f3);
            long j7 = ((C9735l) interfaceC12244lYandex3.getValue()).yandex;
            C6839l c6839l = AbstractC7497l.yandex;
            C7863l c7863l = new C7863l(50.0f);
            AbstractC9383l.yandex(AbstractC4927l.amazon(interfaceC17242lPurchase, j7, new C6839l(c7863l, c7863l, c7863l, c7863l)).premium(new C15924l(-1.0f)), c6956l, 0);
            interfaceC17242l2 = interfaceC17242l3;
            j3 = j5;
            j4 = j6;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            j3 = j;
            j4 = j2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lُْۙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f22211l.yandex(c7849l, z, interfaceC17242l2, j3, j4, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
