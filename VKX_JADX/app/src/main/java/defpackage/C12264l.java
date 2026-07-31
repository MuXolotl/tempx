package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lِۧٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12264l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C17136l f24326l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f24327l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24328l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f24329l;

    public /* synthetic */ C12264l(List list, C17136l c17136l, InterfaceC8714l interfaceC8714l, int i) {
        this.f24328l = i;
        this.f24327l = list;
        this.f24326l = c17136l;
        this.f24329l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.f24328l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        List list = this.f24327l;
        InterfaceC8714l interfaceC8714l = this.f24329l;
        int i4 = 1;
        int i5 = 0;
        switch (i3) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
                    C11359l c11359l = (C11359l) list.get(iIntValue);
                    c6956l.m2123default(2001823287);
                    boolean zYandex = AbstractC8576l.yandex(c11359l.yandex, ((C3554l) interfaceC8714l.getValue()).f7471l);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    C15578l c15578lAmazon = AbstractC14566l.amazon(-74934590, new C11693l(c11359l, i4), c6956l);
                    C15578l c15578lAmazon2 = AbstractC14566l.amazon(-359483365, new C0600l(c11359l, i4), c6956l);
                    boolean zBilling = c6956l.billing(interfaceC8714l);
                    C17136l c17136l = this.f24326l;
                    boolean zAdmob = zBilling | c6956l.admob(c17136l) | c6956l.admob(c11359l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C16168l(c17136l, c11359l, interfaceC8714l, 1);
                        c6956l.m2147try(objM2132native);
                    }
                    c17136l.m4272public(c15578lAmazon, c15578lAmazon2, zYandex, (Function0) objM2132native, interfaceC17242lAmazon, AbstractC14566l.amazon(640240671, new C6640l(c17136l, c11359l, 6), c6956l), c6956l, 221238, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l2.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l2.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    C11359l c11359l2 = (C11359l) list.get(iIntValue3);
                    c6956l2.m2123default(1561623520);
                    boolean zYandex2 = AbstractC8576l.yandex(c11359l2.yandex, ((C3554l) interfaceC8714l.getValue()).f7471l);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    C15578l c15578lAmazon3 = AbstractC14566l.amazon(1088440889, new C11693l(c11359l2, i5), c6956l2);
                    C15578l c15578lAmazon4 = AbstractC14566l.amazon(-1779992238, new C0600l(c11359l2, i5), c6956l2);
                    boolean zBilling2 = c6956l2.billing(interfaceC8714l);
                    C17136l c17136l2 = this.f24326l;
                    boolean zAdmob2 = zBilling2 | c6956l2.admob(c17136l2) | c6956l2.admob(c11359l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C16168l(c17136l2, c11359l2, interfaceC8714l, 0);
                        c6956l2.m2147try(objM2132native2);
                    }
                    c17136l2.m4272public(c15578lAmazon3, c15578lAmazon4, zYandex2, (Function0) objM2132native2, interfaceC17242lAmazon2, null, c6956l2, 24630, 32);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
