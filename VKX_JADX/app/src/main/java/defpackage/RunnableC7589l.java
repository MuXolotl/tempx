package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: lؚۢٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7589l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ActionBarOverlayLayout f15594l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15595l;

    public /* synthetic */ RunnableC7589l(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f15595l = i;
        this.f15594l = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15595l;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f15594l;
        switch (i) {
            case 0:
                actionBarOverlayLayout.loadAd();
                actionBarOverlayLayout.f154l = actionBarOverlayLayout.f146l.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f136l);
                break;
            default:
                actionBarOverlayLayout.loadAd();
                actionBarOverlayLayout.f154l = actionBarOverlayLayout.f146l.animate().translationY(-actionBarOverlayLayout.f146l.getHeight()).setListener(actionBarOverlayLayout.f136l);
                break;
        }
    }
}
