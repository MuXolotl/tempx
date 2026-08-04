package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11598l {
    public static final C1644l yandex = new C1644l(null, 0, false, 0.0f, new C1983l(1), 0.0f, false, AbstractC11990l.yandex(C17218l.f33421l), AbstractC17463l.yandex(), AbstractC7563l.loadAd(0, 0, 0, 0, 15), C2580l.f5619l, 0, 0, 0, EnumC7283l.f15126l, 0, 0);

    public static final C5866l yandex(final int i, int i2, C6956l c6956l) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        C13645l c13645l = C5866l.advert;
        boolean zAmazon = c6956l.amazon(i) | c6956l.amazon(0);
        Object objM2132native = c6956l.m2132native();
        if (zAmazon || objM2132native == C1867l.yandex) {
            objM2132native = new Function0() { // from class: lٖٜۡ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new C5866l(i, 0);
                }
            };
            c6956l.m2147try(objM2132native);
        }
        return (C5866l) AbstractC0825l.smaato(objArr, c13645l, (Function0) objM2132native, c6956l, 0);
    }
}
