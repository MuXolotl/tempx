package defpackage;

import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;

/* JADX INFO: renamed from: lُٜٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11156l {
    public static final C15578l yandex = new C15578l(2082897701, false, new C4076l(15));
    public static final C15578l loadAd = new C15578l(1831944384, false, new C4076l(16));
    public static final C15578l crashlytics = new C15578l(-1010154403, false, new C4076l(17));
    public static final C15578l amazon = new C15578l(-1281679801, false, new C4076l(18));
    public static final C15578l purchase = new C15578l(-1675007031, false, new C4076l(19));
    public static final C15578l billing = new C15578l(-952736392, false, new C4076l(20));
    public static final C15578l mopub = new C15578l(-2019028860, false, new C3817l(27));

    public static final C6543l amazon(C6543l c6543l) {
        boolean z = c6543l.f29454l.f29462l;
        if (z) {
            if (!z) {
                AbstractC0081l.crashlytics("visitChildren called on an unattached node");
            }
            C17893l c17893l = new C17893l(0, new AbstractC14971l[16]);
            AbstractC14971l abstractC14971l = c6543l.f29454l;
            AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
            if (abstractC14971l2 == null) {
                AbstractC5573l.yandex(c17893l, abstractC14971l);
            } else {
                c17893l.crashlytics(abstractC14971l2);
            }
            while (true) {
                int i = c17893l.f34846l;
                if (i == 0) {
                    break;
                }
                AbstractC14971l abstractC14971lLoadAd = (AbstractC14971l) c17893l.vip(i - 1);
                if ((abstractC14971lLoadAd.f29457l & 1024) == 0) {
                    AbstractC5573l.yandex(c17893l, abstractC14971lLoadAd);
                } else {
                    while (abstractC14971lLoadAd != null) {
                        if ((abstractC14971lLoadAd.f29450l & 1024) != 0) {
                            C17893l c17893l2 = null;
                            while (abstractC14971lLoadAd != null) {
                                if (abstractC14971lLoadAd instanceof C6543l) {
                                    C6543l c6543l2 = (C6543l) abstractC14971lLoadAd;
                                    if (c6543l2.f29454l.f29462l) {
                                        int iOrdinal = c6543l2.m2028l().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return c6543l2;
                                        }
                                        if (iOrdinal != 3) {
                                            C18725l.billing();
                                            return null;
                                        }
                                    }
                                } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i2 = 0;
                                    for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                        if ((abstractC14971l3.f29450l & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                abstractC14971lLoadAd = abstractC14971l3;
                                            } else {
                                                if (c17893l2 == null) {
                                                    c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l2.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l2.crashlytics(abstractC14971l3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
                            }
                            break;
                        }
                        abstractC14971lLoadAd = abstractC14971lLoadAd.f29460l;
                    }
                }
            }
        }
        return null;
    }

    public static final C8896l crashlytics(C6543l c6543l) {
        AbstractC18026l abstractC18026l;
        if (c6543l.f29462l && (abstractC18026l = c6543l.f29452l) != null) {
            InterfaceC18212l interfaceC18212lCrashlytics = AbstractC9690l.crashlytics(abstractC18026l);
            if (!interfaceC18212lCrashlytics.mopub()) {
                interfaceC18212lCrashlytics = null;
            }
            if (interfaceC18212lCrashlytics != null) {
                return c6543l.m2029l(interfaceC18212lCrashlytics);
            }
        }
        return C8896l.purchase;
    }

    public static final C6543l loadAd(C6543l c6543l) {
        C6543l c6543lBilling = ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).billing();
        if (c6543lBilling == null || !c6543lBilling.f29462l) {
            return null;
        }
        return c6543lBilling;
    }

    public static final boolean purchase(C6543l c6543l) {
        C3654l c3654l;
        AbstractC18026l abstractC18026l;
        C3654l c3654l2;
        AbstractC18026l abstractC18026l2 = c6543l.f29452l;
        return (abstractC18026l2 == null || (c3654l = abstractC18026l2.f35281l) == null || !c3654l.m1389private() || (abstractC18026l = c6543l.f29452l) == null || (c3654l2 = abstractC18026l.f35281l) == null || !c3654l2.m1386native()) ? false : true;
    }

    public static final void yandex(AudioFollowingsUpdateInfo audioFollowingsUpdateInfo, Function0 function0, C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(-627387990);
        int i2 = (c6956l.admob(audioFollowingsUpdateInfo) ? 4 : 2) | i | (c6956l.admob(function0) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC3383l.amazon(AbstractC0080l.amazon(AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2), 1.0f), null, AbstractC13880l.purchase(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads, 0L, c6956l, 0, 14), null, null, AbstractC14566l.amazon(-877443146, new C7442l(audioFollowingsUpdateInfo, function0, 8), c6956l), c6956l, 196614, 26);
            c6956l2 = c6956l;
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(audioFollowingsUpdateInfo, function0, i, 15);
        }
    }

    public abstract long billing();
}
