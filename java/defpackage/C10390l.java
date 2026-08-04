package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: lَٚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10390l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final MaterialButton f21206l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextView f21207l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final RelativeLayout f21208l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Space f21209l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final MaterialButton f21210l;

    public C10390l(RelativeLayout relativeLayout, TextView textView, MaterialButton materialButton, MaterialButton materialButton2, Space space) {
        this.f21208l = relativeLayout;
        this.f21207l = textView;
        this.f21206l = materialButton;
        this.f21210l = materialButton2;
        this.f21209l = space;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f21208l;
    }
}
