package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: lٍؗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4786l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ImageView f9815l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final TextView f9816l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final ImageView f9817l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final RecyclerView f9818l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final MaterialCardView f9819l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final TextView f9820l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final RelativeLayout f9821l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f9822l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final ImageView f9823l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final TextView f9824l;

    public C4786l(MaterialCardView materialCardView, RecyclerView recyclerView, ImageView imageView, TextView textView, RelativeLayout relativeLayout, TextView textView2, TextView textView3, ImageView imageView2, ImageView imageView3, TextView textView4) {
        this.f9819l = materialCardView;
        this.f9818l = recyclerView;
        this.f9815l = imageView;
        this.f9822l = textView;
        this.f9821l = relativeLayout;
        this.f9824l = textView2;
        this.f9816l = textView3;
        this.f9817l = imageView2;
        this.f9823l = imageView3;
        this.f9820l = textView4;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f9819l;
    }
}
