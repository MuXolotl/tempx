package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15896l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f31173l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f31174l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f31175l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final TextView f31176l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ImageView f31177l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final TextView f31178l;

    public C15896l(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4) {
        this.f31175l = linearLayout;
        this.f31174l = textView;
        this.f31173l = textView2;
        this.f31177l = imageView;
        this.f31176l = textView3;
        this.f31178l = textView4;
    }

    public static C15896l yandex(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_playlist_horizontal, viewGroup, false);
        int i = R.id.playlist_author;
        TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_author);
        if (textView != null) {
            i = R.id.playlist_chart_pos;
            TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_chart_pos);
            if (textView2 != null) {
                i = R.id.playlist_image;
                ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.playlist_image);
                if (imageView != null) {
                    i = R.id.playlist_snippet;
                    TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_snippet);
                    if (textView3 != null) {
                        i = R.id.playlist_title;
                        TextView textView4 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.playlist_title);
                        if (textView4 != null) {
                            i = R.id.song_overlay;
                            if (((ImageView) AbstractC8576l.smaato(viewInflate, R.id.song_overlay)) != null) {
                                return new C15896l((LinearLayout) viewInflate, textView, textView2, imageView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f31175l;
    }
}
