package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: lُۣۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11336l extends AbstractC5473l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22837l = 0;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC4411l f22838l;

    public C11336l(DialogInterfaceOnCancelListenerC0435l dialogInterfaceOnCancelListenerC0435l, C11336l c11336l) {
        this.f22838l = dialogInterfaceOnCancelListenerC0435l;
    }

    @Override // defpackage.AbstractC5473l
    public final View admob(int i) {
        int i2 = this.f22837l;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.f22838l;
        switch (i2) {
            case 0:
                Dialog dialog = ((DialogInterfaceOnCancelListenerC0435l) abstractComponentCallbacksC4411l).f1606l;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC4411l + " does not have a view");
        }
    }

    @Override // defpackage.AbstractC5473l
    public final boolean subs() {
        switch (this.f22837l) {
            case 0:
                return ((DialogInterfaceOnCancelListenerC0435l) this.f22838l).f1603l;
            default:
                return false;
        }
    }

    public C11336l(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        this.f22838l = abstractComponentCallbacksC4411l;
    }
}
