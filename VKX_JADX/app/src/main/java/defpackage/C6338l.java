package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌؙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6338l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2169l f13290l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13291l;

    public /* synthetic */ C6338l(C2169l c2169l, int i) {
        this.f13291l = i;
        this.f13290l = c2169l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f13291l;
        C13863l c13863l = C1867l.yandex;
        final C2169l c2169l = this.f13290l;
        boolean z = true;
        byte b = 0;
        switch (i) {
            case 0:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zAdmob = c6956l.admob(c2169l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        final byte b2 = b == true ? 1 : 0;
                        objM2132native = new Function1() { // from class: lؙؕۤ
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i2 = b2;
                                C2169l c2169l2 = c2169l;
                                int i3 = 0;
                                int i4 = 1;
                                switch (i2) {
                                    case 0:
                                        C10086l c10086l = c2169l2.f4812l;
                                        C1336l c1336l = (C1336l) obj4;
                                        if (((Boolean) c2169l2.f4813l.getValue()).booleanValue()) {
                                            AbstractC1757l.appmetrica(c1336l, null, null, AbstractC7709l.loadAd, 3);
                                        }
                                        if (!((InterfaceC13238l) c2169l2.f4811l.getValue()).isEmpty()) {
                                            AbstractC1757l.appmetrica(c1336l, null, null, AbstractC7709l.crashlytics, 3);
                                            AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(862655110, true, new C6338l(c2169l2, i4)), 3);
                                        }
                                        if (!((InterfaceC13238l) c10086l.getValue()).isEmpty()) {
                                            AbstractC1757l.appmetrica(c1336l, null, null, AbstractC7709l.amazon, 3);
                                            AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(691815653, true, new C6338l(c2169l2, 2)), 3);
                                            InterfaceC13238l interfaceC13238l = (InterfaceC13238l) c10086l.getValue();
                                            c1336l.firebase(((AbstractC7095l) interfaceC13238l).pro(), null, new C5640l(interfaceC13238l, 7, false), new C15578l(802480018, true, new C1131l(interfaceC13238l, c2169l2, i3)));
                                        }
                                        break;
                                    default:
                                        InterfaceC13238l interfaceC13238l2 = (InterfaceC13238l) c2169l2.f4811l.getValue();
                                        ((C1336l) obj4).firebase(((AbstractC7095l) interfaceC13238l2).pro(), null, new C5640l(interfaceC13238l2, 8, false), new C15578l(802480018, true, new C1131l(interfaceC13238l2, c2169l2, i4)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(null, null, interfaceC11780l, null, null, null, false, null, (Function1) objM2132native, c6956l, (iIntValue << 6) & 896, 507);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C17253l c17253lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    boolean zAdmob2 = c6956l2.admob(c2169l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        final boolean z2 = z ? 1 : 0;
                        objM2132native2 = new Function1() { // from class: lؙؕۤ
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i2 = z2;
                                C2169l c2169l2 = c2169l;
                                int i3 = 0;
                                int i4 = 1;
                                switch (i2) {
                                    case 0:
                                        C10086l c10086l = c2169l2.f4812l;
                                        C1336l c1336l = (C1336l) obj4;
                                        if (((Boolean) c2169l2.f4813l.getValue()).booleanValue()) {
                                            AbstractC1757l.appmetrica(c1336l, null, null, AbstractC7709l.loadAd, 3);
                                        }
                                        if (!((InterfaceC13238l) c2169l2.f4811l.getValue()).isEmpty()) {
                                            AbstractC1757l.appmetrica(c1336l, null, null, AbstractC7709l.crashlytics, 3);
                                            AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(862655110, true, new C6338l(c2169l2, i4)), 3);
                                        }
                                        if (!((InterfaceC13238l) c10086l.getValue()).isEmpty()) {
                                            AbstractC1757l.appmetrica(c1336l, null, null, AbstractC7709l.amazon, 3);
                                            AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(691815653, true, new C6338l(c2169l2, 2)), 3);
                                            InterfaceC13238l interfaceC13238l = (InterfaceC13238l) c10086l.getValue();
                                            c1336l.firebase(((AbstractC7095l) interfaceC13238l).pro(), null, new C5640l(interfaceC13238l, 7, false), new C15578l(802480018, true, new C1131l(interfaceC13238l, c2169l2, i3)));
                                        }
                                        break;
                                    default:
                                        InterfaceC13238l interfaceC13238l2 = (InterfaceC13238l) c2169l2.f4811l.getValue();
                                        ((C1336l) obj4).firebase(((AbstractC7095l) interfaceC13238l2).pro(), null, new C5640l(interfaceC13238l2, 8, false), new C15578l(802480018, true, new C1131l(interfaceC13238l2, c2169l2, i4)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC16336l.loadAd(null, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native2, c6956l2, 24960, 491);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                    boolean zAdmob3 = c6956l3.admob(c2169l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C10740l(3, c2169l);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC13319l.yandex(AbstractC7709l.purchase, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native3, 15), null, null, AbstractC7709l.billing, null, null, c6956l3, 24582, 492);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
