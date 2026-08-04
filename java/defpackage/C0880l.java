package defpackage;

import android.animation.AnimatorSet;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lؘؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0880l extends AbstractC3772l {
    public AnimatorSet crashlytics;
    public final C17085l loadAd;

    public C0880l(C17085l c17085l) {
        this.loadAd = c17085l;
    }

    @Override // defpackage.AbstractC3772l
    public final void crashlytics(ViewGroup viewGroup) {
        C17085l c17085l = this.loadAd;
        if (c17085l.startapp()) {
            return;
        }
        C0458l c0458lTapsense = c17085l.tapsense(viewGroup.getContext());
        this.crashlytics = c0458lTapsense != null ? (AnimatorSet) c0458lTapsense.f1690l : null;
        throw null;
    }

    @Override // defpackage.AbstractC3772l
    public final void loadAd(C0560l c0560l) {
        this.crashlytics.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // defpackage.AbstractC3772l
    public final void yandex(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.crashlytics;
        animatorSet.getClass();
        animatorSet.start();
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }
}
