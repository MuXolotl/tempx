package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: lؑؐؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0001l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1076l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C14422l f847l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public DialogInterfaceC13913l f848l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public SubMenuC3166l f849l;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubMenuC3166l subMenuC3166l = this.f849l;
        C14422l c14422l = this.f847l;
        if (c14422l.f28237l == null) {
            c14422l.f28237l = new C11377l(c14422l);
        }
        subMenuC3166l.adcel(c14422l.f28237l.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f847l.yandex(this.f849l, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC3166l subMenuC3166l = this.f849l;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f848l.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f848l.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC3166l.crashlytics(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC3166l.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.InterfaceC1076l
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final boolean mo248try(MenuC4984l menuC4984l) {
        return false;
    }

    @Override // defpackage.InterfaceC1076l
    public final void yandex(MenuC4984l menuC4984l, boolean z) {
        DialogInterfaceC13913l dialogInterfaceC13913l;
        if ((z || menuC4984l == this.f849l) && (dialogInterfaceC13913l = this.f848l) != null) {
            dialogInterfaceC13913l.dismiss();
        }
    }
}
