package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٔۗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15096l {
    public static final boolean[] yandex = new boolean[3];

    public static final Integer admob(C5296l c5296l, AbstractC0306l abstractC0306l, int i, int i2) {
        Integer numAdmob;
        int[] iArr = c5296l.loadAd;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (c5296l.isPro(i) && c5296l.subs(i) == 206 && AbstractC8576l.yandex(c5296l.startapp(iArr, i), AbstractC2032l.purchase)) {
                Object objAdmob = c5296l.admob(i, 0);
                InterfaceC17142l interfaceC17142l = objAdmob instanceof InterfaceC17142l ? (InterfaceC17142l) objAdmob : null;
                InterfaceC6752l interfaceC6752l = interfaceC17142l != null ? ((C6031l) interfaceC17142l).yandex : null;
                C2450l c2450l = interfaceC6752l instanceof C2450l ? (C2450l) interfaceC6752l : null;
                if (c2450l != null && c2450l.f5235l == abstractC0306l) {
                    return Integer.valueOf(i);
                }
            }
            if (c5296l.amazon(i) && (numAdmob = admob(c5296l, abstractC0306l, i + 1, i3)) != null) {
                return Integer.valueOf(numAdmob.intValue());
            }
            i = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC16148l amazon(AbstractC4366l abstractC4366l, boolean z) {
        InterfaceC16148l c5654l;
        InterfaceC16148l c10709l;
        boolean zM3679package;
        Method methodAmazon;
        AbstractC12055l abstractC12055lMo1540extends = abstractC4366l.mo1540extends();
        if (AbstractC0601l.f2039l.amazon(abstractC12055lMo1540extends.loadAd())) {
            return C10422l.yandex;
        }
        C6084l c6084l = abstractC12055lMo1540extends.f23985l;
        AbstractC0601l abstractC0601l = abstractC12055lMo1540extends.f23983l;
        C1559l c1559l = z ? AbstractC10565l.admob(c6084l).crashlytics : AbstractC10565l.admob(c6084l).amazon;
        Method methodM655catch = c1559l != null ? abstractC0601l.m655catch(c1559l.loadAd, c1559l.crashlytics) : null;
        int i = 2;
        boolean z2 = false;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        if (methodM655catch == null) {
            if (AbstractC13457l.admob(abstractC12055lMo1540extends)) {
                C10038l c10038l = AbstractC15547l.vip;
                InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[33];
                if (AbstractC10392l.startapp((EnumC11212l) c10038l.m2845finally(c6084l)) == 3) {
                    Class clsSmaato = AbstractC13457l.smaato(((AbstractC9707l) AbstractC16901l.m4208abstract(abstractC12055lMo1540extends.getParameters())).mo1109synchronized());
                    if (clsSmaato == null || (methodAmazon = AbstractC13457l.amazon(clsSmaato, abstractC12055lMo1540extends)) == null) {
                        throw new C3150l("Underlying property of inline class " + abstractC12055lMo1540extends + " should have a field");
                    }
                    c10709l = AbstractC7572l.admob(abstractC4366l) ? new C10709l(methodAmazon, AbstractC7572l.purchase(abstractC4366l.mo1540extends())) : new C1549l(methodAmazon);
                }
                return AbstractC13457l.loadAd(c10709l, abstractC4366l, C2580l.f5619l, false);
            }
            Field fieldMetrica = abstractC12055lMo1540extends.metrica();
            if (fieldMetrica == null) {
                C11467l.Signature(abstractC12055lMo1540extends, "No accessors or field is found for property ");
                return null;
            }
            boolean z3 = true;
            if ((abstractC0601l instanceof C5160l) && ((C5160l) abstractC0601l).m1728import() == EnumC18401l.COMPANION_OBJECT) {
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(((InterfaceC13937l) ((InterfaceC1388l) abstractC0601l)).mo1730private().getEnclosingClass());
                C5160l c5160l = interfaceC1388lLoadAd instanceof C5160l ? (C5160l) interfaceC1388lLoadAd : null;
                if (c5160l == null) {
                    zM3679package = false;
                } else if (c5160l.m1728import() == EnumC18401l.INTERFACE || c5160l.m1728import() == EnumC18401l.ANNOTATION_CLASS) {
                    C13698l c13698l = AbstractC0271l.loadAd;
                    InterfaceC13922l interfaceC13922l2 = AbstractC0271l.yandex[6];
                    zM3679package = c13698l.m3679package(c6084l);
                } else {
                    zM3679package = true;
                }
            } else {
                zM3679package = false;
            }
            if (!zM3679package && Modifier.isStatic(fieldMetrica.getModifiers())) {
                purchase(abstractC4366l);
                c5654l = z ? new C8659l(fieldMetrica, z2, i) : new C8784l(fieldMetrica, !AbstractC5592l.subs(abstractC12055lMo1540extends.smaato()), b4 == true ? 1 : 0, i);
            } else if (z) {
                c5654l = AbstractC7572l.admob(abstractC4366l) ? new C10112l(fieldMetrica, AbstractC7572l.purchase(abstractC4366l.mo1540extends())) : new C8659l(fieldMetrica, z3, b3 == true ? 1 : 0);
            } else {
                c5654l = AbstractC7572l.admob(abstractC4366l) ? new C6991l(fieldMetrica, !AbstractC5592l.subs(abstractC12055lMo1540extends.smaato()), AbstractC7572l.purchase(abstractC4366l.mo1540extends())) : new C8784l(fieldMetrica, !AbstractC5592l.subs(abstractC12055lMo1540extends.smaato()), z3, b2 == true ? 1 : 0);
            }
        } else if (Modifier.isStatic(methodM655catch.getModifiers())) {
            purchase(abstractC4366l);
            c5654l = AbstractC7572l.admob(abstractC4366l) ? new C5654l(methodM655catch, false, AbstractC7572l.purchase(abstractC4366l.mo1540extends())) : new C14041l(i, methodM655catch);
        } else {
            c5654l = AbstractC7572l.admob(abstractC4366l) ? new C12056l(methodM655catch, AbstractC7572l.purchase(abstractC4366l.mo1540extends())) : new C14041l(b == true ? 1 : 0, methodM655catch);
        }
        c10709l = c5654l;
        return AbstractC13457l.loadAd(c10709l, abstractC4366l, C2580l.f5619l, false);
    }

    public static final boolean billing(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void crashlytics(C10664l c10664l, C4847l c4847l, C11338l c11338l) {
        c11338l.metrica = -1;
        C14946l c14946l = c11338l.f22860private;
        int[] iArr = c11338l.f22844const;
        C14946l c14946l2 = c11338l.f22857native;
        C14946l c14946l3 = c11338l.f22864strictfp;
        C14946l c14946l4 = c11338l.f22873volatile;
        C14946l c14946l5 = c11338l.f22867synchronized;
        c11338l.startapp = -1;
        int[] iArr2 = c10664l.f22844const;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = c14946l5.mopub;
            int iMetrica = c10664l.metrica() - c14946l4.mopub;
            c14946l5.subs = c4847l.firebase(c14946l5);
            c14946l4.subs = c4847l.firebase(c14946l4);
            c4847l.amazon(c14946l5.subs, i);
            c4847l.amazon(c14946l4.subs, iMetrica);
            c11338l.metrica = 2;
            c11338l.f22846default = i;
            int i2 = iMetrica - i;
            c11338l.f22845continue = i2;
            int i3 = c11338l.f22852goto;
            if (i2 < i3) {
                c11338l.f22845continue = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = c14946l3.mopub;
        int iSubs = c10664l.subs() - c14946l2.mopub;
        c14946l3.subs = c4847l.firebase(c14946l3);
        c14946l2.subs = c4847l.firebase(c14946l2);
        c4847l.amazon(c14946l3.subs, i4);
        c4847l.amazon(c14946l2.subs, iSubs);
        if (c11338l.f22858new > 0 || c11338l.f22862public == 8) {
            C4657l c4657lFirebase = c4847l.firebase(c14946l);
            c14946l.subs = c4657lFirebase;
            c4847l.amazon(c4657lFirebase, c11338l.f22858new + i4);
        }
        c11338l.startapp = 2;
        c11338l.f22849final = i4;
        int i5 = iSubs - i4;
        c11338l.f22843class = i5;
        int i6 = c11338l.f22865super;
        if (i5 < i6) {
            c11338l.f22843class = i6;
        }
    }

    public static long loadAd(boolean z, int i, int i2, long j, long j2, int i3, boolean z2, long j3, long j4, long j5, long j6) {
        if (j6 != Long.MAX_VALUE && z2) {
            if (i3 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = i2 == 2 ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i3 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i3 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static final void purchase(AbstractC4366l abstractC4366l) {
        if (abstractC4366l.mo1540extends().f23983l instanceof C9539l) {
            return;
        }
        C8936l.smaato(abstractC4366l, "Only top-level properties are supported for now: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lْٓؗ, lٔۘ۟] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList subs(C5296l c5296l, int i, Integer num) {
        ?? c15122l = new C15122l(c5296l);
        i = c5296l.adcel(i);
        C12317l c12317lYandex = c5296l.yandex(i);
        while (i >= 0) {
            c15122l.crashlytics(c5296l.subs(i), c5296l.firebase(i) ? c5296l.startapp(c5296l.loadAd, i) : C1867l.yandex, c5296l.yandex.smaato(i), num);
            if (i >= 0) {
                C12317l c12317l = c12317lYandex;
                c12317lYandex = c5296l.yandex(i);
                i = c5296l.adcel(i);
                num = c12317l;
            } else {
                num = c12317lYandex;
            }
        }
        return c15122l.f27617l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [lْٓؗ, lٔۘ۟] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [lّؒؔ] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List yandex(C13006l c13006l, Integer num, int i, Integer num2) {
        int iInmobi;
        int iSubscription;
        C12463l c12463l;
        if (c13006l.pro || c13006l.startapp() == 0) {
            return C2580l.f5619l;
        }
        ?? c15122l = new C15122l(c13006l);
        if (num2 != null) {
            iInmobi = num2.intValue();
        } else {
            iInmobi = c13006l.license;
            if (iInmobi < 0) {
                iInmobi = c13006l.inmobi(c13006l.loadAd, i);
            }
        }
        if (num == 0) {
            int iM3521for = c13006l.subs - c13006l.m3521for(c13006l.loadAd, c13006l.ads(i));
            C16977l c16977l = c13006l.subscription;
            num = Integer.valueOf(iM3521for + ((c16977l == null || (c12463l = (C12463l) c16977l.loadAd(i)) == null) ? 0 : c12463l.loadAd));
        }
        int iAds = c13006l.ads(i) * 5;
        int[] iArr = c13006l.loadAd;
        if (iAds < iArr.length) {
            iSubscription = c13006l.subscription(i);
        } else {
            int iInmobi2 = iInmobi >= 0 ? c13006l.inmobi(iArr, iInmobi) : iInmobi;
            iSubscription = c13006l.subscription(iInmobi);
            int i2 = iInmobi;
            iInmobi = iInmobi2;
            i = i2;
        }
        while (i >= 0) {
            c15122l.crashlytics(iSubscription, (c13006l.loadAd[(c13006l.ads(i) * 5) + 1] & 536870912) != 0 ? c13006l.tapsense(i) : C1867l.yandex, c13006l.m3528throw(i), num);
            num = c13006l.loadAd(i);
            if (iInmobi >= 0) {
                int iInmobi3 = c13006l.inmobi(c13006l.loadAd, iInmobi);
                iSubscription = c13006l.subscription(iInmobi);
                int i3 = iInmobi;
                iInmobi = iInmobi3;
                i = i3;
            } else {
                i = iInmobi;
            }
        }
        return c15122l.f27617l;
    }

    public abstract AbstractC7444l mopub(C5740l c5740l, int i);
}
