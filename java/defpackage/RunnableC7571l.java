package defpackage;

/* JADX INFO: renamed from: lؚۡؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7571l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f15581l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10771l f15582l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5648l f15583l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f15584l;

    public RunnableC7571l(C5648l c5648l, C10771l c10771l, boolean z, int i) {
        this.f15583l = c5648l;
        this.f15582l = c10771l;
        this.f15581l = z;
        this.f15584l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zSubs;
        C11120l c11120lLoadAd;
        boolean z = this.f15581l;
        C5648l c5648l = this.f15583l;
        C10771l c10771l = this.f15582l;
        if (z) {
            int i = this.f15584l;
            c5648l.getClass();
            String str = c10771l.yandex.yandex;
            synchronized (c5648l.firebase) {
                c11120lLoadAd = c5648l.loadAd(str);
            }
            zSubs = C5648l.purchase(str, c11120lLoadAd, i);
        } else {
            zSubs = c5648l.subs(c10771l, this.f15584l);
        }
        C14513l.tapsense().vip(C14513l.applovin("StopWorkRunnable"), "StopWorkRunnable for " + this.f15582l.yandex.yandex + "; Processor.stopWork = " + zSubs);
    }
}
