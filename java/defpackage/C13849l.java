package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓؐٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13849l extends AbstractC11801l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f27085l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f27086l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f27087l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f27088l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f27089l;

    public C13849l(int i) {
        super(0);
        this.f27088l = AbstractC11990l.loadAd();
        this.f27089l = i;
        this.f27087l = AbstractC8020l.smaato(C3568l.yandex);
        Boolean bool = Boolean.FALSE;
        this.f27086l = AbstractC8020l.smaato(bool);
        this.f27085l = AbstractC8020l.smaato(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static final Object m3784instanceof(C13849l c13849l, AbstractC0283l abstractC0283l) {
        C14376l c14376l;
        C13849l c13849l2;
        Throwable th;
        Object c13870l;
        if (abstractC0283l instanceof C14376l) {
            c14376l = (C14376l) abstractC0283l;
            int i = c14376l.f28115l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14376l.f28115l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14376l = new C14376l(c13849l, abstractC0283l);
            }
        } else {
            c14376l = new C14376l(c13849l, abstractC0283l);
        }
        Object objM3789this = c14376l.f28118l;
        int i2 = c14376l.f28115l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3789this);
            try {
                c13849l.f27087l.setValue(C0138l.yandex);
                c14376l.f28117l = c13849l;
                c14376l.f28116l = c13849l;
                c14376l.f28115l = 1;
                objM3789this = c13849l.m3789this(c14376l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM3789this == enumC9342l) {
                    return enumC9342l;
                }
                c13849l2 = c13849l;
            } catch (Throwable th2) {
                c13849l2 = c13849l;
                th = th2;
                c13870l = new C13870l(th);
                c13849l = c13849l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c13849l = c14376l.f28116l;
            c13849l2 = c14376l.f28117l;
            try {
                AbstractC2829l.crashlytics(objM3789this);
            } catch (Throwable th3) {
                th = th3;
                c13870l = new C13870l(th);
                c13849l = c13849l2;
            }
        }
        c13870l = (InterfaceC8289l) objM3789this;
        c13849l.f27087l.setValue(c13870l);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final Object m3785public(C13849l c13849l, AbstractC0283l abstractC0283l) {
        C4431l c4431l;
        C13849l c13849l2;
        Throwable th;
        Object c13870l;
        C10086l c10086l = c13849l.f27087l;
        if (abstractC0283l instanceof C4431l) {
            c4431l = (C4431l) abstractC0283l;
            int i = c4431l.f9019l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4431l.f9019l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4431l = new C4431l(c13849l, abstractC0283l);
            }
        } else {
            c4431l = new C4431l(c13849l, abstractC0283l);
        }
        Object objM3789this = c4431l.f9022l;
        int i2 = c4431l.f9019l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3789this);
            try {
                c10086l.setValue(new C10921l((InterfaceC8289l) c10086l.getValue()));
                c4431l.f9021l = c13849l;
                c4431l.f9020l = c13849l;
                c4431l.f9019l = 1;
                objM3789this = c13849l.m3789this(c4431l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM3789this == enumC9342l) {
                    return enumC9342l;
                }
                c13849l2 = c13849l;
            } catch (Throwable th2) {
                c13849l2 = c13849l;
                th = th2;
                c13870l = new C13870l(th);
                c13849l = c13849l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c13849l = c4431l.f9020l;
            c13849l2 = c4431l.f9021l;
            try {
                AbstractC2829l.crashlytics(objM3789this);
            } catch (Throwable th3) {
                th = th3;
                c13870l = new C13870l(th);
                c13849l = c13849l2;
            }
        }
        c13870l = (InterfaceC8289l) objM3789this;
        c13849l.f27087l.setValue(c13870l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m3786abstract(String str, int i, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i2) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(421396499);
        int i3 = i2 | (c6956l2.billing(str) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= c6956l2.amazon(i) ? 32 : 16;
        }
        int i4 = i3 | (c6956l2.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i4 & 1, (i4 & 147) != 146)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i5 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(str, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, C6886l.f14420l, AbstractC1193l.loadAd, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.mopub, c6956l2, (i4 & 14) | 14155776, 0, 130874);
            if (i > 0) {
                c6956l2.m2123default(1359135624);
                AbstractC13010l.loadAd(String.valueOf(i), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
                c6956l2 = c6956l;
            } else {
                c6956l2 = c6956l2;
                c6956l2.m2123default(1324208947);
            }
            c6956l2.startapp(false);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12348l(this, str, i, interfaceC17242l, i2);
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m3787finally(C2391l c2391l, C6393l c6393l) {
        AbstractC9092l.loadAd(isVip(), new C1407l(c2391l), new C13305l(new C11392l(c2391l.firebase + '_' + c6393l.loadAd), c6393l.crashlytics == EnumC11113l.f22322l ? 0L : ((long) c6393l.amazon) * 1000, null, false, true, false, 108));
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m3788import(C2391l c2391l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        boolean z;
        int i3;
        C2663l c2663l;
        long j;
        C6956l c6956l2;
        boolean z2;
        C13849l c13849l = this;
        C2391l c2391l2 = c2391l;
        C6956l c6956l3 = c6956l;
        c6956l3.m2133new(1082354036);
        if ((i & 6) == 0) {
            i2 = (c6956l3.admob(c2391l2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l3.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l3.admob(c13849l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l3.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Object objM2132native = c6956l3.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l3);
                c6956l3.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l3);
            C2663l c2663lPurchase = AbstractC0831l.purchase(c6956l3);
            List list = c2391l2.mopub;
            List list2 = c2391l2.startapp;
            List list3 = c2391l2.crashlytics;
            int i4 = c2391l2.admob;
            boolean zBilling = c6956l3.billing(list);
            Object objM2132native2 = c6956l3.m2132native();
            if (zBilling || objM2132native2 == c13863l) {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    C4875l.firebase();
                    return;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int i5 = ((C0034l) next).yandex;
                    while (true) {
                        Object next2 = it.next();
                        int i6 = ((C0034l) next2).yandex;
                        if (i5 < i6) {
                            i5 = i6;
                            next = next2;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        c13849l = this;
                        c2391l2 = c2391l;
                        c6956l3 = c6956l;
                    }
                }
                objM2132native2 = ((C0034l) next).loadAd;
                c6956l3.m2147try(objM2132native2);
            }
            String str = (String) objM2132native2;
            boolean zBilling2 = c6956l3.billing(list);
            Object objM2132native3 = c6956l3.m2132native();
            if (zBilling2 || objM2132native3 == c13863l) {
                Iterator it2 = list.iterator();
                if (!it2.hasNext()) {
                    C4875l.firebase();
                    return;
                }
                Object next3 = it2.next();
                if (it2.hasNext()) {
                    int i7 = ((C0034l) next3).yandex;
                    while (true) {
                        Object next4 = it2.next();
                        int i8 = ((C0034l) next4).yandex;
                        if (i7 > i8) {
                            next3 = next4;
                            i7 = i8;
                        }
                        if (!it2.hasNext()) {
                            break;
                        }
                        c13849l = this;
                        c2391l2 = c2391l;
                        c6956l3 = c6956l;
                    }
                }
                objM2132native3 = ((C0034l) next3).loadAd;
                c6956l3.m2147try(objM2132native3);
            }
            String str2 = (String) objM2132native3;
            boolean zAmazon = c6956l3.amazon(i4);
            Object objM2132native4 = c6956l3.m2132native();
            if (zAmazon || objM2132native4 == c13863l) {
                DecimalFormat decimalFormat = C15638l.yandex;
                objM2132native4 = AbstractC14205l.amazon(i4, false);
                c6956l3.m2147try(objM2132native4);
            }
            String str3 = (String) objM2132native4;
            boolean zBilling3 = c6956l3.billing(list3);
            Object objM2132native5 = c6956l3.m2132native();
            if (zBilling3 || objM2132native5 == c13863l) {
                objM2132native5 = (C1358l) AbstractC16901l.m4217extends(list3);
                c6956l3.m2147try(objM2132native5);
            }
            C1358l c1358l = (C1358l) objM2132native5;
            boolean zBilling4 = c6956l3.billing(list2);
            Object objM2132native6 = c6956l3.m2132native();
            if (zBilling4 || objM2132native6 == c13863l) {
                objM2132native6 = (C1358l) AbstractC16901l.m4217extends(list2);
                c6956l3.m2147try(objM2132native6);
            }
            C1358l c1358l2 = (C1358l) objM2132native6;
            boolean zBilling5 = c6956l3.billing(c2391l2);
            Object objM2132native7 = c6956l3.m2132native();
            if (zBilling5 || objM2132native7 == c13863l) {
                if (c2391l2.subs > 0) {
                    z = true;
                } else {
                    List list4 = c2391l2.amazon;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it3 = list4.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((C6393l) it3.next()).yandex.crashlytics.length() > 0) {
                                    z = true;
                                }
                            }
                        }
                    }
                    z = false;
                }
                objM2132native7 = Boolean.valueOf(z);
                c6956l3.m2147try(objM2132native7);
            }
            boolean zBooleanValue = ((Boolean) objM2132native7).booleanValue();
            C10707l c10707l = AbstractC16964l.yandex;
            long j2 = ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp;
            if (((Boolean) c13849l.f27086l.getValue()).booleanValue()) {
                c6956l3.m2123default(2090720334);
                boolean zAdmob = c6956l3.admob(c13849l);
                Object objM2132native8 = c6956l3.m2132native();
                if (zAdmob || objM2132native8 == c13863l) {
                    objM2132native8 = new C10456l(c13849l, 1);
                    c6956l3.m2147try(objM2132native8);
                }
                z2 = false;
                i3 = i2;
                c2663l = c2663lPurchase;
                j = j2;
                AbstractC2426l.crashlytics((Function0) objM2132native8, null, null, 0.0f, false, null, ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l3.isPro(c10707l)).yandex.adcel, 0L, null, null, null, AbstractC14566l.amazon(-1946447781, new C7797l(0, c2391l2), c6956l3), c6956l, 0, 7998);
                c6956l2 = c6956l;
            } else {
                i3 = i2;
                c2663l = c2663lPurchase;
                j = j2;
                c6956l2 = c6956l3;
                z2 = false;
                c6956l2.m2123default(2081876654);
            }
            c6956l2.startapp(z2);
            C2663l c2663l2 = c2663l;
            AbstractC15497l.loadAd(interfaceC17242l, AbstractC14566l.amazon(523794224, new C7159l(c2663l2, c2391l2, c13849l, zBooleanValue), c6956l2), null, null, null, 0, 0L, 0L, null, AbstractC14566l.amazon(-657500859, new C13323l(c13849l, interfaceC2262l, c2663l2, str2, j, str, c2391l2, str3, zBooleanValue, iAdmob, c1358l, c1358l2), c6956l2), c6956l, ((i3 >> 3) & 14) | 805306416, 508);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(this, c2391l, interfaceC17242l, i, 1);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        InterfaceC8289l interfaceC8289l;
        c6956l.m2133new(-391143634);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == obj) {
                objM2132native2 = new C13422l(this, null, 1);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
            C10086l c10086l = this.f27087l;
            InterfaceC8289l interfaceC8289l2 = (InterfaceC8289l) c10086l.getValue();
            C10921l c10921l = interfaceC8289l2 instanceof C10921l ? (C10921l) interfaceC8289l2 : null;
            if (c10921l == null || (interfaceC8289l = c10921l.yandex) == null) {
                interfaceC8289l = (InterfaceC8289l) c10086l.getValue();
            }
            boolean zYandex = AbstractC8576l.yandex(interfaceC8289l, C3568l.yandex);
            C4346l c4346l = C4346l.f8873l;
            if (zYandex || AbstractC8576l.yandex(interfaceC8289l, C0138l.yandex)) {
                c6956l.m2123default(-313316221);
                AbstractC7209l.yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), true, 0L, c6956l, 54, 4);
                c6956l.startapp(false);
            } else if (interfaceC8289l instanceof C13870l) {
                c6956l.m2123default(-313149255);
                InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(AbstractC2697l.subscription(c4346l, AbstractC2697l.amazon), 1.0f);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                long j = c6956l.f14595continue;
                int i3 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
                InterfaceC8801l.firebase.getClass();
                Function0 function0 = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(function0);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC13841l.crashlytics(c6956l), true);
                InterfaceC5475l interfaceC5475lMetrica = C6168l.metrica(((C13870l) interfaceC8289l).yandex);
                boolean zAdmob2 = c6956l.admob(interfaceC2262l) | c6956l.admob(this);
                Object objM2132native3 = c6956l.m2132native();
                if (zAdmob2 || objM2132native3 == obj) {
                    objM2132native3 = new C14835l(interfaceC2262l, this, 0);
                    c6956l.m2147try(objM2132native3);
                }
                AbstractC0124l.loadAd(interfaceC5475lMetrica, (Function0) objM2132native3, interfaceC17242lPurchase, false, c6956l, 0, 8);
                c6956l.startapp(true);
                c6956l.startapp(false);
            } else if (interfaceC8289l instanceof C10921l) {
                c6956l.m2123default(-312502254);
                c6956l.startapp(false);
            } else {
                if (!(interfaceC8289l instanceof C4758l)) {
                    throw AbstractC12900l.billing(2068100178, c6956l, false);
                }
                c6956l.m2123default(-312463411);
                m3788import(((C4758l) interfaceC8289l).yandex, AbstractC0080l.crashlytics(c4346l, 1.0f), c6956l, ((i2 << 6) & 896) | 48);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13944l(this, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final Object m3789this(AbstractC0283l abstractC0283l) {
        C4692l c4692l;
        if (abstractC0283l instanceof C4692l) {
            c4692l = (C4692l) abstractC0283l;
            int i = c4692l.f9536l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4692l.f9536l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4692l = new C4692l(this, abstractC0283l);
            }
        } else {
            c4692l = new C4692l(this, abstractC0283l);
        }
        Object objBilling = c4692l.f9535l;
        int i2 = c4692l.f9536l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objBilling);
            C7644l c7644lLoadAd = AbstractC16584l.loadAd();
            c4692l.f9536l = 1;
            C17464l c17464l = new C17464l("audioBooks.getAudioBookById", C11140l.f22359l);
            c17464l.loadAd(this.f27089l, "audio_book_id");
            objBilling = c7644lLoadAd.billing(c17464l, c4692l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objBilling);
        }
        C2391l c2391l = ((C15767l) AbstractC10802l.subs((AbstractC14237l) objBilling)).yandex;
        C4758l c4758l = new C4758l(c2391l);
        this.f27085l.setValue(Boolean.valueOf(c2391l.smaato));
        return c4758l;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f27088l.f36440l;
    }
}
