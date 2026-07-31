package defpackage;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؙؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6340l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C12823l f13292l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f13293l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f13294l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f13295l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13296l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f13297l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C0072l f13298l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f13299l;

    public /* synthetic */ C6340l(InterfaceC2262l interfaceC2262l, C12823l c12823l, C0072l c0072l, InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, InterfaceC8714l interfaceC8714l3, InterfaceC8714l interfaceC8714l4) {
        this.f13295l = interfaceC2262l;
        this.f13292l = c12823l;
        this.f13298l = c0072l;
        this.f13297l = interfaceC8714l;
        this.f13299l = interfaceC8714l2;
        this.f13293l = interfaceC8714l3;
        this.f13294l = interfaceC8714l4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f13296l;
        C13863l c13863l = C1867l.yandex;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final C0072l c0072l = this.f13298l;
                    boolean zAdmob = c6956l.admob(c0072l);
                    final InterfaceC8714l interfaceC8714l = this.f13297l;
                    boolean zBilling = zAdmob | c6956l.billing(interfaceC8714l);
                    final InterfaceC8714l interfaceC8714l2 = this.f13299l;
                    boolean zBilling2 = zBilling | c6956l.billing(interfaceC8714l2);
                    final InterfaceC2262l interfaceC2262l = this.f13295l;
                    boolean zAdmob2 = zBilling2 | c6956l.admob(interfaceC2262l);
                    final C12823l c12823l = this.f13292l;
                    boolean zBilling3 = zAdmob2 | c6956l.billing(c12823l);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling3 || objM2132native == c13863l) {
                        final InterfaceC8714l interfaceC8714l3 = this.f13293l;
                        final InterfaceC8714l interfaceC8714l4 = this.f13294l;
                        Function0 function0 = new Function0() { // from class: lٖۣۡ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object c18435l;
                                InterfaceC8714l interfaceC8714l5 = interfaceC8714l;
                                boolean zBooleanValue = ((Boolean) interfaceC8714l3.getValue()).booleanValue();
                                InterfaceC8714l interfaceC8714l6 = interfaceC8714l2;
                                if (zBooleanValue) {
                                    try {
                                        C13645l c13645l = C12818l.purchase;
                                        c18435l = AbstractC2133l.admob(AbstractC12953l.loadAd(Color.parseColor("#" + ((String) interfaceC8714l5.getValue()))));
                                    } catch (Throwable th) {
                                        c18435l = new C18435l(th);
                                    }
                                    if (!(c18435l instanceof C18435l)) {
                                        interfaceC8714l6.setValue((C12818l) c18435l);
                                    }
                                }
                                interfaceC8714l4.setValue(Boolean.FALSE);
                                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C0932l(c12823l, c0072l, interfaceC8714l6, (InterfaceC14029l) null, 4), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(function0);
                        objM2132native = function0;
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC11036l.billing, c6956l, 805306368, 510);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, C4346l.f8873l);
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
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    InterfaceC2262l interfaceC2262l2 = this.f13295l;
                    boolean zAdmob3 = c6956l2.admob(interfaceC2262l2);
                    C12823l c12823l2 = this.f13292l;
                    boolean zBilling4 = zAdmob3 | c6956l2.billing(c12823l2);
                    C0072l c0072l2 = this.f13298l;
                    boolean zAdmob4 = zBilling4 | c6956l2.admob(c0072l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native2 == c13863l) {
                        C17026l c17026l = new C17026l(interfaceC2262l2, this.f13293l, c12823l2, c0072l2, 8);
                        c6956l2.m2147try(c17026l);
                        objM2132native2 = c17026l;
                    }
                    AbstractC17457l.mopub((Function0) objM2132native2, null, false, null, null, null, AbstractC11036l.mopub, c6956l2, 805306368, 510);
                    InterfaceC8714l interfaceC8714l5 = this.f13297l;
                    boolean zBilling5 = c6956l2.billing(interfaceC8714l5);
                    InterfaceC8714l interfaceC8714l6 = this.f13299l;
                    boolean zBilling6 = zBilling5 | c6956l2.billing(interfaceC8714l6);
                    Object objM2132native3 = c6956l2.m2132native();
                    InterfaceC8714l interfaceC8714l7 = this.f13294l;
                    if (zBilling6 || objM2132native3 == c13863l) {
                        objM2132native3 = new Cfinally(interfaceC8714l7, interfaceC8714l5, interfaceC8714l6, 29);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native3, null, false, null, null, null, AbstractC14566l.amazon(891939664, new C2266l(interfaceC8714l7, 15), c6956l2), c6956l2, 805306368, 510);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6340l(C0072l c0072l, InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, InterfaceC2262l interfaceC2262l, C12823l c12823l, InterfaceC8714l interfaceC8714l3, InterfaceC8714l interfaceC8714l4) {
        this.f13298l = c0072l;
        this.f13297l = interfaceC8714l;
        this.f13299l = interfaceC8714l2;
        this.f13295l = interfaceC2262l;
        this.f13292l = c12823l;
        this.f13293l = interfaceC8714l3;
        this.f13294l = interfaceC8714l4;
    }
}
