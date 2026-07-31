package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lٌٟۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9133l implements InterfaceC15402l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final String f18776l = C14513l.applovin("SystemJobScheduler");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14449l f18777l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final JobScheduler f18778l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f18779l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C12211l f18780l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final WorkDatabase f18781l;

    public C9133l(Context context, WorkDatabase workDatabase, C12211l c12211l) {
        JobScheduler jobSchedulerYandex = AbstractC2691l.yandex(context);
        C14449l c14449l = new C14449l(context, c12211l.amazon, c12211l.smaato);
        this.f18779l = context;
        this.f18778l = jobSchedulerYandex;
        this.f18777l = c14449l;
        this.f18781l = workDatabase;
        this.f18780l = c12211l;
    }

    public static ArrayList billing(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = AbstractC2691l.yandex;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C14513l.tapsense().ads(AbstractC2691l.yandex, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static ArrayList loadAd(Context context, JobScheduler jobScheduler, String str) {
        ArrayList<JobInfo> arrayListBilling = billing(context, jobScheduler);
        if (arrayListBilling == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : arrayListBilling) {
            C0350l c0350lMopub = mopub(jobInfo);
            if (c0350lMopub != null && str.equals(c0350lMopub.yandex)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static C0350l mopub(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C0350l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static void yandex(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C14513l.tapsense().ads(f18776l, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public final void admob(C7718l c7718l, int i) throws IOException {
        List<JobInfo> allPendingJobs;
        String str;
        JobInfo jobInfoYandex = this.f18777l.yandex(c7718l, i);
        C14513l c14513lTapsense = C14513l.tapsense();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str2 = c7718l.yandex;
        sb.append(str2);
        sb.append("Job ID ");
        sb.append(i);
        String string = sb.toString();
        String str3 = f18776l;
        c14513lTapsense.vip(str3, string);
        try {
            if (this.f18778l.schedule(jobInfoYandex) == 0) {
                C14513l.tapsense().appmetrica(str3, "Unable to schedule work ID " + str2);
                if (c7718l.adcel && c7718l.ads == 1) {
                    c7718l.adcel = false;
                    C14513l.tapsense().vip(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    admob(c7718l, i);
                }
            }
        } catch (IllegalStateException e) {
            String str4 = AbstractC2691l.yandex;
            int i2 = Build.VERSION.SDK_INT;
            int i3 = i2 >= 31 ? 150 : 100;
            int size = ((List) AbstractC2021l.purchase(this.f18781l.Signature().yandex, true, false, new C8125l(13))).size();
            Context context = this.f18779l;
            String strM4210case = "<faulty JobScheduler failed to getPendingJobs>";
            if (i2 >= 34) {
                JobScheduler jobSchedulerYandex = AbstractC2691l.yandex(context);
                String str5 = null;
                try {
                    allPendingJobs = jobSchedulerYandex.getAllPendingJobs();
                } catch (Throwable th) {
                    C14513l.tapsense().ads(AbstractC2691l.yandex, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListBilling = billing(context, jobSchedulerYandex);
                    int size2 = arrayListBilling != null ? allPendingJobs.size() - arrayListBilling.size() : 0;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    ArrayList arrayListBilling2 = billing(context, (JobScheduler) context.getSystemService("jobscheduler"));
                    int size3 = arrayListBilling2 != null ? arrayListBilling2.size() : 0;
                    if (size3 != 0) {
                        str5 = size3 + " from WorkManager in the default namespace";
                    }
                    strM4210case = AbstractC16901l.m4210case(AbstractC8669l.m2420volatile(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str5}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListBilling3 = billing(context, AbstractC2691l.yandex(context));
                if (arrayListBilling3 != null) {
                    strM4210case = arrayListBilling3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb2 = new StringBuilder("JobScheduler ");
            sb2.append(i3);
            sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb2.append(strM4210case);
            sb2.append(".\nThere are ");
            sb2.append(size);
            sb2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strAdcel = AbstractC0653l.adcel(sb2, this.f18780l.firebase, '.');
            C14513l.tapsense().startapp(str3, strAdcel);
            C4875l.remoteconfig(strAdcel, e);
        } catch (Throwable th2) {
            C14513l.tapsense().ads(str3, "Unable to schedule " + c7718l, th2);
        }
    }

    @Override // defpackage.InterfaceC15402l
    public final void amazon(String str) {
        Context context = this.f18779l;
        JobScheduler jobScheduler = this.f18778l;
        ArrayList arrayListLoadAd = loadAd(context, jobScheduler, str);
        if (arrayListLoadAd == null || arrayListLoadAd.isEmpty()) {
            return;
        }
        Iterator it = arrayListLoadAd.iterator();
        while (it.hasNext()) {
            yandex(jobScheduler, ((Integer) it.next()).intValue());
        }
        AbstractC2021l.purchase(this.f18781l.ads().yandex, false, true, new C6908l(str, 20));
    }

    @Override // defpackage.InterfaceC15402l
    public final boolean crashlytics() {
        return true;
    }

    @Override // defpackage.InterfaceC15402l
    public final void purchase(C7718l... c7718lArr) {
        int iIntValue;
        boolean z;
        ArrayList arrayListLoadAd;
        int iIntValue2;
        WorkDatabase workDatabase = this.f18781l;
        final C14965l c14965l = new C14965l(workDatabase);
        WorkDatabase workDatabase2 = (WorkDatabase) c14965l.f29441l;
        int length = c7718lArr.length;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            C7718l c7718l = c7718lArr[i];
            workDatabase.loadAd();
            try {
                C9280l c9280lSignature = workDatabase.Signature();
                String str = c7718l.yandex;
                C7718l c7718lAmazon = c9280lSignature.amazon(str);
                String str2 = f18776l;
                if (c7718lAmazon == null) {
                    C14513l.tapsense().appmetrica(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.vip();
                } else {
                    if (c7718lAmazon.loadAd != EnumC9176l.f18878l) {
                        C14513l.tapsense().appmetrica(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                        workDatabase.vip();
                    } else {
                        C0350l c0350lIsPro = AbstractC3605l.isPro(c7718l);
                        int i2 = c0350lIsPro.loadAd;
                        String str3 = c0350lIsPro.yandex;
                        C11059l c11059l = (C11059l) AbstractC2021l.purchase(workDatabase.ads().yandex, true, z2, new C5568l(str3, i2, 1));
                        C12211l c12211l = this.f18780l;
                        if (c11059l != null) {
                            iIntValue = c11059l.crashlytics;
                        } else {
                            c12211l.getClass();
                            final int i3 = c12211l.subs;
                            iIntValue = ((Number) workDatabase2.remoteconfig(new Callable() { // from class: lٕۧؐ
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    WorkDatabase workDatabase3 = (WorkDatabase) c14965l.f29441l;
                                    Long lYandex = workDatabase3.adcel().yandex("next_job_scheduler_id");
                                    int i4 = 0;
                                    int iLongValue = lYandex != null ? (int) lYandex.longValue() : 0;
                                    int i5 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                                    C6134l c6134lAdcel = workDatabase3.adcel();
                                    AbstractC2021l.purchase(c6134lAdcel.yandex, false, true, new C8854l(c6134lAdcel, new C9046l("next_job_scheduler_id", Long.valueOf(i5)), 25));
                                    if (iLongValue < 0 || iLongValue > i3) {
                                        C6134l c6134lAdcel2 = workDatabase3.adcel();
                                        AbstractC2021l.purchase(c6134lAdcel2.yandex, false, true, new C8854l(c6134lAdcel2, new C9046l("next_job_scheduler_id", 1L), 25));
                                    } else {
                                        i4 = iLongValue;
                                    }
                                    return Integer.valueOf(i4);
                                }
                            })).intValue();
                        }
                        if (c11059l == null) {
                            C11059l c11059l2 = new C11059l(str3, i2, iIntValue);
                            C7392l c7392lAds = workDatabase.ads();
                            AbstractC2021l.purchase(c7392lAds.yandex, false, true, new C10207l(c7392lAds, c11059l2, 18));
                        }
                        admob(c7718l, iIntValue);
                        if (Build.VERSION.SDK_INT != 23 || (arrayListLoadAd = loadAd(this.f18779l, this.f18778l, str)) == null) {
                            z = false;
                        } else {
                            int iIndexOf = arrayListLoadAd.indexOf(Integer.valueOf(iIntValue));
                            if (iIndexOf >= 0) {
                                arrayListLoadAd.remove(iIndexOf);
                            }
                            if (arrayListLoadAd.isEmpty()) {
                                z = false;
                                c12211l.getClass();
                                final int i4 = c12211l.subs;
                                iIntValue2 = ((Number) workDatabase2.remoteconfig(new Callable() { // from class: lٕۧؐ
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        WorkDatabase workDatabase3 = (WorkDatabase) c14965l.f29441l;
                                        Long lYandex = workDatabase3.adcel().yandex("next_job_scheduler_id");
                                        int i5 = 0;
                                        int iLongValue = lYandex != null ? (int) lYandex.longValue() : 0;
                                        int i6 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                                        C6134l c6134lAdcel = workDatabase3.adcel();
                                        AbstractC2021l.purchase(c6134lAdcel.yandex, false, true, new C8854l(c6134lAdcel, new C9046l("next_job_scheduler_id", Long.valueOf(i6)), 25));
                                        if (iLongValue < 0 || iLongValue > i4) {
                                            C6134l c6134lAdcel2 = workDatabase3.adcel();
                                            AbstractC2021l.purchase(c6134lAdcel2.yandex, false, true, new C8854l(c6134lAdcel2, new C9046l("next_job_scheduler_id", 1L), 25));
                                        } else {
                                            i5 = iLongValue;
                                        }
                                        return Integer.valueOf(i5);
                                    }
                                })).intValue();
                            } else {
                                z = false;
                                iIntValue2 = ((Integer) arrayListLoadAd.get(0)).intValue();
                            }
                            admob(c7718l, iIntValue2);
                        }
                        workDatabase.vip();
                        workDatabase.firebase();
                    }
                    i++;
                    z2 = z;
                }
                workDatabase.firebase();
                z = z2;
                i++;
                z2 = z;
            } catch (Throwable th) {
                workDatabase.firebase();
                throw th;
            }
        }
    }
}
