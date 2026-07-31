package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lٗؐۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC16824l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f32845l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32846l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32847l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f32848l;

    public RunnableC16824l(C13745l c13745l, int i, ListenableFuture listenableFuture) {
        this.f32847l = 2;
        this.f32848l = c13745l;
        this.f32846l = i;
        this.f32845l = listenableFuture;
    }

    private final /* synthetic */ void yandex() {
        BinderC2728l binderC2728l = (BinderC2728l) this.f32845l;
        C16710l c16710l = (C16710l) this.f32848l;
        int i = this.f32846l;
        synchronized (binderC2728l.admob) {
            binderC2728l.m1244l(c16710l, i);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        C5807l c5807l;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        C3823l c3823l;
        boolean z = true;
        switch (this.f32847l) {
            case 0:
                ((TextView) this.f32845l).setTypeface((Typeface) this.f32848l, this.f32846l);
                return;
            case 1:
                ((BottomSheetBehavior) this.f32848l).m177package((View) this.f32845l, this.f32846l, false);
                return;
            case 2:
                C13745l c13745l = (C13745l) this.f32848l;
                int i = this.f32846l;
                ListenableFuture listenableFuture = (ListenableFuture) this.f32845l;
                boolean z2 = c13745l.f26834l;
                AtomicInteger atomicInteger = c13745l.f26838l;
                ArrayList arrayList7 = c13745l.f26835l;
                if (c13745l.isDone() || arrayList7 == null) {
                    AbstractC5641l.purchase("Future was done before all dependencies completed", z2);
                    return;
                }
                try {
                    AbstractC5641l.purchase("Tried to set value from future which is not done", listenableFuture.isDone());
                    arrayList7.set(i, AbstractC11356l.billing(listenableFuture));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    AbstractC5641l.purchase("Less than 0 remaining futures", iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        if (arrayList6 != null) {
                            c5807l = c13745l.f26839l;
                            arrayList2 = new ArrayList(arrayList6);
                            c5807l.loadAd(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (ExecutionException e) {
                    if (z2) {
                        c13745l.f26839l.amazon(e.getCause());
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    AbstractC5641l.purchase("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                    if (iDecrementAndGet2 == 0) {
                        if (arrayList5 != null) {
                            c5807l = c13745l.f26839l;
                            arrayList2 = new ArrayList(arrayList5);
                        }
                        return;
                    }
                    return;
                } catch (Error e2) {
                    c13745l.f26839l.amazon(e2);
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    AbstractC5641l.purchase("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        if (arrayList4 != null) {
                            c5807l = c13745l.f26839l;
                            arrayList2 = new ArrayList(arrayList4);
                        }
                        return;
                    }
                    return;
                } catch (CancellationException unused) {
                    if (z2) {
                        c13745l.cancel(false);
                    }
                    int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                    AbstractC5641l.purchase("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                    if (iDecrementAndGet4 == 0) {
                        if (arrayList3 != null) {
                            c5807l = c13745l.f26839l;
                            arrayList2 = new ArrayList(arrayList3);
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e3) {
                    if (z2) {
                        c13745l.f26839l.amazon(e3);
                    }
                    int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                    AbstractC5641l.purchase("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                    if (iDecrementAndGet5 == 0) {
                        if (arrayList != null) {
                            c5807l = c13745l.f26839l;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } finally {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    AbstractC5641l.purchase("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList8 = c13745l.f26835l;
                        if (arrayList8 != null) {
                            c13745l.f26839l.loadAd(new ArrayList(arrayList8));
                        } else {
                            AbstractC5641l.purchase(null, c13745l.isDone());
                        }
                    }
                }
            case 3:
                yandex();
                return;
            default:
                C4039l c4039l = (C4039l) this.f32845l;
                C18278l c18278l = (C18278l) this.f32848l;
                int i2 = this.f32846l;
                C8930l c8930l = c4039l.admob;
                if (c8930l == null) {
                    return;
                }
                synchronized (c8930l) {
                    C2350l c2350l = new C2350l();
                    C7560l c7560l = c8930l.yandex;
                    c7560l.getClass();
                    C10147l c10147lYandex = C8662l.yandex();
                    c10147lYandex.yandex = new C15848l(2, c7560l);
                    c10147lYandex.purchase = 4501;
                    C3823l c3823lPurchase = c7560l.purchase(0, c10147lYandex.yandex());
                    C11262l c11262l = new C11262l(z ? 1 : 0, c2350l);
                    c3823lPurchase.getClass();
                    c3823lPurchase.billing(AbstractC8333l.yandex, c11262l);
                    c3823lPurchase.crashlytics(new C2290l(c2350l));
                    c8930l.crashlytics.postDelayed(new RunnableC9281l(1, c2350l), c8930l.loadAd * 1000);
                    c3823l = c2350l.yandex;
                }
                c3823l.purchase(new C2888l(c4039l, c18278l, i2));
                return;
        }
    }

    public /* synthetic */ RunnableC16824l(Object obj, Object obj2, int i, int i2) {
        this.f32847l = i2;
        this.f32845l = obj;
        this.f32848l = obj2;
        this.f32846l = i;
    }

    public RunnableC16824l(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f32847l = 1;
        this.f32848l = bottomSheetBehavior;
        this.f32845l = view;
        this.f32846l = i;
    }
}
