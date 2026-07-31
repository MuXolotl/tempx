package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْۥ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13793l extends AbstractC5555l {
    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        ((C15498l) interfaceC0589l).f30291l.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return R.layout.c3_separator;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_separator, viewGroup, false);
        if (viewInflate != null) {
            return new C15498l(viewInflate);
        }
        C6541l.subs("rootView");
        return null;
    }
}
