package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import j$.util.Objects;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: renamed from: lْٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4856l implements InterfaceC17193l {
    public C8193l admob;
    public final C3316l amazon;
    public C8961l billing;
    public final InterfaceC13100l crashlytics;
    public Context firebase;
    public Looper isPro;
    public final C14823l loadAd;
    public C18527l mopub;
    public final float purchase;
    public C17274l subs;
    public final Context yandex;

    public C4856l(C1796l c1796l) {
        Context context = (Context) c1796l.loadAd;
        this.yandex = context;
        InterfaceC13100l interfaceC13100l = (InterfaceC13100l) c1796l.crashlytics;
        interfaceC13100l.getClass();
        this.crashlytics = interfaceC13100l;
        this.loadAd = (C14823l) c1796l.amazon;
        this.admob = (C8193l) c1796l.purchase;
        this.amazon = context == null ? null : new C3316l(4, this);
        this.purchase = c1796l.yandex;
        this.mopub = C18527l.yandex;
    }

    public final void amazon() {
        C3582l c3582l;
        C8961l c8961l = this.billing;
        if (c8961l != null) {
            c8961l.amazon();
        }
        C17274l c17274l = this.subs;
        if (c17274l != null) {
            Context context = (Context) c17274l.loadAd;
            if (c17274l.yandex) {
                c17274l.subs = null;
                AbstractC13950l.vip(context).unregisterAudioDeviceCallback((C2088l) c17274l.purchase);
                if (Build.VERSION.SDK_INT >= 32 && (c3582l = (C3582l) c17274l.admob) != null) {
                    c3582l.purchase();
                    c17274l.admob = null;
                }
                context.unregisterReceiver((C13773l) c17274l.billing);
                C10986l c10986l = (C10986l) c17274l.mopub;
                if (c10986l != null) {
                    c10986l.yandex.unregisterContentObserver(c10986l);
                }
                c17274l.yandex = false;
            }
        }
    }

    public final void billing() {
        if (this.yandex == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.isPro;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.isPro = looperMyLooper;
        } else {
            C8339l.smaato(AbstractC11028l.smaato("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }

    public final C17953l crashlytics(C5402l c5402l) throws C10699l {
        int iIntValue;
        int iLicense;
        boolean z;
        char c;
        boolean z2;
        int iIsPro;
        int i;
        int iCrashlytics;
        C5978l c5978l = c5402l.yandex;
        boolean z3 = c5402l.purchase;
        boolean z4 = c5402l.amazon;
        C13736l c13736l = c5402l.loadAd;
        purchase(c5402l);
        String str = c5978l.metrica;
        int i2 = c5978l.f12622synchronized;
        int iIntValue2 = c5978l.f12621strictfp;
        int i3 = c5978l.f12619package;
        if (Objects.equals(str, "audio/raw")) {
            AbstractC12442l.admob(AbstractC15323l.m3968for(iIntValue2));
            iIntValue = AbstractC15323l.Signature(i3);
            iLicense = AbstractC15323l.license(iIntValue2) * i3;
            z = false;
            c = 0;
        } else {
            C15934l c15934lYandex = z3 ? ((C15289l) this.crashlytics).yandex(c13736l, c5978l) : C15934l.amazon;
            if (z3 && c15934lYandex.yandex) {
                str.getClass();
                int iCrashlytics2 = AbstractC3825l.crashlytics(str, c5978l.firebase);
                int iSignature = AbstractC15323l.Signature(i3);
                z = c15934lYandex.loadAd;
                iLicense = -1;
                c = 1;
                iIntValue2 = iCrashlytics2;
                iIntValue = iSignature;
                z4 = true;
            } else {
                Pair pairCrashlytics = this.admob.crashlytics(c13736l, c5978l);
                if (pairCrashlytics == null) {
                    throw new C10699l("Unable to configure passthrough for: " + c5978l);
                }
                iIntValue2 = ((Integer) pairCrashlytics.first).intValue();
                iIntValue = ((Integer) pairCrashlytics.second).intValue();
                iLicense = -1;
                z = false;
                c = 2;
            }
        }
        int i4 = c5978l.isPro;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i4 == -1) {
            i4 = 768000;
        }
        int iMax = c5402l.subs;
        if (iMax != -1) {
            z2 = true;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i2, iIntValue, iIntValue2);
            AbstractC12442l.subscription(minBufferSize != -2);
            if (iLicense == -1) {
                iLicense = 1;
            }
            double d = z4 ? this.purchase : 1.0d;
            this.loadAd.getClass();
            if (c == 0) {
                z2 = true;
                long j = i2;
                long j2 = 250000 * j;
                long j3 = iLicense;
                iIsPro = AbstractC15323l.isPro(minBufferSize * 4, AbstractC9966l.loadAd((j2 * j3) / 1000000), AbstractC9966l.loadAd(((750000 * j) * j3) / 1000000));
            } else if (c == 1) {
                z2 = true;
                int iCrashlytics3 = AbstractC0377l.crashlytics(iIntValue2);
                AbstractC12442l.subscription(iCrashlytics3 != -2147483647);
                iIsPro = AbstractC9966l.loadAd((50000000 * ((long) iCrashlytics3)) / 1000000);
            } else {
                if (c != 2) {
                    C11983l.crashlytics();
                    return null;
                }
                z2 = true;
                if (iIntValue2 == 5) {
                    i = 500000;
                } else {
                    i = iIntValue2 == 8 ? 1000000 : 250000;
                }
                if (i4 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iCrashlytics = AbstractC10464l.mopub(i4, 8);
                } else {
                    iCrashlytics = AbstractC0377l.crashlytics(iIntValue2);
                    AbstractC12442l.subscription(iCrashlytics != -2147483647);
                }
                iIsPro = AbstractC9966l.loadAd((((long) i) * ((long) iCrashlytics)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) iIsPro) * d)) + iLicense) - 1) / iLicense) * iLicense;
        }
        C0734l c0734l = new C0734l();
        C13736l c13736l2 = C13736l.subs;
        c0734l.subs = -1;
        c0734l.loadAd = i2;
        c0734l.crashlytics = iIntValue;
        c0734l.yandex = iIntValue2;
        c0734l.billing = iMax;
        c0734l.admob = c5402l.billing;
        c0734l.mopub = c13736l;
        boolean z5 = z2;
        c0734l.purchase = c == z5 ? z5 : false;
        c0734l.amazon = c5402l.admob;
        c0734l.isPro = z4;
        c0734l.firebase = z;
        c0734l.subs = c5402l.mopub;
        return new C17953l(c0734l);
    }

    public final C1608l loadAd(C5402l c5402l) {
        purchase(c5402l);
        C5978l c5978l = c5402l.yandex;
        C13736l c13736l = c5402l.loadAd;
        C15934l c15934lYandex = ((C15289l) this.crashlytics).yandex(c13736l, c5978l);
        C4839l c4839l = new C4839l();
        String str = c5978l.metrica;
        int i = c5978l.f12621strictfp;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.admob.crashlytics(c13736l, c5978l) != null : i == 2) {
            i2 = 2;
        }
        c4839l.yandex = i2;
        c4839l.loadAd = c15934lYandex.yandex;
        c4839l.crashlytics = c15934lYandex.loadAd;
        c4839l.amazon = c15934lYandex.crashlytics;
        return c4839l.yandex();
    }

    public final void purchase(C5402l c5402l) {
        Context context;
        C8193l c8193lLoadAd;
        AudioDeviceInfo audioDeviceInfo = c5402l.crashlytics;
        C13736l c13736l = c5402l.loadAd;
        billing();
        C17274l c17274l = this.subs;
        if (c17274l == null && (context = this.yandex) != null) {
            C17274l c17274l2 = new C17274l(context, new C2683l(6, this), c13736l, audioDeviceInfo);
            this.subs = c17274l2;
            Handler handler = (Handler) c17274l2.amazon;
            Context context2 = (Context) c17274l2.loadAd;
            if (c17274l2.yandex) {
                c8193lLoadAd = (C8193l) c17274l2.subs;
                c8193lLoadAd.getClass();
            } else {
                c17274l2.yandex = true;
                C10986l c10986l = (C10986l) c17274l2.mopub;
                if (c10986l != null) {
                    c10986l.yandex.registerContentObserver(c10986l.loadAd, false, c10986l);
                }
                AbstractC13950l.vip(context2).registerAudioDeviceCallback((C2088l) c17274l2.purchase, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((C3582l) c17274l2.admob) == null) {
                    c17274l2.admob = new C3582l(context2, new RunnableC16112l(7, c17274l2), Boolean.valueOf(AbstractC15323l.m3964else(context2)));
                }
                c8193lLoadAd = C8193l.loadAd(context2, context2.registerReceiver((C13773l) c17274l2.billing, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (C13736l) c17274l2.firebase, (AudioDeviceInfo) c17274l2.isPro, c17274l2.purchase());
                c17274l2.subs = c8193lLoadAd;
            }
            this.admob = c8193lLoadAd;
        } else if (c17274l != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) c17274l.isPro)) {
                c17274l.isPro = audioDeviceInfo;
                Context context3 = (Context) c17274l.loadAd;
                C13736l c13736l2 = (C13736l) c17274l.firebase;
                List listPurchase = c17274l.purchase();
                C13708l c13708l = C8193l.purchase;
                c17274l.billing(C8193l.loadAd(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c13736l2, audioDeviceInfo, listPurchase));
            }
            C17274l c17274l3 = this.subs;
            if (!Objects.equals(c13736l, (C13736l) c17274l3.firebase)) {
                c17274l3.firebase = c13736l;
                Context context4 = (Context) c17274l3.loadAd;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) c17274l3.isPro;
                List listPurchase2 = c17274l3.purchase();
                C13708l c13708l2 = C8193l.purchase;
                c17274l3.billing(C8193l.loadAd(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c13736l, audioDeviceInfo2, listPurchase2));
            }
        }
        this.admob.getClass();
    }

    public final C4636l yandex(C17953l c17953l) throws C1210l {
        Context context;
        Context context2;
        try {
            int i = c17953l.admob;
            int i2 = c17953l.subs;
            if (i2 == -1 || (context2 = this.yandex) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.firebase;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.firebase = context2.createDeviceContext(i2);
                }
                context = this.firebase;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c17953l.amazon ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c17953l.mopub.crashlytics()).setAudioFormat(new AudioFormat.Builder().setSampleRate(c17953l.loadAd).setChannelMask(c17953l.crashlytics).setEncoding(c17953l.yandex).build()).setTransferMode(1).setBufferSizeInBytes(c17953l.billing).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(c17953l.purchase);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack audioTrackBuild = sessionId.build();
                if (audioTrackBuild.getState() == 1) {
                    return new C4636l(audioTrackBuild, c17953l, this.amazon, this.purchase, this.mopub);
                }
                try {
                    audioTrackBuild.release();
                } catch (Exception unused) {
                }
                throw new C1210l();
            } catch (IllegalArgumentException e) {
                e = e;
                throw new C1210l(e);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }
}
