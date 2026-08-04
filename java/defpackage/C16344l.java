package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.SurfaceTexture;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: lِٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16344l implements InterfaceC17121l {
    public final /* synthetic */ SurfaceTexture amazon;
    public final /* synthetic */ Surface crashlytics;
    public final /* synthetic */ C18474l loadAd;
    public final /* synthetic */ CountDownLatch yandex;

    public C16344l(CountDownLatch countDownLatch, C18474l c18474l, Surface surface, SurfaceTexture surfaceTexture) {
        this.yandex = countDownLatch;
        this.loadAd = c18474l;
        this.crashlytics = surface;
        this.amazon = surfaceTexture;
    }

    @Override // defpackage.InterfaceC17121l
    public final void admob() {
        Log.d("CXCP", "Empty capture session configure failed");
        if (this.loadAd.yandex()) {
            this.crashlytics.release();
            this.amazon.release();
        }
        this.yandex.countDown();
    }

    @Override // defpackage.InterfaceC17121l
    public final void amazon() {
        Log.d("CXCP", "Empty capture session closed");
        if (this.loadAd.yandex()) {
            this.crashlytics.release();
            this.amazon.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC17121l
    public final void mopub(InterfaceC11450l interfaceC11450l) throws Exception {
        Log.d("CXCP", "Empty capture session configured. Closing it");
        if (interfaceC11450l instanceof AutoCloseable) {
            interfaceC11450l.close();
        } else if (interfaceC11450l instanceof ExecutorService) {
            AbstractC14238l.vip((ExecutorService) interfaceC11450l);
        } else if (interfaceC11450l instanceof TypedArray) {
            ((TypedArray) interfaceC11450l).recycle();
        } else if (interfaceC11450l instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) interfaceC11450l).release();
        } else if (interfaceC11450l instanceof MediaDrm) {
            ((MediaDrm) interfaceC11450l).release();
        } else if (interfaceC11450l instanceof DrmManagerClient) {
            ((DrmManagerClient) interfaceC11450l).release();
        } else {
            if (!(interfaceC11450l instanceof ContentProviderClient)) {
                C11983l.crashlytics();
                return;
            }
            ((ContentProviderClient) interfaceC11450l).release();
        }
        this.yandex.countDown();
    }

    @Override // defpackage.InterfaceC17121l
    public final void billing() {
    }

    @Override // defpackage.InterfaceC17121l
    public final void crashlytics() {
    }

    @Override // defpackage.InterfaceC6262l
    public final void loadAd() {
    }

    @Override // defpackage.InterfaceC17121l
    public final void purchase() {
    }

    @Override // defpackage.InterfaceC6262l
    public final void yandex() {
    }
}
