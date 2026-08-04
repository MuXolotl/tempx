package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُ۠ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11390l extends AbstractC14412l {
    public final float admob;
    public final Function1 amazon;
    public final C15308l billing = new C15308l(0);
    public final boolean crashlytics;
    public final C11362l mopub;
    public ComposeView purchase;

    public C11390l(List list, boolean z, Function1 function1) {
        this.crashlytics = z;
        this.amazon = function1;
        C11362l c11362l = new C11362l();
        c11362l.addAll(list);
        this.mopub = c11362l;
        this.admob = 0.5f;
    }

    @Override // defpackage.AbstractC14412l
    public final void admob(int i) {
        ComposeView composeView = this.purchase;
        if (composeView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) composeView.getLayoutParams();
        marginLayoutParams2.topMargin = i;
        marginLayoutParams2.bottomMargin = i2;
        composeView.setLayoutParams(marginLayoutParams2);
    }

    @Override // defpackage.AbstractC14412l
    public final View amazon(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(C11485l.f23077l);
        composeView.setContent(new C15578l(1336946297, true, new C9525l(this, 0)));
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Resources resources = vKXApplication.getResources();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, resources.getDimensionPixelSize(typedValue.resourceId)));
        this.purchase = composeView;
        return composeView;
    }

    public final void firebase(int i, float f) {
        int size;
        if (f >= this.admob && (i = i + 1) > (size = this.mopub.size())) {
            i = size;
        }
        this.billing.subs(i);
    }

    @Override // defpackage.AbstractC14412l
    public final View purchase() {
        ComposeView composeView = this.purchase;
        if (composeView == null) {
            return null;
        }
        return composeView;
    }

    @Override // defpackage.AbstractC14412l
    public final void billing() {
    }
}
