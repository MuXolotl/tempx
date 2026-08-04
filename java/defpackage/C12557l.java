package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lِّۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12557l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18449l f24741l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24742l;

    public /* synthetic */ C12557l(C18449l c18449l, int i) {
        this.f24742l = i;
        this.f24741l = c18449l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f24742l;
        C18449l c18449l = this.f24741l;
        switch (i) {
            case 0:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC15451l) ? 4 : 2;
                }
                int i2 = 1;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (objM2132native == c13863l) {
                        objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
                        c6956l.m2147try(objM2132native);
                    }
                    InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
                    Unit unit = Unit.INSTANCE;
                    Object objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = new C3917l(interfaceC8714l, null, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
                    boolean zBooleanValue = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                    C3000l c3000lPurchase = AbstractC4523l.purchase(AbstractC0532l.subs(500, 6, null), 2);
                    C8896l c8896l = AbstractC11922l.yandex;
                    AbstractC3308l.crashlytics(interfaceC15451l, zBooleanValue, null, c3000lPurchase.yandex(new C3000l(new C3313l((C4610l) null, new C5487l(new C4693l(2, C16274l.f31870l), AbstractC0532l.admob(0.0f, 400.0f, new C5177l(4294967297L), 1)), (C15457l) null, (C11700l) null, (LinkedHashMap) null, 125))), null, null, AbstractC14566l.amazon(-685820229, new C12557l(c18449l, i2), c6956l), c6956l, (iIntValue & 14) | 1575936, 26);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj3).getClass();
                c18449l.adcel((C12606l) c18449l.f36009l, (C6956l) obj2, 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
