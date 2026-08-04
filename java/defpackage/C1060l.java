package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٕؒؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1060l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f2936l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17408l f2937l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2938l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f2939l;

    public /* synthetic */ C1060l(C17408l c17408l, InterfaceC2262l interfaceC2262l, InterfaceC12244l interfaceC12244l) {
        this.f2937l = c17408l;
        this.f2939l = interfaceC2262l;
        this.f2936l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f2938l;
        int i2 = 8;
        InterfaceC2262l interfaceC2262l = this.f2939l;
        final InterfaceC12244l interfaceC12244l = this.f2936l;
        final C17408l c17408l = this.f2937l;
        final int i3 = 1;
        C1336l c1336l = (C1336l) obj;
        switch (i) {
            case 0:
                c1336l.firebase(EnumC10468l.f21324l.pro(), null, new C2911l(8), new C15578l(802480018, true, new C3127l(c17408l, interfaceC2262l, interfaceC12244l)));
                break;
            default:
                final int i4 = 0;
                int i5 = 3;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(759167841, true, new Function3() { // from class: lَؔؓ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = i4;
                        C17408l c17408l2 = c17408l;
                        InterfaceC12244l interfaceC12244l2 = interfaceC12244l;
                        switch (i6) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                                    boolean z = !((C18554l) interfaceC12244l2.getValue()).f36225l;
                                    boolean zAdmob = c6956l.admob(c17408l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == C1867l.yandex) {
                                        objM2132native = new C8224l(c17408l2, 3);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    AbstractC13319l.yandex(AbstractC8317l.admob, AbstractC15788l.yandex(AbstractC9151l.loadAd(interfaceC17242lAmazon, z, null, (Function0) objM2132native, 14), ((C18554l) interfaceC12244l2.getValue()).f36225l ? 0.5f : 1.0f), null, AbstractC14566l.amazon(-654743392, new C12071l(interfaceC12244l2, 1), c6956l), null, null, null, c6956l, 3078, 500);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    c17408l.m4325import(((C18554l) interfaceC12244l2.getValue()).f36225l, ((C18554l) interfaceC12244l2.getValue()).f36226l, !((C18554l) interfaceC12244l2.getValue()).f36223l, ((C18554l) interfaceC12244l2.getValue()).f36221l, ((C18554l) interfaceC12244l2.getValue()).f36217l, c6956l2, 0);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    c17408l2.m4323abstract(0, c6956l3, !((C18554l) interfaceC12244l2.getValue()).f36220l);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                if (((C18554l) interfaceC12244l.getValue()).f36227l == EnumC10468l.BLUR) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1146432346, true, new C16561l(3, c17408l)), 3);
                }
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(184388426, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, 7)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC8317l.firebase, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-299006200, true, new Function3() { // from class: lَؔؓ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = i3;
                        C17408l c17408l2 = c17408l;
                        InterfaceC12244l interfaceC12244l2 = interfaceC12244l;
                        switch (i6) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                                    boolean z = !((C18554l) interfaceC12244l2.getValue()).f36225l;
                                    boolean zAdmob = c6956l.admob(c17408l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == C1867l.yandex) {
                                        objM2132native = new C8224l(c17408l2, 3);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    AbstractC13319l.yandex(AbstractC8317l.admob, AbstractC15788l.yandex(AbstractC9151l.loadAd(interfaceC17242lAmazon, z, null, (Function0) objM2132native, 14), ((C18554l) interfaceC12244l2.getValue()).f36225l ? 0.5f : 1.0f), null, AbstractC14566l.amazon(-654743392, new C12071l(interfaceC12244l2, 1), c6956l), null, null, null, c6956l, 3078, 500);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    c17408l.m4325import(((C18554l) interfaceC12244l2.getValue()).f36225l, ((C18554l) interfaceC12244l2.getValue()).f36226l, !((C18554l) interfaceC12244l2.getValue()).f36223l, ((C18554l) interfaceC12244l2.getValue()).f36221l, ((C18554l) interfaceC12244l2.getValue()).f36217l, c6956l2, 0);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    c17408l2.m4323abstract(0, c6956l3, !((C18554l) interfaceC12244l2.getValue()).f36220l);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-540703513, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, i2)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-782400826, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, 9)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1024098139, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, 10)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1265795452, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, 11)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1507492765, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, 12)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC8317l.smaato, 3);
                final int i6 = 2;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(2049255880, true, new Function3() { // from class: lَؔؓ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i7 = i6;
                        C17408l c17408l2 = c17408l;
                        InterfaceC12244l interfaceC12244l2 = interfaceC12244l;
                        switch (i7) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                                    boolean z = !((C18554l) interfaceC12244l2.getValue()).f36225l;
                                    boolean zAdmob = c6956l.admob(c17408l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == C1867l.yandex) {
                                        objM2132native = new C8224l(c17408l2, 3);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    AbstractC13319l.yandex(AbstractC8317l.admob, AbstractC15788l.yandex(AbstractC9151l.loadAd(interfaceC17242lAmazon, z, null, (Function0) objM2132native, 14), ((C18554l) interfaceC12244l2.getValue()).f36225l ? 0.5f : 1.0f), null, AbstractC14566l.amazon(-654743392, new C12071l(interfaceC12244l2, 1), c6956l), null, null, null, c6956l, 3078, 500);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    c17408l.m4325import(((C18554l) interfaceC12244l2.getValue()).f36225l, ((C18554l) interfaceC12244l2.getValue()).f36226l, !((C18554l) interfaceC12244l2.getValue()).f36223l, ((C18554l) interfaceC12244l2.getValue()).f36221l, ((C18554l) interfaceC12244l2.getValue()).f36217l, c6956l2, 0);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    c17408l2.m4323abstract(0, c6956l3, !((C18554l) interfaceC12244l2.getValue()).f36220l);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1807558567, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, i3)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC8317l.remoteconfig, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1324163941, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, i6)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC8317l.vip, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(840769315, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, i5)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(599072002, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, 4)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(357374689, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, 5)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(115677376, true, new C0447l(c17408l, interfaceC2262l, interfaceC12244l, 6)), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1060l(C17408l c17408l, InterfaceC12244l interfaceC12244l, InterfaceC2262l interfaceC2262l) {
        this.f2937l = c17408l;
        this.f2936l = interfaceC12244l;
        this.f2939l = interfaceC2262l;
    }
}
