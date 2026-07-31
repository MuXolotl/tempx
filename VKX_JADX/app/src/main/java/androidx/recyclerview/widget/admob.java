package androidx.recyclerview.widget;

import android.util.Log;
import defpackage.C18644l;
import defpackage.InterfaceC11713l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class admob implements InterfaceC11713l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f452l;

    public /* synthetic */ admob(RecyclerView recyclerView) {
        this.f452l = recyclerView;
    }

    @Override // defpackage.InterfaceC11713l
    public float amazon() {
        float f;
        RecyclerView recyclerView = this.f452l;
        if (recyclerView.mLayout.purchase()) {
            f = recyclerView.mScaledVerticalScrollFactor;
        } else {
            if (!recyclerView.mLayout.amazon()) {
                return 0.0f;
            }
            f = recyclerView.mScaledHorizontalScrollFactor;
        }
        return -f;
    }

    public metrica crashlytics(int i) {
        RecyclerView recyclerView = this.f452l;
        metrica metricaVarFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i, true);
        if (metricaVarFindViewHolderForPosition != null) {
            loadAd loadad = recyclerView.mChildHelper;
            if (!loadad.crashlytics.contains(metricaVarFindViewHolderForPosition.yandex)) {
                return metricaVarFindViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void loadAd(C18644l c18644l) {
        int i = c18644l.yandex;
        RecyclerView recyclerView = this.f452l;
        if (i == 1) {
            recyclerView.mLayout.mo29import(c18644l.loadAd, c18644l.amazon);
            return;
        }
        if (i == 2) {
            recyclerView.mLayout.mo54public(c18644l.loadAd, c18644l.amazon);
        } else if (i == 4) {
            recyclerView.mLayout.mo28finally(c18644l.loadAd, c18644l.amazon);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.mLayout.mo30instanceof(c18644l.loadAd, c18644l.amazon);
        }
    }

    @Override // defpackage.InterfaceC11713l
    public void purchase() {
        this.f452l.stopScroll();
    }

    @Override // defpackage.InterfaceC11713l
    public boolean yandex(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.f452l;
        if (recyclerView.mLayout.purchase()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.mLayout.amazon()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.stopScroll();
        return recyclerView.flingNoThresholdCheck(i, i2);
    }
}
