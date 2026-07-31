package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lٌؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class MenuC4984l implements Menu {

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final int[] f10186l = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C17858l f10187l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public CharSequence f10188l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f10189l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final ArrayList f10190l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f10193l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public boolean f10195l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Resources f10196l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f10197l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final ArrayList f10200l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public View f10201l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC17433l f10202l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f10203l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final ArrayList f10205l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final ArrayList f10206l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f10207l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public Drawable f10208l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f10204l = 0;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f10194l = false;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f10199l = false;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f10209l = false;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f10198l = false;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final ArrayList f10192l = new ArrayList();

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f10191l = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f10210l = false;

    public MenuC4984l(Context context) {
        boolean zM3810finally;
        boolean z = false;
        this.f10197l = context;
        Resources resources = context.getResources();
        this.f10196l = resources;
        this.f10206l = new ArrayList();
        this.f10190l = new ArrayList();
        this.f10193l = true;
        this.f10205l = new ArrayList();
        this.f10200l = new ArrayList();
        this.f10207l = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC12697l.yandex;
            if (Build.VERSION.SDK_INT >= 28) {
                zM3810finally = AbstractC13950l.m3810finally(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM3810finally = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM3810finally) {
                z = true;
            }
        }
        this.f10203l = z;
    }

    public final void Signature(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f10201l = view;
            this.f10188l = null;
            this.f10208l = null;
        } else {
            if (i > 0) {
                this.f10188l = this.f10196l.getText(i);
            } else if (charSequence != null) {
                this.f10188l = charSequence;
            }
            if (i2 > 0) {
                this.f10208l = this.f10197l.getDrawable(i2);
            } else if (drawable != null) {
                this.f10208l = drawable;
            }
            this.f10201l = null;
        }
        startapp(false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean adcel(MenuItem menuItem, InterfaceC1963l interfaceC1963l, int i) {
        ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l;
        boolean zExpandActionView;
        ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l2;
        boolean z;
        SubMenuC3166l subMenuC3166l;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        InterfaceC1963l interfaceC1963l2;
        C17858l c17858l = (C17858l) menuItem;
        boolean zCrashlytics = false;
        if (c17858l == null || !c17858l.isEnabled()) {
            return false;
        }
        MenuC4984l menuC4984l = c17858l.f34819l;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c17858l.f34801l;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c17858l)) && !menuC4984l.purchase(menuC4984l, c17858l)) {
            Intent intent = c17858l.f34797l;
            if (intent != null) {
                try {
                    menuC4984l.f10197l.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    actionProviderVisibilityListenerC7627l = c17858l.f34793l;
                    if (actionProviderVisibilityListenerC7627l == null) {
                    }
                    zExpandActionView = false;
                    actionProviderVisibilityListenerC7627l2 = c17858l.f34793l;
                    if (actionProviderVisibilityListenerC7627l2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (c17858l.crashlytics()) {
                        zExpandActionView |= c17858l.expandActionView();
                        if (zExpandActionView) {
                            crashlytics(true);
                        }
                    } else if (c17858l.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            crashlytics(false);
                        }
                        if (!c17858l.hasSubMenu()) {
                            SubMenuC3166l subMenuC3166l2 = new SubMenuC3166l(this.f10197l, this, c17858l);
                            c17858l.f34810l = subMenuC3166l2;
                            subMenuC3166l2.setHeaderTitle(c17858l.f34811l);
                        }
                        subMenuC3166l = c17858l.f34810l;
                        if (z) {
                            actionProviderVisibilityListenerC7627l2.loadAd.onPrepareSubMenu(subMenuC3166l);
                        }
                        copyOnWriteArrayList = this.f10191l;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (interfaceC1963l != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                interfaceC1963l2 = (InterfaceC1963l) weakReference.get();
                                if (interfaceC1963l2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zCrashlytics) {
                                    zCrashlytics = interfaceC1963l2.crashlytics(subMenuC3166l);
                                }
                            }
                        }
                        zExpandActionView |= zCrashlytics;
                        if (!zExpandActionView) {
                            crashlytics(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            crashlytics(false);
                        }
                        if (!c17858l.hasSubMenu()) {
                            SubMenuC3166l subMenuC3166l3 = new SubMenuC3166l(this.f10197l, this, c17858l);
                            c17858l.f34810l = subMenuC3166l3;
                            subMenuC3166l3.setHeaderTitle(c17858l.f34811l);
                        }
                        subMenuC3166l = c17858l.f34810l;
                        if (z) {
                            actionProviderVisibilityListenerC7627l2.loadAd.onPrepareSubMenu(subMenuC3166l);
                        }
                        copyOnWriteArrayList = this.f10191l;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zCrashlytics = interfaceC1963l != null ? interfaceC1963l.crashlytics(subMenuC3166l) : false;
                            while (r8.hasNext()) {
                                interfaceC1963l2 = (InterfaceC1963l) weakReference.get();
                                if (interfaceC1963l2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zCrashlytics) {
                                    zCrashlytics = interfaceC1963l2.crashlytics(subMenuC3166l);
                                }
                            }
                        }
                        zExpandActionView |= zCrashlytics;
                        if (!zExpandActionView) {
                            crashlytics(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                actionProviderVisibilityListenerC7627l = c17858l.f34793l;
                if (actionProviderVisibilityListenerC7627l == null && actionProviderVisibilityListenerC7627l.loadAd.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProviderVisibilityListenerC7627l2 = c17858l.f34793l;
        if (actionProviderVisibilityListenerC7627l2 == null && actionProviderVisibilityListenerC7627l2.loadAd.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (c17858l.crashlytics()) {
            zExpandActionView |= c17858l.expandActionView();
            if (zExpandActionView) {
                crashlytics(true);
            }
        } else if (c17858l.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                crashlytics(false);
            }
            if (!c17858l.hasSubMenu()) {
                SubMenuC3166l subMenuC3166l4 = new SubMenuC3166l(this.f10197l, this, c17858l);
                c17858l.f34810l = subMenuC3166l4;
                subMenuC3166l4.setHeaderTitle(c17858l.f34811l);
            }
            subMenuC3166l = c17858l.f34810l;
            if (z) {
                actionProviderVisibilityListenerC7627l2.loadAd.onPrepareSubMenu(subMenuC3166l);
            }
            copyOnWriteArrayList = this.f10191l;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (interfaceC1963l != null) {
                }
                while (r8.hasNext()) {
                    interfaceC1963l2 = (InterfaceC1963l) weakReference.get();
                    if (interfaceC1963l2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zCrashlytics) {
                        zCrashlytics = interfaceC1963l2.crashlytics(subMenuC3166l);
                    }
                }
            }
            zExpandActionView |= zCrashlytics;
            if (!zExpandActionView) {
                crashlytics(true);
            }
        } else if ((i & 1) == 0) {
            crashlytics(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return yandex(0, 0, 0, this.f10196l.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f10197l.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C17858l c17858lYandex = yandex(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c17858lYandex.setIcon(resolveInfo.loadIcon(packageManager));
            c17858lYandex.f34797l = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c17858lYandex;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C17858l c17858lYandex = yandex(i, i2, i3, charSequence);
        SubMenuC3166l subMenuC3166l = new SubMenuC3166l(this.f10197l, this, c17858lYandex);
        c17858lYandex.f34810l = subMenuC3166l;
        subMenuC3166l.setHeaderTitle(c17858lYandex.f34811l);
        return subMenuC3166l;
    }

    public final void admob(List list, int i, KeyEvent keyEvent) {
        boolean zVip = vip();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f10206l;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C17858l c17858l = (C17858l) arrayList.get(i2);
                if (c17858l.hasSubMenu()) {
                    c17858l.f34810l.admob(list, i, keyEvent);
                }
                char c = zVip ? c17858l.f34809l : c17858l.f34800l;
                if ((modifiers & 69647) == ((zVip ? c17858l.f34818l : c17858l.f34816l) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zVip && c == '\b' && i == 67)) && c17858l.isEnabled()) {
                        list.add(c17858l);
                    }
                }
            }
        }
    }

    public final void ads(InterfaceC1963l interfaceC1963l) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f10191l;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1963l interfaceC1963l2 = (InterfaceC1963l) weakReference.get();
            if (interfaceC1963l2 == null || interfaceC1963l2 == interfaceC1963l) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public boolean amazon(C17858l c17858l) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f10191l;
        boolean zPurchase = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f10187l == c17858l) {
            pro();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC1963l interfaceC1963l = (InterfaceC1963l) weakReference.get();
                if (interfaceC1963l != null) {
                    zPurchase = interfaceC1963l.purchase(c17858l);
                    if (zPurchase) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            license();
            if (zPurchase) {
                this.f10187l = null;
            }
        }
        return zPurchase;
    }

    public boolean billing(C17858l c17858l) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f10191l;
        boolean zAdmob = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        pro();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1963l interfaceC1963l = (InterfaceC1963l) weakReference.get();
            if (interfaceC1963l != null) {
                zAdmob = interfaceC1963l.admob(c17858l);
                if (zAdmob) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        license();
        if (zAdmob) {
            this.f10187l = c17858l;
        }
        return zAdmob;
    }

    @Override // android.view.Menu
    public final void clear() {
        C17858l c17858l = this.f10187l;
        if (c17858l != null) {
            amazon(c17858l);
        }
        this.f10206l.clear();
        startapp(true);
    }

    public final void clearHeader() {
        this.f10208l = null;
        this.f10188l = null;
        this.f10201l = null;
        startapp(false);
    }

    @Override // android.view.Menu
    public final void close() {
        crashlytics(true);
    }

    public final void crashlytics(boolean z) {
        if (this.f10198l) {
            return;
        }
        this.f10198l = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f10191l;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1963l interfaceC1963l = (InterfaceC1963l) weakReference.get();
            if (interfaceC1963l == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1963l.yandex(this, z);
            }
        }
        this.f10198l = false;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f10206l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C17858l c17858l = (C17858l) arrayList.get(i2);
            if (c17858l.f34804l == i) {
                return c17858l;
            }
            if (c17858l.hasSubMenu() && (menuItemFindItem = c17858l.f34810l.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f10206l.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f10195l) {
            return true;
        }
        ArrayList arrayList = this.f10206l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C17858l) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public String isPro() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mopub(i, keyEvent) != null;
    }

    public final void license() {
        this.f10194l = false;
        if (this.f10199l) {
            this.f10199l = false;
            startapp(this.f10209l);
        }
    }

    public final void loadAd(InterfaceC1963l interfaceC1963l, Context context) {
        this.f10191l.add(new WeakReference(interfaceC1963l));
        interfaceC1963l.firebase(context, this);
        this.f10207l = true;
    }

    public boolean metrica() {
        return this.f10203l;
    }

    public final C17858l mopub(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f10192l;
        arrayList.clear();
        admob(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C17858l) arrayList.get(0);
        }
        boolean zVip = vip();
        for (int i2 = 0; i2 < size; i2++) {
            C17858l c17858l = (C17858l) arrayList.get(i2);
            char c = zVip ? c17858l.f34809l : c17858l.f34800l;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zVip && c == '\b' && i == 67))) {
                return c17858l;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return adcel(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C17858l c17858lMopub = mopub(i, keyEvent);
        boolean zAdcel = c17858lMopub != null ? adcel(c17858lMopub, null, i2) : false;
        if ((i2 & 2) != 0) {
            crashlytics(true);
        }
        return zAdcel;
    }

    public final void pro() {
        if (this.f10194l) {
            return;
        }
        this.f10194l = true;
        this.f10199l = false;
        this.f10209l = false;
    }

    public boolean purchase(MenuC4984l menuC4984l, MenuItem menuItem) {
        InterfaceC17433l interfaceC17433l = this.f10202l;
        return interfaceC17433l != null && interfaceC17433l.yandex(menuC4984l, menuItem);
    }

    public boolean remoteconfig() {
        return this.f10210l;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f10206l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C17858l) arrayList.get(i3)).f34803l == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C17858l) arrayList.get(i3)).f34803l != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            startapp(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f10206l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C17858l) arrayList.get(i2)).f34804l == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        startapp(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f10206l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C17858l c17858l = (C17858l) arrayList.get(i2);
            if (c17858l.f34803l == i) {
                c17858l.f34802l = (c17858l.f34802l & (-5)) | (z2 ? 4 : 0);
                c17858l.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f10210l = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f10206l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C17858l c17858l = (C17858l) arrayList.get(i2);
            if (c17858l.f34803l == i) {
                c17858l.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f10206l;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C17858l c17858l = (C17858l) arrayList.get(i2);
            if (c17858l.f34803l == i) {
                int i3 = c17858l.f34802l;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c17858l.f34802l = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            startapp(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f10189l = z;
        startapp(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f10206l.size();
    }

    public final ArrayList smaato() {
        boolean z = this.f10193l;
        ArrayList arrayList = this.f10190l;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f10206l;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C17858l c17858l = (C17858l) arrayList2.get(i);
            if (c17858l.isVisible()) {
                arrayList.add(c17858l);
            }
        }
        this.f10193l = false;
        this.f10207l = true;
        return arrayList;
    }

    public final void startapp(boolean z) {
        if (this.f10194l) {
            this.f10199l = true;
            if (z) {
                this.f10209l = true;
                return;
            }
            return;
        }
        if (z) {
            this.f10193l = true;
            this.f10207l = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f10191l;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        pro();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1963l interfaceC1963l = (InterfaceC1963l) weakReference.get();
            if (interfaceC1963l == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1963l.subs();
            }
        }
        license();
    }

    public final void subs() {
        ArrayList arrayListSmaato = smaato();
        if (this.f10207l) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f10191l;
            boolean zAmazon = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC1963l interfaceC1963l = (InterfaceC1963l) weakReference.get();
                if (interfaceC1963l == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zAmazon |= interfaceC1963l.amazon();
                }
            }
            ArrayList arrayList = this.f10205l;
            ArrayList arrayList2 = this.f10200l;
            if (zAmazon) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListSmaato.size();
                for (int i = 0; i < size; i++) {
                    C17858l c17858l = (C17858l) arrayListSmaato.get(i);
                    if ((c17858l.f34802l & 32) == 32) {
                        arrayList.add(c17858l);
                    } else {
                        arrayList2.add(c17858l);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(smaato());
            }
            this.f10207l = false;
        }
    }

    public final void subscription(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(isPro());
        int size = this.f10206l.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC3166l) item.getSubMenu()).subscription(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void tapsense(Bundle bundle) {
        int size = this.f10206l.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC3166l) item.getSubMenu()).tapsense(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(isPro(), sparseArray);
        }
    }

    public boolean vip() {
        return this.f10189l;
    }

    public final C17858l yandex(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            C8339l.metrica("order does not contain a valid category.");
            return null;
        }
        int i6 = (f10186l[i5] << 16) | (65535 & i3);
        C17858l c17858l = new C17858l(this, i, i2, i3, i6, charSequence, this.f10204l);
        ArrayList arrayList = this.f10206l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C17858l) arrayList.get(size)).f34812l <= i6) {
                i4 = size + 1;
                arrayList.add(i4, c17858l);
                startapp(true);
                return c17858l;
            }
        }
        i4 = 0;
        arrayList.add(i4, c17858l);
        startapp(true);
        return c17858l;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return yandex(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return yandex(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return yandex(i, i2, i3, this.f10196l.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f10196l.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f10196l.getString(i4));
    }

    public MenuC4984l firebase() {
        return this;
    }
}
