package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: lٍُۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11518l implements InterfaceMenuItemC5349l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public PorterDuff.Mode f23141l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Intent f23142l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f23143l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Drawable f23144l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f23145l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public CharSequence f23146l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public CharSequence f23147l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public CharSequence f23148l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f23149l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f23150l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public char f23151l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public ColorStateList f23152l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Context f23153l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public char f23154l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public CharSequence f23155l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f23156l;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f23143l;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f23154l;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f23148l;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f23144l;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f23152l;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f23141l;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f23142l;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f23150l;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f23151l;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f23147l;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f23146l;
        return charSequence != null ? charSequence : this.f23147l;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f23155l;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f23145l & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f23145l & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f23145l & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f23145l & 8) == 0;
    }

    @Override // defpackage.InterfaceMenuItemC5349l
    /* JADX INFO: renamed from: lؗۨؑ */
    public final InterfaceMenuItemC5349l mo1763l(ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceMenuItemC5349l
    /* JADX INFO: renamed from: l٘ٗ۟ */
    public final ActionProviderVisibilityListenerC7627l mo1764l() {
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f23154l = Character.toLowerCase(c);
        this.f23143l = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f23145l = (z ? 1 : 0) | (this.f23145l & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f23145l = (z ? 2 : 0) | (this.f23145l & (-3));
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final InterfaceMenuItemC5349l setContentDescription(CharSequence charSequence) {
        this.f23148l = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f23145l = (z ? 16 : 0) | (this.f23145l & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f23144l = this.f23153l.getDrawable(i);
        yandex();
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f23152l = colorStateList;
        this.f23156l = true;
        yandex();
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f23141l = mode;
        this.f23149l = true;
        yandex();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f23142l = intent;
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f23151l = c;
        this.f23150l = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f23151l = c;
        this.f23150l = KeyEvent.normalizeMetaState(i);
        this.f23154l = Character.toLowerCase(c2);
        this.f23143l = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f23147l = this.f23153l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f23146l = charSequence;
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final InterfaceMenuItemC5349l setTooltipText(CharSequence charSequence) {
        this.f23155l = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f23145l = (this.f23145l & 8) | (z ? 0 : 8);
        return this;
    }

    public final void yandex() {
        Drawable drawable = this.f23144l;
        if (drawable != null) {
            if (this.f23156l || this.f23149l) {
                this.f23144l = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f23144l = drawableMutate;
                if (this.f23156l) {
                    drawableMutate.setTintList(this.f23152l);
                }
                if (this.f23149l) {
                    this.f23144l.setTintMode(this.f23141l);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f23148l = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f23155l = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f23151l = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f23144l = drawable;
        yandex();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f23154l = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f23147l = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f23151l = c;
        this.f23154l = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
