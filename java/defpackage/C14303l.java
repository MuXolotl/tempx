package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: lٍٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14303l {
    public boolean Signature;
    public String ad;
    public int adcel;
    public boolean admob;
    public int ads;
    public String advert;
    public CharSequence firebase;
    public final /* synthetic */ C10471l inmobi;
    public int isPro;
    public ActionProviderVisibilityListenerC7627l isVip;
    public int license;
    public int metrica;
    public CharSequence premium;
    public int pro;
    public int remoteconfig;
    public CharSequence signatures;
    public CharSequence smaato;
    public char startapp;
    public int subs;
    public boolean subscription;
    public boolean tapsense;
    public char vip;
    public final Menu yandex;
    public ColorStateList applovin = null;
    public PorterDuff.Mode appmetrica = null;
    public int loadAd = 0;
    public int crashlytics = 0;
    public int amazon = 0;
    public int purchase = 0;
    public boolean billing = true;
    public boolean mopub = true;

    public C14303l(C10471l c10471l, Menu menu) {
        this.inmobi = c10471l;
        this.yandex = menu;
    }

    public final void loadAd(MenuItem menuItem) {
        C10471l c10471l = this.inmobi;
        Context context = c10471l.crashlytics;
        boolean z = false;
        menuItem.setChecked(this.subscription).setVisible(this.tapsense).setEnabled(this.Signature).setCheckable(this.ads >= 1).setTitleCondensed(this.smaato).setIcon(this.remoteconfig);
        int i = this.license;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.advert != null) {
            if (context.isRestricted()) {
                C8339l.smaato("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (c10471l.amazon == null) {
                c10471l.amazon = C10471l.yandex(context);
            }
            Object obj = c10471l.amazon;
            String str = this.advert;
            MenuItemOnMenuItemClickListenerC7218l menuItemOnMenuItemClickListenerC7218l = new MenuItemOnMenuItemClickListenerC7218l();
            menuItemOnMenuItemClickListenerC7218l.loadAd = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC7218l.crashlytics = cls.getMethod(str, MenuItemOnMenuItemClickListenerC7218l.amazon);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC7218l);
            } catch (Exception e) {
                StringBuilder sbIsVip = AbstractC5020l.isVip("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbIsVip.append(cls.getName());
                InflateException inflateException = new InflateException(sbIsVip.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.ads >= 2) {
            if (menuItem instanceof C17858l) {
                C17858l c17858l = (C17858l) menuItem;
                c17858l.f34802l = (c17858l.f34802l & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC12957l) {
                MenuItemC12957l menuItemC12957l = (MenuItemC12957l) menuItem;
                InterfaceMenuItemC5349l interfaceMenuItemC5349l = menuItemC12957l.f25405l;
                try {
                    if (menuItemC12957l.f25404l == null) {
                        menuItemC12957l.f25404l = interfaceMenuItemC5349l.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC12957l.f25404l.invoke(interfaceMenuItemC5349l, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.ad;
        if (str2 != null) {
            menuItem.setActionView((View) yandex(str2, C10471l.purchase, c10471l.yandex));
            z = true;
        }
        int i2 = this.pro;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l = this.isVip;
        if (actionProviderVisibilityListenerC7627l != null) {
            if (menuItem instanceof InterfaceMenuItemC5349l) {
                ((InterfaceMenuItemC5349l) menuItem).mo1763l(actionProviderVisibilityListenerC7627l);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.signatures;
        boolean z2 = menuItem instanceof InterfaceMenuItemC5349l;
        if (z2) {
            ((InterfaceMenuItemC5349l) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC5941l.m1881class(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.premium;
        if (z2) {
            ((InterfaceMenuItemC5349l) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC5941l.m1912transient(menuItem, charSequence2);
        }
        char c = this.vip;
        int i3 = this.metrica;
        if (z2) {
            ((InterfaceMenuItemC5349l) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC5941l.m1910throw(menuItem, c, i3);
        }
        char c2 = this.startapp;
        int i4 = this.adcel;
        if (z2) {
            ((InterfaceMenuItemC5349l) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC5941l.m1893instanceof(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.appmetrica;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC5349l) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC5941l.m1890goto(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.applovin;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC5349l) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC5941l.m1898new(menuItem, colorStateList);
            }
        }
    }

    public final Object yandex(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.inmobi.crashlytics.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
