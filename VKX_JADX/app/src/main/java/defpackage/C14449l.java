package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: renamed from: lٓ۟ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14449l {
    public static final String amazon = C14513l.applovin("SystemJobInfoConverter");
    public final boolean crashlytics;
    public final C6565l loadAd;
    public final ComponentName yandex;

    public C14449l(Context context, C6565l c6565l, boolean z) {
        this.loadAd = c6565l;
        this.yandex = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.crashlytics = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r3 < 26) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r3 >= 24) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.job.JobInfo yandex(defpackage.C7718l r13, int r14) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14449l.yandex(lًؑۦ, int):android.app.job.JobInfo");
    }
}
