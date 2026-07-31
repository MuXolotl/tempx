package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: renamed from: lّۚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12846l {
    public static final ViewGroup.LayoutParams yandex = new ViewGroup.LayoutParams(-2, -2);

    public static void yandex(AbstractActivityC14666l abstractActivityC14666l, C15578l c15578l) {
        View childAt = ((ViewGroup) abstractActivityC14666l.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(c15578l);
            return;
        }
        ComposeView composeView2 = new ComposeView(abstractActivityC14666l, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(c15578l);
        View decorView = abstractActivityC14666l.getWindow().getDecorView();
        if (AbstractC6889l.purchase(decorView) == null) {
            decorView.setTag(ua.itaysonlab.vkx.R.id.view_tree_lifecycle_owner, abstractActivityC14666l);
        }
        if (AbstractC1135l.crashlytics(decorView) == null) {
            decorView.setTag(ua.itaysonlab.vkx.R.id.view_tree_view_model_store_owner, abstractActivityC14666l);
        }
        if (AbstractC17344l.loadAd(decorView) == null) {
            decorView.setTag(ua.itaysonlab.vkx.R.id.view_tree_saved_state_registry_owner, abstractActivityC14666l);
        }
        abstractActivityC14666l.setContentView(composeView2, yandex);
    }
}
