package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: lؖٝۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4270l implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C17223l f8765l;

    public C4270l(C17223l c17223l) {
        this.f8765l = c17223l;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f8765l.crashlytics();
    }
}
