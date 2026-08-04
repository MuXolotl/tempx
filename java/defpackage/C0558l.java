package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: renamed from: lؑۙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0558l {
    public long Signature;
    public long ad;
    public long adcel;
    public final C10350l admob;
    public long ads;
    public long advert;
    public final AudioTrack amazon;
    public final long billing;
    public final long[] crashlytics;
    public long firebase;
    public long isPro;
    public long isVip;
    public long license;
    public final C18527l loadAd;
    public long metrica;
    public final boolean mopub;
    public long premium;
    public long pro;
    public final int purchase;
    public Method remoteconfig;
    public boolean signatures;
    public long smaato;
    public long startapp;
    public float subs;
    public int subscription;
    public int tapsense;
    public long vip;
    public final C16543l yandex;

    public C0558l(C16543l c16543l, C18527l c18527l, AudioTrack audioTrack, int i, int i2, int i3) {
        this.yandex = c16543l;
        this.loadAd = c18527l;
        this.amazon = audioTrack;
        try {
            this.remoteconfig = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.crashlytics = new long[10];
        this.isVip = -9223372036854775807L;
        this.advert = -9223372036854775807L;
        this.admob = new C10350l(audioTrack, c16543l);
        int sampleRate = audioTrack.getSampleRate();
        this.purchase = sampleRate;
        boolean zM3968for = AbstractC15323l.m3968for(i);
        this.mopub = zM3968for;
        this.billing = zM3968for ? AbstractC15323l.m3969goto(sampleRate, i3 / i2) : -9223372036854775807L;
        this.adcel = 0L;
        this.ads = 0L;
        this.signatures = false;
        this.premium = 0L;
        this.Signature = -9223372036854775807L;
        this.license = -9223372036854775807L;
        this.metrica = 0L;
        this.vip = 0L;
        this.subs = 1.0f;
        this.isPro = -9223372036854775807L;
    }

    public final void amazon(long j) {
        long j2 = this.isPro;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jM3975package = AbstractC15323l.m3975package(this.subs, j - j2);
        this.loadAd.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - AbstractC15323l.m3986try(jM3975package);
        this.isPro = -9223372036854775807L;
        C8961l c8961l = ((C4636l) this.yandex.f32482l).isPro;
        c8961l.getClass();
        if (Thread.currentThread() == ((Thread) c8961l.crashlytics)) {
            c8961l.mopub(-1, new C12476l(jCurrentTimeMillis));
        }
    }

    public final long crashlytics() {
        if (this.amazon.getPlayState() == 2) {
            return this.pro;
        }
        this.loadAd.getClass();
        return this.pro + AbstractC15323l.m3970import(AbstractC15323l.appmetrica(this.subs, AbstractC15323l.m3962continue(SystemClock.elapsedRealtime()) - this.Signature), this.purchase, 1000000L, RoundingMode.UP);
    }

    public final long loadAd(long j) {
        long jAppmetrica;
        int i = this.tapsense;
        int i2 = this.purchase;
        if (i == 0) {
            jAppmetrica = this.Signature != -9223372036854775807L ? AbstractC15323l.m3969goto(i2, crashlytics()) : AbstractC15323l.m3969goto(i2, yandex());
        } else {
            jAppmetrica = AbstractC15323l.appmetrica(this.subs, j + this.firebase);
        }
        long jMax = Math.max(0L, jAppmetrica - this.vip);
        return this.Signature != -9223372036854775807L ? Math.min(AbstractC15323l.m3969goto(i2, this.ad), jMax) : jMax;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    public final long yandex() {
        long j;
        if (this.Signature != -9223372036854775807L) {
            return Math.min(this.ad, crashlytics());
        }
        this.loadAd.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.startapp >= 5) {
            AudioTrack audioTrack = this.amazon;
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.adcel;
                    if (j > playbackHeadPosition) {
                        if (this.signatures) {
                            this.premium += j;
                            this.signatures = false;
                        } else {
                            this.ads++;
                        }
                    }
                    this.adcel = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.adcel <= 0 || playState != 3) {
                    this.license = -9223372036854775807L;
                    j = this.adcel;
                    if (j > playbackHeadPosition) {
                        if (this.signatures) {
                            this.premium += j;
                            this.signatures = false;
                        } else {
                            this.ads++;
                        }
                    }
                    this.adcel = playbackHeadPosition;
                } else if (this.license == -9223372036854775807L) {
                    this.license = jElapsedRealtime;
                }
            }
            this.startapp = jElapsedRealtime;
        }
        return this.adcel + this.premium + (this.ads << 32);
    }
}
