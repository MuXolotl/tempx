package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* JADX INFO: renamed from: lُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11250l implements InterfaceC0476l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final View f22673l;

    public C11250l(ImageView imageView) {
        this.f22673l = imageView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11250l) && AbstractC8576l.yandex(this.f22673l, ((C11250l) obj).f22673l);
    }

    public final int hashCode() {
        return (this.f22673l.hashCode() * 31) + 1231;
    }

    @Override // defpackage.InterfaceC0476l
    public final Object loadAd(AbstractC0283l abstractC0283l) {
        C9192l c9192lLicense = AbstractC12589l.license(this);
        if (c9192lLicense != null) {
            return c9192lLicense;
        }
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(abstractC0283l));
        c2397l.license();
        ViewTreeObserver viewTreeObserver = this.f22673l.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC4527l viewTreeObserverOnPreDrawListenerC4527l = new ViewTreeObserverOnPreDrawListenerC4527l(this, viewTreeObserver, c2397l);
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC4527l);
        c2397l.ad(new C18028l(this, viewTreeObserver, viewTreeObserverOnPreDrawListenerC4527l, 2));
        return c2397l.Signature();
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.f22673l + ", subtractPadding=true)";
    }
}
