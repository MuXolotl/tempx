package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: lٛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18424l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f35977l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f35978l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final MaterialCardView f35979l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ImageView f35980l;

    public C18424l(ImageView imageView, TextView textView, TextView textView2, MaterialCardView materialCardView) {
        this.f35979l = materialCardView;
        this.f35978l = textView;
        this.f35977l = textView2;
        this.f35980l = imageView;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f35979l;
    }
}
