package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ۡؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18263l {
    public static C6162l loadAd;
    public static final Object yandex = new Object();

    public static final boolean admob(C11362l c11362l, Function1 function1) {
        int i;
        AbstractC5030l abstractC5030l;
        Object objInvoke;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        do {
            synchronized (yandex) {
                C1713l c1713l = (C1713l) AbstractC9620l.admob(c11362l.f22912l);
                i = c1713l.amazon;
                abstractC5030l = c1713l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            C0266l c0266lSignatures = abstractC5030l.signatures();
            objInvoke = function1.invoke(c0266lSignatures);
            AbstractC5030l abstractC5030lAdvert = c0266lSignatures.advert();
            if (AbstractC8576l.yandex(abstractC5030lAdvert, abstractC5030l)) {
                break;
            }
            C1713l c1713l2 = c11362l.f22912l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zAmazon = amazon((C1713l) AbstractC9620l.ad(c1713l2, c11362l, abstractC18620lIsPro), i, abstractC5030lAdvert, true);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, c11362l);
        } while (!zAmazon);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final boolean amazon(C1713l c1713l, int i, AbstractC5030l abstractC5030l, boolean z) {
        boolean z2;
        synchronized (yandex) {
            try {
                int i2 = c1713l.amazon;
                if (i2 == i) {
                    c1713l.crashlytics = abstractC5030l;
                    z2 = true;
                    if (z) {
                        c1713l.purchase++;
                    }
                    c1713l.amazon = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final void billing(C17326l c17326l) {
        if (((EnumC2771l) c17326l.f33636l) == EnumC2771l.f6018l) {
            c17326l.onCreate();
        }
    }

    public static final void crashlytics(int i, int i2) {
        if (i < 0 || i >= i2) {
            C18262l.adcel(AbstractC12589l.applovin(i, i2, "index (", ") is out of bound of [0, ", ")"));
        }
    }

    public static final void loadAd(InterfaceC17242l interfaceC17242l, final C17594l c17594l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1922770793);
        int i3 = 2;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c17594l) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if ((i & 3072) == 0) {
            i5 |= c6956l.admob(c15578l) ? 2048 : 1024;
        }
        final int i6 = 0;
        final int i7 = 1;
        if (c6956l.m2127for(i5 & 1, (i5 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = new C5146l(12);
                c6956l.m2147try(objM2132native);
            }
            C11611l c11611l = (C11611l) AbstractC0825l.smaato(objArr, C11611l.smaato, (Function0) objM2132native, c6956l, 384);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = new C0205l(c11611l);
                c6956l.m2147try(objM2132native2);
            }
            final C0205l c0205l = (C0205l) objM2132native2;
            c6956l.m2123default(714821931);
            c6956l.startapp(false);
            Object obj2 = (InterfaceC7948l) c6956l.isPro(AbstractC4751l.billing);
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == obj) {
                objM2132native3 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native3;
            c0205l.f1168l = (InterfaceC1234l) c6956l.isPro(AbstractC4751l.smaato);
            boolean zBilling = c6956l.billing(interfaceC2262l) | c6956l.billing(obj2);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling || objM2132native4 == obj) {
                objM2132native4 = new C10207l(interfaceC2262l, obj2, i4);
                c6956l.m2147try(objM2132native4);
            }
            c0205l.f1172l = (Function1) objM2132native4;
            c0205l.metrica(c17594l.yandex());
            boolean zAdmob = c6956l.admob(c17594l) | c6956l.admob(c0205l);
            Object objM2132native5 = c6956l.m2132native();
            if (zAdmob || objM2132native5 == obj) {
                objM2132native5 = new Function1() { // from class: lٖٗؕ
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [lّؔۜ] */
                    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Object arrayList;
                        int iNextIndex;
                        int i8 = i6;
                        C0205l c0205l2 = c0205l;
                        C17594l c17594l2 = c17594l;
                        switch (i8) {
                            case 0:
                                c17594l2.yandex.setValue((C3242l) obj3);
                                C11611l c11611l2 = c0205l2.f1163l;
                                if (c0205l2.subs() == null || c11611l2.yandex().purchase == 0) {
                                    arrayList = C2580l.f5619l;
                                } else {
                                    arrayList = new ArrayList();
                                    ArrayList arrayListPurchase = c11611l2.purchase(c0205l2.remoteconfig());
                                    ListIterator listIterator = arrayListPurchase.listIterator(arrayListPurchase.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            C3242l c3242l = (C3242l) c11611l2.yandex().purchase(((C18329l) listIterator.previous()).yandex);
                                            if (c3242l != null && c3242l.yandex.loadAd != c3242l.loadAd.loadAd) {
                                                iNextIndex = listIterator.nextIndex();
                                            }
                                        } else {
                                            iNextIndex = -1;
                                        }
                                    }
                                    if (iNextIndex != -1) {
                                        int size = arrayListPurchase.size();
                                        for (int i9 = 0; i9 < size; i9++) {
                                            C18329l c18329l = (C18329l) arrayListPurchase.get(i9);
                                            C3242l c3242l2 = (C3242l) c11611l2.yandex().purchase(c18329l.yandex);
                                            if (c3242l2 != null) {
                                                C3625l c3625lPurchase = c18329l.purchase();
                                                long jLoadAd = AbstractC2296l.loadAd(c3242l2.yandex.loadAd, c3242l2.loadAd.loadAd);
                                                arrayList.add(c3625lPurchase.subSequence(C12814l.mopub(jLoadAd), C12814l.billing(jLoadAd)));
                                            }
                                        }
                                    }
                                }
                                c17594l2.crashlytics.setValue(arrayList);
                                return Unit.INSTANCE;
                            default:
                                C0205l c0205l3 = c17594l2.loadAd;
                                if (c0205l3 != null && c0205l3 != c0205l2) {
                                    C8339l.smaato("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                }
                                if (c0205l3 == null || c0205l3 == c0205l2) {
                                    c17594l2.loadAd = c0205l2;
                                    return new C18616l(c17594l2, c0205l2, 5);
                                }
                                C8339l.smaato("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                return null;
                        }
                    }
                };
                c6956l.m2147try(objM2132native5);
            }
            c0205l.f1169l = new C10207l(c0205l, (Function1) objM2132native5, 5);
            c6956l.m2123default(715702021);
            c0205l.f1158l = AbstractC16692l.loadAd(EnumC16103l.f31559l, null, c6956l, 54);
            c6956l.startapp(false);
            c0205l.f1159l = interfaceC2262l;
            c0205l.firebase();
            C1120l c1120l = new C1120l(c0205l, i3);
            Unit unit = Unit.INSTANCE;
            C15458l c15458l = new C15458l(c0205l, c1120l, i7);
            InterfaceC17242l interfaceC17242lLoadAd = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lPurchase = AbstractC10802l.purchase(AbstractC1782l.yandex(AbstractC8576l.vip(AbstractC9966l.billing(AbstractC8238l.billing(AbstractC1782l.yandex(interfaceC17242lLoadAd, unit, c15458l), new C15531l(c0205l, i4)), c0205l.f1160l), new C15531l(c0205l, 5)).premium(C14786l.f28910l), 8675309, new C7795l(i4, new C15531l(c0205l, 6))), new C17330l(8, c0205l));
            if (c0205l.admob() != null && c0205l.isPro()) {
                C3242l c3242lSubs = c0205l.subs();
                if (!(c3242lSubs == null ? true : AbstractC8576l.yandex(c3242lSubs.yandex, c3242lSubs.loadAd)) && AbstractC11433l.yandex()) {
                    interfaceC17242lLoadAd = AbstractC17541l.loadAd(interfaceC17242lLoadAd, new C16561l(15, c0205l));
                }
            }
            AbstractC11397l.crashlytics(48, AbstractC14566l.amazon(464404577, new C15558l(c0205l, c11611l, c15578l), c6956l), c6956l, interfaceC17242l.premium(AbstractC7280l.yandex(interfaceC17242lPurchase.premium(interfaceC17242lLoadAd), new C1645l(i4, c0205l))));
            boolean zAdmob2 = c6956l.admob(c17594l) | c6956l.admob(c0205l);
            Object objM2132native6 = c6956l.m2132native();
            if (zAdmob2 || objM2132native6 == obj) {
                objM2132native6 = new Function1() { // from class: lٖٗؕ
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [lّؔۜ] */
                    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Object arrayList;
                        int iNextIndex;
                        int i8 = i7;
                        C0205l c0205l2 = c0205l;
                        C17594l c17594l2 = c17594l;
                        switch (i8) {
                            case 0:
                                c17594l2.yandex.setValue((C3242l) obj3);
                                C11611l c11611l2 = c0205l2.f1163l;
                                if (c0205l2.subs() == null || c11611l2.yandex().purchase == 0) {
                                    arrayList = C2580l.f5619l;
                                } else {
                                    arrayList = new ArrayList();
                                    ArrayList arrayListPurchase = c11611l2.purchase(c0205l2.remoteconfig());
                                    ListIterator listIterator = arrayListPurchase.listIterator(arrayListPurchase.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            C3242l c3242l = (C3242l) c11611l2.yandex().purchase(((C18329l) listIterator.previous()).yandex);
                                            if (c3242l != null && c3242l.yandex.loadAd != c3242l.loadAd.loadAd) {
                                                iNextIndex = listIterator.nextIndex();
                                            }
                                        } else {
                                            iNextIndex = -1;
                                        }
                                    }
                                    if (iNextIndex != -1) {
                                        int size = arrayListPurchase.size();
                                        for (int i9 = 0; i9 < size; i9++) {
                                            C18329l c18329l = (C18329l) arrayListPurchase.get(i9);
                                            C3242l c3242l2 = (C3242l) c11611l2.yandex().purchase(c18329l.yandex);
                                            if (c3242l2 != null) {
                                                C3625l c3625lPurchase = c18329l.purchase();
                                                long jLoadAd = AbstractC2296l.loadAd(c3242l2.yandex.loadAd, c3242l2.loadAd.loadAd);
                                                arrayList.add(c3625lPurchase.subSequence(C12814l.mopub(jLoadAd), C12814l.billing(jLoadAd)));
                                            }
                                        }
                                    }
                                }
                                c17594l2.crashlytics.setValue(arrayList);
                                return Unit.INSTANCE;
                            default:
                                C0205l c0205l3 = c17594l2.loadAd;
                                if (c0205l3 != null && c0205l3 != c0205l2) {
                                    C8339l.smaato("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                }
                                if (c0205l3 == null || c0205l3 == c0205l2) {
                                    c17594l2.loadAd = c0205l2;
                                    return new C18616l(c17594l2, c0205l2, 5);
                                }
                                C8339l.smaato("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                return null;
                        }
                    }
                };
                c6956l.m2147try(objM2132native6);
            }
            AbstractC12311l.yandex(c17594l, c0205l, (Function1) objM2132native6, c6956l);
            boolean zAdmob3 = c6956l.admob(c0205l);
            Object objM2132native7 = c6956l.m2132native();
            if (zAdmob3 || objM2132native7 == obj) {
                objM2132native7 = new C15531l(c0205l, i6);
                c6956l.m2147try(objM2132native7);
            }
            AbstractC12311l.loadAd(c0205l, (Function1) objM2132native7, c6956l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(interfaceC17242l, c17594l, c15578l, i, 22);
        }
    }

    public static final void mopub(C17326l c17326l) {
        if (((EnumC2771l) c17326l.f33636l) == EnumC2771l.f6020l) {
            c17326l.purchase();
        }
        if (((EnumC2771l) c17326l.f33636l) == EnumC2771l.f6021l) {
            c17326l.loadAd();
        }
        if (((EnumC2771l) c17326l.f33636l) == EnumC2771l.f6017l) {
            c17326l.onDestroy();
        }
    }

    public static C18662l purchase(InterfaceC17842l interfaceC17842l) {
        C16552l c16552l = AbstractC11463l.yandex;
        C2975l c2975l = AbstractC17278l.yandex;
        if (AbstractC2533l.crashlytics) {
            try {
                c2975l = c2975l.f6462l;
            } catch (UnsupportedOperationException | C13165l unused) {
                AbstractC2533l.crashlytics = false;
            }
        }
        C18662l c18662lYandex = AbstractC11990l.yandex(c2975l);
        InterfaceC12356l interfaceC12356lLoadAd = interfaceC17842l.loadAd();
        if (interfaceC12356lLoadAd.yandex() == EnumC2771l.f6019l) {
            AbstractC11990l.billing(c18662lYandex, null);
        } else {
            interfaceC12356lLoadAd.mopub(new C8633l(2, c18662lYandex));
        }
        return c18662lYandex;
    }

    public static final void subs(C17326l c17326l) {
        billing(c17326l);
        if (((EnumC2771l) c17326l.f33636l) == EnumC2771l.f6017l) {
            c17326l.billing();
        }
    }

    public static final void yandex(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        c6956l.m2133new(1949207773);
        int i2 = i | 6;
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            C13645l c13645l = C17594l.amazon;
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C5146l(14);
                c6956l.m2147try(objM2132native);
            }
            C17594l c17594l = (C17594l) AbstractC0825l.smaato(objArr, c13645l, (Function0) objM2132native, c6956l, 384);
            C4346l c4346l = C4346l.f8873l;
            loadAd(c4346l, c17594l, c15578l, c6956l, 3078);
            interfaceC17242l = c4346l;
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9093l(interfaceC17242l, c15578l, i, i3);
        }
    }
}
