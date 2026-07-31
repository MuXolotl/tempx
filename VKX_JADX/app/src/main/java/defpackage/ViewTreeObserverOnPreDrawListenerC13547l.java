package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lْٕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC13547l implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ViewGroup f26565l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC1299l f26566l;

    /* JADX WARN: Code duplicated, block: B:100:0x0209  */
    /* JADX WARN: Code duplicated, block: B:102:0x0217  */
    /* JADX WARN: Code duplicated, block: B:103:0x0223  */
    /* JADX WARN: Code duplicated, block: B:107:0x0235  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e1 A[EDGE_INSN: B:134:0x01e1->B:90:0x01e1 BREAK  A[LOOP:1: B:19:0x0085->B:89:0x01da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:15:0x0050->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        C12014l c12014l;
        C12014l c12014l2;
        C11154l c11154l;
        C11154l c11154l2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        C11154l c11154lAdcel;
        int i5;
        Animator animator;
        C10087l c10087l;
        C18285l c18285l;
        C18285l c18285l2;
        int i6;
        boolean z2;
        int i7;
        View view;
        C18285l c18285l3;
        C11154l c11154l3;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        C3994l c3994l;
        int iFirebase;
        int i11;
        View view6;
        boolean z3;
        Iterator it;
        AbstractC1299l abstractC1299l = this.f26566l;
        ViewGroup viewGroup = this.f26565l;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!AbstractC17057l.crashlytics.remove(viewGroup)) {
            return true;
        }
        C11154l c11154lLoadAd = AbstractC17057l.loadAd();
        ArrayList arrayList2 = (ArrayList) c11154lLoadAd.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(abstractC1299l);
            abstractC1299l.yandex(new C8903l(this, c11154lLoadAd));
            i = 0;
            abstractC1299l.subs(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC1299l) it.next()).premium(viewGroup);
                }
            }
            abstractC1299l.f3374l = new ArrayList();
            abstractC1299l.f3371l = new ArrayList();
            c12014l = abstractC1299l.f3357l;
            c12014l2 = abstractC1299l.f3360l;
            c11154l = new C11154l((C11154l) c12014l.f23941l);
            c11154l2 = new C11154l((C11154l) c12014l2.f23941l);
            i2 = 0;
            while (true) {
                iArr = abstractC1299l.f3367l;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    z2 = z4;
                    for (i7 = c11154l.f11161l - 1; i7 >= 0; i7--) {
                        view = (View) c11154l.billing(i7);
                        if (view == null && abstractC1299l.license(view) && (c18285l3 = (C18285l) c11154l2.remove(view)) != null && abstractC1299l.license(c18285l3.loadAd)) {
                            abstractC1299l.f3374l.add((C18285l) c11154l.mopub(i7));
                            abstractC1299l.f3371l.add(c18285l3);
                        }
                    }
                } else if (i6 != 2) {
                    z2 = z4;
                    c11154l3 = (C11154l) c12014l.f23943l;
                    C11154l c11154l4 = (C11154l) c12014l2.f23943l;
                    i8 = c11154l3.f11161l;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) c11154l3.subs(i9);
                        if (view2 == null && abstractC1299l.license(view2) && (view3 = (View) c11154l4.get(c11154l3.billing(i9))) != null && abstractC1299l.license(view3)) {
                            C18285l c18285l4 = (C18285l) c11154l.get(view2);
                            C18285l c18285l5 = (C18285l) c11154l2.get(view3);
                            if (c18285l4 != null && c18285l5 != null) {
                                abstractC1299l.f3374l.add(c18285l4);
                                abstractC1299l.f3371l.add(c18285l5);
                                c11154l.remove(view2);
                                c11154l2.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        c3994l = (C3994l) c12014l.f23944l;
                        C3994l c3994l2 = (C3994l) c12014l2.f23944l;
                        iFirebase = c3994l.firebase();
                        i11 = i;
                        while (i11 < iFirebase) {
                            view6 = (View) c3994l.smaato(i11);
                            if (view6 == null && abstractC1299l.license(view6)) {
                                boolean z5 = z4;
                                View view7 = (View) c3994l2.amazon(c3994l.admob(i11));
                                if (view7 == null || !abstractC1299l.license(view7)) {
                                    z3 = z5;
                                } else {
                                    C18285l c18285l6 = (C18285l) c11154l.get(view6);
                                    C18285l c18285l7 = (C18285l) c11154l2.get(view7);
                                    if (c18285l6 == null || c18285l7 == null) {
                                        z3 = z5;
                                    } else {
                                        z3 = z5;
                                        abstractC1299l.f3374l.add(c18285l6);
                                        abstractC1299l.f3371l.add(c18285l7);
                                        c11154l.remove(view6);
                                        c11154l2.remove(view7);
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                            i11++;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) c12014l.f23940l;
                    SparseArray sparseArray2 = (SparseArray) c12014l2.f23940l;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && abstractC1299l.license(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && abstractC1299l.license(view5)) {
                            C18285l c18285l8 = (C18285l) c11154l.get(view4);
                            C18285l c18285l9 = (C18285l) c11154l2.get(view5);
                            if (c18285l8 != null && c18285l9 != null) {
                                abstractC1299l.f3374l.add(c18285l8);
                                abstractC1299l.f3371l.add(c18285l9);
                                c11154l.remove(view4);
                                c11154l2.remove(view5);
                            }
                        }
                    }
                }
                i2++;
                z4 = z2;
                i = 0;
            }
            z = z4;
            for (i3 = 0; i3 < c11154l.f11161l; i3++) {
                c18285l2 = (C18285l) c11154l.subs(i3);
                if (abstractC1299l.license(c18285l2.loadAd)) {
                    abstractC1299l.f3374l.add(c18285l2);
                    abstractC1299l.f3371l.add(null);
                }
            }
            for (i4 = 0; i4 < c11154l2.f11161l; i4++) {
                c18285l = (C18285l) c11154l2.subs(i4);
                if (abstractC1299l.license(c18285l.loadAd)) {
                    abstractC1299l.f3371l.add(c18285l);
                    abstractC1299l.f3374l.add(null);
                }
            }
            c11154lAdcel = AbstractC1299l.adcel();
            int i12 = c11154lAdcel.f11161l;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                animator = (Animator) c11154lAdcel.billing(i5);
                if (animator == null && (c10087l = (C10087l) c11154lAdcel.get(animator)) != null) {
                    AbstractC1299l abstractC1299l2 = c10087l.purchase;
                    View view8 = c10087l.yandex;
                    if (view8 != null && windowId.equals(c10087l.amazon)) {
                        C18285l c18285l10 = c10087l.crashlytics;
                        boolean z6 = z;
                        C18285l c18285lSubscription = abstractC1299l.subscription(view8, z6);
                        C18285l c18285lMetrica = abstractC1299l.metrica(view8, z6);
                        if (c18285lSubscription == null && c18285lMetrica == null) {
                            c18285lMetrica = (C18285l) ((C11154l) abstractC1299l.f3360l.f23941l).get(view8);
                        }
                        if ((c18285lSubscription != null || c18285lMetrica != null) && abstractC1299l2.Signature(c18285l10, c18285lMetrica)) {
                            abstractC1299l2.startapp().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c11154lAdcel.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            abstractC1299l.remoteconfig(viewGroup, abstractC1299l.f3357l, abstractC1299l.f3360l, abstractC1299l.f3374l, abstractC1299l.f3371l);
            abstractC1299l.applovin();
            return true;
        }
        arrayList2 = new ArrayList();
        c11154lLoadAd.put(viewGroup, arrayList2);
        arrayList2.add(abstractC1299l);
        abstractC1299l.yandex(new C8903l(this, c11154lLoadAd));
        i = 0;
        abstractC1299l.subs(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC1299l) it.next()).premium(viewGroup);
            }
        }
        abstractC1299l.f3374l = new ArrayList();
        abstractC1299l.f3371l = new ArrayList();
        c12014l = abstractC1299l.f3357l;
        c12014l2 = abstractC1299l.f3360l;
        c11154l = new C11154l((C11154l) c12014l.f23941l);
        c11154l2 = new C11154l((C11154l) c12014l2.f23941l);
        i2 = 0;
        while (true) {
            iArr = abstractC1299l.f3367l;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z4) {
                z2 = z4;
                while (i7 >= 0) {
                    view = (View) c11154l.billing(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                z2 = z4;
                c11154l3 = (C11154l) c12014l.f23943l;
                C11154l c11154l5 = (C11154l) c12014l2.f23943l;
                i8 = c11154l3.f11161l;
                while (i9 < i8) {
                    view2 = (View) c11154l3.subs(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                if (i6 == 4) {
                    c3994l = (C3994l) c12014l.f23944l;
                    C3994l c3994l3 = (C3994l) c12014l2.f23944l;
                    iFirebase = c3994l.firebase();
                    i11 = i;
                    while (i11 < iFirebase) {
                        view6 = (View) c3994l.smaato(i11);
                        if (view6 == null) {
                            z3 = z4;
                        } else {
                            z3 = z4;
                        }
                        i11++;
                        z4 = z3;
                    }
                }
                z2 = z4;
            } else {
                z2 = z4;
                sparseArray = (SparseArray) c12014l.f23940l;
                SparseArray sparseArray3 = (SparseArray) c12014l2.f23940l;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            }
            i2++;
            z4 = z2;
            i = 0;
        }
        z = z4;
        while (i3 < c11154l.f11161l) {
            c18285l2 = (C18285l) c11154l.subs(i3);
            if (abstractC1299l.license(c18285l2.loadAd)) {
                abstractC1299l.f3374l.add(c18285l2);
                abstractC1299l.f3371l.add(null);
            }
        }
        while (i4 < c11154l2.f11161l) {
            c18285l = (C18285l) c11154l2.subs(i4);
            if (abstractC1299l.license(c18285l.loadAd)) {
                abstractC1299l.f3371l.add(c18285l);
                abstractC1299l.f3374l.add(null);
            }
        }
        c11154lAdcel = AbstractC1299l.adcel();
        int i13 = c11154lAdcel.f11161l;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i13 - 1;
        while (i5 >= 0) {
            animator = (Animator) c11154lAdcel.billing(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        abstractC1299l.remoteconfig(viewGroup, abstractC1299l.f3357l, abstractC1299l.f3360l, abstractC1299l.f3374l, abstractC1299l.f3371l);
        abstractC1299l.applovin();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f26565l;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC17057l.crashlytics.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC17057l.loadAd().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC1299l) it.next()).premium(viewGroup);
            }
        }
        this.f26566l.isPro(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
