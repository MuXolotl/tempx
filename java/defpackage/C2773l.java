package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؔٝٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2773l implements InterfaceC10782l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Size f6023l = new Size(480, 360);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C4143l f6024l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f6025l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f6026l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Matrix f6027l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Executor f6028l;

    public C2773l(List list, Executor executor, C4143l c4143l) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC8544l) it.next()).getClass();
        }
        this.f6026l = new ArrayList(list);
        this.f6025l = 1;
        this.f6024l = c4143l;
        this.f6028l = executor;
    }

    @Override // defpackage.InterfaceC10782l
    public final void isPro(C15607l c15607l) throws Exception {
        InterfaceC11699l interfaceC11699l = c15607l.f30461l;
        Matrix matrix = new Matrix();
        int i = this.f6025l;
        if (i != 0) {
            Matrix matrix2 = this.f6027l;
            if (i != 2 && matrix2 == null) {
                AbstractC5088l.yandex("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                c15607l.close();
                return;
            }
            Matrix matrix3 = new Matrix(interfaceC11699l.purchase());
            RectF rectF = new RectF(0.0f, 0.0f, c15607l.f30463l, c15607l.f30460l);
            int iAmazon = interfaceC11699l.amazon();
            RectF rectF2 = AbstractC18611l.yandex;
            AbstractC5641l.loadAd(iAmazon % 90 == 0, "Invalid rotation degrees: " + iAmazon);
            matrix3.postConcat(AbstractC18611l.yandex(rectF, AbstractC18611l.crashlytics(AbstractC18611l.isPro(iAmazon)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF, interfaceC11699l.amazon(), false));
            matrix3.invert(matrix);
            if (i != 2) {
                matrix.postConcat(matrix2);
            }
        }
        yandex(c15607l, 0, matrix, new HashMap(), new HashMap());
    }

    @Override // defpackage.InterfaceC10782l
    public final Size loadAd() {
        Iterator it = this.f6026l.iterator();
        Size size = f6023l;
        while (it.hasNext()) {
            ((InterfaceC8544l) it.next()).getClass();
            Size size2 = new Size(1280, 720);
            if (size2.getWidth() * size2.getHeight() > size.getHeight() * size.getWidth()) {
                size = size2;
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yandex(final C15607l c15607l, final int i, final Matrix matrix, final HashMap map, final HashMap map2) throws Exception {
        Image imageStartapp = c15607l.f24884l.startapp();
        if (imageStartapp == null) {
            AbstractC5088l.crashlytics("MlKitAnalyzer", "Image is null.");
            c15607l.close();
            return;
        }
        ArrayList arrayList = this.f6026l;
        int size = arrayList.size() - 1;
        Executor executor = this.f6028l;
        if (i > size) {
            c15607l.close();
            executor.execute(new RunnableC4063l(this, map, c15607l, map2, 16));
            return;
        }
        final InterfaceC8544l interfaceC8544l = (InterfaceC8544l) arrayList.get(i);
        try {
            ((AbstractC3940l) interfaceC8544l).billing(imageStartapp, c15607l.f30461l.amazon(), matrix).loadAd(executor, new InterfaceC10162l() { // from class: lؙؒۥ
                @Override // defpackage.InterfaceC10162l
                public final void metrica(C3823l c3823l) throws Exception {
                    C2773l c2773l = this.f13078l;
                    HashMap map3 = map2;
                    InterfaceC8544l interfaceC8544l2 = interfaceC8544l;
                    HashMap map4 = map;
                    C15607l c15607l2 = c15607l;
                    int i2 = i;
                    Matrix matrix2 = matrix;
                    if (c3823l.amazon) {
                        map3.put(interfaceC8544l2, new CancellationException("The task is canceled."));
                    } else if (c3823l.smaato()) {
                        map4.put(interfaceC8544l2, c3823l.isPro());
                    } else {
                        map3.put(interfaceC8544l2, c3823l.subs());
                    }
                    c2773l.yandex(c15607l2, i2 + 1, matrix2, map4, map3);
                }
            });
        } catch (Exception e) {
            map2.put(interfaceC8544l, new RuntimeException("Failed to process the image.", e));
            yandex(c15607l, i + 1, matrix, map, map2);
        }
    }
}
