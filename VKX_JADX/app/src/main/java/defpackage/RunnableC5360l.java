package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Messenger;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.isPro;
import androidx.recyclerview.widget.metrica;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.lang.ref.ReferenceQueue;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;
import ua.itaysonlab.vkxreborn.ui.ThemedViewPager;

/* JADX INFO: renamed from: lؘٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5360l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f11498l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11499l;

    public /* synthetic */ RunnableC5360l(int i, Object obj) {
        this.f11499l = i;
        this.f11498l = obj;
    }

    private final void amazon() {
        AbstractC13821l abstractC13821lLoadAd;
        long jNanoTime;
        AbstractC13821l abstractC13821lLoadAd2;
        C3097l c3097l = (C3097l) this.f11498l;
        synchronized (c3097l) {
            c3097l.mopub++;
            abstractC13821lLoadAd = c3097l.loadAd();
        }
        if (abstractC13821lLoadAd == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(abstractC13821lLoadAd.yandex);
                Logger logger = ((C3097l) this.f11498l).loadAd;
                C7522l c7522l = abstractC13821lLoadAd.crashlytics;
                boolean zIsLoggable = logger.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    C3097l c3097l2 = c7522l.yandex;
                    jNanoTime = System.nanoTime();
                    AbstractC4952l.loadAd(logger, abstractC13821lLoadAd, c7522l, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jYandex = abstractC13821lLoadAd.yandex();
                    if (zIsLoggable) {
                        C3097l c3097l3 = c7522l.yandex;
                        AbstractC4952l.loadAd(logger, abstractC13821lLoadAd, c7522l, "finished run in " + AbstractC4952l.remoteconfig(System.nanoTime() - jNanoTime));
                    }
                    C3097l c3097l4 = (C3097l) this.f11498l;
                    synchronized (c3097l4) {
                        C3097l.yandex(c3097l4, abstractC13821lLoadAd, jYandex, true);
                        abstractC13821lLoadAd2 = c3097l4.loadAd();
                    }
                    if (abstractC13821lLoadAd2 == null) {
                        threadCurrentThread.setName(name);
                        return;
                    }
                    abstractC13821lLoadAd = abstractC13821lLoadAd2;
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        C3097l c3097l5 = c7522l.yandex;
                        AbstractC4952l.loadAd(logger, abstractC13821lLoadAd, c7522l, "failed a run in " + AbstractC4952l.remoteconfig(System.nanoTime() - jNanoTime));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    C3097l c3097l6 = (C3097l) this.f11498l;
                    synchronized (c3097l6) {
                        C3097l.yandex(c3097l6, abstractC13821lLoadAd, -1L, false);
                        Unit unit = Unit.INSTANCE;
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        threadCurrentThread.setName(name);
                        return;
                    }
                } catch (Throwable th3) {
                    threadCurrentThread.setName(name);
                    throw th3;
                }
            }
        }
    }

    private final void crashlytics() {
        try {
            purchase();
        } catch (Error e) {
            synchronized (((ExecutorC7870l) this.f11498l).f16416l) {
                ((ExecutorC7870l) this.f11498l).f16418l = 1;
                throw e;
            }
        }
    }

    private final void loadAd() {
        Function0 function0;
        synchronized (((C0660l) this.f11498l)) {
            C0660l c0660l = (C0660l) this.f11498l;
            c0660l.crashlytics = true;
            function0 = c0660l.loadAd;
            c0660l.loadAd = null;
            Unit unit = Unit.INSTANCE;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void yandex() {
        Object obj;
        synchronized (((AbstractC8769l) this.f11498l).yandex) {
            obj = ((AbstractC8769l) this.f11498l).billing;
            ((AbstractC8769l) this.f11498l).billing = AbstractC8769l.firebase;
        }
        ((AbstractC8769l) this.f11498l).subs(obj);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        defpackage.AbstractC5088l.amazon("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void purchase() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f11498l     // Catch: java.lang.Throwable -> L4f
            lًًۨ r2 = (defpackage.ExecutorC7870l) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.f16416l     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f11498l     // Catch: java.lang.Throwable -> L20
            lًًۨ r0 = (defpackage.ExecutorC7870l) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f16418l     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L44
        L20:
            r10 = move-exception
            goto L69
        L22:
            long r6 = r0.f16417l     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f16417l = r6     // Catch: java.lang.Throwable -> L20
            r0.f16418l = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f11498l     // Catch: java.lang.Throwable -> L20
            lًًۨ r4 = (defpackage.ExecutorC7870l) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f16416l     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r10 = r10.f11498l     // Catch: java.lang.Throwable -> L20
            lًًۨ r10 = (defpackage.ExecutorC7870l) r10     // Catch: java.lang.Throwable -> L20
            r10.f16418l = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r10 = move-exception
            goto L6b
        L51:
            r2 = move-exception
            java.lang.String r3 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            defpackage.AbstractC5088l.amazon(r3, r4, r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L4f
        L6b:
            if (r1 == 0) goto L74
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L74:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC5360l.purchase():void");
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0392  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        int i;
        int iFirebase;
        C0791l c0791l;
        int iFirebase2 = 0;
        switch (this.f11499l) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) this.f11498l;
                viewTreeObserverOnGlobalLayoutListenerC13840l.removeCallbacks(this);
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                if (actionMasked == 7) {
                    i = 7;
                } else if (actionMasked == 8) {
                    i = 9;
                } else if (actionMasked != 9) {
                    i = 2;
                } else {
                    i = 7;
                }
                viewTreeObserverOnGlobalLayoutListenerC13840l.m3769native(motionEvent, i, viewTreeObserverOnGlobalLayoutListenerC13840l.f27057l, false);
                return;
            case 1:
                ViewOnTouchListenerC6500l viewOnTouchListenerC6500l = (ViewOnTouchListenerC6500l) this.f11498l;
                C9945l c9945l = viewOnTouchListenerC6500l.f13557l;
                C2153l c2153l = viewOnTouchListenerC6500l.f13562l;
                if (viewOnTouchListenerC6500l.f13565l) {
                    if (viewOnTouchListenerC6500l.f13556l) {
                        viewOnTouchListenerC6500l.f13556l = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c2153l.purchase = jCurrentAnimationTimeMillis;
                        c2153l.mopub = -1L;
                        c2153l.billing = jCurrentAnimationTimeMillis;
                        c2153l.admob = 0.5f;
                    }
                    if ((c2153l.mopub > 0 && AnimationUtils.currentAnimationTimeMillis() > c2153l.mopub + ((long) c2153l.subs)) || !viewOnTouchListenerC6500l.purchase()) {
                        viewOnTouchListenerC6500l.f13565l = false;
                        return;
                    }
                    if (viewOnTouchListenerC6500l.f13572l) {
                        viewOnTouchListenerC6500l.f13572l = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c9945l.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c2153l.billing == 0) {
                        C18073l.license("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fYandex = c2153l.yandex(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c2153l.billing;
                    c2153l.billing = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC6500l.f13563l.scrollListBy((int) (j * ((fYandex * 4.0f) + ((-4.0f) * fYandex * fYandex)) * c2153l.amazon));
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    c9945l.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                C8662l c8662l = (C8662l) this.f11498l;
                c8662l.crashlytics = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c8662l.purchase;
                C0213l c0213l = bottomSheetBehavior.f636extends;
                if (c0213l != null && c0213l.billing()) {
                    c8662l.loadAd(c8662l.loadAd);
                    return;
                } else {
                    if (bottomSheetBehavior.f645private == 2) {
                        bottomSheetBehavior.inmobi(c8662l.loadAd);
                        return;
                    }
                    return;
                }
            case 3:
                C6433l c6433l = (C6433l) this.f11498l;
                c6433l.f34613l.billing(false, true);
                c6433l.f34613l.remoteconfig(new C12000l());
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0435l dialogInterfaceOnCancelListenerC0435l = (DialogInterfaceOnCancelListenerC0435l) this.f11498l;
                dialogInterfaceOnCancelListenerC0435l.f1605l.onDismiss(dialogInterfaceOnCancelListenerC0435l.f1606l);
                return;
            case 5:
                C16069l c16069l = (C16069l) this.f11498l;
                c16069l.yandex(true);
                c16069l.invalidateSelf();
                return;
            case 6:
                C9945l c9945l2 = (C9945l) this.f11498l;
                c9945l2.f20265l = null;
                c9945l2.drawableStateChanged();
                return;
            case 7:
                C17832l c17832l = (C17832l) this.f11498l;
                ValueAnimator valueAnimator = c17832l.isVip;
                int i2 = c17832l.signatures;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c17832l.signatures = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 8:
                break;
            case 9:
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = (AbstractComponentCallbacksC4411l) this.f11498l;
                if (abstractComponentCallbacksC4411l.f8961l != null) {
                    abstractComponentCallbacksC4411l.purchase().getClass();
                    return;
                }
                return;
            case 10:
                ((C13734l) this.f11498l).signatures(true);
                return;
            case 11:
                C18449l c18449l = (C18449l) this.f11498l;
                RunnableScheduledFutureC10932l runnableScheduledFutureC10932l = (RunnableScheduledFutureC10932l) c18449l.f36012l;
                if (runnableScheduledFutureC10932l.f22055l.getAndSet(null) != null) {
                    ((Handler) c18449l.f36010l).removeCallbacks(runnableScheduledFutureC10932l);
                    return;
                }
                return;
            case 12:
                C16678l c16678l = (C16678l) this.f11498l;
                if (c16678l.crashlytics != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = c16678l.premium;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    isPro layoutManager = c16678l.ads.getLayoutManager();
                    if (c16678l.signatures == null) {
                        c16678l.signatures = new Rect();
                    }
                    View view = c16678l.crashlytics.yandex;
                    Rect rect = c16678l.signatures;
                    RecyclerView recyclerView = layoutManager.loadAd;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.getItemDecorInsetsForChild(view));
                    }
                    if (layoutManager.amazon()) {
                        int i3 = (int) (c16678l.isPro + c16678l.admob);
                        int paddingLeft = (i3 - c16678l.signatures.left) - c16678l.ads.getPaddingLeft();
                        float f = c16678l.admob;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((c16678l.crashlytics.yandex.getWidth() + i3) + c16678l.signatures.right) - (c16678l.ads.getWidth() - c16678l.ads.getPaddingRight())) <= 0)) {
                            iFirebase = 0;
                        } else {
                            iFirebase = paddingLeft;
                        }
                    } else {
                        iFirebase = 0;
                    }
                    if (layoutManager.purchase()) {
                        int i4 = (int) (c16678l.firebase + c16678l.subs);
                        int paddingTop = (i4 - c16678l.signatures.top) - c16678l.ads.getPaddingTop();
                        float f2 = c16678l.subs;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((c16678l.crashlytics.yandex.getHeight() + i4) + c16678l.signatures.bottom) - (c16678l.ads.getHeight() - c16678l.ads.getPaddingBottom())) > 0)) {
                            iFirebase2 = paddingTop;
                        }
                    }
                    if (iFirebase != 0) {
                        C7221l c7221l = c16678l.remoteconfig;
                        RecyclerView recyclerView2 = c16678l.ads;
                        int width = c16678l.crashlytics.yandex.getWidth();
                        c16678l.ads.getWidth();
                        iFirebase = c7221l.firebase(recyclerView2, width, iFirebase, j3);
                    }
                    int i5 = iFirebase;
                    if (iFirebase2 != 0) {
                        C7221l c7221l2 = c16678l.remoteconfig;
                        RecyclerView recyclerView3 = c16678l.ads;
                        int height = c16678l.crashlytics.yandex.getHeight();
                        c16678l.ads.getHeight();
                        iFirebase2 = c7221l2.firebase(recyclerView3, height, iFirebase2, j3);
                    }
                    if (i5 == 0 && iFirebase2 == 0) {
                        c16678l.premium = Long.MIN_VALUE;
                        return;
                    }
                    if (c16678l.premium == Long.MIN_VALUE) {
                        c16678l.premium = jCurrentTimeMillis;
                    }
                    c16678l.ads.scrollBy(i5, iFirebase2);
                    metrica metricaVar = c16678l.crashlytics;
                    if (metricaVar != null) {
                        c16678l.vip(metricaVar);
                    }
                    c16678l.ads.removeCallbacks(c16678l.subscription);
                    RecyclerView recyclerView4 = c16678l.ads;
                    WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                    recyclerView4.postOnAnimation(this);
                    return;
                }
                return;
            case 13:
                C13745l c13745l = (C13745l) this.f11498l;
                c13745l.f26835l = null;
                c13745l.f26836l = null;
                return;
            case 14:
                yandex();
                return;
            case 15:
                ((InterfaceC16681l) this.f11498l).yandex();
                return;
            case 16:
                C7996l c7996l = (C7996l) this.f11498l;
                C11154l c11154l = c7996l.mopub.f32110l;
                C15053l c15053l = c7996l.purchase;
                c15053l.getClass();
                c11154l.remove(((Messenger) c15053l.f29576l).getBinder());
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C12362l) this.f11498l).loadAd();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                PlaybackService playbackService = (PlaybackService) this.f11498l;
                int i6 = PlaybackService.f36828l;
                playbackService.isVip();
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C8961l) this.f11498l).billing();
                return;
            case 20:
                loadAd();
                return;
            case 21:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f11498l;
                if (searchView$SearchAutoComplete.f182l) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f182l = false;
                    return;
                }
                return;
            case 22:
                crashlytics();
                return;
            case 23:
                ((StaggeredGridLayoutManager) this.f11498l).m111l();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                amazon();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f11498l).f694l.f24126l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ActionMenuView actionMenuView = ((Toolbar) this.f11498l).f247l;
                if (actionMenuView == null || (c0791l = actionMenuView.f157l) == null) {
                    return;
                }
                c0791l.smaato();
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C0213l) this.f11498l).vip(0);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ThemedViewPager themedViewPager = (ThemedViewPager) this.f11498l;
                themedViewPager.setScrollState(0);
                themedViewPager.populate();
                return;
            default:
                ((C3714l) this.f11498l).yandex();
                return;
        }
        while (true) {
            try {
                C13774l c13774l = (C13774l) ((ReferenceQueue) this.f11498l).remove();
                synchronized (c13774l.yandex) {
                    try {
                        if (c13774l.loadAd.compareAndSet(false, true)) {
                            long j4 = c13774l.crashlytics;
                            int i7 = AbstractC9795l.yandex;
                            realmcJNI.realm_release(j4);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C13774l.billing.appmetrica(c13774l);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                System.out.println((Object) "The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore");
                return;
            }
        }
    }
}
