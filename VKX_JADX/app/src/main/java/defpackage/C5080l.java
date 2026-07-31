package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: renamed from: lٕؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5080l extends AbstractC5555l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final int f11091l = View.generateViewId();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C15578l f11092l;

    public C5080l(C15578l c15578l) {
        this.f11092l = c15578l;
    }

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        ComposeView composeView = ((C1101l) interfaceC0589l).f3037l;
        composeView.setViewCompositionStrategy(C11485l.f23077l);
        composeView.setContent(new C15578l(-772507298, true, new C7959l(this, 0)));
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return f11091l;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1101l.yandex(layoutInflater, viewGroup);
    }
}
