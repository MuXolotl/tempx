package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: lؔؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2358l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f5121l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final FrameLayout f5122l;

    public C2358l(FrameLayout frameLayout, TextView textView) {
        this.f5122l = frameLayout;
        this.f5121l = textView;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f5122l;
    }
}
