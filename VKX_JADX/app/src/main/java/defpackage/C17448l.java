package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٕٗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17448l implements InterfaceC3587l {
    public final C11183l yandex;

    public C17448l(C11183l c11183l) {
        this.yandex = c11183l;
    }

    @Override // defpackage.InterfaceC3587l
    public final void yandex(C6742l c6742l) {
        InterfaceC1220l interfaceC1220l = AbstractC13958l.yandex;
        C11183l c11183l = this.yandex;
        C12870l c12870l = c11183l.f22478l;
        if (!c12870l.yandex()) {
            c12870l = null;
        }
        if (c12870l == null) {
            c12870l = c11183l.f22481l.purchase;
            if (!c12870l.yandex()) {
                c12870l = null;
            }
            if (c12870l == null) {
                c12870l = c11183l.f22482l.purchase;
            }
        }
        if (!c12870l.yandex()) {
            c12870l = null;
        }
        if (c12870l == null) {
            c12870l = (C12870l) AbstractC16901l.m4217extends(AbstractC13958l.billing(c11183l));
            if (c12870l != null) {
                AbstractC9544l abstractC9544l = c12870l.crashlytics;
                float fAmazon = AbstractC13958l.amazon(c11183l);
                if (Float.isNaN(fAmazon)) {
                    fAmazon = 0.0f;
                }
                if (abstractC9544l == null) {
                    if (Float.isNaN(fAmazon)) {
                        C9946l c9946l = AbstractC1844l.yandex;
                        fAmazon = 20.0f;
                    }
                    long j = c12870l.yandex;
                    float fAmazon2 = C9735l.amazon(j) * ((fAmazon / 72.0f) + 1.0f);
                    if (fAmazon2 > 1.0f) {
                        fAmazon2 = 1.0f;
                    }
                    c12870l = new C12870l(C9735l.loadAd(fAmazon2, j), c12870l.loadAd, abstractC9544l);
                }
            } else {
                c12870l = null;
            }
            if (c12870l == null) {
                return;
            }
        }
        float f = c11183l.f22500l;
        if (f >= 1.0f) {
            C10417l c10417l = c11183l.f22487l;
            AbstractC13359l.amazon(c6742l, c12870l, c11183l, 0L, c6742l.admob(), c10417l != null ? AbstractC17551l.yandex(c10417l) : null);
            return;
        }
        InterfaceC3685l interfaceC3685l = (InterfaceC3685l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.mopub);
        C11925l c11925lCrashlytics = interfaceC3685l.crashlytics();
        try {
            c11925lCrashlytics.billing(f);
            c6742l.subscription(AbstractC14707l.billing(c6742l.admob()), c11925lCrashlytics, new C3768l(c12870l, this, 23));
            AbstractC2576l.loadAd(c6742l, c11925lCrashlytics);
            Unit unit = Unit.INSTANCE;
        } finally {
            interfaceC3685l.yandex(c11925lCrashlytics);
        }
    }

    @Override // defpackage.InterfaceC3587l
    public final /* bridge */ void loadAd() {
    }
}
