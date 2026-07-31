package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lْؔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2590l implements Runnable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String f5648l = C14513l.applovin("ForceStopRunnable");

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final long f5649l = 315360000000L;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C15053l f5650l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13432l f5651l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f5652l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f5653l = 0;

    public RunnableC2590l(Context context, C13432l c13432l) {
        this.f5652l = context.getApplicationContext();
        this.f5651l = c13432l;
        this.f5650l = c13432l.mopub;
    }

    public static void crashlytics(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f5649l;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    public final boolean loadAd() {
        this.f5651l.loadAd.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f5648l;
        if (zIsEmpty) {
            C14513l.tapsense().vip(str, "The default process name was not specified.");
            return true;
        }
        boolean zYandex = AbstractC12901l.yandex(this.f5652l);
        C14513l.tapsense().vip(str, "Is default app process = " + zYandex);
        return zYandex;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f5652l;
        String str = f5648l;
        C13432l c13432l = this.f5651l;
        try {
            if (!loadAd()) {
                c13432l.amazon();
                return;
            }
            while (true) {
                try {
                    AbstractC4107l.amazon(context);
                    C14513l.tapsense().vip(str, "Performing cleanup operations.");
                    try {
                        yandex();
                        c13432l.amazon();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.f5653l + 1;
                        this.f5653l = i;
                        if (i >= 3) {
                            String str2 = AbstractC17002l.amazon(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            C14513l.tapsense().ads(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            c13432l.loadAd.getClass();
                            throw illegalStateException;
                        }
                        C14513l.tapsense().metrica(str, "Retrying after " + (((long) i) * 300), e);
                        try {
                            Thread.sleep(((long) this.f5653l) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    C14513l.tapsense().startapp(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    c13432l.loadAd.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            c13432l.amazon();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020f  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f7  */
    public final void yandex() throws Throwable {
        boolean z;
        C15053l c15053l = this.f5650l;
        C13432l c13432l = this.f5651l;
        WorkDatabase workDatabase = c13432l.crashlytics;
        C12211l c12211l = c13432l.loadAd;
        C15053l c15053l2 = c13432l.mopub;
        WorkDatabase workDatabase2 = c13432l.crashlytics;
        String str = C9133l.f18776l;
        Context context = this.f5652l;
        JobScheduler jobSchedulerYandex = AbstractC2691l.yandex(context);
        ArrayList<JobInfo> arrayListBilling = C9133l.billing(context, jobSchedulerYandex);
        List list = (List) AbstractC2021l.purchase(workDatabase.ads().yandex, true, false, new C1698l(29));
        HashSet hashSet = new HashSet(arrayListBilling != null ? arrayListBilling.size() : 0);
        if (arrayListBilling != null && !arrayListBilling.isEmpty()) {
            for (JobInfo jobInfo : arrayListBilling) {
                C0350l c0350lMopub = C9133l.mopub(jobInfo);
                if (c0350lMopub != null) {
                    hashSet.add(c0350lMopub.yandex);
                } else {
                    C9133l.yandex(jobSchedulerYandex, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    C14513l.tapsense().vip(C9133l.f18776l, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.loadAd();
            try {
                C9280l c9280lSignature = workDatabase.Signature();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c9280lSignature.purchase(-1L, (String) it2.next());
                }
                workDatabase.vip();
                workDatabase.firebase();
            } catch (Throwable th) {
                workDatabase.firebase();
                throw th;
            }
        }
        C9280l c9280lSignature2 = workDatabase2.Signature();
        C11042l c11042lTapsense = workDatabase2.tapsense();
        workDatabase2.loadAd();
        try {
            List<C7718l> list2 = (List) AbstractC2021l.purchase(c9280lSignature2.yandex, true, false, new C8125l(14));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (C7718l c7718l : list2) {
                    EnumC9176l enumC9176l = EnumC9176l.f18878l;
                    String str2 = c7718l.yandex;
                    c9280lSignature2.billing(enumC9176l, str2);
                    c9280lSignature2.mopub(-512, str2);
                    c9280lSignature2.purchase(-1L, str2);
                }
            }
            AbstractC2021l.purchase(c11042lTapsense.yandex, false, true, new C8125l(12));
            workDatabase2.vip();
            workDatabase2.firebase();
            boolean z3 = z2 || z;
            Long lYandex = ((WorkDatabase) c15053l2.f29576l).adcel().yandex("reschedule_needed");
            int i = 25;
            String str3 = f5648l;
            if (lYandex != null && lYandex.longValue() == 1) {
                C14513l.tapsense().vip(str3, "Rescheduling Workers.");
                c13432l.purchase();
                c15053l2.getClass();
                C9046l c9046l = new C9046l("reschedule_needed", 0L);
                C6134l c6134lAdcel = ((WorkDatabase) c15053l2.f29576l).adcel();
                AbstractC2021l.purchase(c6134lAdcel.yandex, false, true, new C8854l(c6134lAdcel, c9046l, i));
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i2 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                if (i2 < 30) {
                    if (broadcast == null) {
                        crashlytics(context);
                        C14513l.tapsense().vip(str3, "Application was force-stopped, rescheduling.");
                        c13432l.purchase();
                        c12211l.amazon.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c15053l.getClass();
                        C9046l c9046l2 = new C9046l("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis));
                        C6134l c6134lAdcel2 = ((WorkDatabase) c15053l.f29576l).adcel();
                        AbstractC2021l.purchase(c6134lAdcel2.yandex, false, true, new C8854l(c6134lAdcel2, c9046l2, i));
                        return;
                    }
                    if (z3) {
                        C14513l.tapsense().vip(str3, "Found unfinished work, scheduling it.");
                        AbstractC3387l.loadAd(c12211l, workDatabase2, c13432l.purchase);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lYandex2 = ((WorkDatabase) c15053l.f29576l).adcel().yandex("last_force_stop_ms");
                    long jLongValue = lYandex2 != null ? lYandex2.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i4);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jLongValue) {
                            C14513l.tapsense().vip(str3, "Application was force-stopped, rescheduling.");
                            c13432l.purchase();
                            c12211l.amazon.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            c15053l.getClass();
                            C9046l c9046l3 = new C9046l("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2));
                            C6134l c6134lAdcel3 = ((WorkDatabase) c15053l.f29576l).adcel();
                            AbstractC2021l.purchase(c6134lAdcel3.yandex, false, true, new C8854l(c6134lAdcel3, c9046l3, i));
                            return;
                        }
                    }
                }
                if (z3) {
                    C14513l.tapsense().vip(str3, "Found unfinished work, scheduling it.");
                    AbstractC3387l.loadAd(c12211l, workDatabase2, c13432l.purchase);
                }
            } catch (IllegalArgumentException e) {
                e = e;
                if (C14513l.tapsense().f28392l <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            } catch (SecurityException e2) {
                e = e2;
                if (C14513l.tapsense().f28392l <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            }
        } catch (Throwable th2) {
            workDatabase2.firebase();
            throw th2;
        }
    }
}
