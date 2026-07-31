package androidx.recyclerview.widget;

import defpackage.AbstractC14039l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC5020l;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class smaato extends AbstractC14039l {
    public final /* synthetic */ RecyclerView yandex;

    public smaato(RecyclerView recyclerView) {
        this.yandex = recyclerView;
    }

    @Override // defpackage.AbstractC14039l
    public final void amazon(int i, int i2) {
        RecyclerView recyclerView = this.yandex;
        recyclerView.assertNotInLayoutOrScroll(null);
        yandex yandexVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = yandexVar.loadAd;
        if (i == i2) {
            return;
        }
        arrayList.add(yandexVar.admob(null, 8, i, i2));
        yandexVar.billing |= 8;
        if (arrayList.size() == 1) {
            mopub();
        }
    }

    @Override // defpackage.AbstractC14039l
    public final void billing() {
        subs subsVar;
        RecyclerView recyclerView = this.yandex;
        if (recyclerView.mPendingSavedState == null || (subsVar = recyclerView.mAdapter) == null) {
            return;
        }
        int iInmobi = AbstractC5020l.inmobi(subsVar.f463l);
        if (iInmobi != 1) {
            if (iInmobi == 2) {
                return;
            }
        } else if (subsVar.mopub() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.AbstractC14039l
    public final void crashlytics(int i, int i2) {
        RecyclerView recyclerView = this.yandex;
        recyclerView.assertNotInLayoutOrScroll(null);
        yandex yandexVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = yandexVar.loadAd;
        if (i2 < 1) {
            return;
        }
        arrayList.add(yandexVar.admob(null, 1, i, i2));
        yandexVar.billing |= 1;
        if (arrayList.size() == 1) {
            mopub();
        }
    }

    @Override // defpackage.AbstractC14039l
    public final void loadAd(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.yandex;
        recyclerView.assertNotInLayoutOrScroll(null);
        yandex yandexVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = yandexVar.loadAd;
        if (i2 < 1) {
            return;
        }
        arrayList.add(yandexVar.admob(obj, 4, i, i2));
        yandexVar.billing |= 4;
        if (arrayList.size() == 1) {
            mopub();
        }
    }

    public final void mopub() {
        RecyclerView recyclerView = this.yandex;
        if (!recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // defpackage.AbstractC14039l
    public final void purchase(int i, int i2) {
        RecyclerView recyclerView = this.yandex;
        recyclerView.assertNotInLayoutOrScroll(null);
        yandex yandexVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = yandexVar.loadAd;
        if (i2 < 1) {
            return;
        }
        arrayList.add(yandexVar.admob(null, 2, i, i2));
        yandexVar.billing |= 2;
        if (arrayList.size() == 1) {
            mopub();
        }
    }

    @Override // defpackage.AbstractC14039l
    public final void yandex() {
        RecyclerView recyclerView = this.yandex;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.billing = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.mopub()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
