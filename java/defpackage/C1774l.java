package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُؙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1774l extends AbstractC11801l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final InterfaceC13238l f4195l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final long f4196l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f4197l;

    public C1774l() {
        super(0);
        this.f4196l = AbstractC12953l.amazon(4293083434L);
        this.f4197l = AbstractC8020l.smaato(m1045public());
        List listSingletonList = Collections.singletonList(new C17386l(R.drawable.ic_door_arrow_right_outline_28, R.string.auth2_acc_manager_entry_title, R.string.auth2_acc_manager_entry_text, null, new C11646l(this, 11), 24));
        List listRemoteconfig = AbstractC14055l.remoteconfig(new C17386l(R.drawable.ic_users_outline_28, R.string.nmenu_profiles, R.string.nmenu_profiles_desc, null, new C11646l(this, 14), 24), new C17386l(R.drawable.ic_archive_outline_28, R.string.nmenu_catalogs, R.string.nmenu_catalogs_desc, null, new C11646l(this, 0), 24), new C17386l(R.drawable.ic_statistics_outline_28, R.string.rec_screen, R.string.rec_screen_desc, null, new C11646l(this, 1), 24), new C17386l(R.drawable.ic_podcast_outline_28, R.string.nmenu_podcasts, R.string.nmenu_podcasts_desc, null, new C11646l(this, 2), 24), new C17386l(R.drawable.ic_play_cards_2_outline_28, R.string.snippets, 0, null, new C11646l(this, 3), 28));
        List listRemoteconfig2 = AbstractC14055l.remoteconfig(new C17386l(R.drawable.ic_smartphone_outline_28, R.string.nmenu_local, R.string.nmenu_local_desc, null, new C11646l(this, 4), 24), new C17386l(R.drawable.ic_help_outline_28, R.string.quickfix_title, R.string.quickfix_description, null, new C11646l(this, 5), 24), new C17386l(R.drawable.ic_services_outline_28, R.string.account_category, R.string.account_category_desc, null, new C11646l(this, 6), 24), new C17386l(R.drawable.ic_settings_outline_28, R.string.nmenu_prefs, R.string.nmenu_prefs_desc, null, new C11646l(this, 7), 24), new C17386l(R.drawable.ic_info_outline_28, R.string.nmenu_about, 0, "VK X 8.14.1_pub (100136)", new C11646l(this, 12), 20));
        SharedPreferences sharedPreferences = AbstractC3630l.yandex;
        this.f4195l = AbstractC0509l.purchase(AbstractC16901l.m4232new(AbstractC16901l.m4232new(AbstractC16901l.m4232new(listSingletonList, listRemoteconfig), listRemoteconfig2), AbstractC3630l.yandex(EnumC14530l.f28443l) ? Collections.singletonList(new C17386l(R.drawable.ic_bug_outline_28, R.string.dbg_title, 0, "", new C11646l(this, 13), 20)) : C2580l.f5619l));
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static C14288l m1045public() {
        C16287l.yandex.getClass();
        String strAmazon = C16287l.amazon();
        String str = "@id" + C16287l.crashlytics();
        C7644l c7644l = VKXApplication.f36633l;
        if (c7644l == null) {
            c7644l = null;
        }
        return new C14288l(strAmazon, str, ((C4645l) c7644l.f15735l).isPro);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m1046abstract(final boolean z, final int i, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i2) {
        c6956l.m2133new(-1275633405);
        int i3 = i2 | (c6956l.mopub(z) ? 4 : 2) | (c6956l.amazon(i) ? 32 : 16) | (c6956l.admob(this) ? 2048 : 1024);
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            final int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            AbstractC3383l.amazon(interfaceC17242l, null, null, null, null, AbstractC14566l.amazon(1099472759, new Function3() { // from class: lٕٓۛ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C6956l c6956l2 = (C6956l) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                        long j = c6956l2.f14595continue;
                        int i4 = (int) (j ^ (j >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l = C3438l.loadAd;
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                        AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
                        AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                        Boolean boolValueOf = Boolean.valueOf(z);
                        int i5 = iAdmob;
                        boolean zAmazon = c6956l2.amazon(i5);
                        Object objM2132native = c6956l2.m2132native();
                        if (zAmazon || objM2132native == C1867l.yandex) {
                            objM2132native = new C2221l(i5, 1);
                            c6956l2.m2147try(objM2132native);
                        }
                        final C1774l c1774l = this;
                        final int i6 = i;
                        AbstractC7741l.loadAd(boolValueOf, null, (Function1) objM2132native, null, "", null, AbstractC14566l.amazon(-247237120, new Function4() { // from class: lٔۨؐ
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v2 */
                            /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r0v6 */
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                ?? r0;
                                C6956l c6956l3;
                                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                C6956l c6956l4 = (C6956l) obj6;
                                ((Integer) obj7).getClass();
                                C4346l c4346l = C4346l.f8873l;
                                if (zBooleanValue) {
                                    c6956l4.m2123default(427908232);
                                    AbstractC4332l.amazon(AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), 0L, 0L, 0, 0.0f, c6956l4, 6, 30);
                                    c6956l4.startapp(false);
                                } else {
                                    c6956l4.m2123default(428066270);
                                    C0086l c0086l = C18450l.f36040l;
                                    C7537l c7537l = new C7537l(4.0f, true, new C8339l(12));
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C1774l c1774l2 = c1774l;
                                    boolean zAdmob = c6956l4.admob(c1774l2);
                                    int i7 = i6;
                                    boolean zAmazon2 = zAdmob | c6956l4.amazon(i7);
                                    Object objM2132native2 = c6956l4.m2132native();
                                    if (zAmazon2 || objM2132native2 == C1867l.yandex) {
                                        objM2132native2 = new C8803l(c1774l2, i7, 0);
                                        c6956l4.m2147try(objM2132native2);
                                    }
                                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), 16.0f);
                                    C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l4, 54);
                                    long j2 = c6956l4.f14595continue;
                                    int i8 = (int) (j2 ^ (j2 >>> 32));
                                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, interfaceC17242lSmaato);
                                    InterfaceC8801l.firebase.getClass();
                                    C16395l c16395l2 = C3438l.loadAd;
                                    c6956l4.m2140super();
                                    if (c6956l4.f14603switch) {
                                        c6956l4.firebase(c16395l2);
                                    } else {
                                        c6956l4.m2136protected();
                                    }
                                    AbstractC8182l.billing(c6956l4, c5062lYandex, C3438l.mopub);
                                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, C3438l.billing);
                                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i8), C3438l.isPro);
                                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, C3438l.amazon);
                                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_notifications_28, 0, c6956l4), null, AbstractC0080l.isPro(c4346l, 20.0f), 0L, c6956l4, 440, 8);
                                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.spark_inbox), AbstractC3605l.vip(new C9247l(1.0f, true), 8.0f, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262140);
                                    C6956l c6956l5 = c6956l4;
                                    if (i7 > 0) {
                                        c6956l5.m2123default(1203248001);
                                        C10707l c10707l = AbstractC16964l.yandex;
                                        AbstractC11621l.loadAd(null, ((C14370l) c6956l5.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l5.isPro(c10707l)).yandex.adcel, AbstractC14566l.amazon(-1648602704, new C8821l(i7, 2), c6956l5), c6956l5, 3072);
                                        c6956l3 = c6956l5;
                                        r0 = 0;
                                    } else {
                                        r0 = 0;
                                        c6956l5.m2123default(1182897834);
                                        c6956l3 = c6956l5;
                                    }
                                    c6956l3.startapp(r0);
                                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_right, r0, c6956l3), null, AbstractC0080l.isPro(c4346l, 20.0f), 0L, c6956l3, 440, 8);
                                    c6956l3.startapp(true);
                                    c6956l3.startapp(r0);
                                }
                                return Unit.INSTANCE;
                            }
                        }, c6956l2), c6956l2, 1597440, 42);
                        c6956l2.startapp(true);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 196614, 30);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9607l(this, z, i, interfaceC17242l, i2, 0);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m1047import(final C15578l c15578l, final String str, final String str2, final InterfaceC17242l interfaceC17242l, final InterfaceC6347l interfaceC6347l, final long j, final long j2, final Function0 function0, C6956l c6956l, final int i) {
        int i2;
        c6956l.m2133new(-1767554794);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c15578l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(str2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(interfaceC6347l) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= c6956l.purchase(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.purchase(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.admob(function0) ? 8388608 : 4194304;
        }
        if (c6956l.m2127for(i2 & 1, (4793491 & i2) != 4793490)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            int i3 = i2 >> 9;
            AbstractC3383l.yandex(interfaceC17242l, interfaceC6347l, AbstractC13880l.yandex(j, 0L, 0L, 0L, c6956l, (i2 >> 15) & 14, 14), null, AbstractC2576l.yandex(1.0f, j2), AbstractC14566l.amazon(1243329416, new C11223l(function0, c15578l, str, str2, 3), c6956l), c6956l, (i3 & 14) | 196608 | (i3 & 112), 8);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٔۚٗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f29711l.m1047import(c15578l, str, str2, interfaceC17242l, interfaceC6347l, j, j2, function0, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m1048instanceof(int i, int i2, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        long j;
        long jMopub;
        long jMopub2;
        int i3;
        c6956l.m2133new(-922431132);
        int i4 = i2 | (c6956l.amazon(AbstractC5020l.inmobi(i)) ? 4 : 2) | (c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i5 = 0;
        if (c6956l.m2127for(i4 & 1, (i4 & 147) != 146)) {
            int iInmobi = AbstractC5020l.inmobi(i);
            long j2 = this.f4196l;
            if (iInmobi == 0) {
                c6956l.m2123default(-1693048142);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                c6956l.startapp(false);
            } else if (iInmobi == 1) {
                c6956l.m2123default(-1693045813);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex;
                c6956l.startapp(false);
            } else {
                if (iInmobi != 2) {
                    throw AbstractC12900l.billing(-1693050622, c6956l, false);
                }
                c6956l.m2123default(-1693044494);
                c6956l.startapp(false);
                j = j2;
            }
            int iInmobi2 = AbstractC5020l.inmobi(i);
            if (iInmobi2 == 0) {
                c6956l.m2123default(-1693040142);
                jMopub = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                c6956l.startapp(false);
            } else if (iInmobi2 == 1) {
                c6956l.m2123default(-1693037790);
                jMopub = AbstractC15038l.mopub(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, 48.0f);
                c6956l.startapp(false);
            } else {
                if (iInmobi2 != 2) {
                    throw AbstractC12900l.billing(-1693042527, c6956l, false);
                }
                c6956l.m2123default(-1693035221);
                jMopub = AbstractC17195l.yandex(j2, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp, 48.0f);
                c6956l.startapp(false);
            }
            int iInmobi3 = AbstractC5020l.inmobi(i);
            if (iInmobi3 == 0) {
                c6956l.m2123default(-1693029013);
                jMopub2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                c6956l.startapp(false);
            } else if (iInmobi3 == 1) {
                c6956l.m2123default(-1693026879);
                jMopub2 = AbstractC15038l.mopub(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, 2.0f);
                c6956l.startapp(false);
            } else {
                if (iInmobi3 != 2) {
                    throw AbstractC12900l.billing(-1693031400, c6956l, false);
                }
                c6956l.m2123default(-1693024342);
                jMopub2 = AbstractC17195l.yandex(j2, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp, 2.0f);
                c6956l.startapp(false);
            }
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.bc_v2_m_title);
            int iInmobi4 = AbstractC5020l.inmobi(i);
            if (iInmobi4 == 0) {
                i3 = R.string.bc_v2_m_desc_unload;
            } else if (iInmobi4 == 1) {
                i3 = R.string.bc_v2_m_desc_paid;
            } else {
                if (iInmobi4 != 2) {
                    C18725l.billing();
                    return;
                }
                i3 = R.string.bc_v2_m_desc_unpaid;
            }
            String strPurchase2 = AbstractC11999l.purchase(c6956l, i3);
            C6839l c6839l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
            C15578l c15578lAmazon = AbstractC14566l.amazon(2046941952, new C7248l(j, i5), c6956l);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C11646l(this, 10);
                c6956l.m2147try(objM2132native);
            }
            m1047import(c15578lAmazon, strPurchase, strPurchase2, interfaceC17242l, c6839l, jMopub2, jMopub, (Function0) objM2132native, c6956l, ((i4 << 18) & 234881024) | 3078);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(this, i, interfaceC17242l, i2, 0);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(344978497);
        int i2 = 2;
        int i3 = i | (c6956l.admob(this) ? 4 : 2);
        int i4 = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon((C7549l) AbstractC16584l.yandex().billing.purchase, c6956l, 0);
            InterfaceC8714l interfaceC8714lAmazon2 = AbstractC3700l.amazon((C7549l) AbstractC16584l.yandex().billing.admob, c6956l, 0);
            InterfaceC8714l interfaceC8714lAmazon3 = AbstractC3700l.amazon((C7549l) AbstractC16584l.yandex().billing.mopub, c6956l, 0);
            InterfaceC2752l interfaceC2752l = (InterfaceC2752l) c6956l.isPro(AbstractC4751l.purchase);
            InterfaceC3393l interfaceC3393l = (InterfaceC3393l) interfaceC8714lAmazon.getValue();
            C2675l c2675l = C2675l.yandex;
            if (!AbstractC8576l.yandex(interfaceC3393l, c2675l) || !((Boolean) interfaceC8714lAmazon2.getValue()).booleanValue()) {
                i2 = AbstractC8576l.yandex(interfaceC3393l, c2675l) ? 3 : 1;
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1140133379, new C7599l(this, interfaceC2752l, i2, i4), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1053334510, new C0325l(this, i2, interfaceC8714lAmazon3), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3369l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        InterfaceC14029l interfaceC14029l = null;
        C14951l c14951l = new C14951l(this, interfaceC14029l, 1);
        C8490l c8490l = AbstractC6025l.yandex;
        C2347l c2347l = new C2347l(new C13900l(AbstractC6025l.loadAd, 0), new C12086l(c14951l, interfaceC14029l, 4), 2);
        C5268l c5268l = this.f34614l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, EnumC8981l.f18524l), AbstractC11738l.yandex(c5268l));
    }
}
