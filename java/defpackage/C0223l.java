package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lَؑٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0223l {
    public static Boolean amazon;
    public final String crashlytics;
    public final Uri loadAd;
    public final C7447l yandex;

    public C0223l(C7447l c7447l, String str) {
        this.yandex = c7447l;
        this.crashlytics = str;
        Context context = c7447l.loadAd;
        Pattern pattern = AbstractC15467l.yandex;
        C1424l c1424l = new C1424l(context, 24);
        c1424l.m916l("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        c1424l.m950l(sb.toString());
        this.loadAd = c1424l.m943l();
    }

    public final boolean loadAd() {
        C15138l c15138lCrashlytics = this.yandex.mopub.crashlytics();
        return c15138lCrashlytics.license() && ((AbstractCollection) c15138lCrashlytics.signatures()).contains(EnumC13207l.FILE);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x023b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0241  */
    /* JADX WARN: Code duplicated, block: B:87:0x026c A[Catch: IOException | RuntimeException -> 0x028a, IOException | RuntimeException -> 0x028a, TRY_ENTER, TryCatch #8 {IOException | RuntimeException -> 0x028a, blocks: (B:84:0x0243, B:87:0x026c, B:87:0x026c, B:88:0x026f, B:88:0x026f, B:97:0x0289, B:97:0x0289, B:96:0x0286, B:96:0x0286), top: B:115:0x0243 }] */
    public final C18480l yandex() {
        String strSubstring;
        int i;
        char c;
        C15878l c15878l;
        C9754l c9754l;
        C0444l c0444l;
        InputStream inputStreamRemoteconfig;
        String str = this.crashlytics;
        C7447l c7447l = this.yandex;
        Context context = c7447l.loadAd;
        InterfaceC11766l interfaceC11766l = c7447l.billing;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 10;
        int i4 = 3;
        if (i2 < 24) {
            UserManager userManager = AbstractC18452l.yandex;
        } else if (!AbstractC18452l.crashlytics(context)) {
            return new C18480l(C15643l.signatures(), new C9754l(i4, 17, i3));
        }
        if (amazon == null) {
            if (i2 >= 28) {
                amazon = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    amazon = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    amazon = Boolean.FALSE;
                }
            }
        }
        if (amazon.booleanValue()) {
            return new C18480l(C15643l.signatures(), new C9754l(i4, 18, i3));
        }
        C8746l c8746lLoadAd = c7447l.mopub.loadAd();
        AbstractC15619l abstractC15619l = c8746lLoadAd.crashlytics;
        EnumC13207l enumC13207l = EnumC13207l.FILE;
        C11154l c11154l = AbstractC8554l.yandex;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                C8339l.metrica("Invalid package name: ".concat(str));
                return null;
            }
            strSubstring = str;
        }
        int i5 = 5;
        if (!c8746lLoadAd.admob) {
            i = 14;
        } else if (!c8746lLoadAd.yandex || !c8746lLoadAd.loadAd.contains(enumC13207l)) {
            i = 3;
        } else if (abstractC15619l.billing() != 0) {
            List list = c8746lLoadAd.billing;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = c8746lLoadAd.mopub.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        int i6 = 7;
        if (i == 0) {
            try {
                String str2 = c8746lLoadAd.purchase;
                if (str2.isEmpty()) {
                    AbstractC17238l abstractC17238l = (AbstractC17238l) c7447l.admob.get();
                    if (abstractC17238l.crashlytics()) {
                        str2 = ((ApplicationInfo) abstractC17238l.loadAd()).dataDir;
                    } else {
                        AbstractC3234l.firebase(Level.WARNING, c7447l.yandex(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        c15878l = new C15878l(C0444l.crashlytics, new C9754l(i4, i6, i3));
                    }
                }
                String str3 = File.separator;
                c = 0;
                try {
                    String str4 = c8746lLoadAd.amazon;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                    sb.append(str2);
                    sb.append(str3);
                    sb.append(str4);
                    String string = sb.toString();
                    C4816l c4816l = new C4816l(abstractC15619l, str);
                    Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                    String string2 = c4816l.smaato().toString();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                    sb2.append(str3);
                    sb2.append(string);
                    sb2.append(str3);
                    sb2.append(string2);
                    Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        try {
                            C15878l c15878l2 = new C15878l((C0444l) ((C2830l) interfaceC11766l.get()).yandex(uriBuild, new C14706l(c8746lLoadAd.firebase.tapsense(), 9)), new C9754l(i5, 2, i3));
                            StrictMode.setThreadPolicy(threadPolicy);
                            c15878l = c15878l2;
                        } catch (FileNotFoundException unused2) {
                            AbstractC3234l.firebase(Level.INFO, c7447l.yandex(), null, "Shared storage file not found for %s", str);
                            c15878l = new C15878l(null, new C9754l(8));
                            StrictMode.setThreadPolicy(threadPolicy);
                        } catch (C9893l e) {
                            AbstractC3234l.firebase(Level.SEVERE, c7447l.yandex(), e, "Failed to parse snapshot from shared storage for %s", str);
                            c15878l = new C15878l(null, new C9754l(9));
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    Level level = Level.WARNING;
                    ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354lYandex = c7447l.yandex();
                    Object[] objArr = new Object[1];
                    objArr[c] = str;
                    AbstractC3234l.firebase(level, scheduledExecutorServiceC6354lYandex, e, "Failed to read shared file for %s", objArr);
                    c15878l = new C15878l(C0444l.crashlytics, new C9754l(i4, i3, i3));
                }
            } catch (Exception e3) {
                e = e3;
                c = 0;
            }
            c9754l = c15878l.loadAd;
            c0444l = c15878l.yandex;
            if (c0444l != null) {
                return new C18480l(c0444l, c9754l);
            }
            int i7 = c9754l.f19892l;
            try {
                C2830l c2830l = (C2830l) interfaceC11766l.get();
                Uri uri = this.loadAd;
                InterfaceC1400l interfaceC1400l = (InterfaceC1400l) C15643l.signatures().subscription(7);
                C11337l c11337l = C11337l.yandex;
                int i8 = AbstractC5004l.yandex;
                C11337l c11337l2 = C11337l.loadAd;
                inputStreamRemoteconfig = AbstractC6660l.remoteconfig(c2830l.loadAd(uri));
                try {
                    AbstractC0288l abstractC0288lYandex = ((C4194l) interfaceC1400l).yandex(inputStreamRemoteconfig, c11337l2);
                    if (inputStreamRemoteconfig != null) {
                        inputStreamRemoteconfig.close();
                    }
                    return new C18480l((C15643l) abstractC0288lYandex, new C9754l(4, i7, i3));
                } catch (Throwable th2) {
                    if (inputStreamRemoteconfig == null) {
                        throw th2;
                    }
                    try {
                        inputStreamRemoteconfig.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException | RuntimeException unused3) {
                Level level2 = Level.INFO;
                ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354lYandex2 = c7447l.yandex();
                Object[] objArr2 = new Object[1];
                objArr2[c] = str;
                AbstractC3234l.firebase(level2, scheduledExecutorServiceC6354lYandex2, null, "Unable to retrieve flag snapshot for %s, using defaults.", objArr2);
                return loadAd() ? new C18480l(C0444l.crashlytics, new C9754l(i4, 16, i3)) : new C18480l(C15643l.signatures(), new C9754l(i4, 11, i3));
            }
        }
        c15878l = new C15878l(null, new C9754l(i));
        c = 0;
        c9754l = c15878l.loadAd;
        c0444l = c15878l.yandex;
        if (c0444l != null) {
            return new C18480l(c0444l, c9754l);
        }
        int i9 = c9754l.f19892l;
        C2830l c2830l2 = (C2830l) interfaceC11766l.get();
        Uri uri2 = this.loadAd;
        InterfaceC1400l interfaceC1400l2 = (InterfaceC1400l) C15643l.signatures().subscription(7);
        C11337l c11337l3 = C11337l.yandex;
        int i10 = AbstractC5004l.yandex;
        C11337l c11337l4 = C11337l.loadAd;
        inputStreamRemoteconfig = AbstractC6660l.remoteconfig(c2830l2.loadAd(uri2));
        AbstractC0288l abstractC0288lYandex2 = ((C4194l) interfaceC1400l2).yandex(inputStreamRemoteconfig, c11337l4);
        if (inputStreamRemoteconfig != null) {
            inputStreamRemoteconfig.close();
        }
        return new C18480l((C15643l) abstractC0288lYandex2, new C9754l(4, i9, i3));
    }
}
