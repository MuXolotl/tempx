package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.AudioDescriptor;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.StrictMode;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import android.util.SizeF;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import android.widget.RemoteViews;
import androidx.work.impl.background.systemjob.SystemJobService;
import j$.util.Comparator;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِ۟ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12148l {
    public static boolean Signature(PendingIntent pendingIntent) {
        return pendingIntent.isActivity();
    }

    public static Typeface ad(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC12704l.crashlytics(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static final Map adcel(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static void admob(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static C12135l ads(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        C8339l.metrica(AbstractC0653l.vip(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new C12135l(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static final InputConfiguration advert(String str, List list) {
        if (list.isEmpty()) {
            C8339l.smaato("Call to create InputConfiguration but list of InputConfigData is empty.");
            return null;
        }
        if (list.size() == 1) {
            C11765l c11765l = (C11765l) AbstractC16901l.m4231native(list);
            return new InputConfiguration(c11765l.yandex, c11765l.loadAd, c11765l.crashlytics);
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C11765l c11765l2 = (C11765l) it.next();
            AbstractC16491l.purchase();
            arrayList.add(AbstractC16491l.crashlytics(c11765l2.yandex, c11765l2.loadAd, str));
        }
        return AbstractC16491l.loadAd(((C11765l) AbstractC16901l.m4231native(list)).crashlytics, arrayList);
    }

    public static RemoteViews amazon(Map map) {
        return new RemoteViews((Map<SizeF, RemoteViews>) map);
    }

    public static RemoteViews applovin(int i, int i2, String str) {
        return new RemoteViews(str, i, i2);
    }

    public static boolean appmetrica(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    public static void billing(Context context, C1196l c1196l) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C5077l c5077l = new C5077l(c1196l);
            telephonyManager.registerTelephonyCallback((Executor) c1196l.f3253l, c5077l);
            telephonyManager.unregisterTelephonyCallback(c5077l);
        } catch (RuntimeException unused) {
            c1196l.applovin(5);
        }
    }

    public static EdgeEffect crashlytics(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static int[] m3361extends(NetworkRequest networkRequest) {
        return networkRequest.getTransportTypes();
    }

    public static C9550l firebase(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new C12539l(audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile(), audioProfile.getMediaType()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new C6410l(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return C9550l.purchase(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static void inmobi(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void isPro(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static void isVip(ViewOnAttachStateChangeListenerC0348l viewOnAttachStateChangeListenerC0348l, long[] jArr, Consumer consumer) {
        C18666l c18666l;
        for (long j : jArr) {
            C13874l c13874l = (C13874l) viewOnAttachStateChangeListenerC0348l.loadAd().loadAd((int) j);
            if (c13874l != null && (c18666l = c13874l.yandex) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(viewOnAttachStateChangeListenerC0348l.f1406l.getAutofillId(), c18666l.billing);
                Object objMopub = c18666l.amazon.f13225l.mopub(AbstractC0424l.applovin);
                if (objMopub == null) {
                    objMopub = null;
                }
                List list = (List) objMopub;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new C3625l(AbstractC2066l.yandex(list, "\n", null, 62))));
                    consumer.t(builder.build());
                }
            }
        }
    }

    public static boolean license() {
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        Locale locale = Locale.ROOT;
        if (AbstractC16648l.isVip(str.toLowerCase(locale), "ums", false)) {
            return true;
        }
        return (Build.MANUFACTURER.equalsIgnoreCase("Itel") || Build.BRAND.equalsIgnoreCase("Itel")) && AbstractC16648l.isVip(str.toLowerCase(locale), "sp", false);
    }

    public static int[] loadAd(NetworkRequest networkRequest) {
        return networkRequest.getCapabilities();
    }

    public static float metrica(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static void mopub(ViewOnAttachStateChangeListenerC0348l viewOnAttachStateChangeListenerC0348l, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C13874l c13874l;
        C18666l c18666l;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (c13874l = (C13874l) viewOnAttachStateChangeListenerC0348l.loadAd().loadAd((int) jKeyAt)) != null && (c18666l = c13874l.yandex) != null) {
                Object objMopub = c18666l.amazon.f13225l.mopub(AbstractC16601l.smaato);
                if (objMopub == null) {
                    objMopub = null;
                }
                C7629l c7629l = (C7629l) objMopub;
                if (c7629l != null && (function1 = (Function1) c7629l.loadAd) != null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static void m3362native(View view, C6312l c6312l) {
        RenderEffect renderEffect;
        if (c6312l != null) {
            renderEffect = c6312l.yandex;
            if (renderEffect == null) {
                renderEffect = c6312l.loadAd;
                c6312l.yandex = renderEffect;
            }
        } else {
            renderEffect = null;
        }
        view.setRenderEffect(renderEffect);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static void m3363package(MediaDrm mediaDrm, byte[] bArr, C17849l c17849l) {
        LogSessionId logSessionIdYandex = c17849l.yandex();
        if (logSessionIdYandex.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionIdYandex);
    }

    public static StrictMode.VmPolicy.Builder premium(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static final String m3364private(C4166l c4166l, Context context) {
        List list = c4166l.yandex;
        C8420l c8420lYandex = AbstractC5998l.yandex(context);
        int i = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i == 0) {
            return AbstractC2066l.yandex(list, null, new C9673l(c8420lYandex), 31);
        }
        if (list.size() > 0) {
            list.get(0).getClass();
            C18725l.loadAd();
            return null;
        }
        return ((Object) (!list.isEmpty() ? "," : "")) + "'wght' " + AbstractC8576l.amazon(i + 400.0f, 1.0f, 1000.0f);
    }

    public static Bitmap pro(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }

    public static Bitmap purchase(int i, int i2, byte[] bArr) throws IOException {
        BitmapFactory.Options options;
        int i3 = 0;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw C17655l.yandex(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C17769l c17769l = new C17769l(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (c17769l.crashlytics(1, "Orientation")) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static AbstractC1186l remoteconfig(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            C9258l c9258l = AbstractC1186l.f3181l;
            return C13708l.f26763l;
        }
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(new C12174l())));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorAmazon = C8339l.amazon(it.next());
            if (audioDescriptorAmazon.getStandard() == 1) {
                byte[] descriptor = audioDescriptorAmazon.getDescriptor();
                if (descriptor.length != 3) {
                    AbstractC6427l.vip("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(AbstractC15323l.Signature(i)));
                    }
                }
            }
        }
        return AbstractC1186l.Signature(treeSet);
    }

    public static float signatures(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static EncoderProfiles smaato(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    public static Shader.TileMode startapp() {
        return Shader.TileMode.DECAL;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static void m3365strictfp(C0458l c0458l, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((C1139l) c0458l.f1691l).yandex;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            AbstractC6427l.subs("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }

    public static void subs(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static int subscription(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f478l;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static void m3366synchronized(C1424l c1424l, C17849l c17849l) {
        LogSessionId logSessionIdYandex = c17849l.yandex();
        if (logSessionIdYandex.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) c1424l.f3602l).setString("log-session-id", logSessionIdYandex.getStringId());
    }

    public static final List tapsense(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        return cameraExtensionCharacteristics.getSupportedExtensions();
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static void m3367throws(Notification.Builder builder, int i) {
        builder.setForegroundServiceBehavior(i);
    }

    public static Path vip(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static void m3368volatile(RenderNode renderNode, C6312l c6312l) {
        RenderEffect renderEffect;
        if (c6312l != null) {
            renderEffect = c6312l.yandex;
            if (renderEffect == null) {
                renderEffect = c6312l.loadAd;
                c6312l.yandex = renderEffect;
            }
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public static void yandex(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        remoteViews.addStableView(i, remoteViews2, i2);
    }
}
