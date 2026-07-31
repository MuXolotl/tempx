package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: lُٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C15238l extends AccessibilityNodeProvider {
    public final C3585l yandex;

    public C15238l(C3585l c3585l) {
        this.yandex = c3585l;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C15685l c15685lSmaato = this.yandex.smaato(i);
        if (c15685lSmaato == null) {
            return null;
        }
        return c15685lSmaato.yandex;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.yandex.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C15685l c15685lAds = this.yandex.ads(i);
        if (c15685lAds == null) {
            return null;
        }
        return c15685lAds.yandex;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.yandex.premium(i, i2, bundle);
    }
}
