package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* JADX INFO: renamed from: lٗۗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17343l implements InterfaceC18528l {
    public static final C17343l yandex = new C17343l();
    public static final C3537l loadAd = new C3537l("systemInfo", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(1))));
    public static final C3537l crashlytics = new C3537l("eventName", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(2))));
    public static final C3537l amazon = new C3537l("isThickClient", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(37))));
    public static final C3537l purchase = new C3537l("clientType", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(61))));
    public static final C3537l billing = new C3537l("modelDownloadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(3))));
    public static final C3537l mopub = new C3537l("customModelLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(20))));
    public static final C3537l admob = new C3537l("customModelInferenceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(4))));
    public static final C3537l subs = new C3537l("customModelCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(29))));
    public static final C3537l isPro = new C3537l("onDeviceFaceDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(5))));
    public static final C3537l firebase = new C3537l("onDeviceFaceLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(59))));
    public static final C3537l smaato = new C3537l("onDeviceTextDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(6))));
    public static final C3537l remoteconfig = new C3537l("onDeviceTextDetectionLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(79))));
    public static final C3537l vip = new C3537l("onDeviceBarcodeDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(7))));
    public static final C3537l metrica = new C3537l("onDeviceBarcodeLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(58))));
    public static final C3537l startapp = new C3537l("onDeviceImageLabelCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(48))));
    public static final C3537l adcel = new C3537l("onDeviceImageLabelLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(49))));
    public static final C3537l ads = new C3537l("onDeviceImageLabelDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(18))));
    public static final C3537l subscription = new C3537l("onDeviceObjectCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(26))));
    public static final C3537l tapsense = new C3537l("onDeviceObjectLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(27))));
    public static final C3537l Signature = new C3537l("onDeviceObjectInferenceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(28))));
    public static final C3537l license = new C3537l("onDevicePoseDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(44))));
    public static final C3537l pro = new C3537l("onDeviceSegmentationLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(45))));
    public static final C3537l ad = new C3537l("onDeviceSmartReplyLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(19))));
    public static final C3537l advert = new C3537l("onDeviceLanguageIdentificationLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(21))));
    public static final C3537l isVip = new C3537l("onDeviceTranslationLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(22))));
    public static final C3537l signatures = new C3537l("cloudFaceDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(8))));
    public static final C3537l premium = new C3537l("cloudCropHintDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(9))));
    public static final C3537l applovin = new C3537l("cloudDocumentTextDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(10))));
    public static final C3537l appmetrica = new C3537l("cloudImagePropertiesDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(11))));
    public static final C3537l inmobi = new C3537l("cloudImageLabelDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(12))));

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final C3537l f33802throws = new C3537l("cloudLandmarkDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(13))));

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final C3537l f33790package = new C3537l("cloudLogoDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(14))));

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final C3537l f33799synchronized = new C3537l("cloudSafeSearchDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(15))));

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static final C3537l f33796strictfp = new C3537l("cloudTextDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(16))));

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final C3537l f33805volatile = new C3537l("cloudWebSearchDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(17))));

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final C3537l f33788native = new C3537l("automlImageLabelingCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(23))));

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static final C3537l f33791private = new C3537l("automlImageLabelingLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(24))));

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final C3537l f33718extends = new C3537l("automlImageLabelingInferenceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(25))));

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static final C3537l f33721for = new C3537l("isModelDownloadedLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(39))));

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static final C3537l f33801throw = new C3537l("deleteModelLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(40))));

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final C3537l f33712catch = new C3537l("aggregatedAutomlImageLabelingInferenceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(30))));

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static final C3537l f33717else = new C3537l("aggregatedCustomModelInferenceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(31))));

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static final C3537l f33711case = new C3537l("aggregatedOnDeviceFaceDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(32))));

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static final C3537l f33798switch = new C3537l("aggregatedOnDeviceBarcodeDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(33))));

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static final C3537l f33715continue = new C3537l("aggregatedOnDeviceImageLabelDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(34))));

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static final C3537l f33713class = new C3537l("aggregatedOnDeviceObjectInferenceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(35))));

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static final C3537l f33726interface = new C3537l("aggregatedOnDeviceTextDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(36))));

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static final C3537l f33795static = new C3537l("aggregatedOnDevicePoseDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(46))));

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final C3537l f33716default = new C3537l("aggregatedOnDeviceSegmentationLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(47))));

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static final C3537l f33719final = new C3537l("pipelineAccelerationInferenceEvents", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(69))));

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final C3537l f33789new = new C3537l("remoteConfigLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(42))));

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static final C3537l f33722goto = new C3537l("inputImageConstructionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(50))));

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static final C3537l f33797super = new C3537l("leakedHandleEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(51))));

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final C3537l f33724import = new C3537l("cameraSourceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(52))));

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final C3537l f33709abstract = new C3537l("imageLabelOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(53))));

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static final C3537l f33725instanceof = new C3537l("languageIdentificationOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(54))));

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final C3537l f33793public = new C3537l("faceDetectionOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(60))));

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public static final C3537l f33720finally = new C3537l("documentDetectionOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(85))));

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public static final C3537l f33800this = new C3537l("documentCroppingOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(86))));

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public static final C3537l f33804try = new C3537l("documentEnhancementOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(87))));

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public static final C3537l f33710break = new C3537l("nlClassifierOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(55))));

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final C3537l f33803transient = new C3537l("nlClassifierClientLibraryLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(56))));

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static final C3537l f33792protected = new C3537l("accelerationAllowlistLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(57))));

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public static final C3537l f33806while = new C3537l("toxicityDetectionCreateEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(62))));

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public static final C3537l f33723implements = new C3537l("toxicityDetectionLoadEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(63))));

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public static final C3537l f33714const = new C3537l("toxicityDetectionInferenceEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(64))));

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public static final C3537l f33794return = new C3537l("barcodeDetectionOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(65))));

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public static final C3537l f33786l = new C3537l("customImageLabelOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(66))));

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public static final C3537l f33754l = new C3537l("codeScannerScanApiEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(67))));

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public static final C3537l f33784l = new C3537l("codeScannerOptionalModuleEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(68))));

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public static final C3537l f33777l = new C3537l("onDeviceExplicitContentCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(70))));

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public static final C3537l f33741l = new C3537l("onDeviceExplicitContentLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(71))));

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public static final C3537l f33736l = new C3537l("onDeviceExplicitContentInferenceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(72))));

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public static final C3537l f33779l = new C3537l("aggregatedOnDeviceExplicitContentLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(73))));

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public static final C3537l f33765l = new C3537l("onDeviceFaceMeshCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(74))));

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public static final C3537l f33767l = new C3537l("onDeviceFaceMeshLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(75))));

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public static final C3537l f33731l = new C3537l("onDeviceFaceMeshLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(76))));

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public static final C3537l f33734l = new C3537l("aggregatedOnDeviceFaceMeshLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(77))));

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public static final C3537l f33773l = new C3537l("smartReplyOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(78))));

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public static final C3537l f33774l = new C3537l("textDetectionOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(80))));

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public static final C3537l f33732l = new C3537l("onDeviceImageQualityAnalysisCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(81))));

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public static final C3537l f33764l = new C3537l("onDeviceImageQualityAnalysisLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(82))));

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public static final C3537l f33762l = new C3537l("onDeviceImageQualityAnalysisLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(83))));

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public static final C3537l f33747l = new C3537l("aggregatedOnDeviceImageQualityAnalysisLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(84))));

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public static final C3537l f33768l = new C3537l("imageQualityAnalysisOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(88))));

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public static final C3537l f33772l = new C3537l("imageCaptioningOptionalModuleLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(89))));

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public static final C3537l f33750l = new C3537l("onDeviceImageCaptioningCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(90))));

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public static final C3537l f33751l = new C3537l("onDeviceImageCaptioningLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(91))));

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public static final C3537l f33740l = new C3537l("onDeviceImageCaptioningInferenceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(92))));

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public static final C3537l f33744l = new C3537l("aggregatedOnDeviceImageCaptioningInferenceLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(93))));

    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public static final C3537l f33753l = new C3537l("onDeviceDocumentDetectionCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(94))));

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public static final C3537l f33735l = new C3537l("onDeviceDocumentDetectionLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(95))));

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public static final C3537l f33775l = new C3537l("onDeviceDocumentDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(96))));

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public static final C3537l f33756l = new C3537l("aggregatedOnDeviceDocumentDetectionLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(97))));

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public static final C3537l f33745l = new C3537l("onDeviceDocumentCroppingCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(98))));

    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public static final C3537l f33743l = new C3537l("onDeviceDocumentCroppingLoadLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(99))));

    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public static final C3537l f33746l = new C3537l("onDeviceDocumentCroppingLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(100))));

    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public static final C3537l f33783l = new C3537l("aggregatedOnDeviceDocumentCroppingLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(EnergyProfile.EVCONNECTOR_TYPE_OTHER))));

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public static final C3537l f33781l = new C3537l("onDeviceDocumentEnhancementCreateLogEvent", AbstractC12900l.startapp(AbstractC9029l.adcel(InterfaceC16073l.class, new C10182l(102))));

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public static final C3537l f33748l = AbstractC9029l.smaato(103, C3537l.yandex("onDeviceDocumentEnhancementLoadLogEvent"));

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static final C3537l f33782l = AbstractC9029l.smaato(104, C3537l.yandex("onDeviceDocumentEnhancementLogEvent"));

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public static final C3537l f33757l = AbstractC9029l.smaato(105, C3537l.yandex("aggregatedOnDeviceDocumentEnhancementLogEvent"));

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public static final C3537l f33787l = AbstractC9029l.smaato(106, C3537l.yandex("scannerAutoZoomEvent"));

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public static final C3537l f33728l = AbstractC9029l.smaato(107, C3537l.yandex("lowLightAutoExposureComputationEvent"));

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public static final C3537l f33785l = AbstractC9029l.smaato(108, C3537l.yandex("lowLightFrameProcessEvent"));

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public static final C3537l f33778l = AbstractC9029l.smaato(109, C3537l.yandex("lowLightSceneDetectionEvent"));

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public static final C3537l f33780l = AbstractC9029l.smaato(110, C3537l.yandex("onDeviceStainRemovalLogEvent"));

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public static final C3537l f33759l = AbstractC9029l.smaato(111, C3537l.yandex("aggregatedOnDeviceStainRemovalLogEvent"));

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public static final C3537l f33769l = AbstractC9029l.smaato(112, C3537l.yandex("stainRemovalOptionalModuleLogEvent"));

    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public static final C3537l f33730l = AbstractC9029l.smaato(113, C3537l.yandex("onDeviceShadowRemovalLogEvent"));

    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    public static final C3537l f33776l = AbstractC9029l.smaato(114, C3537l.yandex("aggregatedOnDeviceShadowRemovalLogEvent"));

    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
    public static final C3537l f33752l = AbstractC9029l.smaato(115, C3537l.yandex("shadowRemovalOptionalModuleLogEvent"));

    /* JADX INFO: renamed from: lُٔۨ, reason: contains not printable characters */
    public static final C3537l f33760l = AbstractC9029l.smaato(116, C3537l.yandex("onDeviceDigitalInkSegmentationLogEvent"));

    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public static final C3537l f33737l = AbstractC9029l.smaato(117, C3537l.yandex("onDeviceDocumentScannerStartLogEvent"));

    /* JADX INFO: renamed from: lًَٙ, reason: contains not printable characters */
    public static final C3537l f33755l = AbstractC9029l.smaato(118, C3537l.yandex("onDeviceDocumentScannerFinishLogEvent"));

    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public static final C3537l f33758l = AbstractC9029l.smaato(119, C3537l.yandex("onDeviceDocumentScannerUiStartLogEvent"));

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public static final C3537l f33739l = AbstractC9029l.smaato(120, C3537l.yandex("onDeviceDocumentScannerUiFinishLogEvent"));

    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
    public static final C3537l f33749l = AbstractC9029l.smaato(121, C3537l.yandex("documentScannerUiOptionalModuleSessionStartLogEvent"));

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public static final C3537l f33763l = AbstractC9029l.smaato(122, C3537l.yandex("documentScannerUiOptionalModuleSessionFinishLogEvent"));

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public static final C3537l f33738l = AbstractC9029l.smaato(123, C3537l.yandex("onDeviceDocumentScannerUiCreateLogEvent"));

    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public static final C3537l f33770l = AbstractC9029l.smaato(124, C3537l.yandex("onDeviceSubjectSegmentationCreateLogEvent"));

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public static final C3537l f33727l = AbstractC9029l.smaato(125, C3537l.yandex("onDeviceSubjectSegmentationLoadLogEvent"));

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public static final C3537l f33761l = AbstractC9029l.smaato(126, C3537l.yandex("onDeviceSubjectSegmentationInferenceLogEvent"));

    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public static final C3537l f33771l = AbstractC9029l.smaato(127, C3537l.yandex("aggregatedOnDeviceSubjectSegmentationLogEvent"));

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public static final C3537l f33733l = AbstractC9029l.smaato(128, C3537l.yandex("subjectSegmentationOptionalModuleLogEvent"));

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public static final C3537l f33766l = AbstractC9029l.smaato(129, C3537l.yandex("documentScannerUiModuleScreenViewEvent"));

    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public static final C3537l f33729l = AbstractC9029l.smaato(130, C3537l.yandex("documentScannerUiModuleScreenClickEvent"));

    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    public static final C3537l f33742l = AbstractC9029l.smaato(131, C3537l.yandex("documentScannerUiModuleScreenErrorEvent"));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C9979l c9979l = (C9979l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c9979l.yandex);
        interfaceC14185l.yandex(crashlytics, c9979l.loadAd);
        interfaceC14185l.yandex(amazon, null);
        interfaceC14185l.yandex(purchase, c9979l.crashlytics);
        interfaceC14185l.yandex(billing, null);
        interfaceC14185l.yandex(mopub, null);
        interfaceC14185l.yandex(admob, null);
        interfaceC14185l.yandex(subs, null);
        interfaceC14185l.yandex(isPro, null);
        interfaceC14185l.yandex(firebase, null);
        interfaceC14185l.yandex(smaato, null);
        interfaceC14185l.yandex(remoteconfig, null);
        interfaceC14185l.yandex(vip, c9979l.amazon);
        interfaceC14185l.yandex(metrica, c9979l.purchase);
        interfaceC14185l.yandex(startapp, null);
        interfaceC14185l.yandex(adcel, null);
        interfaceC14185l.yandex(ads, null);
        interfaceC14185l.yandex(subscription, null);
        interfaceC14185l.yandex(tapsense, null);
        interfaceC14185l.yandex(Signature, null);
        interfaceC14185l.yandex(license, null);
        interfaceC14185l.yandex(pro, null);
        interfaceC14185l.yandex(ad, null);
        interfaceC14185l.yandex(advert, null);
        interfaceC14185l.yandex(isVip, null);
        interfaceC14185l.yandex(signatures, null);
        interfaceC14185l.yandex(premium, null);
        interfaceC14185l.yandex(applovin, null);
        interfaceC14185l.yandex(appmetrica, null);
        interfaceC14185l.yandex(inmobi, null);
        interfaceC14185l.yandex(f33802throws, null);
        interfaceC14185l.yandex(f33790package, null);
        interfaceC14185l.yandex(f33799synchronized, null);
        interfaceC14185l.yandex(f33796strictfp, null);
        interfaceC14185l.yandex(f33805volatile, null);
        interfaceC14185l.yandex(f33788native, null);
        interfaceC14185l.yandex(f33791private, null);
        interfaceC14185l.yandex(f33718extends, null);
        interfaceC14185l.yandex(f33721for, null);
        interfaceC14185l.yandex(f33801throw, null);
        interfaceC14185l.yandex(f33712catch, null);
        interfaceC14185l.yandex(f33717else, null);
        interfaceC14185l.yandex(f33711case, null);
        interfaceC14185l.yandex(f33798switch, c9979l.billing);
        interfaceC14185l.yandex(f33715continue, null);
        interfaceC14185l.yandex(f33713class, null);
        interfaceC14185l.yandex(f33726interface, null);
        interfaceC14185l.yandex(f33795static, null);
        interfaceC14185l.yandex(f33716default, null);
        interfaceC14185l.yandex(f33719final, null);
        interfaceC14185l.yandex(f33789new, null);
        interfaceC14185l.yandex(f33722goto, null);
        interfaceC14185l.yandex(f33797super, null);
        interfaceC14185l.yandex(f33724import, null);
        interfaceC14185l.yandex(f33709abstract, null);
        interfaceC14185l.yandex(f33725instanceof, null);
        interfaceC14185l.yandex(f33793public, null);
        interfaceC14185l.yandex(f33720finally, null);
        interfaceC14185l.yandex(f33800this, null);
        interfaceC14185l.yandex(f33804try, null);
        interfaceC14185l.yandex(f33710break, null);
        interfaceC14185l.yandex(f33803transient, null);
        interfaceC14185l.yandex(f33792protected, null);
        interfaceC14185l.yandex(f33806while, null);
        interfaceC14185l.yandex(f33723implements, null);
        interfaceC14185l.yandex(f33714const, null);
        interfaceC14185l.yandex(f33794return, null);
        interfaceC14185l.yandex(f33786l, null);
        interfaceC14185l.yandex(f33754l, null);
        interfaceC14185l.yandex(f33784l, null);
        interfaceC14185l.yandex(f33777l, null);
        interfaceC14185l.yandex(f33741l, null);
        interfaceC14185l.yandex(f33736l, null);
        interfaceC14185l.yandex(f33779l, null);
        interfaceC14185l.yandex(f33765l, null);
        interfaceC14185l.yandex(f33767l, null);
        interfaceC14185l.yandex(f33731l, null);
        interfaceC14185l.yandex(f33734l, null);
        interfaceC14185l.yandex(f33773l, null);
        interfaceC14185l.yandex(f33774l, null);
        interfaceC14185l.yandex(f33732l, null);
        interfaceC14185l.yandex(f33764l, null);
        interfaceC14185l.yandex(f33762l, null);
        interfaceC14185l.yandex(f33747l, null);
        interfaceC14185l.yandex(f33768l, null);
        interfaceC14185l.yandex(f33772l, null);
        interfaceC14185l.yandex(f33750l, null);
        interfaceC14185l.yandex(f33751l, null);
        interfaceC14185l.yandex(f33740l, null);
        interfaceC14185l.yandex(f33744l, null);
        interfaceC14185l.yandex(f33753l, null);
        interfaceC14185l.yandex(f33735l, null);
        interfaceC14185l.yandex(f33775l, null);
        interfaceC14185l.yandex(f33756l, null);
        interfaceC14185l.yandex(f33745l, null);
        interfaceC14185l.yandex(f33743l, null);
        interfaceC14185l.yandex(f33746l, null);
        interfaceC14185l.yandex(f33783l, null);
        interfaceC14185l.yandex(f33781l, null);
        interfaceC14185l.yandex(f33748l, null);
        interfaceC14185l.yandex(f33782l, null);
        interfaceC14185l.yandex(f33757l, null);
        interfaceC14185l.yandex(f33787l, null);
        interfaceC14185l.yandex(f33728l, null);
        interfaceC14185l.yandex(f33785l, null);
        interfaceC14185l.yandex(f33778l, null);
        interfaceC14185l.yandex(f33780l, null);
        interfaceC14185l.yandex(f33759l, null);
        interfaceC14185l.yandex(f33769l, null);
        interfaceC14185l.yandex(f33730l, null);
        interfaceC14185l.yandex(f33776l, null);
        interfaceC14185l.yandex(f33752l, null);
        interfaceC14185l.yandex(f33760l, null);
        interfaceC14185l.yandex(f33737l, null);
        interfaceC14185l.yandex(f33755l, null);
        interfaceC14185l.yandex(f33758l, null);
        interfaceC14185l.yandex(f33739l, null);
        interfaceC14185l.yandex(f33749l, null);
        interfaceC14185l.yandex(f33763l, null);
        interfaceC14185l.yandex(f33738l, null);
        interfaceC14185l.yandex(f33770l, null);
        interfaceC14185l.yandex(f33727l, null);
        interfaceC14185l.yandex(f33761l, null);
        interfaceC14185l.yandex(f33771l, null);
        interfaceC14185l.yandex(f33733l, null);
        interfaceC14185l.yandex(f33766l, null);
        interfaceC14185l.yandex(f33729l, null);
        interfaceC14185l.yandex(f33742l, null);
    }
}
