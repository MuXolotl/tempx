package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؘٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5666l implements Function4 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f12055l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12056l;

    public C5666l(InterfaceC8714l interfaceC8714l) {
        this.f12056l = 1;
        C13083l c13083l = EnumC3503l.f7397l;
        this.f12055l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.f12056l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj5 = this.f12055l;
        int i5 = 2;
        int i6 = 4;
        int i7 = 1;
        int i8 = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        switch (i4) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                C16553l c16553l = (C16553l) obj5;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
                    C14092l c14092l = EnumC6358l.f13324l;
                    EnumC6358l enumC6358l = (EnumC6358l) c14092l.get(iIntValue);
                    c6956l.m2123default(-577923842);
                    C15578l c15578lAmazon = AbstractC14566l.amazon(-1814216078, new C0976l(i7, enumC6358l), c6956l);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob = c6956l.admob(c16553l) | c6956l.amazon(enumC6358l.ordinal());
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C0340l(c16553l, enumC6358l, b == true ? 1 : 0, i5);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13319l.yandex(c15578lAmazon, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, null, null, null, c6956l, 6, 508);
                    if (enumC6358l.ordinal() != AbstractC14055l.smaato(c14092l)) {
                        c6956l.m2123default(-576934013);
                        AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                    } else {
                        c6956l.m2123default(-581120594);
                    }
                    c6956l.startapp(false);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj5;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l2.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l2.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    EnumC3503l enumC3503l = (EnumC3503l) EnumC3503l.f7400l.get(iIntValue3);
                    c6956l2.m2123default(547616688);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling = c6956l2.billing(interfaceC8714l) | c6956l2.amazon(enumC3503l.ordinal());
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zBilling || objM2132native2 == c13863l) {
                        objM2132native2 = new C0340l(enumC3503l, interfaceC8714l, b2 == true ? 1 : 0, 21);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC13319l.yandex(AbstractC14566l.amazon(799600340, new C0976l(i6, enumC3503l), c6956l2), AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, null, AbstractC14566l.amazon(891734105, new C6640l(enumC3503l, interfaceC8714l, 7), c6956l2), null, c6956l2, 196614, 476);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C7091l c7091l3 = (C7091l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C6956l c6956l3 = (C6956l) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                C5124l c5124l = (C5124l) obj5;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (c6956l3.billing(c7091l3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= c6956l3.amazon(iIntValue5) ? 32 : 16;
                }
                if (c6956l3.m2127for(i3 & 1, (i3 & 147) != 146)) {
                    EnumC12334l enumC12334l = (EnumC12334l) EnumC12334l.f24421l.get(iIntValue5);
                    c6956l3.m2123default(260766200);
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob2 = c6956l3.admob(c5124l) | c6956l3.amazon(enumC12334l.ordinal());
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C10558l(c5124l, enumC12334l, b3 == true ? 1 : 0);
                        c6956l3.m2147try(objM2132native3);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15);
                    int i9 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC14566l.amazon(783699200, new C0539l(enumC12334l, i8), c6956l3), interfaceC17242lLoadAd, null, AbstractC14566l.amazon(-1478373667, new C0539l(enumC12334l, i7), c6956l3), null, AbstractC14566l.amazon(1308545051, new C6640l(c5124l, enumC12334l, 19), c6956l3), AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l3, 510), c6956l3, 199686, 404);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5666l(InterfaceC3177l interfaceC3177l, int i) {
        this.f12056l = i;
        this.f12055l = interfaceC3177l;
    }
}
