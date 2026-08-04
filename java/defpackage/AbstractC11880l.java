package defpackage;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.ImageWriter;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.contentcapture.ContentCaptureSession;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.List;

/* JADX INFO: renamed from: lِٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11880l {
    public static int Signature(int i, int i2, C13736l c13736l) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iSignature = AbstractC15323l.Signature(i3);
            if (iSignature != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iSignature).build(), c13736l.crashlytics())) {
                return i3;
            }
        }
        return 0;
    }

    public static final void ad(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static int adcel(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            C12984l c12984l = new C12984l();
            c12984l.vip = AbstractC3825l.vip("video/avc");
            C5978l c5978l = new C5978l(c12984l);
            String str = c5978l.metrica;
            if (str != null) {
                List listPurchase = AbstractC4727l.purchase(str, z, false);
                String strCrashlytics = AbstractC4727l.crashlytics(c5978l);
                Iterable iterablePurchase = strCrashlytics == null ? C13708l.f26763l : AbstractC4727l.purchase(strCrashlytics, z, false);
                C16971l c16971lMetrica = AbstractC1186l.metrica();
                c16971lMetrica.amazon(listPurchase);
                c16971lMetrica.amazon(iterablePurchase);
                C13708l c13708lMopub = c16971lMetrica.mopub();
                for (int i = 0; i < c13708lMopub.f26765l; i++) {
                    if (((C6403l) c13708lMopub.get(i)).amazon != null && (videoCapabilities = ((C6403l) c13708lMopub.get(i)).amazon.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (C4875l.isPro(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (C11928l unused) {
        }
        return 0;
    }

    public static void admob(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static ColorStateList ads(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static final long advert(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        return viewTreeObserverOnGlobalLayoutListenerC13840l.getUniqueDrawingId();
    }

    public static void amazon(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static boolean applovin() {
        return Trace.isEnabled();
    }

    public static boolean appmetrica(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public static void billing(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static final BlendMode m3270case(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static void m3271catch(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static final PorterDuff.Mode m3272class(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static final ImageDecoder.Source m3273continue(InterfaceC7204l interfaceC7204l, C15106l c15106l, boolean z) {
        C14025l c14025lMo2152l;
        if (interfaceC7204l.getFileSystem() == AbstractC5921l.f12465l && (c14025lMo2152l = interfaceC7204l.mo2152l()) != null) {
            return ImageDecoder.createSource(c14025lMo2152l.toFile());
        }
        AbstractC7799l abstractC7799lMo2150interface = interfaceC7204l.mo2150interface();
        if (abstractC7799lMo2150interface instanceof C2951l) {
            return ImageDecoder.createSource(c15106l.yandex.getAssets(), ((C2951l) abstractC7799lMo2150interface).loadAd);
        }
        if ((abstractC7799lMo2150interface instanceof C5148l) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((C5148l) abstractC7799lMo2150interface).loadAd;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new CallableC9758l(2, assetFileDescriptor));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (abstractC7799lMo2150interface instanceof C6677l) {
            C6677l c6677l = (C6677l) abstractC7799lMo2150interface;
            if (c6677l.loadAd.equals(c15106l.yandex.getPackageName())) {
                return ImageDecoder.createSource(c15106l.yandex.getResources(), c6677l.crashlytics);
            }
        }
        if (!(abstractC7799lMo2150interface instanceof C10616l)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((C10616l) abstractC7799lMo2150interface).loadAd.isDirect()) {
            return ImageDecoder.createSource(((C10616l) abstractC7799lMo2150interface).loadAd);
        }
        return null;
    }

    public static void crashlytics() {
        Trace.beginAsyncSection("GlanceAppWidget::update", 0);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static void m3274else(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            C14513l c14513lTapsense = C14513l.tapsense();
            String str = SystemForegroundService.f483l;
            if (c14513lTapsense.f28392l <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            C14513l c14513lTapsense2 = C14513l.tapsense();
            String str2 = SystemForegroundService.f483l;
            if (c14513lTapsense2.f28392l <= 5) {
                Log.w(str2, "Unable to start foreground service", e2);
            }
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static void m3275extends(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void firebase(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static void m3276for(int i, String str) {
        Trace.setCounter(str, i);
    }

    public static Object inmobi(int i) {
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return BlendMode.LIGHTEN;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return BlendMode.COLOR_DODGE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return BlendMode.MULTIPLY;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return BlendMode.HUE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return BlendMode.SATURATION;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return BlendMode.COLOR;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static final void m3277interface(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static void isPro(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static final ImageWriter isVip(int i, Surface surface) {
        return ImageWriter.newInstance(surface, 1, i);
    }

    public static String license(Context context) {
        return context.getOpPackageName();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    public static int loadAd(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (C4875l.isPro(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && AbstractC9027l.purchase == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 37) {
                    z = false;
                } else {
                    int iAdcel = adcel(true);
                    if (i5 < 35 ? !(adcel(false) != 2 || iAdcel == 1) : iAdcel != 1) {
                        z = false;
                    }
                }
                AbstractC9027l.purchase = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static void metrica() {
        Trace.endAsyncSection("GlanceAppWidget::update", 0);
    }

    public static void mopub(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static void m3278native(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static void m3279package(Resources.Theme theme) {
        theme.rebase();
    }

    public static boolean premium() {
        return Trace.isEnabled();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static void m3280private(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static int pro(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static void purchase(Canvas canvas) {
        canvas.disableZ();
    }

    public static void remoteconfig(Canvas canvas) {
        canvas.enableZ();
    }

    public static void signatures(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (AbstractC0555l.mopub(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC4311l.mopub(null);
            return;
        }
        C3823l c3823l = new C3823l();
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                SharedPreferences.Editor editorEdit = AbstractC0555l.mopub(context).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            }
        } finally {
            c3823l.metrica(null);
        }
    }

    public static void smaato(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void startapp(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static void m3281strictfp(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void subs(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static ContentCaptureSession subscription(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static final BlendMode m3282switch(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 28) {
            return BlendMode.LUMINOSITY;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        return i == 3 ? BlendMode.SRC_OVER : BlendMode.SRC_IN;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final void m3283synchronized(Activity activity, C10339l.yandex yandexVar) {
        activity.registerActivityLifecycleCallbacks(yandexVar);
    }

    public static C13708l tapsense(C13736l c13736l) {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        AbstractC10199l abstractC10199lRemoteconfig = C8193l.admob.keySet().iterator();
        while (abstractC10199lRemoteconfig.hasNext()) {
            Integer num = (Integer) abstractC10199lRemoteconfig.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= AbstractC15323l.tapsense(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c13736l.crashlytics())) {
                c16971lMetrica.crashlytics(num);
            }
        }
        c16971lMetrica.crashlytics(2);
        return c16971lMetrica.mopub();
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static void m3284throw(Service service, int i, Notification notification) {
        try {
            service.startForeground(i, notification, 2);
        } catch (RuntimeException e) {
            AbstractC6427l.admob("Util", "The service must be declared with a foregroundServiceType that includes mediaPlayback");
            throw e;
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static Insets m3285throws(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void vip(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static void m3286volatile(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }

    public static void yandex(AudioAttributes.Builder builder, boolean z) {
        builder.setHapticChannelsMuted(z);
    }
}
