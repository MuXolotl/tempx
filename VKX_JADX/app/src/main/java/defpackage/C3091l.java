package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؔۨۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3091l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6629l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6630l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6631l;

    public /* synthetic */ C3091l(C13072l c13072l, AbstractC11801l abstractC11801l, int i) {
        this.f6631l = i;
        this.f6629l = c13072l;
        this.f6630l = abstractC11801l;
    }

    private final Object admob(Object obj, Object obj2, Object obj3) {
        C13406l c13406l = (C13406l) this.f6630l;
        C6523l c6523l = (C6523l) this.f6629l;
        C9398l c9398l = (C9398l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(c9398l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lMetrica = AbstractC0080l.metrica(c9398l.yandex(AbstractC3605l.smaato(c4346l, 4.0f), 1.0f, true), 170.0f, 0.0f, 2);
            int i = 0;
            for (Object obj4 : c13406l.yandex) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                C1916l c1916l = (C1916l) obj4;
                c6956l.m2121class(-23496874, c1916l.yandex);
                c1916l.loadAd.yandex(AbstractC9679l.billing(interfaceC17242lMetrica, i == 0, AbstractC9966l.billing(c4346l, c6523l)), c6956l, 0);
                c6956l.startapp(false);
                i = i2;
            }
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2, Object obj3) {
        C18536l c18536l = (C18536l) this.f6630l;
        C2403l c2403l = (C2403l) this.f6629l;
        C6956l c6956l = (C6956l) obj2;
        ((Integer) obj3).getClass();
        c6956l.m2123default(-102778667);
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            objM2132native = AbstractC12311l.isPro(c6956l);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == c13863l) {
            objM2132native2 = AbstractC8020l.smaato(null);
            c6956l.m2147try(objM2132native2);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
        InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(c18536l, c6956l);
        boolean zBilling = c6956l.billing(c2403l);
        Object objM2132native3 = c6956l.m2132native();
        if (zBilling || objM2132native3 == c13863l) {
            objM2132native3 = new C10207l(interfaceC8714l, c2403l, 22);
            c6956l.m2147try(objM2132native3);
        }
        AbstractC12311l.loadAd(c2403l, (Function1) objM2132native3, c6956l);
        boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.billing(c2403l) | c6956l.billing(interfaceC8714lVip);
        Object objM2132native4 = c6956l.m2132native();
        if (zAdmob || objM2132native4 == c13863l) {
            objM2132native4 = new C13720l(interfaceC2262l, interfaceC8714l, c2403l, interfaceC8714lVip);
            c6956l.m2147try(objM2132native4);
        }
        C8110l c8110l = new C8110l(c2403l, null, null, (PointerInputEventHandler) objM2132native4, 6);
        c6956l.startapp(false);
        return c8110l;
    }

    private final Object isPro(Object obj, Object obj2, Object obj3) {
        C12842l c12842l = (C12842l) this.f6630l;
        InterfaceC3102l interfaceC3102l = (InterfaceC3102l) this.f6629l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC16360l interfaceC16360l = (InterfaceC16360l) c12842l.f25249l.getValue();
            boolean zYandex = AbstractC8576l.yandex(interfaceC16360l, C4023l.yandex);
            C4346l c4346l = C4346l.f8873l;
            if (zYandex || AbstractC8576l.yandex(interfaceC16360l, C11647l.yandex)) {
                c6956l.m2123default(647876848);
                AbstractC7209l.yandex(AbstractC3605l.firebase(c4346l, interfaceC11780l), false, 0L, c6956l, 0, 6);
                c6956l.startapp(false);
            } else {
                boolean z = interfaceC16360l instanceof C2299l;
                C13863l c13863l = C1867l.yandex;
                if (z) {
                    c6956l.m2123default(648039970);
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(AbstractC3605l.firebase(AbstractC16422l.mopub(c4346l, interfaceC3102l.loadAd(), null), interfaceC11780l), 1.0f), AbstractC13841l.crashlytics(c6956l), true);
                    InterfaceC5475l interfaceC5475lMetrica = C6168l.metrica(((C2299l) interfaceC16360l).yandex);
                    boolean zAdmob = c6956l.admob(c12842l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C6814l c6814l = new C6814l(0, c12842l, C12842l.class, "dispatchLoad", "dispatchLoad()V", 0, 0, 23);
                        c6956l.m2147try(c6814l);
                        objM2132native = c6814l;
                    }
                    AbstractC0124l.loadAd(interfaceC5475lMetrica, (Function0) ((InterfaceC5059l) objM2132native), interfaceC17242lPurchase, false, c6956l, 0, 8);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(648549734);
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(c4346l, interfaceC11780l), interfaceC3102l.loadAd(), null);
                    boolean zAdmob2 = c6956l.admob(c12842l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C0783l(17, c12842l);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native2, c6956l, 0, 510);
                    c6956l.startapp(false);
                }
            }
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2, Object obj3) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f6630l;
        C0072l c0072l = (C0072l) this.f6629l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.admob(c0072l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C5514l(interfaceC2262l, c0072l, 5);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC11036l.purchase, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, null, null, null, c6956l, 6, 508);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object subs(Object obj, Object obj2, Object obj3) {
        C6473l c6473l = (C6473l) this.f6630l;
        InterfaceC3102l interfaceC3102l = (InterfaceC3102l) this.f6629l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC13729l interfaceC13729l = (InterfaceC13729l) c6473l.f13517l.getValue();
            boolean zYandex = AbstractC8576l.yandex(interfaceC13729l, C14420l.yandex);
            C4346l c4346l = C4346l.f8873l;
            if (zYandex || AbstractC8576l.yandex(interfaceC13729l, C2947l.yandex)) {
                c6956l.m2123default(-1026851246);
                AbstractC7209l.yandex(AbstractC3605l.firebase(c4346l, interfaceC11780l), false, 0L, c6956l, 0, 6);
                c6956l.startapp(false);
            } else {
                boolean z = interfaceC13729l instanceof C4972l;
                C13863l c13863l = C1867l.yandex;
                if (z) {
                    c6956l.m2123default(-1026688124);
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(AbstractC3605l.firebase(AbstractC16422l.mopub(c4346l, interfaceC3102l.loadAd(), null), interfaceC11780l), 1.0f), AbstractC13841l.crashlytics(c6956l), true);
                    InterfaceC5475l interfaceC5475lMetrica = C6168l.metrica(((C4972l) interfaceC13729l).yandex);
                    boolean zAdmob = c6956l.admob(c6473l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C6814l c6814l = new C6814l(0, c6473l, C6473l.class, "dispatchLoad", "dispatchLoad()V", 0, 0, 21);
                        c6956l.m2147try(c6814l);
                        objM2132native = c6814l;
                    }
                    AbstractC0124l.loadAd(interfaceC5475lMetrica, (Function0) ((InterfaceC5059l) objM2132native), interfaceC17242lPurchase, false, c6956l, 0, 8);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-1026164720);
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(c4346l, interfaceC11780l), interfaceC3102l.loadAd(), null);
                    boolean zAdmob2 = c6956l.admob(c6473l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C0783l(16, c6473l);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native2, c6956l, 0, 510);
                    c6956l.startapp(false);
                }
            }
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object yandex(Object obj, Object obj2, Object obj3) {
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f6630l;
        C0675l c0675l = (C0675l) this.f6629l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zBilling = c6956l.billing(interfaceC12244l) | c6956l.admob(c0675l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C8652l(c0675l, interfaceC12244l, 25);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC1383l.tapsense, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, AbstractC1383l.Signature, AbstractC1383l.license, AbstractC14566l.amazon(-457199635, new C12071l(interfaceC12244l, 4), c6956l), null, c6956l, 224262, 452);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        String string;
        String string2;
        Typeface typeface;
        Object obj5;
        int i = this.f6631l;
        float f = 1.0f;
        C13863l c13863l = C1867l.yandex;
        boolean z = false;
        C4346l c4346l = C4346l.f8873l;
        int i2 = 6;
        int i3 = 2;
        int i4 = 1;
        Object obj6 = this.f6630l;
        Object obj7 = this.f6629l;
        boolean z2 = false;
        switch (i) {
            case 0:
                C9455l c9455l = (C9455l) obj6;
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj7;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (!c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c6956l.m2124else();
                } else if (((Boolean) c9455l.f19314l.getValue()).booleanValue()) {
                    c6956l.m2123default(1187235695);
                    AbstractC7209l.yandex(AbstractC3605l.firebase(c4346l, interfaceC11780l), false, 0L, c6956l, 0, 6);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(1187429600);
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(c4346l, interfaceC11780l), interfaceC3102l.loadAd(), null);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    C17253l c17253lAmazon = AbstractC3605l.amazon(16.0f, 0.0f, 16.0f, 16.0f, 2);
                    boolean zAdmob = c6956l.admob(c9455l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C16931l(3, c9455l);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, c17253lAmazon, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, 24960, 490);
                    c6956l.startapp(false);
                }
                return Unit.INSTANCE;
            case 1:
                C1812l c1812l = (C1812l) obj6;
                Function1 function1 = (Function1) obj7;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
                    long j = c6956l2.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
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
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(c1812l.crashlytics, 0, c6956l2);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex, c6956l2, 56, 4);
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, c1812l.yandex), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, AbstractC7039l.isPro(20), null, C6886l.f14420l, AbstractC1193l.loadAd, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 1597440, 0, 261930);
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 4.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, c1812l.loadAd), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, AbstractC7039l.isPro(13), null, null, null, 0L, null, AbstractC7039l.isPro(16), 0, false, 0, 0, null, c6956l2, 24576, 48, 260074);
                    if (c1812l.amazon.length() > 0) {
                        c6956l2.m2123default(31742664);
                        AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
                        AbstractC13010l.loadAd(c1812l.amazon, null, C9735l.loadAd(0.7f, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel), AbstractC7039l.isPro(13), null, null, null, 0L, null, AbstractC7039l.isPro(16), 0, false, 0, 0, null, c6956l2, 24576, 48, 260074);
                    } else {
                        c6956l2.m2123default(17216219);
                    }
                    c6956l2.startapp(false);
                    c6956l2.startapp(true);
                    C5601l c5601l = c1812l.purchase;
                    if (c5601l == null) {
                        c6956l2.m2123default(-969062488);
                    } else {
                        c6956l2.m2123default(-969062487);
                        AbstractC0555l.yandex(null, 0.0f, 0L, c6956l2, 0, 7);
                        int i6 = c5601l.f11897l;
                        String strPurchase = AbstractC11999l.purchase(c6956l2, c5601l.f11896l);
                        boolean zBilling = c6956l2.billing(function1) | c6956l2.admob(c5601l);
                        Object objM2132native2 = c6956l2.m2132native();
                        if (zBilling || objM2132native2 == c13863l) {
                            obj4 = objM2132native2;
                            C8652l c8652l = new C8652l(function1, c5601l, 8);
                            c6956l2.m2147try(c8652l);
                            obj4 = c8652l;
                        }
                        AbstractC8853l.yandex(i6, strPurchase, (Function0) obj4, c6956l2, 0);
                    }
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C1253l c1253l = (C1253l) obj6;
                InterfaceC3102l interfaceC3102l2 = (InterfaceC3102l) obj7;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (!c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    c6956l3.m2124else();
                } else if (c1253l.f3283l.isEmpty()) {
                    c6956l3.m2123default(200712499);
                    AbstractC7209l.yandex(AbstractC3605l.firebase(c4346l, interfaceC11780l2), false, 0L, c6956l3, 0, 6);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2123default(199807733);
                    C1513l c1513l = new C1513l(3);
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    InterfaceC17242l interfaceC17242lMopub2 = AbstractC16422l.mopub(AbstractC3605l.firebase(c4346l, interfaceC11780l2), interfaceC3102l2.loadAd(), null);
                    C7537l c7537l2 = new C7537l(16.0f, true, new C8339l(12));
                    C7537l c7537l3 = new C7537l(16.0f, true, new C8339l(12));
                    boolean zAdmob2 = c6956l3.admob(c1253l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C7776l(c1253l, z2 ? 1 : 0);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC13628l.loadAd(c1513l, interfaceC17242lMopub2, null, c17253l, c7537l2, c7537l3, null, false, null, (Function1) objM2132native3, c6956l3, 1772544);
                    c6956l3.startapp(false);
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC3102l interfaceC3102l3 = (InterfaceC3102l) obj7;
                C0939l c0939l = (C0939l) obj6;
                InterfaceC11780l interfaceC11780l3 = (InterfaceC11780l) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l4.billing(interfaceC11780l3) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    int i7 = 1;
                    C7537l c7537l4 = new C7537l(8.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lMopub3 = AbstractC16422l.mopub(c4346l, interfaceC3102l3.loadAd(), null);
                    boolean zAdmob3 = c6956l4.admob(c0939l);
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zAdmob3 || objM2132native4 == c13863l) {
                        objM2132native4 = new C8881l(c0939l, i7);
                        c6956l4.m2147try(objM2132native4);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub3, null, interfaceC11780l3, c7537l4, null, null, false, null, (Function1) objM2132native4, c6956l4, ((iIntValue4 << 6) & 896) | 24576, 490);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC3102l interfaceC3102l4 = (InterfaceC3102l) obj7;
                C12457l c12457l = (C12457l) obj6;
                InterfaceC11780l interfaceC11780l4 = (InterfaceC11780l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6956l5.billing(interfaceC11780l4) ? 4 : 2;
                }
                if (c6956l5.m2127for(1 & iIntValue5, (iIntValue5 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub4 = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l4), interfaceC3102l4.loadAd(), null);
                    boolean zAdmob4 = c6956l5.admob(c12457l);
                    Object objM2132native5 = c6956l5.m2132native();
                    if (zAdmob4 || objM2132native5 == c13863l) {
                        objM2132native5 = new C17139l(c12457l, z2 ? 1 : 0);
                        c6956l5.m2147try(objM2132native5);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub4, null, null, null, null, null, false, null, (Function1) objM2132native5, c6956l5, 0, 510);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC3102l interfaceC3102l5 = (InterfaceC3102l) obj7;
                C9169l c9169l = (C9169l) obj6;
                InterfaceC11780l interfaceC11780l5 = (InterfaceC11780l) obj;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c6956l6.billing(interfaceC11780l5) ? 4 : 2;
                }
                if (c6956l6.m2127for(1 & iIntValue6, (iIntValue6 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub5 = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l5), interfaceC3102l5.loadAd(), null);
                    boolean zAdmob5 = c6956l6.admob(c9169l);
                    Object objM2132native6 = c6956l6.m2132native();
                    if (zAdmob5 || objM2132native6 == c13863l) {
                        objM2132native6 = new C17471l(c9169l, z2 ? 1 : 0);
                        c6956l6.m2147try(objM2132native6);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub5, null, null, null, null, null, false, null, (Function1) objM2132native6, c6956l6, 0, 510);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                Function0 function0 = (Function0) obj6;
                Function1 function2 = (Function1) obj7;
                C6956l c6956l7 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                c6956l7.m2123default(759876635);
                Object objM2132native7 = c6956l7.m2132native();
                Object obj8 = objM2132native7;
                if (objM2132native7 == c13863l) {
                    C8610l c8610lMopub = AbstractC8020l.mopub(function0);
                    c6956l7.m2147try(c8610lMopub);
                    obj8 = c8610lMopub;
                }
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj8;
                Object objM2132native8 = c6956l7.m2132native();
                Object obj9 = objM2132native8;
                if (objM2132native8 == c13863l) {
                    C5616l c5616l = new C5616l(new C1187l(((C1187l) interfaceC12244l.getValue()).yandex), AbstractC3415l.loadAd, new C1187l(AbstractC3415l.crashlytics), 8);
                    c6956l7.m2147try(c5616l);
                    obj9 = c5616l;
                }
                C5616l c5616l2 = (C5616l) obj9;
                Unit unit = Unit.INSTANCE;
                boolean zAdmob6 = c6956l7.admob(c5616l2);
                Object objM2132native9 = c6956l7.m2132native();
                Object obj10 = objM2132native9;
                if (zAdmob6 || objM2132native9 == c13863l) {
                    C17949l c17949l = new C17949l(interfaceC12244l, c5616l2, z ? 1 : 0, 22);
                    c6956l7.m2147try(c17949l);
                    obj10 = c17949l;
                }
                AbstractC12311l.amazon(c6956l7, unit, (Function2) obj10);
                C6570l c6570l = c5616l2.crashlytics;
                boolean zBilling2 = c6956l7.billing(c6570l);
                Object objM2132native10 = c6956l7.m2132native();
                Object obj11 = objM2132native10;
                if (zBilling2 || objM2132native10 == c13863l) {
                    C18355l c18355l = new C18355l(c6570l, 4);
                    c6956l7.m2147try(c18355l);
                    obj11 = c18355l;
                }
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) function2.invoke((Function0) obj11);
                c6956l7.startapp(false);
                return interfaceC17242l;
            case 7:
                C8998l c8998l = (C8998l) obj6;
                C14830l c14830l = (C14830l) obj7;
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC17549l.yandex((C10712l) c14830l.getValue(), new C0059l(0, 13, C8998l.class, c8998l, "progress", "getProgress()F"), AbstractC0080l.isPro(c4346l, 72.0f), c6956l8, 384);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C8748l c8748l = (C8748l) obj6;
                CachedTrack cachedTrack = (CachedTrack) obj7;
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    boolean z3 = c8748l.m2931abstract() == EnumC11447l.f23032l;
                    AbstractC18643l abstractC18643lM2933instanceof = c8748l.m2933instanceof();
                    C2287l.loadAd(z3, AbstractC8576l.yandex(abstractC18643lM2933instanceof != null ? abstractC18643lM2933instanceof.startapp() : null, cachedTrack.premium()), AbstractC14566l.amazon(1940751046, new C14219l(cachedTrack, 14), c6956l9), c6956l9, 384);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C0884l c0884l = (C0884l) obj6;
                Context context = (Context) obj7;
                C6956l c6956l10 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                if (c0884l == null || (string = c0884l.f2539l) == null) {
                    string = context.getString(R.string.bc_v2_m_desc_unload);
                }
                String str = string;
                long j2 = C9735l.purchase;
                AbstractC16570l.yandex(str, null, new C12373l(new C6293l(j2), new C1794l(AbstractC7039l.isPro(15)), new C18176l("sans-serif-medium", 0), 60), 2, c6956l10, 3072, 2);
                if (c0884l == null || (string2 = c0884l.f2541l) == null) {
                    string2 = context.getString(R.string.bc_v2_m_desc_unload);
                }
                AbstractC16570l.yandex(string2, null, new C12373l(new C6293l(C9735l.loadAd(0.5f, j2)), new C1794l(AbstractC7039l.isPro(14)), C18176l.f35611l, 60), 2, c6956l10, 3072, 2);
                return Unit.INSTANCE;
            case 10:
                Spannable spannable = (Spannable) obj6;
                C4508l c4508l = (C4508l) obj7;
                C14264l c14264l = (C14264l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int iIntValue10 = ((Integer) obj3).intValue();
                AbstractC17569l abstractC17569l = c14264l.billing;
                C6886l c6886l = c14264l.crashlytics;
                if (c6886l == null) {
                    c6886l = C6886l.f14425l;
                }
                C11617l c11617l = c14264l.amazon;
                int i8 = c11617l != null ? c11617l.yandex : 0;
                C8689l c8689l = c14264l.purchase;
                int i9 = c8689l != null ? c8689l.yandex : 65535;
                C14442l c14442l = (C14442l) c4508l.f9146l;
                InterfaceC16115l interfaceC16115lLoadAd = ((C7620l) c14442l.f28293l).loadAd(abstractC17569l, c6886l, i8, i9);
                if (interfaceC16115lLoadAd instanceof C8902l) {
                    typeface = (Typeface) ((C8902l) interfaceC16115lLoadAd).f18295l;
                } else {
                    C4816l c4816l = new C4816l(interfaceC16115lLoadAd, c14442l.f28292l);
                    c14442l.f28292l = c4816l;
                    typeface = (Typeface) c4816l.f9862l;
                }
                spannable.setSpan(new C17637l(1, typeface), iIntValue9, iIntValue10, 33);
                return Unit.INSTANCE;
            case 11:
                C2729l c2729l = (C2729l) obj6;
                C14089l c14089l = (C14089l) obj7;
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 0.0f, 12.0f, 0.0f, 28.0f, 5);
                    C7537l c7537l5 = new C7537l(8.0f, true, new C8339l(12));
                    C15089l c15089l = C18450l.f36046l;
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c7537l5, c15089l, c6956l11, 6);
                    long j3 = c6956l11.f14595continue;
                    int i10 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l11.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l11, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l11.m2140super();
                    if (c6956l11.f14603switch) {
                        c6956l11.firebase(c16395l2);
                    } else {
                        c6956l11.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l11, c1853lYandex2, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato2, c6415l2);
                    Integer numValueOf = Integer.valueOf(i10);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l11, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l11, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l11, interfaceC17242lBilling2, c6415l4);
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l2, 16.0f, 0.0f, 2);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), c15089l, c6956l11, 6);
                    long j4 = c6956l11.f14595continue;
                    int i11 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l11.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l11, interfaceC17242lVip);
                    c6956l11.m2140super();
                    if (c6956l11.f14603switch) {
                        c6956l11.firebase(c16395l2);
                    } else {
                        c6956l11.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l11, c1853lYandex3, c6415l);
                    AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i11, c6956l11, c6415l3, c6956l11, c11192l);
                    AbstractC8182l.billing(c6956l11, interfaceC17242lBilling3, c6415l4);
                    AbstractC13010l.loadAd(c2729l.f5926l, null, AbstractC13106l.purchase(c6956l11).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l11).mopub, c6956l11, 0, 0, 131066);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l11, 54);
                    long j5 = c6956l11.f14595continue;
                    int i12 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l11.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l11, c4346l2);
                    c6956l11.m2140super();
                    if (c6956l11.f14603switch) {
                        c6956l11.firebase(c16395l2);
                    } else {
                        c6956l11.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l11, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato4, c6415l2);
                    AbstractC11043l.isPro(i12, c6956l11, c6415l3, c6956l11, c11192l);
                    AbstractC8182l.billing(c6956l11, interfaceC17242lBilling4, c6415l4);
                    AbstractC10464l.amazon(AbstractC13106l.purchase(c6956l11).adcel, AbstractC13106l.admob(c6956l11).admob, AbstractC14566l.amazon(-2100628271, new C1645l(13, c2729l), c6956l11), c6956l11, 384);
                    c6956l11.startapp(true);
                    c6956l11.startapp(true);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l11, 0, 7);
                    AbstractC10464l.amazon(AbstractC13106l.purchase(c6956l11).adcel, AbstractC13106l.admob(c6956l11).isPro, AbstractC14566l.amazon(-319333385, new C2736l(c2729l, c14089l, 3), c6956l11), c6956l11, 384);
                    c6956l11.startapp(true);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                C15968l c15968l = (C15968l) obj6;
                C14089l c14089l2 = (C14089l) obj7;
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    C4346l c4346l3 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp2 = AbstractC3605l.startapp(c4346l3, 0.0f, 12.0f, 0.0f, 28.0f, 5);
                    C7537l c7537l6 = new C7537l(8.0f, true, new C8339l(12));
                    C15089l c15089l2 = C18450l.f36046l;
                    C1853l c1853lYandex4 = AbstractC1001l.yandex(c7537l6, c15089l2, c6956l12, 6);
                    long j6 = c6956l12.f14595continue;
                    int i13 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l12.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l12, interfaceC17242lStartapp2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l12.m2140super();
                    if (c6956l12.f14603switch) {
                        c6956l12.firebase(c16395l3);
                    } else {
                        c6956l12.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l12, c1853lYandex4, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato5, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i13);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l12, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l12, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l12, interfaceC17242lBilling5, c6415l8);
                    InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(c4346l3, 16.0f, 0.0f, 2);
                    C1853l c1853lYandex5 = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), c15089l2, c6956l12, 6);
                    long j7 = c6956l12.f14595continue;
                    int i14 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l12.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l12, interfaceC17242lVip2);
                    c6956l12.m2140super();
                    if (c6956l12.f14603switch) {
                        c6956l12.firebase(c16395l3);
                    } else {
                        c6956l12.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l12, c1853lYandex5, c6415l5);
                    AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato6, c6415l6);
                    AbstractC11043l.isPro(i14, c6956l12, c6415l7, c6956l12, c11192l2);
                    AbstractC8182l.billing(c6956l12, interfaceC17242lBilling6, c6415l8);
                    AbstractC13010l.loadAd(c15968l.f31337l, null, AbstractC13106l.purchase(c6956l12).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l12).mopub, c6956l12, 0, 0, 131066);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l12, 54);
                    long j8 = c6956l12.f14595continue;
                    int i15 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l12.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l12, c4346l3);
                    c6956l12.m2140super();
                    if (c6956l12.f14603switch) {
                        c6956l12.firebase(c16395l3);
                    } else {
                        c6956l12.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l12, c5062lYandex2, c6415l5);
                    AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato7, c6415l6);
                    AbstractC11043l.isPro(i15, c6956l12, c6415l7, c6956l12, c11192l2);
                    AbstractC8182l.billing(c6956l12, interfaceC17242lBilling7, c6415l8);
                    AbstractC10464l.amazon(AbstractC13106l.purchase(c6956l12).adcel, AbstractC13106l.admob(c6956l12).admob, AbstractC14566l.amazon(908702175, new C6858l(c14089l2, c15968l), c6956l12), c6956l12, 384);
                    c6956l12.startapp(true);
                    c6956l12.startapp(true);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l12, 0, 7);
                    AbstractC10464l.amazon(AbstractC13106l.purchase(c6956l12).adcel, AbstractC13106l.admob(c6956l12).isPro, AbstractC14566l.amazon(-1838044539, new C6858l(c15968l, c14089l2), c6956l12), c6956l12, 384);
                    c6956l12.startapp(true);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                AbstractC13264l abstractC13264l = (AbstractC13264l) obj6;
                C14089l c14089l3 = (C14089l) obj7;
                InterfaceC11780l interfaceC11780l6 = (InterfaceC11780l) obj;
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= c6956l13.billing(interfaceC11780l6) ? 4 : 2;
                }
                if (c6956l13.m2127for(1 & iIntValue13, (iIntValue13 & 19) != 18)) {
                    AbstractC7252l.yandex(abstractC13264l, AbstractC0080l.crashlytics(c4346l, 1.0f), null, null, 0.0f, null, null, false, null, null, null, AbstractC14566l.amazon(290836476, new C11050l(interfaceC11780l6, c14089l3, i2), c6956l13), c6956l13, 48, 24576, 16380);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                List list = (List) obj6;
                Function1 function3 = (Function1) obj7;
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    int i16 = 0;
                    for (Object obj12 : list) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            AbstractC14055l.subscription();
                            throw null;
                        }
                        C0247l c0247l = (C0247l) obj12;
                        int i18 = AbstractC15548l.yandex;
                        C15087l c15087lYandex = AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l14, 510);
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, f);
                        boolean zBilling3 = c6956l14.billing(function3) | c6956l14.admob(c0247l);
                        Object objM2132native11 = c6956l14.m2132native();
                        if (zBilling3 || objM2132native11 == c13863l) {
                            obj5 = objM2132native11;
                            C8652l c8652l2 = new C8652l(function3, c0247l, 23);
                            c6956l14.m2147try(c8652l2);
                            obj5 = c8652l2;
                        }
                        AbstractC13319l.yandex(AbstractC14566l.amazon(276430291, new C8690l(c0247l, z2 ? 1 : 0), c6956l14), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) obj5, 15), AbstractC14566l.amazon(1754976085, new C8690l(c0247l, i4), c6956l14), AbstractC14566l.amazon(346765334, new C8690l(c0247l, i3), c6956l14), null, null, c15087lYandex, c6956l14, 3462, 432);
                        if (i16 != AbstractC14055l.smaato(list)) {
                            c6956l14.m2123default(-422518478);
                            AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l14, 0, 7);
                        } else {
                            c6956l14.m2123default(-426031987);
                        }
                        c6956l14.startapp(false);
                        i16 = i17;
                        f = 1.0f;
                    }
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                return yandex(obj, obj2, obj3);
            case 16:
                return billing(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return mopub(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return admob(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return subs(obj, obj2, obj3);
            case 20:
                return isPro(obj, obj2, obj3);
            default:
                InterfaceC3102l interfaceC3102l6 = (InterfaceC3102l) obj7;
                C5310l c5310l = (C5310l) obj6;
                InterfaceC11780l interfaceC11780l7 = (InterfaceC11780l) obj;
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= c6956l15.billing(interfaceC11780l7) ? 4 : 2;
                }
                if (c6956l15.m2127for(1 & iIntValue15, (iIntValue15 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub6 = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l7), interfaceC3102l6.loadAd(), null);
                    boolean zAdmob7 = c6956l15.admob(c5310l);
                    Object objM2132native12 = c6956l15.m2132native();
                    if (zAdmob7 || objM2132native12 == c13863l) {
                        objM2132native12 = new C0783l(19, c5310l);
                        c6956l15.m2147try(objM2132native12);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub6, null, null, null, null, null, false, null, (Function1) objM2132native12, c6956l15, 0, 510);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C3091l(Object obj, Object obj2, int i) {
        this.f6631l = i;
        this.f6630l = obj;
        this.f6629l = obj2;
    }
}
