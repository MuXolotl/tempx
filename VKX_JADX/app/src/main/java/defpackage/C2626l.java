package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: lؔٔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2626l extends AbstractC10618l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public JobScheduler f5726l;

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final int m1232l() {
        C17417l c17417l = (C17417l) this.f833l;
        m2935l();
        mo211l();
        if (this.f5726l == null) {
            return 7;
        }
        Boolean boolM1685l = c17417l.f33945l.m1685l("google_analytics_sgtm_upload_enabled");
        if (!(boolM1685l == null ? false : boolM1685l.booleanValue())) {
            return 8;
        }
        if (c17417l.remoteconfig().f20214l < 119000) {
            return 6;
        }
        if (!C17410l.m4342l(c17417l.f33936l, "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return 3;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return !c17417l.firebase().m3263l() ? 5 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void m1233l(long j) {
        C17417l c17417l = (C17417l) this.f833l;
        m2935l();
        mo211l();
        JobScheduler jobScheduler = this.f5726l;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(c17417l.f33936l.getPackageName())).hashCode()) != null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.yandex("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iM1232l = m1232l();
        if (iM1232l != 2) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16911l.loadAd(AbstractC9029l.applovin(iM1232l), "[sgtm] Not eligible for Scion upload");
            return;
        }
        C8118l c8118l3 = c17417l.f33950l;
        C17417l.admob(c8118l3);
        c8118l3.f16911l.loadAd(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(c17417l.f33936l.getPackageName())).hashCode(), new ComponentName(c17417l.f33936l, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f5726l;
        AbstractC1051l.subs(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        C8118l c8118l4 = c17417l.f33950l;
        C17417l.admob(c8118l4);
        c8118l4.f16911l.loadAd(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    @Override // defpackage.AbstractC10618l
    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final boolean mo1234l() {
        return true;
    }
}
