package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: l٘ٔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17921l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5056l f34889l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34890l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17921l(C5056l c5056l, int i) {
        super(0);
        this.f34890l = i;
        this.f34889l = c5056l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jSubs;
        long j;
        int i = this.f34890l;
        float fCrashlytics = 0.0f;
        C5056l c5056l = this.f34889l;
        switch (i) {
            case 0:
                return Boolean.valueOf(c5056l.firebase.getValue() != null);
            case 1:
                return c5056l.yandex.m1707abstract();
            case 2:
                C5371l c5371lAmazon = c5056l.amazon();
                if (c5371lAmazon != null) {
                    C13161l c13161lM1707abstract = c5056l.yandex.m1707abstract();
                    C1644l c1644l = (C1644l) c13161lM1707abstract.f25776l;
                    int iOrdinal = c13161lM1707abstract.vip().ordinal();
                    if (iOrdinal == 0) {
                        jSubs = c1644l.subs() & 4294967295L;
                    } else {
                        if (iOrdinal != 1) {
                            C18725l.billing();
                            return null;
                        }
                        jSubs = c1644l.subs() >> 32;
                    }
                    long jLoadAd = c5371lAmazon.loadAd();
                    fCrashlytics = (((int) jSubs) - AbstractC12272l.crashlytics(AbstractC2296l.yandex((int) (jLoadAd >> 32), (int) (jLoadAd & 4294967295L)), c5056l.billing())) - 1.0f;
                }
                return Float.valueOf(fCrashlytics);
            case 3:
                C5371l c5371lAmazon2 = c5056l.amazon();
                if (c5371lAmazon2 != null) {
                    long jLoadAd2 = c5371lAmazon2.loadAd();
                    float fCrashlytics2 = AbstractC12272l.crashlytics(AbstractC2296l.yandex((int) (jLoadAd2 >> 32), (int) (jLoadAd2 & 4294967295L)), c5056l.billing());
                    long jCrashlytics = c5371lAmazon2.crashlytics();
                    int iOrdinal2 = c5056l.billing().ordinal();
                    if (iOrdinal2 == 0) {
                        j = jCrashlytics & 4294967295L;
                    } else {
                        if (iOrdinal2 != 1) {
                            C18725l.billing();
                            return null;
                        }
                        j = jCrashlytics >> 32;
                    }
                    fCrashlytics = (fCrashlytics2 + ((int) j)) - 1.0f;
                }
                return Float.valueOf(fCrashlytics);
            default:
                return c5056l.billing();
        }
    }
}
