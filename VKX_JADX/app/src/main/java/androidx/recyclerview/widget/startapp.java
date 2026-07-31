package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.C10156l;
import defpackage.C15685l;
import defpackage.C3585l;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class startapp extends C10156l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final WeakHashMap f461l = new WeakHashMap();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final adcel f462l;

    public startapp(adcel adcelVar) {
        this.f462l = adcelVar;
    }

    @Override // defpackage.C10156l
    public final void admob(View view, int i) {
        C10156l c10156l = (C10156l) this.f461l.get(view);
        if (c10156l != null) {
            c10156l.admob(view, i);
        } else {
            super.admob(view, i);
        }
    }

    @Override // defpackage.C10156l
    public final void amazon(View view, C15685l c15685l) {
        AccessibilityNodeInfo accessibilityNodeInfo = c15685l.yandex;
        adcel adcelVar = this.f462l;
        RecyclerView recyclerView = adcelVar.f451l;
        RecyclerView recyclerView2 = adcelVar.f451l;
        boolean zHasPendingAdapterUpdates = recyclerView.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.f20672l;
        if (zHasPendingAdapterUpdates || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m130goto(view, c15685l);
        C10156l c10156l = (C10156l) this.f461l.get(view);
        if (c10156l != null) {
            c10156l.amazon(view, c15685l);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.C10156l
    public final boolean billing(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C10156l c10156l = (C10156l) this.f461l.get(viewGroup);
        return c10156l != null ? c10156l.billing(viewGroup, view, accessibilityEvent) : this.f20672l.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.C10156l
    public final void crashlytics(View view, AccessibilityEvent accessibilityEvent) {
        C10156l c10156l = (C10156l) this.f461l.get(view);
        if (c10156l != null) {
            c10156l.crashlytics(view, accessibilityEvent);
        } else {
            super.crashlytics(view, accessibilityEvent);
        }
    }

    @Override // defpackage.C10156l
    public final C3585l loadAd(View view) {
        C10156l c10156l = (C10156l) this.f461l.get(view);
        return c10156l != null ? c10156l.loadAd(view) : super.loadAd(view);
    }

    @Override // defpackage.C10156l
    public final boolean mopub(View view, int i, Bundle bundle) {
        adcel adcelVar = this.f462l;
        RecyclerView recyclerView = adcelVar.f451l;
        RecyclerView recyclerView2 = adcelVar.f451l;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            return super.mopub(view, i, bundle);
        }
        C10156l c10156l = (C10156l) this.f461l.get(view);
        if (c10156l != null) {
            if (c10156l.mopub(view, i, bundle)) {
                return true;
            }
        } else if (super.mopub(view, i, bundle)) {
            return true;
        }
        firebase firebaseVar = recyclerView2.getLayoutManager().loadAd.mRecycler;
        return false;
    }

    @Override // defpackage.C10156l
    public final void purchase(View view, AccessibilityEvent accessibilityEvent) {
        C10156l c10156l = (C10156l) this.f461l.get(view);
        if (c10156l != null) {
            c10156l.purchase(view, accessibilityEvent);
        } else {
            super.purchase(view, accessibilityEvent);
        }
    }

    @Override // defpackage.C10156l
    public final void subs(View view, AccessibilityEvent accessibilityEvent) {
        C10156l c10156l = (C10156l) this.f461l.get(view);
        if (c10156l != null) {
            c10156l.subs(view, accessibilityEvent);
        } else {
            super.subs(view, accessibilityEvent);
        }
    }

    @Override // defpackage.C10156l
    public final boolean yandex(View view, AccessibilityEvent accessibilityEvent) {
        C10156l c10156l = (C10156l) this.f461l.get(view);
        return c10156l != null ? c10156l.yandex(view, accessibilityEvent) : this.f20672l.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
