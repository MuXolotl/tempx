package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: lْۛؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13651l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f26674l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ImageView f26675l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final FrameLayout f26676l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f26677l;

    public C13651l(FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f26676l = frameLayout;
        this.f26675l = imageView;
        this.f26674l = textView;
        this.f26677l = textView2;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f26676l;
    }
}
