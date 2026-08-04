package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: lِٛۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11972l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ImageView f23841l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final TextView f23842l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f23843l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f23844l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final MaterialButton f23845l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final MaterialButton f23846l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Space f23847l;

    public C11972l(LinearLayout linearLayout, TextView textView, ImageView imageView, MaterialButton materialButton, MaterialButton materialButton2, Space space, TextView textView2) {
        this.f23844l = linearLayout;
        this.f23843l = textView;
        this.f23841l = imageView;
        this.f23846l = materialButton;
        this.f23845l = materialButton2;
        this.f23847l = space;
        this.f23842l = textView2;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f23844l;
    }
}
