package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؓؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1632l extends C2956l implements InterfaceC1173l {

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final Method f3963l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public C5008l f3964l;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3963l = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.InterfaceC1173l
    public final void billing(MenuC4984l menuC4984l, MenuItem menuItem) {
        C5008l c5008l = this.f3964l;
        if (c5008l != null) {
            c5008l.billing(menuC4984l, menuItem);
        }
    }

    @Override // defpackage.InterfaceC1173l
    public final void vip(MenuC4984l menuC4984l, C17858l c17858l) {
        C5008l c5008l = this.f3964l;
        if (c5008l != null) {
            c5008l.vip(menuC4984l, c17858l);
        }
    }

    @Override // defpackage.C2956l
    public final C9945l yandex(Context context, boolean z) {
        C7564l c7564l = new C7564l(context, z);
        c7564l.setHoverListener(this);
        return c7564l;
    }
}
