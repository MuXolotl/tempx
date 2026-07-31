package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: lٔۨٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15350l {
    public static final C0011l yandex = new C0011l();
    public static final Object loadAd = new Object();
    public static C10819l crashlytics = null;

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    public static void crashlytics(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        C15886l c15886lYandex;
        C15886l c15886l;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || crashlytics == null) {
            synchronized (loadAd) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        long jYandex = yandex(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            c15886lYandex = C15886l.yandex(file3);
                        } else {
                            c15886lYandex = null;
                        }
                        if (c15886lYandex == null) {
                            if (!z2) {
                                i = 327680;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                        } else if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z) {
                            i = 2;
                        }
                        if (c15886lYandex != null) {
                            i = 3;
                        }
                        c15886l = new C15886l(1, i, jYandex, length);
                        if (c15886lYandex != null) {
                            c15886l.loadAd(file3);
                        } else {
                            c15886l.loadAd(file3);
                        }
                        loadAd();
                        return;
                    }
                    loadAd();
                    return;
                }
                if (crashlytics != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 28 && i2 != 30) {
                            file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                            long length3 = file.length();
                            if (file.exists() || length3 <= 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file2.length();
                            if (file2.exists() || length <= 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            try {
                                long jYandex2 = yandex(context);
                                file3 = new File(context.getFilesDir(), "profileInstalled");
                                if (file3.exists()) {
                                    try {
                                        c15886lYandex = C15886l.yandex(file3);
                                    } catch (IOException unused) {
                                        loadAd();
                                        return;
                                    }
                                } else {
                                    c15886lYandex = null;
                                }
                                if (c15886lYandex == null && c15886lYandex.crashlytics == jYandex2 && (i3 = c15886lYandex.loadAd) != 2) {
                                    i = i3;
                                } else if (!z2) {
                                    i = 327680;
                                } else if (z3) {
                                    i = 1;
                                } else if (z4) {
                                    i = 2;
                                }
                                if (z && z4 && i != 1) {
                                    i = 2;
                                }
                                if (c15886lYandex != null && c15886lYandex.loadAd == 2 && i == 1 && length3 < c15886lYandex.amazon) {
                                    i = 3;
                                }
                                c15886l = new C15886l(1, i, jYandex2, length);
                                if (c15886lYandex != null || !c15886lYandex.equals(c15886l)) {
                                    try {
                                        c15886l.loadAd(file3);
                                    } catch (IOException unused2) {
                                    }
                                }
                                loadAd();
                                return;
                            } catch (PackageManager.NameNotFoundException unused3) {
                                loadAd();
                                return;
                            }
                        }
                        loadAd();
                        return;
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused4) {
                    z2 = false;
                }
                throw th;
            }
        }
    }

    public static C10819l loadAd() {
        C10819l c10819l = new C10819l(8);
        crashlytics = c10819l;
        yandex.isPro(c10819l);
        return crashlytics;
    }

    public static long yandex(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC2847l.vip(context, packageManager).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
