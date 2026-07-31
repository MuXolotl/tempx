package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import defpackage.C10156l;
import defpackage.C15685l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class adcel extends C10156l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final startapp f450l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final RecyclerView f451l;

    public adcel(RecyclerView recyclerView) {
        this.f451l = recyclerView;
        startapp startappVar = this.f450l;
        if (startappVar != null) {
            this.f450l = startappVar;
        } else {
            this.f450l = new startapp(this);
        }
    }

    @Override // defpackage.C10156l
    public final void amazon(View view, C15685l c15685l) {
        this.f20672l.onInitializeAccessibilityNodeInfo(view, c15685l.yandex);
        RecyclerView recyclerView = this.f451l;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        isPro layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.loadAd;
        layoutManager.mo53new(recyclerView2.mRecycler, recyclerView2.mState, c15685l);
    }

    @Override // defpackage.C10156l
    public final void crashlytics(View view, AccessibilityEvent accessibilityEvent) {
        super.crashlytics(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f451l.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo61final(accessibilityEvent);
        }
    }

    @Override // defpackage.C10156l
    public final boolean mopub(View view, int i, Bundle bundle) {
        if (super.mopub(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f451l;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().mo58while(i, bundle);
    }
}
