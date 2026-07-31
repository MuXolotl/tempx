package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.AbstractC11965l;
import defpackage.AbstractC12148l;
import defpackage.AbstractC13950l;
import defpackage.AbstractC15560l;
import defpackage.C0350l;
import defpackage.C10771l;
import defpackage.C13161l;
import defpackage.C13432l;
import defpackage.C14513l;
import defpackage.C14529l;
import defpackage.C4875l;
import defpackage.C5633l;
import defpackage.C5648l;
import defpackage.C8339l;
import defpackage.InterfaceC18230l;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC18230l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String f478l = C14513l.applovin("SystemJobService");

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C13432l f481l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C5633l f482l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HashMap f480l = new HashMap();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13161l f479l = new C13161l(27, false);

    public static C0350l crashlytics(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C0350l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static void yandex(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C8339l.smaato(AbstractC15560l.Signature("Cannot invoke ", str, " on a background thread"));
    }

    @Override // defpackage.InterfaceC18230l
    public final void loadAd(C0350l c0350l, boolean z) {
        yandex("onExecuted");
        C14513l.tapsense().vip(f478l, c0350l.yandex + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f480l.remove(c0350l);
        this.f479l.inmobi(c0350l);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C13432l c13432lCrashlytics = C13432l.crashlytics(getApplicationContext());
            this.f481l = c13432lCrashlytics;
            C5648l c5648l = c13432lCrashlytics.billing;
            this.f482l = new C5633l(c5648l, c13432lCrashlytics.amazon, 3);
            c5648l.yandex(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                C14513l.tapsense().appmetrica(f478l, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                C4875l.remoteconfig("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C13432l c13432l = this.f481l;
        if (c13432l != null) {
            c13432l.billing.mopub(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C14529l c14529l;
        yandex("onStartJob");
        C13432l c13432l = this.f481l;
        String str = f478l;
        if (c13432l == null) {
            C14513l.tapsense().vip(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C0350l c0350lCrashlytics = crashlytics(jobParameters);
        if (c0350lCrashlytics == null) {
            C14513l.tapsense().startapp(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f480l;
        if (map.containsKey(c0350lCrashlytics)) {
            C14513l.tapsense().vip(str, "Job is already being executed by SystemJobService: " + c0350lCrashlytics);
            return false;
        }
        C14513l.tapsense().vip(str, "onStartJob for " + c0350lCrashlytics);
        map.put(c0350lCrashlytics, jobParameters);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            c14529l = new C14529l(14);
            if (AbstractC11965l.startapp(jobParameters) != null) {
                Arrays.asList(AbstractC11965l.startapp(jobParameters));
            }
            if (AbstractC11965l.metrica(jobParameters) != null) {
                Arrays.asList(AbstractC11965l.metrica(jobParameters));
            }
            if (i >= 28) {
                AbstractC13950l.pro(jobParameters);
            }
        } else {
            c14529l = null;
        }
        this.f482l.yandex(this.f479l.m3577catch(c0350lCrashlytics), c14529l);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        yandex("onStopJob");
        if (this.f481l == null) {
            C14513l.tapsense().vip(f478l, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C0350l c0350lCrashlytics = crashlytics(jobParameters);
        if (c0350lCrashlytics == null) {
            C14513l.tapsense().startapp(f478l, "WorkSpec id not found!");
            return false;
        }
        C14513l.tapsense().vip(f478l, "onStopJob for " + c0350lCrashlytics);
        this.f480l.remove(c0350lCrashlytics);
        C10771l c10771lInmobi = this.f479l.inmobi(c0350lCrashlytics);
        if (c10771lInmobi != null) {
            this.f482l.loadAd(c10771lInmobi, Build.VERSION.SDK_INT >= 31 ? AbstractC12148l.subscription(jobParameters) : -512);
        }
        C5648l c5648l = this.f481l.billing;
        String str = c0350lCrashlytics.yandex;
        synchronized (c5648l.firebase) {
            zContains = c5648l.subs.contains(str);
        }
        return !zContains;
    }
}
