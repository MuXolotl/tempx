package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٜۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12960l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f25409l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f25410l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25411l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f25412l;

    public /* synthetic */ C12960l(C2643l c2643l, float f, Function1 function1) {
        this.f25411l = 4;
        this.f25409l = c2643l;
        this.f25410l = f;
        this.f25412l = function1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fc A[PHI: r12
  0x00fc: PHI (r12v10 float) = (r12v9 float), (r12v17 float) binds: [B:35:0x0110, B:29:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue;
        int i = this.f25411l;
        float f = 0.0f;
        float f2 = this.f25410l;
        Object obj2 = this.f25412l;
        Object obj3 = this.f25409l;
        switch (i) {
            case 0:
                C14115l c14115l = (C14115l) obj3;
                C0534l c0534l = (C0534l) obj2;
                C6742l c6742l = (C6742l) obj;
                c6742l.yandex();
                C18449l c18449l = c6742l.f14144l.f26629l;
                long jM4551private = c18449l.m4551private();
                c18449l.m4555synchronized().mopub();
                try {
                    C16543l c16543l = (C16543l) c18449l.f36010l;
                    c16543l.inmobi(f2, 0.0f);
                    c16543l.advert(45.0f, 0L);
                    AbstractC9361l.isPro(c6742l, c14115l, 0L, 0.0f, c0534l, 46);
                    return Unit.INSTANCE;
                } finally {
                    AbstractC0653l.license(c18449l, jM4551private);
                }
            case 1:
                C13250l c13250l = (C13250l) obj3;
                C5092l c5092l = (C5092l) obj2;
                C14734l c14734l = (C14734l) obj;
                if (f2 > 0.0f) {
                    fFloatValue = ((Number) c14734l.purchase.getValue()).floatValue();
                    if (fFloatValue > f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                } else if (f2 < 0.0f) {
                    fFloatValue = ((Number) c14734l.purchase.getValue()).floatValue();
                    if (fFloatValue < f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                }
                float f3 = f - c13250l.f26029l;
                if (f3 != c5092l.yandex(f3) || f != ((Number) c14734l.purchase.getValue()).floatValue()) {
                    c14734l.yandex();
                }
                c13250l.f26029l += f3;
                return Unit.INSTANCE;
            case 2:
                C11625l c11625l = (C11625l) obj3;
                C1530l c1530l = (C1530l) obj2;
                C3366l c3366l = (C3366l) obj;
                long jAdmob = c3366l.f7169l.admob();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c3366l.f7169l.admob() >> 32));
                C12015l c12015l = c11625l.loadAd;
                float f4 = c12015l.yandex;
                float f5 = c12015l.loadAd;
                float fAmazon = AbstractC8576l.amazon(c11625l.amazon.admob(), f4, f5);
                float f6 = f5 - f4;
                return c3366l.yandex(new C4693l(0, new C16914l(c1530l, this.f25410l, C14174l.yandex(AbstractC8576l.amazon(f6 == 0.0f ? 0.0f : (fAmazon - f4) / f6, 0.0f, 1.0f) * fIntBitsToFloat, jAdmob), 1)));
            case 3:
                AbstractC10113l abstractC10113l = (AbstractC10113l) obj3;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                C5616l c5616l = ((C0412l) obj2).f1530l;
                AbstractC9601l.smaato(abstractC9601l, abstractC10113l, c5616l != null ? (int) ((Number) c5616l.amazon()).floatValue() : (int) f2, 0);
                return Unit.INSTANCE;
            default:
                C2643l c2643l = (C2643l) obj3;
                Function1 function1 = (Function1) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (c2643l.loadAd == Long.MIN_VALUE) {
                    c2643l.loadAd = jLongValue;
                }
                float f7 = c2643l.purchase;
                C11951l c11951l = new C11951l(f7);
                C11951l c11951l2 = C2643l.billing;
                long jMo1832volatile = f2 == 0.0f ? c2643l.yandex.mo1832volatile(new C11951l(f7), c11951l2, c2643l.crashlytics) : AbstractC5573l.subscription((jLongValue - c2643l.loadAd) / f2);
                float f8 = ((C11951l) c2643l.yandex.mo1831throws(jMo1832volatile, c11951l, c11951l2, c2643l.crashlytics)).yandex;
                c2643l.crashlytics = (C11951l) c2643l.yandex.subscription(jMo1832volatile, c11951l, c11951l2, c2643l.crashlytics);
                c2643l.loadAd = jLongValue;
                float f9 = c2643l.purchase - f8;
                c2643l.purchase = f8;
                function1.invoke(Float.valueOf(f9));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C12960l(float f, Object obj, Object obj2, int i) {
        this.f25411l = i;
        this.f25410l = f;
        this.f25409l = obj;
        this.f25412l = obj2;
    }

    public /* synthetic */ C12960l(Object obj, Object obj2, float f, int i) {
        this.f25411l = i;
        this.f25409l = obj;
        this.f25412l = obj2;
        this.f25410l = f;
    }
}
