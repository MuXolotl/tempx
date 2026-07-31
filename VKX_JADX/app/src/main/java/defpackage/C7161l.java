package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: lٍؚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7161l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ImageView f14980l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final ImageView f14981l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final TextView f14982l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f14983l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f14984l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final FrameLayout f14985l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ImageView f14986l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final TextView f14987l;

    public C7161l(LinearLayout linearLayout, TextView textView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, TextView textView2, ImageView imageView3, TextView textView3) {
        this.f14984l = linearLayout;
        this.f14983l = textView;
        this.f14980l = imageView;
        this.f14986l = imageView2;
        this.f14985l = frameLayout;
        this.f14987l = textView2;
        this.f14981l = imageView3;
        this.f14982l = textView3;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f14984l;
    }
}
