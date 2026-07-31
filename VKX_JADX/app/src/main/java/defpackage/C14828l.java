package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: lِؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14828l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f29021l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ImageView f29022l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final MaterialCardView f29023l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final TextView f29024l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ImageView f29025l;

    public C14828l(MaterialCardView materialCardView, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
        this.f29023l = materialCardView;
        this.f29022l = imageView;
        this.f29021l = textView;
        this.f29025l = imageView2;
        this.f29024l = textView2;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f29023l;
    }
}
