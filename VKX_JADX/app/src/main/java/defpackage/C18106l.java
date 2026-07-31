package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: lٟ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18106l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f35402l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ImageView f35403l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f35404l;

    public C18106l(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f35404l = linearLayout;
        this.f35403l = imageView;
        this.f35402l = textView;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f35404l;
    }
}
