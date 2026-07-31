package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("jni_common.cc")
public final class MultiScaleDecodingOptions {

    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];

    @UsedByNative("jni_common.cc")
    private int minimumDetectedDimension = 10;

    @UsedByNative("jni_common.cc")
    private boolean skipProcessingIfBarcodeFound = true;

    public final void crashlytics(boolean z) {
        this.skipProcessingIfBarcodeFound = z;
    }

    public final void loadAd(int i) {
        this.minimumDetectedDimension = i;
    }

    public final void yandex(float[] fArr) {
        this.extraScales = fArr;
    }
}
