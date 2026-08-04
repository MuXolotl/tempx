package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚٕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15544l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f30382l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ImageView f30383l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f30384l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f30385l;

    public C15544l(ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f30384l = linearLayout;
        this.f30383l = imageView;
        this.f30382l = textView;
        this.f30385l = textView2;
    }

    public static C15544l yandex(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_link_vertical, viewGroup, false);
        int i = R.id.catalog_item_photo;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.catalog_item_photo);
        if (imageView != null) {
            i = R.id.catalog_item_subtitle;
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.catalog_item_subtitle);
            if (textView != null) {
                i = R.id.catalog_item_title;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.catalog_item_title);
                if (textView2 != null) {
                    return new C15544l(imageView, (LinearLayout) viewInflate, textView, textView2);
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f30384l;
    }
}
