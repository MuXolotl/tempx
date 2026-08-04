package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1101l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ComposeView f3037l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ComposeView f3038l;

    public C1101l(ComposeView composeView, ComposeView composeView2) {
        this.f3038l = composeView;
        this.f3037l = composeView2;
    }

    public static C1101l yandex(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_compose, viewGroup, false);
        if (viewInflate != null) {
            ComposeView composeView = (ComposeView) viewInflate;
            return new C1101l(composeView, composeView);
        }
        C6541l.subs("rootView");
        return null;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f3038l;
    }
}
