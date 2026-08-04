package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: lَٜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC17827l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ View f34760l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34761l;

    public /* synthetic */ RunnableC17827l(View view, int i) {
        this.f34761l = i;
        this.f34760l = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34761l;
        View view = this.f34760l;
        switch (i) {
            case 0:
                view.setAlpha(1.0f);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
        }
    }
}
