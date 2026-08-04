package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕۥؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC16043l implements View.OnApplyWindowInsetsListener {
    public C1473l loadAd;
    public final AbstractC15029l yandex;

    public ViewOnApplyWindowInsetsListenerC16043l(View view, AbstractC15029l abstractC15029l) {
        C1473l c1473lLoadAd;
        this.yandex = abstractC15029l;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        C1473l c1473lYandex = AbstractC18487l.yandex(view);
        if (c1473lYandex != null) {
            int i = Build.VERSION.SDK_INT;
            c1473lLoadAd = (i >= 36 ? new C1145l(c1473lYandex) : i >= 35 ? new C0157l(c1473lYandex) : i >= 34 ? new C11094l(c1473lYandex) : i >= 31 ? new C13338l(c1473lYandex) : i >= 30 ? new C14430l(c1473lYandex) : i >= 29 ? new C18209l(c1473lYandex) : new C4132l(c1473lYandex)).loadAd();
        } else {
            c1473lLoadAd = null;
        }
        this.loadAd = c1473lLoadAd;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.loadAd = C1473l.admob(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        C1473l c1473lAdmob = C1473l.admob(windowInsets, view);
        C17212l c17212l = c1473lAdmob.yandex;
        if (this.loadAd == null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            this.loadAd = AbstractC18487l.yandex(view);
        }
        if (this.loadAd == null) {
            this.loadAd = c1473lAdmob;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            AbstractC15029l abstractC15029lSubs = C12441l.subs(view);
            if (abstractC15029lSubs == null || !Objects.equals((C1473l) abstractC15029lSubs.f29554l, c1473lAdmob)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                C1473l c1473l = this.loadAd;
                int i = 1;
                while (i <= 512) {
                    C15496l c15496lSubs = c17212l.subs(i);
                    C15496l c15496lSubs2 = c1473l.yandex.subs(i);
                    int i2 = c15496lSubs.yandex;
                    int i3 = c15496lSubs.amazon;
                    int i4 = c15496lSubs.crashlytics;
                    int i5 = c15496lSubs.loadAd;
                    int i6 = c15496lSubs2.yandex;
                    int i7 = c15496lSubs2.amazon;
                    int[] iArr3 = iArr;
                    int i8 = c15496lSubs2.crashlytics;
                    int i9 = c15496lSubs2.loadAd;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.loadAd = c1473lAdmob;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    C1473l c1473l2 = this.loadAd;
                    if ((i10 & 8) != 0) {
                        interpolator = C12441l.purchase;
                    } else if ((i11 & 8) != 0) {
                        interpolator = C12441l.billing;
                    } else if ((i10 & 519) != 0) {
                        interpolator = C12441l.mopub;
                    } else {
                        interpolator = (i11 & 519) != 0 ? C12441l.admob : null;
                    }
                    C12902l c12902l = new C12902l(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    c12902l.yandex.amazon(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c12902l.yandex.yandex());
                    C15496l c15496lSubs3 = c17212l.subs(i12);
                    C15496l c15496lSubs4 = c1473l2.yandex.subs(i12);
                    int iMin = Math.min(c15496lSubs3.yandex, c15496lSubs4.yandex);
                    int i13 = c15496lSubs3.loadAd;
                    int i14 = c15496lSubs4.loadAd;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = c15496lSubs3.crashlytics;
                    int i16 = c15496lSubs4.crashlytics;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = c15496lSubs3.amazon;
                    int i18 = c15496lSubs4.amazon;
                    C13645l c13645l = new C13645l(C15496l.loadAd(iMin, iMin2, iMin3, Math.min(i17, i18)), C15496l.loadAd(Math.max(c15496lSubs3.yandex, c15496lSubs4.yandex), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), 27);
                    C12441l.billing(view, c12902l, c1473lAdmob, false);
                    duration.addUpdateListener(new C6672l(c12902l, c1473lAdmob, c1473l2, i12, view));
                    duration.addListener(new C0696l(c12902l, view));
                    ViewTreeObserverOnPreDrawListenerC13134l.yandex(view, new RunnableC16843l(4, view, c12902l, c13645l, duration, false));
                    this.loadAd = c1473lAdmob;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
