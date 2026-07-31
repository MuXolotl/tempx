package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: lؚؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2475l {
    public static final C2475l yandex = new C2475l();

    public final void yandex(View view, InterfaceC11325l interfaceC11325l) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC11325l instanceof C17150l ? PointerIcon.getSystemIcon(context, ((C17150l) interfaceC11325l).loadAd) : PointerIcon.getSystemIcon(context, 1000);
        if (AbstractC8576l.yandex(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
