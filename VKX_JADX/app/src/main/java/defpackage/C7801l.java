package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lًؗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7801l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public C7801l(C0189l c0189l) {
        this.yandex = 1;
        Objects.requireNonNull(c0189l);
        this.loadAd = c0189l;
    }

    public void adcel(ArrayList arrayList, ArrayList arrayList2, int i) {
        switch (this.yandex) {
            case 0:
                ArrayList arrayList3 = new ArrayList();
                if (i == 0) {
                    ((C13985l) this.loadAd).amazon.size();
                } else {
                    boolean zIsEmpty = arrayList2.isEmpty();
                    C13985l c13985l = (C13985l) this.loadAd;
                    if (zIsEmpty) {
                        C0022l c0022l = c13985l.yandex;
                        Log.w(c0022l.yandex, c0022l.amazon("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                    } else {
                        SparseIntArray sparseIntArray = c13985l.purchase;
                        if (sparseIntArray.get(i, -1) == -1) {
                            sparseIntArray.get(((Integer) arrayList2.get(0)).intValue(), -1);
                        }
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    C13985l c13985l2 = (C13985l) this.loadAd;
                    int i2 = c13985l2.purchase.get(iIntValue, -1);
                    if (i2 == -1) {
                        c13985l2.loadAd();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i2));
                }
                C13985l c13985l3 = (C13985l) this.loadAd;
                c13985l3.billing();
                c13985l3.amazon = arrayList;
                c13985l3.crashlytics();
                Set set = c13985l3.remoteconfig;
                synchronized (set) {
                    Iterator it2 = set.iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                c13985l3.mopub();
                return;
            default:
                return;
        }
    }

    public void firebase(int[] iArr) {
        switch (this.yandex) {
            case 0:
                C13985l c13985l = (C13985l) this.loadAd;
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    c13985l.billing.remove(Integer.valueOf(i));
                    int i2 = c13985l.purchase.get(i, -1);
                    if (i2 == -1) {
                        c13985l.loadAd();
                    } else {
                        arrayList.add(Integer.valueOf(i2));
                    }
                    break;
                }
                Collections.sort(arrayList);
                c13985l.billing();
                AbstractC15091l.amazon(arrayList);
                c13985l.amazon();
                c13985l.mopub();
                break;
        }
    }

    public void metrica(C13328l[] c13328lArr) {
        switch (this.yandex) {
            case 0:
                HashSet hashSet = new HashSet();
                C13985l c13985l = (C13985l) this.loadAd;
                ArrayList arrayList = c13985l.mopub;
                SparseIntArray sparseIntArray = c13985l.purchase;
                arrayList.clear();
                for (C13328l c13328l : c13328lArr) {
                    int i = c13328l.f26161l;
                    c13985l.billing.put(Integer.valueOf(i), c13328l);
                    int i2 = sparseIntArray.get(i, -1);
                    if (i2 == -1) {
                        c13985l.loadAd();
                    } else {
                        hashSet.add(Integer.valueOf(i2));
                    }
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i3 = sparseIntArray.get(((Integer) it.next()).intValue(), -1);
                    if (i3 != -1) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                c13985l.billing();
                AbstractC15091l.amazon(arrayList2);
                c13985l.amazon();
                c13985l.mopub();
                break;
        }
    }

    public void mopub(int[] iArr) {
        switch (this.yandex) {
            case 0:
                C13985l c13985l = (C13985l) this.loadAd;
                ArrayList arrayListPurchase = AbstractC15091l.purchase(iArr);
                if (!c13985l.amazon.equals(arrayListPurchase)) {
                    c13985l.billing();
                    c13985l.billing.evictAll();
                    c13985l.mopub.clear();
                    c13985l.amazon = arrayListPurchase;
                    c13985l.crashlytics();
                    c13985l.admob();
                    c13985l.mopub();
                    break;
                }
                break;
        }
    }

    public void purchase(String str, long j, int i, long j2, long j3) {
        switch (this.yandex) {
            case 1:
                C7214l c7214l = ((C0189l) this.loadAd).smaato;
                if (c7214l != null) {
                    C6643l c6643lIsPro = ((C3557l) c7214l.f15044l).isPro();
                    C14539l c14539l = new C14539l(str);
                    c14539l.loadAd = j;
                    c14539l.crashlytics = i;
                    c14539l.amazon = j2;
                    c14539l.purchase = j3;
                    C8477l c8477l = new C8477l(c14539l);
                    c8477l.billing = c6643lIsPro.admob;
                    c6643lIsPro.amazon.add(c8477l);
                }
                break;
        }
    }

    public void remoteconfig(int[] iArr) {
        switch (this.yandex) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    C13985l c13985l = (C13985l) this.loadAd;
                    c13985l.billing.remove(Integer.valueOf(i));
                    SparseIntArray sparseIntArray = c13985l.purchase;
                    int i2 = sparseIntArray.get(i, -1);
                    if (i2 == -1) {
                        c13985l.loadAd();
                        return;
                    } else {
                        sparseIntArray.delete(i);
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                C13985l c13985l2 = (C13985l) this.loadAd;
                c13985l2.billing();
                c13985l2.amazon.removeAll(AbstractC15091l.purchase(iArr));
                c13985l2.crashlytics();
                AbstractC15091l.amazon(arrayList);
                Set set = c13985l2.remoteconfig;
                synchronized (set) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                c13985l2.mopub();
                return;
            default:
                return;
        }
    }

    public void subs(int[] iArr, int i) {
        int size;
        switch (this.yandex) {
            case 0:
                C13985l c13985l = (C13985l) this.loadAd;
                if (i == 0) {
                    size = c13985l.amazon.size();
                } else {
                    size = c13985l.purchase.get(i, -1);
                    if (size == -1) {
                        c13985l.loadAd();
                        return;
                    }
                }
                C13985l c13985l2 = (C13985l) this.loadAd;
                c13985l2.billing();
                c13985l2.amazon.addAll(size, AbstractC15091l.purchase(iArr));
                c13985l2.crashlytics();
                Set set = c13985l2.remoteconfig;
                synchronized (set) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                c13985l2.mopub();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ C7801l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    public final void amazon() {
    }

    public final void crashlytics() {
    }

    public final void loadAd() {
    }

    public final void subscription() {
    }

    public final void yandex() {
    }

    public final void admob(int[] iArr) {
    }

    public final void smaato(int[] iArr) {
    }

    public final void startapp(C13328l[] c13328lArr) {
    }

    public final void vip(int[] iArr) {
    }

    public final void isPro(int[] iArr, int i) {
    }

    public final void ads(ArrayList arrayList, ArrayList arrayList2, int i) {
    }

    public final void billing(String str, long j, int i, long j2, long j3) {
    }
}
