package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؗۘؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5103l {
    public static final C15578l yandex = new C15578l(230278729, false, new C5142l(21));
    public static final C15578l loadAd = new C15578l(146117832, false, new C5142l(29));
    public static final C15578l crashlytics = new C15578l(-362925379, false, new C2834l(0));
    public static final C15578l amazon = new C15578l(723850542, false, new C2464l(24));
    public static final C15578l purchase = new C15578l(-412093904, false, new C2464l(25));
    public static final C15578l billing = new C15578l(-698890443, false, new C5142l(22));
    public static final C15578l mopub = new C15578l(-1175703550, false, new C2464l(26));
    public static final C15578l admob = new C15578l(1983319300, false, new C2464l(27));
    public static final C15578l subs = new C15578l(1696522761, false, new C5142l(23));
    public static final C15578l isPro = new C15578l(-1057107709, false, new C5142l(24));
    public static final C15578l firebase = new C15578l(-1459295863, false, new C2464l(28));
    public static final C15578l smaato = new C15578l(-1336014197, false, new C2464l(29));
    public static final C15578l remoteconfig = new C15578l(785549712, false, new C5142l(25));
    public static final C15578l vip = new C15578l(894610570, false, new C5142l(26));
    public static final C15578l metrica = new C15578l(-671432651, false, new C5142l(27));
    public static final C15578l startapp = new C15578l(236558041, false, new C11112l(0));
    public static final C15578l adcel = new C15578l(1134880208, false, new C5142l(28));

    public static final Object amazon(C3823l c3823l, C3042l c3042l) {
        if (!c3823l.firebase()) {
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c3042l));
            c2397l.license();
            c3823l.loadAd(ExecutorC12908l.f25365l, new C1770l(29, c2397l));
            return c2397l.Signature();
        }
        Exception excSubs = c3823l.subs();
        if (excSubs != null) {
            throw excSubs;
        }
        if (!c3823l.amazon) {
            return c3823l.isPro();
        }
        throw new CancellationException("Task " + c3823l + " was cancelled normally.");
    }

    public static final AbstractC1872l billing(Executor executor) {
        AbstractC1872l abstractC1872l;
        ExecutorC3688l executorC3688l = executor instanceof ExecutorC3688l ? (ExecutorC3688l) executor : null;
        return (executorC3688l == null || (abstractC1872l = executorC3688l.f7767l) == null) ? new C2325l(executor) : abstractC1872l;
    }

    public static final void crashlytics(InterfaceC17242l interfaceC17242l, Function0 function0, boolean z, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(2111672474);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (c6956l.admob(function0) ? 32 : 16) | (c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C4707l c4707l = AbstractC1848l.yandex;
            AbstractC9334l.yandex(c6956l, AbstractC17541l.loadAd(AbstractC0080l.firebase(interfaceC17242l, 25.0f, 25.0f), new C0613l(function0, z)));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12336l(interfaceC17242l, function0, z, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    public static final void loadAd(final InterfaceC7316l interfaceC7316l, final boolean z, final int i, final boolean z2, long j, final float f, final C8110l c8110l, C6956l c6956l, final int i2, final int i3) {
        int i4;
        long j2;
        boolean z3;
        boolean z4;
        c6956l.m2133new(-466280168);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c6956l.billing(interfaceC7316l) : c6956l.admob(interfaceC7316l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c6956l.amazon(AbstractC5020l.inmobi(i)) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c6956l.mopub(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            j2 = j;
            i4 |= ((i3 & 16) == 0 && c6956l.purchase(j2)) ? 16384 : 8192;
        } else {
            j2 = j;
        }
        if ((1572864 & i2) == 0) {
            i4 |= c6956l.billing(c8110l) ? 1048576 : 524288;
        }
        if (c6956l.m2127for(i4 & 1, (533651 & i4) != 533650)) {
            c6956l.m2141switch();
            if ((i2 & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
            } else if ((i3 & 16) != 0) {
                i4 &= -57345;
                j2 = 9205357640488583168L;
            }
            c6956l.adcel();
            if (z) {
                C4707l c4707l = AbstractC1848l.yandex;
                if ((i != 1 || z2) && !(i == 2 && z2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                C4707l c4707l2 = AbstractC1848l.yandex;
                if ((i == 1 && !z2) || (i == 2 && z2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            C12630l c12630l = z3 ? AbstractC5088l.loadAd : AbstractC5088l.yandex;
            int i5 = i4 & 14;
            boolean zMopub = (i5 == 4 || ((i4 & 8) != 0 && c6956l.admob(interfaceC7316l))) | ((i4 & 112) == 32) | c6956l.mopub(z3);
            Object objM2132native = c6956l.m2132native();
            if (zMopub || objM2132native == C1867l.yandex) {
                z4 = false;
                objM2132native = new C14027l(0 == true ? 1 : 0, interfaceC7316l, z, z3);
                c6956l.m2147try(objM2132native);
            } else {
                z4 = false;
            }
            final InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(c8110l, z4, (Function1) objM2132native);
            final InterfaceC3114l interfaceC3114l = (InterfaceC3114l) c6956l.isPro(AbstractC4751l.tapsense);
            final boolean z5 = z3;
            final long j3 = j2;
            yandex(interfaceC7316l, c12630l, AbstractC14566l.amazon(1365123137, new Function2() { // from class: lٍۚؗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C10092l c10092lYandex = AbstractC4751l.tapsense.yandex(interfaceC3114l);
                        final long j4 = j3;
                        final boolean z6 = z5;
                        final InterfaceC17242l interfaceC17242l = interfaceC17242lYandex;
                        final InterfaceC7316l interfaceC7316l2 = interfaceC7316l;
                        AbstractC10478l.yandex(c10092lYandex, AbstractC14566l.amazon(1260045569, new Function2() { // from class: lٖؑؖ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i6 = 1;
                                final int i7 = 0;
                                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j5 = j4;
                                    boolean z7 = z6;
                                    InterfaceC17242l interfaceC17242l2 = interfaceC17242l;
                                    final InterfaceC7316l interfaceC7316l3 = interfaceC7316l2;
                                    C13863l c13863l = C1867l.yandex;
                                    if (j5 != 9205357640488583168L) {
                                        c6956l3.m2123default(3458246);
                                        InterfaceC5404l interfaceC5404l = z7 ? AbstractC12887l.loadAd : AbstractC12887l.yandex;
                                        InterfaceC17242l interfaceC17242lSubs = AbstractC0080l.subs(interfaceC17242l2, C2261l.loadAd(j5), C2261l.yandex(j5), 0.0f, 0.0f, 12);
                                        C5062l c5062lYandex = AbstractC7001l.yandex(interfaceC5404l, C18450l.f36044l, c6956l3, 0);
                                        long j6 = c6956l3.f14595continue;
                                        int i8 = (int) (j6 ^ (j6 >>> 32));
                                        InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lSubs);
                                        InterfaceC8801l.firebase.getClass();
                                        C16395l c16395l = C3438l.loadAd;
                                        c6956l3.m2140super();
                                        if (c6956l3.f14603switch) {
                                            c6956l3.firebase(c16395l);
                                        } else {
                                            c6956l3.m2136protected();
                                        }
                                        AbstractC8182l.billing(c6956l3, c5062lYandex, C3438l.mopub);
                                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                                        AbstractC8182l.billing(c6956l3, Integer.valueOf(i8), C3438l.isPro);
                                        AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                                        boolean zAdmob = c6956l3.admob(interfaceC7316l3);
                                        Object objM2132native2 = c6956l3.m2132native();
                                        if (zAdmob || objM2132native2 == c13863l) {
                                            objM2132native2 = new Function0() { // from class: lؕ۠ؔ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i9 = i7;
                                                    InterfaceC7316l interfaceC7316l4 = interfaceC7316l3;
                                                    switch (i9) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC7316l4.yandex()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC7316l4.yandex()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c6956l3.m2147try(objM2132native2);
                                        }
                                        AbstractC5103l.crashlytics(C4346l.f8873l, (Function0) objM2132native2, z7, c6956l3, 6);
                                        c6956l3.startapp(true);
                                        c6956l3.startapp(false);
                                    } else {
                                        c6956l3.m2123default(4389176);
                                        boolean zAdmob2 = c6956l3.admob(interfaceC7316l3);
                                        Object objM2132native3 = c6956l3.m2132native();
                                        if (zAdmob2 || objM2132native3 == c13863l) {
                                            objM2132native3 = new Function0() { // from class: lؕ۠ؔ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i9 = i6;
                                                    InterfaceC7316l interfaceC7316l4 = interfaceC7316l3;
                                                    switch (i9) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC7316l4.yandex()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & interfaceC7316l4.yandex()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c6956l3.m2147try(objM2132native3);
                                        }
                                        AbstractC5103l.crashlytics(interfaceC17242l2, (Function0) objM2132native3, z7, c6956l3, 0);
                                        c6956l3.startapp(false);
                                    }
                                } else {
                                    c6956l3.m2124else();
                                }
                                return Unit.INSTANCE;
                            }
                        }, c6956l2), c6956l2, 56);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, i5 | 384);
            j2 = j3;
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            final long j4 = j2;
            c4224lAds.amazon = new Function2() { // from class: lٕۛٓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC5103l.loadAd(interfaceC7316l, z, i, z2, j4, f, c8110l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final C14115l purchase(C3366l c3366l, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        C14115l c14115lYandex = AbstractC11308l.amazon;
        C2151l c2151lYandex = AbstractC11308l.purchase;
        C13601l c13601l = AbstractC11308l.billing;
        if (c14115lYandex == null || c2151lYandex == null) {
            c14115lYandex = AbstractC3925l.yandex(iCeil, iCeil, 1, 24);
            AbstractC11308l.amazon = c14115lYandex;
            c2151lYandex = AbstractC4918l.yandex(c14115lYandex);
            AbstractC11308l.purchase = c2151lYandex;
        } else {
            Bitmap bitmap = c14115lYandex.yandex;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                c14115lYandex = AbstractC3925l.yandex(iCeil, iCeil, 1, 24);
                AbstractC11308l.amazon = c14115lYandex;
                c2151lYandex = AbstractC4918l.yandex(c14115lYandex);
                AbstractC11308l.purchase = c2151lYandex;
            }
        }
        C14115l c14115l = c14115lYandex;
        C2151l c2151l = c2151lYandex;
        if (c13601l == null) {
            c13601l = new C13601l();
            AbstractC11308l.billing = c13601l;
        }
        C13601l c13601l2 = c13601l;
        C4417l c4417l = c13601l2.f26630l;
        EnumC9931l layoutDirection = c3366l.f7169l.getLayoutDirection();
        Bitmap bitmap2 = c14115l.yandex;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        InterfaceC13490l interfaceC13490l = c4417l.yandex;
        EnumC9931l enumC9931l = c4417l.loadAd;
        InterfaceC14859l interfaceC14859l = c4417l.crashlytics;
        long j = c4417l.amazon;
        c4417l.yandex = c3366l;
        c4417l.loadAd = layoutDirection;
        c4417l.crashlytics = c2151l;
        c4417l.amazon = jFloatToRawIntBits;
        c2151l.mopub();
        AbstractC9361l.metrica(c13601l2, C9735l.loadAd, 0L, c13601l2.f26629l.m4551private(), 0.0f, null, null, 0, 58);
        AbstractC9361l.metrica(c13601l2, AbstractC12953l.amazon(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, null, 0, 120);
        AbstractC9361l.admob(c13601l2, AbstractC12953l.amazon(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), null, 120);
        c2151l.ads();
        c4417l.yandex = interfaceC13490l;
        c4417l.loadAd = enumC9931l;
        c4417l.crashlytics = interfaceC14859l;
        c4417l.amazon = j;
        return c14115l;
    }

    public static final void yandex(InterfaceC7316l interfaceC7316l, InterfaceC13460l interfaceC13460l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c6956l.billing(interfaceC7316l) : c6956l.admob(interfaceC7316l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC13460l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && c6956l.billing(interfaceC7316l))) | ((i2 & 112) == 32);
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C6117l(interfaceC13460l, interfaceC7316l);
                c6956l.m2147try(objM2132native);
            }
            AbstractC3017l.yandex((C6117l) objM2132native, null, new C12288l(1, false, false), c15578l, c6956l, ((i2 << 3) & 7168) | 384, 2);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(interfaceC7316l, interfaceC13460l, c15578l, i, 0);
        }
    }
}
