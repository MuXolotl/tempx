package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lّْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4855l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7650l f9910l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9911l;

    public /* synthetic */ C4855l(C7650l c7650l, int i) {
        this.f9911l = i;
        this.f9910l = c7650l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f9911l;
        C13863l c13863l = C1867l.yandex;
        C7650l c7650l = this.f9910l;
        int i2 = 1;
        switch (i) {
            case 0:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    boolean zAdmob = c6956l.admob(c7650l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C0783l(i2, c7650l);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(null, null, interfaceC11780l, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, ((iIntValue << 6) & 896) | 24576, 491);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Unit unit = Unit.INSTANCE;
                    boolean zAdmob2 = c6956l2.admob(c7650l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C1669l(c7650l, null, 1);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC12311l.amazon(c6956l2, unit, (Function2) objM2132native2);
                    AbstractC7209l.yandex(null, false, 0L, c6956l2, 0, 7);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
