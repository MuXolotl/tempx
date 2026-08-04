package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؕۗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3575l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15661l f7504l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0324l f7505l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7506l;

    public /* synthetic */ C3575l(C0324l c0324l, C15661l c15661l, int i) {
        this.f7506l = i;
        this.f7505l = c0324l;
        this.f7504l = c15661l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f7506l;
        C15661l c15661l = this.f7504l;
        C0324l c0324l = this.f7505l;
        switch (i) {
            case 0:
                C3346l c3346l = c15661l.loadAd;
                int i2 = c3346l.yandex;
                long j = c3346l.loadAd;
                c0324l.crashlytics.invoke(Integer.valueOf(i2), Long.valueOf(j), c3346l.advert, c3346l.amazon);
                break;
            default:
                C3346l c3346l2 = c15661l.loadAd;
                int i3 = c3346l2.yandex;
                long j2 = c3346l2.loadAd;
                c0324l.crashlytics.invoke(Integer.valueOf(i3), Long.valueOf(j2), c3346l2.advert, c3346l2.amazon);
                break;
        }
        return Unit.INSTANCE;
    }
}
