package defpackage;

import android.R;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteAction;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.icu.text.DecimalFormatSymbols;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٓؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13950l {
    public static Boolean amazon;
    public static int crashlytics;
    public static String loadAd;
    public static AudioManager yandex;

    public static final int Signature(OutputConfiguration outputConfiguration) {
        return outputConfiguration.getMaxSharedSurfaceCount();
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static void m3801abstract(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static final Set ad(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getPhysicalCameraIds();
    }

    public static List adcel(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static Handler admob(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] ads(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static final Map advert(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraResults();
    }

    public static void amazon(Menu menu, int i, Context context, TextClassification textClassification, int i2, Drawable drawable) {
        int i3 = 1;
        if (i2 < 0) {
            MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(drawable);
            menuItemAdd.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC3470l(context, textClassification, i3));
            return;
        }
        i3 = i2 != 0 ? 0 : 1;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, i3 != 0 ? 16908353 : 0, i, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(i3 == 0 ? 0 : 2);
        if (drawable != null) {
            menuItemAdd2.setIcon(drawable);
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: lٔٗۡ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                AbstractC13950l.yandex(remoteAction);
                return true;
            }
        });
    }

    public static int applovin(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int appmetrica(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static final void billing(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static int m3802case(AudioManager audioManager, C1750l c1750l) {
        if (Build.VERSION.SDK_INT < 26) {
            return audioManager.requestAudioFocus(c1750l.loadAd, c1750l.amazon.amazon(), c1750l.yandex);
        }
        Object obj = c1750l.billing;
        obj.getClass();
        return audioManager.requestAudioFocus((AudioFocusRequest) obj);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static boolean m3803catch(Handler handler, RunnableC14394l runnableC14394l, long j) {
        return handler.postDelayed(runnableC14394l, "retry_token", j);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static int m3804class(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static int m3805continue(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static final DisplayCutout crashlytics(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException) && !(e instanceof NoSuchFieldException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof InstantiationException)) {
                throw e;
            }
            InterfaceC3990l.loadAd.getClass();
            Log.w(C18496l.loadAd, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static void m3806default(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static final void m3807else(CameraManager cameraManager, Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        cameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static boolean m3808extends(NetworkRequest networkRequest, int i) {
        return networkRequest.hasTransport(i);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static final void m3809final(SessionConfiguration sessionConfiguration, InputConfiguration inputConfiguration) {
        sessionConfiguration.setInputConfiguration(inputConfiguration);
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public static boolean m3810finally(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static final void firebase(CameraDevice cameraDevice, SessionConfiguration sessionConfiguration) throws CameraAccessException {
        cameraDevice.createCaptureSession(sessionConfiguration);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static final boolean m3811for(ConnectivityManager connectivityManager) {
        if (AbstractC3629l.crashlytics.loadAd != null) {
            return true;
        }
        try {
            if (AbstractC11173l.amazon(1)) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork != null) {
                    if (AbstractC11173l.amazon(2)) {
                        LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                        if (linkProperties == null || !linkProperties.isPrivateDnsActive()) {
                        }
                    } else {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                        }
                    }
                    return true;
                }
                return false;
            }
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp()) {
                    String name = networkInterfaceNextElement.getName();
                    if (AbstractC12024l.appmetrica(name, "tun", false) || AbstractC12024l.appmetrica(name, "ppp", false) || AbstractC12024l.appmetrica(name, "pptp", false)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static void m3812goto(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final void m3813import(OutputConfiguration outputConfiguration, String str) {
        outputConfiguration.setPhysicalCameraId(str);
    }

    public static int inmobi(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static final void m3814instanceof(SessionConfiguration sessionConfiguration, CaptureRequest captureRequest) {
        sessionConfiguration.setSessionParameters(captureRequest);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static int m3815interface(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static Handler isPro(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String isVip() {
        return Application.getProcessName();
    }

    public static String license() throws Throwable {
        BufferedReader bufferedReader;
        if (loadAd == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                loadAd = Application.getProcessName();
            } else {
                int iMyPid = crashlytics;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    crashlytics = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb.append("/proc/");
                        sb.append(iMyPid);
                        sb.append("/cmdline");
                        String string = sb.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                AbstractC1051l.subs(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                AbstractC1051l.remoteconfig(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    AbstractC1051l.remoteconfig(bufferedReader);
                }
                loadAd = strTrim;
            }
        }
        return loadAd;
    }

    public static void loadAd(AudioManager audioManager, C1750l c1750l) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(c1750l.loadAd);
            return;
        }
        Object obj = c1750l.billing;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static final List metrica(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    public static Typeface mopub(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static Uri m3816native(Object obj) {
        return ((Icon) obj).getUri();
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static void m3817new(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static int m3818package(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static String premium(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static boolean m3819private(NetworkRequest networkRequest, int i) {
        return networkRequest.hasCapability(i);
    }

    public static void pro(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final void m3820public(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static void purchase(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static TextClassifier remoteconfig(Context context, EnumC16103l enumC16103l) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = enumC16103l.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                C18725l.billing();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static int signatures(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static C8891l smaato(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                C14513l c14513lTapsense = C14513l.tapsense();
                String str = C8891l.loadAd;
                String str2 = C8891l.loadAd;
                String strAppmetrica = AbstractC12589l.appmetrica("Ignoring adding capability '", i, '\'');
                if (c14513lTapsense.f28392l <= 5) {
                    Log.w(str2, strAppmetrica, e);
                }
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = AbstractC2829l.yandex[i2];
            if (!AbstractC8669l.tapsense(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    C14513l c14513lTapsense2 = C14513l.tapsense();
                    String str3 = C8891l.loadAd;
                    String str4 = C8891l.loadAd;
                    String strAppmetrica2 = AbstractC12589l.appmetrica("Ignoring removing default capability '", i3, '\'');
                    if (c14513lTapsense2.f28392l <= 5) {
                        Log.w(str4, strAppmetrica2, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        return new C8891l(builder.build());
    }

    public static final List startapp(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static int m3821static(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static PrecomputedText.Params m3822strictfp(C9189l c9189l) {
        return c9189l.getTextMetricsParams();
    }

    public static Handler subs(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static long subscription(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static void m3823super(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static byte m3824switch(C9293l c9293l) {
        return Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(c9293l.yandex).getDigitStrings()[0], 0));
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static int m3825synchronized(AudioManager audioManager, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i);
        }
        return 0;
    }

    public static Executor tapsense(Context context) {
        return context.getMainExecutor();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public static Person m3826this(C18283l c18283l) {
        Person.Builder name = new Person.Builder().setName(c18283l.yandex);
        IconCompat iconCompat = c18283l.loadAd;
        return name.setIcon(iconCompat != null ? iconCompat.subs(null) : null).setUri(c18283l.crashlytics).setKey(c18283l.amazon).setBot(c18283l.purchase).setImportant(c18283l.billing).build();
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static final void m3827throw(CameraManager cameraManager, String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException {
        cameraManager.openCamera(str, executor, stateCallback);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static int m3828throws(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public static boolean m3829try() {
        Boolean boolValueOf = amazon;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objPurchase = AbstractC17332l.purchase(Process.class, "isIsolated", new C17516l[0]);
                    Object[] objArr = new Object[0];
                    if (objPurchase == null) {
                        throw new C6451l(AbstractC6791l.signatures("expected a non-null reference", objArr), 23, (byte) 0);
                    }
                    boolValueOf = (Boolean) objPurchase;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            amazon = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static synchronized AudioManager vip(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                yandex = null;
            }
            AudioManager audioManager = yandex;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                C5811l c5811l = new C5811l();
                AbstractC2991l.firebase().execute(new RunnableC7762l(applicationContext, c5811l, 6));
                c5811l.loadAd();
                AudioManager audioManager2 = yandex;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            yandex = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static int m3830volatile(Object obj) {
        return ((Icon) obj).getType();
    }

    public static void yandex(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC5917l.m1869package(actionIntent);
        } else {
            actionIntent.send();
        }
    }
}
