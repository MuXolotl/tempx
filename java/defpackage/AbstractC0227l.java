package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lَؑۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0227l {
    public static AbstractC0559l crashlytics;
    public static final int yandex = Color.argb(230, 255, 255, 255);
    public static final int loadAd = Color.argb(128, 27, 27, 27);

    public static final void yandex(AbstractActivityC14666l abstractActivityC14666l, C11404l c11404l, C11404l c11404l2) {
        View decorView = abstractActivityC14666l.getWindow().getDecorView();
        AbstractC0559l c2654l = crashlytics;
        if (c2654l == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                c2654l = new C2326l();
            } else if (i >= 30) {
                c2654l = new C8779l();
            } else if (i >= 29) {
                c2654l = new C16489l();
            } else if (i >= 28) {
                c2654l = new C14571l();
            } else {
                c2654l = i >= 26 ? new C2654l() : new C18451l();
            }
            crashlytics = c2654l;
        }
        AbstractC0559l abstractC0559l = c2654l;
        RunnableC0295l runnableC0295l = new RunnableC0295l(abstractC0559l, c11404l, c11404l2, abstractActivityC14666l, decorView, 2);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                C8434l c8434l = new C8434l(runnableC0295l, viewGroup.getContext());
                c8434l.setTag(abstractC0559l);
                c8434l.setVisibility(8);
                c8434l.setWillNotDraw(true);
                viewGroup.addView(c8434l);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof AbstractC0559l) {
                break;
            } else {
                i2 = i3;
            }
        }
        runnableC0295l.run();
        abstractC0559l.yandex(abstractActivityC14666l.getWindow());
    }
}
