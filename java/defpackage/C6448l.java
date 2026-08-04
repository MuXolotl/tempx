package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: lؙٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6448l extends AbstractC10491l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Integer f13473l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AlarmManager f13474l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C1576l f13475l;

    public C6448l(C6901l c6901l) {
        super(c6901l);
        this.f13474l = (AlarmManager) ((C17417l) this.f833l).f33936l.getSystemService("alarm");
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final PendingIntent m2006l() {
        Context context = ((C17417l) this.f833l).f33936l;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC14415l.yandex);
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final void m2007l() {
        m2927l();
        C8118l c8118l = ((C17417l) this.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16911l.yandex("Unscheduling upload");
        AlarmManager alarmManager = this.f13474l;
        if (alarmManager != null) {
            alarmManager.cancel(m2006l());
        }
        m2008l().crashlytics();
        if (Build.VERSION.SDK_INT >= 24) {
            m2009l();
        }
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final AbstractC9654l m2008l() {
        if (this.f13475l == null) {
            this.f13475l = new C1576l(this, this.f13233l.f14473l, 1);
        }
        return this.f13475l;
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final void m2009l() {
        JobScheduler jobScheduler = (JobScheduler) ((C17417l) this.f833l).f33936l.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m2010l());
        }
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final int m2010l() {
        if (this.f13473l == null) {
            this.f13473l = Integer.valueOf("measurement".concat(String.valueOf(((C17417l) this.f833l).f33936l.getPackageName())).hashCode());
        }
        return this.f13473l.intValue();
    }

    @Override // defpackage.AbstractC10491l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final void mo1780l() {
        AlarmManager alarmManager = this.f13474l;
        if (alarmManager != null) {
            alarmManager.cancel(m2006l());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m2009l();
        }
    }
}
