package defpackage;

import android.app.PictureInPictureUiState;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lؚۨٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7680l {
    public static void admob(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static final int amazon(InterfaceC5389l interfaceC5389l) {
        Integer num = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final boolean billing(InterfaceC5389l interfaceC5389l) {
        Integer num = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        return num != null && num.intValue() > 1;
    }

    public static final List crashlytics(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionCharacteristicsKeys();
    }

    public static C2582l loadAd(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        int i2 = 7;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new C2582l(i2);
        }
        if (i < 31) {
            return new C2582l(i2);
        }
        pictureInPictureUiState.isStashed();
        return new C2582l(i2);
    }

    public static final void mopub(LinkedHashMap linkedHashMap, int i) {
        linkedHashMap.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i));
    }

    public static final int purchase(InterfaceC5389l interfaceC5389l) {
        Integer num = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static void subs(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }

    public static final void yandex(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }
}
