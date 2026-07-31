package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: lٌؓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1728l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextView f4124l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f4125l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final RelativeLayout f4126l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final TextView f4127l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextView f4128l;

    public C1728l(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f4126l = relativeLayout;
        this.f4125l = textView;
        this.f4124l = textView2;
        this.f4128l = textView3;
        this.f4127l = textView4;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f4126l;
    }
}
