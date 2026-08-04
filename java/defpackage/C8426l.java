package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: lًًۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8426l {
    public final /* synthetic */ int yandex;
    public static final C8426l loadAd = new C8426l(0);
    public static final C8426l crashlytics = new C8426l(1);

    public /* synthetic */ C8426l(int i) {
        this.yandex = i;
    }

    public final void yandex(Object obj) throws Exception {
        switch (this.yandex) {
            case 0:
                AutoCloseable autoCloseable = (AutoCloseable) obj;
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        AbstractC14238l.vip((ExecutorService) autoCloseable);
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                    } else if (!(autoCloseable instanceof ContentProviderClient)) {
                        C11983l.crashlytics();
                    } else {
                        ((ContentProviderClient) autoCloseable).release();
                    }
                }
                break;
        }
    }

    private final void loadAd(Object obj) {
    }
}
