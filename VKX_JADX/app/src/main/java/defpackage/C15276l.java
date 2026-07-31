package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: lۣٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15276l implements InterfaceC17529l {
    public final C16957l amazon;
    public int billing = 0;
    public final InterfaceC2002l crashlytics;
    public final C17681l loadAd;
    public boolean purchase;
    public final MediaCodec yandex;

    public C15276l(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC2002l interfaceC2002l, C16957l c16957l) {
        this.yandex = mediaCodec;
        this.loadAd = new C17681l(handlerThread);
        this.crashlytics = interfaceC2002l;
        this.amazon = c16957l;
    }

    public static String amazon(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public static void crashlytics(C15276l c15276l, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C16957l c16957l;
        C17681l c17681l = c15276l.loadAd;
        MediaCodec mediaCodec = c15276l.yandex;
        HandlerThread handlerThread = c17681l.loadAd;
        AbstractC12442l.subscription(c17681l.crashlytics == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(c17681l, handler);
        c17681l.crashlytics = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        c15276l.crashlytics.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c16957l = c15276l.amazon) != null) {
            c16957l.yandex(mediaCodec);
        }
        c15276l.billing = 1;
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
        this.yandex.setOnFrameRenderedListener(new C14683l(this, c13214l, 0), handler);
    }

    @Override // defpackage.InterfaceC17529l
    public final void billing(int i) {
        this.yandex.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.InterfaceC17529l
    public final int firebase(MediaCodec.BufferInfo bufferInfo) {
        this.crashlytics.smaato();
        C17681l c17681l = this.loadAd;
        synchronized (c17681l.yandex) {
            try {
                c17681l.loadAd();
                if (c17681l.smaato > 0 || c17681l.remoteconfig) {
                    return -1;
                }
                C12676l c12676l = c17681l.purchase;
                int i = c12676l.loadAd;
                int i2 = c12676l.crashlytics;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = ((int[]) c12676l.purchase)[i];
                c12676l.loadAd = c12676l.amazon & (i + 1);
                if (i3 >= 0) {
                    c17681l.admob.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c17681l.billing.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    c17681l.admob = (MediaFormat) c17681l.mopub.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC17529l
    public final void flush() {
        this.crashlytics.flush();
        this.yandex.flush();
        C17681l c17681l = this.loadAd;
        synchronized (c17681l.yandex) {
            c17681l.smaato++;
            Handler handler = c17681l.crashlytics;
            String str = AbstractC15323l.yandex;
            handler.post(new RunnableC16112l(5, c17681l));
        }
        this.yandex.start();
    }

    @Override // defpackage.InterfaceC17529l
    public final int isPro() {
        this.crashlytics.smaato();
        C17681l c17681l = this.loadAd;
        synchronized (c17681l.yandex) {
            try {
                c17681l.loadAd();
                int i = -1;
                if (c17681l.smaato > 0 || c17681l.remoteconfig) {
                    return -1;
                }
                C12676l c12676l = c17681l.amazon;
                int i2 = c12676l.loadAd;
                int i3 = c12676l.crashlytics;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = ((int[]) c12676l.purchase)[i2];
                    c12676l.loadAd = (i2 + 1) & c12676l.amazon;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC17529l
    public final void loadAd(int i, C4276l c4276l, long j, int i2) {
        this.crashlytics.loadAd(i, c4276l, j, i2);
    }

    @Override // defpackage.InterfaceC17529l
    public final void metrica(Surface surface) {
        this.yandex.setOutputSurface(surface);
    }

    @Override // defpackage.InterfaceC17529l
    public final MediaFormat mopub() {
        MediaFormat mediaFormat;
        C17681l c17681l = this.loadAd;
        synchronized (c17681l.yandex) {
            try {
                mediaFormat = c17681l.admob;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.InterfaceC17529l
    public final void purchase(int i, int i2, int i3, long j) {
        this.crashlytics.purchase(i, i2, i3, j);
    }

    @Override // defpackage.InterfaceC17529l
    public final void release() {
        C16957l c16957l;
        C16957l c16957l2;
        try {
            if (this.billing == 1) {
                this.crashlytics.shutdown();
                C17681l c17681l = this.loadAd;
                synchronized (c17681l.yandex) {
                    c17681l.remoteconfig = true;
                    c17681l.loadAd.quit();
                    c17681l.yandex();
                }
            }
            this.billing = 2;
            if (this.purchase) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.yandex.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (c16957l2 = this.amazon) != null) {
                    c16957l2.crashlytics(this.yandex);
                }
                this.yandex.release();
                this.purchase = true;
            }
        } catch (Throwable th) {
            if (!this.purchase) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.yandex.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (c16957l = this.amazon) != null) {
                        c16957l.crashlytics(this.yandex);
                    }
                    this.yandex.release();
                    this.purchase = true;
                }
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC17529l
    public final void remoteconfig(int i) {
        this.yandex.setVideoScalingMode(i);
    }

    @Override // defpackage.InterfaceC17529l
    public final void smaato(RunnableC12388l runnableC12388l) {
        C17681l c17681l = this.loadAd;
        RunnableC7762l runnableC7762l = new RunnableC7762l(this, runnableC12388l, 5);
        synchronized (c17681l.yandex) {
            c17681l.loadAd();
            runnableC7762l.run();
        }
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
    public final boolean subscription(C14965l c14965l) {
        C17681l c17681l = this.loadAd;
        synchronized (c17681l.yandex) {
            c17681l.metrica = c14965l;
        }
        return true;
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
        this.crashlytics.yandex(bundle);
    }
}
