package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l٘ؖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17681l extends MediaCodec.Callback {
    public MediaFormat admob;
    public Handler crashlytics;
    public MediaCodec.CryptoException firebase;
    public MediaCodec.CodecException isPro;
    public final HandlerThread loadAd;
    public C14965l metrica;
    public boolean remoteconfig;
    public long smaato;
    public MediaFormat subs;
    public IllegalStateException vip;
    public final Object yandex = new Object();
    public final C12676l amazon = new C12676l();
    public final C12676l purchase = new C12676l();
    public final ArrayDeque billing = new ArrayDeque();
    public final ArrayDeque mopub = new ArrayDeque();

    public C17681l(HandlerThread handlerThread) {
        this.loadAd = handlerThread;
    }

    public final void crashlytics(IllegalStateException illegalStateException) {
        synchronized (this.yandex) {
            this.vip = illegalStateException;
        }
    }

    public final void loadAd() {
        IllegalStateException illegalStateException = this.vip;
        if (illegalStateException != null) {
            this.vip = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.isPro;
        if (codecException != null) {
            this.isPro = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.firebase;
        if (cryptoException == null) {
            return;
        }
        this.firebase = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.yandex) {
            this.firebase = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.yandex) {
            this.isPro = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C2865l c2865l;
        synchronized (this.yandex) {
            this.amazon.loadAd(i);
            C14965l c14965l = this.metrica;
            if (c14965l != null && (c2865l = ((AbstractC6641l) c14965l.f29441l).f13939l) != null) {
                c2865l.yandex();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        C2865l c2865l;
        synchronized (this.yandex) {
            try {
                MediaFormat mediaFormat = this.subs;
                if (mediaFormat != null) {
                    this.purchase.loadAd(-2);
                    this.mopub.add(mediaFormat);
                    this.subs = null;
                }
                this.purchase.loadAd(i);
                this.billing.add(bufferInfo);
                C14965l c14965l = this.metrica;
                if (c14965l != null && (c2865l = ((AbstractC6641l) c14965l.f29441l).f13939l) != null) {
                    c2865l.yandex();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.yandex) {
            this.purchase.loadAd(-2);
            this.mopub.add(mediaFormat);
            this.subs = null;
        }
    }

    public final void yandex() {
        ArrayDeque arrayDeque = this.mopub;
        if (!arrayDeque.isEmpty()) {
            this.subs = (MediaFormat) arrayDeque.getLast();
        }
        C12676l c12676l = this.amazon;
        c12676l.crashlytics = c12676l.loadAd;
        C12676l c12676l2 = this.purchase;
        c12676l2.crashlytics = c12676l2.loadAd;
        this.billing.clear();
        arrayDeque.clear();
    }
}
