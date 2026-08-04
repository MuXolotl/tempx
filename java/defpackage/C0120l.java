package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: lؑؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0120l implements InterfaceC11766l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1024l;

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        int dimensionPixelSize;
        switch (this.f1024l) {
            case 0:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (executorServiceNewSingleThreadExecutor instanceof InterfaceExecutorServiceC0212l) {
                    return (InterfaceExecutorServiceC0212l) executorServiceNewSingleThreadExecutor;
                }
                return executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new ScheduledExecutorServiceC6354l((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new C17438l(executorServiceNewSingleThreadExecutor);
            case 1:
                Resources system = Resources.getSystem();
                try {
                    dimensionPixelSize = system.getDimensionPixelSize(system.getIdentifier("notification_right_icon_size", "dimen", "android"));
                    if (Build.VERSION.SDK_INT < 31) {
                        dimensionPixelSize = Math.max(Math.max(dimensionPixelSize, system.getDimensionPixelSize(system.getIdentifier("notification_media_image_max_width", "dimen", "android"))), system.getDimensionPixelSize(system.getIdentifier("notification_media_image_max_height", "dimen", "android")));
                    }
                    break;
                } catch (Resources.NotFoundException unused) {
                    dimensionPixelSize = (int) ((Build.VERSION.SDK_INT < 31 ? 280 : 48) * system.getDisplayMetrics().density);
                }
                return Integer.valueOf(dimensionPixelSize);
            case 2:
                byte[] bArr = new byte[12];
                C6219l.subs.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new C7865l(new C13326l(65536), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, false, 0, C15333l.f29966l);
            case 4:
                Resources system2 = Resources.getSystem();
                int dimensionPixelSize2 = system2.getDisplayMetrics().widthPixels;
                try {
                    dimensionPixelSize2 = system2.getDimensionPixelSize(system2.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                    break;
                } catch (Resources.NotFoundException unused2) {
                }
                return Integer.valueOf(dimensionPixelSize2);
            case 5:
                Resources system3 = Resources.getSystem();
                int dimensionPixelSize3 = system3.getDisplayMetrics().widthPixels;
                try {
                    dimensionPixelSize3 = system3.getDimensionPixelSize(system3.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                    break;
                } catch (Resources.NotFoundException unused3) {
                }
                return Integer.valueOf(dimensionPixelSize3);
            case 6:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    C11983l.ads(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
