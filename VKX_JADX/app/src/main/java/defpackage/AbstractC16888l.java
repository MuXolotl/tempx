package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16888l {
    public static final C6763l yandex = new C6763l(0.4f, 0.0f, 0.2f, 1.0f);

    public static final void yandex(InterfaceC17242l interfaceC17242l, final long j, final float f, final float f2, C6956l c6956l, final int i, final int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        C6956l c6956l2;
        final InterfaceC17242l interfaceC17242l3;
        InterfaceC17242l interfaceC17242l4;
        c6956l.m2133new(-398914254);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            interfaceC17242l2 = interfaceC17242l;
        } else if ((i & 6) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i | (c6956l.billing(interfaceC17242l2) ? 4 : 2);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i;
        }
        int i5 = i3 | (c6956l.purchase(j) ? 32 : 16);
        if (c6956l.m2127for(i5 & 1, (i5 & 1171) != 1170)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                interfaceC17242l4 = i4 != 0 ? C4346l.f8873l : interfaceC17242l2;
            } else {
                c6956l.m2124else();
                interfaceC17242l4 = interfaceC17242l2;
            }
            c6956l.adcel();
            C0404l c0404l = new C0404l(((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo868instanceof(f), 0.0f, 2, 0, null, 26);
            C13138l c13138lBilling = AbstractC3586l.billing(c6956l, 1);
            C0010l c0010l = AbstractC3483l.billing;
            C9409l c9409l = AbstractC5341l.amazon;
            boolean z = true;
            C8456l c8456lLoadAd = AbstractC3586l.loadAd(c13138lBilling, 0, 5, c0010l, AbstractC0532l.purchase(AbstractC0532l.subs(6660, 2, c9409l), 0, 0L, 6), null, c6956l, 33208, 16);
            C8456l c8456lYandex = AbstractC3586l.yandex(c13138lBilling, 0.0f, 286.0f, AbstractC0532l.purchase(AbstractC0532l.subs(1332, 2, c9409l), 0, 0L, 6), null, c6956l, 4536, 8);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C9673l(25);
                c6956l.m2147try(objM2132native);
            }
            C8456l c8456lYandex2 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 290.0f, AbstractC0532l.purchase(AbstractC0532l.billing((Function1) objM2132native), 0, 0L, 6), null, c6956l, 4536, 8);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C9673l(27);
                c6956l.m2147try(objM2132native2);
            }
            C8456l c8456lYandex3 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 290.0f, AbstractC0532l.purchase(AbstractC0532l.billing((Function1) objM2132native2), 0, 0L, 6), null, c6956l, 4536, 8);
            c6956l2 = c6956l;
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC15185l.loadAd(interfaceC17242l4), f2);
            boolean zBilling = c6956l2.billing(c8456lLoadAd) | c6956l2.billing(c8456lYandex2) | c6956l2.billing(c8456lYandex3) | c6956l2.billing(c8456lYandex);
            if ((((i5 & 112) ^ 48) <= 32 || !c6956l2.purchase(j)) && (i5 & 48) != 32) {
                z = false;
            }
            boolean zAdmob = zBilling | z | c6956l2.admob(c0404l);
            Object objM2132native3 = c6956l2.m2132native();
            if (zAdmob || objM2132native3 == c13863l) {
                C10140l c10140l = new C10140l(c8456lLoadAd, c8456lYandex2, c8456lYandex3, c8456lYandex, f, f2, j, c0404l, 0);
                c6956l2.m2147try(c10140l);
                objM2132native3 = c10140l;
            }
            AbstractC12155l.yandex(interfaceC17242lIsPro, (Function1) objM2132native3, c6956l2, 0);
            interfaceC17242l3 = interfaceC17242l4;
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lِؑؑ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC16888l.yandex(interfaceC17242l3, j, f, f2, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
