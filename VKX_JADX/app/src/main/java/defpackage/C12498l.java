package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍّۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12498l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8998l f24637l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24638l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12498l(C8998l c8998l, int i) {
        super(0);
        this.f24638l = i;
        this.f24637l = c8998l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f24638l;
        C8998l c8998l = this.f24637l;
        switch (i) {
            case 0:
                float f = 0.0f;
                if (((C10712l) c8998l.f18551l.getValue()) != null) {
                    float fFloatValue = ((Number) c8998l.f18552l.getValue()).floatValue();
                    C10086l c10086l = c8998l.f18548l;
                    if (fFloatValue < 0.0f) {
                        if (c10086l.getValue() != null) {
                            C18725l.loadAd();
                            return null;
                        }
                    } else {
                        if (c10086l.getValue() != null) {
                            C18725l.loadAd();
                            return null;
                        }
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            case 1:
                C10086l c10086l2 = c8998l.f18552l;
                return Float.valueOf((((Boolean) c8998l.f18549l.getValue()).booleanValue() && c8998l.billing() % 2 == 0) ? -((Number) c10086l2.getValue()).floatValue() : ((Number) c10086l2.getValue()).floatValue());
            default:
                return Boolean.valueOf(c8998l.billing() == ((Number) c8998l.f18542l.getValue()).intValue() && ((Number) c8998l.f18553l.getValue()).floatValue() == c8998l.purchase());
        }
    }
}
