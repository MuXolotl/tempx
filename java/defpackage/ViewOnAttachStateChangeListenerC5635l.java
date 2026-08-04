package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lؘّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5635l implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C0364l f11990l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C7504l f11991l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C8196l f11992l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f11993l;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0364l c0364l = this.f11990l;
        if (c0364l == null) {
            return;
        }
        this.f11993l = true;
        c0364l.f1433l.yandex(c0364l.f1432l);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C0364l c0364l = this.f11990l;
        if (c0364l != null) {
            c0364l.amazon();
        }
    }

    public final synchronized void yandex() {
        try {
            C7504l c7504l = this.f11991l;
            InterfaceC14029l interfaceC14029l = null;
            if (c7504l != null) {
                c7504l.ads(null);
            }
            C1732l c1732l = C1732l.f4136l;
            C16552l c16552l = AbstractC11463l.yandex;
            this.f11991l = AbstractC10999l.mopub(c1732l, AbstractC17278l.yandex.f6462l, 0, new C14019l(this, interfaceC14029l, 27), 2);
            this.f11992l = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
