package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lٔٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14941l {
    public static final HashMap billing;
    public static final String mopub;
    public final C13645l amazon;
    public final C4127l crashlytics;
    public final C9667l loadAd;
    public final C7644l purchase;
    public final Context yandex;

    static {
        HashMap map = new HashMap();
        billing = map;
        AbstractC11043l.firebase(5, map, "armeabi", 6, "armeabi-v7a");
        AbstractC11043l.firebase(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        mopub = "Crashlytics Android SDK/20.0.4";
    }

    public C14941l(Context context, C9667l c9667l, C4127l c4127l, C13645l c13645l, C7644l c7644l) {
        this.yandex = context;
        this.loadAd = c9667l;
        this.crashlytics = c4127l;
        this.amazon = c13645l;
        this.purchase = c7644l;
    }

    public static List amazon(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            C12580l c12580l = new C12580l();
            c12580l.purchase = i;
            c12580l.billing = (byte) (c12580l.billing | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            c12580l.yandex = jMax;
            byte b = (byte) (c12580l.billing | 1);
            c12580l.loadAd = str;
            c12580l.crashlytics = fileName;
            c12580l.amazon = lineNumber;
            c12580l.billing = (byte) (b | 2);
            arrayList.add(c12580l.yandex());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static C16172l crashlytics(C10038l c10038l, int i) {
        String str = (String) c10038l.f20462l;
        String str2 = (String) c10038l.f20463l;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c10038l.f20466l;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C10038l c10038l2 = (C10038l) c10038l.f20465l;
        if (i >= 8) {
            C10038l c10038l3 = c10038l2;
            while (c10038l3 != null) {
                c10038l3 = (C10038l) c10038l3.f20465l;
                i2++;
            }
        }
        int i3 = i2;
        List listAmazon = amazon(stackTraceElementArr, 4);
        if (listAmazon == null) {
            C6541l.subs("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        C16172l c16172lCrashlytics = (c10038l2 == null || i3 != 0) ? null : crashlytics(c10038l2, i + 1);
        if (b == 1) {
            return new C16172l(str, str2, listAmazon, c16172lCrashlytics, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }

    public static C6990l purchase() {
        return new C6990l(0L, "0", "0");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    public final C9947l loadAd(int i) {
        boolean z;
        Float fValueOf;
        int i2;
        long j;
        Context context = this.yandex;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z || fValueOf == null) {
                    i2 = 1;
                } else {
                    i2 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!AbstractC2632l.subs() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long jYandex = AbstractC2632l.yandex(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jYandex - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                C7028l c7028l = new C7028l();
                c7028l.yandex = dValueOf;
                c7028l.loadAd = i2;
                byte b = (byte) (c7028l.mopub | 1);
                c7028l.crashlytics = z2;
                c7028l.amazon = i;
                c7028l.purchase = j;
                c7028l.billing = blockCount;
                c7028l.mopub = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return c7028l.yandex();
            }
            z = false;
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (!AbstractC2632l.subs()) {
            z2 = true;
        }
        long jYandex2 = AbstractC2632l.yandex(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jYandex2 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        C7028l c7028l2 = new C7028l();
        c7028l2.yandex = dValueOf;
        c7028l2.loadAd = i2;
        byte b2 = (byte) (c7028l2.mopub | 1);
        c7028l2.crashlytics = z2;
        c7028l2.amazon = i;
        c7028l2.purchase = j;
        c7028l2.billing = blockCount2;
        c7028l2.mopub = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
        return c7028l2.yandex();
    }

    public final List yandex() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        C4127l c4127l = this.crashlytics;
        String str = c4127l.purchase;
        if (str == null) {
            C6541l.subs("Null name");
            return null;
        }
        String str2 = c4127l.loadAd;
        if (b == 3) {
            return Collections.singletonList(new C0494l(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
