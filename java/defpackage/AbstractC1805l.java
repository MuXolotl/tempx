package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1805l {
    public static final C15578l yandex = new C15578l(1205460965, false, new C4076l(14));

    public static final long amazon() {
        return Thread.currentThread().getId();
    }

    public static List billing(List list, int i, Rect rect, Rational rational, int i2, InterfaceC4446l interfaceC4446l) {
        PointF pointF;
        if (list.isEmpty() || i == 0) {
            return C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5071l c5071l = (C5071l) it.next();
            if (arrayList.size() >= i) {
                break;
            }
            float f = c5071l.yandex;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = c5071l.loadAd;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    Rational rational3 = c5071l.amazon;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointFLoadAd = interfaceC4446l.loadAd(c5071l, i2);
                    if (rational3.equals(rational2)) {
                        pointF = new PointF(pointFLoadAd.x, pointFLoadAd.y);
                    } else if (rational3.compareTo(rational2) > 0) {
                        pointF = new PointF(pointFLoadAd.x, pointFLoadAd.y);
                        float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                        pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointF.y);
                    } else {
                        pointF = new PointF(pointFLoadAd.x, pointFLoadAd.y);
                        float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                        pointF.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointF.x);
                    }
                    float f3 = c5071l.crashlytics;
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    int iWidth2 = ((int) (rect.width() * f3)) / 2;
                    int iHeight2 = ((int) (f3 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                    rect2.left = AbstractC8576l.purchase(rect2.left, rect.left, rect.right);
                    rect2.right = AbstractC8576l.purchase(rect2.right, rect.left, rect.right);
                    rect2.top = AbstractC8576l.purchase(rect2.top, rect.top, rect.bottom);
                    rect2.bottom = AbstractC8576l.purchase(rect2.bottom, rect.top, rect.bottom);
                    arrayList.add(new MeteringRectangle(rect2, 1000));
                }
            }
        }
        return arrayList;
    }

    public static final C11561l crashlytics(Object obj) {
        C11561l c11561l = new C11561l();
        c11561l.yandex = obj;
        return c11561l;
    }

    public static final C11879l loadAd(int i) {
        C11879l c11879l = new C11879l();
        c11879l.yandex = i;
        return c11879l;
    }

    public static final C16543l purchase(C15617l c15617l, String str, ExecutorC8064l executorC8064l, Function0 function0) {
        C13716l c13716l = new C13716l(C16543l.f32481l);
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            executorC8064l.execute(new RunnableC0295l((Object) c15617l, str, (Object) function0, (Object) c13716l, (Object) c5807l, 8));
            Unit unit = Unit.INSTANCE;
            if (unit != null) {
                c5807l.yandex = unit;
            }
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        return new C16543l(1, c16565l);
    }

    public static final C18474l yandex(boolean z) {
        C18474l c18474l = new C18474l();
        c18474l.yandex = z ? 1 : 0;
        return c18474l;
    }
}
