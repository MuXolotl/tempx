package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.isPro;

/* JADX INFO: renamed from: lؖۤؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4485l extends AbstractC15493l {
    public C6234l amazon;
    public final C4024l crashlytics = new C4024l(this);
    public Scroller loadAd;
    public C6234l purchase;
    public RecyclerView yandex;

    public static View amazon(isPro ispro, AbstractC0962l abstractC0962l) {
        int iLicense = ispro.license();
        View view = null;
        if (iLicense == 0) {
            return null;
        }
        int iSmaato = (abstractC0962l.smaato() / 2) + abstractC0962l.firebase();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < iLicense; i2++) {
            View viewSignature = ispro.Signature(i2);
            int iAbs = Math.abs(((abstractC0962l.crashlytics(viewSignature) / 2) + abstractC0962l.purchase(viewSignature)) - iSmaato);
            if (iAbs < i) {
                view = viewSignature;
                i = iAbs;
            }
        }
        return view;
    }

    public final AbstractC0962l billing(isPro ispro) {
        C6234l c6234l = this.amazon;
        if (c6234l == null || ((isPro) c6234l.loadAd) != ispro) {
            this.amazon = new C6234l(ispro, 1);
        }
        return this.amazon;
    }

    public final int crashlytics(isPro ispro, AbstractC0962l abstractC0962l, int i, int i2) {
        this.loadAd.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY);
        int[] iArr = {this.loadAd.getFinalX(), this.loadAd.getFinalY()};
        int iLicense = ispro.license();
        float f = 1.0f;
        if (iLicense != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iLicense; i5++) {
                View viewSignature = ispro.Signature(i5);
                int iM126native = isPro.m126native(viewSignature);
                if (iM126native != -1) {
                    if (iM126native < i4) {
                        view = viewSignature;
                        i4 = iM126native;
                    }
                    if (iM126native > i3) {
                        view2 = viewSignature;
                        i3 = iM126native;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(abstractC0962l.loadAd(view), abstractC0962l.loadAd(view2)) - Math.min(abstractC0962l.purchase(view), abstractC0962l.purchase(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    public final int[] loadAd(isPro ispro, View view) {
        int[] iArr = new int[2];
        if (ispro.amazon()) {
            AbstractC0962l abstractC0962lPurchase = purchase(ispro);
            iArr[0] = ((abstractC0962lPurchase.crashlytics(view) / 2) + abstractC0962lPurchase.purchase(view)) - ((abstractC0962lPurchase.smaato() / 2) + abstractC0962lPurchase.firebase());
        } else {
            iArr[0] = 0;
        }
        if (!ispro.purchase()) {
            iArr[1] = 0;
            return iArr;
        }
        AbstractC0962l abstractC0962lBilling = billing(ispro);
        iArr[1] = ((abstractC0962lBilling.crashlytics(view) / 2) + abstractC0962lBilling.purchase(view)) - ((abstractC0962lBilling.smaato() / 2) + abstractC0962lBilling.firebase());
        return iArr;
    }

    public final void mopub() {
        isPro layoutManager;
        View viewAmazon;
        RecyclerView recyclerView = this.yandex;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.purchase()) {
            viewAmazon = amazon(layoutManager, billing(layoutManager));
        } else {
            viewAmazon = layoutManager.amazon() ? amazon(layoutManager, purchase(layoutManager)) : null;
        }
        if (viewAmazon == null) {
            return;
        }
        int[] iArrLoadAd = loadAd(layoutManager, viewAmazon);
        int i = iArrLoadAd[0];
        if (i == 0 && iArrLoadAd[1] == 0) {
            return;
        }
        this.yandex.smoothScrollBy(i, iArrLoadAd[1]);
    }

    public final AbstractC0962l purchase(isPro ispro) {
        C6234l c6234l = this.purchase;
        if (c6234l == null || ((isPro) c6234l.loadAd) != ispro) {
            this.purchase = new C6234l(ispro, 0);
        }
        return this.purchase;
    }

    public final void yandex(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.yandex;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C4024l c4024l = this.crashlytics;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(c4024l);
            this.yandex.setOnFlingListener(null);
        }
        this.yandex = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                C8339l.smaato("An instance of OnFlingListener already set.");
                return;
            }
            this.yandex.addOnScrollListener(c4024l);
            this.yandex.setOnFlingListener(this);
            this.loadAd = new Scroller(this.yandex.getContext(), new DecelerateInterpolator());
            mopub();
        }
    }
}
