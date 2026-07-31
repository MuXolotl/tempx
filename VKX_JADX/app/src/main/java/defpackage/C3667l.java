package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: lۣؕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3667l extends C10637l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final int[][] f7727l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ColorStateList f7728l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f7729l;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7728l == null) {
            int iMetrica = AbstractC6689l.metrica(this, ua.itaysonlab.vkx.R.attr.colorControlActivated);
            int iMetrica2 = AbstractC6689l.metrica(this, ua.itaysonlab.vkx.R.attr.colorOnSurface);
            int iMetrica3 = AbstractC6689l.metrica(this, ua.itaysonlab.vkx.R.attr.colorSurface);
            this.f7728l = new ColorStateList(f7727l, new int[]{AbstractC6689l.startapp(iMetrica3, 1.0f, iMetrica), AbstractC6689l.startapp(iMetrica3, 0.54f, iMetrica2), AbstractC6689l.startapp(iMetrica3, 0.38f, iMetrica2), AbstractC6689l.startapp(iMetrica3, 0.38f, iMetrica2)});
        }
        return this.f7728l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7729l && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f7729l = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
