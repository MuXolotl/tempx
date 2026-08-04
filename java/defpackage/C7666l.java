package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.metrica;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٍؚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7666l implements InterfaceC6389l {
    public final /* synthetic */ C16678l yandex;

    public C7666l(C16678l c16678l) {
        this.yandex = c16678l;
    }

    @Override // defpackage.InterfaceC6389l
    public final void crashlytics(boolean z) {
        if (z) {
            this.yandex.metrica(null, 0);
        }
    }

    @Override // defpackage.InterfaceC6389l
    public final boolean loadAd(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C16678l c16678l = this.yandex;
        c16678l.ad.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C9603l c9603l = null;
        if (actionMasked == 0) {
            c16678l.smaato = motionEvent.getPointerId(0);
            c16678l.amazon = motionEvent.getX();
            c16678l.purchase = motionEvent.getY();
            VelocityTracker velocityTracker = c16678l.tapsense;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c16678l.tapsense = VelocityTracker.obtain();
            if (c16678l.crashlytics == null) {
                ArrayList arrayList = c16678l.startapp;
                if (!arrayList.isEmpty()) {
                    View viewFirebase = c16678l.firebase(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C9603l c9603l2 = (C9603l) arrayList.get(size);
                        if (c9603l2.purchase.yandex == viewFirebase) {
                            c9603l = c9603l2;
                            break;
                        }
                    }
                }
                if (c9603l != null) {
                    metrica metricaVar = c9603l.purchase;
                    c16678l.amazon -= c9603l.subs;
                    c16678l.purchase -= c9603l.isPro;
                    c16678l.isPro(metricaVar, true);
                    if (c16678l.yandex.remove(metricaVar.yandex)) {
                        c16678l.remoteconfig.yandex(metricaVar);
                    }
                    c16678l.metrica(metricaVar, c9603l.billing);
                    c16678l.startapp(c16678l.metrica, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c16678l.smaato = -1;
            c16678l.metrica(null, 0);
        } else {
            int i = c16678l.smaato;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c16678l.admob(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c16678l.tapsense;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c16678l.crashlytics != null;
    }

    @Override // defpackage.InterfaceC6389l
    public final void yandex(MotionEvent motionEvent) {
        C16678l c16678l = this.yandex;
        RunnableC5360l runnableC5360l = c16678l.subscription;
        c16678l.ad.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c16678l.tapsense;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c16678l.smaato == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c16678l.smaato);
        if (iFindPointerIndex >= 0) {
            c16678l.admob(actionMasked, iFindPointerIndex, motionEvent);
        }
        metrica metricaVar = c16678l.crashlytics;
        if (metricaVar == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c16678l.startapp(c16678l.metrica, iFindPointerIndex, motionEvent);
                    c16678l.vip(metricaVar);
                    c16678l.ads.removeCallbacks(runnableC5360l);
                    runnableC5360l.run();
                    c16678l.ads.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c16678l.smaato) {
                    c16678l.smaato = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c16678l.startapp(c16678l.metrica, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c16678l.tapsense;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c16678l.metrica(null, 0);
        c16678l.smaato = -1;
    }
}
