package defpackage;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؔۡؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2963l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f6447l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7025l f6448l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6449l;

    public /* synthetic */ RunnableC2963l(C7025l c7025l, long j, int i) {
        this.f6449l = i;
        this.f6448l = c7025l;
        this.f6447l = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6449l) {
            case 0:
                C7025l c7025l = this.f6448l;
                long j = this.f6447l;
                switch (AbstractC5020l.inmobi(c7025l.f14718throws)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        break;
                    case 1:
                        AbstractC5088l.yandex(c7025l.yandex, "Pause on ".concat(AbstractC16181l.billing(j)));
                        c7025l.metrica.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        c7025l.admob(3);
                        break;
                    case 4:
                        c7025l.admob(6);
                        break;
                    case 6:
                    case 8:
                        C8339l.smaato("Encoder is released");
                        break;
                    default:
                        C8339l.smaato("Unknown state: ".concat(AbstractC9361l.m2637strictfp(c7025l.f14718throws)));
                        break;
                }
                break;
            case 1:
                C7025l c7025l2 = this.f6448l;
                long j2 = this.f6447l;
                switch (AbstractC5020l.inmobi(c7025l2.f14718throws)) {
                    case 0:
                        c7025l2.advert = null;
                        AbstractC5088l.yandex(c7025l2.yandex, "Start on ".concat(AbstractC16181l.billing(j2)));
                        try {
                            if (c7025l2.premium) {
                                c7025l2.billing();
                            }
                            c7025l2.license = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                            AbstractC5088l.yandex(c7025l2.yandex, "mMediaCodec.start()");
                            c7025l2.purchase.start();
                            InterfaceC0049l interfaceC0049l = c7025l2.billing;
                            if (interfaceC0049l instanceof C10398l) {
                                ((C10398l) interfaceC0049l).yandex(true);
                            }
                            c7025l2.admob(2);
                        } catch (MediaCodec.CodecException e) {
                            c7025l2.yandex(1, e.getMessage(), e);
                            return;
                        }
                        break;
                    case 1:
                    case 4:
                    case 7:
                        break;
                    case 2:
                        c7025l2.advert = null;
                        Range range = (Range) c7025l2.metrica.removeLast();
                        AbstractC5641l.purchase("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l = (Long) range.getLower();
                        long jLongValue = l.longValue();
                        c7025l2.metrica.addLast(Range.create(l, Long.valueOf(j2)));
                        AbstractC5088l.yandex(c7025l2.yandex, "Resume on " + AbstractC16181l.billing(j2) + "\nPaused duration = " + AbstractC16181l.billing(j2 - jLongValue));
                        if ((c7025l2.crashlytics || AbstractC1469l.yandex.loadAd(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!c7025l2.crashlytics || AbstractC1469l.yandex.loadAd(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            c7025l2.mopub(false);
                            InterfaceC0049l interfaceC0049l2 = c7025l2.billing;
                            if (interfaceC0049l2 instanceof C10398l) {
                                ((C10398l) interfaceC0049l2).yandex(true);
                            }
                        }
                        if (c7025l2.crashlytics) {
                            c7025l2.purchase();
                        }
                        c7025l2.admob(2);
                        break;
                    case 3:
                    case 5:
                        c7025l2.admob(5);
                        break;
                    case 6:
                    case 8:
                        C8339l.smaato("Encoder is released");
                        break;
                    default:
                        C8339l.smaato("Unknown state: ".concat(AbstractC9361l.m2637strictfp(c7025l2.f14718throws)));
                        break;
                }
                break;
            default:
                C7025l c7025l3 = this.f6448l;
                long j3 = this.f6447l;
                String str = c7025l3.yandex;
                switch (AbstractC5020l.inmobi(c7025l3.f14718throws)) {
                    case 0:
                    case 3:
                    case 7:
                        break;
                    case 1:
                    case 2:
                        int i = c7025l3.f14718throws;
                        int i2 = 4;
                        c7025l3.admob(4);
                        Long l2 = (Long) c7025l3.license.getLower();
                        long jLongValue2 = l2.longValue();
                        if (jLongValue2 == Long.MAX_VALUE) {
                            C8339l.subs("There should be a \"start\" before \"stop\"");
                        } else if (j3 < jLongValue2) {
                            C8339l.subs("The start time should be before the stop time.");
                        } else {
                            c7025l3.license = Range.create(l2, Long.valueOf(j3));
                            AbstractC5088l.yandex(str, "Stop on ".concat(AbstractC16181l.billing(j3)));
                            if (i == 3 && c7025l3.advert != null) {
                                c7025l3.subs();
                            } else {
                                c7025l3.ad = true;
                                c7025l3.isVip = AbstractC12272l.admob().schedule(new RunnableC5229l(c7025l3, i2), 1000L, TimeUnit.MILLISECONDS);
                            }
                        }
                        break;
                    case 4:
                    case 5:
                        c7025l3.admob(1);
                        break;
                    case 6:
                    case 8:
                        C8339l.smaato("Encoder is released");
                        break;
                    default:
                        C8339l.smaato("Unknown state: ".concat(AbstractC9361l.m2637strictfp(c7025l3.f14718throws)));
                        break;
                }
                break;
        }
    }
}
