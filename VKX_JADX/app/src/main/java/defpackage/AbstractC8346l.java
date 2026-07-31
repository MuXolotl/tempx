package defpackage;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: lًۢۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8346l {
    public static final C3581l yandex;

    static {
        C3581l c3581l;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                Iterator it = Arrays.asList(new C3581l[0]).iterator();
                if (it.hasNext()) {
                    c3581l = (C3581l) it.next();
                    AbstractC12442l.ads("Expected at most one FlagsService", !it.hasNext());
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                } else {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c3581l = new C3581l();
                }
                yandex = c3581l;
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }
}
