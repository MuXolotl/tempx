package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lۣؗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5251l implements Function4 {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C7091l c7091l = (C7091l) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6956l c6956l = (C6956l) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (c6956l.billing(c7091l) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= c6956l.amazon(iIntValue) ? 32 : 16;
        }
        int i2 = 0;
        int i3 = 1;
        if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
            EnumC14530l enumC14530l = (EnumC14530l) EnumC14530l.f28448l.get(iIntValue);
            c6956l.m2123default(1176299170);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC8020l.smaato(Boolean.valueOf(AbstractC3630l.yandex(enumC14530l)));
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAmazon = c6956l.amazon(enumC14530l.ordinal());
            Object objM2132native2 = c6956l.m2132native();
            if (zAmazon || objM2132native2 == c13863l) {
                objM2132native2 = new C13722l(enumC14530l, interfaceC8714l);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-1575039790, new C0055l(enumC14530l, i2), c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native2, 15), null, AbstractC14566l.amazon(-1607636177, new C0055l(enumC14530l, i3), c6956l), null, AbstractC14566l.amazon(1233944429, new C6640l(enumC14530l, interfaceC8714l, 18), c6956l), null, c6956l, 199686, 468);
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
