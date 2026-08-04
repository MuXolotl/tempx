package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lُۖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11235l extends AbstractC14971l implements InterfaceC3228l {
    @Override // defpackage.InterfaceC3228l
    /* JADX INFO: renamed from: synchronized */
    public final void mo1299synchronized(InterfaceC1389l interfaceC1389l) {
        View viewYandex = AbstractC12396l.yandex(this);
        interfaceC1389l.amazon(this.f29454l.f29462l && AbstractC12396l.yandex(this).hasFocusable());
        View viewFindFocus = viewYandex.findFocus();
        if (viewFindFocus != null) {
            interfaceC1389l.purchase(AbstractC17194l.yandex(viewFindFocus, viewYandex));
        }
    }
}
