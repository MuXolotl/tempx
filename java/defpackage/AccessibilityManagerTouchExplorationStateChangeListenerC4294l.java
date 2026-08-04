package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lٟؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC4294l implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2683l f8780l;

    public AccessibilityManagerTouchExplorationStateChangeListenerC4294l(C2683l c2683l) {
        this.f8780l = c2683l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC4294l) {
            return this.f8780l.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC4294l) obj).f8780l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8780l.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C0602l c0602l = (C0602l) this.f8780l.f5813l;
        AutoCompleteTextView autoCompleteTextView = c0602l.admob;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = c0602l.amazon;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
