package defpackage;

/* JADX INFO: renamed from: lٍۦؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9946l implements InterfaceC6347l {
    public final /* synthetic */ int yandex;
    public static final C9946l loadAd = new C9946l(0);
    public static final C9946l crashlytics = new C9946l(1);

    public /* synthetic */ C9946l(int i) {
        this.yandex = i;
    }

    public String toString() {
        switch (this.yandex) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC6347l
    public final AbstractC15342l yandex(long j, EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l) {
        switch (this.yandex) {
            case 0:
                float fMo870l = interfaceC13490l.mo870l(30.0f);
                return new C13080l(new C8896l(0.0f, -fMo870l, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo870l));
            case 1:
                float fMo870l2 = interfaceC13490l.mo870l(30.0f);
                return new C13080l(new C8896l(-fMo870l2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fMo870l2, Float.intBitsToFloat((int) (j & 4294967295L))));
            case 2:
                return new C13080l(AbstractC7470l.isPro(0L, j));
            default:
                C9902l c9902lYandex = AbstractC3478l.yandex();
                int i = (int) (j >> 32);
                int i2 = (int) (j & 4294967295L);
                c9902lYandex.billing(Float.intBitsToFloat(i) * 0.99f, Float.intBitsToFloat(i2) * 0.01f);
                float fMo868instanceof = interfaceC13490l.mo868instanceof(8.0f);
                float fMo868instanceof2 = interfaceC13490l.mo868instanceof(24.0f);
                float f = fMo868instanceof2 / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat(i) * 0.99f;
                float fIntBitsToFloat2 = (Float.intBitsToFloat(i2) * 0.01f) + fMo868instanceof;
                float fIntBitsToFloat3 = (Float.intBitsToFloat(i) * 0.99f) - (Float.intBitsToFloat(i) * 0.01f);
                float f2 = fIntBitsToFloat3 / fMo868instanceof2;
                float fFloor = (float) Math.floor(f2);
                if (f2 != fFloor) {
                    f = (fIntBitsToFloat3 / fFloor) / 2.0f;
                }
                float f3 = fIntBitsToFloat2 - fMo868instanceof;
                c9902lYandex.purchase(fIntBitsToFloat - f, f3);
                for (int i3 = 1; i3 < fFloor; i3++) {
                    fIntBitsToFloat = (fIntBitsToFloat - f) - f;
                    c9902lYandex.purchase(fIntBitsToFloat, f3);
                    c9902lYandex.purchase(fIntBitsToFloat - f, f3);
                }
                c9902lYandex.purchase((fIntBitsToFloat - f) - f, f3);
                c9902lYandex.purchase(Float.intBitsToFloat(i) * 0.01f, Float.intBitsToFloat(i2) * 0.99f);
                float fIntBitsToFloat4 = (Float.intBitsToFloat(i2) * 0.99f) - fMo868instanceof;
                float fIntBitsToFloat5 = Float.intBitsToFloat(i) * 0.01f;
                float f4 = fIntBitsToFloat4 + fMo868instanceof;
                c9902lYandex.purchase(fIntBitsToFloat5, f4);
                float f5 = fIntBitsToFloat4 - fMo868instanceof;
                c9902lYandex.purchase(fIntBitsToFloat5 + f, f5);
                for (int i4 = 1; i4 < fFloor; i4++) {
                    fIntBitsToFloat5 = fIntBitsToFloat5 + f + f;
                    c9902lYandex.purchase(fIntBitsToFloat5, f4);
                    c9902lYandex.purchase(fIntBitsToFloat5 + f, f5);
                }
                c9902lYandex.purchase(fIntBitsToFloat5 + f + f, f4);
                c9902lYandex.loadAd();
                return new C13616l(c9902lYandex);
        }
    }
}
