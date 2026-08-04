package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: renamed from: lًۨۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8452l extends AbstractC14630l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final int f17459l = View.generateViewId();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C15578l f17460l;

    public C8452l(C15578l c15578l) {
        this.f17460l = c15578l;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return f17459l;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        ComposeView composeView = ((C1101l) interfaceC0589l).f3037l;
        composeView.setViewCompositionStrategy(C11485l.f23077l);
        composeView.setContent(new C15578l(840351910, true, new C14916l(this, (InterfaceC12360l) obj, 0)));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1101l.yandex(layoutInflater, viewGroup);
    }
}
