package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: lؒۗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1268l extends C10156l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C8697l f3300l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C3654l f3301l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC13840l f3302l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC13840l f3303l;

    public C1268l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, C3654l c3654l, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l2, C8697l c8697l) {
        this.f3302l = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.f3301l = c3654l;
        this.f3303l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
        this.f3300l = c8697l;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // defpackage.C10156l
    public final void amazon(View view, C15685l c15685l) {
        AccessibilityNodeInfo accessibilityNodeInfo = c15685l.yandex;
        this.f20672l.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f3302l;
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = viewTreeObserverOnGlobalLayoutListenerC13840l.f27003l;
        if (viewOnAttachStateChangeListenerC9659l.Signature()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C3654l c3654l = this.f3301l;
        C3654l c3654lLicense = c3654l.license();
        while (true) {
            if (c3654lLicense == null) {
                c3654lLicense = null;
                break;
            } else if (c3654lLicense.f7703l.admob(8)) {
                break;
            } else {
                c3654lLicense = c3654lLicense.license();
            }
        }
        Integer numValueOf = c3654lLicense != null ? Integer.valueOf(c3654lLicense.f7685l) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == viewTreeObserverOnGlobalLayoutListenerC13840l.getSemanticsOwner().yandex().billing) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        c15685l.loadAd = iIntValue;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l2 = this.f3303l;
        accessibilityNodeInfo.setParent(viewTreeObserverOnGlobalLayoutListenerC13840l2, iIntValue);
        int i = c3654l.f7685l;
        int iAmazon = viewOnAttachStateChangeListenerC9659l.f19729l.amazon(i);
        C8697l c8697l = this.f3300l;
        if (iAmazon != -1) {
            AbstractC0290l abstractC0290lMopub = AbstractC4603l.mopub(c8697l, iAmazon);
            if (abstractC0290lMopub != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC0290lMopub);
            } else {
                accessibilityNodeInfo.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC13840l2, iAmazon);
            }
            ViewTreeObserverOnGlobalLayoutListenerC13840l.loadAd(viewTreeObserverOnGlobalLayoutListenerC13840l, i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC9659l.f19721l);
        }
        int iAmazon2 = viewOnAttachStateChangeListenerC9659l.f19739l.amazon(i);
        if (iAmazon2 != -1) {
            AbstractC0290l abstractC0290lMopub2 = AbstractC4603l.mopub(c8697l, iAmazon2);
            if (abstractC0290lMopub2 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC0290lMopub2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(viewTreeObserverOnGlobalLayoutListenerC13840l2, iAmazon2);
            }
            ViewTreeObserverOnGlobalLayoutListenerC13840l.loadAd(viewTreeObserverOnGlobalLayoutListenerC13840l, i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC9659l.f19733l);
        }
    }
}
