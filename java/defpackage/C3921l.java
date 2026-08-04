package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: lؖؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3921l extends AbstractC8590l {
    public final Context amazon;
    public final /* synthetic */ int crashlytics = 1;

    public C3921l(Context context) {
        super(9, 10);
        this.amazon = context;
    }

    @Override // defpackage.AbstractC8590l
    public final void yandex(C11442l c11442l) {
        int i = this.crashlytics;
        Context context = this.amazon;
        switch (i) {
            case 0:
                if (this.loadAd >= 10) {
                    c11442l.ads(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c11442l.adcel("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c11442l.yandex();
                    try {
                        c11442l.ads(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        c11442l.ads(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        c11442l.signatures();
                        c11442l.vip();
                    } catch (Throwable th) {
                        c11442l.vip();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c11442l.yandex();
                    try {
                        c11442l.ads(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        c11442l.ads(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        c11442l.signatures();
                        return;
                    } finally {
                        c11442l.vip();
                    }
                }
                return;
        }
    }

    public C3921l(Context context, int i, int i2) {
        super(i, i2);
        this.amazon = context;
    }
}
