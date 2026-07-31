package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lَٕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10311l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f21027l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21028l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21029l;

    public /* synthetic */ RunnableC10311l(Object obj, Object obj2, int i) {
        this.f21029l = i;
        this.f21028l = obj;
        this.f21027l = obj2;
    }

    private final void loadAd() {
        PowerManager.WakeLock wakeLock;
        C13645l c13645l = (C13645l) this.f21028l;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f21027l;
        synchronized (c13645l) {
            if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) c13645l.f26670l) != null) {
                wakeLock.release();
            }
        }
    }

    private final void yandex() {
        C5648l c5648l = (C5648l) this.f21028l;
        C0350l c0350l = (C0350l) this.f21027l;
        synchronized (c5648l.firebase) {
            try {
                Iterator it = c5648l.isPro.iterator();
                while (it.hasNext()) {
                    ((InterfaceC18230l) it.next()).loadAd(c0350l, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x030a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0333  */
    /* JADX WARN: Code duplicated, block: B:154:0x0335  */
    /* JADX WARN: Code duplicated, block: B:155:0x0337  */
    /* JADX WARN: Code duplicated, block: B:157:0x033e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0340  */
    /* JADX WARN: Code duplicated, block: B:160:0x0344  */
    /* JADX WARN: Code duplicated, block: B:161:0x0346  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x014a  */
    @Override // java.lang.Runnable
    public final void run() {
        WifiManager.WifiLock wifiLock;
        int i = 3;
        int i2 = 27;
        int i3 = 29;
        Object obj = null;
        int i4 = 1;
        switch (this.f21029l) {
            case 0:
                C13773l c13773l = (C13773l) this.f21028l;
                Context context = (Context) this.f21027l;
                C1196l c1196l = (C1196l) c13773l.loadAd;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                    default:
                                        i = 6;
                                        break;
                                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                    default:
                                        i = 6;
                                        break;
                                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i = type != 9 ? 8 : 7;
                            } else {
                                i = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i != 5) {
                    c1196l.applovin(i);
                    return;
                } else {
                    AbstractC12148l.billing(context, c1196l);
                    return;
                }
            case 1:
                NextDockView nextDockView = (NextDockView) this.f21028l;
                String str = (String) this.f21027l;
                ArrayList arrayList = nextDockView.f36849l;
                Iterator it = arrayList.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                    } else if (!AbstractC8576l.yandex(((C9359l) it.next()).yandex.yandex, str)) {
                        i5++;
                    }
                }
                Integer numValueOf = i5 != -1 ? Integer.valueOf(i5) : null;
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    C9359l c9359l = (C9359l) AbstractC16901l.m4220for(nextDockView.f36848l, arrayList);
                    if (c9359l != null) {
                        c9359l.loadAd(false, false);
                    }
                    ((C9359l) arrayList.get(iIntValue)).loadAd(true, false);
                    nextDockView.f36848l = iIntValue;
                    return;
                }
                return;
            case 2:
                ((C2671l) this.f21028l).subs((C6132l) this.f21027l, Unit.INSTANCE);
                return;
            case 3:
                ((InterfaceC4969l) this.f21028l).isPro((C15691l) this.f21027l);
                return;
            case 4:
                ((C7591l) ((C7026l) this.f21028l).f14720l).f15603l.isPro((C15691l) this.f21027l);
                return;
            case 5:
                yandex();
                return;
            case 6:
                ((C9159l) this.f21028l).inmobi((InterfaceC12703l) this.f21027l);
                return;
            case 7:
                ((Executor) this.f21028l).execute((Runnable) this.f21027l);
                return;
            case 8:
                C9516l c9516l = (C9516l) this.f21028l;
                CountDownLatch countDownLatch = (CountDownLatch) this.f21027l;
                try {
                    C4225l.yandex().amazon.remoteconfig(c9516l.admob.yandex.loadAd(EnumC14251l.f27851l), 1);
                    break;
                } catch (Exception unused2) {
                }
                countDownLatch.countDown();
                return;
            case 9:
                ((AbstractC16763l) this.f21028l).vip((Typeface) this.f21027l);
                return;
            case 10:
                C7297l c7297l = (C7297l) this.f21028l;
                EnumC14812l enumC14812l = (EnumC14812l) this.f21027l;
                C5268l c5268l = c7297l.f15145l;
                if (c5268l.subs.yandex(EnumC8981l.f18521l)) {
                    if (enumC14812l == EnumC14812l.ON_DESTROY) {
                        c7297l.f15144l.getClass();
                    }
                    c5268l.purchase(enumC14812l);
                    return;
                }
                return;
            case 11:
                ((InterfaceC13241l) ((AtomicReference) this.f21027l).get()).accept(new C12030l((C3214l) this.f21028l));
                return;
            case 12:
                C3608l c3608l = (C3608l) this.f21028l;
                C15691l c15691l = (C15691l) this.f21027l;
                C15691l c15691l2 = c3608l.admob;
                if (c15691l2 != null && c15691l2 == c15691l) {
                    c3608l.admob = null;
                    c3608l.mopub = null;
                }
                C17706l c17706l = c3608l.smaato;
                if (c17706l != null) {
                    c17706l.yandex();
                    c3608l.smaato = null;
                    return;
                }
                return;
            case 13:
                C10700l c10700l = (C10700l) this.f21028l;
                C10700l c10700l2 = (C10700l) this.f21027l;
                AbstractC11990l.billing((InterfaceC2262l) c10700l.f21708l, null);
                AbstractC11990l.billing((InterfaceC2262l) c10700l2.f21708l, null);
                return;
            case 14:
                RunnableC11297l runnableC11297l = (RunnableC11297l) this.f21028l;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f21027l;
                try {
                    runnableC11297l.run();
                    return;
                } finally {
                    countDownLatch2.countDown();
                }
            case 15:
                ((C5633l) ((C10038l) this.f21028l).f20462l).loadAd((C10771l) this.f21027l, 3);
                return;
            case 16:
                Runnable runnable = (Runnable) this.f21028l;
                ExecutorC8064l executorC8064l = (ExecutorC8064l) this.f21027l;
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC8064l.loadAd();
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C14338l c14338l = (C14338l) this.f21028l;
                Runnable runnable2 = (Runnable) this.f21027l;
                ThreadLocal threadLocal = c14338l.crashlytics;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable2.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C2980l) this.f21028l).loadAd.invoke((String) this.f21027l);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                View view = (View) this.f21028l;
                EnumC10788l enumC10788l = (EnumC10788l) this.f21027l;
                ArrayList arrayList2 = C7206l.crashlytics;
                for (Object obj2 : arrayList2) {
                    if (AbstractC8576l.yandex(((EnumC10788l) ((C8195l) obj2).f17097l).name(), enumC10788l.name())) {
                        obj = obj2;
                        if (obj != null) {
                            return;
                        }
                        arrayList2.add(0, new C8195l(view, enumC10788l));
                        if (arrayList2.size() == 1 || C7206l.amazon) {
                            return;
                        }
                        C7206l.yandex.loadAd();
                        return;
                    }
                }
                if (obj != null) {
                    return;
                }
                arrayList2.add(0, new C8195l(view, enumC10788l));
                if (arrayList2.size() == 1) {
                    return;
                } else {
                    return;
                }
            case 20:
                C10418l c10418l = (C10418l) this.f21028l;
                if (((AbstractC0958l) this.f21027l) == c10418l.subscription) {
                    c10418l.m2921native();
                    return;
                }
                return;
            case 21:
                C3720l c3720l = (C3720l) this.f21028l;
                C16774l c16774l = (C16774l) this.f21027l;
                ((ArrayList) c16774l.loadAd.f19552l).remove(c3720l);
                c16774l.purchase.remove(c3720l);
                return;
            case 22:
                C13645l c13645l = (C13645l) this.f21028l;
                C5536l c5536l = (C5536l) this.f21027l;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) c13645l.f26670l;
                String str2 = AbstractC15323l.yandex;
                C10023l.vip(surfaceHolderCallbackC18330l.yandex.f34695l, c5536l);
                return;
            case 23:
                C13645l c13645l2 = (C13645l) this.f21028l;
                C15074l c15074l = (C15074l) this.f21027l;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l2 = (SurfaceHolderCallbackC18330l) c13645l2.f26670l;
                String str3 = AbstractC15323l.yandex;
                C17804l c17804l = surfaceHolderCallbackC18330l2.yandex;
                c17804l.f34673l = c15074l;
                c17804l.f34677l.mopub(25, new C2683l(i2, c15074l));
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C13645l c13645l3 = (C13645l) this.f21028l;
                Exception exc = (Exception) this.f21027l;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l3 = (SurfaceHolderCallbackC18330l) c13645l3.f26670l;
                String str4 = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l3.yandex.f34701l;
                C5597l c5597lM4397goto = c17505l.m4397goto();
                c17505l.m4401super(c5597lM4397goto, 1030, new C18725l(c5597lM4397goto, exc, 7));
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C13645l c13645l4 = (C13645l) this.f21028l;
                String str5 = (String) this.f21027l;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l4 = (SurfaceHolderCallbackC18330l) c13645l4.f26670l;
                String str6 = AbstractC15323l.yandex;
                C17505l c17505l2 = surfaceHolderCallbackC18330l4.yandex.f34701l;
                C5597l c5597lM4397goto2 = c17505l2.m4397goto();
                c17505l2.m4401super(c5597lM4397goto2, 1019, new C14086l(c5597lM4397goto2, str5, i4));
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C4619l c4619l = (C4619l) this.f21028l;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f21027l;
                C13645l c13645l5 = (C13645l) c4619l.f9373l;
                c13645l5.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new RunnableC10311l(c13645l5, atomicBoolean, i2), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                loadAd();
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C4619l c4619l2 = (C4619l) this.f21028l;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f21027l;
                C13568l c13568l = (C13568l) c4619l2.f9373l;
                c13568l.getClass();
                if (atomicBoolean2.get()) {
                    new Thread(new RunnableC10311l(c13568l, atomicBoolean2, i3), "ExoPlayer:WifiLockManager").start();
                    return;
                }
                return;
            default:
                C13568l c13568l2 = (C13568l) this.f21028l;
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) this.f21027l;
                synchronized (c13568l2) {
                    if (atomicBoolean3.get() && (wifiLock = (WifiManager.WifiLock) c13568l2.f26580l) != null) {
                        wifiLock.release();
                    }
                    break;
                }
                return;
        }
    }
}
