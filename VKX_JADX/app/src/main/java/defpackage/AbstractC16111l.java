package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٖؐٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16111l extends AbstractC2338l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C15700l f31561l;

    public AbstractC16111l() {
        super(false, false);
        this.f31561l = new C15700l();
    }

    @Override // defpackage.AbstractC2338l
    public final void amazon(int i, int i2) {
        this.f31561l.loadAd.subs(i + i2);
    }

    @Override // defpackage.AbstractC2338l
    public final View firebase(ViewGroup viewGroup) {
        return new ComposeView(viewGroup.getContext(), null, 0, 6, null);
    }

    public abstract void license(Object obj, C6956l c6956l);

    @Override // defpackage.AbstractC2338l
    public final int mopub() {
        return -2;
    }

    public abstract Object pro(C16793l c16793l);

    @Override // defpackage.AbstractC2338l
    public final void subscription(View view) {
        C3464l c3464l;
        C16390l c16390lYandex;
        this.f31561l.crashlytics.setValue(AbstractC7252l.purchase(AbstractC13209l.purchase.crashlytics));
        Activity activity = this.f5081l;
        AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
        C10023l c10023l = new C10023l(this.f5077l);
        if (appActivity == null || (c16390lYandex = appActivity.yandex()) == null) {
            c3464l = null;
        } else {
            c3464l = new C3464l();
            C4983l c4983l = new C4983l(c3464l);
            C0760l c0760l = new C0760l(c4983l, new C9282l(c4983l, null));
            c4983l.yandex.add(c0760l);
            C1527l.yandex(c16390lYandex.loadAd().crashlytics, c0760l);
        }
        Object objPro = pro(new C16793l(c10023l, null, null, c3464l));
        ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
        if (composeView != null) {
            composeView.setViewCompositionStrategy(C1083l.f2991l);
            composeView.setContent(new C15578l(435544803, true, new C0793l(this, objPro, 0)));
        }
    }
}
