package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: lۤٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18676l extends MediaCodec.Callback {
    public boolean firebase;
    public final boolean loadAd;
    public final /* synthetic */ C7025l smaato;
    public final C17904l yandex;
    public boolean crashlytics = false;
    public boolean amazon = false;
    public boolean purchase = false;
    public long billing = 0;
    public long mopub = 0;
    public boolean admob = false;
    public boolean subs = false;
    public boolean isPro = false;

    public C18676l(C7025l c7025l) {
        this.smaato = c7025l;
        this.loadAd = true;
        boolean z = c7025l.crashlytics;
        this.firebase = z;
        if (z) {
            this.yandex = new C17904l(c7025l.adcel, c7025l.startapp, (CameraUseInconsistentTimebaseQuirk) AbstractC1469l.yandex.loadAd(CameraUseInconsistentTimebaseQuirk.class));
        } else {
            this.yandex = null;
        }
        if (((CodecStuckOnFlushQuirk) AbstractC1469l.yandex.loadAd(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(c7025l.amazon.getString("mime"))) {
            return;
        }
        this.loadAd = false;
    }

    public final void crashlytics(C14722l c14722l, InterfaceC0713l interfaceC0713l, Executor executor) {
        C7025l c7025l = this.smaato;
        c7025l.vip.add(c14722l);
        ListenableFuture listenableFutureAdmob = AbstractC11356l.admob(c14722l.f28787l);
        C18595l c18595l = new C18595l(this, c14722l, false, 20);
        listenableFutureAdmob.yandex(new RunnableC9929l(listenableFutureAdmob, c18595l, 0 == true ? 1 : 0), c7025l.admob);
        try {
            executor.execute(new RunnableC0336l(interfaceC0713l, c14722l, 21));
        } catch (RejectedExecutionException e) {
            AbstractC5088l.amazon(c7025l.yandex, "Unable to post to the supplied executor.", e);
            c14722l.close();
        }
    }

    public final void loadAd() {
        C7025l c7025l;
        InterfaceC0713l interfaceC0713l;
        Executor executor;
        AbstractC5088l.yandex(this.smaato.yandex, "reachEndData");
        if (this.purchase) {
            return;
        }
        this.purchase = true;
        ScheduledFuture scheduledFuture = this.smaato.inmobi;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.smaato.inmobi = null;
        }
        synchronized (this.smaato.loadAd) {
            c7025l = this.smaato;
            interfaceC0713l = c7025l.tapsense;
            executor = c7025l.Signature;
        }
        c7025l.isPro(new RunnableC10613l(this, executor, interfaceC0713l, 19));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.smaato.admob.execute(new RunnableC0336l(this, codecException, 19));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.smaato.admob.execute(new RunnableC9534l(this, i, 5));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.smaato.admob.execute(new RunnableC3088l(this, bufferInfo, mediaCodec, i));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        C7025l c7025l = this.smaato;
        String str = c7025l.yandex;
        StringBuilder sb = new StringBuilder("onOutputFormatChanged: mediaFormat = ");
        sb.append(mediaFormat);
        sb.append(", CSD data = ");
        StringBuilder sb2 = new StringBuilder("{csd-0 = ");
        sb2.append(AbstractC16181l.yandex(mediaFormat.getByteBuffer("csd-0")));
        if (mediaFormat.containsKey("csd-1")) {
            sb2.append(", csd-1 = ");
            sb2.append(AbstractC16181l.yandex(mediaFormat.getByteBuffer("csd-1")));
        }
        if (mediaFormat.containsKey("csd-2")) {
            sb2.append(", csd-2 = ");
            sb2.append(AbstractC16181l.yandex(mediaFormat.getByteBuffer("csd-2")));
        }
        sb2.append("}");
        sb.append(sb2.toString());
        AbstractC5088l.yandex(str, sb.toString());
        c7025l.admob.execute(new RunnableC0336l(this, mediaFormat, 20));
    }

    public final boolean yandex(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        Executor executor;
        InterfaceC0713l interfaceC0713l;
        int i = 0;
        if (this.purchase) {
            AbstractC5088l.yandex(this.smaato.yandex, "Drop buffer by already reach end of stream.");
            return false;
        }
        if (bufferInfo.size <= 0) {
            AbstractC5088l.yandex(this.smaato.yandex, "Drop buffer by invalid buffer size.");
            return false;
        }
        if ((bufferInfo.flags & 2) != 0) {
            AbstractC5088l.yandex(this.smaato.yandex, "Drop buffer by codec config.");
            return false;
        }
        C17904l c17904l = this.yandex;
        if (c17904l != null) {
            bufferInfo.presentationTimeUs = c17904l.yandex(bufferInfo.presentationTimeUs);
        }
        long j = bufferInfo.presentationTimeUs;
        if (j <= this.billing) {
            AbstractC5088l.yandex(this.smaato.yandex, "Drop buffer by out of order buffer from MediaCodec.");
            return false;
        }
        this.billing = j;
        boolean zContains = this.smaato.license.contains(Long.valueOf(j));
        C7025l c7025l = this.smaato;
        if (zContains) {
            long j2 = bufferInfo.presentationTimeUs;
            ArrayDeque arrayDeque = c7025l.metrica;
            while (!arrayDeque.isEmpty()) {
                Range range = (Range) arrayDeque.getFirst();
                if (j2 <= ((Long) range.getUpper()).longValue()) {
                    break;
                }
                arrayDeque.removeFirst();
                long jLongValue = (((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue()) + c7025l.pro;
                c7025l.pro = jLongValue;
                AbstractC5088l.yandex(c7025l.yandex, "Total paused duration = ".concat(AbstractC16181l.billing(jLongValue)));
            }
            C7025l c7025l2 = this.smaato;
            long j3 = bufferInfo.presentationTimeUs;
            Iterator it = c7025l2.metrica.iterator();
            while (true) {
                if (it.hasNext()) {
                    Range range2 = (Range) it.next();
                    if (range2.contains(Long.valueOf(j3))) {
                        z = true;
                        break;
                    }
                    if (j3 < ((Long) range2.getLower()).longValue()) {
                    }
                }
                z = false;
                break;
            }
            boolean z2 = this.admob;
            if (!z2 && z) {
                AbstractC5088l.yandex(this.smaato.yandex, "Switch to pause state");
                this.admob = true;
                synchronized (this.smaato.loadAd) {
                    C7025l c7025l3 = this.smaato;
                    executor = c7025l3.Signature;
                    interfaceC0713l = c7025l3.tapsense;
                }
                Objects.requireNonNull(interfaceC0713l);
                executor.execute(new RunnableC11992l(interfaceC0713l, i));
                C7025l c7025l4 = this.smaato;
                if (c7025l4.f14718throws == 3 && ((c7025l4.crashlytics || AbstractC1469l.yandex.loadAd(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.smaato.crashlytics || AbstractC1469l.yandex.loadAd(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    InterfaceC0049l interfaceC0049l = this.smaato.billing;
                    if (interfaceC0049l instanceof C10398l) {
                        ((C10398l) interfaceC0049l).yandex(false);
                    }
                    this.smaato.mopub(true);
                }
                this.smaato.advert = Long.valueOf(bufferInfo.presentationTimeUs);
                C7025l c7025l5 = this.smaato;
                if (c7025l5.ad) {
                    ScheduledFuture scheduledFuture = c7025l5.isVip;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    this.smaato.subs();
                    this.smaato.ad = false;
                }
            } else if (z2 && !z) {
                AbstractC5088l.yandex(this.smaato.yandex, "Switch to resume state");
                this.admob = false;
                if (this.smaato.crashlytics && (bufferInfo.flags & 1) == 0) {
                    this.subs = true;
                }
            }
            boolean z3 = this.admob;
            C7025l c7025l6 = this.smaato;
            if (z3) {
                AbstractC5088l.yandex(c7025l6.yandex, "Drop buffer by pause.");
                return false;
            }
            long j4 = c7025l6.pro;
            long j5 = bufferInfo.presentationTimeUs;
            if (j4 > 0) {
                j5 -= j4;
            }
            if (j5 > this.mopub) {
                if (!this.amazon && !this.subs && c7025l6.crashlytics) {
                    this.subs = true;
                }
                if (!this.subs) {
                    return true;
                }
                if ((bufferInfo.flags & 1) != 0) {
                    this.subs = false;
                    return true;
                }
                AbstractC5088l.yandex(c7025l6.yandex, "Drop buffer by not a key frame.");
                this.smaato.purchase();
                return false;
            }
            AbstractC5088l.yandex(c7025l6.yandex, "Drop buffer by adjusted time is less than the last sent time.");
            if (this.smaato.crashlytics && (bufferInfo.flags & 1) != 0) {
                this.subs = true;
            }
        } else {
            AbstractC5088l.yandex(c7025l.yandex, "Drop buffer by not in start-stop range.");
            C7025l c7025l7 = this.smaato;
            if (c7025l7.ad && bufferInfo.presentationTimeUs >= ((Long) c7025l7.license.getUpper()).longValue()) {
                ScheduledFuture scheduledFuture2 = this.smaato.isVip;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                }
                this.smaato.advert = Long.valueOf(bufferInfo.presentationTimeUs);
                this.smaato.subs();
                this.smaato.ad = false;
                return false;
            }
        }
        return false;
    }
}
