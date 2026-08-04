package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.Rational;
import android.util.SparseBooleanArray;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: lؔۨٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3088l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6622l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6623l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6624l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f6625l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f6626l;

    public /* synthetic */ RunnableC3088l(C7644l c7644l, C4330l c4330l, int i, Runnable runnable) {
        this.f6624l = 4;
        this.f6622l = c7644l;
        this.f6626l = c4330l;
        this.f6623l = i;
        this.f6625l = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x020b  */
    @Override // java.lang.Runnable
    public final void run() {
        C7025l c7025l;
        InterfaceC0713l interfaceC0713l;
        Executor executor;
        MediaCodec.BufferInfo bufferInfo;
        int i = 1;
        int i2 = 0;
        switch (this.f6624l) {
            case 0:
                ((C7025l) this.f6622l).crashlytics(this.f6623l, (String) this.f6626l, (Throwable) this.f6625l);
                return;
            case 1:
                C18676l c18676l = (C18676l) this.f6622l;
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f6626l;
                MediaCodec mediaCodec = (MediaCodec) this.f6625l;
                int i3 = this.f6623l;
                boolean z = c18676l.isPro;
                C7025l c7025l2 = c18676l.smaato;
                if (z) {
                    AbstractC5088l.tapsense(c7025l2.yandex, "Receives frame after codec is reset.");
                    return;
                }
                switch (AbstractC5020l.inmobi(c7025l2.f14718throws)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (c18676l.smaato.loadAd) {
                            c7025l = c18676l.smaato;
                            interfaceC0713l = c7025l.tapsense;
                            executor = c7025l.Signature;
                            break;
                        }
                        if (Build.VERSION.SDK_INT < 30 && c7025l.crashlytics) {
                            Rational rational = c7025l.ads;
                            if (!(rational != null && rational.getDenominator() == rational.getNumerator())) {
                                bufferInfo2.presentationTimeUs = c18676l.smaato.firebase(bufferInfo2.presentationTimeUs);
                            }
                        }
                        if (!c18676l.crashlytics) {
                            c18676l.crashlytics = true;
                            try {
                                Objects.requireNonNull(interfaceC0713l);
                                executor.execute(new RunnableC11992l(interfaceC0713l, i2));
                            } catch (RejectedExecutionException e) {
                                AbstractC5088l.amazon(c18676l.smaato.yandex, "Unable to post to the supplied executor.", e);
                            }
                            break;
                        }
                        if (!c18676l.yandex(bufferInfo2)) {
                            try {
                                c18676l.smaato.purchase.releaseOutputBuffer(i3, false);
                            } catch (MediaCodec.CodecException e2) {
                                c18676l.smaato.yandex(1, e2.getMessage(), e2);
                                return;
                            }
                            break;
                        } else {
                            if (!c18676l.amazon) {
                                c18676l.amazon = true;
                                AbstractC5088l.yandex(c18676l.smaato.yandex, "data timestampUs = " + bufferInfo2.presentationTimeUs + ", data timebase = " + c18676l.smaato.startapp + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                            }
                            long j = c18676l.smaato.pro;
                            long j2 = j > 0 ? bufferInfo2.presentationTimeUs - j : bufferInfo2.presentationTimeUs;
                            if (bufferInfo2.presentationTimeUs == j2) {
                                bufferInfo = bufferInfo2;
                            } else {
                                AbstractC5641l.purchase(null, j2 > c18676l.mopub);
                                bufferInfo = new MediaCodec.BufferInfo();
                                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, j2, bufferInfo2.flags);
                            }
                            c18676l.mopub = bufferInfo.presentationTimeUs;
                            try {
                                c18676l.crashlytics(new C14722l(mediaCodec, i3, bufferInfo), interfaceC0713l, executor);
                            } catch (MediaCodec.CodecException e3) {
                                c18676l.smaato.yandex(1, e3.getMessage(), e3);
                                return;
                            }
                            break;
                        }
                        if (!c18676l.purchase) {
                            if ((bufferInfo2.flags & 4) != 0 && (!c18676l.firebase || AbstractC1469l.yandex.loadAd(PrematureEndOfStreamVideoQuirk.class) == null)) {
                                c18676l.loadAd();
                            } else if (c18676l.loadAd) {
                                C7025l c7025l3 = c18676l.smaato;
                                if (c7025l3.appmetrica && bufferInfo2.presentationTimeUs > ((Long) c7025l3.license.getUpper()).longValue()) {
                                    c18676l.loadAd();
                                }
                            }
                        }
                        if (c18676l.firebase) {
                            c18676l.firebase = false;
                            return;
                        }
                        return;
                    default:
                        C8339l.smaato("Unknown state: ".concat(AbstractC9361l.m2637strictfp(c18676l.smaato.f14718throws)));
                        return;
                }
            case 2:
                C9716l c9716l = (C9716l) this.f6622l;
                int i4 = this.f6623l;
                C13572l c13572l = (C13572l) this.f6626l;
                C16543l c16543l = (C16543l) this.f6625l;
                if (i4 == c9716l.f19806l) {
                    c9716l.purchase(c13572l, c16543l, c9716l.crashlytics(false));
                    return;
                }
                return;
            case 3:
                C13698l c13698l = (C13698l) this.f6622l;
                int i5 = this.f6623l;
                List list = (List) this.f6626l;
                C6499l c6499l = (C6499l) this.f6625l;
                C3726l c3726l = ((C13350l) c13698l.f26746l).admob;
                if (i5 == -1) {
                    c3726l.tapsense.mo2768l(list);
                } else {
                    c3726l.tapsense.mo2754default(i5, list);
                }
                new SparseBooleanArray().append(20, true);
                c3726l.signatures(c6499l);
                return;
            default:
                C7644l c7644l = (C7644l) this.f6622l;
                C4330l c4330l = (C4330l) this.f6626l;
                int i6 = this.f6623l;
                Runnable runnable = (Runnable) this.f6625l;
                C16163l c16163l = (C16163l) c7644l.f15742l;
                try {
                    try {
                        C16163l c16163l2 = (C16163l) c7644l.f15734l;
                        Objects.requireNonNull(c16163l2);
                        c16163l.ads(new C1977l(c16163l2, i));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) c7644l.f15738l).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            c16163l.ads(new C0743l(c7644l, c4330l, i6));
                        } else {
                            c7644l.remoteconfig(c4330l, i6);
                        }
                        break;
                    } catch (C1325l unused) {
                        ((C10111l) c7644l.f15740l).m2883strictfp(c4330l, i6 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }

    public /* synthetic */ RunnableC3088l(C18676l c18676l, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.f6624l = 1;
        this.f6622l = c18676l;
        this.f6626l = bufferInfo;
        this.f6625l = mediaCodec;
        this.f6623l = i;
    }

    public /* synthetic */ RunnableC3088l(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.f6624l = i2;
        this.f6622l = obj;
        this.f6623l = i;
        this.f6626l = obj2;
        this.f6625l = obj3;
    }
}
