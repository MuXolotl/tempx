package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.Collection;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑؗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0124l {
    public static final C15578l yandex = new C15578l(1268214212, false, new C5142l(7));
    public static final C15578l loadAd = new C15578l(-1971964984, false, new C5142l(8));
    public static final C15578l crashlytics = new C15578l(-127950229, false, new C2464l(13));
    public static final C15578l amazon = new C15578l(-1425424680, false, new C2464l(14));

    public static final boolean admob(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return AbstractC8576l.yandex(AbstractC12024l.m3330l(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5  */
    public static final void amazon(InterfaceC5475l interfaceC5475l, Function0 function0, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        InterfaceC17242l interfaceC17242l2;
        int i3;
        int i4;
        String strMopub;
        Activity activity;
        boolean zAdmob;
        Object objM2132native;
        Function0 function1;
        c6956l.m2133new(-675659617);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? c6956l.billing(interfaceC5475l) : c6956l.admob(interfaceC5475l) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        int i5 = i2 | 384;
        int i6 = 1;
        if (c6956l.m2127for(i5 & 1, (i5 & 147) != 146)) {
            if ((interfaceC5475l instanceof C3022l) || (interfaceC5475l instanceof C10488l) || (interfaceC5475l instanceof C13974l)) {
                i3 = 1936336472;
                i4 = R.string.error_occurred_reload;
            } else {
                if (interfaceC5475l instanceof C10543l) {
                    c6956l.m2123default(1936453249);
                    strMopub = AbstractC11999l.purchase(c6956l, ((C10543l) interfaceC5475l).amazon);
                    c6956l.startapp(false);
                } else if (interfaceC5475l instanceof C4494l) {
                    c6956l.m2123default(1936563423);
                    c6956l.startapp(false);
                    strMopub = ((C4494l) interfaceC5475l).amazon;
                } else if (AbstractC8576l.yandex(interfaceC5475l, C18058l.yandex)) {
                    c6956l.m2123default(1936631561);
                    c6956l.startapp(false);
                    strMopub = "";
                } else {
                    if (!(interfaceC5475l instanceof C12571l) && !(interfaceC5475l instanceof C5190l)) {
                        throw AbstractC12900l.billing(-768824865, c6956l, false);
                    }
                    i3 = 1936743068;
                    i4 = R.string.error_1117_action;
                }
                activity = (Activity) c6956l.isPro(AbstractC10343l.yandex);
                if (!(interfaceC5475l instanceof C12571l) || (interfaceC5475l instanceof C5190l)) {
                    c6956l.m2123default(1936987968);
                    zAdmob = c6956l.admob(activity);
                    objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C16952l(activity, i6);
                        c6956l.m2147try(objM2132native);
                    }
                    function1 = (Function0) objM2132native;
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(1937212811);
                    c6956l.startapp(false);
                    function1 = function0;
                }
                interfaceC17242l2 = C4346l.f8873l;
                AbstractC17457l.mopub(function1, interfaceC17242l2, false, null, null, null, AbstractC14566l.amazon(-1791629950, new C12273l(strMopub, i6), c6956l), c6956l, ((i5 >> 3) & 112) | 805306368, 508);
            }
            strMopub = AbstractC12900l.mopub(c6956l, i3, i4, c6956l, false);
            activity = (Activity) c6956l.isPro(AbstractC10343l.yandex);
            if (interfaceC5475l instanceof C12571l) {
                c6956l.m2123default(1936987968);
                zAdmob = c6956l.admob(activity);
                objM2132native = c6956l.m2132native();
                if (zAdmob) {
                    objM2132native = new C16952l(activity, i6);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C16952l(activity, i6);
                    c6956l.m2147try(objM2132native);
                }
                function1 = (Function0) objM2132native;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(1936987968);
                zAdmob = c6956l.admob(activity);
                objM2132native = c6956l.m2132native();
                if (zAdmob) {
                    objM2132native = new C16952l(activity, i6);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C16952l(activity, i6);
                    c6956l.m2147try(objM2132native);
                }
                function1 = (Function0) objM2132native;
                c6956l.startapp(false);
            }
            interfaceC17242l2 = C4346l.f8873l;
            AbstractC17457l.mopub(function1, interfaceC17242l2, false, null, null, null, AbstractC14566l.amazon(-1791629950, new C12273l(strMopub, i6), c6956l), c6956l, ((i5 >> 3) & 112) | 805306368, 508);
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(interfaceC5475l, function0, interfaceC17242l2, i, 15);
        }
    }

    public static final void billing(InterfaceC17242l interfaceC17242l, Function2 function2, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(1090521195);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function2) ? 32 : 16;
        }
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C10327l.loadAd;
                c6956l.m2147try(objM2132native);
            }
            InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native;
            long j = c6956l.f14595continue;
            int i4 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            int i5 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835l, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            function2.invoke(c6956l, Integer.valueOf((i5 >> 6) & 14));
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13000l(interfaceC17242l, function2, i, i3);
        }
    }

    public static final void crashlytics(InterfaceC5475l interfaceC5475l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1059900155);
        int i2 = 4;
        int i3 = (c6956l.billing(interfaceC5475l) ? 4 : 2) | i;
        if (!c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            c6956l.m2124else();
        } else if ((interfaceC5475l instanceof C3022l) || (interfaceC5475l instanceof C10488l)) {
            c6956l.m2123default(1114240307);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_error_outline_28, 0, c6956l), null, interfaceC17242l, 0L, c6956l, 440, 8);
            c6956l.startapp(false);
        } else if (interfaceC5475l instanceof C13974l) {
            c6956l.m2123default(1114484339);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_globe_outline_28, 0, c6956l), null, interfaceC17242l, 0L, c6956l, 440, 8);
            c6956l.startapp(false);
        } else if (interfaceC5475l instanceof C12571l) {
            c6956l.m2123default(1114736152);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.key_outline_28, 0, c6956l), null, interfaceC17242l, 0L, c6956l, 440, 8);
            c6956l.startapp(false);
        } else if (interfaceC5475l instanceof C5190l) {
            c6956l.m2123default(1114976495);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_snowflake_outline_28, 0, c6956l), null, interfaceC17242l, 0L, c6956l, 440, 8);
            c6956l.startapp(false);
        } else if (interfaceC5475l instanceof C10543l) {
            c6956l.m2123default(1115222852);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(((C10543l) interfaceC5475l).yandex, 0, c6956l), null, interfaceC17242l, 0L, c6956l, 440, 8);
            c6956l.startapp(false);
        } else if (interfaceC5475l instanceof C4494l) {
            c6956l.m2123default(1115453771);
            AbstractC7741l.amazon(((C4494l) interfaceC5475l).yandex, null, interfaceC17242l, null, new C0534l(((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex, 5), c6956l, 432, 1784);
            c6956l.startapp(false);
        } else {
            if (!AbstractC8576l.yandex(interfaceC5475l, C18058l.yandex)) {
                throw AbstractC12900l.billing(-656794881, c6956l, false);
            }
            c6956l.m2123default(1115719131);
            c6956l.startapp(false);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14601l(interfaceC5475l, interfaceC17242l, i, i2);
        }
    }

    public static final void loadAd(InterfaceC5475l interfaceC5475l, Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, C6956l c6956l, int i, int i2) {
        boolean z2;
        int i3;
        InterfaceC5475l interfaceC5475l2;
        boolean z3;
        C4224l c4224lAds;
        C9272l c9272l;
        boolean z4;
        Throwable th;
        boolean z5;
        boolean z6;
        C14855l c14855l = C18450l.f36042l;
        c6956l.m2133new(929783610);
        int i4 = (c6956l.billing(interfaceC5475l) ? 4 : 2) | i | (c6956l.admob(function0) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (c6956l.mopub(z2) ? 2048 : 1024);
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z7 = i5 != 0 ? true : z2;
            if (interfaceC5475l instanceof C18058l) {
                c4224lAds = c6956l.ads();
                if (c4224lAds == null) {
                    return;
                } else {
                    c9272l = new C9272l(interfaceC5475l, function0, interfaceC17242l, z7, i, i2, 0);
                }
            } else {
                boolean z8 = z7;
                Activity activity = (Activity) c6956l.isPro(AbstractC10343l.yandex);
                InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(interfaceC17242l, 1.0f);
                C14855l c14855l2 = C18450l.f36026l;
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l2, false);
                long j = c6956l.f14595continue;
                int i6 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
                InterfaceC8801l.firebase.getClass();
                Function0 function1 = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(function1);
                } else {
                    c6956l.m2136protected();
                }
                C6415l c6415l = C3438l.mopub;
                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
                C6415l c6415l2 = C3438l.billing;
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
                Integer numValueOf = Integer.valueOf(i6);
                C6415l c6415l3 = C3438l.isPro;
                AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                C11192l c11192l = C3438l.firebase;
                AbstractC8182l.purchase(c6956l, c11192l);
                C6415l c6415l4 = C3438l.amazon;
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                C14855l c14855l3 = C18450l.f36043l;
                C16170l c16170l = C16170l.yandex;
                C4346l c4346l = C4346l.f8873l;
                int i7 = i3;
                InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c16170l.yandex(c4346l, c14855l3), 16.0f, 0.0f, 2);
                C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l, 54);
                long j2 = c6956l.f14595continue;
                int i8 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(function1);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                AbstractC11043l.isPro(i8, c6956l, c6415l3, c6956l, c11192l);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                C8540l c8540l = AbstractC12502l.yandex;
                AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
                interfaceC5475l2 = interfaceC5475l;
                AbstractC10478l.yandex(AbstractC5020l.startapp(((C14370l) c6956l.isPro(abstractC5189l)).yandex.subscription, c8540l), AbstractC14566l.amazon(-651019778, new C1458l(interfaceC5475l2, 1), c6956l), c6956l, 56);
                int i9 = i7 & 14;
                purchase(interfaceC5475l2, null, c6956l, i9);
                if (z8) {
                    c6956l.m2123default(-203248299);
                    amazon(interfaceC5475l2, function0, null, c6956l, i7 & 126);
                    z4 = false;
                } else {
                    z4 = false;
                    c6956l.m2123default(-208463708);
                }
                c6956l.startapp(z4);
                c6956l.startapp(true);
                if (interfaceC5475l2 instanceof C10488l) {
                    th = ((C10488l) interfaceC5475l2).yandex;
                } else {
                    th = interfaceC5475l2 instanceof C13974l ? ((C13974l) interfaceC5475l2).yandex : null;
                }
                if (th != null) {
                    c6956l.m2123default(463358768);
                    boolean zAdmob = c6956l.admob(activity) | (i9 == 4);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C8717l(activity, interfaceC5475l2, 0);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, AbstractC3605l.startapp(c16170l.yandex(c4346l, c14855l), 0.0f, 0.0f, 0.0f, 16.0f, 7), false, null, null, null, AbstractC8016l.yandex, c6956l, 805306368, 508);
                    c6956l.startapp(false);
                    z5 = true;
                } else {
                    if (interfaceC5475l2 instanceof C3022l) {
                        c6956l.m2123default(463851327);
                        InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0019l.crashlytics(c16170l.yandex(AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, 16.0f, 7), c14855l), AbstractC7497l.yandex);
                        InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l2, false);
                        long j3 = c6956l.f14595continue;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics2);
                        c6956l.m2140super();
                        if (c6956l.f14603switch) {
                            c6956l.firebase(function1);
                        } else {
                            c6956l.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l, interfaceC10835lAmazon2, c6415l);
                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
                        AbstractC11043l.isPro(i10, c6956l, c6415l3, c6956l, c11192l);
                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
                        AbstractC10478l.yandex(AbstractC5020l.startapp(((C14370l) c6956l.isPro(abstractC5189l)).yandex.yandex, c8540l), AbstractC14566l.amazon(886324586, new C14601l(activity, interfaceC5475l2, 3), c6956l), c6956l, 56);
                        z5 = true;
                        c6956l.startapp(true);
                        z6 = false;
                    } else {
                        z5 = true;
                        z6 = false;
                        c6956l.m2123default(457936558);
                    }
                    c6956l.startapp(z6);
                }
                c6956l.startapp(z5);
                z3 = z8;
            }
            c4224lAds.amazon = c9272l;
        }
        interfaceC5475l2 = interfaceC5475l;
        c6956l.m2124else();
        z3 = z2;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c9272l = new C9272l(interfaceC5475l2, function0, interfaceC17242l, z3, i, i2, 1);
            c4224lAds.amazon = c9272l;
        }
    }

    public static void mopub(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
    }

    public static final void purchase(InterfaceC5475l interfaceC5475l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(692452305);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c6956l.billing(interfaceC5475l) : c6956l.admob(interfaceC5475l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.yandex(C11090l.yandex(((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, 0L, 0L, null, null, 16744446), AbstractC14566l.amazon(1777832768, new C1458l(interfaceC5475l, i3), c6956l), c6956l, 48);
            interfaceC17242l2 = C4346l.f8873l;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(interfaceC5475l, interfaceC17242l2, i, 7);
        }
    }

    public static final String subs(Collection collection) {
        return !collection.isEmpty() ? AbstractC1833l.subs(AbstractC16901l.m4210case(collection, ",\n", "\n", "\n", null, 56), "    ").concat("},") : " }";
    }

    public static final void yandex(Function0 function0, C9401l c9401l, C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(826668973);
        int i2 = 2;
        int i3 = i | (c6956l.admob(function0) ? 4 : 2) | (c6956l.billing(c9401l) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            View view = (View) c6956l.isPro(AbstractC1242l.billing);
            InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
            EnumC9931l enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
            C14112l c14112lMopub = AbstractC8238l.mopub(c6956l);
            InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(c15578l, c6956l);
            Object[] objArr = new Object[0];
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = C5617l.f11943l;
                c6956l.m2147try(objM2132native);
            }
            UUID uuid = (UUID) AbstractC0825l.firebase(objArr, (Function0) objM2132native, c6956l);
            c9401l.getClass();
            boolean zBilling = c6956l.billing(view) | c6956l.billing(interfaceC13490l) | c6956l.amazon(2) | c6956l.billing(null);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj) {
                DialogC7656l dialogC7656l = new DialogC7656l(function0, c9401l, view, enumC9931l, interfaceC13490l, uuid);
                C15578l c15578l2 = new C15578l(-1338939603, true, new C3956l(i2, interfaceC8714lVip));
                C9295l c9295l = dialogC7656l.f15784l;
                c9295l.setParentCompositionContext(c14112lMopub);
                c9295l.f19099l.setValue(c15578l2);
                c9295l.f19097l = true;
                c9295l.amazon();
                c6956l.m2147try(dialogC7656l);
                objM2132native2 = dialogC7656l;
            }
            DialogC7656l dialogC7656l2 = (DialogC7656l) objM2132native2;
            boolean zAdmob = c6956l.admob(dialogC7656l2);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob || objM2132native3 == obj) {
                objM2132native3 = new C16195l(dialogC7656l2, 0);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.loadAd(dialogC7656l2, (Function1) objM2132native3, c6956l);
            boolean zAdmob2 = c6956l.admob(dialogC7656l2) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | c6956l.amazon(enumC9931l.ordinal());
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob2 || objM2132native4 == obj) {
                objM2132native4 = new C0453l(dialogC7656l2, function0, c9401l, enumC9931l);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC12311l.billing((Function0) objM2132native4, c6956l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11834l(function0, c9401l, c15578l, i, 0);
        }
    }
}
