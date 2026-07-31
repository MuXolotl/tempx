package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("jni_common.cc")
public class RecognitionOptions {

    @UsedByNative("jni_common.cc")
    private int barcodeFormats = 0;

    @UsedByNative("jni_common.cc")
    private boolean outputUnrecognizedBarcodes = false;

    @UsedByNative("jni_common.cc")
    private boolean useQrMobilenetV3 = false;

    @UsedByNative("jni_common.cc")
    private boolean enableQrAlignmentGrid = true;

    @UsedByNative("jni_common.cc")
    private boolean enableUseKeypointAsFinderPattern = true;

    @UsedByNative("jni_common.cc")
    private boolean useHalideAffineCrop = false;

    @UsedByNative("jni_common.cc")
    private MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();

    @UsedByNative("jni_common.cc")
    private MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();

    @UsedByNative("jni_common.cc")
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();

    @UsedByNative("jni_common.cc")
    private boolean qrEnableFourthCornerApproximation = false;

    public final void amazon(MultiScaleDecodingOptions multiScaleDecodingOptions) {
        this.multiScaleDecodingOptions = multiScaleDecodingOptions;
    }

    public final void billing(boolean z) {
        this.outputUnrecognizedBarcodes = z;
    }

    public final void crashlytics() {
        this.enableUseKeypointAsFinderPattern = true;
    }

    public final void loadAd() {
        this.enableQrAlignmentGrid = true;
    }

    public final void mopub(boolean z) {
        this.qrEnableFourthCornerApproximation = z;
    }

    public final void purchase(MultiScaleDetectionOptions multiScaleDetectionOptions) {
        this.multiScaleDetectionOptions = multiScaleDetectionOptions;
    }

    public final void yandex(int i) {
        this.barcodeFormats = i;
    }
}
