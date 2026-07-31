package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lٖؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3619l extends AbstractC0013l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5184l f7551l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7552l;

    public /* synthetic */ C3619l(C5184l c5184l, int i) {
        this.f7552l = i;
        this.f7551l = c5184l;
    }

    @Override // defpackage.InterfaceC5174l
    public final void crashlytics() {
        View view;
        int i = this.f7552l;
        C5184l c5184l = this.f7551l;
        switch (i) {
            case 0:
                if (c5184l.metrica && (view = c5184l.mopub) != null) {
                    view.setTranslationY(0.0f);
                    c5184l.amazon.setTranslationY(0.0f);
                }
                c5184l.amazon.setVisibility(8);
                c5184l.amazon.setTransitioning(false);
                c5184l.subscription = null;
                C10023l c10023l = c5184l.firebase;
                if (c10023l != null) {
                    c10023l.inmobi(c5184l.isPro);
                    c5184l.isPro = null;
                    c5184l.firebase = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c5184l.crashlytics;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                c5184l.subscription = null;
                c5184l.amazon.requestLayout();
                break;
        }
    }
}
