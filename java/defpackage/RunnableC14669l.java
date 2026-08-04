package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.metrica;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٔؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC14669l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2587l f28697l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f28698l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28699l;

    public /* synthetic */ RunnableC14669l(C2587l c2587l, ArrayList arrayList, int i) {
        this.f28699l = i;
        this.f28697l = c2587l;
        this.f28698l = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f28699l;
        ArrayList arrayList = this.f28698l;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C2587l c2587l = this.f28697l;
                    if (!zHasNext) {
                        arrayList.clear();
                        c2587l.remoteconfig.remove(arrayList);
                    } else {
                        C17616l c17616l = (C17616l) it.next();
                        metrica metricaVar = c17616l.yandex;
                        int i2 = c17616l.loadAd;
                        int i3 = c17616l.crashlytics;
                        int i4 = c17616l.amazon;
                        int i5 = c17616l.purchase;
                        c2587l.getClass();
                        View view = metricaVar.yandex;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c2587l.startapp.add(metricaVar);
                        viewPropertyAnimatorAnimate.setDuration(c2587l.purchase).setListener(new C0515l(c2587l, metricaVar, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C2587l c2587l2 = this.f28697l;
                    if (!zHasNext2) {
                        arrayList.clear();
                        c2587l2.vip.remove(arrayList);
                        break;
                    } else {
                        C3989l c3989l = (C3989l) it2.next();
                        ArrayList arrayList2 = c2587l2.ads;
                        long j = c2587l2.billing;
                        metrica metricaVar2 = c3989l.yandex;
                        View view2 = metricaVar2 == null ? null : metricaVar2.yandex;
                        metrica metricaVar3 = c3989l.loadAd;
                        View view3 = metricaVar3 != null ? metricaVar3.yandex : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(c3989l.yandex);
                            duration.translationX(c3989l.purchase - c3989l.crashlytics);
                            duration.translationY(c3989l.billing - c3989l.amazon);
                            duration.alpha(0.0f).setListener(new C3968l(c2587l2, c3989l, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList2.add(c3989l.loadAd);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C3968l(c2587l2, c3989l, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C2587l c2587l3 = this.f28697l;
                    if (!zHasNext3) {
                        arrayList.clear();
                        c2587l3.smaato.remove(arrayList);
                    } else {
                        metrica metricaVar4 = (metrica) it3.next();
                        c2587l3.getClass();
                        View view4 = metricaVar4.yandex;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c2587l3.metrica.add(metricaVar4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c2587l3.crashlytics).setListener(new C16226l(c2587l3, metricaVar4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
