package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؗۗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5097l extends AbstractC2338l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C15700l f11108l;

    public AbstractC5097l(boolean z, int i) {
        super((i & 1) != 0 ? false : z, (i & 2) == 0);
        this.f11108l = new C15700l();
    }

    @Override // defpackage.AbstractC2338l
    public final void amazon(int i, int i2) {
        this.f11108l.loadAd.subs(i + i2);
    }

    @Override // defpackage.AbstractC2338l
    public final View firebase(ViewGroup viewGroup) {
        return new ComposeView(viewGroup.getContext(), null, 0, 6, null);
    }

    public abstract void license(C6956l c6956l, int i);

    @Override // defpackage.AbstractC2338l
    public final int mopub() {
        return -2;
    }

    @Override // defpackage.AbstractC2338l
    public final void subscription(View view) {
        AppActivity appActivity = (AppActivity) this.f5081l;
        this.f11108l.crashlytics.setValue(AbstractC7252l.purchase(AbstractC13209l.purchase.crashlytics));
        ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
        if (composeView != null) {
            composeView.setViewCompositionStrategy(C1083l.f2991l);
            composeView.setContent(new C15578l(1543482085, true, new C17426l(this, appActivity)));
        }
    }
}
