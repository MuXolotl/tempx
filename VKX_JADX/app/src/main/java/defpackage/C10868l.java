package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: lُؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10868l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ImageView f21969l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final FrameLayout f21970l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f21971l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final TextView f21972l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f21973l;

    public C10868l(LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f21971l = linearLayout;
        this.f21970l = frameLayout;
        this.f21969l = imageView;
        this.f21973l = textView;
        this.f21972l = textView2;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f21971l;
    }
}
