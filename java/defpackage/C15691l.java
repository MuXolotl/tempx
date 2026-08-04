package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٕٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15691l {
    public static final Range adcel = C5464l.admob;
    public final C16565l admob;
    public final Range amazon;
    public final boolean billing;
    public final C15421l crashlytics;
    public final C5807l firebase;
    public final C16565l isPro;
    public final Size loadAd;
    public InterfaceC2792l metrica;
    public final int mopub;
    public final InterfaceC18690l purchase;
    public final C5571l remoteconfig;
    public final C5807l smaato;
    public Executor startapp;
    public final C5807l subs;
    public C13808l vip;
    public final Object yandex = new Object();

    public C15691l(Size size, InterfaceC18690l interfaceC18690l, boolean z, C15421l c15421l, int i, Range range, RunnableC2289l runnableC2289l) {
        this.loadAd = size;
        this.purchase = interfaceC18690l;
        this.billing = z;
        AbstractC5641l.loadAd(c15421l.loadAd(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.crashlytics = c15421l;
        this.mopub = i;
        this.amazon = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            atomicReference.set(c5807l);
            c5807l.yandex = str.concat("-cancellation");
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        C5807l c5807l2 = (C5807l) atomicReference.get();
        c5807l2.getClass();
        this.smaato = c5807l2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        C5807l c5807l3 = new C5807l();
        c5807l3.crashlytics = new C0011l();
        C16565l c16565l2 = new C16565l(c5807l3);
        c5807l3.loadAd = c16565l2;
        c5807l3.yandex = AbstractC5020l.class;
        try {
            atomicReference2.set(c5807l3);
            c5807l3.yandex = str.concat("-status");
        } catch (Exception e2) {
            c16565l2.loadAd(e2);
        }
        this.isPro = c16565l2;
        int i2 = 0;
        c16565l2.yandex(new RunnableC9929l(c16565l2, new C13568l(c5807l2, c16565l, 20), i2), AbstractC12272l.yandex());
        C5807l c5807l4 = (C5807l) atomicReference2.get();
        c5807l4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        C5807l c5807l5 = new C5807l();
        c5807l5.crashlytics = new C0011l();
        C16565l c16565l3 = new C16565l(c5807l5);
        c5807l5.loadAd = c16565l3;
        c5807l5.yandex = AbstractC5020l.class;
        try {
            atomicReference3.set(c5807l5);
            c5807l5.yandex = str.concat("-Surface");
        } catch (Exception e3) {
            c16565l3.loadAd(e3);
        }
        this.admob = c16565l3;
        C5807l c5807l6 = (C5807l) atomicReference3.get();
        c5807l6.getClass();
        this.subs = c5807l6;
        C5571l c5571l = new C5571l(this, size);
        this.remoteconfig = c5571l;
        ListenableFuture listenableFutureAdmob = AbstractC11356l.admob(c5571l.purchase);
        c16565l3.yandex(new RunnableC9929l(c16565l3, new C12418l(listenableFutureAdmob, c5807l4, str, 8), i2), AbstractC12272l.yandex());
        listenableFutureAdmob.yandex(new RunnableC9179l(this, 1), AbstractC12272l.yandex());
        ExecutorC12908l executorC12908lYandex = AbstractC12272l.yandex();
        AtomicReference atomicReference4 = new AtomicReference(null);
        C16565l c16565lPurchase = AbstractC11064l.purchase(new C15263l(this, atomicReference4, 21));
        c16565lPurchase.yandex(new RunnableC9929l(c16565lPurchase, new C5501l(27, runnableC2289l), i2), executorC12908lYandex);
        C5807l c5807l7 = (C5807l) atomicReference4.get();
        c5807l7.getClass();
        this.firebase = c5807l7;
    }

    public final boolean crashlytics() {
        return this.subs.amazon(new C10756l("Surface request will not complete.", 4));
    }

    public final void loadAd(Executor executor, InterfaceC2792l interfaceC2792l) {
        C13808l c13808l;
        synchronized (this.yandex) {
            this.metrica = interfaceC2792l;
            this.startapp = executor;
            c13808l = this.vip;
        }
        if (c13808l != null) {
            executor.execute(new RunnableC0354l(interfaceC2792l, c13808l, 1));
        }
    }

    public final void yandex(final Surface surface, Executor executor, final InterfaceC13241l interfaceC13241l) {
        final int i = 0;
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: lُۢؕ
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    Surface surface2 = surface;
                    InterfaceC13241l interfaceC13241l2 = interfaceC13241l;
                    switch (i2) {
                        case 0:
                            interfaceC13241l2.accept(new C7478l(2, surface2));
                            break;
                        case 1:
                            interfaceC13241l2.accept(new C7478l(3, surface2));
                            break;
                        default:
                            interfaceC13241l2.accept(new C7478l(4, surface2));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.subs.loadAd(surface)) {
            C16565l c16565l = this.admob;
            if (!c16565l.isCancelled()) {
                AbstractC5641l.purchase(null, c16565l.f32512l.isDone());
                try {
                    c16565l.get();
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: lُۢؕ
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            Surface surface2 = surface;
                            InterfaceC13241l interfaceC13241l2 = interfaceC13241l;
                            switch (i3) {
                                case 0:
                                    interfaceC13241l2.accept(new C7478l(2, surface2));
                                    break;
                                case 1:
                                    interfaceC13241l2.accept(new C7478l(3, surface2));
                                    break;
                                default:
                                    interfaceC13241l2.accept(new C7478l(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i3 = 2;
                    executor.execute(new Runnable() { // from class: lُۢؕ
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            Surface surface2 = surface;
                            InterfaceC13241l interfaceC13241l2 = interfaceC13241l;
                            switch (i4) {
                                case 0:
                                    interfaceC13241l2.accept(new C7478l(2, surface2));
                                    break;
                                case 1:
                                    interfaceC13241l2.accept(new C7478l(3, surface2));
                                    break;
                                default:
                                    interfaceC13241l2.accept(new C7478l(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        C13645l c13645l = new C13645l(interfaceC13241l, surface, 18);
        C16565l c16565l2 = this.isPro;
        c16565l2.yandex(new RunnableC9929l(c16565l2, c13645l, i), executor);
    }
}
