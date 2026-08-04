package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;

/* JADX INFO: renamed from: lِ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17856l {
    public boolean amazon;
    public boolean billing;
    public boolean purchase;
    public final ViewGroup yandex;
    public final ArrayList loadAd = new ArrayList();
    public final ArrayList crashlytics = new ArrayList();

    public C17856l(ViewGroup viewGroup) {
        this.yandex = viewGroup;
    }

    public static boolean purchase(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((AbstractC18261l) it.next()).getClass();
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC18261l) it2.next()).getClass();
            AbstractC3984l.license(arrayList2, null);
        }
        return !arrayList2.isEmpty();
    }

    public final void amazon() {
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.yandex.isAttachedToWindow();
        synchronized (this.loadAd) {
            try {
                mopub();
                billing(this.loadAd);
                ArrayList<AbstractC18261l> arrayList = new ArrayList(this.crashlytics);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC18261l) it.next()).getClass();
                }
                for (AbstractC18261l abstractC18261l : arrayList) {
                    if (C13734l.m3727volatile(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.yandex + " is not attached to window. ") + "Cancelling running operation " + abstractC18261l);
                    }
                    abstractC18261l.yandex(this.yandex);
                }
                ArrayList<AbstractC18261l> arrayList2 = new ArrayList(this.loadAd);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((AbstractC18261l) it2.next()).getClass();
                }
                for (AbstractC18261l abstractC18261l2 : arrayList2) {
                    if (C13734l.m3727volatile(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.yandex + " is not attached to window. ") + "Cancelling pending operation " + abstractC18261l2);
                    }
                    abstractC18261l2.yandex(this.yandex);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void billing(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC18261l abstractC18261l = (AbstractC18261l) list.get(i);
            abstractC18261l.getClass();
            if (!abstractC18261l.yandex) {
                abstractC18261l.yandex = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC18261l) it.next()).getClass();
            AbstractC3984l.license(arrayList, null);
        }
        List listM4213const = AbstractC16901l.m4213const(AbstractC16901l.m4229l(arrayList));
        int size2 = listM4213const.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC3772l abstractC3772l = (AbstractC3772l) listM4213const.get(i2);
            if (!abstractC3772l.yandex) {
                abstractC3772l.crashlytics(this.yandex);
            }
            abstractC3772l.yandex = true;
        }
    }

    public final void crashlytics() {
        if (this.billing) {
            return;
        }
        if (!this.yandex.isAttachedToWindow()) {
            amazon();
            this.purchase = false;
            return;
        }
        synchronized (this.loadAd) {
            try {
                ArrayList<AbstractC18261l> arrayList = new ArrayList(this.crashlytics);
                this.crashlytics.clear();
                for (AbstractC18261l abstractC18261l : arrayList) {
                    if (!this.loadAd.isEmpty()) {
                        abstractC18261l.getClass();
                        throw null;
                    }
                    abstractC18261l.getClass();
                }
                for (AbstractC18261l abstractC18261l2 : arrayList) {
                    if (this.amazon) {
                        if (C13734l.m3727volatile(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + abstractC18261l2);
                        }
                        abstractC18261l2.loadAd();
                        throw null;
                    }
                    if (C13734l.m3727volatile(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + abstractC18261l2);
                    }
                    abstractC18261l2.yandex(this.yandex);
                    this.amazon = false;
                    this.crashlytics.add(abstractC18261l2);
                }
                if (!this.loadAd.isEmpty()) {
                    mopub();
                    ArrayList arrayList2 = new ArrayList(this.loadAd);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.loadAd.clear();
                    this.crashlytics.addAll(arrayList2);
                    if (C13734l.m3727volatile(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    loadAd(arrayList2, this.purchase);
                    boolean zPurchase = purchase(arrayList2);
                    Iterator it = arrayList2.iterator();
                    if (it.hasNext()) {
                        ((AbstractC18261l) it.next()).getClass();
                        throw null;
                    }
                    this.amazon = !zPurchase;
                    if (C13734l.m3727volatile(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zPurchase + " \ntransition = true");
                    }
                    if (zPurchase) {
                        billing(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            yandex((AbstractC18261l) arrayList2.get(i));
                        }
                    }
                    this.purchase = false;
                    if (C13734l.m3727volatile(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void loadAd(ArrayList arrayList, boolean z) {
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((AbstractC18261l) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((AbstractC18261l) listIterator.previous()).getClass();
            throw null;
        }
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList<C17085l> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ((AbstractC18261l) AbstractC16901l.m4214continue(arrayList)).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((AbstractC18261l) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            AbstractC18261l abstractC18261l = (AbstractC18261l) it3.next();
            arrayList2.add(new C17085l(abstractC18261l, z));
            new C3576l(abstractC18261l);
            if (!z) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!((C3576l) obj).startapp()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C3576l) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((C3576l) it5.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        if (it6.hasNext()) {
            ((C17085l) it6.next()).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        for (C17085l c17085l : arrayList2) {
            Context context = this.yandex.getContext();
            c17085l.getClass();
            C0458l c0458lTapsense = c17085l.tapsense(context);
            if (c0458lTapsense != null) {
                if (((AnimatorSet) c0458lTapsense.f1690l) != null) {
                    throw null;
                }
                arrayList6.add(c17085l);
            }
        }
        Iterator it7 = arrayList6.iterator();
        if (it7.hasNext()) {
            ((C17085l) it7.next()).getClass();
            throw null;
        }
    }

    public final void mopub() {
        Iterator it = this.loadAd.iterator();
        while (it.hasNext()) {
            ((AbstractC18261l) it.next()).getClass();
        }
    }

    public final void yandex(AbstractC18261l abstractC18261l) {
        if (abstractC18261l.loadAd) {
            throw null;
        }
    }
}
