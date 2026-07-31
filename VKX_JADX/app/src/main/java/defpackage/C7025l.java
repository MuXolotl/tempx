package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؚٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7025l {

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final Range f14717package = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public final C3797l adcel;
    public final ExecutorC7870l admob;
    public final Rational ads;
    public final MediaFormat amazon;
    public final InterfaceC0049l billing;
    public final boolean crashlytics;
    public ScheduledFuture inmobi;
    public final C5807l isPro;
    public final Cgoto mopub;
    public final MediaCodec purchase;
    public final EnumC8920l startapp;
    public final ListenableFuture subs;
    public final boolean subscription;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public int f14718throws;
    public final String yandex;
    public final Object loadAd = new Object();
    public final ArrayDeque firebase = new ArrayDeque();
    public final ArrayDeque smaato = new ArrayDeque();
    public final HashSet remoteconfig = new HashSet();
    public final HashSet vip = new HashSet();
    public final ArrayDeque metrica = new ArrayDeque();
    public InterfaceC0713l tapsense = InterfaceC0713l.Signature;
    public Executor Signature = AbstractC12272l.yandex();
    public Range license = f14717package;
    public long pro = 0;
    public boolean ad = false;
    public Long advert = null;
    public ScheduledFuture isVip = null;
    public C18676l signatures = null;
    public boolean premium = false;
    public boolean applovin = false;
    public boolean appmetrica = false;

    public C7025l(Executor executor, InterfaceC0625l interfaceC0625l, int i) throws C8104l {
        boolean z = false;
        executor.getClass();
        LruCache lruCache = AbstractC4424l.yandex;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(interfaceC0625l.crashlytics());
            this.purchase = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.admob = new ExecutorC7870l(executor);
            MediaFormat mediaFormatYandex = interfaceC0625l.yandex();
            this.amazon = mediaFormatYandex;
            EnumC8920l enumC8920lLoadAd = interfaceC0625l.loadAd();
            this.startapp = enumC8920lLoadAd;
            this.adcel = new C3797l(new C2683l(22, this), new C10819l(12), 18);
            if (interfaceC0625l instanceof AbstractC4214l) {
                this.yandex = "AudioEncoder";
                this.crashlytics = false;
                this.billing = new C10398l(this);
                C7496l c7496l = new C7496l(codecInfo, null);
                ((MediaCodecInfo.CodecCapabilities) c7496l.f833l).getAudioCapabilities();
                this.mopub = c7496l;
                this.ads = new Rational(0, 0);
            } else {
                if (!(interfaceC0625l instanceof C5274l)) {
                    throw new C8104l("Unknown encoder config type");
                }
                C5274l c5274l = (C5274l) interfaceC0625l;
                this.yandex = "VideoEncoder";
                this.crashlytics = true;
                this.billing = new C14315l(this);
                C15955l c15955l = new C15955l(codecInfo, c5274l.yandex);
                if (mediaFormatYandex.containsKey("bitrate")) {
                    int integer = mediaFormatYandex.getInteger("bitrate");
                    int iIntValue = ((Integer) c15955l.f31328l.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatYandex.setInteger("bitrate", iIntValue);
                        AbstractC5088l.yandex("VideoEncoder", "updated bitrate from " + integer + " to " + iIntValue);
                    }
                }
                this.mopub = c15955l;
                this.ads = new Rational(c5274l.mopub, c5274l.admob);
            }
            AbstractC5088l.yandex(this.yandex, "mInputTimebase = " + enumC8920lLoadAd);
            AbstractC5088l.yandex(this.yandex, "mMediaFormat = " + mediaFormatYandex);
            AbstractC5088l.yandex(this.yandex, "mCaptureToEncodeFrameRateRatio = " + this.ads);
            try {
                billing();
                AtomicReference atomicReference = new AtomicReference();
                C5807l c5807l = new C5807l();
                c5807l.crashlytics = new C0011l();
                C16565l c16565l = new C16565l(c5807l);
                c5807l.loadAd = c16565l;
                c5807l.yandex = AbstractC5020l.class;
                try {
                    atomicReference.set(c5807l);
                    c5807l.yandex = "mReleasedFuture";
                } catch (Exception e) {
                    c16565l.loadAd(e);
                }
                this.subs = AbstractC11356l.admob(c16565l);
                C5807l c5807l2 = (C5807l) atomicReference.get();
                c5807l2.getClass();
                this.isPro = c5807l2;
                if (this.crashlytics && ((i == 1 && AbstractC1469l.yandex.loadAd(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) || AbstractC1469l.yandex.loadAd(GLProcessingStuckOnCodecFlushQuirk.class) != null)) {
                    z = true;
                }
                this.subscription = z;
                admob(1);
            } catch (MediaCodec.CodecException e2) {
                throw new C8104l(e2);
            }
        } catch (IOException e3) {
            throw new C8104l(e3);
        } catch (IllegalArgumentException e4) {
            throw new C8104l(e4);
        }
    }

    public final void admob(int i) {
        if (this.f14718throws == i) {
            return;
        }
        AbstractC5088l.yandex(this.yandex, "Transitioning encoder internal state: " + AbstractC9361l.m2637strictfp(this.f14718throws) + " --> " + AbstractC9361l.m2637strictfp(i));
        this.f14718throws = i;
    }

    public final void amazon() {
        Surface surface;
        AbstractC5088l.yandex(this.yandex, "releaseInternal");
        if (this.premium) {
            if (!this.subscription) {
                AbstractC5088l.yandex(this.yandex, "mMediaCodec.stop()");
                this.purchase.stop();
            }
            this.premium = false;
        }
        AbstractC5088l.yandex(this.yandex, "mMediaCodec.release()");
        this.purchase.release();
        InterfaceC0049l interfaceC0049l = this.billing;
        if (interfaceC0049l instanceof C14315l) {
            C14315l c14315l = (C14315l) interfaceC0049l;
            synchronized (c14315l.f28022l) {
                surface = c14315l.f28021l;
                c14315l.f28021l = null;
            }
            if (surface != null) {
                surface.release();
            }
        }
        admob(9);
        this.isPro.loadAd(null);
    }

    public final void billing() {
        this.license = f14717package;
        this.pro = 0L;
        this.metrica.clear();
        this.firebase.clear();
        ArrayDeque arrayDeque = this.smaato;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((C5807l) it.next()).crashlytics();
        }
        arrayDeque.clear();
        String str = this.yandex;
        AbstractC5088l.yandex(str, "mMediaCodec.reset()");
        MediaCodec mediaCodec = this.purchase;
        mediaCodec.reset();
        this.premium = false;
        this.applovin = false;
        this.appmetrica = false;
        this.ad = false;
        ScheduledFuture scheduledFuture = this.isVip;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.isVip = null;
        }
        ScheduledFuture scheduledFuture2 = this.inmobi;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.inmobi = null;
        }
        C18676l c18676l = this.signatures;
        if (c18676l != null) {
            c18676l.isPro = true;
        }
        this.signatures = new C18676l(this);
        AbstractC5088l.yandex(str, "mMediaCodec.setCallback()");
        mediaCodec.setCallback(this.signatures);
        AbstractC5088l.yandex(str, "mMediaCodec.configure()");
        mediaCodec.configure(this.amazon, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC0049l interfaceC0049l = this.billing;
        if (interfaceC0049l instanceof C14315l) {
            C14315l c14315l = (C14315l) interfaceC0049l;
            c14315l.f28020l.purchase.setInputSurface(c14315l.yandex());
        }
    }

    public final void crashlytics(int i, String str, Throwable th) {
        InterfaceC0713l interfaceC0713l;
        Executor executor;
        synchronized (this.loadAd) {
            interfaceC0713l = this.tapsense;
            executor = this.Signature;
        }
        try {
            executor.execute(new RunnableC10613l(interfaceC0713l, i, str, th));
        } catch (RejectedExecutionException e) {
            AbstractC5088l.amazon(this.yandex, "Unable to post to the supplied executor.", e);
        }
    }

    public final long firebase(long j) {
        Rational rational = this.ads;
        if (rational != null && rational.getDenominator() == rational.getNumerator()) {
            return j;
        }
        return Math.round(rational.doubleValue() * j);
    }

    public final void isPro(Runnable runnable) {
        String str = this.yandex;
        AbstractC5088l.yandex(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.vip;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC11356l.admob(((C14722l) it.next()).f28787l));
        }
        HashSet hashSet2 = this.remoteconfig;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(AbstractC11356l.admob(((C3075l) it2.next()).amazon));
        }
        if (!arrayList.isEmpty()) {
            AbstractC5088l.yandex(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        new C13745l(new ArrayList(arrayList), false, AbstractC12272l.yandex()).yandex(new RunnableC10613l(this, arrayList, runnable, 16), this.admob);
    }

    public final void loadAd() {
        while (true) {
            ArrayDeque arrayDeque = this.smaato;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.firebase;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            C5807l c5807l = (C5807l) arrayDeque.poll();
            Objects.requireNonNull(c5807l);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                C3075l c3075l = new C3075l(this, this.purchase, num.intValue());
                if (c5807l.loadAd(c3075l)) {
                    this.remoteconfig.add(c3075l);
                    AbstractC11356l.admob(c3075l.amazon).yandex(new RunnableC0336l(this, c3075l, 12), this.admob);
                } else {
                    C5807l c5807l2 = c3075l.purchase;
                    if (!c3075l.billing.getAndSet(true)) {
                        try {
                            c3075l.yandex.queueInputBuffer(c3075l.loadAd, 0, 0, 0L, 0);
                            c5807l2.loadAd(null);
                        } catch (IllegalStateException e) {
                            c5807l2.amazon(e);
                        }
                    }
                }
            } catch (MediaCodec.CodecException e2) {
                yandex(1, e2.getMessage(), e2);
                return;
            }
        }
    }

    public final void mopub(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        AbstractC5088l.yandex(this.yandex, "mMediaCodec.setParameters - setMediaCodecPaused: " + z);
        this.purchase.setParameters(bundle);
    }

    public final void purchase() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        AbstractC5088l.yandex(this.yandex, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.purchase.setParameters(bundle);
    }

    public final void subs() {
        AbstractC5088l.yandex(this.yandex, "signalCodecStop");
        InterfaceC0049l interfaceC0049l = this.billing;
        int i = 0;
        if (interfaceC0049l instanceof C10398l) {
            ((C10398l) interfaceC0049l).yandex(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.remoteconfig.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC11356l.admob(((C3075l) it.next()).amazon));
            }
            new C13745l(new ArrayList(arrayList), false, AbstractC12272l.yandex()).yandex(new RunnableC5229l(this, i), this.admob);
            return;
        }
        if (interfaceC0049l instanceof C14315l) {
            try {
                if (AbstractC1469l.yandex.loadAd(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    C18676l c18676l = this.signatures;
                    ExecutorC7870l executorC7870l = this.admob;
                    ScheduledFuture scheduledFuture = this.inmobi;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.inmobi = AbstractC12272l.admob().schedule(new RunnableC0336l(executorC7870l, c18676l, 13), 1000L, TimeUnit.MILLISECONDS);
                }
                AbstractC5088l.yandex(this.yandex, "mMediaCodec.signalEndOfInputStream()");
                this.purchase.signalEndOfInputStream();
                this.appmetrica = true;
            } catch (MediaCodec.CodecException e) {
                yandex(1, e.getMessage(), e);
            }
        }
    }

    public final void yandex(int i, String str, Throwable th) {
        switch (AbstractC5020l.inmobi(this.f14718throws)) {
            case 0:
                crashlytics(i, str, th);
                billing();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                admob(8);
                isPro(new RunnableC3088l(this, str, i, th, 0));
                break;
            case 7:
                AbstractC5088l.Signature(this.yandex, "Get more than one error: " + str + "(" + i + ")", th);
                break;
        }
    }
}
