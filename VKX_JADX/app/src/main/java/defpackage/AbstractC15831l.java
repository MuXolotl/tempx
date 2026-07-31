package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕٝۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15831l {
    public static final C4776l yandex = AbstractC0532l.subs(500, 2, AbstractC9528l.amazon);
    public static final C4776l loadAd = AbstractC0532l.subs(500, 2, AbstractC9528l.yandex);

    public static final void loadAd(InterfaceC17242l interfaceC17242l, long j, long j2, C0404l c0404l, C0404l c0404l2, float f, float f2, float f3, float f4, C6956l c6956l, final int i) {
        InterfaceC17242l interfaceC17242l2;
        C6956l c6956l2;
        final long j3;
        final long j4;
        final C0404l c0404l3;
        final C0404l c0404l4;
        final float f5;
        final float f6;
        final float f7;
        final float f8;
        long j5;
        C0404l c0404l5;
        long j6;
        C0404l c0404l6;
        float f9;
        float f10;
        float f11;
        float f12;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        c6956l.m2133new(-2070567281);
        int i2 = i | 39396496;
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                float f13 = AbstractC12639l.yandex;
                long jPurchase = AbstractC15038l.purchase(c6956l, 26);
                long jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                C10707l c10707l = AbstractC4751l.admob;
                C0404l c0404l7 = new C0404l(((InterfaceC13490l) c6956l.isPro(c10707l)).mo868instanceof(4.0f), 0.0f, 1, 0, null, 26);
                j5 = jPurchase;
                c0404l5 = new C0404l(((InterfaceC13490l) c6956l.isPro(c10707l)).mo868instanceof(4.0f), 0.0f, 1, 0, null, 26);
                j6 = jPurchase2;
                c0404l6 = c0404l7;
                f9 = AbstractC12639l.billing;
                f10 = AbstractC12639l.loadAd;
                f11 = f10;
                f12 = 1.0f;
            } else {
                c6956l.m2124else();
                j5 = j;
                j6 = j2;
                c0404l6 = c0404l;
                c0404l5 = c0404l2;
                f9 = f;
                f12 = f2;
                f10 = f3;
                f11 = f4;
            }
            c6956l.adcel();
            C13138l c13138lBilling = AbstractC3586l.billing(c6956l, 0);
            C6763l c6763l = AbstractC4332l.yandex;
            C10942l c10942l = new C10942l();
            c10942l.yandex = 1750;
            C17137l c17137lYandex = c10942l.yandex(fValueOf, 0);
            C6763l c6763l2 = AbstractC4332l.yandex;
            c17137lYandex.loadAd = c6763l2;
            c10942l.yandex(fValueOf2, 1000);
            Unit unit = Unit.INSTANCE;
            C8456l c8456lYandex = AbstractC3586l.yandex(c13138lBilling, 0.0f, 1.0f, AbstractC0532l.purchase(new C13591l(c10942l), 0, 0L, 6), "LinearWavyProgressIndicatorFirstHead", c6956l, 29112, 0);
            C10942l c10942l2 = new C10942l();
            c10942l2.yandex = 1750;
            c10942l2.yandex(fValueOf, 250).loadAd = c6763l2;
            c10942l2.yandex(fValueOf2, 1250);
            C8456l c8456lYandex2 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 1.0f, AbstractC0532l.purchase(new C13591l(c10942l2), 0, 0L, 6), "LinearWavyProgressIndicatorFirstTail", c6956l, 29112, 0);
            C10942l c10942l3 = new C10942l();
            c10942l3.yandex = 1750;
            c10942l3.yandex(fValueOf, 650).loadAd = c6763l2;
            c10942l3.yandex(fValueOf2, 1500);
            C8456l c8456lYandex3 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 1.0f, AbstractC0532l.purchase(new C13591l(c10942l3), 0, 0L, 6), "LinearWavyProgressIndicatorSecondHead", c6956l, 29112, 0);
            C10942l c10942l4 = new C10942l();
            c10942l4.yandex = 1750;
            c10942l4.yandex(fValueOf, 900).loadAd = c6763l2;
            c10942l4.yandex(fValueOf2, 1750);
            C8456l c8456lYandex4 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 1.0f, AbstractC0532l.purchase(new C13591l(c10942l4), 0, 0L, 6), "LinearWavyProgressIndicatorSecondTail", c6956l, 29112, 0);
            c6956l2 = c6956l;
            interfaceC17242l2 = interfaceC17242l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0019l.amazon(AbstractC0080l.firebase(AbstractC15185l.loadAd(interfaceC17242l2.premium(AbstractC11767l.yandex)), AbstractC12639l.amazon, AbstractC12639l.crashlytics));
            boolean zBilling = c6956l2.billing(c8456lYandex);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                objM2132native = new C18355l(c8456lYandex, 11);
                c6956l2.m2147try(objM2132native);
            }
            Function0 function0 = (Function0) objM2132native;
            boolean zBilling2 = c6956l2.billing(c8456lYandex2);
            Object objM2132native2 = c6956l2.m2132native();
            if (zBilling2 || objM2132native2 == c13863l) {
                objM2132native2 = new C18355l(c8456lYandex2, 12);
                c6956l2.m2147try(objM2132native2);
            }
            Function0 function1 = (Function0) objM2132native2;
            boolean zBilling3 = c6956l2.billing(c8456lYandex3);
            Object objM2132native3 = c6956l2.m2132native();
            if (zBilling3 || objM2132native3 == c13863l) {
                objM2132native3 = new C18355l(c8456lYandex3, 13);
                c6956l2.m2147try(objM2132native3);
            }
            Function0 function2 = (Function0) objM2132native3;
            boolean zBilling4 = c6956l2.billing(c8456lYandex4);
            Object objM2132native4 = c6956l2.m2132native();
            if (zBilling4 || objM2132native4 == c13863l) {
                objM2132native4 = new C18355l(c8456lYandex4, 14);
                c6956l2.m2147try(objM2132native4);
            }
            Function0 function3 = (Function0) objM2132native4;
            float f14 = f12 < 0.0f ? 0.0f : f12;
            AbstractC9334l.yandex(c6956l2, interfaceC17242lAmazon.premium(new C4562l(f9, f10, f11, f14 > 1.0f ? 1.0f : f14, j5, j6, c0404l6, c0404l5, function0, function1, function2, function3)));
            f6 = f12;
            f5 = f9;
            f7 = f10;
            f8 = f11;
            j3 = j5;
            j4 = j6;
            c0404l3 = c0404l6;
            c0404l4 = c0404l5;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l2 = c6956l;
            c6956l2.m2124else();
            j3 = j;
            j4 = j2;
            c0404l3 = c0404l;
            c0404l4 = c0404l2;
            f5 = f;
            f6 = f2;
            f7 = f3;
            f8 = f4;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            final InterfaceC17242l interfaceC17242l3 = interfaceC17242l2;
            c4224lAds.amazon = new Function2(j3, j4, c0404l3, c0404l4, f5, f6, f7, f8, i) { // from class: lؙۚۘ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ long f14108l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ float f14109l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ float f14110l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ long f14111l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ C0404l f14113l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ C0404l f14114l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ float f14115l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ float f14116l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(7);
                    AbstractC15831l.loadAd(this.f14112l, this.f14111l, this.f14108l, this.f14114l, this.f14113l, this.f14116l, this.f14109l, this.f14110l, this.f14115l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void yandex(final Function0 function0, final InterfaceC17242l interfaceC17242l, long j, long j2, C0404l c0404l, C0404l c0404l2, float f, float f2, Function1 function1, float f3, float f4, C6956l c6956l, final int i) {
        final long j3;
        final long j4;
        final C0404l c0404l3;
        final C0404l c0404l4;
        final float f5;
        final float f6;
        final Function1 function2;
        final float f7;
        final float f8;
        long jPurchase;
        long jPurchase2;
        C0404l c0404l5;
        C0404l c0404l6;
        float f9;
        float f10;
        Function1 function3;
        float f11;
        int i2;
        float f12;
        c6956l.m2133new(2019304030);
        int i3 = i | (c6956l.admob(function0) ? 4 : 2) | 306783360;
        if (c6956l.m2127for(i3 & 1, (306783379 & i3) != 306783378)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                float f13 = AbstractC12639l.yandex;
                jPurchase = AbstractC15038l.purchase(c6956l, 26);
                jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                C10707l c10707l = AbstractC4751l.admob;
                c0404l5 = new C0404l(((InterfaceC13490l) c6956l.isPro(c10707l)).mo868instanceof(4.0f), 0.0f, 1, 0, null, 26);
                c0404l6 = new C0404l(((InterfaceC13490l) c6956l.isPro(c10707l)).mo868instanceof(4.0f), 0.0f, 1, 0, null, 26);
                f9 = AbstractC12639l.billing;
                f10 = AbstractC12639l.purchase;
                function3 = AbstractC12639l.mopub;
                f11 = AbstractC12639l.yandex;
                i2 = i3 & (-2147483521);
                f12 = f11;
            } else {
                c6956l.m2124else();
                i2 = i3 & (-2147483521);
                jPurchase = j;
                jPurchase2 = j2;
                c0404l5 = c0404l;
                c0404l6 = c0404l2;
                f9 = f;
                f10 = f2;
                function3 = function1;
                f11 = f3;
                f12 = f4;
            }
            c6956l.adcel();
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242l.premium(AbstractC11767l.yandex);
            boolean z = (i2 & 14) == 4;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C6199l(17, function0);
                c6956l.m2147try(objM2132native);
            }
            float f14 = f10;
            long j5 = jPurchase;
            long j6 = jPurchase2;
            C0404l c0404l7 = c0404l5;
            C0404l c0404l8 = c0404l6;
            float f15 = f9;
            Function1 function4 = function3;
            float f16 = f11;
            AbstractC9334l.yandex(c6956l, AbstractC0019l.amazon(AbstractC0080l.firebase(AbstractC4962l.yandex(interfaceC17242lPremium, true, (Function1) objM2132native), AbstractC12639l.amazon, AbstractC12639l.crashlytics)).premium(new C2202l(f15, f14, f16, f12, j5, j6, c0404l7, c0404l8, function0, function4)));
            f8 = f12;
            function2 = function4;
            f7 = f16;
            j3 = j5;
            j4 = j6;
            c0404l3 = c0404l7;
            c0404l4 = c0404l8;
            f5 = f15;
            f6 = f14;
        } else {
            c6956l.m2124else();
            j3 = j;
            j4 = j2;
            c0404l3 = c0404l;
            c0404l4 = c0404l2;
            f5 = f;
            f6 = f2;
            function2 = function1;
            f7 = f3;
            f8 = f4;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(interfaceC17242l, j3, j4, c0404l3, c0404l4, f5, f6, function2, f7, f8, i) { // from class: lؓۙٚ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ long f4657l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ float f4658l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ float f4659l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f4660l;

                /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
                public final /* synthetic */ float f4662l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ C0404l f4663l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ long f4664l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f4665l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ C0404l f4666l;

                /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
                public final /* synthetic */ float f4667l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(49);
                    AbstractC15831l.yandex(this.f4661l, this.f4660l, this.f4657l, this.f4664l, this.f4663l, this.f4666l, this.f4658l, this.f4659l, this.f4665l, this.f4662l, this.f4667l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
