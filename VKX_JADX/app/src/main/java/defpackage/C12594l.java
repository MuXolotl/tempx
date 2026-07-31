package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: lّٓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12594l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f24801l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final MaterialButton f24802l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final MaterialCardView f24803l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ImageView f24804l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f24805l;

    public C12594l(ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, MaterialCardView materialCardView) {
        this.f24803l = materialCardView;
        this.f24802l = materialButton;
        this.f24801l = textView;
        this.f24805l = textView2;
        this.f24804l = imageView;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f24803l;
    }
}
