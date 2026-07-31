package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lِٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11870l extends AbstractC17886l {
    @Override // defpackage.InterfaceC11189l
    public final /* bridge */ /* synthetic */ Object adcel() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.AbstractC17886l
    /* JADX INFO: renamed from: lؘٗۦ */
    public final void mo1999l(InterfaceC11325l interfaceC11325l) {
        InterfaceC11051l interfaceC11051l = (InterfaceC11051l) AbstractC13402l.loadAd(this, AbstractC4751l.pro);
        if (interfaceC11051l != null) {
            C11351l c11351l = (C11351l) interfaceC11051l;
            if (interfaceC11325l == null) {
                InterfaceC11325l.yandex.getClass();
                interfaceC11325l = AbstractC4047l.yandex;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                C2475l.yandex.yandex(c11351l.loadAd, interfaceC11325l);
            }
        }
    }

    @Override // defpackage.AbstractC17886l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public final boolean mo2000l(int i) {
        return (i == 3 || i == 4) ? false : true;
    }
}
