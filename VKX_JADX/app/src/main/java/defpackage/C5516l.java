package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؘؙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5516l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final RecyclerView f11784l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f11785l;

    public C5516l(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f11785l = linearLayout;
        this.f11784l = recyclerView;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f11785l;
    }
}
