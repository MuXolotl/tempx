package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: lِۗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12046l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ImageView f23971l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f23972l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f23973l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final TextView f23974l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f23975l;

    public C12046l(ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f23973l = linearLayout;
        this.f23972l = textView;
        this.f23971l = imageView;
        this.f23975l = textView2;
        this.f23974l = textView3;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f23973l;
    }
}
