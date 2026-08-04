package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؕۗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3572l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f7499l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18554l f7500l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7501l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C17408l f7502l;

    public /* synthetic */ C3572l(C18554l c18554l, InterfaceC2262l interfaceC2262l, C17408l c17408l, int i) {
        this.f7501l = i;
        this.f7500l = c18554l;
        this.f7499l = interfaceC2262l;
        this.f7502l = c17408l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f7501l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        int i2 = 2;
        final C17408l c17408l = this.f7502l;
        final InterfaceC2262l interfaceC2262l = this.f7499l;
        C18554l c18554l = this.f7500l;
        final int i3 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.settings_now_playing_blur_material);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    boolean zAdmob = c6956l.admob(c18554l) | c6956l.admob(interfaceC2262l) | c6956l.admob(c17408l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new Ctransient(c18554l, interfaceC2262l, c17408l, 28);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 511);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC17122l.purchase(AbstractC3605l.remoteconfig(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 8.0f), 0.0f, AbstractC14566l.amazon(2058178363, new C3572l(c18554l, interfaceC2262l, c17408l, i2), c6956l2), c6956l2, 390);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C0275l c0275l = (C0275l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(c0275l) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    EnumC14810l enumC14810l = c18554l.f36222l;
                    EnumC14810l enumC14810l2 = EnumC14810l.LIGHT;
                    boolean z2 = enumC14810l == enumC14810l2;
                    boolean zAdmob2 = c6956l3.admob(interfaceC2262l) | c6956l3.admob(c17408l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new Function0() { // from class: lؘؕٔ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4 = i3;
                                C17408l c17408l2 = c17408l;
                                InterfaceC2262l interfaceC2262l2 = interfaceC2262l;
                                switch (i4) {
                                    case 0:
                                        AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C13129l(c17408l2, null), 3);
                                        break;
                                    default:
                                        AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C3601l(c17408l2, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native2);
                    }
                    C7069l c7069l = C7069l.yandex;
                    int i4 = iIntValue3 & 14;
                    AbstractC17122l.crashlytics(c0275l, z2, (Function0) objM2132native2, C7069l.crashlytics(0, 2, c6956l3), null, false, null, null, null, null, AbstractC8317l.loadAd, c6956l3, i4, 1016);
                    boolean z3 = c18554l.f36222l != enumC14810l2;
                    boolean zAdmob3 = c6956l3.admob(interfaceC2262l) | c6956l3.admob(c17408l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        final int i5 = z ? 1 : 0;
                        objM2132native3 = new Function0() { // from class: lؘؕٔ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i6 = i5;
                                C17408l c17408l2 = c17408l;
                                InterfaceC2262l interfaceC2262l2 = interfaceC2262l;
                                switch (i6) {
                                    case 0:
                                        AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C13129l(c17408l2, null), 3);
                                        break;
                                    default:
                                        AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C3601l(c17408l2, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC17122l.crashlytics(c0275l, z3, (Function0) objM2132native3, C7069l.crashlytics(1, 2, c6956l3), null, false, null, null, null, null, AbstractC8317l.crashlytics, c6956l3, i4, 1016);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
