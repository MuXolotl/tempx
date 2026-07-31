package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3973l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5073l f8161l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8162l;

    public /* synthetic */ C3973l(C5073l c5073l, int i) {
        this.f8162l = i;
        this.f8161l = c5073l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f8162l;
        C4346l c4346l = C4346l.f8873l;
        final int i2 = 2;
        C13863l c13863l = C1867l.yandex;
        final C5073l c5073l = this.f8161l;
        boolean z = false;
        final int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                    boolean z2 = ((C18364l) c5073l.f11086l.getValue()).f35878l;
                    boolean zBilling = c6956l.billing(c5073l);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        final int i4 = z ? 1 : 0;
                        objM2132native = new Function1() { // from class: lؕۥؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i5 = i4;
                                C5073l c5073l2 = c5073l;
                                Boolean bool = (Boolean) obj4;
                                switch (i5) {
                                    case 0:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), bool.booleanValue(), false, 0, 0, null, 62));
                                        break;
                                    case 1:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, bool.booleanValue(), 0, 0, null, 61));
                                        break;
                                    case 2:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), bool.booleanValue(), 0.0f, 6));
                                        break;
                                    default:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), bool.booleanValue(), 0.0f, 6));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13402l.yandex(z2, (Function1) objM2132native, AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), c6956l, 384);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z3 = ((C18364l) c5073l.f11086l.getValue()).f35877l;
                    boolean zBilling2 = c6956l2.billing(c5073l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        objM2132native2 = new Function1() { // from class: lؕۥؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i5 = i3;
                                C5073l c5073l2 = c5073l;
                                Boolean bool = (Boolean) obj4;
                                switch (i5) {
                                    case 0:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), bool.booleanValue(), false, 0, 0, null, 62));
                                        break;
                                    case 1:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, bool.booleanValue(), 0, 0, null, 61));
                                        break;
                                    case 2:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), bool.booleanValue(), 0.0f, 6));
                                        break;
                                    default:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), bool.booleanValue(), 0.0f, 6));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC11028l.admob(AbstractC15788l.crashlytics, AbstractC15788l.amazon, z3, (Function1) objM2132native2, c6956l2, 54);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean z4 = ((C15744l) c5073l.f11086l.getValue()).f30927l;
                    boolean zBilling3 = c6956l3.billing(c5073l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zBilling3 || objM2132native3 == c13863l) {
                        objM2132native3 = new Function1() { // from class: lؕۥؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i5 = i2;
                                C5073l c5073l2 = c5073l;
                                Boolean bool = (Boolean) obj4;
                                switch (i5) {
                                    case 0:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), bool.booleanValue(), false, 0, 0, null, 62));
                                        break;
                                    case 1:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, bool.booleanValue(), 0, 0, null, 61));
                                        break;
                                    case 2:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), bool.booleanValue(), 0.0f, 6));
                                        break;
                                    default:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), bool.booleanValue(), 0.0f, 6));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC13402l.yandex(z4, (Function1) objM2132native3, AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), c6956l3, 384);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean z5 = ((C15744l) c5073l.f11086l.getValue()).f30927l;
                    boolean zBilling4 = c6956l4.billing(c5073l);
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zBilling4 || objM2132native4 == c13863l) {
                        final int i5 = 3;
                        objM2132native4 = new Function1() { // from class: lؕۥؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i6 = i5;
                                C5073l c5073l2 = c5073l;
                                Boolean bool = (Boolean) obj4;
                                switch (i6) {
                                    case 0:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), bool.booleanValue(), false, 0, 0, null, 62));
                                        break;
                                    case 1:
                                        c5073l2.setValue(C18364l.loadAd((C18364l) c5073l2.f11086l.getValue(), false, bool.booleanValue(), 0, 0, null, 61));
                                        break;
                                    case 2:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), bool.booleanValue(), 0.0f, 6));
                                        break;
                                    default:
                                        c5073l2.setValue(C15744l.loadAd((C15744l) c5073l2.f11086l.getValue(), bool.booleanValue(), 0.0f, 6));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l4.m2147try(objM2132native4);
                    }
                    AbstractC13402l.yandex(z5, (Function1) objM2132native4, AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), c6956l4, 384);
                } else {
                    c6956l4.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
