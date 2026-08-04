package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: lؑؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0062l extends AbstractC17054l implements Menu {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final MenuC4984l f961l;

    public MenuC0062l(Context context, MenuC4984l menuC4984l) {
        super(context);
        if (menuC4984l != null) {
            this.f961l = menuC4984l;
        } else {
            C8339l.metrica("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m4255l(this.f961l.yandex(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f961l.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m4255l(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f961l.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C5128l c5128l = (C5128l) this.f33214l;
        if (c5128l != null) {
            c5128l.clear();
        }
        this.f961l.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f961l.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m4255l(this.f961l.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m4255l(this.f961l.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f961l.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f961l.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f961l.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f961l.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C5128l) this.f33214l) != null) {
            int i2 = 0;
            while (true) {
                C5128l c5128l = (C5128l) this.f33214l;
                if (i2 >= c5128l.f11161l) {
                    break;
                }
                if (((InterfaceMenuItemC5349l) c5128l.billing(i2)).getGroupId() == i) {
                    ((C5128l) this.f33214l).mopub(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f961l.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C5128l) this.f33214l) != null) {
            int i2 = 0;
            while (true) {
                C5128l c5128l = (C5128l) this.f33214l;
                if (i2 >= c5128l.f11161l) {
                    break;
                }
                if (((InterfaceMenuItemC5349l) c5128l.billing(i2)).getItemId() == i) {
                    ((C5128l) this.f33214l).mopub(i2);
                    break;
                }
                i2++;
            }
        }
        this.f961l.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f961l.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f961l.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f961l.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f961l.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f961l.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f961l.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f961l.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f961l.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m4255l(this.f961l.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m4255l(this.f961l.yandex(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m4255l(this.f961l.add(i, i2, i3, i4));
    }
}
