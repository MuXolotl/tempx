package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: lؔٗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2672l implements InterfaceC7623l, InterfaceC18325l, InterfaceC3710l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ImageView f5804l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f5805l;

    public C2672l(ImageView imageView) {
        this.f5804l = imageView;
    }

    @Override // defpackage.InterfaceC7623l
    public final Drawable Signature() {
        return this.f5804l.getDrawable();
    }

    @Override // defpackage.InterfaceC3710l
    public final void admob(InterfaceC1286l interfaceC1286l) {
        loadAd(interfaceC1286l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2672l) && AbstractC8576l.yandex(this.f5804l, ((C2672l) obj).f5804l);
    }

    public final int hashCode() {
        return this.f5804l.hashCode();
    }

    public final void loadAd(InterfaceC1286l interfaceC1286l) {
        ImageView imageView = this.f5804l;
        Drawable drawableLoadAd = interfaceC1286l != null ? AbstractC3230l.loadAd(interfaceC1286l, imageView.getResources()) : null;
        Object drawable = imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawableLoadAd);
        yandex();
    }

    @Override // defpackage.InterfaceC3710l
    public final void metrica(InterfaceC1286l interfaceC1286l) {
        loadAd(interfaceC1286l);
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStart(InterfaceC3177l interfaceC3177l) {
        this.f5805l = true;
        yandex();
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStop(InterfaceC3177l interfaceC3177l) {
        this.f5805l = false;
        yandex();
    }

    @Override // defpackage.InterfaceC3710l
    public final void subs(InterfaceC1286l interfaceC1286l) {
        loadAd(interfaceC1286l);
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.f5804l + ")";
    }

    @Override // defpackage.InterfaceC7623l
    public final View vip() {
        return this.f5804l;
    }

    public final void yandex() {
        Object drawable = this.f5804l.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f5805l) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void mopub() {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onDestroy(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onPause(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onResume(InterfaceC3177l interfaceC3177l) {
    }
}
