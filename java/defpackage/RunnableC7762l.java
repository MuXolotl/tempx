package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.camera2.CameraCaptureSession;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lًؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7762l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f16284l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16285l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16286l;

    public /* synthetic */ RunnableC7762l(C17044l c17044l, Throwable th) {
        this.f16286l = 28;
        Map map = Collections.EMPTY_MAP;
        this.f16285l = c17044l;
        this.f16284l = th;
    }

    private final void amazon() {
        InterfaceC2785l interfaceC2785l;
        C1263l c1263l = (C1263l) this.f16285l;
        InterfaceC15189l interfaceC15189l = (InterfaceC15189l) this.f16284l;
        if (c1263l.loadAd != C1263l.amazon) {
            C8339l.smaato("provide() can be called only once.");
            return;
        }
        synchronized (c1263l) {
            interfaceC2785l = c1263l.yandex;
            c1263l.yandex = null;
            c1263l.loadAd = interfaceC15189l;
        }
        interfaceC2785l.loadAd(interfaceC15189l);
    }

    private final void crashlytics() {
        C5762l c5762l = (C5762l) this.f16285l;
        C5807l c5807l = (C5807l) this.f16284l;
        C6655l c6655l = c5762l.mopub;
        if (!c6655l.isPro.getAndSet(true)) {
            C7518l c7518l = c6655l.purchase;
            c7518l.getClass();
            c7518l.billing = false;
            synchronized (c7518l.loadAd) {
                c7518l.crashlytics = null;
                c7518l.purchase = 0;
                c7518l.amazon.clear();
                Unit unit = Unit.INSTANCE;
            }
            C15855l c15855l = c6655l.billing;
            c15855l.getClass();
            Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
            if (((AtomicBoolean) c15855l.f31107l).compareAndSet(true, false)) {
                C7504l c7504l = (C7504l) c15855l.f31113l;
                if (c7504l != null) {
                    c7504l.ads(null);
                }
                c15855l.f31113l = null;
            }
            if (c6655l.yandex.yandex()) {
                ((C4723l) c6655l.yandex.getValue()).amazon();
            }
        }
        if (c5762l.billing != null) {
            Executor executor = c5762l.amazon;
            if (executor instanceof ExecutorC5094l) {
                ((ExecutorC5094l) executor).yandex();
            }
            c5762l.billing.quit();
        }
        c5807l.loadAd(null);
    }

    private final void loadAd() {
        C2974l c2974l = (C2974l) this.f16285l;
        InterfaceC18690l interfaceC18690l = (InterfaceC18690l) this.f16284l;
        synchronized (c2974l.yandex) {
            try {
                c2974l.crashlytics.remove(interfaceC18690l);
                if (c2974l.crashlytics.isEmpty()) {
                    c2974l.purchase.getClass();
                    c2974l.purchase.loadAd(null);
                    c2974l.purchase = null;
                    c2974l.amazon = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void purchase() {
        C9531l c9531l = (C9531l) this.f16285l;
        InterfaceC15189l interfaceC15189l = (InterfaceC15189l) this.f16284l;
        synchronized (c9531l) {
            try {
                if (c9531l.loadAd == null) {
                    c9531l.yandex.add(interfaceC15189l);
                } else {
                    c9531l.loadAd.add(interfaceC15189l.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void yandex() {
        C16080l c16080l = (C16080l) this.f16285l;
        Set<C12130l> set = (Set) this.f16284l;
        C15615l c15615l = c16080l.yandex;
        AbstractC12225l.crashlytics();
        synchronized (c15615l.f30480l) {
            try {
                for (C12130l c12130l : set) {
                    Set setKeySet = ((HashMap) c15615l.f30483l).keySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : setKeySet) {
                        if (((C12130l) obj).yandex.equals(c12130l.yandex)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((HashMap) c15615l.f30483l).remove((C12130l) it.next());
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C17274l c17274l;
        switch (this.f16286l) {
            case 0:
                ((C8911l) this.f16285l).tapsense((ListenableFuture) this.f16284l);
                return;
            case 1:
                ((C8911l) this.f16285l).adcel((AbstractC5511l) this.f16284l);
                return;
            case 2:
                AbstractC12148l.mopub((ViewOnAttachStateChangeListenerC0348l) this.f16285l, (LongSparseArray) this.f16284l);
                return;
            case 3:
                ((InterfaceC5755l) this.f16284l).subs((C8634l) this.f16285l);
                return;
            case 4:
                ExecutorC12937l executorC12937l = (ExecutorC12937l) this.f16285l;
                try {
                    ((Runnable) this.f16284l).run();
                    return;
                } finally {
                    executorC12937l.yandex();
                }
            case 5:
                C15276l c15276l = (C15276l) this.f16285l;
                RunnableC12388l runnableC12388l = (RunnableC12388l) this.f16284l;
                c15276l.crashlytics.smaato();
                C17681l c17681l = c15276l.loadAd;
                synchronized (c17681l.yandex) {
                    c17681l.loadAd();
                    runnableC12388l.run();
                    break;
                }
                return;
            case 6:
                Context context = (Context) this.f16285l;
                C5811l c5811l = (C5811l) this.f16284l;
                AbstractC13950l.yandex = (AudioManager) context.getSystemService("audio");
                c5811l.amazon();
                return;
            case 7:
                C18595l c18595l = (C18595l) this.f16285l;
                String str = (String) this.f16284l;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) c18595l.f36316l;
                String str2 = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l.yandex.f34701l;
                C5597l c5597lM4397goto = c17505l.m4397goto();
                c17505l.m4401super(c5597lM4397goto, 1012, new C14086l(c5597lM4397goto, str, 3));
                return;
            case 8:
                C18595l c18595l2 = (C18595l) this.f16285l;
                C5536l c5536l = (C5536l) this.f16284l;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l2 = (SurfaceHolderCallbackC18330l) c18595l2.f36316l;
                String str3 = AbstractC15323l.yandex;
                C10023l.vip(surfaceHolderCallbackC18330l2.yandex.f34732l, c5536l);
                return;
            case 9:
                C4390l.yandex((C4390l) this.f16285l, (AudioRouting) this.f16284l);
                return;
            case 10:
                C4390l c4390l = (C4390l) this.f16285l;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f16284l;
                if (c4390l.amazon == null || (c17274l = ((C4856l) c4390l.loadAd.f7072l).subs) == null || audioDeviceInfo.equals((AudioDeviceInfo) c17274l.isPro)) {
                    return;
                }
                c17274l.isPro = audioDeviceInfo;
                Context context2 = (Context) c17274l.loadAd;
                C13736l c13736l = (C13736l) c17274l.firebase;
                List listPurchase = c17274l.purchase();
                C13708l c13708l = C8193l.purchase;
                c17274l.billing(C8193l.loadAd(context2, context2.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c13736l, audioDeviceInfo, listPurchase));
                return;
            case 11:
                C1080l c1080l = (C1080l) this.f16285l;
                Object objApply = ((InterfaceC17302l) this.f16284l).apply(c1080l.f2971l);
                c1080l.f2971l = objApply;
                RunnableC16789l runnableC16789l = new RunnableC16789l(c1080l, 1, objApply);
                C14500l c14500l = (C14500l) c1080l.f2975l;
                if (c14500l.yandex.getLooper().getThread().isAlive()) {
                    c14500l.amazon(runnableC16789l);
                    return;
                }
                return;
            case 12:
                ((AbstractC2338l) this.f16285l).Signature((Activity) this.f16284l);
                return;
            case 13:
                ((C18505l) this.f16285l).yandex.onCaptureSequenceAborted((CameraCaptureSession) this.f16284l, -1);
                return;
            case 14:
                yandex();
                return;
            case 15:
                ((InterfaceC18690l) this.f16285l).adcel().yandex().admob((InterfaceC2810l) this.f16284l);
                return;
            case 16:
                ((InterfaceC15879l) this.f16285l).yandex().purchase((C7732l) this.f16284l);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                loadAd();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((InterfaceC13241l) this.f16285l).accept((C6738l) this.f16284l);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                crashlytics();
                return;
            case 20:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.f16285l, this.f16284l);
                return;
            case 21:
                ((InterfaceC9492l) this.f16285l).mo1760switch((C15390l) this.f16284l);
                return;
            case 22:
                AbstractActivityC14666l abstractActivityC14666l = (AbstractActivityC14666l) this.f16285l;
                abstractActivityC14666l.f23523l.yandex(new C2578l((C16390l) this.f16284l, abstractActivityC14666l, 0));
                return;
            case 23:
                amazon();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                purchase();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C3301l c3301l = (C3301l) this.f16285l;
                InterfaceC15984l interfaceC15984l = (InterfaceC15984l) this.f16284l;
                try {
                    interfaceC15984l.yandex(c3301l.f7042l.f22286l);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    interfaceC15984l.onError(e);
                    return;
                }
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                List list = (List) this.f16285l;
                AbstractC13851l abstractC13851l = (AbstractC13851l) this.f16284l;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C8279l) it.next()).yandex(abstractC13851l.purchase);
                }
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C17503l) this.f16285l).crashlytics((String) this.f16284l, Boolean.FALSE);
                return;
            default:
                C17044l c17044l = (C17044l) this.f16285l;
                Throwable th = (Throwable) this.f16284l;
                Map map = Collections.EMPTY_MAP;
                C17503l c17503l = c17044l.mopub;
                Thread threadCurrentThread = Thread.currentThread();
                c17503l.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C2858l c2858l = c17503l.vip;
                if (c2858l == null || !c2858l.purchase.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strPurchase = c17503l.purchase();
                    if (strPurchase == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    C18724l c18724l = new C18724l(strPurchase, j, map);
                    C12714l c12714l = c17503l.remoteconfig;
                    c12714l.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strPurchase);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    c12714l.isPro(th, threadCurrentThread, "error", c18724l, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC7762l(C8911l c8911l, int i, ListenableFuture listenableFuture) {
        this.f16286l = 0;
        this.f16285l = c8911l;
        this.f16284l = listenableFuture;
    }

    public /* synthetic */ RunnableC7762l(Object obj, Object obj2, int i) {
        this.f16286l = i;
        this.f16285l = obj;
        this.f16284l = obj2;
    }
}
