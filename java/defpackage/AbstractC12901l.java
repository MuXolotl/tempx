package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍّ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12901l {
    public static final String yandex = C14513l.applovin("ProcessUtils");

    public static final boolean yandex(Context context) {
        String strIsVip;
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            strIsVip = AbstractC13950l.isVip();
        } else {
            strIsVip = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, C13432l.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                if (objInvoke instanceof String) {
                    strIsVip = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strIsVip = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th) {
                C14513l.tapsense().metrica(yandex, "Unable to check ActivityThread for processName", th);
            }
        }
        return AbstractC8576l.yandex(strIsVip, context.getApplicationInfo().processName);
    }
}
