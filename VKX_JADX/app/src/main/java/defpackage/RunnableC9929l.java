package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.util.Log;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍۥؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9929l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f20218l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f20219l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20220l;

    public RunnableC9929l(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f20220l = 19;
        this.f20218l = swipeDismissBehavior;
        this.f20219l = view;
    }

    private final void amazon() {
        C7718l c7718lCrashlytics = ((C14891l) this.f20218l).f29283l.billing.crashlytics((String) this.f20219l);
        if (c7718lCrashlytics == null || AbstractC8576l.yandex(C13152l.isPro, c7718lCrashlytics.isPro)) {
            return;
        }
        synchronized (((C14891l) this.f20218l).f29279l) {
            ((C14891l) this.f20218l).f29287l.put(AbstractC3605l.isPro(c7718lCrashlytics), c7718lCrashlytics);
            C14891l c14891l = (C14891l) this.f20218l;
            C14637l c14637l = c14891l.f29281l;
            AbstractC1872l abstractC1872l = c14891l.f29282l.loadAd;
            String str = AbstractC10076l.yandex;
            ((C14891l) this.f20218l).f29280l.put(AbstractC3605l.isPro(c7718lCrashlytics), AbstractC10999l.mopub(AbstractC11990l.yandex(abstractC1872l), null, 0, new C0932l(c14637l, c7718lCrashlytics, c14891l, (InterfaceC14029l) null, 16), 3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f20219l).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        defpackage.ExecutorC1688l.f4057l.yandex().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f20219l), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r10.f20219l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void billing() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f20218l     // Catch: java.lang.Throwable -> L58
            lؚؓٔ r2 = (defpackage.ExecutorC1688l) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f4059l     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f20218l     // Catch: java.lang.Throwable -> L20
            lؚؓٔ r0 = (defpackage.ExecutorC1688l) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f4058l     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L81
        L22:
            long r6 = r0.f4062l     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f4062l = r6     // Catch: java.lang.Throwable -> L20
            r0.f4058l = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f20218l     // Catch: java.lang.Throwable -> L20
            lؚؓٔ r4 = (defpackage.ExecutorC1688l) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f4059l     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f20219l = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.f20218l     // Catch: java.lang.Throwable -> L20
            lؚؓٔ r10 = (defpackage.ExecutorC1688l) r10     // Catch: java.lang.Throwable -> L20
            r10.f4058l = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f20219l     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
        L55:
            r10.f20219l = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L83
        L5a:
            r0 = move-exception
            goto L7e
        L5c:
            r3 = move-exception
            lؘۖٝ r4 = defpackage.ExecutorC1688l.f4057l     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Logger r4 = r4.yandex()     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f20219l     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7e:
            r10.f20219l = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L83:
            if (r1 == 0) goto L8c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L8c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC9929l.billing():void");
    }

    private final void crashlytics() {
        try {
            ((Runnable) this.f20218l).run();
            synchronized (((ExecutorC8064l) this.f20219l).f16796l) {
                ((ExecutorC8064l) this.f20219l).loadAd();
            }
        } catch (Throwable th) {
            synchronized (((ExecutorC8064l) this.f20219l).f16796l) {
                ((ExecutorC8064l) this.f20219l).loadAd();
                throw th;
            }
        }
    }

    private final void loadAd() {
        try {
            purchase();
        } catch (Error e) {
            synchronized (((ExecutorC17352l) this.f20218l).f33811l) {
                ((ExecutorC17352l) this.f20218l).f33810l = 1;
                throw e;
            }
        }
    }

    private final void yandex() {
        try {
            purchase();
        } catch (Error e) {
            synchronized (((ExecutorC1688l) this.f20218l).f4059l) {
                ((ExecutorC1688l) this.f20218l).f4058l = 1;
                throw e;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r1 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        ((java.lang.Runnable) r10.f20219l).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        defpackage.ExecutorC17352l.f33809l.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f20219l), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        r10.f20219l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void purchase() {
        /*
            r10 = this;
            int r0 = r10.f20220l
            switch(r0) {
                case 16: goto L8e;
                default: goto L5;
            }
        L5:
            r0 = 0
            r1 = r0
        L7:
            java.lang.Object r2 = r10.f20218l     // Catch: java.lang.Throwable -> L5d
            lٗۘؖ r2 = (defpackage.ExecutorC17352l) r2     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayDeque r2 = r2.f33811l     // Catch: java.lang.Throwable -> L5d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5d
            r3 = 1
            if (r0 != 0) goto L31
            java.lang.Object r0 = r10.f20218l     // Catch: java.lang.Throwable -> L25
            lٗۘؖ r0 = (defpackage.ExecutorC17352l) r0     // Catch: java.lang.Throwable -> L25
            int r4 = r0.f33810l     // Catch: java.lang.Throwable -> L25
            r5 = 4
            if (r4 != r5) goto L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L4b
        L1d:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L4b
        L25:
            r10 = move-exception
            goto L82
        L27:
            long r6 = r0.f33814l     // Catch: java.lang.Throwable -> L25
            r8 = 1
            long r6 = r6 + r8
            r0.f33814l = r6     // Catch: java.lang.Throwable -> L25
            r0.f33810l = r5     // Catch: java.lang.Throwable -> L25
            r0 = r3
        L31:
            java.lang.Object r4 = r10.f20218l     // Catch: java.lang.Throwable -> L25
            lٗۘؖ r4 = (defpackage.ExecutorC17352l) r4     // Catch: java.lang.Throwable -> L25
            java.util.ArrayDeque r4 = r4.f33811l     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L25
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L25
            r10.f20219l = r4     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L4c
            java.lang.Object r10 = r10.f20218l     // Catch: java.lang.Throwable -> L25
            lٗۘؖ r10 = (defpackage.ExecutorC17352l) r10     // Catch: java.lang.Throwable -> L25
            r10.f33810l = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L4b
            goto L1d
        L4b:
            return
        L4c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5d
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f20219l     // Catch: java.lang.Throwable -> L5f java.lang.RuntimeException -> L61
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5f java.lang.RuntimeException -> L61
            r3.run()     // Catch: java.lang.Throwable -> L5f java.lang.RuntimeException -> L61
        L5a:
            r10.f20219l = r2     // Catch: java.lang.Throwable -> L5d
            goto L7
        L5d:
            r10 = move-exception
            goto L84
        L5f:
            r0 = move-exception
            goto L7f
        L61:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.ExecutorC17352l.f33809l     // Catch: java.lang.Throwable -> L5f
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r6.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r10.f20219l     // Catch: java.lang.Throwable -> L5f
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5f
            r6.append(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5f
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5f
            goto L5a
        L7f:
            r10.f20219l = r2     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        L82:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r10     // Catch: java.lang.Throwable -> L5d
        L84:
            if (r1 == 0) goto L8d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L8d:
            throw r10
        L8e:
            r10.billing()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC9929l.purchase():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC17433l interfaceC17433l;
        C17651l c17651l;
        C12552l c12552l;
        int i;
        int[] iArr;
        Throwable thMetrica;
        InterfaceC12652l interfaceC12652l;
        InterfaceC12652l c1548l;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 1;
        int i3 = 0;
        try {
            switch (this.f20220l) {
                case 0:
                    InterfaceC14606l interfaceC14606l = (InterfaceC14606l) this.f20218l;
                    try {
                        interfaceC14606l.amazon(AbstractC11356l.amazon((Future) this.f20219l));
                        return;
                    } catch (Error e) {
                        e = e;
                        interfaceC14606l.mopub(e);
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        interfaceC14606l.mopub(e);
                        return;
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            interfaceC14606l.mopub(e3);
                            return;
                        } else {
                            interfaceC14606l.mopub(cause);
                            return;
                        }
                    }
                case 1:
                    C14858l c14858l = (C14858l) this.f20219l;
                    C0791l c0791l = (C0791l) this.f20218l;
                    MenuC4984l menuC4984l = c0791l.f2386l;
                    if (menuC4984l != null && (interfaceC17433l = menuC4984l.f10202l) != null) {
                        interfaceC17433l.billing(menuC4984l);
                    }
                    View view = (View) c0791l.f2390l;
                    if (view != null && view.getWindowToken() != null) {
                        if (c14858l.loadAd()) {
                            c0791l.f2394l = c14858l;
                        } else if (c14858l.purchase != null) {
                            c14858l.amazon(0, 0, false, false);
                            c0791l.f2394l = c14858l;
                        }
                    }
                    c0791l.f2388l = null;
                    return;
                case 2:
                    ((C12321l) this.f20219l).f24402l = this.f20218l;
                    return;
                case 3:
                    ((Application) this.f20219l).unregisterActivityLifecycleCallbacks((C12321l) this.f20218l);
                    return;
                case 4:
                    Object obj = this.f20218l;
                    Object obj2 = this.f20219l;
                    try {
                        Method method = AbstractC9279l.amazon;
                        if (method != null) {
                            method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            AbstractC9279l.purchase.invoke(obj2, obj, Boolean.FALSE);
                        }
                        return;
                    } catch (RuntimeException e4) {
                        if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                            throw e4;
                        }
                        return;
                    } catch (Throwable th) {
                        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                        return;
                    }
                case 5:
                    RunnableC15098l runnableC15098l = (RunnableC15098l) this.f20218l;
                    C12552l c12552l2 = (C12552l) runnableC15098l.f29632l;
                    if (c12552l2.mopub == runnableC15098l.f29630l) {
                        List list = (List) runnableC15098l.f29633l;
                        C17651l c17651l2 = (C17651l) this.f20219l;
                        c12552l2.purchase = list;
                        c12552l2.billing = DesugarCollections.unmodifiableList(list);
                        C5008l c5008l = c12552l2.yandex;
                        int[] iArr2 = (int[]) c17651l2.f34338l;
                        ArrayList arrayList = (ArrayList) c17651l2.f34339l;
                        int i4 = c17651l2.f34337l;
                        C13161l c13161l = (C13161l) c17651l2.f34335l;
                        C8071l c8071l = new C8071l(c5008l);
                        ArrayDeque arrayDeque = new ArrayDeque();
                        int i5 = c17651l2.f34336l;
                        int size = arrayList.size() - 1;
                        int i6 = i5;
                        int i7 = i4;
                        while (size >= 0) {
                            C10384l c10384l = (C10384l) arrayList.get(size);
                            int i8 = c10384l.yandex;
                            int i9 = c10384l.crashlytics;
                            int i10 = i2;
                            int i11 = i8 + i9;
                            int i12 = c10384l.loadAd;
                            int i13 = i12 + i9;
                            while (i7 > i11) {
                                i7--;
                                int i14 = iArr2[i7];
                                if ((i14 & 12) != 0) {
                                    c12552l = c12552l2;
                                    int i15 = i14 >> 4;
                                    i = i11;
                                    iArr = iArr2;
                                    C8642l c8642lLoadAd = C17651l.loadAd(arrayDeque, i15, false);
                                    if (c8642lLoadAd != null) {
                                        int i16 = (i4 - c8642lLoadAd.loadAd) - 1;
                                        c8071l.crashlytics(i7, i16);
                                        if ((i14 & 4) != 0) {
                                            c13161l.admob(i7, i15);
                                            c8071l.ads(i16, i10);
                                        }
                                    } else {
                                        boolean z5 = i10;
                                        arrayDeque.add(new C8642l(i7, (i4 - i7) - (z5 ? 1 : 0), z5));
                                    }
                                } else {
                                    c12552l = c12552l2;
                                    i = i11;
                                    iArr = iArr2;
                                    c8071l.remoteconfig(i7, i10);
                                    i4--;
                                }
                                i11 = i;
                                c12552l2 = c12552l;
                                iArr2 = iArr;
                                i10 = 1;
                            }
                            C12552l c12552l3 = c12552l2;
                            int[] iArr3 = iArr2;
                            while (i6 > i13) {
                                i6--;
                                int i17 = ((int[]) c17651l2.f34340l)[i6];
                                if ((i17 & 12) != 0) {
                                    int i18 = i17 >> 4;
                                    c17651l = c17651l2;
                                    C8642l c8642lLoadAd2 = C17651l.loadAd(arrayDeque, i18, true);
                                    if (c8642lLoadAd2 == null) {
                                        arrayDeque.add(new C8642l(i6, i4 - i7, false));
                                    } else {
                                        c8071l.crashlytics((i4 - c8642lLoadAd2.loadAd) - 1, i7);
                                        if ((i17 & 4) != 0) {
                                            c13161l.admob(i18, i6);
                                            c8071l.ads(i7, 1);
                                        }
                                    }
                                } else {
                                    c17651l = c17651l2;
                                    c8071l.admob(i7, 1);
                                    i4++;
                                }
                                c17651l2 = c17651l;
                            }
                            C17651l c17651l3 = c17651l2;
                            int i19 = i12;
                            int i20 = i8;
                            for (int i21 = 0; i21 < i9; i21++) {
                                if ((iArr3[i20] & 15) == 2) {
                                    c13161l.admob(i20, i19);
                                    c8071l.ads(i20, 1);
                                }
                                i20++;
                                i19++;
                            }
                            size--;
                            c17651l2 = c17651l3;
                            i6 = i12;
                            i7 = i8;
                            c12552l2 = c12552l3;
                            iArr2 = iArr3;
                            i2 = 1;
                        }
                        c8071l.yandex();
                        c12552l2.yandex();
                        return;
                    }
                    return;
                case 6:
                    C10685l c10685l = (C10685l) this.f20219l;
                    Typeface typeface = (Typeface) this.f20218l;
                    AbstractC16763l abstractC16763l = (AbstractC16763l) c10685l.f21690l;
                    if (abstractC16763l != null) {
                        abstractC16763l.vip(typeface);
                        return;
                    }
                    return;
                case 7:
                    try {
                        try {
                            RunnableC9823l runnableC9823l = (RunnableC9823l) this.f20218l;
                            Object objBilling = AbstractC11356l.billing((ListenableFuture) this.f20219l);
                            C5807l c5807l = runnableC9823l.f31053l;
                            if (c5807l != null) {
                                c5807l.loadAd(objBilling);
                            }
                        } catch (ExecutionException e5) {
                            RunnableC9823l runnableC9823l2 = (RunnableC9823l) this.f20218l;
                            Throwable cause2 = e5.getCause();
                            C5807l c5807l2 = runnableC9823l2.f31053l;
                            if (c5807l2 != null) {
                                c5807l2.amazon(cause2);
                            }
                        }
                        break;
                    } catch (CancellationException unused) {
                        ((RunnableC9823l) this.f20218l).cancel(false);
                    }
                    return;
                case 8:
                    C14513l c14513lTapsense = C14513l.tapsense();
                    String str = C0375l.purchase;
                    StringBuilder sb = new StringBuilder("Scheduling work ");
                    C7718l c7718l = (C7718l) this.f20219l;
                    sb.append(c7718l.yandex);
                    c14513lTapsense.vip(str, sb.toString());
                    ((C0375l) this.f20218l).yandex.purchase(c7718l);
                    return;
                case 9:
                    InterfaceC4930l interfaceC4930l = (InterfaceC4930l) this.f20218l;
                    Future future = (Future) this.f20219l;
                    if ((future instanceof AbstractC2722l) && (thMetrica = ((AbstractC2722l) future).metrica()) != null) {
                        interfaceC4930l.mopub(thMetrica);
                        return;
                    }
                    try {
                        interfaceC4930l.amazon(AbstractC7151l.crashlytics(future));
                        return;
                    } catch (ExecutionException e6) {
                        interfaceC4930l.mopub(e6.getCause());
                        return;
                    } catch (Throwable th2) {
                        interfaceC4930l.mopub(th2);
                        return;
                    }
                case 10:
                    C9603l c9603l = (C9603l) this.f20219l;
                    C16678l c16678l = (C16678l) this.f20218l;
                    RecyclerView recyclerView = c16678l.ads;
                    if (recyclerView == null || !recyclerView.isAttachedToWindow() || c9603l.firebase || c9603l.purchase.loadAd() == -1) {
                        return;
                    }
                    AbstractC13735l itemAnimator = c16678l.ads.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.billing()) {
                        ArrayList arrayList2 = c16678l.startapp;
                        int size2 = arrayList2.size();
                        while (i3 < size2) {
                            if (((C9603l) arrayList2.get(i3)).smaato) {
                                i3++;
                            }
                        }
                        c16678l.remoteconfig.getClass();
                        return;
                    }
                    c16678l.ads.post(this);
                    return;
                case 11:
                    while (true) {
                        try {
                            ((Runnable) this.f20219l).run();
                        } catch (Throwable th3) {
                            AbstractC11738l.loadAd(C17218l.f33421l, th3);
                        }
                        try {
                            Runnable runnableM3371l = ((C12286l) this.f20218l).m3371l();
                            if (runnableM3371l == null) {
                                return;
                            }
                            this.f20219l = runnableM3371l;
                            i3++;
                            if (i3 >= 16) {
                                C12286l c12286l = (C12286l) this.f20218l;
                                if (AbstractC9853l.crashlytics(c12286l.f24356l, c12286l)) {
                                    C12286l c12286l2 = (C12286l) this.f20218l;
                                    AbstractC9853l.loadAd(c12286l2.f24356l, c12286l2, this);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            C12286l c12286l3 = (C12286l) this.f20218l;
                            synchronized (c12286l3.f24354l) {
                                C12286l.f24352l.decrementAndGet(c12286l3);
                                throw th4;
                            }
                        }
                        break;
                    }
                    break;
                case 12:
                    C12014l c12014l = (C12014l) this.f20218l;
                    C5057l c5057l = (C5057l) this.f20219l;
                    ArrayList arrayList3 = (ArrayList) c12014l.f23941l;
                    if (!arrayList3.isEmpty()) {
                        InterfaceC10867l interfaceC10867lYandex = c5057l.yandex();
                        if (interfaceC10867lYandex != null) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ((Bundle) it.next()).putBinder("extra_session_binder", interfaceC10867lYandex.asBinder());
                            }
                        }
                        arrayList3.clear();
                    }
                    C14932l c14932l = (C14932l) c12014l.f23940l;
                    c14932l.getClass();
                    c14932l.setSessionToken(c5057l.f10328l);
                    return;
                case 13:
                    IBinder binder = ((Messenger) ((C15053l) this.f20219l).f29576l).getBinder();
                    C7996l c7996l = (C7996l) ((ServiceC16415l) ((C5008l) this.f20218l).f10245l).f32110l.remove(binder);
                    if (c7996l != null) {
                        binder.unlinkToDeath(c7996l, 0);
                        return;
                    }
                    return;
                case 14:
                    ((C3789l) this.f20219l).accept(this.f20218l);
                    return;
                case 15:
                    ((C2397l) this.f20218l).m1132synchronized((C2325l) this.f20219l, Unit.INSTANCE);
                    return;
                case 16:
                    yandex();
                    return;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    loadAd();
                    return;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    crashlytics();
                    return;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    C0213l c0213l = ((SwipeDismissBehavior) this.f20218l).yandex;
                    if (c0213l == null || !c0213l.billing()) {
                        return;
                    }
                    View view2 = (View) this.f20219l;
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    view2.postOnAnimation(this);
                    return;
                case 20:
                    amazon();
                    return;
                case 21:
                    AbstractC2722l abstractC2722l = (AbstractC2722l) this.f20219l;
                    boolean zIsCancelled = abstractC2722l.isCancelled();
                    C2397l c2397l = (C2397l) this.f20218l;
                    if (zIsCancelled) {
                        c2397l.yandex(null);
                        return;
                    }
                    try {
                        c2397l.subs(AbstractC11342l.billing(abstractC2722l));
                        return;
                    } catch (ExecutionException e7) {
                        c2397l.subs(new C18435l(e7.getCause()));
                        return;
                    }
                case 22:
                    C10602l c10602l = (C10602l) this.f20219l;
                    C16557l c16557l = (C16557l) this.f20218l;
                    C14138l c14138l = (C14138l) c16557l.f32507l;
                    InterfaceC1168l interfaceC1168l = (InterfaceC1168l) c16557l.f32502l;
                    C3714l c3714l = (C3714l) c14138l.f27644l.get((C7800l) c16557l.f32503l);
                    if (c3714l == null) {
                        return;
                    }
                    if (c10602l.f21520l != 0) {
                        c3714l.metrica(c10602l, null);
                        return;
                    }
                    c16557l.f32504l = true;
                    if (interfaceC1168l.crashlytics()) {
                        if (!c16557l.f32504l || (interfaceC12652l = (InterfaceC12652l) c16557l.f32506l) == null) {
                            return;
                        }
                        ((AbstractC4620l) interfaceC1168l).remoteconfig(interfaceC12652l, (Set) c16557l.f32505l);
                        return;
                    }
                    try {
                        AbstractC18433l abstractC18433l = (AbstractC18433l) interfaceC1168l;
                        ((AbstractC4620l) interfaceC1168l).remoteconfig(null, abstractC18433l.crashlytics() ? abstractC18433l.signatures : Collections.EMPTY_SET);
                        return;
                    } catch (SecurityException e8) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
                        ((AbstractC4620l) interfaceC1168l).mopub("Failed to get service from broker.");
                        c3714l.metrica(new C10602l(10, null, null), null);
                        return;
                    }
                case 23:
                    C18096l c18096l = (C18096l) this.f20219l;
                    InterfaceC6795l interfaceC6795l = (InterfaceC6795l) this.f20218l;
                    C12648l c12648l = (C12648l) c18096l.loadAd;
                    if (c12648l == null) {
                        return;
                    }
                    interfaceC6795l.yandex(c12648l.yandex);
                    return;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    BinderC17532l binderC17532l = (BinderC17532l) this.f20218l;
                    C8074l c8074l = (C8074l) this.f20219l;
                    binderC17532l.getClass();
                    C10602l c10602l2 = c8074l.f16839l;
                    if (c10602l2.f21520l == 0) {
                        C16785l c16785l = c8074l.f16838l;
                        AbstractC1051l.subs(c16785l);
                        C10602l c10602l3 = c16785l.f32791l;
                        if (c10602l3.f21520l != 0) {
                            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c10602l3)), new Exception());
                            binderC17532l.smaato.amazon(c10602l3);
                            binderC17532l.firebase.billing();
                            return;
                        }
                        C16557l c16557l2 = binderC17532l.smaato;
                        IBinder iBinder = c16785l.f32792l;
                        if (iBinder == null) {
                            c1548l = null;
                        } else {
                            int i22 = AbstractBinderC14321l.billing;
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            c1548l = iInterfaceQueryLocalInterface instanceof InterfaceC12652l ? (InterfaceC12652l) iInterfaceQueryLocalInterface : new C1548l(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                        }
                        Set set = binderC17532l.subs;
                        c16557l2.getClass();
                        if (c1548l == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            c16557l2.amazon(new C10602l(4, null, null));
                        } else {
                            c16557l2.f32506l = c1548l;
                            c16557l2.f32505l = set;
                            if (c16557l2.f32504l) {
                                ((AbstractC4620l) ((InterfaceC1168l) c16557l2.f32502l)).remoteconfig(c1548l, set);
                            }
                        }
                    } else {
                        binderC17532l.smaato.amazon(c10602l2);
                    }
                    binderC17532l.firebase.billing();
                    return;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    InterfaceC17182l interfaceC17182l = (InterfaceC17182l) this.f20219l;
                    interfaceC17182l.mo234package();
                    if (C6162l.tapsense()) {
                        interfaceC17182l.mo224l().m4449l(this);
                        return;
                    }
                    AbstractC9654l abstractC9654l = (AbstractC9654l) this.f20218l;
                    i2 = abstractC9654l.crashlytics == 0 ? 0 : 1;
                    abstractC9654l.crashlytics = 0L;
                    if (i2 != 0) {
                        abstractC9654l.yandex();
                        return;
                    }
                    return;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.f20219l;
                    while (!((Set) this.f20218l).isEmpty()) {
                        try {
                            C7345l c7345l = (C7345l) referenceQueue.remove();
                            if (c7345l.yandex.remove(c7345l)) {
                                c7345l.clear();
                                c7345l.loadAd.getClass();
                            }
                        } catch (InterruptedException unused2) {
                        }
                    }
                    return;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    C16014l c16014l = ((BinderC3747l) this.f20219l).mopub;
                    C3882l c3882l = (C3882l) this.f20218l;
                    C1021l c1021l = c16014l.appmetrica;
                    C5040l c5040l = c3882l.f8019l;
                    C10121l c10121l = c3882l.f8020l;
                    if (!AbstractC15091l.crashlytics(c5040l, c16014l.tapsense)) {
                        c16014l.tapsense = c5040l;
                        c1021l.crashlytics();
                    }
                    double d = c3882l.f8017l;
                    if (Double.isNaN(d) || Math.abs(d - c16014l.license) <= 1.0E-7d) {
                        z = false;
                    } else {
                        c16014l.license = d;
                        z = true;
                    }
                    boolean z6 = c3882l.f8016l;
                    if (z6 != c16014l.pro) {
                        c16014l.pro = z6;
                        z = true;
                    }
                    C0022l c0022l = C16014l.f31391package;
                    c0022l.loadAd("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c16014l.remoteconfig));
                    if (c1021l != null && (z || c16014l.remoteconfig)) {
                        c1021l.billing();
                    }
                    Double.isNaN(c3882l.f8015l);
                    int i23 = c3882l.f8014l;
                    if (i23 != c16014l.ad) {
                        c16014l.ad = i23;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c0022l.loadAd("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(c16014l.remoteconfig));
                    if (c1021l != null && (z2 || c16014l.remoteconfig)) {
                        c1021l.yandex();
                    }
                    int i24 = c3882l.f8018l;
                    if (i24 != c16014l.advert) {
                        c16014l.advert = i24;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c0022l.loadAd("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(c16014l.remoteconfig));
                    if (c1021l != null && (z3 || c16014l.remoteconfig)) {
                        c1021l.purchase();
                    }
                    if (!AbstractC15091l.crashlytics(c16014l.isVip, c10121l)) {
                        c16014l.isVip = c10121l;
                    }
                    c16014l.remoteconfig = false;
                    return;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    C16014l c16014l2 = ((BinderC3747l) this.f20219l).mopub;
                    C13853l c13853l = (C13853l) this.f20218l;
                    c16014l2.getClass();
                    String str2 = c13853l.f27090l;
                    if (AbstractC15091l.crashlytics(str2, c16014l2.Signature)) {
                        z4 = false;
                    } else {
                        c16014l2.Signature = str2;
                        z4 = true;
                    }
                    C16014l.f31391package.loadAd("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(c16014l2.vip));
                    C1021l c1021l2 = c16014l2.appmetrica;
                    if (c1021l2 != null && (z4 || c16014l2.vip)) {
                        c1021l2.amazon();
                    }
                    c16014l2.vip = false;
                    return;
                default:
                    ((BinderC2728l) this.f20219l).m1242l((C16710l) this.f20218l);
                    return;
            }
        } finally {
            ((RunnableC9823l) this.f20218l).f20010l = null;
        }
    }

    public String toString() {
        int i = this.f20220l;
        String str = "IDLE";
        Object obj = this.f20218l;
        switch (i) {
            case 0:
                return RunnableC9929l.class.getSimpleName() + "," + ((InterfaceC14606l) obj);
            case 9:
                C18449l c18449lBilling = AbstractC11999l.billing(this);
                C10111l c10111l = new C10111l(25, false);
                ((C10111l) c18449lBilling.f36012l).f20589l = c10111l;
                c18449lBilling.f36012l = c10111l;
                c10111l.f20586l = (InterfaceC4930l) obj;
                return c18449lBilling.toString();
            case 16:
                Runnable runnable = (Runnable) this.f20219l;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((ExecutorC1688l) obj).f4058l;
                if (i2 != 1) {
                    if (i2 == 2) {
                        str = "QUEUING";
                    } else if (i2 != 3) {
                        str = i2 != 4 ? "null" : "RUNNING";
                    } else {
                        str = "QUEUED";
                    }
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Runnable runnable2 = (Runnable) this.f20219l;
                if (runnable2 != null) {
                    return "SequentialExecutorWorker{running=" + runnable2 + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i3 = ((ExecutorC17352l) obj).f33810l;
                if (i3 != 1) {
                    if (i3 == 2) {
                        str = "QUEUING";
                    } else if (i3 != 3) {
                        str = i3 != 4 ? "null" : "RUNNING";
                    } else {
                        str = "QUEUED";
                    }
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC9929l(Object obj, Object obj2, int i) {
        this.f20220l = i;
        this.f20219l = obj;
        this.f20218l = obj2;
    }

    public /* synthetic */ RunnableC9929l(Object obj, Object obj2, boolean z, int i) {
        this.f20220l = i;
        this.f20218l = obj;
        this.f20219l = obj2;
    }

    public /* synthetic */ RunnableC9929l(int i, Executor executor) {
        this.f20220l = i;
        this.f20218l = executor;
    }

    public RunnableC9929l(C16678l c16678l, C9603l c9603l, int i) {
        this.f20220l = 10;
        this.f20218l = c16678l;
        this.f20219l = c9603l;
    }
}
