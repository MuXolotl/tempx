package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؔۧۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3075l {
    public final C16565l amazon;
    public final ByteBuffer crashlytics;
    public final int loadAd;
    public final C5807l purchase;
    public final /* synthetic */ C7025l subs;
    public final MediaCodec yandex;
    public final AtomicBoolean billing = new AtomicBoolean(false);
    public long mopub = 0;
    public boolean admob = false;

    public C3075l(C7025l c7025l, MediaCodec mediaCodec, int i) {
        this.subs = c7025l;
        mediaCodec.getClass();
        this.yandex = mediaCodec;
        if (i < 0) {
            C11983l.crashlytics();
            throw null;
        }
        this.loadAd = i;
        this.crashlytics = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            atomicReference.set(c5807l);
            c5807l.yandex = "Terminate InputBuffer";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        this.amazon = c16565l;
        C5807l c5807l2 = (C5807l) atomicReference.get();
        c5807l2.getClass();
        this.purchase = c5807l2;
    }
}
