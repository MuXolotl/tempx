package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lؑٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0336l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f1384l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f1385l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1386l;

    public /* synthetic */ RunnableC0336l(Object obj, Object obj2, int i) {
        this.f1386l = i;
        this.f1385l = obj;
        this.f1384l = obj2;
    }

    private final void yandex() {
        InterfaceC0713l interfaceC0713l;
        Executor executor;
        C18676l c18676l = (C18676l) this.f1385l;
        MediaFormat mediaFormat = (MediaFormat) this.f1384l;
        boolean z = c18676l.isPro;
        C7025l c7025l = c18676l.smaato;
        if (z) {
            AbstractC5088l.tapsense(c7025l.yandex, "Receives onOutputFormatChanged after codec is reset.");
            return;
        }
        switch (AbstractC5020l.inmobi(c7025l.f14718throws)) {
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
                    C7025l c7025l2 = c18676l.smaato;
                    interfaceC0713l = c7025l2.tapsense;
                    executor = c7025l2.Signature;
                    break;
                }
                try {
                    executor.execute(new RunnableC11992l(interfaceC0713l, mediaFormat));
                    return;
                } catch (RejectedExecutionException e) {
                    AbstractC5088l.amazon(c18676l.smaato.yandex, "Unable to post to the supplied executor.", e);
                    return;
                }
            default:
                C8339l.smaato("Unknown state: ".concat(AbstractC9361l.m2637strictfp(c18676l.smaato.f14718throws)));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AudioManager audioManager;
        int i;
        boolean z;
        int i2 = 2;
        int i3 = 3;
        int i4 = 0;
        int i5 = 1;
        switch (this.f1386l) {
            case 0:
                C7115l c7115l = (C7115l) this.f1385l;
                C5978l c5978l = (C5978l) this.f1384l;
                C17339l c17339l = c7115l.f14900l;
                if (c17339l.f33690l == 0 || c7115l.f14897l) {
                    return;
                }
                Looper looper = c17339l.f33687l;
                looper.getClass();
                c7115l.f14898l = c17339l.loadAd(looper, c7115l.f14899l, c5978l, false);
                c17339l.f33678l.add(c7115l);
                return;
            case 1:
                C16456l c16456l = (C16456l) this.f1385l;
                Uri uri = (Uri) this.f1384l;
                c16456l.f32170l = false;
                c16456l.amazon(uri);
                return;
            case 2:
                ((ViewGroup) this.f1385l).endViewTransition(null);
                throw null;
            case 3:
                C10111l c10111l = (C10111l) this.f1385l;
                Context context = (Context) this.f1384l;
                ((C1080l) c10111l.f20589l).getClass();
                String str = AbstractC15323l.yandex;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch") && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                    c10111l.f20587l = audioManager;
                    C2088l c2088l = new C2088l(i5, c10111l);
                    c10111l.f20586l = c2088l;
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    audioManager.registerAudioDeviceCallback(c2088l, new Handler(looperMyLooper));
                    ((C1080l) c10111l.f20589l).m787catch(Boolean.valueOf(c10111l.subscription()));
                    return;
                }
                return;
            case 4:
                C14677l.loadAd((C14677l) this.f1385l, (Context) this.f1384l);
                return;
            case 5:
                C8857l c8857l = (C8857l) this.f1385l;
                C3214l c3214l = (C3214l) this.f1384l;
                Surface surfaceBilling = c3214l.billing(c8857l.f18207l, new C4143l(c8857l, c3214l, i2));
                c8857l.f18211l.firebase(surfaceBilling);
                c8857l.f18209l.put(c3214l, surfaceBilling);
                return;
            case 6:
                final C8857l c8857l2 = (C8857l) this.f1385l;
                final C15691l c15691l = (C15691l) this.f1384l;
                c8857l2.f18215l++;
                C10628l c10628l = c8857l2.f18211l;
                AbstractC6123l.amazon((AtomicBoolean) c10628l.f21563l, true);
                AbstractC6123l.crashlytics((Thread) c10628l.f21569l);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(c10628l.f21567l);
                Size size = c15691l.loadAd;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                ScheduledExecutorServiceC10335l scheduledExecutorServiceC10335l = c8857l2.f18207l;
                c15691l.loadAd(scheduledExecutorServiceC10335l, new C5131l(c8857l2, c15691l, 16));
                c15691l.yandex(surface, scheduledExecutorServiceC10335l, new InterfaceC13241l() { // from class: lؖؕۥ
                    @Override // defpackage.InterfaceC13241l
                    public final void accept(Object obj) {
                        C8857l c8857l3 = c8857l2;
                        C15691l c15691l2 = c15691l;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        synchronized (c15691l2.yandex) {
                            c15691l2.metrica = null;
                            c15691l2.startapp = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        c8857l3.f18215l--;
                        c8857l3.crashlytics();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(c8857l2, c8857l2.f18214l);
                return;
            case 7:
                ((C14000l) ((C0458l) this.f1385l).f1690l).admob.billing((C15074l) this.f1384l);
                return;
            case 8:
                AbstractC0958l abstractC0958l = (AbstractC0958l) this.f1385l;
                String str2 = (String) this.f1384l;
                try {
                    abstractC0958l.purchase.get();
                    abstractC0958l.purchase(AbstractC0958l.remoteconfig.decrementAndGet(), AbstractC0958l.smaato.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    AbstractC5088l.crashlytics("DeferrableSurface", "Unexpected surface termination for " + abstractC0958l + "\nStack Trace:\n" + str2);
                    synchronized (abstractC0958l.yandex) {
                        try {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC0958l, Boolean.valueOf(abstractC0958l.crashlytics), Integer.valueOf(abstractC0958l.loadAd)), e);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            case 9:
                Callable callable = (Callable) this.f1385l;
                ScheduledFutureC0975l scheduledFutureC0975l = (ScheduledFutureC0975l) ((C5138l) this.f1384l).f11181l;
                try {
                    scheduledFutureC0975l.isPro(callable.call());
                    return;
                } catch (Exception e2) {
                    scheduledFutureC0975l.firebase(e2);
                    return;
                }
            case 10:
                C0284l c0284l = (C0284l) this.f1385l;
                C15691l c15691l2 = (C15691l) this.f1384l;
                c0284l.f1302l++;
                C5133l c5133l = c0284l.f1300l;
                boolean z2 = c15691l2.billing;
                Size size2 = c15691l2.loadAd;
                AbstractC6123l.amazon((AtomicBoolean) c5133l.f21563l, true);
                AbstractC6123l.crashlytics((Thread) c5133l.f21569l);
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(z2 ? c5133l.f11170l : c5133l.f11169l);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                Surface surface2 = new Surface(surfaceTexture2);
                c15691l2.yandex(surface2, c0284l.f1296l, new C14590l(c0284l, surfaceTexture2, surface2, i4));
                if (z2) {
                    c0284l.f1304l = surfaceTexture2;
                    return;
                } else {
                    c0284l.f1301l = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(c0284l, c0284l.f1303l);
                    return;
                }
            case 11:
                C0284l c0284l2 = (C0284l) this.f1385l;
                C3214l c3214l2 = (C3214l) this.f1384l;
                Surface surfaceBilling2 = c3214l2.billing(c0284l2.f1296l, new C4143l(c0284l2, c3214l2, i3));
                c0284l2.f1300l.firebase(surfaceBilling2);
                c0284l2.f1298l.put(c3214l2, surfaceBilling2);
                return;
            case 12:
                ((C7025l) this.f1385l).remoteconfig.remove((C3075l) this.f1384l);
                return;
            case 13:
                Executor executor = (Executor) this.f1385l;
                C18676l c18676l = (C18676l) this.f1384l;
                Objects.requireNonNull(c18676l);
                executor.execute(new RunnableC11297l(4, c18676l));
                return;
            case 14:
                ((C7025l) this.f1385l).smaato.remove((C5807l) this.f1384l);
                return;
            case 15:
                ((InterfaceC15984l) ((Map.Entry) this.f1385l).getKey()).yandex((EnumC2467l) this.f1384l);
                return;
            case 16:
                C10398l c10398l = (C10398l) this.f1385l;
                InterfaceC15984l interfaceC15984l = (InterfaceC15984l) this.f1384l;
                LinkedHashMap linkedHashMap = c10398l.f21220l;
                interfaceC15984l.getClass();
                linkedHashMap.remove(interfaceC15984l);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C5807l) this.f1384l).loadAd(((C10398l) this.f1385l).f21219l);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((InterfaceC15984l) this.f1385l).yandex((EnumC2467l) this.f1384l);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C18676l c18676l2 = (C18676l) this.f1385l;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f1384l;
                C7025l c7025l = c18676l2.smaato;
                switch (AbstractC5020l.inmobi(c7025l.f14718throws)) {
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
                        c7025l.yandex(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        C8339l.smaato("Unknown state: ".concat(AbstractC9361l.m2637strictfp(c7025l.f14718throws)));
                        return;
                }
            case 20:
                yandex();
                return;
            case 21:
                ((InterfaceC0713l) this.f1385l).mo670continue((C14722l) this.f1384l);
                return;
            case 22:
                C17804l c17804l = (C17804l) this.f1385l;
                C5453l c5453l = (C5453l) this.f1384l;
                int i6 = c17804l.f34692l - c5453l.loadAd;
                c17804l.f34692l = i6;
                if (c5453l.purchase) {
                    c17804l.f34675l = c5453l.crashlytics;
                    c17804l.f34690l = true;
                }
                if (i6 == 0) {
                    AbstractC10759l abstractC10759l = ((C10749l) c5453l.billing).yandex;
                    int iMo2761implements = -1;
                    if (!c17804l.f34691l.yandex.startapp() && abstractC10759l.startapp()) {
                        c17804l.f34706l = -1;
                        c17804l.f34679l = 0L;
                    }
                    if (!abstractC10759l.startapp()) {
                        List listAsList = Arrays.asList(((C12164l) abstractC10759l).firebase);
                        AbstractC12442l.subscription(listAsList.size() == c17804l.f34693l.size());
                        for (int i7 = 0; i7 < listAsList.size(); i7++) {
                            ((C14986l) c17804l.f34693l.get(i7)).crashlytics = (AbstractC10759l) listAsList.get(i7);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (c17804l.f34690l) {
                        boolean z3 = ((C10749l) c5453l.billing).yandex.startapp() && c17804l.f34691l.yandex.startapp();
                        boolean zEquals = ((C10749l) c5453l.billing).loadAd.equals(c17804l.f34691l.loadAd);
                        boolean z4 = ((C10749l) c5453l.billing).amazon == c17804l.f34691l.subscription;
                        if (z3 || (zEquals && z4)) {
                            i5 = 0;
                        }
                        if (i5 != 0) {
                            iMo2761implements = c17804l.mo2761implements();
                            if (abstractC10759l.startapp() || ((C10749l) c5453l.billing).loadAd.loadAd()) {
                                j = ((C10749l) c5453l.billing).amazon;
                            } else {
                                C10749l c10749l = (C10749l) c5453l.billing;
                                C5019l c5019l = c10749l.loadAd;
                                long j2 = c10749l.amazon;
                                Object obj = c5019l.yandex;
                                C3904l c3904l = c17804l.f34712l;
                                abstractC10759l.mopub(obj, c3904l);
                                j = j2 + c3904l.purchase;
                            }
                        }
                        i = iMo2761implements;
                        z = i5;
                    } else {
                        i = -1;
                        z = 0;
                    }
                    long j3 = j;
                    c17804l.f34690l = false;
                    c17804l.m4427l((C10749l) c5453l.billing, 1, z, c17804l.f34675l, j3, i, false);
                    return;
                }
                return;
            case 23:
                ((C14692l) this.f1385l).yandex((Intent) this.f1384l);
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C2397l) this.f1385l).m1132synchronized((C2975l) this.f1384l, Unit.INSTANCE);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C8915l c8915l = (C8915l) this.f1385l;
                C7377l c7377l = (C7377l) this.f1384l;
                C5501l c5501l = c8915l.f18324l;
                Uri uri2 = c7377l.remoteconfig;
                C16293l c16293l = (C16293l) ((C10617l) c5501l.f11764l).f21546l.f14267l.get(uri2);
                if (c16293l != null) {
                    C16293l.loadAd(c16293l, uri2, true);
                    return;
                }
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6344l c6344l = (C6344l) this.f1385l;
                C6344l c6344l2 = (C6344l) this.f1384l;
                c6344l.subs();
                if (c6344l2 != null) {
                    c6344l2.subs();
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C3454l c3454l = (C3454l) this.f1385l;
                C2350l c2350l = (C2350l) this.f1384l;
                try {
                    c2350l.loadAd(c3454l.yandex());
                    return;
                } catch (Exception e3) {
                    c2350l.yandex(e3);
                    return;
                }
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f1385l;
                JobParameters jobParameters = (JobParameters) this.f1384l;
                int i8 = JobInfoSchedulerService.f505l;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            default:
                C5008l c5008l = (C5008l) this.f1385l;
                C1869l c1869l = (C1869l) this.f1384l;
                HashSet hashSet = new HashSet();
                if (c5008l != null) {
                    hashSet.addAll((LinkedHashSet) c5008l.f10245l);
                }
                c1869l.mopub.getClass();
                return;
        }
    }
}
