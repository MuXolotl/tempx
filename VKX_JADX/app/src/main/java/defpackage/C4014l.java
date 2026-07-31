package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: lٍُؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4014l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f8237l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final MaterialButton f8238l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final MaterialCardView f8239l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ImageView f8240l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f8241l;

    public C4014l(ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, MaterialCardView materialCardView) {
        this.f8239l = materialCardView;
        this.f8238l = materialButton;
        this.f8237l = textView;
        this.f8241l = textView2;
        this.f8240l = imageView;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f8239l;
    }
}
