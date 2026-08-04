package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8986l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11241l f18535l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18536l;

    public /* synthetic */ C8986l(C11241l c11241l, int i) {
        this.f18536l = i;
        this.f18535l = c11241l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f18536l;
        int i2 = 1;
        C11241l c11241l = this.f18535l;
        switch (i) {
            case 0:
                c11241l.m1773l(c11241l.f22626l);
                return ((C3366l) obj).yandex(new C8986l(c11241l, i2));
            default:
                C6742l c6742l = (C6742l) obj;
                C5616l c5616l = c11241l.f11560l;
                float fFloatValue = c5616l != null ? ((Number) c5616l.amazon()).floatValue() : 0.0f;
                C5228l c5228l = c11241l.f11558l;
                long jM4551private = c6742l.f14144l.f26629l.m4551private();
                float f = c11241l.f11552l;
                C13601l c13601l = c6742l.f14144l;
                float fMo868instanceof = c6742l.mo868instanceof(f);
                float[] fArr = c11241l.f22631l;
                fArr[0] = ((Number) c11241l.f22632l.invoke()).floatValue();
                fArr[1] = ((Number) c11241l.f22629l.invoke()).floatValue();
                fArr[2] = ((Number) c11241l.f22630l.invoke()).floatValue();
                fArr[3] = ((Number) c11241l.f22628l.invoke()).floatValue();
                c5228l.yandex(jM4551private, fMo868instanceof, fArr, fFloatValue, fFloatValue > 0.0f ? c11241l.f11555l.admob() : 0.0f, c6742l.mo868instanceof(c11241l.f11553l), c11241l.f11556l, c11241l.f11554l);
                C5228l c5228l2 = c11241l.f11558l;
                float f2 = c6742l.getLayoutDirection() != EnumC9931l.f20223l ? 180.0f : 0.0f;
                long jMo2070l = c13601l.mo2070l();
                C18449l c18449l = c13601l.f26629l;
                long jM4551private2 = c18449l.m4551private();
                c18449l.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449l.f36010l).advert(f2, jMo2070l);
                    AbstractC9361l.remoteconfig(c6742l, c5228l2.smaato, c11241l.f11561l, 0.0f, c11241l.f11554l, 52);
                    C9902l[] c9902lArr = c5228l2.remoteconfig;
                    if (c9902lArr != null) {
                        for (C9902l c9902l : c9902lArr) {
                            AbstractC9361l.remoteconfig(c6742l, c9902l, c11241l.f11557l, 0.0f, c11241l.f11556l, 52);
                        }
                    }
                    return Unit.INSTANCE;
                } finally {
                    AbstractC0653l.license(c18449l, jM4551private2);
                }
        }
    }
}
