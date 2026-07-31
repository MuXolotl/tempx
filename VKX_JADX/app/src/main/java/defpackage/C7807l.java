package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7807l extends AbstractC10553l {
    @Override // defpackage.AbstractC10553l
    public final /* bridge */ /* synthetic */ void applovin(InterfaceC0589l interfaceC0589l) {
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return R.layout.c3_load_placeholder;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_load_placeholder, viewGroup, false);
        if (viewInflate != null) {
            return new C18432l((ProgressBar) viewInflate);
        }
        C6541l.subs("rootView");
        return null;
    }
}
