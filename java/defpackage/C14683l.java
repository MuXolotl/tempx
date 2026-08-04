package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: lٔؖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14683l implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C13214l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C14683l(InterfaceC17529l interfaceC17529l, C13214l c13214l, int i) {
        this.yandex = i;
        this.loadAd = c13214l;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.yandex;
        C13214l c13214l = this.loadAd;
        switch (i) {
            case 0:
                Handler handler = c13214l.f25995l;
                if (Build.VERSION.SDK_INT >= 30) {
                    c13214l.yandex(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                Handler handler2 = c13214l.f25995l;
                if (Build.VERSION.SDK_INT >= 30) {
                    c13214l.yandex(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
