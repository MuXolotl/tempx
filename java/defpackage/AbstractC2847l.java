package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؔۗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2847l {
    public static Bitmap yandex;

    public static final boolean Signature(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void ad(C11941l c11941l, C1527l c1527l, C13984l c13984l) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = c11941l.findOnBackInvokedDispatcher();
        if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
            return;
        }
        C0616l c0616l = new C0616l(onBackInvokedDispatcherFindOnBackInvokedDispatcher);
        c1527l.loadAd(c0616l);
        c13984l.invoke(c0616l);
    }

    public static C15421l adcel(InterfaceC5389l interfaceC5389l) {
        Long l = (Long) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (C15421l) AbstractC12156l.yandex.get(l);
        }
        return null;
    }

    public static final Set admob(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.getAvailableCaptureResultKeys(i);
    }

    public static String ads(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final void advert(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setDynamicRangeProfile(j);
    }

    public static C9550l amazon(EncoderProfiles encoderProfiles) {
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
            arrayList2.add(new C6410l(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return C9550l.purchase(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static final void applovin(OutputConfiguration outputConfiguration, int i) {
        outputConfiguration.setMirrorMode(i);
    }

    public static final void appmetrica(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setStreamUseCase(j);
    }

    public static ArrayList billing(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            arrayList2.add(new C1410l(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, str2.equals(str)));
        }
        return arrayList2;
    }

    public static final C6312l crashlytics(C11183l c11183l, C13153l c13153l) {
        RenderEffect renderEffectCreateBlurEffect;
        float f = c13153l.crashlytics;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return null;
        }
        float f2 = c13153l.yandex * f;
        if (C14467l.yandex(f2, 0.0f) < 0) {
            C8339l.metrica("blurRadius needs to be equal or greater than 0.dp");
            return null;
        }
        long jAdmob = C14174l.admob(f, c13153l.amazon);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (jAdmob & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (jAdmob >> 32))))) << 32);
        long jIsPro = C1187l.isPro(f, c13153l.purchase);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(AbstractC5573l.ads(Float.intBitsToFloat((int) (jIsPro >> 32))))) << 32) | (((long) Float.floatToRawIntBits(AbstractC5573l.ads(Float.intBitsToFloat((int) (jIsPro & 4294967295L))))) & 4294967295L);
        C10417l c10417l = c13153l.subs;
        Shader shaderCrashlytics = c10417l != null ? AbstractC17551l.yandex(c10417l).crashlytics(jFloatToRawIntBits) : null;
        if (C14467l.yandex(f2, 0.0f) <= 0) {
            renderEffectCreateBlurEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
        } else if (i < 33 || shaderCrashlytics == null) {
            try {
                float fMo868instanceof = ((InterfaceC13490l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.admob)).mo868instanceof(f2);
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fMo868instanceof, fMo868instanceof, AbstractC0509l.amazon(c13153l.isPro));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC15560l.Signature("Error whilst calling RenderEffect.createBlurEffect. This is likely because this device does not support a blur radius of ", C14467l.crashlytics(f2), "dp"), e);
            }
        } else {
            float fMo868instanceof2 = ((InterfaceC13490l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.admob)).mo868instanceof(f2);
            renderEffectCreateBlurEffect = RenderEffect.createChainEffect(loadAd(fMo868instanceof2, jFloatToRawIntBits2, jFloatToRawIntBits, shaderCrashlytics, true), loadAd(fMo868instanceof2, jFloatToRawIntBits2, jFloatToRawIntBits, shaderCrashlytics, false));
        }
        Context context = (Context) AbstractC13402l.loadAd(c11183l, AbstractC1242l.loadAd);
        float f3 = c13153l.loadAd;
        if (f3 >= 0.005f) {
            if (f <= 0.0f) {
                f = 1.0f;
            }
            Bitmap bitmapRemoteconfig = remoteconfig(context);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapRemoteconfig, tileMode, tileMode);
            if (Math.abs(f - 1.0f) >= 0.001f) {
                Matrix matrix = new Matrix();
                float f4 = 1.0f / f;
                matrix.setScale(f4, f4);
                bitmapShader.setLocalMatrix(matrix);
            }
            float fAmazon = AbstractC8576l.amazon(f3, 0.0f, 1.0f);
            RenderEffect renderEffectCreateShaderEffect = RenderEffect.createShaderEffect(bitmapShader);
            if (fAmazon < 1.0f) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setScale(1.0f, 1.0f, 1.0f, fAmazon);
                renderEffectCreateShaderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffectCreateShaderEffect);
            }
            if (shaderCrashlytics != null) {
                renderEffectCreateShaderEffect = RenderEffect.createBlendModeEffect(RenderEffect.createShaderEffect(shaderCrashlytics), renderEffectCreateShaderEffect, BlendMode.SRC_IN);
            }
            renderEffectCreateBlurEffect = RenderEffect.createBlendModeEffect(renderEffectCreateShaderEffect, renderEffectCreateBlurEffect, BlendMode.DST_ATOP);
        }
        List<C12870l> list = c13153l.billing;
        float f5 = c13153l.mopub;
        for (C12870l c12870l : list) {
            boolean zYandex = c12870l.yandex();
            int i2 = c12870l.loadAd;
            if (zYandex) {
                AbstractC9544l abstractC9544l = c12870l.crashlytics;
                Shader shaderCrashlytics2 = (abstractC9544l == null || !(abstractC9544l instanceof AbstractC17404l)) ? null : ((AbstractC17404l) abstractC9544l).crashlytics(jFloatToRawIntBits);
                if (shaderCrashlytics2 != null) {
                    RenderEffect renderEffectCreateShaderEffect2 = f5 >= 1.0f ? RenderEffect.createShaderEffect(shaderCrashlytics2) : RenderEffect.createColorFilterEffect(new BlendModeColorFilter(AbstractC12953l.startapp(C9735l.loadAd(f5, C9735l.admob)), BlendMode.SRC_IN), RenderEffect.createShaderEffect(shaderCrashlytics2));
                    renderEffectCreateBlurEffect = shaderCrashlytics != null ? yandex(renderEffectCreateBlurEffect, RenderEffect.createBlendModeEffect(RenderEffect.createShaderEffect(shaderCrashlytics), renderEffectCreateShaderEffect2, BlendMode.SRC_IN), AbstractC11880l.m3282switch(i2), jFloatToRawIntBits2) : yandex(renderEffectCreateBlurEffect, renderEffectCreateShaderEffect2, AbstractC11880l.m3282switch(i2), jFloatToRawIntBits2);
                } else {
                    long jLoadAd = c12870l.yandex;
                    if (f5 < 1.0f) {
                        jLoadAd = C9735l.loadAd(C9735l.amazon(jLoadAd) * f5, jLoadAd);
                    }
                    if (C9735l.amazon(jLoadAd) >= 0.005f) {
                        renderEffectCreateBlurEffect = shaderCrashlytics != null ? yandex(renderEffectCreateBlurEffect, RenderEffect.createColorFilterEffect(new BlendModeColorFilter(AbstractC12953l.startapp(jLoadAd), BlendMode.SRC_IN), RenderEffect.createShaderEffect(shaderCrashlytics)), AbstractC11880l.m3282switch(i2), jFloatToRawIntBits2) : RenderEffect.createColorFilterEffect(new BlendModeColorFilter(AbstractC12953l.startapp(jLoadAd), AbstractC11880l.m3282switch(i2)), renderEffectCreateBlurEffect);
                    }
                }
            }
        }
        AbstractC9544l abstractC9544l2 = c13153l.admob;
        BlendMode blendMode = BlendMode.DST_IN;
        if (abstractC9544l2 != null) {
            Shader shaderCrashlytics3 = abstractC9544l2 instanceof AbstractC17404l ? ((AbstractC17404l) abstractC9544l2).crashlytics(jFloatToRawIntBits) : null;
            if (shaderCrashlytics3 != null) {
                renderEffectCreateBlurEffect = yandex(renderEffectCreateBlurEffect, RenderEffect.createShaderEffect(shaderCrashlytics3), blendMode, jFloatToRawIntBits2);
            }
        }
        return new C6312l(renderEffectCreateBlurEffect);
    }

    public static int firebase() {
        int i = Build.VERSION.SDK_INT;
        return (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Alert.DURATION_SHOW_INDEFINITELY : MediaStore.getPickImagesMaxLimit();
    }

    public static void inmobi(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static AudioDeviceInfo isPro(AudioManager audioManager, C13736l c13736l) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c13736l.crashlytics());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    public static final void isVip(CursorAnchorInfo.Builder builder, C8896l c8896l) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(AbstractC5833l.firebase(c8896l)).setHandwritingBounds(AbstractC5833l.firebase(c8896l)).build());
    }

    public static boolean license(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }

    public static final RenderEffect loadAd(float f, long j, long j2, Shader shader, boolean z) {
        RuntimeShader runtimeShader = new RuntimeShader(z ? (String) AbstractC10648l.yandex.getValue() : (String) AbstractC10648l.loadAd.getValue());
        runtimeShader.setFloatUniform("blurRadius", f);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        runtimeShader.setFloatUniform("crop", Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
        runtimeShader.setInputShader("mask", shader);
        return RenderEffect.createRuntimeShaderEffect(runtimeShader, "content");
    }

    public static Object metrica(String str, Bundle bundle) {
        return bundle.getParcelable(str, C6597l.class);
    }

    public static final Set mopub(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(i);
    }

    public static final void premium(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static boolean pro(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static C15053l purchase(InterfaceC5389l interfaceC5389l) {
        int i = Build.VERSION.SDK_INT;
        C15053l c15053l = null;
        if (i >= 33) {
            DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES);
            if (dynamicRangeProfiles != null) {
                if (i < 33) {
                    C8936l.subs(AbstractC15560l.tapsense("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", i, " (requires API 33)"));
                    return null;
                }
                c15053l = new C15053l(new C12099l(dynamicRangeProfiles));
            }
        }
        return c15053l == null ? C3201l.yandex : c15053l;
    }

    public static final Bitmap remoteconfig(Context context) {
        Bitmap bitmap = yandex;
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.haze_noise);
        yandex = bitmapDecodeResource;
        return bitmapDecodeResource;
    }

    public static final void signatures(CursorAnchorInfo.Builder builder, C8896l c8896l) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(AbstractC5833l.firebase(c8896l)).setHandwritingBounds(AbstractC5833l.firebase(c8896l)).build());
    }

    public static C1410l smaato(Context context) {
        Object next;
        String strLicense;
        int iMyPid = Process.myPid();
        Iterator it = billing(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C1410l) next).loadAd != iMyPid);
        C1410l c1410l = (C1410l) next;
        if (c1410l != null) {
            return c1410l;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            strLicense = Process.myProcessName();
        } else if ((i < 28 || (strLicense = Application.getProcessName()) == null) && (strLicense = AbstractC13950l.license()) == null) {
            strLicense = "";
        }
        return new C1410l(iMyPid, 0, strLicense, false);
    }

    public static Object startapp(Intent intent) {
        return intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
    }

    public static C8193l subs(AudioManager audioManager, C13736l c13736l, AbstractC1186l abstractC1186l, List list) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c13736l.crashlytics());
        HashMap map = new HashMap();
        map.put(2, new HashSet(AbstractC9966l.yandex(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (AbstractC15323l.m3968for(format) || C8193l.admob.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(AbstractC9966l.yandex(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(AbstractC9966l.yandex(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (Map.Entry entry : map.entrySet()) {
            c16971lMetrica.crashlytics(new C10681l(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C8193l(c16971lMetrica.mopub(), abstractC1186l, list);
    }

    public static final BoringLayout.Metrics subscription(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean tapsense(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static PackageInfo vip(Context context, PackageManager packageManager) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static final RenderEffect yandex(RenderEffect renderEffect, RenderEffect renderEffect2, BlendMode blendMode, long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L && !C1187l.loadAd(j, 0L)) {
            renderEffect2 = RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), renderEffect2);
        }
        return RenderEffect.createBlendModeEffect(renderEffect, renderEffect2, blendMode);
    }
}
