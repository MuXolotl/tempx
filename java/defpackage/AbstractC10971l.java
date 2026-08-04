package defpackage;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.WindowInsets;

/* JADX INFO: renamed from: lُُٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC10971l {
    public static /* synthetic */ WindowInsets.Builder admob() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ RenderNode amazon() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ MediaSession billing(Context context) {
        return new MediaSession(context, "CastMediaSession", null);
    }

    public static /* synthetic */ RadialGradient crashlytics(float f, float f2, float f3, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new RadialGradient(f, f2, f3, jArr, fArr, tileMode);
    }

    public static /* synthetic */ void isPro() {
    }

    public static /* synthetic */ LinearGradient loadAd(float f, float f2, float f3, float f4, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new LinearGradient(f, f2, f3, f4, jArr, fArr, tileMode);
    }

    public static /* synthetic */ MediaSession mopub(Context context, Bundle bundle, String str) {
        return new MediaSession(context, str, bundle);
    }

    public static /* synthetic */ SweepGradient purchase(float f, float f2, long[] jArr, float[] fArr) {
        return new SweepGradient(f, f2, jArr, fArr);
    }

    public static /* synthetic */ WindowInsets.Builder subs(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ BlendModeColorFilter yandex(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }
}
