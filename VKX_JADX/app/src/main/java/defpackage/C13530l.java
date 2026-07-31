package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.CustomBottomSheetBehavior;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lُْٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13530l {
    public CustomBottomSheetBehavior amazon;
    public boolean billing;
    public final C9879l crashlytics;
    public final C4983l loadAd = new C4983l(4, this);
    public boolean purchase;
    public final AppActivity yandex;

    public C13530l(AppActivity appActivity) {
        this.yandex = appActivity;
        this.crashlytics = new C9879l(appActivity);
    }

    public final void amazon(boolean z) {
        if (loadAd()) {
            CustomBottomSheetBehavior customBottomSheetBehavior = this.amazon;
            if (customBottomSheetBehavior == null) {
                customBottomSheetBehavior = null;
            }
            customBottomSheetBehavior.f642native = !z;
        }
    }

    public final void billing() {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        if (c16076l.mopub()) {
            return;
        }
        CustomBottomSheetBehavior customBottomSheetBehavior = this.amazon;
        (customBottomSheetBehavior != null ? customBottomSheetBehavior : null).appmetrica(3);
    }

    public final void crashlytics() {
        CustomBottomSheetBehavior customBottomSheetBehavior = this.amazon;
        if (customBottomSheetBehavior == null) {
            customBottomSheetBehavior = null;
        }
        customBottomSheetBehavior.premium(true);
        CustomBottomSheetBehavior customBottomSheetBehavior2 = this.amazon;
        (customBottomSheetBehavior2 != null ? customBottomSheetBehavior2 : null).appmetrica(5);
    }

    public final boolean loadAd() {
        return this.amazon != null;
    }

    public final void purchase(float f) {
        AppActivity appActivity = this.yandex;
        if (appActivity.f36640l != null) {
            float fFloatValue = ((Number) AbstractC8576l.admob(Float.valueOf(f), new C12015l(0.0f, 1.0f))).floatValue();
            float f2 = 1.0f - fFloatValue;
            ((View) appActivity.f36640l.f15735l).setAlpha(Math.min(fFloatValue, 0.85f));
            if (fFloatValue > 0.0f && ((View) appActivity.f36640l.f15735l).getVisibility() == 8) {
                ((View) appActivity.f36640l.f15735l).setClickable(true);
                ((View) appActivity.f36640l.f15735l).setFocusable(true);
                ((View) appActivity.f36640l.f15735l).setVisibility(0);
            }
            boolean z = this.billing;
            if (fFloatValue > 0.35f) {
                if (!z) {
                    AbstractC12832l.mopub(new C8949l(false), AbstractC11990l.firebase(appActivity));
                    this.billing = true;
                }
            } else if (z) {
                AbstractC12832l.mopub(new C8949l(true), AbstractC11990l.firebase(appActivity));
                this.billing = false;
            }
            boolean z2 = this.purchase;
            if (fFloatValue > 0.98f) {
                if (!z2) {
                    AbstractC12832l.mopub(new C12741l(true), AbstractC11990l.firebase(appActivity));
                    this.purchase = true;
                }
            } else if (z2) {
                AbstractC12832l.mopub(new C12741l(false), AbstractC11990l.firebase(appActivity));
                this.purchase = false;
            }
            LinearLayout linearLayout = (LinearLayout) appActivity.f36640l.f15739l;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams.bottomMargin = -Math.max(0, (int) (((LinearLayout) appActivity.f36640l.f15739l).getHeight() * fFloatValue));
            linearLayout.setLayoutParams(marginLayoutParams);
            C9879l c9879l = this.crashlytics;
            c9879l.vip.subs(f2);
            c9879l.metrica.setValue(Boolean.valueOf(!(f2 == 0.0f)));
        }
    }

    public final void yandex() {
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        if (c16076l.mopub()) {
            return;
        }
        AbstractC12832l.mopub(C11841l.yandex, AbstractC11990l.firebase(this.yandex));
        CustomBottomSheetBehavior customBottomSheetBehavior = this.amazon;
        (customBottomSheetBehavior != null ? customBottomSheetBehavior : null).appmetrica(4);
    }
}
