package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16978l {
    public static final C6763l yandex;

    static {
        new C6763l(0.2f, 0.0f, 0.8f, 1.0f);
        new C6763l(0.4f, 0.0f, 1.0f, 1.0f);
        new C6763l(0.0f, 0.0f, 0.65f, 1.0f);
        new C6763l(0.1f, 0.0f, 0.45f, 1.0f);
        yandex = new C6763l(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final void loadAd(InterfaceC13349l interfaceC13349l, float f, float f2, long j, C0404l c0404l) {
        float f3 = c0404l.yandex / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) - (2.0f * f3);
        interfaceC13349l.applovin(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (768 & 64) != 0 ? 1.0f : 0.0f, c0404l);
    }

    public static final void yandex(final float f, int i, int i2, final long j, long j2, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        C6956l c6956l2;
        int i3;
        long j3;
        int i4;
        long j4;
        int i5;
        final long j5;
        c6956l.m2133new(-1119119072);
        int i6 = i2 | (c6956l.purchase(j) ? 32 : 16) | 11264;
        if (c6956l.m2127for(i6 & 1, (i6 & 9363) != 9362)) {
            c6956l.m2141switch();
            if ((i2 & 1) == 0 || c6956l.ad()) {
                i4 = i6 & (-57345);
                j4 = C9735l.isPro;
                i5 = 2;
            } else {
                c6956l.m2124else();
                i4 = i6 & (-57345);
                i5 = i;
                j4 = j2;
            }
            c6956l.adcel();
            final C0404l c0404l = new C0404l(((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo868instanceof(f), 0.0f, i5, 0, null, 26);
            C13138l c13138lBilling = AbstractC3586l.billing(c6956l, 1);
            C0010l c0010l = AbstractC3483l.billing;
            C9409l c9409l = AbstractC5341l.amazon;
            final C8456l c8456lLoadAd = AbstractC3586l.loadAd(c13138lBilling, 0, 5, c0010l, AbstractC0532l.purchase(AbstractC0532l.subs(6660, 2, c9409l), 0, 0L, 6), null, c6956l, 33208, 16);
            final C8456l c8456lYandex = AbstractC3586l.yandex(c13138lBilling, 0.0f, 286.0f, AbstractC0532l.purchase(AbstractC0532l.subs(1332, 2, c9409l), 0, 0L, 6), null, c6956l, 4536, 8);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C9673l(7);
                c6956l.m2147try(objM2132native);
            }
            final C8456l c8456lYandex2 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 290.0f, AbstractC0532l.purchase(AbstractC0532l.billing((Function1) objM2132native), 0, 0L, 6), null, c6956l, 4536, 8);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C9673l(8);
                c6956l.m2147try(objM2132native2);
            }
            final C8456l c8456lYandex3 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 290.0f, AbstractC0532l.purchase(AbstractC0532l.billing((Function1) objM2132native2), 0, 0L, 6), null, c6956l, 4536, 8);
            c6956l2 = c6956l;
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC15185l.loadAd(interfaceC17242l), 40.0f);
            boolean zAdmob = c6956l2.admob(c0404l) | c6956l2.billing(c8456lLoadAd) | c6956l2.billing(c8456lYandex2) | c6956l2.billing(c8456lYandex3) | c6956l2.billing(c8456lYandex) | ((((i4 & 112) ^ 48) > 32 && c6956l2.purchase(j)) || (i4 & 48) == 32);
            Object objM2132native3 = c6956l2.m2132native();
            if (zAdmob || objM2132native3 == c13863l) {
                j5 = j4;
                Function1 function1 = new Function1() { // from class: lۛؔ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                        long j6 = j5;
                        C0404l c0404l2 = c0404l;
                        AbstractC16978l.loadAd(interfaceC13349l, 0.0f, 360.0f, j6, c0404l2);
                        float fIntValue = (((Number) c8456lLoadAd.getValue()).intValue() * 216.0f) % 360.0f;
                        float fFloatValue = ((Number) c8456lYandex2.getValue()).floatValue();
                        InterfaceC12244l interfaceC12244l = c8456lYandex3;
                        AbstractC16978l.loadAd(interfaceC13349l, ((Number) interfaceC12244l.getValue()).floatValue() + ((Number) c8456lYandex.getValue()).floatValue() + (fIntValue - 90.0f) + (c0404l2.crashlytics == 0 ? 0.0f : ((f / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) interfaceC12244l.getValue()).floatValue()), 0.1f), j, c0404l2);
                        return Unit.INSTANCE;
                    }
                };
                c6956l2.m2147try(function1);
                objM2132native3 = function1;
            } else {
                j5 = j4;
            }
            AbstractC12155l.yandex(interfaceC17242lIsPro, (Function1) objM2132native3, c6956l2, 0);
            j3 = j5;
            i3 = i5;
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
            i3 = i;
            j3 = j2;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13417l(interfaceC17242l, j, f, j3, i3, i2);
        }
    }
}
