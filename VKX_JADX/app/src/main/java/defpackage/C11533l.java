package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِؐؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11533l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f23188l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final FrameLayout f23189l;

    public C11533l(FrameLayout frameLayout, TextView textView) {
        this.f23189l = frameLayout;
        this.f23188l = textView;
    }

    public static C11533l yandex(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.v7_cache_migrator_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.progress;
        if (((ProgressBar) AbstractC8576l.smaato(viewInflate, R.id.progress)) != null) {
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            int i2 = R.id.toolbar_data;
            if (((TextView) AbstractC8576l.smaato(viewInflate, R.id.toolbar_data)) != null) {
                i2 = R.id.toolbar_header;
                if (((TextView) AbstractC8576l.smaato(viewInflate, R.id.toolbar_header)) != null) {
                    i2 = R.id.toolbar_subheader;
                    TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.toolbar_subheader);
                    if (textView != null) {
                        return new C11533l(frameLayout, textView);
                    }
                }
            }
            i = i2;
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f23189l;
    }
}
