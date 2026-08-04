package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: lؘٝۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5841l extends C10156l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ View f12303l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f12304l;

    public /* synthetic */ C5841l(View view, int i) {
        this.f12304l = i;
        this.f12303l = view;
    }

    @Override // defpackage.C10156l
    public final void amazon(View view, C15685l c15685l) {
        int i = this.f12304l;
        View view2 = this.f12303l;
        View.AccessibilityDelegate accessibilityDelegate = this.f20672l;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c15685l.yandex);
                c15685l.isPro(AbstractC2361l.class.getName());
                AbstractC2361l abstractC2361l = (AbstractC2361l) view2;
                AbstractC3362l abstractC3362l = abstractC2361l.mAdapter;
                c15685l.ads(abstractC3362l != null && abstractC3362l.loadAd() > 1);
                if (abstractC2361l.canScrollHorizontally(1)) {
                    c15685l.yandex(4096);
                }
                if (abstractC2361l.canScrollHorizontally(-1)) {
                    c15685l.yandex(8192);
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = c15685l.yandex;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f679l);
                accessibilityNodeInfo.setChecked(checkableImageButton.f680l);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // defpackage.C10156l
    public final void crashlytics(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        AbstractC3362l abstractC3362l;
        int i = this.f12304l;
        View view2 = this.f12303l;
        switch (i) {
            case 0:
                AbstractC2361l abstractC2361l = (AbstractC2361l) view2;
                super.crashlytics(view, accessibilityEvent);
                accessibilityEvent.setClassName(AbstractC2361l.class.getName());
                AbstractC3362l abstractC3362l2 = abstractC2361l.mAdapter;
                if (abstractC3362l2 != null) {
                    z = abstractC3362l2.loadAd() > 1;
                }
                accessibilityEvent.setScrollable(z);
                if (accessibilityEvent.getEventType() == 4096 && (abstractC3362l = abstractC2361l.mAdapter) != null) {
                    accessibilityEvent.setItemCount(abstractC3362l.loadAd());
                    accessibilityEvent.setFromIndex(abstractC2361l.mCurItem);
                    accessibilityEvent.setToIndex(abstractC2361l.mCurItem);
                    break;
                }
                break;
            default:
                super.crashlytics(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) view2).f680l);
                break;
        }
    }

    @Override // defpackage.C10156l
    public boolean mopub(View view, int i, Bundle bundle) {
        switch (this.f12304l) {
            case 0:
                AbstractC2361l abstractC2361l = (AbstractC2361l) this.f12303l;
                if (super.mopub(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i == 8192 && abstractC2361l.canScrollHorizontally(-1)) {
                        abstractC2361l.setCurrentItem(abstractC2361l.mCurItem - 1);
                        return true;
                    }
                } else if (abstractC2361l.canScrollHorizontally(1)) {
                    abstractC2361l.setCurrentItem(abstractC2361l.mCurItem + 1);
                    return true;
                }
                return false;
            default:
                return super.mopub(view, i, bundle);
        }
    }
}
