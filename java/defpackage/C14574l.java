package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: lٓۧۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14574l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f28537l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f28538l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f28539l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final TextView f28540l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ImageView f28541l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final TextView f28542l;

    public C14574l(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4) {
        this.f28539l = linearLayout;
        this.f28538l = textView;
        this.f28537l = textView2;
        this.f28541l = imageView;
        this.f28540l = textView3;
        this.f28542l = textView4;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f28539l;
    }
}
