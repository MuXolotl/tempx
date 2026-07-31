package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙؗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5182l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ImageView f11249l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f11250l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f11251l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f11252l;

    public C5182l(ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f11251l = linearLayout;
        this.f11250l = textView;
        this.f11249l = imageView;
        this.f11252l = textView2;
    }

    public static C5182l yandex(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_playlist_no_subtitle, viewGroup, false);
        int i = R.id.playlist_author;
        TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_author);
        if (textView != null) {
            i = R.id.playlist_image;
            ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.playlist_image);
            if (imageView != null) {
                i = R.id.playlist_title;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_title);
                if (textView2 != null) {
                    return new C5182l(imageView, (LinearLayout) viewInflate, textView, textView2);
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f11251l;
    }
}
