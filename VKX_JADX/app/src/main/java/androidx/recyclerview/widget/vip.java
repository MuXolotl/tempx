package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import defpackage.AbstractC13480l;
import defpackage.AbstractC15872l;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class vip implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public OverScroller f466l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f467l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f468l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f469l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f470l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Interpolator f471l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f472l;

    public vip(RecyclerView recyclerView) {
        this.f467l = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f471l = interpolator;
        this.f470l = false;
        this.f472l = false;
        this.f466l = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void crashlytics(int i, int i2, Interpolator interpolator, int i3) {
        RecyclerView recyclerView = this.f467l;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f471l != interpolator) {
            this.f471l = interpolator;
            this.f466l = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f468l = 0;
        this.f469l = 0;
        recyclerView.setScrollState(2);
        this.f466l.startScroll(0, 0, i, i2, i4);
        loadAd();
    }

    public final void loadAd() {
        if (this.f470l) {
            this.f472l = true;
            return;
        }
        RecyclerView recyclerView = this.f467l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f467l;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f466l.abortAnimation();
            return;
        }
        this.f472l = false;
        this.f470l = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f466l;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f469l;
            int i7 = currY - this.f468l;
            this.f469l = currX;
            this.f468l = currY;
            int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i6);
            int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i7);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                iConsumeFlingInHorizontalStretch -= iArr2[0];
                iConsumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i8 = iArr4[0];
                int i9 = iArr4[1];
                int i10 = iConsumeFlingInHorizontalStretch - i8;
                int i11 = iConsumeFlingInVerticalStretch - i9;
                purchase purchaseVar = recyclerView.mLayout.purchase;
                if (purchaseVar != null && !purchaseVar.amazon && purchaseVar.purchase) {
                    int iLoadAd = recyclerView.mState.loadAd();
                    if (iLoadAd == 0) {
                        purchaseVar.subs();
                    } else if (purchaseVar.yandex >= iLoadAd) {
                        purchaseVar.yandex = iLoadAd - 1;
                        purchaseVar.mopub(i8, i9);
                    } else {
                        purchaseVar.mopub(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iConsumeFlingInHorizontalStretch;
                i2 = iConsumeFlingInVerticalStretch;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i3, i4, i, i2, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i12 = i - iArr6[0];
            int i13 = i2 - iArr6[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.dispatchOnScrolled(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            purchase purchaseVar2 = recyclerView.mLayout.purchase;
            if ((purchaseVar2 == null || !purchaseVar2.amazon) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i5, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    crashlytics crashlyticsVar = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = crashlyticsVar.crashlytics;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    crashlyticsVar.amazon = 0;
                }
            } else {
                loadAd();
                amazon amazonVar = recyclerView.mGapWorker;
                if (amazonVar != null) {
                    amazonVar.yandex(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC13480l.yandex(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        purchase purchaseVar3 = recyclerView.mLayout.purchase;
        if (purchaseVar3 != null && purchaseVar3.amazon) {
            purchaseVar3.mopub(0, 0);
        }
        this.f470l = false;
        if (!this.f472l) {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            recyclerView.postOnAnimation(this);
        }
    }

    public final void yandex(int i, int i2) {
        RecyclerView recyclerView = this.f467l;
        recyclerView.setScrollState(2);
        this.f468l = 0;
        this.f469l = 0;
        Interpolator interpolator = this.f471l;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f471l = interpolator2;
            this.f466l = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f466l.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY);
        loadAd();
    }
}
