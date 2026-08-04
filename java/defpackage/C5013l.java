package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lْٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5013l {
    public static C14025l crashlytics;
    public static C15589l yandex = new C15589l(null, 31);
    public static C18482l loadAd = new C18482l(0, false, null, null, null, null, 8191);
    public static final ArrayList amazon = new ArrayList();

    public static void amazon(Throwable th, Map map) {
        purchase(crashlytics(Thread.currentThread(), th, EnumC4900l.NonCritical, map));
        Iterator it = amazon.iterator();
        while (it.hasNext()) {
            ((C6757l) it.next()).getClass();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C4353l c4353l = (C4353l) C14184l.crashlytics().loadAd(C4353l.class);
                if (c4353l == null) {
                    C6541l.subs("FirebaseCrashlytics component is not present.");
                    return;
                }
                String strAdcel = AbstractC14814l.adcel("[Pre-Report] ", str, " = ", str2);
                C17044l c17044l = c4353l.yandex;
                ((ExecutorC4850l) c17044l.metrica.f1958l).yandex(new RunnableC0016l(c17044l, System.currentTimeMillis() - c17044l.amazon, strAdcel, 0));
            }
            C4353l c4353l2 = (C4353l) C14184l.crashlytics().loadAd(C4353l.class);
            if (c4353l2 == null) {
                C6541l.subs("FirebaseCrashlytics component is not present.");
                return;
            } else {
                C17044l c17044l2 = c4353l2.yandex;
                Map map2 = Collections.EMPTY_MAP;
                ((ExecutorC4850l) c17044l2.metrica.f1958l).yandex(new RunnableC7762l(c17044l2, th));
            }
        }
    }

    public static int billing() {
        C14025l c14025l = crashlytics;
        if (c14025l != null) {
            AbstractC5921l.f12465l.getClass();
            ArrayList arrayListM3376super = C12382l.m3376super(c14025l, false);
            Integer numValueOf = arrayListM3376super != null ? Integer.valueOf(arrayListM3376super.size()) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    public static C9533l crashlytics(Thread thread, Throwable th, EnumC4900l enumC4900l, Map map) {
        C8785l c8785l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C15589l c15589l = yandex;
        C18482l c18482l = loadAd;
        String name = thread.getName();
        C17937l c17937lLoadAd = loadAd(th);
        Set<Thread> setKeySet = Thread.getAllStackTraces().keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setKeySet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C3844l c3844l = C3844l.f7950l;
            if (!zHasNext) {
                return new C9533l(jCurrentTimeMillis, enumC4900l, c15589l, c18482l, name, c17937lLoadAd, null, arrayList, map, c3844l);
            }
            Thread thread2 = (Thread) it.next();
            StackTraceElement[] stackTraceElementArr = Thread.getAllStackTraces().get(thread2);
            if (stackTraceElementArr != null) {
                c8785l = new C8785l(thread2.getName(), EnumC15144l.NEW, mopub(stackTraceElementArr), c3844l);
            } else {
                c8785l = null;
            }
            if (c8785l != null) {
                arrayList.add(c8785l);
            }
        }
    }

    public static C17937l loadAd(Throwable th) {
        String name = th.getClass().getName();
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        String str = message;
        ArrayList arrayListMopub = mopub(th.getStackTrace());
        Throwable cause = th.getCause();
        C17937l c17937lLoadAd = cause != null ? loadAd(cause) : null;
        Throwable[] suppressed = th.getSuppressed();
        ArrayList arrayList = new ArrayList(suppressed.length);
        for (Throwable th2 : suppressed) {
            arrayList.add(loadAd(th2));
        }
        return new C17937l(name, str, arrayListMopub, arrayList, c17937lLoadAd, C3844l.f7950l);
    }

    public static ArrayList mopub(StackTraceElement[] stackTraceElementArr) {
        C10434l c10434l;
        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement.isNativeMethod()) {
                c10434l = new C10434l(stackTraceElement.getClassName(), (String) null, 0, (String) null, stackTraceElement.isNativeMethod(), false, 110);
            } else {
                String className = stackTraceElement.getClassName();
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "";
                }
                c10434l = new C10434l(className, fileName, stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), stackTraceElement.isNativeMethod(), stackTraceElement.getFileName() == null, 64);
            }
            arrayList.add(c10434l);
        }
        return arrayList;
    }

    public static void purchase(C9533l c9533l) throws Throwable {
        String str;
        C14025l c14025l = crashlytics;
        if (c14025l != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(c9533l.f19433l);
            String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11))}, 1)) + '-' + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(12))}, 1)) + '-' + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(13))}, 1));
            int iOrdinal = c9533l.f19432l.ordinal();
            if (iOrdinal == 0) {
                str = "Crash";
            } else {
                if (iOrdinal != 1) {
                    C18725l.billing();
                    return;
                }
                str = "NonCritical";
            }
            C12382l c12382l = AbstractC5921l.f12465l;
            c12382l.mopub(c14025l);
            C7167l c7167l = new C7167l(new C4554l(c12382l.mo691continue(c14025l.purchase("OcBugReport-" + str + '-' + str2 + ".obr"), false)));
            try {
                c9533l.f23749l.amazon(c7167l, c9533l);
                Unit unit = Unit.INSTANCE;
                c7167l.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(c7167l, th);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x015e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:61:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:0x016f  */
    public static C18482l yandex(Context context, boolean z) {
        EnumC10382l enumC10382l;
        EnumC10382l enumC10382l2;
        EnumC10382l enumC10382l3;
        C3844l c3844l;
        C0318l c0318l;
        C18413l c18413l;
        String str = Build.PRODUCT;
        String str2 = Build.DEVICE;
        String str3 = Build.BOARD;
        String str4 = Build.MANUFACTURER;
        String str5 = Build.BRAND;
        String str6 = Build.MODEL;
        String strValueOf = String.valueOf(AbstractC10573l.crashlytics() ? AbstractC10573l.amazon : 0);
        String strValueOf2 = String.valueOf(AbstractC10573l.crashlytics() ? AbstractC10573l.purchase : 0.0f);
        String strYandex = AbstractC10573l.yandex("ro.miui.ui.version.name");
        String strYandex2 = AbstractC10573l.yandex("ro.build.version.incremental");
        String strYandex3 = AbstractC10573l.yandex("ro.build.version.emui");
        String strYandex4 = AbstractC10573l.yandex("ro.miui.ui.version.code");
        if (AbstractC10573l.crashlytics()) {
            enumC10382l = EnumC10382l.SamsungOneUI;
        } else {
            try {
                context.getPackageManager().getPackageInfo("com.miui.system", 0);
            } catch (Exception unused) {
                if (!AbstractC10573l.loadAd(context, new Intent("miui.intent.action.OP_AUTO_START").addCategory("android.intent.category.DEFAULT")) && !AbstractC10573l.loadAd(context, new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"))) && !AbstractC10573l.loadAd(context, new Intent("miui.intent.action.POWER_HIDE_MODE_APP_LIST").addCategory("android.intent.category.DEFAULT")) && !AbstractC10573l.loadAd(context, new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.powercenter.PowerSettings")))) {
                    if (!TextUtils.isEmpty(AbstractC10573l.yandex("ro.build.hw_emui_api_level"))) {
                        enumC10382l = EnumC10382l.EMUI;
                    } else if (!TextUtils.isEmpty(AbstractC10573l.yandex("ro.build.ro.meizu.rom.config")) || !TextUtils.isEmpty(AbstractC10573l.yandex("persist.sys.static_blur_mode")) || !TextUtils.isEmpty(AbstractC10573l.yandex("persist.sys.use.flyme.icon"))) {
                        enumC10382l = EnumC10382l.Flyme;
                    } else if (!TextUtils.isEmpty(AbstractC10573l.yandex("ro.vivo.os.version")) || !TextUtils.isEmpty(AbstractC10573l.yandex("ro.vivo.rom")) || !TextUtils.isEmpty(AbstractC10573l.yandex("ro.vivo.rom.version")) || !TextUtils.isEmpty(AbstractC10573l.yandex("ro.vivo.build.version.sdk"))) {
                        enumC10382l = EnumC10382l.Vivo;
                    } else if (TextUtils.isEmpty(AbstractC10573l.yandex("ro.config.knox"))) {
                        enumC10382l = !TextUtils.isEmpty(AbstractC10573l.yandex("ro.asus.ui")) ? EnumC10382l.ZenUI : EnumC10382l.StockOrUnknown;
                    } else {
                        enumC10382l = EnumC10382l.SamsungKnox;
                    }
                }
                enumC10382l2 = enumC10382l;
                String str7 = Build.VERSION.RELEASE;
                int i = Build.VERSION.SDK_INT;
                String str8 = Build.BOARD;
                String str9 = Build.MODEL;
                String str10 = Build.DEVICE;
                String str11 = Build.MANUFACTURER;
                String str12 = Build.BRAND;
                enumC10382l3 = EnumC10382l.MIUI;
                c3844l = C3844l.f7950l;
                if (enumC10382l2 == enumC10382l3) {
                    c0318l = new C0318l(strYandex, strYandex4, strYandex2, c3844l);
                } else {
                    c0318l = null;
                }
                if (enumC10382l2 == EnumC10382l.SamsungOneUI) {
                    c18413l = new C18413l(strValueOf, strValueOf2, c3844l);
                } else {
                    c18413l = null;
                }
                return new C18482l(i, z, enumC10382l2, c0318l, enumC10382l2 == EnumC10382l.EMUI ? new C6771l(c3844l, strYandex3) : null, c18413l, 4096);
            }
            enumC10382l = EnumC10382l.MIUI;
        }
        enumC10382l2 = enumC10382l;
        String str13 = Build.VERSION.RELEASE;
        int i2 = Build.VERSION.SDK_INT;
        String str14 = Build.BOARD;
        String str15 = Build.MODEL;
        String str16 = Build.DEVICE;
        String str17 = Build.MANUFACTURER;
        String str18 = Build.BRAND;
        enumC10382l3 = EnumC10382l.MIUI;
        c3844l = C3844l.f7950l;
        if (enumC10382l2 == enumC10382l3) {
            c0318l = new C0318l(strYandex, strYandex4, strYandex2, c3844l);
        } else {
            c0318l = null;
        }
        if (enumC10382l2 == EnumC10382l.SamsungOneUI) {
            c18413l = new C18413l(strValueOf, strValueOf2, c3844l);
        } else {
            c18413l = null;
        }
        return new C18482l(i2, z, enumC10382l2, c0318l, enumC10382l2 == EnumC10382l.EMUI ? new C6771l(c3844l, strYandex3) : null, c18413l, 4096);
    }
}
