package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.C10156l;
import defpackage.C12448l;
import defpackage.C15685l;
import defpackage.C6933l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class loadAd extends C10156l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ CoordinatorLayout f626l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AppBarLayout f627l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AppBarLayout.BaseBehavior f628l;

    public loadAd(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f628l = baseBehavior;
        this.f627l = appBarLayout;
        this.f626l = coordinatorLayout;
    }

    @Override // defpackage.C10156l
    public final void amazon(View view, C15685l c15685l) {
        this.f20672l.onInitializeAccessibilityNodeInfo(view, c15685l.yandex);
        c15685l.isPro("android.widget.ScrollView");
        AppBarLayout appBarLayout = this.f627l;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f626l;
        AppBarLayout.BaseBehavior baseBehavior = this.f628l;
        View viewAd = AppBarLayout.BaseBehavior.ad(baseBehavior, coordinatorLayout);
        if (viewAd == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C12448l) appBarLayout.getChildAt(i).getLayoutParams()).yandex != 0) {
                if (baseBehavior.Signature() != (-appBarLayout.getTotalScrollRange())) {
                    c15685l.loadAd(C6933l.admob);
                    c15685l.ads(true);
                }
                if (baseBehavior.Signature() != 0) {
                    if (!viewAd.canScrollVertically(-1)) {
                        c15685l.loadAd(C6933l.subs);
                        c15685l.ads(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            c15685l.loadAd(C6933l.subs);
                            c15685l.ads(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.C10156l
    public final boolean mopub(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.f627l;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.mopub(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f628l;
        if (baseBehavior.Signature() != 0) {
            CoordinatorLayout coordinatorLayout = this.f626l;
            View viewAd = AppBarLayout.BaseBehavior.ad(baseBehavior, coordinatorLayout);
            if (!viewAd.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.signatures(coordinatorLayout, this.f627l, viewAd, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
