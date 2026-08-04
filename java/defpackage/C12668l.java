package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lّْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12668l {
    public static final C12668l yandex = new C12668l();

    public static ArrayList yandex(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = C2580l.f5619l;
        }
        ArrayList arrayListM4239strictfp = AbstractC16901l.m4239strictfp(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM4239strictfp) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            C16647l c16647l = new C16647l();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                C6541l.subs("Null processName");
                return null;
            }
            c16647l.yandex = str2;
            c16647l.loadAd = runningAppProcessInfo.pid;
            byte b = (byte) (c16647l.purchase | 1);
            c16647l.crashlytics = runningAppProcessInfo.importance;
            c16647l.purchase = (byte) (b | 2);
            c16647l.amazon = AbstractC8576l.yandex(str2, str);
            c16647l.purchase = (byte) (c16647l.purchase | 4);
            arrayList2.add(c16647l.yandex());
        }
        return arrayList2;
    }

    public final AbstractC1431l loadAd(Context context) {
        Object next;
        String processName;
        int iMyPid = Process.myPid();
        Iterator it = yandex(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C4702l) ((AbstractC1431l) next)).loadAd != iMyPid);
        AbstractC1431l abstractC1431l = (AbstractC1431l) next;
        if (abstractC1431l != null) {
            return abstractC1431l;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            processName = Process.myProcessName();
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        C16647l c16647l = new C16647l();
        c16647l.yandex = processName;
        c16647l.loadAd = iMyPid;
        byte b = (byte) (c16647l.purchase | 1);
        c16647l.crashlytics = 0;
        c16647l.amazon = false;
        c16647l.purchase = (byte) (((byte) (b | 2)) | 4);
        return c16647l.yandex();
    }
}
