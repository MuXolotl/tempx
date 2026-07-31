package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.icu.text.DecimalFormatSymbols;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.UserManager;
import android.util.Log;
import android.view.PixelCopy;
import android.view.PointerIcon;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.inputmethod.EditorInfo;
import j$.util.stream.IntStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: lِٛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11965l {
    public static volatile AbstractC17238l yandex;

    public static void Signature(SurfaceView surfaceView, Bitmap bitmap, PixelCopyOnPixelCopyFinishedListenerC8933l pixelCopyOnPixelCopyFinishedListenerC8933l, Handler handler) {
        PixelCopy.request(surfaceView, bitmap, pixelCopyOnPixelCopyFinishedListenerC8933l, handler);
    }

    public static void ad(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static boolean adcel(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static Context admob(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static boolean ads(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static void advert(EditorInfo editorInfo, C10537l c10537l) {
        if (AbstractC8576l.yandex(c10537l, C10537l.f21447l)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c10537l, 10));
        Iterator it = c10537l.f21449l.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9293l) it.next()).yandex);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C4291l amazon(C7931l c7931l, C5664l c5664l, Map map) {
        LinkedHashMap linkedHashMap;
        Object obj;
        AbstractC8698l abstractC8698l;
        C9494l c9494lYandex;
        String str = c7931l.yandex;
        LinkedHashMap linkedHashMap2 = c5664l.f12042l;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it = ((C4617l) c5664l.f12041l.entrySet()).iterator();
        do {
            int i = 1;
            C4291l c4291l = null;
            if (!it.hasNext()) {
                for (C9494l c9494l : c5664l.f12037l) {
                    ArrayList<C16853l> arrayList2 = c9494l.loadAd;
                    int i2 = c9494l.yandex;
                    if (arrayList2.size() == i) {
                        Surface surface = (Surface) map.get(new C16755l(i2));
                        if (surface != null) {
                            linkedHashMap4.put(new C13172l(((C16853l) AbstractC16901l.m4208abstract(arrayList2)).yandex), surface);
                        }
                    } else {
                        for (C16853l c16853l : arrayList2) {
                            Object obj2 = linkedHashMap2.get(c16853l);
                            c4291l = c4291l;
                            if (obj2 == null) {
                                C8339l.smaato("Required value was null.");
                                return c4291l;
                            }
                            OutputConfiguration outputConfigurationCrashlytics = C13502l.crashlytics(linkedHashMap5.get((C11304l) obj2));
                            Surface surface2 = outputConfigurationCrashlytics != null ? outputConfigurationCrashlytics.getSurface() : (Surface) map.get(new C16755l(i2));
                            if (surface2 != null) {
                                linkedHashMap4.put(new C13172l(c16853l.yandex), surface2);
                                i = 1;
                            }
                        }
                    }
                }
                C4291l c4291l2 = c4291l;
                Iterator it2 = c5664l.f12036l.iterator();
                Object obj3 = c4291l2;
                while (it2.hasNext()) {
                    C11304l c11304l = (C11304l) it2.next();
                    ArrayList arrayList3 = c11304l.smaato;
                    ArrayList arrayList4 = c11304l.smaato;
                    List list = c11304l.firebase;
                    Integer num = c11304l.purchase;
                    String str2 = c11304l.amazon;
                    it2 = it2;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        ArrayList arrayList6 = arrayList4;
                        List list2 = list;
                        Surface surface3 = (Surface) map.get(new C16755l(((C9494l) it3.next()).yandex));
                        if (surface3 != null) {
                            arrayList5.add(surface3);
                        }
                        arrayList4 = arrayList6;
                        list = list2;
                    }
                    ArrayList arrayList7 = arrayList4;
                    List list3 = list;
                    OutputConfiguration outputConfigurationCrashlytics2 = C13502l.crashlytics(linkedHashMap5.get(c11304l));
                    linkedHashMap5 = linkedHashMap5;
                    if (outputConfigurationCrashlytics2 == null) {
                        if (c11304l.billing != null) {
                            linkedHashMap = linkedHashMap4;
                            obj = obj3;
                            if (arrayList5.size() != arrayList3.size()) {
                                C5819l c5819lFirebase = C11140l.firebase(null, null, c11304l.billing, c11304l.mopub, c11304l.admob, c11304l.subs, list3, c11304l.loadAd, arrayList7.size() > 1, num != null ? num.intValue() : -1, !AbstractC8576l.yandex(str2, str) ? str2 : c4291l2, 2);
                                if (c5819lFirebase == null) {
                                    Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + c11304l);
                                } else {
                                    arrayList.add(c5819lFirebase);
                                    Iterator it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        linkedHashMap3.put(new C16755l(((C9494l) it4.next()).yandex), c5819lFirebase);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap4;
                            obj = obj3;
                        }
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj4 : arrayList3) {
                                if (!map.containsKey(new C16755l(((C9494l) obj4).yandex))) {
                                    arrayList8.add(obj4);
                                }
                            }
                            C11467l.vip("Surfaces are not yet available for ", c11304l, "! Missing surfaces for ", arrayList8, 33);
                            return c4291l2;
                        }
                        C5819l c5819lFirebase2 = C11140l.firebase((Surface) AbstractC16901l.m4231native(arrayList5), null, null, c11304l.mopub, c11304l.admob, c11304l.subs, list3, c11304l.loadAd, arrayList7.size() > 1, num != null ? num.intValue() : -1, !AbstractC8576l.yandex(str2, str) ? str2 : c4291l2, 6);
                        if (c5819lFirebase2 == null) {
                            Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + c11304l);
                        } else {
                            Iterator it5 = AbstractC16901l.m4233package(1, arrayList5).iterator();
                            while (it5.hasNext()) {
                                c5819lFirebase2.yandex((Surface) it5.next());
                            }
                            C4069l c4069l = c7931l.purchase;
                            if (c4069l != null) {
                                C9494l c9494l2 = (C9494l) c5664l.f12039l.get(c4069l);
                                if (c9494l2 == null) {
                                    C8339l.smaato("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                    return c4291l2;
                                }
                                if (obj == null && arrayList3.contains(c9494l2)) {
                                    obj3 = c5819lFirebase2;
                                    linkedHashMap4 = linkedHashMap;
                                } else {
                                    arrayList.add(c5819lFirebase2);
                                }
                            } else {
                                arrayList.add(c5819lFirebase2);
                            }
                            linkedHashMap4 = linkedHashMap;
                            obj3 = obj;
                        }
                    } else {
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj5 : arrayList3) {
                                if (!map.containsKey(new C16755l(((C9494l) obj5).yandex))) {
                                    arrayList9.add(obj5);
                                }
                            }
                            C11467l.vip("Surfaces are not yet available for ", c11304l, "! Missing surfaces for ", arrayList9, 33);
                            return c4291l2;
                        }
                        arrayList.add(new C5819l(outputConfigurationCrashlytics2));
                        linkedHashMap = linkedHashMap4;
                        obj = obj3;
                    }
                    linkedHashMap4 = linkedHashMap;
                    obj3 = obj;
                }
                return new C4291l(arrayList, linkedHashMap3, obj3, linkedHashMap4);
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i3 = ((C16755l) entry.getKey()).yandex;
            abstractC8698l = (AbstractC8698l) entry.getValue();
            c9494lYandex = c5664l.yandex(i3);
            if (c9494lYandex == null) {
                C8339l.smaato("Required value was null.");
                return null;
            }
        } while (c9494lYandex.loadAd.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            C8339l.metrica("Cannot configure multiple outputs pre-S!");
            return null;
        }
        AbstractC18202l.yandex.loadAd(AbstractC6739l.class);
        abstractC8698l.getClass();
        throw null;
    }

    public static final C16251l applovin(C9268l c9268l, AbstractC9151l abstractC9151l, C17740l c17740l) throws IOException {
        ServerSocketChannel serverSocketChannelOpenServerSocketChannel;
        SelectorProvider selectorProvider = c9268l.f19054l;
        if (abstractC9151l instanceof C4378l) {
            serverSocketChannelOpenServerSocketChannel = selectorProvider.openServerSocketChannel();
        } else {
            if (!(abstractC9151l instanceof C10516l)) {
                C18725l.billing();
                return null;
            }
            serverSocketChannelOpenServerSocketChannel = (ServerSocketChannel) SelectorProvider.class.getMethod("openServerSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        }
        try {
            if (abstractC9151l instanceof C4378l) {
                AbstractC12400l.yandex(serverSocketChannelOpenServerSocketChannel, c17740l);
            }
            boolean z = AbstractC12400l.yandex;
            serverSocketChannelOpenServerSocketChannel.configureBlocking(false);
            C16251l c16251l = new C16251l(serverSocketChannelOpenServerSocketChannel, c9268l);
            boolean z2 = AbstractC12400l.yandex;
            ServerSocketChannel serverSocketChannel = c16251l.f31804l;
            if (z2) {
                serverSocketChannel.bind(abstractC9151l.mopub(), 511);
                return c16251l;
            }
            serverSocketChannel.socket().bind(abstractC9151l.mopub(), 511);
            return c16251l;
        } catch (Throwable th) {
            serverSocketChannelOpenServerSocketChannel.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:79:0x0185, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:26:0x0049, B:28:0x004f, B:30:0x0057, B:78:0x0181, B:80:0x0188, B:81:0x018b, B:82:0x018c, B:31:0x005b, B:32:0x005e, B:33:0x006b, B:35:0x0071, B:41:0x0087, B:43:0x008d, B:44:0x0099, B:65:0x0165, B:66:0x0168, B:74:0x0178, B:73:0x0175, B:75:0x0179, B:76:0x017e, B:77:0x017f, B:36:0x0077, B:40:0x007e), top: B:87:0x0007, inners: #3 }] */
    public static AbstractC17238l appmetrica(Context context) {
        AbstractC17238l abstractC17238l;
        AbstractC17238l c13464l;
        AbstractC17238l c13464l2;
        char c;
        AbstractC17238l abstractC17238l2 = yandex;
        if (abstractC17238l2 != null) {
            return abstractC17238l2;
        }
        synchronized (AbstractC11965l.class) {
            try {
                abstractC17238l = yandex;
                if (abstractC17238l == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    C11154l c11154l = AbstractC8554l.yandex;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        abstractC17238l = C1972l.f4482l;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        UserManager userManager = AbstractC18452l.yandex;
                        char c2 = 1;
                        char c3 = 0;
                        Context contextCreateDeviceProtectedStorageContext = (!(Build.VERSION.SDK_INT >= 24) || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                c13464l = file.exists() ? new C13464l(file) : C1972l.f4482l;
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                c13464l = C1972l.f4482l;
                            }
                            if (c13464l.crashlytics()) {
                                File file2 = (File) c13464l.loadAd();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        C5128l c5128l = new C5128l(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c3]);
                                                String strDecode = Uri.decode(new String(strArrSplit[c2]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                C5128l c5128l2 = (C5128l) c5128l.get(str3);
                                                if (c5128l2 == null) {
                                                    c = 0;
                                                    c5128l2 = new C5128l(0);
                                                    c5128l.put(str3, c5128l2);
                                                } else {
                                                    c = 0;
                                                }
                                                c5128l2.put(strDecode, strDecode2);
                                                c3 = c;
                                                c2 = 1;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        C6299l c6299l = new C6299l(c5128l);
                                        bufferedReader.close();
                                        c13464l2 = new C13464l(c6299l);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                c13464l2 = C1972l.f4482l;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            abstractC17238l = c13464l2;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        abstractC17238l = C1972l.f4482l;
                    }
                    yandex = abstractC17238l;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return abstractC17238l;
    }

    public static IntStream billing(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
    }

    public static boolean crashlytics(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static LocaleList firebase() {
        return LocaleList.getDefault();
    }

    public static final void isPro(Context context, String str) {
        context.deleteSharedPreferences(str);
    }

    public static void isVip(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }

    public static final void license(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static final C17963l loadAd(Map map, C5664l c5664l) {
        C17963l c17963l = new C17963l();
        for (C9494l c9494l : c5664l.f12037l) {
            Surface surface = (Surface) map.get(new C16755l(c9494l.yandex));
            if (surface != null) {
                Iterator it = c9494l.loadAd.iterator();
                while (it.hasNext()) {
                    c17963l.put(new C13172l(((C16853l) it.next()).yandex), surface);
                }
            }
        }
        return c17963l.crashlytics();
    }

    public static String[] metrica(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Context mopub(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static void premium(Service service, int i) {
        service.stopForeground(i);
    }

    public static byte pro(C9293l c9293l) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(c9293l.yandex).getZeroDigit());
    }

    public static IntStream purchase(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.chars());
    }

    public static LocaleList remoteconfig(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void signatures(C2012l c2012l, C10537l c10537l) {
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c10537l, 10));
        Iterator it = c10537l.f21449l.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9293l) it.next()).yandex);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        c2012l.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static DecimalFormatSymbols smaato(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static Uri[] startapp(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static LocaleList subs(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static boolean subscription(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final void tapsense(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
    }

    public static PointerIcon vip(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static void yandex(Service service, boolean z) {
        service.stopForeground(z ? 1 : 2);
    }
}
