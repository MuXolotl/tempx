package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّٖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16354l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f31980l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ImageView f31981l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f31982l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final LinearLayout f31983l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f31984l;

    public C16354l(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout2) {
        this.f31982l = linearLayout;
        this.f31981l = imageView;
        this.f31980l = textView;
        this.f31984l = textView2;
        this.f31983l = linearLayout2;
    }

    public static C16354l yandex(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.v7_post_header, viewGroup, false);
        int i = R.id.post_avatar;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.post_avatar);
        if (imageView != null) {
            i = R.id.post_group;
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.post_group);
            if (textView != null) {
                i = R.id.post_time;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.post_time);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    return new C16354l(linearLayout, imageView, textView, textView2, linearLayout);
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f31982l;
    }
}
