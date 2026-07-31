package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0392l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2701l f1495l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1496l;

    public /* synthetic */ C0392l(C2701l c2701l, int i) {
        this.f1496l = i;
        this.f1495l = c2701l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        int i = this.f1496l;
        int i2 = 0;
        C2701l c2701l = this.f1495l;
        switch (i) {
            case 0:
                C6742l c6742l = (C6742l) obj;
                C5616l c5616l = c2701l.f11560l;
                float fFloatValue = c5616l != null ? ((Number) c5616l.amazon()).floatValue() : 0.0f;
                C5228l c5228l = c2701l.f11558l;
                long jM4551private = c6742l.f14144l.f26629l.m4551private();
                float f2 = c2701l.f11552l;
                C13601l c13601l = c6742l.f14144l;
                c5228l.yandex(jM4551private, c6742l.mo868instanceof(f2), c2701l.m1237l(), fFloatValue, fFloatValue > 0.0f ? c2701l.f11555l.admob() : 0.0f, c6742l.mo868instanceof(c2701l.f11553l), c2701l.f11556l, c2701l.f11554l);
                C5228l c5228l2 = c2701l.f11558l;
                f = c6742l.getLayoutDirection() != EnumC9931l.f20223l ? 180.0f : 0.0f;
                long jMo2070l = c13601l.mo2070l();
                C18449l c18449l = c13601l.f26629l;
                long jM4551private2 = c18449l.m4551private();
                c18449l.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449l.f36010l).advert(f, jMo2070l);
                    AbstractC9361l.remoteconfig(c6742l, c5228l2.smaato, c2701l.f11561l, 0.0f, c2701l.f11554l, 52);
                    C9902l[] c9902lArr = c5228l2.remoteconfig;
                    if (c9902lArr != null) {
                        for (C9902l c9902l : c9902lArr) {
                            AbstractC9361l.remoteconfig(c6742l, c9902l, c2701l.f11557l, 0.0f, c2701l.f11556l, 52);
                        }
                    }
                    AbstractC0825l.yandex(c6742l, c2701l.m1237l()[1], c6742l.admob(), c2701l.f5850l, c5228l2.vip, c2701l.f11554l, c2701l.f11557l);
                    return Unit.INSTANCE;
                } finally {
                    AbstractC0653l.license(c18449l, jM4551private2);
                }
            default:
                C3366l c3366l = (C3366l) obj;
                float fFloatValue2 = ((Number) c2701l.f5851l.invoke()).floatValue();
                if (fFloatValue2 < 0.0f) {
                    fFloatValue2 = 0.0f;
                }
                if (fFloatValue2 > 1.0f) {
                    fFloatValue2 = 1.0f;
                }
                float fFloatValue3 = ((Number) c2701l.f5853l.invoke(Float.valueOf(fFloatValue2))).floatValue();
                f = fFloatValue3 >= 0.0f ? fFloatValue3 : 0.0f;
                c2701l.m1773l(f <= 1.0f ? f : 1.0f);
                return c3366l.yandex(new C0392l(c2701l, i2));
        }
    }
}
