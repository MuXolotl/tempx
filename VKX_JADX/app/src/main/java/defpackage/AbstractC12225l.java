package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِۤۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12225l {
    public static final C15578l yandex = new C15578l(-2072597251, false, new C3817l(26));

    public static final int admob(C6543l c6543l, int i) {
        AbstractC14971l abstractC14971l;
        C18289l c18289l;
        int iOrdinal = c6543l.m2028l().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C6543l c6543lAmazon = AbstractC11156l.amazon(c6543l);
                if (c6543lAmazon != null) {
                    return billing(c6543lAmazon, i);
                }
                C8339l.metrica("ActiveParent with no focused child");
                return 0;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return 0;
                }
                if (!c6543l.f29454l.f29462l) {
                    AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
                }
                AbstractC14971l abstractC14971l2 = c6543l.f29454l.f29456l;
                C3654l c3654lMetrica = AbstractC5573l.metrica(c6543l);
                loop0: while (true) {
                    abstractC14971l = null;
                    if (c3654lMetrica == null) {
                        break;
                    }
                    if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 1024) != 0) {
                        while (abstractC14971l2 != null) {
                            if ((abstractC14971l2.f29450l & 1024) != 0) {
                                AbstractC14971l abstractC14971lLoadAd = abstractC14971l2;
                                C17893l c17893l = null;
                                while (abstractC14971lLoadAd != null) {
                                    if (abstractC14971lLoadAd instanceof C6543l) {
                                        abstractC14971l = abstractC14971lLoadAd;
                                        break loop0;
                                    }
                                    if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                        int i2 = 0;
                                        for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                            if ((abstractC14971l3.f29450l & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    abstractC14971lLoadAd = abstractC14971l3;
                                                } else {
                                                    if (c17893l == null) {
                                                        c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                    }
                                                    if (abstractC14971lLoadAd != null) {
                                                        c17893l.crashlytics(abstractC14971lLoadAd);
                                                        abstractC14971lLoadAd = null;
                                                    }
                                                    c17893l.crashlytics(abstractC14971l3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                                }
                            }
                            abstractC14971l2 = abstractC14971l2.f29456l;
                        }
                    }
                    c3654lMetrica = c3654lMetrica.license();
                    abstractC14971l2 = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
                }
                C6543l c6543l2 = (C6543l) abstractC14971l;
                if (c6543l2 != null) {
                    int iOrdinal2 = c6543l2.m2028l().ordinal();
                    if (iOrdinal2 == 0) {
                        return mopub(c6543l2, i);
                    }
                    if (iOrdinal2 == 1) {
                        return admob(c6543l2, i);
                    }
                    if (iOrdinal2 == 2) {
                        return 2;
                    }
                    if (iOrdinal2 != 3) {
                        C18725l.billing();
                        return 0;
                    }
                    int iAdmob = admob(c6543l2, i);
                    int i3 = iAdmob != 1 ? iAdmob : 0;
                    return i3 == 0 ? mopub(c6543l2, i) : i3;
                }
            }
        }
        return 1;
    }

    public static final boolean amazon(C6543l c6543l) {
        int iOrdinal = c6543l.m2028l().ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).getClass();
                c6543l.m2027l(EnumC11822l.f23649l, EnumC11822l.f23651l);
                return true;
            }
            if (iOrdinal != 3) {
                C18725l.billing();
                return false;
            }
        }
        return false;
    }

    public static final int billing(C6543l c6543l, int i) {
        int iOrdinal = c6543l.m2028l().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C6543l c6543lAmazon = AbstractC11156l.amazon(c6543l);
                if (c6543lAmazon == null) {
                    C8339l.metrica("ActiveParent with no focused child");
                    return 0;
                }
                int iBilling = billing(c6543lAmazon, i);
                if (iBilling == 1) {
                    iBilling = 0;
                }
                if (iBilling != 0) {
                    return iBilling;
                }
                if (!c6543l.f13658l) {
                    c6543l.f13658l = true;
                    try {
                        C15468l c15468lM2024l = c6543l.m2024l();
                        C4398l c4398l = new C4398l(i);
                        C15552l c15552l = (C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner();
                        C6543l c6543lBilling = c15552l.billing();
                        c15468lM2024l.firebase.invoke(c4398l);
                        C6543l c6543lBilling2 = c15552l.billing();
                        if (c4398l.loadAd) {
                            C6523l c6523l = C6523l.loadAd;
                            c6543l.f13658l = false;
                            return 2;
                        }
                        if (c6543lBilling == c6543lBilling2 || c6543lBilling2 == null) {
                            c6543l.f13658l = false;
                            return 1;
                        }
                        if (C6523l.amazon == C6523l.crashlytics) {
                            c6543l.f13658l = false;
                            return 2;
                        }
                        c6543l.f13658l = false;
                        return 3;
                    } catch (Throwable th) {
                        c6543l.f13658l = false;
                        throw th;
                    }
                }
            } else {
                if (iOrdinal == 2) {
                    return 2;
                }
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void crashlytics() {
        AbstractC5641l.purchase("Not in application's main thread", purchase());
    }

    public static void firebase(Runnable runnable) {
        if (purchase()) {
            runnable.run();
        } else {
            AbstractC5641l.purchase("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static final boolean isPro(C6543l c6543l, boolean z) {
        int iOrdinal = c6543l.m2028l().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C6543l c6543lAmazon = AbstractC11156l.amazon(c6543l);
                if (!(c6543lAmazon != null ? isPro(c6543lAmazon, z) : true)) {
                    return false;
                }
                c6543l.m2027l(EnumC11822l.f23650l, EnumC11822l.f23653l);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                C18725l.billing();
                return false;
            }
        }
        return true;
    }

    public static final void loadAd(int i, C6956l c6956l, InterfaceC17242l interfaceC17242l, String str, String str2, String str3, Function0 function0, boolean z) {
        int i2;
        Function0 function1;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(232455887);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c6956l2.billing(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l2.billing(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l2.billing(str3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l2.admob(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l2.mopub(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 131072 : 65536;
        }
        int i4 = i2;
        int i5 = 1;
        if (!c6956l2.m2127for(i4 & 1, (74899 & i4) != 74898)) {
            function1 = function0;
            c6956l2.m2124else();
        } else if (z) {
            c6956l2.m2123default(1606327746);
            AbstractC3383l.purchase(function0, interfaceC17242l, false, null, AbstractC13880l.purchase(((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.ads, 0L, c6956l2, 0, 14), null, null, AbstractC14566l.amazon(-1767705219, new Cprotected(str, str2, str3, 6), c6956l2), c6956l2, ((i4 >> 9) & 14) | 100663296 | ((i4 >> 12) & 112), 236);
            function1 = function0;
            c6956l2 = c6956l2;
            c6956l2.startapp(false);
        } else {
            function1 = function0;
            c6956l2.m2123default(1607967367);
            AbstractC13319l.yandex(AbstractC14566l.amazon(55612685, new C4210l(str2, i5), c6956l2), AbstractC9151l.loadAd(interfaceC17242l, false, null, function1, 15), null, AbstractC14566l.amazon(-1771445334, new C4210l(str3, i3), c6956l2), AbstractC14566l.amazon(482846857, new Cpublic(str, str2, 11), c6956l2), null, null, c6956l2, 27654, 484);
            c6956l2.startapp(false);
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4186l(i, interfaceC17242l, str, str2, str3, function1, z);
        }
    }

    public static final int mopub(C6543l c6543l, int i) {
        if (!c6543l.f13660l) {
            c6543l.f13660l = true;
            try {
                C15468l c15468lM2024l = c6543l.m2024l();
                C4398l c4398l = new C4398l(i);
                C15552l c15552l = (C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner();
                C6543l c6543lBilling = c15552l.billing();
                c15468lM2024l.isPro.invoke(c4398l);
                C6543l c6543lBilling2 = c15552l.billing();
                if (c4398l.loadAd) {
                    C6523l c6523l = C6523l.loadAd;
                    c6543l.f13660l = false;
                    return 2;
                }
                if (c6543lBilling != c6543lBilling2 && c6543lBilling2 != null) {
                    if (C6523l.amazon == C6523l.crashlytics) {
                        c6543l.f13660l = false;
                        return 2;
                    }
                    c6543l.f13660l = false;
                    return 3;
                }
                c6543l.f13660l = false;
            } catch (Throwable th) {
                c6543l.f13660l = false;
                throw th;
            }
        }
        return 1;
    }

    public static boolean purchase() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final void remoteconfig(C6323l c6323l, int i, Object obj, int i2, Object obj2) {
        int i3 = c6323l.remoteconfig - c6323l.admob[c6323l.subs - 1].crashlytics;
        Object[] objArr = c6323l.smaato;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void smaato(C6323l c6323l, int i, Object obj) {
        c6323l.smaato[(c6323l.remoteconfig - c6323l.admob[c6323l.subs - 1].crashlytics) + i] = obj;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01c1 A[PHI: r16
  0x01c1: PHI (r16v2 lْ٘ۖ) = (r16v1 lْ٘ۖ), (r16v1 lْ٘ۖ), (r16v1 lْ٘ۖ), (r16v4 lْ٘ۖ) binds: [B:95:0x016e, B:97:0x0174, B:99:0x0178, B:116:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x026b A[ADDED_TO_REGION, LOOP:9: B:162:0x026b->B:169:0x027d, LOOP_START, PHI: r14
  0x026b: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:161:0x0269, B:169:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x026d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0278 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x027a  */
    /* JADX WARN: Code duplicated, block: B:168:0x027c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0283  */
    /* JADX WARN: Code duplicated, block: B:173:0x028b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0297 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:214:0x01fd A[SYNTHETIC] */
    public static final boolean subs(C6543l c6543l) {
        C17893l c17893l;
        int i;
        C6543l c6543l2;
        EnumC11822l enumC11822l;
        C18289l c18289l;
        boolean z;
        C18289l c18289l2;
        C15552l c15552l = (C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner();
        C6543l c6543lBilling = c15552l.billing();
        EnumC11822l enumC11822lM2028l = c6543l.m2028l();
        if (c6543lBilling == c6543l) {
            c6543l.m2027l(enumC11822lM2028l, enumC11822lM2028l);
            return true;
        }
        if ((c6543lBilling == null || c6543lBilling.f13659l) && !c6543l.f13659l && !((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).yandex.m3776throws()) {
            return false;
        }
        if (c6543lBilling != null) {
            c17893l = new C17893l(0, new C6543l[16]);
            if (!c6543lBilling.f29454l.f29462l) {
                AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
            }
            AbstractC14971l abstractC14971l = c6543lBilling.f29454l.f29456l;
            C3654l c3654lMetrica = AbstractC5573l.metrica(c6543lBilling);
            while (c3654lMetrica != null) {
                if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 1024) != 0) {
                    while (abstractC14971l != null) {
                        if ((abstractC14971l.f29450l & 1024) != 0) {
                            AbstractC14971l abstractC14971lLoadAd = abstractC14971l;
                            C17893l c17893l2 = null;
                            while (abstractC14971lLoadAd != null) {
                                if (abstractC14971lLoadAd instanceof C6543l) {
                                    c17893l.crashlytics((C6543l) abstractC14971lLoadAd);
                                } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i2 = 0;
                                    for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                        if ((abstractC14971l2.f29450l & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                Unit unit = Unit.INSTANCE;
                                                abstractC14971lLoadAd = abstractC14971l2;
                                            } else {
                                                if (c17893l2 == null) {
                                                    c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l2.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l2.crashlytics(abstractC14971l2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
                            }
                        }
                        abstractC14971l = abstractC14971l.f29456l;
                    }
                }
                c3654lMetrica = c3654lMetrica.license();
                abstractC14971l = (c3654lMetrica == null || (c18289l2 = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l2.billing;
            }
        } else {
            c17893l = null;
        }
        Object[] objArr = new C6543l[16];
        Object[] objArr2 = new C6543l[16];
        if (!c6543l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l3 = c6543l.f29454l.f29456l;
        C3654l c3654lMetrica2 = AbstractC5573l.metrica(c6543l);
        boolean z2 = true;
        int i3 = 0;
        int i4 = 0;
        while (c3654lMetrica2 != null) {
            if ((((AbstractC14971l) c3654lMetrica2.f7703l.mopub).f29457l & 1024) != 0) {
                while (abstractC14971l3 != null) {
                    if ((abstractC14971l3.f29450l & 1024) != 0) {
                        AbstractC14971l abstractC14971lLoadAd2 = abstractC14971l3;
                        C17893l c17893l3 = null;
                        while (abstractC14971lLoadAd2 != null) {
                            if (abstractC14971lLoadAd2 instanceof C6543l) {
                                C6543l c6543l3 = (C6543l) abstractC14971lLoadAd2;
                                if (AbstractC8576l.yandex(c17893l != null ? Boolean.valueOf(c17893l.remoteconfig(c6543l3)) : null, Boolean.TRUE)) {
                                    int i5 = i3 + 1;
                                    if (objArr.length < i5) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i5, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i3] = c6543l3;
                                    i3 = i5;
                                } else {
                                    c15552l = c15552l;
                                    int i6 = i4 + 1;
                                    if (objArr2.length < i6) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i6, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i4] = c6543l3;
                                    i4 = i6;
                                }
                                if (c6543l3 == c6543lBilling) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                c15552l = c15552l;
                                z = true;
                            }
                            if (z && (abstractC14971lLoadAd2.f29450l & 1024) != 0 && (abstractC14971lLoadAd2 instanceof AbstractC11340l)) {
                                int i7 = 0;
                                for (AbstractC14971l abstractC14971l4 = ((AbstractC11340l) abstractC14971lLoadAd2).f22875l; abstractC14971l4 != null; abstractC14971l4 = abstractC14971l4.f29460l) {
                                    if ((abstractC14971l4.f29450l & 1024) != 0) {
                                        int i8 = i7 + 1;
                                        if (i8 == 1) {
                                            Unit unit2 = Unit.INSTANCE;
                                            abstractC14971lLoadAd2 = abstractC14971l4;
                                            i8 = i8;
                                        } else {
                                            C17893l c17893l4 = c17893l3 == null ? new C17893l(0, new AbstractC14971l[16]) : c17893l3;
                                            if (abstractC14971lLoadAd2 != null) {
                                                c17893l4.crashlytics(abstractC14971lLoadAd2);
                                                abstractC14971lLoadAd2 = null;
                                            }
                                            c17893l4.crashlytics(abstractC14971l4);
                                            c17893l3 = c17893l4;
                                        }
                                        i7 = i8;
                                    }
                                }
                                if (i7 != 1) {
                                    abstractC14971lLoadAd2 = AbstractC5573l.loadAd(c17893l3);
                                }
                            } else {
                                abstractC14971lLoadAd2 = AbstractC5573l.loadAd(c17893l3);
                            }
                        }
                    }
                    abstractC14971l3 = abstractC14971l3.f29456l;
                    c15552l = c15552l;
                }
            }
            C15552l c15552l2 = c15552l;
            c3654lMetrica2 = c3654lMetrica2.license();
            abstractC14971l3 = (c3654lMetrica2 == null || (c18289l = c3654lMetrica2.f7703l) == null) ? null : (C13924l) c18289l.billing;
            c15552l = c15552l2;
        }
        C15552l c15552l3 = c15552l;
        if (!z2 || c6543lBilling == null || isPro(c6543lBilling, false)) {
            AbstractC3700l.admob(c6543l, new C11029l(7, c6543l));
            int iOrdinal = c6543l.m2028l().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).subs(c6543l);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        C18725l.billing();
                        return false;
                    }
                    ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).subs(c6543l);
                }
            }
            EnumC11822l enumC11822l2 = EnumC11822l.f23653l;
            EnumC11822l enumC11822l3 = EnumC11822l.f23651l;
            if (z2 && c6543lBilling != null) {
                c6543lBilling.m2027l(enumC11822l3, enumC11822l2);
                Unit unit3 = Unit.INSTANCE;
            }
            EnumC11822l enumC11822l4 = EnumC11822l.f23650l;
            if (c17893l != null) {
                int i9 = c17893l.f34846l - 1;
                Object[] objArr5 = c17893l.f34848l;
                if (i9 < objArr5.length) {
                    while (i9 >= 0) {
                        C6543l c6543l4 = (C6543l) objArr5[i9];
                        if (c15552l3.billing() == c6543l) {
                            c6543l4.m2027l(enumC11822l4, enumC11822l2);
                            i9--;
                        }
                    }
                }
                Unit unit4 = Unit.INSTANCE;
                i = i4 - 1;
                if (i < objArr2.length) {
                    while (i >= 0) {
                        c6543l2 = (C6543l) objArr2[i];
                        if (c15552l3.billing() != c6543l) {
                            if (c6543l2 == c6543lBilling) {
                                enumC11822l = enumC11822l3;
                            } else {
                                enumC11822l = enumC11822l2;
                            }
                            c6543l2.m2027l(enumC11822l, enumC11822l4);
                            i--;
                        }
                    }
                    if (c15552l3.billing() == c6543l) {
                        c6543l.m2027l(enumC11822lM2028l, enumC11822l3);
                        if (c15552l3.billing() != c6543l) {
                            return true;
                        }
                    }
                } else if (c15552l3.billing() == c6543l) {
                    c6543l.m2027l(enumC11822lM2028l, enumC11822l3);
                    if (c15552l3.billing() != c6543l) {
                        return true;
                    }
                }
            } else {
                i = i4 - 1;
                if (i < objArr2.length) {
                    while (i >= 0) {
                        c6543l2 = (C6543l) objArr2[i];
                        if (c15552l3.billing() != c6543l) {
                            if (c6543l2 == c6543lBilling) {
                                enumC11822l = enumC11822l3;
                            } else {
                                enumC11822l = enumC11822l2;
                            }
                            c6543l2.m2027l(enumC11822l, enumC11822l4);
                            i--;
                        }
                    }
                    if (c15552l3.billing() == c6543l) {
                        c6543l.m2027l(enumC11822lM2028l, enumC11822l3);
                        if (c15552l3.billing() != c6543l) {
                            return true;
                        }
                    }
                } else if (c15552l3.billing() == c6543l) {
                    c6543l.m2027l(enumC11822lM2028l, enumC11822l3);
                    if (c15552l3.billing() != c6543l) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void yandex(AudioContentCard audioContentCard, Function0 function0, Function0 function1, boolean z, C6956l c6956l, int i) {
        int i2;
        String strMopub;
        String str;
        Object obj = audioContentCard.billing;
        c6956l.m2133new(-774847672);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(audioContentCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.mopub(z) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 1043) != 1042)) {
            int i3 = AbstractC13137l.yandex[audioContentCard.mopub.ordinal()];
            if (i3 == 1) {
                c6956l.m2123default(1962509579);
                boolean zBilling = c6956l.billing(obj);
                Object objM2132native = c6956l.m2132native();
                Object obj2 = C1867l.yandex;
                if (zBilling || objM2132native == obj2) {
                    objM2132native = (Podcast) ((C9554l) function0.invoke()).vip.get(audioContentCard.getYandex());
                    c6956l.m2147try(objM2132native);
                }
                Podcast podcast = (Podcast) objM2132native;
                if (podcast != null) {
                    String str2 = podcast.yandex;
                    c6956l.m2123default(1962662068);
                    boolean zBilling2 = c6956l.billing(obj);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zBilling2 || objM2132native2 == obj2) {
                        PodcastCover podcastCover = (PodcastCover) AbstractC16901l.m4217extends(podcast.billing);
                        objM2132native2 = podcastCover != null ? podcastCover.yandex("c") : null;
                        c6956l.m2147try(objM2132native2);
                    }
                    String str3 = (String) objM2132native2;
                    if (z && (str = audioContentCard.amazon) != null) {
                        str2 = str;
                    }
                    if (z) {
                        c6956l.m2123default(1962998449);
                        c6956l.startapp(false);
                        strMopub = audioContentCard.yandex;
                        if (strMopub == null) {
                            strMopub = podcast.purchase;
                        }
                    } else {
                        strMopub = AbstractC12900l.mopub(c6956l, -1599243956, R.string.ctx_podcast, c6956l, false);
                    }
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lFirebase = z ? AbstractC0080l.firebase(c4346l, 230.0f, 250.0f) : AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob = c6956l.admob(podcast);
                    Object objM2132native3 = c6956l.m2132native();
                    if (zAdmob || objM2132native3 == obj2) {
                        objM2132native3 = new C9636l(12, podcast);
                        c6956l.m2147try(objM2132native3);
                    }
                    loadAd((i2 << 3) & 57344, c6956l, interfaceC17242lFirebase, str3, str2, strMopub, (Function0) objM2132native3, z);
                } else {
                    c6956l.m2123default(1960846522);
                }
                c6956l.startapp(false);
                c6956l.startapp(false);
            } else {
                if (i3 != 2) {
                    throw AbstractC12900l.billing(-1599263494, c6956l, false);
                }
                c6956l.m2123default(1963471168);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5485l(audioContentCard, function0, function1, z, i);
        }
    }
}
