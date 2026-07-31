package defpackage;

import android.text.format.Formatter;
import androidx.recyclerview.widget.RecyclerView;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۣؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0675l extends AbstractC11801l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f2147l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f2148l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f2149l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f2150l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f2151l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f2152l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f2153l;

    public C0675l() {
        super(0);
        this.f2151l = AbstractC11990l.loadAd();
        this.f2152l = AbstractC8020l.smaato(null);
        this.f2150l = AbstractC8020l.smaato(null);
        this.f2149l = AbstractC8020l.smaato(URLDecoder.decode(C8994l.yandex.yandex(), "UTF-8"));
        Boolean bool = Boolean.FALSE;
        this.f2148l = AbstractC8020l.smaato(bool);
        this.f2147l = AbstractC8020l.smaato(bool);
        this.f2153l = AbstractC8020l.smaato(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static final Object m664instanceof(C0675l c0675l, AbstractC0283l abstractC0283l) throws Throwable {
        C5497l c5497l;
        c0675l.getClass();
        if (abstractC0283l instanceof C5497l) {
            c5497l = (C5497l) abstractC0283l;
            int i = c5497l.f11751l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5497l.f11751l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5497l = new C5497l(c0675l, abstractC0283l);
            }
        } else {
            c5497l = new C5497l(c0675l, abstractC0283l);
        }
        Object objFirebase = c5497l.f11752l;
        int i2 = c5497l.f11751l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            C16552l c16552l = AbstractC11463l.yandex;
            ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
            C13458l c13458l = new C13458l(c0675l, null);
            c5497l.f11753l = c0675l;
            c5497l.f11751l = 1;
            objFirebase = AbstractC10999l.firebase(executorC6708l, c13458l, c5497l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0675l = c5497l.f11753l;
            AbstractC2829l.crashlytics(objFirebase);
        }
        c0675l.f2152l.setValue((C8147l) objFirebase);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m665abstract(final C8147l c8147l, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        int i2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(476064133);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (c6956l2.billing(c8147l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l2.admob(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l2.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l2.admob(this) ? 2048 : 1024;
        }
        if (c6956l2.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            C10707l c10707l = AbstractC16964l.yandex;
            final long jMopub = AbstractC15038l.mopub(((C14370l) c6956l2.isPro(c10707l)).yandex, 8.0f);
            final long jFirebase = AbstractC12953l.firebase(C9735l.loadAd(0.35f, ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex), ((C14370l) c6956l2.isPro(c10707l)).yandex.startapp);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(12.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            C12654l c12654lYandex = AbstractC13880l.yandex(((C14370l) c6956l2.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l, 0, 14);
            c6956l2 = c6956l;
            AbstractC3383l.amazon(interfaceC17242lAmazon, null, c12654lYandex, null, null, AbstractC14566l.amazon(1813427419, new Function3() { // from class: lۣٔؖ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j2;
                    long j3;
                    C6956l c6956l3 = (C6956l) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    byte b = 0;
                    if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final C8147l c8147l2 = c8147l;
                        boolean zBilling = c6956l3.billing(c8147l2);
                        final long j4 = jFirebase;
                        boolean zPurchase = zBilling | c6956l3.purchase(j4);
                        final long j5 = jMopub;
                        boolean zPurchase2 = zPurchase | c6956l3.purchase(j5);
                        Object objM2132native = c6956l3.m2132native();
                        if (zPurchase2 || objM2132native == C1867l.yandex) {
                            Function1 function2 = new Function1() { // from class: lؘؒٚ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj4;
                                    C8147l c8147l3 = c8147l2;
                                    float f = c8147l3.mopub;
                                    Object obj5 = c8147l3.yandex.f17097l;
                                    float fMin = Math.min(1.0f, f / ((Number) obj5).longValue());
                                    float fMin2 = Math.min(1.0f, (c8147l3.mopub - c8147l3.billing) / ((Number) obj5).longValue());
                                    AbstractC9361l.metrica(interfaceC13349l, j4, 0L, C14174l.yandex(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) * fMin, interfaceC13349l.admob()), 0.0f, null, null, 0, 122);
                                    AbstractC9361l.metrica(interfaceC13349l, j5, 0L, C14174l.yandex(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) * fMin2, interfaceC13349l.admob()), 0.0f, null, null, 0, 122);
                                    return Unit.INSTANCE;
                                }
                            };
                            j2 = j4;
                            j3 = j5;
                            c6956l3.m2147try(function2);
                            objM2132native = function2;
                        } else {
                            j2 = j4;
                            j3 = j5;
                        }
                        C4346l c4346l2 = C4346l.f8873l;
                        InterfaceC17242l interfaceC17242lIsPro = AbstractC14289l.isPro(c4346l2, (Function1) objM2132native);
                        C1853l c1853lYandex2 = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l3, 0);
                        long j6 = c6956l3.f14595continue;
                        int i5 = (int) (j6 ^ (j6 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lIsPro);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l2 = C3438l.loadAd;
                        c6956l3.m2140super();
                        if (c6956l3.f14603switch) {
                            c6956l3.firebase(c16395l2);
                        } else {
                            c6956l3.m2136protected();
                        }
                        C6415l c6415l = C3438l.mopub;
                        AbstractC8182l.billing(c6956l3, c1853lYandex2, c6415l);
                        C6415l c6415l2 = C3438l.billing;
                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, c6415l2);
                        Integer numValueOf = Integer.valueOf(i5);
                        C6415l c6415l3 = C3438l.isPro;
                        AbstractC8182l.billing(c6956l3, numValueOf, c6415l3);
                        C11192l c11192l = C3438l.firebase;
                        AbstractC8182l.purchase(c6956l3, c11192l);
                        C6415l c6415l4 = C3438l.amazon;
                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, c6415l4);
                        C0675l c0675l = this;
                        C15578l c15578lAmazon = AbstractC14566l.amazon(1259298980, new C3081l(c0675l, 11, b), c6956l3);
                        int i6 = AbstractC15548l.yandex;
                        AbstractC13319l.yandex(AbstractC1383l.f3537for, null, null, c15578lAmazon, null, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l3, 510), c6956l3, 3078, 438);
                        InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l2, 16.0f, 0.0f, 2);
                        C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36016l, c6956l3, 48);
                        long j7 = c6956l3.f14595continue;
                        int i7 = (int) (j7 ^ (j7 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l3.smaato();
                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l3, interfaceC17242lVip);
                        c6956l3.m2140super();
                        if (c6956l3.f14603switch) {
                            c6956l3.firebase(c16395l2);
                        } else {
                            c6956l3.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l3, c5062lYandex, c6415l);
                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato3, c6415l2);
                        AbstractC11043l.isPro(i7, c6956l3, c6415l3, c6956l3, c11192l);
                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling3, c6415l4);
                        c6956l3.m2123default(-2134849081);
                        C18734l c18734l = new C18734l();
                        C10707l c10707l2 = AbstractC16964l.yandex;
                        int iPurchase = c18734l.purchase(new C14264l(((C14370l) c6956l3.isPro(c10707l2)).yandex.adcel, AbstractC7039l.isPro(32), C6886l.f14420l, null, null, AbstractC1193l.loadAd, null, 0L, null, null, null, 0L, null, null, 65496));
                        try {
                            c18734l.crashlytics(Formatter.formatFileSize(c0675l.f34617l, c8147l2.billing));
                            Unit unit = Unit.INSTANCE;
                            c18734l.amazon(iPurchase);
                            c18734l.crashlytics(" ");
                            c18734l.crashlytics(AbstractC11999l.purchase(c6956l3, R.string.storage_new_used));
                            C3625l c3625lBilling = c18734l.billing();
                            c6956l3.startapp(false);
                            AbstractC13010l.crashlytics(c3625lBilling, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c6956l3, 0, 0, 524286);
                            c6956l3.startapp(true);
                            AbstractC9334l.yandex(c6956l3, AbstractC0080l.purchase(c4346l2, 4.0f));
                            C7537l c7537l = new C7537l(12.0f, true, new C8339l(12));
                            InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(c4346l2, 16.0f, 0.0f, 2);
                            C5062l c5062lYandex2 = AbstractC7001l.yandex(c7537l, C18450l.f36044l, c6956l3, 6);
                            long j8 = c6956l3.f14595continue;
                            int i8 = (int) (j8 ^ (j8 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato4 = c6956l3.smaato();
                            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l3, interfaceC17242lVip2);
                            c6956l3.m2140super();
                            if (c6956l3.f14603switch) {
                                c6956l3.firebase(c16395l2);
                            } else {
                                c6956l3.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l3, c5062lYandex2, c6415l);
                            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato4, c6415l2);
                            AbstractC11043l.isPro(i8, c6956l3, c6415l3, c6956l3, c11192l);
                            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling4, c6415l4);
                            c0675l.m666import(j2, AbstractC11999l.purchase(c6956l3, R.string.storage_new_legend_vkx), c6956l3, 0);
                            c0675l.m666import(j3, AbstractC11999l.purchase(c6956l3, R.string.storage_new_legend_others), c6956l3, 0);
                            c0675l.m666import(((C14370l) c6956l3.isPro(c10707l2)).yandex.vip, AbstractC11999l.purchase(c6956l3, R.string.storage_new_legend_free), c6956l3, 0);
                            c6956l3.startapp(true);
                            AbstractC9334l.yandex(c6956l3, AbstractC0080l.purchase(c4346l2, 16.0f));
                            c6956l3.startapp(true);
                        } catch (Throwable th) {
                            c18734l.amazon(iPurchase);
                            throw th;
                        }
                    } else {
                        c6956l3.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l2), c6956l2, 196614, 26);
            AbstractC3383l.yandex(null, null, null, null, null, AbstractC14566l.amazon(-1552133475, new C15272l(c8147l, function1, function0, i3), c6956l2), c6956l2, 196608, 31);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(this, c8147l, function0, function1, i, 12);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m666import(long j, String str, C6956l c6956l, int i) {
        c6956l.m2133new(-1139162406);
        int i2 = i | (c6956l.purchase(j) ? 4 : 2) | (c6956l.billing(str) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i3 = (int) ((j2 >>> 32) ^ j2);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C6839l c6839l = AbstractC7497l.yandex;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(c4346l, c6839l);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.isPro(AbstractC17551l.loadAd(interfaceC17242lCrashlytics, 1.0f, ((C14370l) c6956l.isPro(c10707l)).yandex.signatures, c6839l), 18.0f), j, AbstractC16837l.yandex), c6956l, 0);
            AbstractC13010l.loadAd(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.smaato, c6956l, (i2 >> 3) & 14, 0, 131070);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2050l(this, j, str, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        Object obj;
        ?? r1;
        int i2;
        C13863l c13863l;
        C6956l c6956l2;
        C13863l c13863l2;
        C6956l c6956l3;
        C6956l c6956l4;
        Object obj2;
        Object obj3;
        Object obj4;
        C6956l c6956l5 = c6956l;
        c6956l5.m2133new(2021450541);
        int i3 = 2;
        int i4 = i | (c6956l5.admob(this) ? 4 : 2);
        byte b = 0;
        int i5 = 1;
        if (c6956l5.m2127for(i4 & 1, (i4 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l5);
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l5);
            InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon((C7549l) AbstractC16584l.yandex().billing.admob, c6956l5, 0);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l5.admob(this);
            Object objM2132native = c6956l5.m2132native();
            C13863l c13863l3 = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l3) {
                obj = objM2132native;
                C7052l c7052l = new C7052l(this, (InterfaceC14029l) null, i5);
                c6956l5.m2147try(c7052l);
                obj = c7052l;
            }
            AbstractC12311l.amazon(c6956l5, unit, (Function2) obj);
            if (((Boolean) this.f2147l.getValue()).booleanValue()) {
                c6956l5.m2123default(1297316486);
                boolean zAdmob2 = c6956l5.admob(this);
                Object objM2132native2 = c6956l5.m2132native();
                if (zAdmob2 || objM2132native2 == c13863l3) {
                    obj4 = objM2132native2;
                    C2579l c2579l = new C2579l(this, 5);
                    c6956l5.m2147try(c2579l);
                    obj4 = c2579l;
                }
                i2 = 1;
                r1 = 0;
                c13863l = c13863l3;
                AbstractC16291l.yandex((Function0) obj4, AbstractC14566l.amazon(1719913216, new C3081l(this, i5, b), c6956l5), null, null, AbstractC1383l.loadAd, AbstractC1383l.crashlytics, AbstractC14566l.amazon(-1060617125, new C3081l(this, i3, b), c6956l5), null, 0L, 0L, 0L, 0L, null, c6956l, 1794096, 0, 16268);
                c6956l2 = c6956l;
            } else {
                r1 = 0;
                i2 = 1;
                c13863l = c13863l3;
                c6956l5.m2123default(1289934549);
                c6956l2 = c6956l5;
            }
            c6956l2.startapp(r1);
            if (((Boolean) this.f2148l.getValue()).booleanValue()) {
                c6956l2.m2123default(1300679242);
                Object objM2132native3 = c6956l2.m2132native();
                C13863l c13863l4 = c13863l;
                if (objM2132native3 == c13863l4) {
                    obj3 = objM2132native3;
                    C8688l c8688l = AbstractC0085l.yandex;
                    AbstractC0085l abstractC0085lLoadAd = AbstractC8182l.loadAd();
                    c6956l2.m2147try(abstractC0085lLoadAd);
                    obj3 = abstractC0085lLoadAd;
                }
                obj3 = objM2132native3;
                AbstractC0085l abstractC0085l = (AbstractC0085l) obj3;
                Object objM2132native4 = c6956l2.m2132native();
                Object obj5 = objM2132native4;
                if (objM2132native4 == c13863l4) {
                    AbstractC0085l abstractC0085l2 = (AbstractC0085l) ((List) AbstractC0085l.yandex.getValue()).get((abstractC0085l instanceof C2659l ? 1 : 0) ^ i2);
                    c6956l2.m2147try(abstractC0085l2);
                    obj5 = abstractC0085l2;
                }
                AbstractC0085l abstractC0085l3 = (AbstractC0085l) obj5;
                boolean zAdmob3 = c6956l2.admob(this);
                Object objM2132native5 = c6956l2.m2132native();
                Object obj6 = objM2132native5;
                if (zAdmob3 || objM2132native5 == c13863l4) {
                    C2579l c2579l2 = new C2579l(this, r1);
                    c6956l2.m2147try(c2579l2);
                    obj6 = c2579l2;
                }
                c13863l2 = c13863l4;
                AbstractC16291l.yandex((Function0) obj6, AbstractC14566l.amazon(311365687, new C3081l(this, 3, r1), c6956l2), null, AbstractC14566l.amazon(-1654621067, new C3081l(this, 4, r1), c6956l2), AbstractC1383l.firebase, AbstractC1383l.smaato, AbstractC14566l.amazon(-308633902, new C2736l(abstractC0085l, abstractC0085l3, 9), c6956l2), null, 0L, 0L, 0L, 0L, null, c6956l, 1797168, 0, 16260);
                c6956l3 = c6956l;
            } else {
                c13863l2 = c13863l;
                c6956l2.m2123default(1289934549);
                c6956l3 = c6956l2;
            }
            c6956l3.startapp(r1);
            if (((Boolean) this.f2153l.getValue()).booleanValue()) {
                c6956l3.m2123default(1302240154);
                boolean zAdmob4 = c6956l3.admob(this);
                Object objM2132native6 = c6956l3.m2132native();
                if (zAdmob4 || objM2132native6 == c13863l2) {
                    obj2 = objM2132native6;
                    C2579l c2579l3 = new C2579l(this, 1);
                    c6956l3.m2147try(c2579l3);
                    obj2 = c2579l3;
                }
                AbstractC16291l.yandex((Function0) obj2, AbstractC14566l.amazon(504296888, new C3081l(this, 5, r1), c6956l3), null, AbstractC14566l.amazon(-1461689866, new C3081l(this, 6, r1), c6956l3), AbstractC1383l.metrica, AbstractC1383l.startapp, AbstractC1383l.adcel, null, 0L, 0L, 0L, 0L, null, c6956l, 1797168, 0, 16260);
                c6956l4 = c6956l;
            } else {
                c6956l3.m2123default(1289934549);
                c6956l4 = c6956l3;
            }
            c6956l4.startapp(r1);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(531435249, new C2736l(c13072lYandex, this, 10), c6956l4), null, null, null, 0, 0L, 0L, ((C15700l) c6956l4.isPro(AbstractC18678l.yandex)).amazon(c6956l4), AbstractC14566l.amazon(-1399328516, new C5173l(c13072lYandex, this, iAdmob, interfaceC8714lAmazon, 4), c6956l4), c6956l4, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3081l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        InterfaceC14029l interfaceC14029l = null;
        C7864l c7864l = new C7864l(this, interfaceC14029l, 23);
        C8490l c8490l = AbstractC6025l.yandex;
        C2347l c2347l = new C2347l(new C14300l(AbstractC6025l.loadAd, 11), new C15352l(c7864l, interfaceC14029l, 12), 2);
        C5268l c5268l = this.f34614l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, EnumC8981l.f18524l), AbstractC11738l.yandex(c5268l));
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m667public(boolean z) {
        this.f2147l.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f2151l.f36440l;
    }
}
