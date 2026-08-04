package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: lِ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17858l implements InterfaceMenuItemC5349l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC7627l f34793l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f34796l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Intent f34797l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public char f34800l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f34801l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f34803l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f34804l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public CharSequence f34806l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f34807l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public int f34808l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public char f34809l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public SubMenuC3166l f34810l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public CharSequence f34811l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f34812l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public View f34814l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Drawable f34815l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public CharSequence f34817l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final MenuC4984l f34819l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public CharSequence f34820l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f34816l = 4096;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f34818l = 4096;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f34795l = 0;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public ColorStateList f34805l = null;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public PorterDuff.Mode f34799l = null;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f34798l = false;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f34794l = false;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f34821l = false;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public int f34802l = 16;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public boolean f34813l = false;

    public C17858l(MenuC4984l menuC4984l, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f34819l = menuC4984l;
        this.f34804l = i2;
        this.f34803l = i;
        this.f34796l = i3;
        this.f34812l = i4;
        this.f34811l = charSequence;
        this.f34808l = i5;
    }

    public static void yandex(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final void amazon(boolean z) {
        int i = this.f34802l;
        if (z) {
            this.f34802l = i | 32;
        } else {
            this.f34802l = i & (-33);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f34808l & 8) == 0) {
            return false;
        }
        if (this.f34814l == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f34807l;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f34819l.amazon(this);
        }
        return false;
    }

    public final boolean crashlytics() {
        ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l;
        if ((this.f34808l & 8) != 0) {
            if (this.f34814l == null && (actionProviderVisibilityListenerC7627l = this.f34793l) != null) {
                this.f34814l = actionProviderVisibilityListenerC7627l.loadAd.onCreateActionView(this);
            }
            if (this.f34814l != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!crashlytics()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f34807l;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f34819l.billing(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f34814l;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l = this.f34793l;
        if (actionProviderVisibilityListenerC7627l == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC7627l.loadAd.onCreateActionView(this);
        this.f34814l = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f34818l;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f34809l;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f34806l;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f34803l;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f34815l;
        if (drawable != null) {
            return loadAd(drawable);
        }
        int i = this.f34795l;
        if (i == 0) {
            return null;
        }
        Drawable drawableLoadAd = AbstractC13273l.loadAd(this.f34819l.f10197l, i);
        this.f34795l = 0;
        this.f34815l = drawableLoadAd;
        return loadAd(drawableLoadAd);
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f34805l;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f34799l;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f34797l;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f34804l;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f34816l;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f34800l;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f34796l;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f34810l;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f34811l;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f34817l;
        return charSequence != null ? charSequence : this.f34811l;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f34820l;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f34810l != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f34813l;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f34802l & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f34802l & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f34802l & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l = this.f34793l;
        if (actionProviderVisibilityListenerC7627l == null || !actionProviderVisibilityListenerC7627l.loadAd.overridesItemVisibility()) {
            return (this.f34802l & 8) == 0;
        }
        return (this.f34802l & 8) == 0 && this.f34793l.loadAd.isVisible();
    }

    public final Drawable loadAd(Drawable drawable) {
        if (drawable != null && this.f34821l && (this.f34798l || this.f34794l)) {
            drawable = drawable.mutate();
            if (this.f34798l) {
                drawable.setTintList(this.f34805l);
            }
            if (this.f34794l) {
                drawable.setTintMode(this.f34799l);
            }
            this.f34821l = false;
        }
        return drawable;
    }

    @Override // defpackage.InterfaceMenuItemC5349l
    /* JADX INFO: renamed from: lؗۨؑ */
    public final InterfaceMenuItemC5349l mo1763l(ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l) {
        this.f34814l = null;
        this.f34793l = actionProviderVisibilityListenerC7627l;
        this.f34819l.startapp(true);
        ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l2 = this.f34793l;
        if (actionProviderVisibilityListenerC7627l2 != null) {
            actionProviderVisibilityListenerC7627l2.yandex = new C13161l(this);
            actionProviderVisibilityListenerC7627l2.loadAd.setVisibilityListener(actionProviderVisibilityListenerC7627l2);
        }
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l
    /* JADX INFO: renamed from: l٘ٗ۟ */
    public final ActionProviderVisibilityListenerC7627l mo1764l() {
        return this.f34793l;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC4984l menuC4984l = this.f34819l;
        Context context = menuC4984l.f10197l;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f34814l = viewInflate;
        this.f34793l = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f34804l) > 0) {
            viewInflate.setId(i2);
        }
        menuC4984l.f10207l = true;
        menuC4984l.startapp(true);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f34809l == c && this.f34818l == i) {
            return this;
        }
        this.f34809l = Character.toLowerCase(c);
        this.f34818l = KeyEvent.normalizeMetaState(i);
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f34802l;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f34802l = i2;
        if (i != i2) {
            this.f34819l.startapp(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f34802l;
        int i2 = i & 4;
        MenuC4984l menuC4984l = this.f34819l;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f34802l = i3;
            if (i != i3) {
                menuC4984l.startapp(false);
            }
            return this;
        }
        ArrayList arrayList = menuC4984l.f10206l;
        int size = arrayList.size();
        menuC4984l.pro();
        for (int i4 = 0; i4 < size; i4++) {
            C17858l c17858l = (C17858l) arrayList.get(i4);
            if (c17858l.f34803l == this.f34803l && (c17858l.f34802l & 4) != 0 && c17858l.isCheckable()) {
                boolean z2 = c17858l == this;
                int i5 = c17858l.f34802l;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c17858l.f34802l = i6;
                if (i5 != i6) {
                    c17858l.f34819l.startapp(false);
                }
            }
        }
        menuC4984l.license();
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final InterfaceMenuItemC5349l setContentDescription(CharSequence charSequence) {
        this.f34806l = charSequence;
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.f34802l;
        if (z) {
            this.f34802l = i | 16;
        } else {
            this.f34802l = i & (-17);
        }
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f34815l = null;
        this.f34795l = i;
        this.f34821l = true;
        this.f34819l.startapp(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f34805l = colorStateList;
        this.f34798l = true;
        this.f34821l = true;
        this.f34819l.startapp(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f34799l = mode;
        this.f34794l = true;
        this.f34821l = true;
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f34797l = intent;
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f34800l == c && this.f34816l == i) {
            return this;
        }
        this.f34800l = c;
        this.f34816l = KeyEvent.normalizeMetaState(i);
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f34807l = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f34801l = onMenuItemClickListener;
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f34800l = c;
        this.f34816l = KeyEvent.normalizeMetaState(i);
        this.f34809l = Character.toLowerCase(c2);
        this.f34818l = KeyEvent.normalizeMetaState(i2);
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            C8339l.metrica("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f34808l = i;
        MenuC4984l menuC4984l = this.f34819l;
        menuC4984l.f10207l = true;
        menuC4984l.startapp(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f34811l = charSequence;
        this.f34819l.startapp(false);
        SubMenuC3166l subMenuC3166l = this.f34810l;
        if (subMenuC3166l != null) {
            subMenuC3166l.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f34817l = charSequence;
        this.f34819l.startapp(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC5349l, android.view.MenuItem
    public final InterfaceMenuItemC5349l setTooltipText(CharSequence charSequence) {
        this.f34820l = charSequence;
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f34802l;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f34802l = i2;
        if (i != i2) {
            MenuC4984l menuC4984l = this.f34819l;
            menuC4984l.f10193l = true;
            menuC4984l.startapp(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f34811l;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f34795l = 0;
        this.f34815l = drawable;
        this.f34821l = true;
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f34819l.f10197l.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f34800l == c) {
            return this;
        }
        this.f34800l = c;
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f34800l = c;
        this.f34809l = Character.toLowerCase(c2);
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f34809l == c) {
            return this;
        }
        this.f34809l = Character.toLowerCase(c);
        this.f34819l.startapp(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f34814l = view;
        this.f34793l = null;
        if (view != null && view.getId() == -1 && (i = this.f34804l) > 0) {
            view.setId(i);
        }
        MenuC4984l menuC4984l = this.f34819l;
        menuC4984l.f10207l = true;
        menuC4984l.startapp(true);
        return this;
    }
}
