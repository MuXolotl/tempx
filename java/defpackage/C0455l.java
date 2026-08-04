package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٜؑۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0455l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5124l f1685l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1686l;

    public /* synthetic */ C0455l(C5124l c5124l, int i) {
        this.f1686l = i;
        this.f1685l = c5124l;
    }

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
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f1686l;
        int i2 = 3;
        int i3 = 2;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        C5124l c5124l = this.f1685l;
        boolean z = false;
        int i4 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.uma_header_mix_type);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    boolean zAdmob = c6956l.admob(c5124l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C6977l(c5124l, i4);
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
                    c5124l.m1693break((EnumC12334l) c5124l.f11156l.getValue(), AbstractC0080l.purchase(AbstractC0080l.amazon(c4346l, 1.0f), 250.0f), c6956l2, 48);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC3383l.yandex(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), null, null, null, null, AbstractC14566l.amazon(-1563970251, new C0455l(c5124l, 7), c6956l3), c6956l3, 196614, 30);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c5124l.m1699public(R.string.uma_radio_by_artist, 0, c6956l4);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    boolean zAdmob2 = c6956l5.admob(c5124l);
                    Object objM2132native2 = c6956l5.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C6977l(c5124l, i3);
                        c6956l5.m2147try(objM2132native2);
                    }
                    c5124l.m1701this((Function1) objM2132native2, c6956l5, 0);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    c5124l.m1699public(R.string.uma_radio_by_tag, 0, c6956l6);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    boolean zAdmob3 = c6956l7.admob(c5124l);
                    Object objM2132native3 = c6956l7.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C6977l(c5124l, i2);
                        c6956l7.m2147try(objM2132native3);
                    }
                    c5124l.m1701this((Function1) objM2132native3, c6956l7, 0);
                } else {
                    c6956l7.m2124else();
                }
                break;
            default:
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob4 = c6956l8.admob(c5124l);
                    Object objM2132native4 = c6956l8.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C6599l(c5124l, z ? 1 : 0);
                        c6956l8.m2147try(objM2132native4);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native4, 15);
                    int i5 = AbstractC15548l.yandex;
                    long j = C9735l.isPro;
                    AbstractC13319l.yandex(AbstractC17943l.loadAd, interfaceC17242lLoadAd, null, null, null, AbstractC17943l.crashlytics, AbstractC15548l.yandex(j, AbstractC13106l.purchase(c6956l8).adcel, 0L, AbstractC13106l.purchase(c6956l8).subscription, c6956l8, 476), c6956l8, 196614, 412);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l8, 0, 7);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob5 = c6956l8.admob(c5124l);
                    Object objM2132native5 = c6956l8.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        objM2132native5 = new C6599l(c5124l, i3);
                        c6956l8.m2147try(objM2132native5);
                    }
                    AbstractC13319l.yandex(AbstractC17943l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native5, 15), null, null, null, AbstractC17943l.purchase, AbstractC15548l.yandex(j, AbstractC13106l.purchase(c6956l8).adcel, 0L, AbstractC13106l.purchase(c6956l8).subscription, c6956l8, 476), c6956l8, 196614, 412);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l8, 0, 7);
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob6 = c6956l8.admob(c5124l);
                    Object objM2132native6 = c6956l8.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l) {
                        objM2132native6 = new C6599l(c5124l, 4);
                        c6956l8.m2147try(objM2132native6);
                    }
                    AbstractC13319l.yandex(AbstractC17943l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native6, 15), null, null, null, AbstractC17943l.mopub, AbstractC15548l.yandex(j, AbstractC13106l.purchase(c6956l8).adcel, 0L, AbstractC13106l.purchase(c6956l8).subscription, c6956l8, 476), c6956l8, 196614, 412);
                } else {
                    c6956l8.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
