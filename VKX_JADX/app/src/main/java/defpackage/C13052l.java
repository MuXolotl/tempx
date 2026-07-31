package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.isPro;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lْؑؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13052l {
    public int amazon;
    public final Object billing;
    public int crashlytics;
    public int loadAd;
    public final Object purchase;
    public int yandex;
    public static final C2351l mopub = new C2351l(24);
    public static final C2351l admob = new C2351l(25);

    public C13052l(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.billing = staggeredGridLayoutManager;
        this.purchase = new ArrayList();
        this.yandex = RecyclerView.UNDEFINED_DURATION;
        this.loadAd = RecyclerView.UNDEFINED_DURATION;
        this.crashlytics = 0;
        this.amazon = i;
    }

    public View admob(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.billing;
        ArrayList arrayList = (ArrayList) this.purchase;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.pro && isPro.m126native(view2) >= i) || ((!staggeredGridLayoutManager.pro && isPro.m126native(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.pro && isPro.m126native(view3) <= i) || ((!staggeredGridLayoutManager.pro && isPro.m126native(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int amazon() {
        boolean z = ((StaggeredGridLayoutManager) this.billing).pro;
        ArrayList arrayList = (ArrayList) this.purchase;
        return z ? billing(arrayList.size() - 1, -1) : billing(0, arrayList.size());
    }

    public int billing(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.billing;
        int iFirebase = staggeredGridLayoutManager.ads.firebase();
        int iMopub = staggeredGridLayoutManager.ads.mopub();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.purchase).get(i);
            int iPurchase = staggeredGridLayoutManager.ads.purchase(view);
            int iLoadAd = staggeredGridLayoutManager.ads.loadAd(view);
            boolean z = iPurchase <= iMopub;
            boolean z2 = iLoadAd >= iFirebase;
            if (z && z2 && (iPurchase < iFirebase || iLoadAd > iMopub)) {
                return isPro.m126native(view);
            }
            i += i3;
        }
        return -1;
    }

    public void crashlytics() {
        ((ArrayList) this.purchase).clear();
        this.yandex = RecyclerView.UNDEFINED_DURATION;
        this.loadAd = RecyclerView.UNDEFINED_DURATION;
        this.crashlytics = 0;
    }

    public int isPro(int i) {
        ArrayList arrayList = (ArrayList) this.purchase;
        int i2 = this.yandex;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C14791l c14791l = (C14791l) view.getLayoutParams();
        this.yandex = ((StaggeredGridLayoutManager) this.billing).ads.purchase(view);
        c14791l.getClass();
        return this.yandex;
    }

    public void loadAd() {
        View view = (View) AbstractC14814l.firebase(1, (ArrayList) this.purchase);
        C14791l c14791l = (C14791l) view.getLayoutParams();
        this.loadAd = ((StaggeredGridLayoutManager) this.billing).ads.loadAd(view);
        c14791l.getClass();
    }

    public int mopub(int i) {
        int i2 = this.loadAd;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.purchase).size() == 0) {
            return i;
        }
        loadAd();
        return this.loadAd;
    }

    public int purchase() {
        boolean z = ((StaggeredGridLayoutManager) this.billing).pro;
        ArrayList arrayList = (ArrayList) this.purchase;
        return z ? billing(0, arrayList.size()) : billing(arrayList.size() - 1, -1);
    }

    public float subs() {
        ArrayList arrayList = (ArrayList) this.purchase;
        if (this.yandex != 0) {
            Collections.sort(arrayList, admob);
            this.yandex = 0;
        }
        float f = 0.5f * this.crashlytics;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C7334l c7334l = (C7334l) arrayList.get(i2);
            i += c7334l.loadAd;
            if (i >= f) {
                return c7334l.crashlytics;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C7334l) AbstractC14814l.firebase(1, arrayList)).crashlytics;
    }

    public void yandex(int i, float f) {
        C7334l c7334l;
        C7334l[] c7334lArr = (C7334l[]) this.billing;
        ArrayList arrayList = (ArrayList) this.purchase;
        if (this.yandex != 1) {
            Collections.sort(arrayList, mopub);
            this.yandex = 1;
        }
        int i2 = this.amazon;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.amazon = i3;
            c7334l = c7334lArr[i3];
        } else {
            c7334l = new C7334l();
        }
        int i4 = this.loadAd;
        this.loadAd = i4 + 1;
        c7334l.yandex = i4;
        c7334l.loadAd = i;
        c7334l.crashlytics = f;
        arrayList.add(c7334l);
        this.crashlytics += i;
        while (true) {
            int i5 = this.crashlytics;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            C7334l c7334l2 = (C7334l) arrayList.get(0);
            int i7 = c7334l2.loadAd;
            if (i7 <= i6) {
                this.crashlytics -= i7;
                arrayList.remove(0);
                int i8 = this.amazon;
                if (i8 < 5) {
                    this.amazon = i8 + 1;
                    c7334lArr[i8] = c7334l2;
                }
            } else {
                c7334l2.loadAd = i7 - i6;
                this.crashlytics -= i6;
            }
        }
    }

    public C13052l(int i, C13736l c13736l, int i2, int i3, int i4, String str) {
        this.yandex = i;
        this.purchase = c13736l;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
        this.billing = str;
    }

    public C13052l() {
        this.billing = new C7334l[5];
        this.purchase = new ArrayList();
        this.yandex = -1;
    }
}
