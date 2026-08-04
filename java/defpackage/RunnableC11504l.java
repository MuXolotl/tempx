package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lًُۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11504l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11675l f23124l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f23125l;

    public RunnableC11504l(C11675l c11675l, boolean z) {
        this.f23125l = z;
        Objects.requireNonNull(c11675l);
        this.f23124l = c11675l;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    @Override // java.lang.Runnable
    public final void run() {
        C11675l c11675l = this.f23124l;
        C17417l c17417l = (C17417l) c11675l.f833l;
        boolean zYandex = c17417l.yandex();
        boolean z = false;
        boolean z2 = c17417l.f33941l != null && c17417l.f33941l.booleanValue();
        boolean z3 = this.f23125l;
        c17417l.f33941l = Boolean.valueOf(z3);
        if (z2 == z3) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.loadAd(Boolean.valueOf(z3), "Default data collection state already set to");
        }
        if (c17417l.yandex() != zYandex) {
            boolean zYandex2 = c17417l.yandex();
            if (c17417l.f33941l != null && c17417l.f33941l.booleanValue()) {
                z = true;
            }
            if (zYandex2 != z) {
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16914l.crashlytics(Boolean.valueOf(z3), Boolean.valueOf(zYandex), "Default data collection is different than actual status");
            }
        } else {
            C8118l c8118l3 = c17417l.f33950l;
            C17417l.admob(c8118l3);
            c8118l3.f16914l.crashlytics(Boolean.valueOf(z3), Boolean.valueOf(zYandex), "Default data collection is different than actual status");
        }
        c11675l.m3203l();
    }
}
