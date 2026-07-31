package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: renamed from: lؚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0165l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11569l f1112l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f1113l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1114l;

    public RunnableC0165l(C11569l c11569l, long j, int i) {
        this.f1114l = i;
        switch (i) {
            case 1:
                this.f1113l = j;
                Objects.requireNonNull(c11569l);
                this.f1112l = c11569l;
                break;
            default:
                this.f1113l = j;
                Objects.requireNonNull(c11569l);
                this.f1112l = c11569l;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00af  */
    @Override // java.lang.Runnable
    public final void run() {
        long jElapsedRealtime;
        int i = this.f1114l;
        C11569l c11569l = this.f1112l;
        switch (i) {
            case 0:
                C16528l c16528l = c11569l.f23238l;
                c11569l.mo211l();
                c11569l.m3136l();
                C17417l c17417l = (C17417l) c11569l.f833l;
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                C14906l c14906l = c8118l.f16911l;
                long j = this.f1113l;
                c14906l.loadAd(Long.valueOf(j), "Activity resumed, time");
                C5051l c5051l = c17417l.f33945l;
                if (c5051l.m1682l(null, AbstractC5981l.f12660l)) {
                    if (c5051l.m1677l() || c11569l.f23240l) {
                        ((C11569l) c16528l.f32305l).mo211l();
                        ((C1576l) c16528l.f32302l).crashlytics();
                        c16528l.f32303l = j;
                        c16528l.f32306l = j;
                    }
                } else if (c5051l.m1677l()) {
                    ((C11569l) c16528l.f32305l).mo211l();
                    ((C1576l) c16528l.f32302l).crashlytics();
                    c16528l.f32303l = j;
                    c16528l.f32306l = j;
                } else {
                    C16386l c16386l = c17417l.f33944l;
                    C17417l.billing(c16386l);
                    if (c16386l.f32044l.yandex()) {
                        ((C11569l) c16528l.f32305l).mo211l();
                        ((C1576l) c16528l.f32302l).crashlytics();
                        c16528l.f32303l = j;
                        c16528l.f32306l = j;
                    }
                }
                C0848l c0848l = c11569l.f23239l;
                C11569l c11569l2 = (C11569l) c0848l.f2498l;
                c11569l2.mo211l();
                RunnableC10273l runnableC10273l = (RunnableC10273l) c0848l.f2499l;
                if (runnableC10273l != null) {
                    c11569l2.f23241l.removeCallbacks(runnableC10273l);
                }
                C16386l c16386l2 = ((C17417l) c11569l2.f833l).f33944l;
                C17417l.billing(c16386l2);
                c16386l2.f32044l.loadAd(false);
                c11569l2.mo211l();
                c11569l2.f23240l = false;
                C16948l c16948l = c11569l.f23242l;
                C11569l c11569l3 = (C11569l) c16948l.f33057l;
                c11569l3.mo211l();
                C17417l c17417l2 = (C17417l) c11569l3.f833l;
                boolean zYandex = c17417l2.yandex();
                C18450l c18450l = c17417l2.f33951l;
                if (zYandex) {
                    c18450l.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (c17417l2.f33945l.m1682l(null, AbstractC5981l.f12677l)) {
                        c18450l.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
                        jElapsedRealtime = 0;
                    }
                    c16948l.crashlytics(jCurrentTimeMillis, jElapsedRealtime);
                    break;
                }
                break;
            default:
                c11569l.mo211l();
                c11569l.m3136l();
                C17417l c17417l3 = (C17417l) c11569l.f833l;
                C8118l c8118l2 = c17417l3.f33950l;
                C17417l.admob(c8118l2);
                C14906l c14906l2 = c8118l2.f16911l;
                long j2 = this.f1113l;
                c14906l2.loadAd(Long.valueOf(j2), "Activity paused, time");
                C0848l c0848l2 = c11569l.f23239l;
                C11569l c11569l4 = (C11569l) c0848l2.f2498l;
                ((C17417l) c11569l4.f833l).f33951l.getClass();
                RunnableC10273l runnableC10273l2 = new RunnableC10273l(c0848l2, System.currentTimeMillis(), j2);
                c0848l2.f2499l = runnableC10273l2;
                c11569l4.f23241l.postDelayed(runnableC10273l2, 2000L);
                if (c17417l3.f33945l.m1677l()) {
                    ((C1576l) c11569l.f23238l.f32302l).crashlytics();
                }
                break;
        }
    }
}
