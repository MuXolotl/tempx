package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import defpackage.AbstractC13735l;
import defpackage.AbstractC15872l;
import defpackage.C16226l;
import defpackage.C17616l;
import defpackage.C2587l;
import defpackage.C3989l;
import defpackage.RunnableC14669l;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class mopub implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f459l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f460l;

    public /* synthetic */ mopub(RecyclerView recyclerView, int i) {
        this.f460l = i;
        this.f459l = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.f460l;
        RecyclerView recyclerView = this.f459l;
        switch (i) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.mLayoutSuppressed) {
                        recyclerView.mLayoutWasDefered = true;
                    } else {
                        recyclerView.consumePendingUpdateOperations();
                    }
                    break;
                }
                break;
            default:
                AbstractC13735l abstractC13735l = recyclerView.mItemAnimator;
                if (abstractC13735l != null) {
                    C2587l c2587l = (C2587l) abstractC13735l;
                    long j = c2587l.amazon;
                    ArrayList<metrica> arrayList = c2587l.admob;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c2587l.isPro;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c2587l.firebase;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c2587l.subs;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (metrica metricaVar : arrayList) {
                            View view = metricaVar.yandex;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c2587l.adcel.add(metricaVar);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C16226l(c2587l, metricaVar, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c2587l.remoteconfig.add(arrayList5);
                            arrayList2.clear();
                            RunnableC14669l runnableC14669l = new RunnableC14669l(c2587l, arrayList5, 0);
                            if (z2) {
                                runnableC14669l.run();
                            } else {
                                View view2 = ((C17616l) arrayList5.get(0)).yandex.yandex;
                                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                                view2.postOnAnimationDelayed(runnableC14669l, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c2587l.vip.add(arrayList6);
                            arrayList3.clear();
                            RunnableC14669l runnableC14669l2 = new RunnableC14669l(c2587l, arrayList6, 1);
                            if (z2) {
                                runnableC14669l2.run();
                            } else {
                                View view3 = ((C3989l) arrayList6.get(0)).yandex.yandex;
                                WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                                view3.postOnAnimationDelayed(runnableC14669l2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c2587l.smaato.add(arrayList7);
                            arrayList4.clear();
                            RunnableC14669l runnableC14669l3 = new RunnableC14669l(c2587l, arrayList7, 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                runnableC14669l3.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c2587l.purchase : 0L, zIsEmpty3 ? 0L : c2587l.billing) + j;
                                z = false;
                                View view4 = ((metrica) arrayList7.get(0)).yandex;
                                WeakHashMap weakHashMap3 = AbstractC15872l.yandex;
                                view4.postOnAnimationDelayed(runnableC14669l3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.mPostedAnimatorRunner = z;
                break;
        }
    }
}
