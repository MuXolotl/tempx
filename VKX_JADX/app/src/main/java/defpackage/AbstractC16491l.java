package defpackage;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.view.ContentInfo;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٖٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC16491l {
    public static /* synthetic */ ContentInfo.Builder amazon(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ MultiResolutionStreamInfo crashlytics(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* synthetic */ InputConfiguration loadAd(int i, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i);
    }

    public static /* synthetic */ void purchase() {
    }

    public static /* synthetic */ Font.Builder yandex(Font font) {
        return new Font.Builder(font);
    }
}
