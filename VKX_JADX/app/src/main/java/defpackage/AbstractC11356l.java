package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: lُۜۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11356l {
    public static C5197l yandex;

    public static ListenableFuture admob(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return listenableFuture.isDone() ? listenableFuture : AbstractC11064l.purchase(new C6536l(2, listenableFuture));
    }

    public static Object amazon(Future future) {
        AbstractC5641l.purchase("Future was expected to be done, " + future, future.isDone());
        return billing(future);
    }

    public static Object billing(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final C5197l crashlytics() {
        C5197l c5197l = yandex;
        if (c5197l != null) {
            return c5197l;
        }
        C10943l c10943l = new C10943l("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC8192l.yandex;
        C8990l c8990l = new C8990l(C9735l.loadAd);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C16574l(9.0f, 16.17f));
        arrayList.add(new C2789l(4.83f, 12.0f));
        arrayList.add(new C0550l(-1.42f, 1.41f));
        arrayList.add(new C2789l(9.0f, 19.0f));
        arrayList.add(new C2789l(21.0f, 7.0f));
        arrayList.add(new C0550l(-1.41f, -1.41f));
        arrayList.add(C10766l.crashlytics);
        C10943l.yandex(c10943l, arrayList, c8990l);
        C5197l c5197lLoadAd = c10943l.loadAd();
        yandex = c5197lLoadAd;
        return c5197lLoadAd;
    }

    public static void firebase(List list, InterfaceC0629l interfaceC0629l, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (interfaceC0629l.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static void isPro(boolean z, ListenableFuture listenableFuture, C5807l c5807l, ExecutorC12908l executorC12908l) {
        listenableFuture.getClass();
        c5807l.getClass();
        executorC12908l.getClass();
        int i = 0;
        listenableFuture.yandex(new RunnableC9929l(listenableFuture, new C16543l(12, c5807l), i), executorC12908l);
        if (z) {
            c5807l.yandex(new RunnableC6011l(i, listenableFuture), AbstractC12272l.yandex());
        }
    }

    public static final InterfaceC2851l loadAd(C14649l c14649l) {
        return c14649l.purchase().yandex();
    }

    public static C11077l mopub(Object obj) {
        return obj == null ? C11077l.f22285l : new C11077l(0, obj);
    }

    public static Object purchase(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        C4875l.firebase();
        return null;
    }

    public static RunnableC9823l smaato(ListenableFuture listenableFuture, InterfaceC5246l interfaceC5246l, Executor executor) {
        RunnableC9823l runnableC9823l = new RunnableC9823l(interfaceC5246l, listenableFuture);
        listenableFuture.yandex(runnableC9823l, executor);
        return runnableC9823l;
    }

    public static void subs(ListenableFuture listenableFuture, C5807l c5807l) {
        isPro(true, listenableFuture, c5807l, AbstractC12272l.yandex());
    }

    public static HashMap yandex(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map map) {
        boolean z2 = false;
        AbstractC5641l.loadAd(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((C5464l) entry.getValue()).yandex.getWidth(), ((C5464l) entry.getValue()).yandex.getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((AbstractC6896l) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rationalAmazon = AbstractC16947l.amazon(i, rational);
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, rationalAmazon.getNumerator(), rationalAmazon.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    C8339l.smaato(AbstractC0653l.vip(i2, "Unexpected scale type: "));
                    return null;
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z3 = z ^ (i3 == 1);
            boolean z4 = i == 0 && !z3;
            boolean z5 = i == 90 && z3;
            if (z4 || z5) {
                rectF2 = rectF6;
            } else {
                boolean z6 = i == 0 && z3;
                boolean z7 = i == 270 && !z3;
                if (z6 || z7) {
                    float fCenterX = rectF2.centerX();
                    float f = fCenterX + fCenterX;
                    rectF2 = new RectF(f - rectF6.right, rectF6.top, f - rectF6.left, rectF6.bottom);
                } else {
                    boolean z8 = i == 90 && !z3;
                    boolean z9 = i == 180 && z3;
                    if (z8 || z9) {
                        float fCenterY = rectF2.centerY();
                        float f2 = fCenterY + fCenterY;
                        rectF2 = new RectF(rectF6.left, f2 - rectF6.bottom, rectF6.right, f2 - rectF6.top);
                    } else {
                        boolean z10 = i == 180 && !z3;
                        if (i == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i);
                        }
                        float fCenterY2 = rectF2.centerY();
                        float f3 = fCenterY2 + fCenterY2;
                        RectF rectF7 = new RectF(rectF6.left, f3 - rectF6.bottom, rectF6.right, f3 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f4 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f4 - rectF7.right, rectF7.top, f4 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            map3.put((AbstractC6896l) entry2.getKey(), rect2);
        }
        return map3;
    }
}
