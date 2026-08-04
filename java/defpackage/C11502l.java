package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lُۧؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11502l extends AbstractC9966l {
    public final /* synthetic */ SwipeDismissBehavior crashlytics;
    public int loadAd = -1;
    public int yandex;

    public C11502l(SwipeDismissBehavior swipeDismissBehavior) {
        this.crashlytics = swipeDismissBehavior;
    }

    @Override // defpackage.AbstractC9966l
    public final int amazon(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.AbstractC9966l
    public final int crashlytics(View view, int i) {
        int width;
        int width2;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.crashlytics.amazon;
        if (i2 == 0) {
            width = this.yandex;
            if (z) {
                width -= view.getWidth();
                width2 = this.yandex;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.yandex;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.yandex + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.yandex;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.AbstractC9966l
    public final void metrica(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.crashlytics;
        float f = width * swipeDismissBehavior.purchase;
        float width2 = view.getWidth() * swipeDismissBehavior.billing;
        float fAbs = Math.abs(i - this.yandex);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    @Override // defpackage.AbstractC9966l
    public final boolean premium(View view, int i) {
        int i2 = this.loadAd;
        return (i2 == -1 || i2 == i) && this.crashlytics.subscription();
    }

    @Override // defpackage.AbstractC9966l
    public final void remoteconfig(View view, int i) {
        this.loadAd = i;
        this.yandex = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.crashlytics;
            swipeDismissBehavior.crashlytics = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.crashlytics = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // defpackage.AbstractC9966l
    public final void startapp(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.loadAd = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.crashlytics;
        if (f != 0.0f) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.amazon;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.yandex;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.yandex;
                    if (left < i2) {
                        i = this.yandex - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.yandex - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.yandex) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.yandex;
                    if (left < i2) {
                        i = this.yandex - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.yandex - width;
                }
                z = true;
            } else {
                i = this.yandex;
            }
        }
        if (swipeDismissBehavior.yandex.metrica(i, view.getTop())) {
            RunnableC9929l runnableC9929l = new RunnableC9929l(swipeDismissBehavior, view, z);
            WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
            view.postOnAnimation(runnableC9929l);
        }
    }

    @Override // defpackage.AbstractC9966l
    public final int subs(View view) {
        return view.getWidth();
    }

    @Override // defpackage.AbstractC9966l
    public final void vip(int i) {
    }
}
