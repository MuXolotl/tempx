package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًَۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7916l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18449l f16497l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16498l;

    public /* synthetic */ C7916l(C18449l c18449l, int i) {
        this.f16498l = i;
        this.f16497l = c18449l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i = this.f16498l;
        C18449l c18449l = this.f16497l;
        int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7876l.yandex(null, AbstractC14566l.amazon(359417967, new C7916l(c18449l, i2), c6956l), c6956l, 48, 1);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c6956l2.m2123default(-485754360);
                    InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob);
                    boolean zBilling = c6956l2.billing(interfaceC13490l);
                    Object objM2132native = c6956l2.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zBilling || objM2132native == c13863l) {
                        obj3 = objM2132native;
                        C11037l c11037l = new C11037l(interfaceC13490l, 1);
                        c6956l2.m2147try(c11037l);
                        obj3 = c11037l;
                    }
                    Function1 function1 = (Function1) obj3;
                    c6956l2.startapp(false);
                    Object[] objArr = new Object[0];
                    C13645l c13645l = new C13645l(new C14813l((byte) 0, 10), new C0786l(13, function1), 13);
                    boolean zAmazon = c6956l2.amazon(2) | c6956l2.billing(function1);
                    Object objM2132native2 = c6956l2.m2132native();
                    Object obj4 = objM2132native2;
                    if (zAmazon || objM2132native2 == c13863l) {
                        C8652l c8652l = new C8652l(EnumC12805l.f25184l, function1, 29);
                        c6956l2.m2147try(c8652l);
                        obj4 = c8652l;
                    }
                    C7463l c7463l = (C7463l) AbstractC0825l.smaato(objArr, c13645l, (Function0) obj4, c6956l2, 0);
                    boolean zAdmob = c6956l2.admob(c7463l) | c6956l2.admob(c18449l);
                    Object objM2132native3 = c6956l2.m2132native();
                    Object obj5 = objM2132native3;
                    if (zAdmob || objM2132native3 == c13863l) {
                        C10263l c10263l = new C10263l(c7463l, c18449l, (InterfaceC14029l) null);
                        c6956l2.m2147try(c10263l);
                        obj5 = c10263l;
                    }
                    AbstractC12311l.amazon(c6956l2, c7463l, (Function2) obj5);
                    Unit unit = Unit.INSTANCE;
                    boolean zAdmob2 = c6956l2.admob(c18449l) | c6956l2.admob(c7463l);
                    Object objM2132native4 = c6956l2.m2132native();
                    Object obj6 = objM2132native4;
                    if (zAdmob2 || objM2132native4 == c13863l) {
                        C10263l c10263l2 = new C10263l(c18449l, c7463l, (InterfaceC14029l) null);
                        c6956l2.m2147try(c10263l2);
                        obj6 = c10263l2;
                    }
                    AbstractC12311l.amazon(c6956l2, unit, (Function2) obj6);
                    AbstractC9168l.yandex(c7463l, null, false, false, false, null, AbstractC14566l.amazon(-1730933101, new C12557l(c18449l, z ? 1 : 0), c6956l2), c6956l2, 12582968);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
