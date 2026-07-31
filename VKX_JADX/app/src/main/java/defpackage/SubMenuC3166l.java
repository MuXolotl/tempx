package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: lؕؕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC3166l extends MenuC4984l implements SubMenu {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C17858l f6800l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final MenuC4984l f6801l;

    public SubMenuC3166l(Context context, MenuC4984l menuC4984l, C17858l c17858l) {
        super(context);
        this.f6801l = menuC4984l;
        this.f6800l = c17858l;
    }

    @Override // defpackage.MenuC4984l
    public final boolean amazon(C17858l c17858l) {
        return this.f6801l.amazon(c17858l);
    }

    @Override // defpackage.MenuC4984l
    public final boolean billing(C17858l c17858l) {
        return this.f6801l.billing(c17858l);
    }

    @Override // defpackage.MenuC4984l
    public final MenuC4984l firebase() {
        return this.f6801l.firebase();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f6800l;
    }

    @Override // defpackage.MenuC4984l
    public final String isPro() {
        C17858l c17858l = this.f6800l;
        int i = c17858l != null ? c17858l.f34804l : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC0653l.vip(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.MenuC4984l
    public final boolean metrica() {
        return this.f6801l.metrica();
    }

    @Override // defpackage.MenuC4984l
    public final boolean purchase(MenuC4984l menuC4984l, MenuItem menuItem) {
        return super.purchase(menuC4984l, menuItem) || this.f6801l.purchase(menuC4984l, menuItem);
    }

    @Override // defpackage.MenuC4984l
    public final boolean remoteconfig() {
        return this.f6801l.remoteconfig();
    }

    @Override // defpackage.MenuC4984l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f6801l.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        Signature(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        Signature(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        Signature(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f6800l.setIcon(drawable);
        return this;
    }

    @Override // defpackage.MenuC4984l, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f6801l.setQwertyMode(z);
    }

    @Override // defpackage.MenuC4984l
    public final boolean vip() {
        return this.f6801l.vip();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f6800l.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        Signature(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        Signature(i, null, 0, null, null);
        return this;
    }
}
