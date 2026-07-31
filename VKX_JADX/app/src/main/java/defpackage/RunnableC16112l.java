package defpackage;

import android.app.Activity;
import android.app.Application;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.PopupWindow;
import androidx.car.app.loadAd;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.subs;
import androidx.car.app.utils.billing;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٖؐۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC16112l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f31562l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31563l;

    public /* synthetic */ RunnableC16112l(C17856l c17856l, AbstractC18261l abstractC18261l) {
        this.f31563l = 24;
        this.f31562l = c17856l;
    }

    private final void yandex() {
        C8634l c8634l = (C8634l) this.f31562l;
        synchronized (c8634l.f17795l) {
            try {
                if (c8634l.f17793l) {
                    return;
                }
                AbstractC5088l.yandex("CameraController", "Tap-to-focus reset.");
                ((C13716l) c8634l.f17792l).isPro(new C17690l(0));
                c8634l.f17793l = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 5;
        int i2 = 3;
        InterfaceC14029l interfaceC14029l = null;
        switch (this.f31563l) {
            case 0:
                ((AbstractC15391l) this.f31562l).loadAd();
                return;
            case 1:
                Activity activity = (Activity) this.f31562l;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = AbstractC9279l.mopub;
                Method method = AbstractC9279l.billing;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i3 != 26 && i3 != 27) || method != null) && (AbstractC9279l.purchase != null || AbstractC9279l.amazon != null)) {
                    Object obj2 = AbstractC9279l.crashlytics.get(activity);
                    if (obj2 != null && (obj = AbstractC9279l.loadAd.get(activity)) != null) {
                        Application application = activity.getApplication();
                        C12321l c12321l = new C12321l(activity);
                        application.registerActivityLifecycleCallbacks(c12321l);
                        handler.post(new RunnableC9929l(c12321l, obj2, 2));
                        try {
                            if (i3 == 26 || i3 == 27) {
                                Boolean bool = Boolean.FALSE;
                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                            } else {
                                activity.recreate();
                            }
                            handler.post(new RunnableC9929l(application, c12321l, i2));
                            return;
                        } catch (Throwable th) {
                            handler.post(new RunnableC9929l(application, c12321l, i2));
                            throw th;
                        }
                    }
                }
                activity.recreate();
                return;
            case 2:
                ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = (ViewOnAttachStateChangeListenerC9659l) this.f31562l;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC9659l.f19728l.tapsense(true);
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC9659l.remoteconfig();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC9659l.f19725l = false;
                        return;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            case 3:
                ActionMode actionMode = ((C18439l) this.f31562l).admob;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                AbstractC5833l.amazon((View) ((C8195l) this.f31562l).f17097l);
                return;
            case 5:
                C17681l c17681l = (C17681l) this.f31562l;
                synchronized (c17681l.yandex) {
                    try {
                        if (c17681l.remoteconfig) {
                            return;
                        }
                        long j = c17681l.smaato - 1;
                        c17681l.smaato = j;
                        if (j > 0) {
                            return;
                        }
                        if (j < 0) {
                            c17681l.crashlytics(new IllegalStateException());
                            return;
                        } else {
                            c17681l.yandex();
                            return;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            case 6:
                C1117l c1117l = (C1117l) this.f31562l;
                if (c1117l.crashlytics.f23764l) {
                    c1117l.yandex.yandex.m4412l(3, false);
                    return;
                }
                return;
            case 7:
                ((C17274l) this.f31562l).subs();
                return;
            case 8:
                AbstractC11990l.billing(((C14894l) this.f31562l).yandex, null);
                return;
            case 9:
                C8961l c8961l = (C8961l) this.f31562l;
                c8961l.getClass();
                if (Thread.currentThread() == ((Thread) c8961l.crashlytics)) {
                    c8961l.mopub(-1, new C8339l(18));
                    return;
                }
                return;
            case 10:
                AbstractC11990l.billing(((C14232l) this.f31562l).purchase, null);
                return;
            case 11:
                AbstractC10999l.admob(new C11039l((C10523l) this.f31562l, interfaceC14029l, 12));
                return;
            case 12:
                yandex();
                return;
            case 13:
                Runnable runnable = (Runnable) this.f31562l;
                Process.setThreadPriority(-3);
                runnable.run();
                return;
            case 14:
                C17568l c17568l = (C17568l) ((subs) this.f31562l).loadAd(C17568l.class);
                ArrayDeque arrayDeque = c17568l.yandex;
                AbstractC9859l.yandex();
                C5268l c5268l = c17568l.crashlytics;
                if (c5268l.subs.equals(EnumC8981l.f18522l)) {
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
                        return;
                    }
                    return;
                }
                if (arrayDeque.size() > 1) {
                    List<C7297l> listSingletonList = Collections.singletonList((C7297l) arrayDeque.pop());
                    AbstractC9859l.yandex();
                    C7297l c7297l = (C7297l) c17568l.yandex.peek();
                    Objects.requireNonNull(c7297l);
                    c7297l.f15146l = true;
                    billing.amazon("invalidate", new C17706l(((loadAd) c17568l.loadAd.loadAd(loadAd.class)).crashlytics, "invalidate", new C8339l(11), i));
                    if (c5268l.subs.yandex(EnumC8981l.f18524l)) {
                        c7297l.crashlytics(EnumC14812l.ON_START);
                    }
                    for (C7297l c7297l2 : listSingletonList) {
                        if (Log.isLoggable("CarApp", 3)) {
                            Log.d("CarApp", "Popping screen " + c7297l2 + " off the screen stack");
                        }
                        C17568l.loadAd(c7297l2, true);
                    }
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", "Screen " + c7297l + " is at the top of the screen stack");
                    }
                    if (c5268l.subs.yandex(EnumC8981l.f18523l) && arrayDeque.contains(c7297l)) {
                        c7297l.crashlytics(EnumC14812l.ON_RESUME);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((CarouselLayoutManager) this.f31562l).m141l();
                return;
            case 16:
                ((C1500l) this.f31562l).subscription(true);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ExecutorC8614l executorC8614l = (ExecutorC8614l) this.f31562l;
                Runnable runnable2 = executorC8614l.f17766l;
                if (runnable2 != null) {
                    runnable2.run();
                    executorC8614l.f17766l = null;
                    return;
                }
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                DialogC0427l.crashlytics((DialogC0427l) this.f31562l);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C18449l c18449l = (C18449l) this.f31562l;
                PopupWindow popupWindow = (PopupWindow) c18449l.f36012l;
                if (popupWindow != null) {
                    popupWindow.showAtLocation(((AppActivity) c18449l.f36010l).getWindow().getDecorView(), 49, 0, 0);
                    return;
                }
                return;
            case 20:
                C17505l c17505l = (C17505l) this.f31562l;
                C5597l c5597lM4400static = c17505l.m4400static();
                c17505l.m4401super(c5597lM4400static, 1028, new C18725l(c5597lM4400static, 20));
                c17505l.f34110l.amazon();
                return;
            case 21:
                C7653l c7653l = (C7653l) this.f31562l;
                if (c7653l.f15770super >= 300000) {
                    ((C4886l) c7653l.metrica.f14720l).f9969l = true;
                    c7653l.f15770super = 0L;
                    return;
                }
                return;
            case 22:
                C7115l c7115l = (C7115l) this.f31562l;
                if (c7115l.f14897l) {
                    return;
                }
                InterfaceC9655l interfaceC9655l = c7115l.f14898l;
                if (interfaceC9655l != null) {
                    interfaceC9655l.amazon(c7115l.f14899l);
                }
                c7115l.f14900l.f33678l.remove(c7115l);
                c7115l.f14897l = true;
                return;
            case 23:
                ((C15034l) this.f31562l).amazon(null);
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C17856l) this.f31562l).yandex(null);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C10111l c10111l = (C10111l) this.f31562l;
                AudioManager audioManager = (AudioManager) c10111l.f20587l;
                if (audioManager != null) {
                    C2088l c2088l = (C2088l) c10111l.f20586l;
                    c2088l.getClass();
                    audioManager.unregisterAudioDeviceCallback(c2088l);
                    return;
                }
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C14677l.yandex((C14677l) this.f31562l);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C3214l) this.f31562l).close();
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C8857l c8857l = (C8857l) this.f31562l;
                c8857l.f18212l = true;
                c8857l.crashlytics();
                return;
            default:
                ((C16717l) this.f31562l).subs();
                return;
        }
    }

    public /* synthetic */ RunnableC16112l(int i, Object obj) {
        this.f31563l = i;
        this.f31562l = obj;
    }
}
