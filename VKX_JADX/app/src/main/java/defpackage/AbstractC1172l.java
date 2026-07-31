package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import android.media.audiofx.DynamicsProcessing;
import android.media.session.MediaSessionManager;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؒٛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1172l {
    public static /* synthetic */ void amazon() {
    }

    public static /* synthetic */ void billing() {
    }

    public static /* synthetic */ DynamicsProcessing.MbcBand crashlytics(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new DynamicsProcessing.MbcBand(true, f, f2, f3, f4, f5, 0.0f, f6, f7, 0.0f, f8);
    }

    public static /* synthetic */ DynamicsProcessing.Limiter loadAd(boolean z, float f, float f2, float f3, float f4, float f5) {
        return new DynamicsProcessing.Limiter(true, z, 0, f, f2, f3, f4, f5);
    }

    public static /* synthetic */ void purchase(int i, int i2, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public static /* synthetic */ SessionConfiguration yandex(int i, ArrayList arrayList, Executor executor, C7266l c7266l) {
        return new SessionConfiguration(i, arrayList, executor, c7266l);
    }
}
