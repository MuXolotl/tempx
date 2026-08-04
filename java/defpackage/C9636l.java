package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk;
import androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍٙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9636l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19640l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19641l;

    public /* synthetic */ C9636l(InterfaceC5389l interfaceC5389l, AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        this.f19641l = 3;
        this.f19640l = interfaceC5389l;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x021b  */
    /* JADX WARN: Code duplicated, block: B:126:0x024e  */
    /* JADX WARN: Code duplicated, block: B:141:0x029f  */
    /* JADX WARN: Code duplicated, block: B:279:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:318:0x0543  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i = this.f19641l;
        int i2 = 0;
        z = false;
        z = false;
        z = false;
        boolean z11 = false;
        int i3 = 1;
        Range range = null;
        range = null;
        range = null;
        Object obj = this.f19640l;
        switch (i) {
            case 0:
                C7206l c7206l = C7206l.yandex;
                C7206l.amazon(EnumC10788l.f21805l);
                ((C15178l) obj).yandex();
                return Unit.INSTANCE;
            case 1:
                new C7883l().Signature(((C9434l) obj).isVip());
                return Unit.INSTANCE;
            case 2:
                C9231l c9231l = (C9231l) obj;
                new C0228l(new C1412l(3, c9231l), null, c9231l.f18987l, 10).Signature(c9231l.f5081l);
                c9231l.purchase();
                return Unit.INSTANCE;
            case 3:
                Range[] rangeArr = (Range[]) ((C10861l) ((InterfaceC5389l) obj)).crashlytics(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null && rangeArr.length != 0) {
                    int length = rangeArr.length;
                    while (i2 < length) {
                        Range range2 = rangeArr[i2];
                        Integer numValueOf = (Integer) range2.getUpper();
                        Integer numValueOf2 = (Integer) range2.getLower();
                        if (((Number) range2.getUpper()).intValue() >= 1000) {
                            numValueOf = Integer.valueOf(((Number) range2.getUpper()).intValue() / 1000);
                        }
                        if (((Number) range2.getLower()).intValue() >= 1000) {
                            numValueOf2 = Integer.valueOf(((Number) range2.getLower()).intValue() / 1000);
                        }
                        Range range3 = new Range(numValueOf2, numValueOf);
                        Integer num = (Integer) range3.getUpper();
                        if (num != null && num.intValue() == 30 && (range == null || ((Number) range3.getLower()).intValue() < ((Number) range.getLower()).intValue())) {
                            range = range3;
                        }
                        i2++;
                    }
                }
                return range;
            case 4:
                try {
                    Activity activityIsVip = ((C8529l) obj).isVip();
                    Intent intent = new Intent();
                    intent.setClassName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity");
                    activityIsVip.startActivity(intent);
                    Unit unit = Unit.INSTANCE;
                    break;
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case 5:
                return new C1723l(((C1723l) ((C12310l) obj).f24396l.getValue()).yandex);
            case 6:
                AbstractC2697l.firebase((C18723l) obj);
                return Unit.INSTANCE;
            case 7:
                AbstractC2697l.firebase((C6009l) obj);
                return Unit.INSTANCE;
            case 8:
                return ((InterfaceC15209l) obj).mo1544default();
            case 9:
                ((C4043l) obj).isPro.getValue();
                return Unit.INSTANCE;
            case 10:
                return new C11521l(i3, (Object[]) obj);
            case 11:
                C8183l.yandex.loadAd("https://vk.com/music/playlist/".concat(AbstractC14770l.remoteconfig(((C7946l) obj).yandex)));
                return Unit.INSTANCE;
            case 12:
                C8183l.yandex.loadAd("https://vk.com/podcasts" + ((Podcast) obj).loadAd);
                return Unit.INSTANCE;
            case 13:
                C9174l c9174l = (C9174l) obj;
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                vKXApplication.getApplicationContext();
                VKXApplication.Companion companion = VKXApplication.f36628l;
                VKXApplication vKXApplication2 = VKXApplication.f36631l;
                if (vKXApplication2 == null) {
                    vKXApplication2 = null;
                }
                Context applicationContext = vKXApplication2.getApplicationContext();
                C11610l c11610l = AbstractC3629l.yandex;
                C11610l c11610l2 = c11610l != null ? c11610l : null;
                C16076l c16076l = VKXApplication.f36632l;
                C17804l c17804lAmazon = AbstractC1213l.amazon(applicationContext, c11610l2, (c16076l != null ? c16076l : null).f31505l, new C5146l(22), new C1712l(14), (c16076l != null ? c16076l : null).f31519l);
                c17804lAmazon.mo2748break(new C13736l(2, 0, 1, 1, 0, false, true), false);
                c17804lAmazon.f34677l.yandex(new C15523l(i2, c9174l));
                return c17804lAmazon;
            case 14:
                return Integer.valueOf(((AudioSnippetEntry) obj).mopub.size());
            case 15:
                return Integer.valueOf(((AbstractC18082l) obj).pro());
            case 16:
                C11083l c11083l = (C11083l) obj;
                SharedPreferences sharedPreferences = AbstractC3957l.amazon;
                SharedPreferences.Editor editorEdit = (sharedPreferences != null ? sharedPreferences : null).edit();
                c11083l.f22293l.getClass();
                editorEdit.putBoolean("bad_device_vpn", true);
                editorEdit.apply();
                c11083l.purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC3803l.yandex(((C13659l) obj).isVip());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C8524l(((C15630l) ((AbstractC11188l) obj)).f30558l);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Integer.valueOf("vkxCurrent:".concat(((AbstractC16377l) obj).admob()).hashCode());
            case 20:
                AbstractC8189l abstractC8189l = (AbstractC8189l) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(abstractC8189l.isPro());
                if (abstractC8189l.firebase().length() > 0) {
                    str = "." + abstractC8189l.firebase();
                } else {
                    str = "";
                }
                sb.append(str);
                return sb.toString();
            case 21:
                return (C3625l) obj;
            case 22:
                return C13533l.loadAd((C13533l) obj);
            case 23:
                ((C9991l) obj).m4125private(new C15191l((String) null, new C1329l("artist_recoms", 2)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return (C8896l) obj;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                Function0 function0 = (Function0) ((C7037l) obj).f14753l.billing(AbstractC1815l.yandex);
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C14740l c14740l = ((C6367l) obj).crashlytics;
                LinkedHashSet linkedHashSet = new LinkedHashSet(c14740l.loadAd);
                C11129l c11129lPurchase = AbstractC6900l.purchase((Function2) c14740l.amazon.loadAd().loadAd);
                while (c11129lPurchase.hasNext()) {
                    linkedHashSet.add(c14740l.crashlytics(((Number) c11129lPurchase.next()).intValue()).toString());
                }
                return linkedHashSet;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Size[] sizeArrYandex = ((CamcorderProfileResolutionQuirk) obj).yandex.yandex(34);
                Object objAsList = sizeArrYandex != null ? Arrays.asList(sizeArrYandex) : C2580l.f5619l;
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "supportedResolutions = " + objAsList);
                }
                return objAsList;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return (C1198l) ((C14232l) obj).amazon.get();
            default:
                C5849l c5849l = (C5849l) obj;
                C5716l c5716l = C5716l.crashlytics;
                c5716l.getClass();
                try {
                    C1071l c1071l = (C1071l) c5716l.yandex.mopub().get();
                    ArrayList arrayList = new ArrayList();
                    InterfaceC5389l interfaceC5389l = c5849l.yandex;
                    if (interfaceC5389l == null) {
                        if (AbstractC5088l.smaato()) {
                            Log.e("CXCP", "Failed to enable quirks: camera metadata injection failed");
                        }
                        return new C17735l(arrayList);
                    }
                    InterfaceC5389l.admob.getClass();
                    if (c1071l.yandex(AeFpsRangeLegacyQuirk.class, C11905l.loadAd(interfaceC5389l))) {
                        arrayList.add(new AeFpsRangeLegacyQuirk(interfaceC5389l));
                    }
                    if ((Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && Build.VERSION.SDK_INT < 33) {
                        Integer num2 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                        if (num2 != null && num2.intValue() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (c1071l.yandex(AfRegionFlipHorizontallyQuirk.class, z)) {
                        arrayList.add(new AfRegionFlipHorizontallyQuirk());
                    }
                    C11905l.loadAd(interfaceC5389l);
                    if (c1071l.yandex(AspectRatioLegacyApi21Quirk.class, false)) {
                        arrayList.add(new AspectRatioLegacyApi21Quirk());
                    }
                    if (c1071l.yandex(CamcorderProfileResolutionQuirk.class, C11905l.loadAd(interfaceC5389l))) {
                        arrayList.add(new CamcorderProfileResolutionQuirk(c5849l.loadAd));
                    }
                    if (CameraNoResponseWhenEnablingFlashQuirk.yandex.contains(Build.MODEL.toUpperCase(Locale.ROOT))) {
                        Integer num3 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                        if (num3 != null && num3.intValue() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (c1071l.yandex(CameraNoResponseWhenEnablingFlashQuirk.class, z2)) {
                        arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
                    }
                    if (c1071l.yandex(CaptureSessionStuckQuirk.class, false)) {
                        arrayList.add(new CaptureSessionStuckQuirk());
                    }
                    if (c1071l.yandex(CloseCaptureSessionOnVideoQuirk.class, true)) {
                        arrayList.add(new CloseCaptureSessionOnVideoQuirk());
                    }
                    if (c1071l.yandex(ConfigureSurfaceToSecondarySessionFailQuirk.class, C11905l.loadAd(interfaceC5389l))) {
                        arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
                    }
                    if (c1071l.yandex(FinalizeSessionOnCloseQuirk.class, true)) {
                        arrayList.add(new FinalizeSessionOnCloseQuirk());
                    }
                    Iterator it = FlashTooSlowQuirk.yandex.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC16648l.isVip(Build.MODEL.toUpperCase(Locale.ROOT), (String) it.next(), false)) {
                                Integer num4 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                                if (num4 != null && num4.intValue() == 1) {
                                    z3 = true;
                                }
                            }
                        }
                        z3 = false;
                    }
                    if (c1071l.yandex(FlashTooSlowQuirk.class, z3)) {
                        arrayList.add(new FlashTooSlowQuirk());
                    }
                    List list = ImageCaptureFailWithAutoFlashQuirk.yandex;
                    String str2 = Build.MODEL;
                    Locale locale = Locale.ROOT;
                    if (list.contains(str2.toLowerCase(locale))) {
                        Integer num5 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                        if (num5 != null && num5.intValue() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    if (c1071l.yandex(ImageCaptureFailWithAutoFlashQuirk.class, z4)) {
                        arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
                    }
                    if (ImageCaptureFlashNotFireQuirk.loadAd.contains(str2.toLowerCase(locale))) {
                        Integer num6 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                        if (num6 != null && num6.intValue() == 0) {
                            b = true;
                        } else {
                            b = false;
                        }
                    } else {
                        b = false;
                    }
                    if (c1071l.yandex(ImageCaptureFlashNotFireQuirk.class, b == true || ImageCaptureFlashNotFireQuirk.yandex.contains(str2.toLowerCase(locale)))) {
                        arrayList.add(new ImageCaptureFlashNotFireQuirk());
                    }
                    if (ImageCaptureWashedOutImageQuirk.yandex.contains(str2.toUpperCase(locale))) {
                        Integer num7 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                        if (num7 != null && num7.intValue() == 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    } else {
                        z5 = false;
                    }
                    if (c1071l.yandex(ImageCaptureWashedOutImageQuirk.class, z5)) {
                        arrayList.add(new ImageCaptureWashedOutImageQuirk());
                    }
                    if (ImageCaptureWithFlashUnderexposureQuirk.yandex.contains(str2.toLowerCase(locale))) {
                        Integer num8 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                        if (num8 != null && num8.intValue() == 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                    if (c1071l.yandex(ImageCaptureWithFlashUnderexposureQuirk.class, z6)) {
                        arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
                    }
                    if (c1071l.yandex(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.yandex.contains(Build.DEVICE.toLowerCase(locale)))) {
                        arrayList.add(new JpegHalCorruptImageQuirk());
                    }
                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = JpegCaptureDownsizingQuirk.yandex;
                    if (JpegCaptureDownsizingQuirk.loadAd.contains(str2.toLowerCase(locale))) {
                        Integer num9 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                        if (num9 != null && num9.intValue() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else {
                        z7 = false;
                    }
                    if (c1071l.yandex(JpegCaptureDownsizingQuirk.class, z7)) {
                        arrayList.add(jpegCaptureDownsizingQuirk);
                    }
                    InterfaceC5389l.admob.getClass();
                    if (c1071l.yandex(PreviewOrientationIncorrectQuirk.class, C11905l.loadAd(interfaceC5389l))) {
                        arrayList.add(new PreviewOrientationIncorrectQuirk());
                    }
                    if (c1071l.yandex(TextureViewIsClosedQuirk.class, Build.VERSION.SDK_INT <= 23)) {
                        arrayList.add(new TextureViewIsClosedQuirk());
                    }
                    Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.yandex.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Build.MODEL.toUpperCase(Locale.ROOT).equals((String) it2.next())) {
                                Integer num10 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                                if (num10 != null && num10.intValue() == 0) {
                                    z8 = true;
                                }
                            }
                        }
                        z8 = false;
                    }
                    if (c1071l.yandex(TorchFlashRequiredFor3aUpdateQuirk.class, z8)) {
                        arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk());
                    }
                    String str3 = Build.MANUFACTURER;
                    if (c1071l.yandex(YuvImageOnePixelShiftQuirk.class, ((str3.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "MotoG3".equalsIgnoreCase(Build.MODEL)) || ((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-G532F".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-J700F".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-A920F".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-J415F".equalsIgnoreCase(Build.MODEL)) || ((str3.equalsIgnoreCase("Xiaomi") || Build.BRAND.equalsIgnoreCase("Xiaomi")) && "Mi A1".equalsIgnoreCase(Build.MODEL))))))) {
                        arrayList.add(new YuvImageOnePixelShiftQuirk());
                    }
                    if (c1071l.yandex(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ((str3.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (((str3.equalsIgnoreCase("Oppo") || Build.BRAND.equalsIgnoreCase("Oppo")) && "A37F".equalsIgnoreCase(Build.MODEL)) || ((str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
                        arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
                    }
                    if (c1071l.yandex(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, str3.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei"))) {
                        arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
                    }
                    if (str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) {
                        InterfaceC5389l.admob.getClass();
                        if (C11905l.loadAd(interfaceC5389l)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else {
                        z9 = false;
                    }
                    if (c1071l.yandex(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class, z9)) {
                        arrayList.add(new QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk());
                    }
                    if (c1071l.yandex(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, AbstractC4596l.crashlytics() || AbstractC4596l.amazon() || AbstractC4596l.isPro() || AbstractC4596l.mopub() || ("pixel 4 xl".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT == 29) || AbstractC4596l.purchase() || AbstractC4596l.subs() || AbstractC4596l.admob() || AbstractC12148l.license())) {
                        arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
                    }
                    String str4 = Build.MODEL;
                    if ("Pixel 8".equalsIgnoreCase(str4)) {
                        Integer num11 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                        if (num11 != null && num11.intValue() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (c1071l.yandex(TemporalNoiseQuirk.class, z10)) {
                        arrayList.add(new TemporalNoiseQuirk());
                    }
                    if (c1071l.yandex(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.yandex.contains(str4.toLowerCase(Locale.ROOT)) || AbstractC12148l.license() || ((str3.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "FIG-LX1".equalsIgnoreCase(str4)))) {
                        arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
                    }
                    if (c1071l.yandex(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, (str3.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && AbstractC16648l.license(Build.DEVICE, "m55xq", true))) {
                        arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
                    }
                    List list2 = UltraWideFlashCaptureUnderexposureQuirk.yandex;
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (AbstractC16648l.isVip(Build.MODEL.toLowerCase(Locale.ROOT), (String) it3.next(), false)) {
                                Integer num12 = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.LENS_FACING);
                                if (num12 != null && num12.intValue() == 1) {
                                    z11 = true;
                                }
                            }
                        }
                    }
                    if (c1071l.yandex(UltraWideFlashCaptureUnderexposureQuirk.class, z11)) {
                        arrayList.add(new UltraWideFlashCaptureUnderexposureQuirk());
                    }
                    C17735l c17735l = new C17735l(arrayList);
                    AbstractC5088l.yandex("CameraQuirks", "camera2 CameraQuirks = ".concat(C17735l.amazon(c17735l)));
                    return c17735l;
                } catch (InterruptedException | ExecutionException e) {
                    throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
                }
        }
    }

    public /* synthetic */ C9636l(int i, Object obj) {
        this.f19641l = i;
        this.f19640l = obj;
    }
}
