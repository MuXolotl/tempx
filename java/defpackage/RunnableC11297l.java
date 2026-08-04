package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.subs;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: lُۙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC11297l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22769l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22770l;

    public /* synthetic */ RunnableC11297l(C0477l c0477l, C9087l c9087l) {
        this.f22770l = 6;
        this.f22769l = c9087l;
    }

    private final void amazon() {
        synchronized (((AbstractServiceC3639l) this.f22769l).f7615l) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d A[Catch: all -> 0x0021, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001b, B:15:0x0027, B:19:0x002d, B:25:0x003a, B:27:0x003e, B:29:0x0044, B:31:0x004e, B:33:0x0058, B:35:0x0069, B:34:0x005d, B:36:0x006b, B:38:0x007f, B:40:0x0087), top: B:48:0x0017 }] */
    private final void billing() {
        String strSubs;
        TelephonyManager telephonyManager;
        C6939l c6939l = (C6939l) this.f22769l;
        C18516l c18516l = (C18516l) c6939l.yandex.get();
        if (c18516l != null) {
            int iAds = c6939l.crashlytics.ads();
            C7713l c7713l = c18516l.yandex;
            synchronized (c7713l) {
                int i = c7713l.vip;
                if (i == 0 || c7713l.purchase) {
                    if (i != iAds || c7713l.metrica == null) {
                        c7713l.vip = iAds;
                        if (iAds != 1 && iAds != 0 && iAds != 8) {
                            if (c7713l.metrica == null) {
                                Context context = c7713l.yandex;
                                String str = AbstractC15323l.yandex;
                                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                    strSubs = AbstractC11452l.subs(Locale.getDefault().getCountry());
                                } else {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        strSubs = AbstractC11452l.subs(Locale.getDefault().getCountry());
                                    } else {
                                        strSubs = AbstractC11452l.subs(networkCountryIso);
                                    }
                                }
                                c7713l.metrica = strSubs;
                            }
                            c7713l.smaato = c7713l.yandex(iAds);
                            c7713l.amazon.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            c7713l.loadAd(c7713l.mopub > 0 ? (int) (jElapsedRealtime - c7713l.admob) : 0, c7713l.subs, c7713l.smaato);
                            c7713l.admob = jElapsedRealtime;
                            c7713l.subs = 0L;
                            c7713l.firebase = 0L;
                            c7713l.isPro = 0L;
                            C13052l c13052l = c7713l.billing;
                            ((ArrayList) c13052l.purchase).clear();
                            c13052l.yandex = -1;
                            c13052l.loadAd = 0;
                            c13052l.crashlytics = 0;
                        }
                    }
                }
            }
        }
    }

    private final void crashlytics() {
        C15615l c15615l = (C15615l) this.f22769l;
        if (((C5762l) c15615l.f30481l) != null) {
            c15615l.appmetrica();
            C15974l c15974l = (C15974l) c15615l.f30482l;
            Set<C7381l> setKeySet = (HashSet) c15615l.f30485l;
            synchronized (c15974l.yandex) {
                if (setKeySet == null) {
                    try {
                        setKeySet = c15974l.loadAd.keySet();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (C7381l c7381l : setKeySet) {
                    if (c15974l.loadAd.containsKey(c7381l)) {
                        c15974l.remoteconfig((C7930l) c15974l.loadAd.get(c7381l));
                    }
                }
            }
        }
    }

    private final void loadAd() {
        C15629l c15629l = (C15629l) this.f22769l;
        synchronized (c15629l.f30557l) {
            try {
                c15629l.f30556l = null;
                InterfaceC11792l interfaceC11792l = c15629l.f30555l;
                if (interfaceC11792l != null) {
                    c15629l.f30555l = null;
                    c15629l.purchase(interfaceC11792l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void purchase() {
        C15404l c15404l = (C15404l) this.f22769l;
        synchronized (c15404l.f30096l) {
            try {
                C17954l c17954l = c15404l.f30102l;
                if (c17954l != null) {
                    c17954l.yandex();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void yandex() {
        C10535l c10535l = (C10535l) this.f22769l;
        synchronized (c10535l.f21439l) {
            try {
                if (c10535l.f21435l == null) {
                    return;
                }
                try {
                    C5882l c5882lCrashlytics = c10535l.crashlytics();
                    int i = c5882lCrashlytics.billing;
                    if (i == 2) {
                        synchronized (c10535l.f21439l) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        Method method = AbstractC14366l.loadAd;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        C9912l c9912l = c10535l.f21433l;
                        Context context = c10535l.f21437l;
                        c9912l.getClass();
                        C5882l[] c5882lArr = {c5882lCrashlytics};
                        AbstractC2133l abstractC2133l = AbstractC7618l.yandex;
                        Trace.beginSection("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceAmazon = AbstractC7618l.yandex.amazon(context, c5882lArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferPurchase = AbstractC1383l.purchase(c10535l.f21437l, c5882lCrashlytics.yandex);
                            if (mappedByteBufferPurchase == null || typefaceAmazon == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                C12014l c12014l = new C12014l(typefaceAmazon, AbstractC14205l.billing(mappedByteBufferPurchase));
                                Trace.endSection();
                                Trace.endSection();
                                synchronized (c10535l.f21439l) {
                                    try {
                                        AbstractC15422l abstractC15422l = c10535l.f21435l;
                                        if (abstractC15422l != null) {
                                            abstractC15422l.billing(c12014l);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                c10535l.yandex();
                            } catch (Throwable th2) {
                                Method method2 = AbstractC14366l.loadAd;
                                Trace.endSection();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Method method3 = AbstractC14366l.loadAd;
                        Trace.endSection();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    synchronized (c10535l.f21439l) {
                        try {
                            AbstractC15422l abstractC15422l2 = c10535l.f21435l;
                            if (abstractC15422l2 != null) {
                                abstractC15422l2.purchase(th5);
                            }
                            c10535l.yandex();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22770l) {
            case 0:
                ((C14000l) this.f22769l).admob.applovin();
                return;
            case 1:
                C0602l c0602l = (C0602l) this.f22769l;
                boolean zIsPopupShowing = c0602l.admob.isPopupShowing();
                c0602l.subscription(zIsPopupShowing);
                c0602l.remoteconfig = zIsPopupShowing;
                return;
            case 2:
                C0284l c0284l = (C0284l) this.f22769l;
                c0284l.f1305l = true;
                c0284l.crashlytics();
                return;
            case 3:
                C0376l c0376l = (C0376l) ((C11644l) this.f22769l).f23360l;
                if (c0376l != null) {
                    Iterator it = c0376l.values().iterator();
                    while (it.hasNext()) {
                        ((C3716l) it.next()).crashlytics();
                    }
                    return;
                }
                return;
            case 4:
                ((C18676l) this.f22769l).loadAd();
                return;
            case 5:
                C17804l c17804l = (C17804l) this.f22769l;
                Context context = c17804l.f34713l;
                String str = AbstractC15323l.yandex;
                int iGenerateAudioSessionId = AbstractC13950l.vip(context).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                C1080l c1080l = c17804l.f34703l;
                if (((Integer) c1080l.tapsense()).intValue() != iGenerateAudioSessionId) {
                    c1080l.m787catch(Integer.valueOf(iGenerateAudioSessionId));
                    c17804l.m4417l(1, 10, Integer.valueOf(iGenerateAudioSessionId));
                    c17804l.m4417l(2, 10, Integer.valueOf(iGenerateAudioSessionId));
                    return;
                }
                return;
            case 6:
                C9087l c9087l = (C9087l) this.f22769l;
                try {
                    synchronized (c9087l) {
                    }
                    try {
                        c9087l.yandex.yandex(c9087l.crashlytics, c9087l.amazon);
                        return;
                    } finally {
                        c9087l.yandex(true);
                    }
                } catch (C17361l e) {
                    AbstractC6427l.subs("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    C11467l.metrica(e);
                    return;
                }
            case 7:
                yandex();
                return;
            case 8:
                Iterator it2 = ((C13734l) this.f22769l).vip.iterator();
                if (it2.hasNext()) {
                    throw AbstractC15560l.adcel(it2);
                }
                return;
            case 9:
                ((C17646l) this.f22769l).smaato();
                return;
            case 10:
                ((C5501l) this.f22769l).m1812l();
                return;
            case 11:
                loadAd();
                return;
            case 12:
                ((AbstractC9694l) this.f22769l).mo782this();
                return;
            case 13:
                crashlytics();
                return;
            case 14:
                subs subsVar = ((AbstractC11519l) this.f22769l).f23165l;
                (subsVar != null ? subsVar : null).isPro();
                return;
            case 15:
                InterfaceC7042l interfaceC7042l = (InterfaceC7042l) this.f22769l;
                if (interfaceC7042l != null) {
                    interfaceC7042l.ads(null);
                    return;
                }
                return;
            case 16:
                ((C10322l) this.f22769l).amazon();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C10218l c10218l = (C10218l) this.f22769l;
                c10218l.setArtwork(c10218l.f20813l);
                c10218l.f20821l = true;
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C16811l) this.f22769l).release();
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C1636l) this.f22769l).vip = -1;
                return;
            case 20:
                ((C15014l) this.f22769l).loadAd();
                return;
            case 21:
                amazon();
                return;
            case 22:
                purchase();
                return;
            case 23:
                billing();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C14600l) this.f22769l).remoteconfig--;
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C0527l) this.f22769l).adcel();
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C10854l c10854l = (C10854l) this.f22769l;
                C5268l c5268l = c10854l.f21946l;
                if (c10854l.f21942l == 0) {
                    c10854l.f21939l = true;
                    c5268l.purchase(EnumC14812l.ON_PAUSE);
                }
                if (c10854l.f21943l == 0 && c10854l.f21939l) {
                    c5268l.purchase(EnumC14812l.ON_STOP);
                    c10854l.f21945l = true;
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC5833l.amazon((View) ((C12823l) this.f22769l).f25199l);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C17651l c17651l = (C17651l) ((C18396l) this.f22769l).f35933l;
                if (c17651l.f34334l) {
                    return;
                }
                AbstractC5088l.yandex("Recorder", "Retry setupVideo #" + c17651l.f34336l);
                C15691l c15691l = (C15691l) c17651l.f34339l;
                EnumC8920l enumC8920l = (EnumC8920l) c17651l.f34338l;
                C3551l c3551l = (C3551l) c17651l.f34335l;
                c3551l.ads().yandex(new RunnableC15278l(c17651l, c15691l, enumC8920l, 3), c3551l.amazon);
                return;
            default:
                C15119l.setRippleState$lambda$1((C15119l) this.f22769l);
                return;
        }
    }

    public /* synthetic */ RunnableC11297l(int i, Object obj) {
        this.f22770l = i;
        this.f22769l = obj;
    }
}
