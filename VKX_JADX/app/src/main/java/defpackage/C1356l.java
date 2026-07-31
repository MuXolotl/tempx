package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: lؒۜۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1356l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final MaterialButton f3479l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final MaterialButton f3480l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinearLayout f3481l;

    public C1356l(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f3481l = linearLayout;
        this.f3480l = materialButton;
        this.f3479l = materialButton2;
    }

    @Override // defpackage.InterfaceC0589l
    public final View getRoot() {
        return this.f3481l;
    }
}
