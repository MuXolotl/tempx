package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ؓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17647l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C12015l f34329l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C13250l f34330l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C13250l f34331l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17647l(C12015l c12015l, C13250l c13250l, C13250l c13250l2) {
        super(1, AbstractC6791l.class, "scaleToOffset", "Slider$lambda$3$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f34329l = c12015l;
        this.f34331l = c13250l;
        this.f34330l = c13250l2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C12015l c12015l = this.f34329l;
        float f = c12015l.yandex;
        float f2 = c12015l.loadAd;
        float f3 = this.f34331l.f26029l;
        float f4 = this.f34330l.f26029l;
        float f5 = f2 - f;
        float f6 = f5 == 0.0f ? 0.0f : (fFloatValue - f) / f5;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        return Float.valueOf(AbstractC7572l.firebase(f3, f4, f7));
    }
}
