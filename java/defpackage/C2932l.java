package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lِؔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2932l {
    public final WeakReference yandex;

    public C2932l(View view) {
        this.yandex = new WeakReference(view);
    }

    public final void amazon(InterfaceC5174l interfaceC5174l) {
        View view = (View) this.yandex.get();
        if (view != null) {
            if (interfaceC5174l != null) {
                view.animate().setListener(new C7538l(interfaceC5174l, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void crashlytics(long j) {
        View view = (View) this.yandex.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void loadAd() {
        View view = (View) this.yandex.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void purchase(float f) {
        View view = (View) this.yandex.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void yandex(float f) {
        View view = (View) this.yandex.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }
}
