package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC18407l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11675l f35950l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f35951l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35952l;

    public RunnableC18407l(C11675l c11675l, long j, int i) {
        this.f35952l = i;
        switch (i) {
            case 1:
                this.f35951l = j;
                this.f35950l = c11675l;
                break;
            default:
                this.f35951l = j;
                Objects.requireNonNull(c11675l);
                this.f35950l = c11675l;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35952l;
        long j = this.f35951l;
        C11675l c11675l = this.f35950l;
        switch (i) {
            case 0:
                C17417l c17417l = (C17417l) c11675l.f833l;
                C16386l c16386l = c17417l.f33944l;
                C17417l.billing(c16386l);
                c16386l.f32056l.purchase(j);
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16918l.loadAd(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                c11675l.mo211l();
                c11675l.m2935l();
                C17417l c17417l2 = (C17417l) c11675l.f833l;
                C8118l c8118l2 = c17417l2.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16918l.yandex("Resetting analytics data (FE)");
                C11569l c11569l = c17417l2.f33932l;
                C17417l.mopub(c11569l);
                c11569l.mo211l();
                C16528l c16528l = c11569l.f23238l;
                ((C1576l) c16528l.f32302l).crashlytics();
                ((C17417l) ((C11569l) c16528l.f32305l).f833l).f33951l.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c16528l.f32303l = jElapsedRealtime;
                c16528l.f32306l = jElapsedRealtime;
                c17417l2.remoteconfig().m2819l();
                boolean z = !c17417l2.yandex();
                C16386l c16386l2 = c17417l2.f33944l;
                C17417l.billing(c16386l2);
                c16386l2.f32042l.purchase(j);
                C17417l c17417l3 = (C17417l) c16386l2.f833l;
                C16386l c16386l3 = c17417l3.f33944l;
                C17417l.billing(c16386l3);
                if (!TextUtils.isEmpty(c16386l3.f32062l.pro())) {
                    c16386l2.f32062l.ad(null);
                }
                c16386l2.f32049l.purchase(0L);
                c16386l2.f32061l.purchase(0L);
                if (!c17417l3.f33945l.m1686l()) {
                    c16386l2.m4178l(z);
                }
                c16386l2.f32047l.ad(null);
                c16386l2.f32050l.purchase(0L);
                c16386l2.f32055l.mopub(null);
                C11860l c11860lFirebase = c17417l2.firebase();
                c11860lFirebase.mo211l();
                c11860lFirebase.m2935l();
                C10462l c10462lM3269l = c11860lFirebase.m3269l(false);
                c11860lFirebase.m3261l();
                ((C17417l) c11860lFirebase.f833l).isPro().m3209l();
                c11860lFirebase.m3267l(new RunnableC4644l(c11860lFirebase, c10462lM3269l, 0));
                C17417l.mopub(c11569l);
                c11569l.f23242l.loadAd();
                c11675l.f23412l = z;
                c17417l2.firebase().m3257l(new AtomicReference());
                break;
        }
    }
}
