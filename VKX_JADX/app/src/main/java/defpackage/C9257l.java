package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: lٍؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9257l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ImageView f19026l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final MaterialButton f19027l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final MaterialCardView f19028l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final TextView f19029l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f19030l;

    public C9257l(ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, MaterialCardView materialCardView) {
        this.f19028l = materialCardView;
        this.f19027l = materialButton;
        this.f19026l = imageView;
        this.f19030l = textView;
        this.f19029l = textView2;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f19028l;
    }
}
