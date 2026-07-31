package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘؗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5473l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C15578l f11721l = new C15578l(-1704504923, false, new C14678l(0));

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C15578l f11720l = new C15578l(2029869637, false, new C14678l(1));

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C15578l f11719l = new C15578l(440820491, false, new C14678l(2));

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C15578l f11722l = new C15578l(-126091542, false, new C14678l(3));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object billing(AbstractC12074l abstractC12074l, AbstractC0283l abstractC0283l) {
        C6088l c6088l;
        if (abstractC0283l instanceof C6088l) {
            c6088l = (C6088l) abstractC0283l;
            int i = c6088l.f12864l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6088l.f12864l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6088l = new C6088l(abstractC0283l);
            }
        } else {
            c6088l = new C6088l(abstractC0283l);
        }
        Object obj = c6088l.f12862l;
        int i2 = c6088l.f12864l;
        InterfaceC13012l interfaceC13012lYandex = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            List listAdvert = ((InterfaceC9955l) abstractC12074l.f24000l).billing().yandex().advert("Host");
            if (listAdvert == null) {
                return Unit.INSTANCE;
            }
            if (listAdvert.size() > 1) {
                InterfaceC9955l interfaceC9955l = (InterfaceC9955l) abstractC12074l.f24000l;
                C2759l c2759l = C2759l.f5979l;
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C2759l.class);
                try {
                    interfaceC13012lYandex = AbstractC18202l.yandex(C2759l.class);
                } catch (Throwable unused) {
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex);
                c6088l.f12863l = abstractC12074l;
                c6088l.f12864l = 1;
                Object objMo1554while = interfaceC9955l.mo1554while(c2759l, c11310l, c6088l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objMo1554while == enumC9342l) {
                    return enumC9342l;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        abstractC12074l = c6088l.f12863l;
        AbstractC2829l.crashlytics(obj);
        abstractC12074l.loadAd();
        return Unit.INSTANCE;
    }

    public static final void isPro(C16231l c16231l, C9754l c9754l) {
        int i = c9754l.f19893l;
        int i2 = c9754l.f19892l;
        if (i >= i2 || !AbstractC8576l.remoteconfig(c16231l.charAt(i))) {
            return;
        }
        do {
            i++;
            if (i >= i2) {
                break;
            }
        } while (AbstractC8576l.remoteconfig(c16231l.charAt(i)));
        c9754l.f19893l = i;
    }

    public static final int mopub(C16231l c16231l, C9754l c9754l) {
        int i = c9754l.f19893l;
        int i2 = c9754l.f19892l;
        if (i < i2 && !AbstractC8576l.remoteconfig(c16231l.charAt(i))) {
            do {
                i++;
                if (i >= i2) {
                    break;
                }
            } while (!AbstractC8576l.remoteconfig(c16231l.charAt(i)));
        }
        return i;
    }

    public static final void purchase(final C5803l c5803l, final Function1 function1, final Function1 function2, final Function1 function3, C6956l c6956l, int i) {
        c6956l.m2133new(-128173924);
        int i2 = i | (c6956l.billing(c5803l) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16) | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function3) ? 2048 : 1024);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            final InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(c5803l.mopub, c6956l, 0);
            final InterfaceC8714l interfaceC8714lPurchase2 = AbstractC9637l.purchase(c5803l.admob, c6956l, 0);
            final InterfaceC8714l interfaceC8714lPurchase3 = AbstractC9637l.purchase(c5803l.isPro, c6956l, 0);
            InterfaceC8714l interfaceC8714lPurchase4 = AbstractC9637l.purchase(c5803l.subs, c6956l, 0);
            final InterfaceC8714l interfaceC8714lPurchase5 = AbstractC9637l.purchase(c5803l.billing, c6956l, 0);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1378333864, new C0180l(c5803l, interfaceC8714lPurchase4, i3), c6956l), null, null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(1840534317, new Function3() { // from class: lؓؖ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                    C6956l c6956l2 = (C6956l) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= c6956l2.billing(interfaceC11780l) ? 4 : 2;
                    }
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                        InterfaceC12244l interfaceC12244l = interfaceC8714lPurchase;
                        boolean zBooleanValue = ((Boolean) interfaceC12244l.getValue()).booleanValue();
                        InterfaceC12244l interfaceC12244l2 = interfaceC8714lPurchase3;
                        if (zBooleanValue && ((AbstractC7095l) ((InterfaceC13238l) interfaceC12244l2.getValue())).isEmpty()) {
                            c6956l2.m2123default(1805417551);
                            InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), interfaceC11780l);
                            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                            long j = c6956l2.f14595continue;
                            int i4 = (int) (j ^ (j >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lFirebase);
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
                            AbstractC8960l.loadAd(null, 0L, null, c6956l2, 0, 7);
                            c6956l2.startapp(true);
                            c6956l2.startapp(false);
                        } else if (((Boolean) interfaceC12244l.getValue()).booleanValue() || !((AbstractC7095l) ((InterfaceC13238l) interfaceC12244l2.getValue())).isEmpty()) {
                            c6956l2.m2123default(1805879978);
                            InterfaceC12244l interfaceC12244l3 = interfaceC8714lPurchase5;
                            boolean zBilling = c6956l2.billing(interfaceC12244l3);
                            C5803l c5803l2 = c5803l;
                            boolean zAdmob = zBilling | c6956l2.admob(c5803l2) | c6956l2.billing(interfaceC12244l2);
                            Function1 function4 = function1;
                            boolean zBilling2 = zAdmob | c6956l2.billing(function4);
                            Function1 function5 = function2;
                            boolean zBilling3 = zBilling2 | c6956l2.billing(function5);
                            Function1 function6 = function3;
                            boolean zBilling4 = zBilling3 | c6956l2.billing(function6);
                            InterfaceC12244l interfaceC12244l4 = interfaceC8714lPurchase2;
                            boolean zBilling5 = zBilling4 | c6956l2.billing(interfaceC12244l4);
                            Object objM2132native = c6956l2.m2132native();
                            if (zBilling5 || objM2132native == C1867l.yandex) {
                                C18015l c18015l = new C18015l(interfaceC12244l3, c5803l2, interfaceC12244l2, function4, function5, function6, interfaceC12244l4);
                                c6956l2.m2147try(c18015l);
                                objM2132native = c18015l;
                            }
                            AbstractC16336l.yandex(null, null, interfaceC11780l, null, null, null, false, null, (Function1) objM2132native, c6956l2, (iIntValue << 6) & 896, 507);
                            c6956l2.startapp(false);
                        } else {
                            c6956l2.m2123default(1805693575);
                            c6956l2.startapp(false);
                        }
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 905969712, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(c5803l, function1, function2, function3, i, 11);
        }
    }

    public abstract View admob(int i);

    public abstract boolean subs();
}
