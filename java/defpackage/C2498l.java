package defpackage;

import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.compat.quirk.VideoInterlacingQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: lٌؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2498l implements InterfaceC13241l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C2498l(int i) {
        this.yandex = i;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:164:0x0271  */
    /* JADX WARN: Code duplicated, block: B:170:0x0284  */
    /* JADX WARN: Code duplicated, block: B:177:0x0296  */
    /* JADX WARN: Code duplicated, block: B:180:0x029a  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:187:0x02b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:192:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    private final void yandex(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        int i;
        C1071l c1071l = (C1071l) obj;
        ArrayList arrayList = new ArrayList();
        int i2 = PixelJpegRSupportedQuirk.loadAd;
        int i3 = Build.VERSION.SDK_INT;
        boolean z8 = true;
        if (i3 >= 34) {
            C6412l c6412l = (C6412l) BackportedFixQuirk.yandex.getValue();
            C6687l c6687l = AbstractC14167l.yandex;
            c6412l.getClass();
            if (((Boolean) c6687l.crashlytics.invoke()).booleanValue()) {
                i = (c6687l.loadAd.contains(Build.FINGERPRINT) || ((Set) ((C8688l) c6412l.yandex.f29441l).getValue()).contains(5)) ? 2 : 4;
            } else {
                i = 3;
            }
            int iInmobi = AbstractC5020l.inmobi(i);
            if (iInmobi != 0) {
                if (iInmobi == 1 || iInmobi == 2) {
                    z = false;
                } else if (iInmobi != 3) {
                    C18725l.billing();
                    return;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (c1071l.yandex(PixelJpegRSupportedQuirk.class, z)) {
            arrayList.add(new PixelJpegRSupportedQuirk());
        }
        if (CloseCameraDeviceOnCameraGraphCloseQuirk.yandex || CloseCameraDeviceOnCameraGraphCloseQuirk.loadAd) {
            z2 = true;
        } else if (30 <= i3 && i3 < 34) {
            String str2 = Build.MANUFACTURER;
            if (!str2.equalsIgnoreCase("Oppo")) {
                String str3 = Build.BRAND;
                if (!str3.equalsIgnoreCase("Oppo") && !str2.equalsIgnoreCase("OnePlus") && !str3.equalsIgnoreCase("OnePlus") && !str2.equalsIgnoreCase("Realme") && !str3.equalsIgnoreCase("Realme")) {
                    if (Build.MANUFACTURER.equalsIgnoreCase("Vivo")) {
                    }
                }
            }
            z2 = true;
        } else if (!Build.MANUFACTURER.equalsIgnoreCase("Vivo") || Build.BRAND.equalsIgnoreCase("Vivo") || CloseCameraDeviceOnCameraGraphCloseQuirk.crashlytics || CloseCameraDeviceOnCameraGraphCloseQuirk.purchase || CloseCameraDeviceOnCameraGraphCloseQuirk.amazon) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c1071l.yandex(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z2)) {
            arrayList.add(new CloseCameraDeviceOnCameraGraphCloseQuirk());
        }
        List list = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.yandex;
        String str4 = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (c1071l.yandex(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list.contains(str4.toUpperCase(locale)))) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        String str5 = Build.MANUFACTURER;
        if (c1071l.yandex(ControlZoomRatioRangeAssertionErrorQuirk.class, ((str5.equalsIgnoreCase("Jio") || Build.BRAND.equalsIgnoreCase("Jio")) && AbstractC16648l.isVip(str4, "LS1542QW", true)) || ((str5.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && (AbstractC16648l.isVip(str4, "SM-A025", true) || str4.equalsIgnoreCase("SM-S124DL"))) || ((str5.equalsIgnoreCase("Vivo") || Build.BRAND.equalsIgnoreCase("Vivo")) && str4.equalsIgnoreCase("VIVO 2039")))) {
            arrayList.add(new ControlZoomRatioRangeAssertionErrorQuirk());
        }
        boolean z9 = DisableAbortCapturesOnStopQuirk.yandex;
        if (str5.equalsIgnoreCase("Tecno")) {
            z3 = true;
        } else {
            String str6 = Build.BRAND;
            if (str6.equalsIgnoreCase("Tecno") || str5.equalsIgnoreCase("Tecno-mobile") || str6.equalsIgnoreCase("Tecno-mobile") || DisableAbortCapturesOnStopQuirk.yandex || DisableAbortCapturesOnStopQuirk.loadAd) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (c1071l.yandex(DisableAbortCapturesOnStopQuirk.class, z3)) {
            arrayList.add(new DisableAbortCapturesOnStopQuirk());
        }
        if (str5.equalsIgnoreCase("Samsung")) {
            z4 = true;
        } else {
            String str7 = Build.BRAND;
            if (str7.equalsIgnoreCase("Samsung") || str5.equalsIgnoreCase("Xiaomi") || str7.equalsIgnoreCase("Xiaomi")) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if (c1071l.yandex(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z4)) {
            arrayList.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
        }
        Set set = FlashAvailabilityBufferUnderflowQuirk.yandex;
        Locale locale2 = Locale.US;
        if (c1071l.yandex(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new C6532l(str5.toLowerCase(locale2), str4.toLowerCase(locale2))))) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (c1071l.yandex(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.yandex.contains(str4) && (str5.equalsIgnoreCase("Google") || Build.BRAND.equalsIgnoreCase("Google")) && i3 >= 26)) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        List list2 = InvalidVideoProfilesQuirk.yandex;
        if ((str5.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && AbstractC16648l.isVip(Build.ID, "TP1A", true)) {
            z5 = true;
        } else if (InvalidVideoProfilesQuirk.yandex.contains(str4.toLowerCase(locale))) {
            String str8 = Build.ID;
            if (AbstractC16648l.isVip(str8, "TP1A", true) || AbstractC16648l.isVip(str8, "TD1A", true)) {
                z5 = true;
            } else {
                if (!str5.equalsIgnoreCase("Redmi") || Build.BRAND.equalsIgnoreCase("Redmi")) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!str5.equalsIgnoreCase("Xiaomi") || Build.BRAND.equalsIgnoreCase("Xiaomi")) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z6 || z7) {
                    str = Build.ID;
                    if (!AbstractC16648l.isVip(str, "TKQ1", true) || AbstractC16648l.isVip(str, "TP1A", true)) {
                        z5 = true;
                    } else if ((!InvalidVideoProfilesQuirk.crashlytics.contains(str4.toLowerCase(locale)) && i3 == 33) || (InvalidVideoProfilesQuirk.loadAd.contains(str4.toLowerCase(locale)) && i3 == 33)) {
                        z5 = true;
                    }
                } else {
                    z5 = !InvalidVideoProfilesQuirk.crashlytics.contains(str4.toLowerCase(locale)) ? false : false;
                }
            }
        } else {
            if (str5.equalsIgnoreCase("Redmi")) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (str5.equalsIgnoreCase("Xiaomi")) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (z6 || z7) {
                str = Build.ID;
                if (AbstractC16648l.isVip(str, "TKQ1", true)) {
                }
                z5 = true;
            } else if (!InvalidVideoProfilesQuirk.crashlytics.contains(str4.toLowerCase(locale))) {
            }
        }
        if (c1071l.yandex(InvalidVideoProfilesQuirk.class, z5)) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (c1071l.yandex(ExcludedSupportedSizesQuirk.class, AbstractC4311l.firebase() || AbstractC4311l.smaato() || AbstractC4311l.subs() || AbstractC4311l.startapp() || AbstractC4311l.metrica() || AbstractC4311l.remoteconfig() || AbstractC4311l.vip() || AbstractC4311l.isPro() || AbstractC4311l.adcel())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.yandex;
        if (c1071l.yandex(ExtraCroppingQuirk.class, AbstractC2069l.crashlytics())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (c1071l.yandex(ExtraSupportedOutputSizeQuirk.class, (str5.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "moto e5 play".equalsIgnoreCase(str4))) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        C13476l c13476l = ExtraSupportedSurfaceCombinationsQuirk.yandex;
        String str9 = Build.DEVICE;
        if (c1071l.yandex(ExtraSupportedSurfaceCombinationsQuirk.class, "heroqltevzw".equalsIgnoreCase(str9) || "heroqltetmo".equalsIgnoreCase(str9) || AbstractC16357l.billing() || AbstractC16357l.mopub())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        int i4 = Nexus4AndroidLTargetAspectRatioQuirk.yandex;
        if (!str5.equalsIgnoreCase("Google")) {
            Build.BRAND.equalsIgnoreCase("Google");
        }
        if (c1071l.yandex(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        List list3 = PreviewPixelHDRnetQuirk.yandex;
        if (c1071l.yandex(PreviewPixelHDRnetQuirk.class, (str5.equalsIgnoreCase("Google") || Build.BRAND.equalsIgnoreCase("Google")) && PreviewPixelHDRnetQuirk.yandex.contains(str9.toLowerCase(Locale.getDefault())))) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (c1071l.yandex(RepeatingStreamConstraintForVideoRecordingQuirk.class, (str5.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "mha-l29".equalsIgnoreCase(str4))) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (c1071l.yandex(StillCaptureFlashStopRepeatingQuirk.class, (str5.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && AbstractC16648l.isVip(str4.toUpperCase(locale), "SM-A716", false))) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (c1071l.yandex(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.yandex.contains(str4.toLowerCase(locale)))) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        List list4 = SurfaceOrderQuirk.yandex;
        if (c1071l.yandex(SurfaceOrderQuirk.class, (str5.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && SurfaceOrderQuirk.yandex.contains(Build.HARDWARE.toLowerCase(Locale.getDefault())))) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (c1071l.yandex(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        List list5 = ZslDisablerQuirk.yandex;
        if (((!str5.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) || !AbstractC10033l.amazon(ZslDisablerQuirk.yandex)) && ((!str5.equalsIgnoreCase("Xiaomi") && !Build.BRAND.equalsIgnoreCase("Xiaomi")) || !AbstractC10033l.amazon(ZslDisablerQuirk.loadAd))) {
            z8 = false;
        }
        if (c1071l.yandex(ZslDisablerQuirk.class, z8)) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (c1071l.yandex(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.yandex.containsKey(str4.toUpperCase(locale)))) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (c1071l.yandex(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.loadAd)) {
            arrayList.add(PreviewUnderExposureQuirk.yandex);
        }
        AbstractC17919l.yandex = new C17735l(arrayList);
        C17735l c17735l = AbstractC17919l.yandex;
        if (c17735l == null) {
            c17735l = null;
        }
        AbstractC5088l.yandex("DeviceQuirks", "camera2 DeviceQuirks = ".concat(C17735l.amazon(c17735l)));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    @Override // defpackage.InterfaceC13241l
    public final void accept(Object obj) {
        boolean z;
        switch (this.yandex) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                AbstractC12225l.crashlytics();
                throw null;
            case 1:
                if (obj != null) {
                    throw new ClassCastException();
                }
                AbstractC12225l.crashlytics();
                throw null;
            case 2:
                AbstractC12225l.crashlytics();
                return;
            case 3:
                C1071l c1071l = (C1071l) obj;
                ArrayList arrayList = new ArrayList();
                String str = Build.BRAND;
                if (c1071l.yandex(ImageCaptureRotationOptionQuirk.class, ("HUAWEI".equalsIgnoreCase(str) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str) && "STK-LX1".equalsIgnoreCase(Build.MODEL)))) {
                    arrayList.add(new ImageCaptureRotationOptionQuirk());
                }
                if (c1071l.yandex(androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class, true)) {
                    arrayList.add(new androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.yandex;
                Locale locale = Locale.US;
                String upperCase = str.toUpperCase(locale);
                String str2 = Build.MODEL;
                if (c1071l.yandex(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.yandex.contains(Pair.create(upperCase, str2.toUpperCase(locale))))) {
                    arrayList.add(new CaptureFailedRetryQuirk());
                }
                if (c1071l.yandex(LowMemoryQuirk.class, LowMemoryQuirk.yandex.contains(str2.toUpperCase(locale)))) {
                    arrayList.add(new LowMemoryQuirk());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.yandex;
                if (c1071l.yandex(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str) || ("Vivo".equalsIgnoreCase(str) && LargeJpegImageQuirk.yandex.contains(str2.toUpperCase(locale))))) {
                    arrayList.add(new LargeJpegImageQuirk());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.yandex;
                if (c1071l.yandex(IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str) && IncorrectJpegMetadataQuirk.yandex.contains(Build.DEVICE.toUpperCase(locale)))) {
                    arrayList.add(new IncorrectJpegMetadataQuirk());
                }
                HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.yandex;
                if (c1071l.yandex(ImageCaptureFailedForSpecificCombinationQuirk.class, ("oneplus".equalsIgnoreCase(str) && "cph2583".equalsIgnoreCase(str2)) || ("google".equalsIgnoreCase(str) && ImageCaptureFailedForSpecificCombinationQuirk.yandex.contains(str2.toLowerCase())))) {
                    arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
                }
                PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.yandex;
                if (c1071l.yandex(PreviewGreenTintQuirk.class, "motorola".equalsIgnoreCase(str) && "moto e20".equalsIgnoreCase(str2))) {
                    arrayList.add(previewGreenTintQuirk);
                }
                AbstractC18532l.yandex = new C17735l(arrayList);
                AbstractC5088l.yandex("DeviceQuirks", "core DeviceQuirks = ".concat(C17735l.amazon(AbstractC18532l.yandex)));
                return;
            case 4:
                C1071l c1071l2 = (C1071l) obj;
                ArrayList arrayList2 = new ArrayList();
                List list = MediaCodecInfoReportIncorrectInfoQuirk.yandex;
                String str3 = Build.BRAND;
                if (c1071l2.yandex(MediaCodecInfoReportIncorrectInfoQuirk.class, ("Nokia".equalsIgnoreCase(str3) && "Nokia 1".equalsIgnoreCase(Build.MODEL)) || ("motorola".equalsIgnoreCase(str3) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("infinix".equalsIgnoreCase(str3) && "infinix x650".equalsIgnoreCase(Build.MODEL)) || (("LGE".equalsIgnoreCase(str3) && "LG-X230".equalsIgnoreCase(Build.MODEL)) || (("Huawei".equalsIgnoreCase(str3) && "mha-l29".equalsIgnoreCase(Build.MODEL)) || (("Redmi".equalsIgnoreCase(str3) && "Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL)) || (("positivo".equalsIgnoreCase(str3) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || MediaCodecInfoReportIncorrectInfoQuirk.yandex.contains(Build.MODEL.toLowerCase(Locale.US))))))))) {
                    arrayList2.add(new MediaCodecInfoReportIncorrectInfoQuirk());
                }
                if (c1071l2.yandex(CameraUseInconsistentTimebaseQuirk.class, CameraUseInconsistentTimebaseQuirk.amazon())) {
                    arrayList2.add(new CameraUseInconsistentTimebaseQuirk());
                }
                if (c1071l2.yandex(ReportedVideoQualityNotSupportedQuirk.class, ReportedVideoQualityNotSupportedQuirk.amazon() || ReportedVideoQualityNotSupportedQuirk.purchase() || ("Vivo".equalsIgnoreCase(str3) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ReportedVideoQualityNotSupportedQuirk.billing() || ReportedVideoQualityNotSupportedQuirk.mopub())) {
                    arrayList2.add(new ReportedVideoQualityNotSupportedQuirk());
                }
                if (c1071l2.yandex(VideoEncoderCrashQuirk.class, "positivo".equalsIgnoreCase(str3) && "twist 2 pro".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new VideoEncoderCrashQuirk());
                }
                if (c1071l2.yandex(ExcludeStretchedVideoQualityQuirk.class, ("Samsung".equalsIgnoreCase(str3) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str3) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str3) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str3) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str3) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || ExcludeStretchedVideoQualityQuirk.purchase() || ExcludeStretchedVideoQualityQuirk.amazon()))))) {
                    arrayList2.add(new ExcludeStretchedVideoQualityQuirk());
                }
                if (c1071l2.yandex(MediaStoreVideoCannotWrite.class, ("positivo".equalsIgnoreCase(str3) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || ("itel".equalsIgnoreCase(str3) && "itel w6004".equalsIgnoreCase(Build.MODEL)))) {
                    arrayList2.add(new MediaStoreVideoCannotWrite());
                }
                if (c1071l2.yandex(AudioEncoderIgnoresInputTimestampQuirk.class, "Sony".equalsIgnoreCase(str3) && "G3125".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new AudioEncoderIgnoresInputTimestampQuirk());
                }
                if (c1071l2.yandex(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, "Samsung".equalsIgnoreCase(str3) && Build.VERSION.SDK_INT < 29)) {
                    arrayList2.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
                }
                if (c1071l2.yandex(NegativeLatLongSavesIncorrectlyQuirk.class, Build.VERSION.SDK_INT < 34)) {
                    arrayList2.add(new NegativeLatLongSavesIncorrectlyQuirk());
                }
                List list2 = AudioTimestampFramePositionIncorrectQuirk.yandex;
                if (c1071l2.yandex(AudioTimestampFramePositionIncorrectQuirk.class, ("oppo".equalsIgnoreCase(str3) && AudioTimestampFramePositionIncorrectQuirk.yandex.contains(Build.MODEL.toLowerCase(Locale.ROOT))) || ("lge".equalsIgnoreCase(str3) && "lg-m250".equalsIgnoreCase(Build.MODEL)) || (("motorola".equalsIgnoreCase(str3) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("realme".equalsIgnoreCase(str3) && "rmx1941".equalsIgnoreCase(Build.MODEL)) || (("Xiaomi".equalsIgnoreCase(str3) && "Redmi 6A".equalsIgnoreCase(Build.MODEL)) || (("vivo".equalsIgnoreCase(str3) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ("vivo".equalsIgnoreCase(str3) && "VIVO Y17".equalsIgnoreCase(Build.MODEL)))))))) {
                    arrayList2.add(new AudioTimestampFramePositionIncorrectQuirk());
                }
                if (c1071l2.yandex(ExtraSupportedResolutionQuirk.class, "motorola".equalsIgnoreCase(str3) && "moto e5 play".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new ExtraSupportedResolutionQuirk());
                }
                if (c1071l2.yandex(StretchedVideoResolutionQuirk.class, "motorola".equalsIgnoreCase(str3) && "moto e5 play".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new StretchedVideoResolutionQuirk());
                }
                if (c1071l2.yandex(CodecStuckOnFlushQuirk.class, "Nokia".equalsIgnoreCase(str3) && "Nokia 1".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new CodecStuckOnFlushQuirk());
                }
                if (c1071l2.yandex(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, "motorola".equalsIgnoreCase(str3) && "moto c".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
                }
                if (c1071l2.yandex(ExtraSupportedQualityQuirk.class, "motorola".equalsIgnoreCase(str3) && "moto c".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new ExtraSupportedQualityQuirk());
                }
                if (c1071l2.yandex(SignalEosOutputBufferNotComeQuirk.class, "Nokia".equalsIgnoreCase(str3) && "Nokia 1".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new SignalEosOutputBufferNotComeQuirk());
                }
                if (c1071l2.yandex(SizeCannotEncodeVideoQuirk.class, "motorola".equalsIgnoreCase(str3) && "moto c".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new SizeCannotEncodeVideoQuirk());
                }
                if (c1071l2.yandex(PreviewBlackScreenQuirk.class, PreviewBlackScreenQuirk.yandex || PreviewBlackScreenQuirk.loadAd)) {
                    arrayList2.add(new PreviewBlackScreenQuirk());
                }
                if (c1071l2.yandex(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.loadAd)) {
                    arrayList2.add(PrematureEndOfStreamVideoQuirk.yandex);
                }
                if (c1071l2.yandex(MediaCodecDefaultDataSpaceQuirk.class, true)) {
                    arrayList2.add(new MediaCodecDefaultDataSpaceQuirk());
                }
                if (c1071l2.yandex(HdrRepeatingRequestFailureQuirk.class, "samsung".equalsIgnoreCase(str3) && "pa3q".equalsIgnoreCase(Build.DEVICE))) {
                    arrayList2.add(new HdrRepeatingRequestFailureQuirk());
                }
                if (c1071l2.yandex(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.loadAd)) {
                    arrayList2.add(PreviewFreezeAfterHighSpeedRecordingQuirk.yandex);
                }
                if (c1071l2.yandex(GLProcessingStuckOnCodecFlushQuirk.class, "positivo".equalsIgnoreCase(str3) && "twist 2 pro".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(GLProcessingStuckOnCodecFlushQuirk.yandex);
                }
                if (c1071l2.yandex(VideoInterlacingQuirk.class, Collections.singletonList("SM-N9208").contains(Build.MODEL.toUpperCase(Locale.getDefault())) || (AbstractC16648l.license(str3, "Samsung", true) && AbstractC16648l.isVip(Build.PRODUCT, "zeroflte", true)))) {
                    arrayList2.add(VideoInterlacingQuirk.yandex);
                }
                AbstractC1469l.yandex = new C17735l(arrayList2);
                AbstractC5088l.yandex("DeviceQuirks", "video DeviceQuirks = ".concat(C17735l.amazon(AbstractC1469l.yandex)));
                return;
            case 5:
                C1071l c1071l3 = (C1071l) obj;
                ArrayList arrayList3 = new ArrayList();
                if (Build.VERSION.SDK_INT < 33) {
                    String str4 = Build.MANUFACTURER;
                    if ("SAMSUNG".equalsIgnoreCase(str4)) {
                        String str5 = Build.DEVICE;
                        if (!"F2Q".equalsIgnoreCase(str5) && !"Q2Q".equalsIgnoreCase(str5)) {
                            z = (!"OPPO".equalsIgnoreCase(str4) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) || ("LENOVO".equalsIgnoreCase(str4) && "Q706F".equalsIgnoreCase(Build.DEVICE));
                        }
                    } else if ("OPPO".equalsIgnoreCase(str4)) {
                    }
                }
                if (c1071l3.yandex(SurfaceViewStretchedQuirk.class, z)) {
                    arrayList3.add(new SurfaceViewStretchedQuirk());
                }
                if (c1071l3.yandex(SurfaceViewNotCroppedByParentQuirk.class, "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                    arrayList3.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                AbstractC1769l.yandex = new C17735l(arrayList3);
                AbstractC5088l.yandex("DeviceQuirks", "view DeviceQuirks = ".concat(C17735l.amazon(AbstractC1769l.yandex)));
                return;
            case 6:
                yandex(obj);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ C2498l(C0554l c0554l, int i) {
        this.yandex = i;
    }
}
