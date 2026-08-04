package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؒٔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1045l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9987l f2905l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f2906l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2907l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f2908l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C13492l f2909l;

    public /* synthetic */ C1045l(InterfaceC6407l interfaceC6407l, float f, C9987l c9987l, C13492l c13492l) {
        this.f2908l = interfaceC6407l;
        this.f2906l = f;
        this.f2905l = c9987l;
        this.f2909l = c13492l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        int i = this.f2907l;
        C13492l c13492l = this.f2909l;
        C9987l c9987l = this.f2905l;
        float f2 = this.f2906l;
        Object obj = this.f2908l;
        switch (i) {
            case 0:
                C12123l c12123l = (C12123l) obj;
                C4565l c4565l = C4565l.subs;
                int i2 = c9987l.f20387l;
                C2549l c2549l = c13492l.f26496l;
                c2549l.getClass();
                C4565l c4565lYandex = AbstractC13041l.yandex(i2);
                C9902l c9902l = c12123l.yandex;
                InterfaceC6848l interfaceC6848l = c12123l.loadAd;
                float f3 = c12123l.crashlytics;
                c9902l.subs();
                c9902l.isPro(1);
                interfaceC6848l.admob(c9902l, f3, c4565lYandex);
                if (c2549l.yandex.billing) {
                    int i3 = c9987l.f20387l;
                    if (i3 == 0) {
                        f = 0.0f;
                    } else if (i3 != 1) {
                        f = i3 != 2 ? 180.0f : 90.0f;
                    } else {
                        f = -90.0f;
                    }
                    float f4 = f2 / 2.0f;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                    c9902l.smaato((-9223372034707292160L) ^ jFloatToRawIntBits);
                    float[] fArrYandex = C10924l.yandex();
                    C10924l.billing(fArrYandex, f);
                    c9902l.firebase(fArrYandex);
                    c9902l.smaato(jFloatToRawIntBits);
                }
                c9987l.f20387l = (c9987l.f20387l + 1) % 3;
                return c9902l;
            default:
                C4565l c4565l2 = C4565l.subs;
                int i4 = c9987l.f20387l;
                C2549l c2549l2 = c13492l.f26496l;
                c2549l2.getClass();
                AbstractC9544l abstractC9544lYandex = ((InterfaceC6407l) obj).yandex(f2, AbstractC13041l.yandex(i4));
                int i5 = c9987l.f20387l + 1;
                c2549l2.getClass();
                c9987l.f20387l = i5 % 3;
                return abstractC9544lYandex;
        }
    }

    public /* synthetic */ C1045l(C12123l c12123l, C9987l c9987l, C13492l c13492l, float f) {
        this.f2908l = c12123l;
        this.f2905l = c9987l;
        this.f2909l = c13492l;
        this.f2906l = f;
    }
}
