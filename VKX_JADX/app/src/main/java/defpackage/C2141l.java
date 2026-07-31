package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؓۜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2141l implements InterfaceC17529l {
    public final C16957l loadAd;
    public final MediaCodec yandex;

    public C2141l(MediaCodec mediaCodec, C16957l c16957l) {
        this.yandex = mediaCodec;
        this.loadAd = c16957l;
        if (Build.VERSION.SDK_INT < 35 || c16957l == null) {
            return;
        }
        c16957l.yandex(mediaCodec);
    }

    @Override // defpackage.InterfaceC17529l
    public final void adcel(ArrayList arrayList) {
        this.yandex.subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.InterfaceC17529l
    public final void admob() {
        this.yandex.detachOutputSurface();
    }

    @Override // defpackage.InterfaceC17529l
    public final void ads(C13214l c13214l, Handler handler) {
        this.yandex.setOnFrameRenderedListener(new C14683l(this, c13214l, 1), handler);
    }

    @Override // defpackage.InterfaceC17529l
    public final void billing(int i) {
        this.yandex.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.InterfaceC17529l
    public final int firebase(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.yandex.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.InterfaceC17529l
    public final void flush() {
        this.yandex.flush();
    }

    @Override // defpackage.InterfaceC17529l
    public final int isPro() {
        return this.yandex.dequeueInputBuffer(0L);
    }

    @Override // defpackage.InterfaceC17529l
    public final void loadAd(int i, C4276l c4276l, long j, int i2) {
        this.yandex.queueSecureInputBuffer(i, 0, c4276l.subs, j, i2);
    }

    @Override // defpackage.InterfaceC17529l
    public final void metrica(Surface surface) {
        this.yandex.setOutputSurface(surface);
    }

    @Override // defpackage.InterfaceC17529l
    public final MediaFormat mopub() {
        return this.yandex.getOutputFormat();
    }

    @Override // defpackage.InterfaceC17529l
    public final void purchase(int i, int i2, int i3, long j) {
        this.yandex.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.InterfaceC17529l
    public final void release() {
        C16957l c16957l = this.loadAd;
        MediaCodec mediaCodec = this.yandex;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && c16957l != null) {
                c16957l.crashlytics(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // defpackage.InterfaceC17529l
    public final void remoteconfig(int i) {
        this.yandex.setVideoScalingMode(i);
    }

    @Override // defpackage.InterfaceC17529l
    public final void smaato(RunnableC12388l runnableC12388l) {
        runnableC12388l.run();
    }

    @Override // defpackage.InterfaceC17529l
    public final ByteBuffer startapp(int i) {
        return this.yandex.getOutputBuffer(i);
    }

    @Override // defpackage.InterfaceC17529l
    public final void subs(int i, long j) {
        this.yandex.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.InterfaceC17529l
    public final /* synthetic */ boolean subscription(C14965l c14965l) {
        return false;
    }

    @Override // defpackage.InterfaceC17529l
    public final void tapsense(ArrayList arrayList) {
        this.yandex.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // defpackage.InterfaceC17529l
    public final ByteBuffer vip(int i) {
        return this.yandex.getInputBuffer(i);
    }

    @Override // defpackage.InterfaceC17529l
    public final void yandex(Bundle bundle) {
        this.yandex.setParameters(bundle);
    }
}
