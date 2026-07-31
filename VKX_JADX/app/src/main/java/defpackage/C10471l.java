package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lَؙٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10471l extends MenuInflater {
    public static final Class[] billing;
    public static final Class[] purchase;
    public Object amazon;
    public final Context crashlytics;
    public final Object[] loadAd;
    public final Object[] yandex;

    static {
        Class[] clsArr = {Context.class};
        purchase = clsArr;
        billing = clsArr;
    }

    public C10471l(Context context) {
        super(context);
        this.crashlytics = context;
        Object[] objArr = {context};
        this.yandex = objArr;
        this.loadAd = objArr;
    }

    public static Object yandex(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? yandex(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC4984l)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.crashlytics.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC4984l) {
                    MenuC4984l menuC4984l = (MenuC4984l) menu;
                    if (!menuC4984l.f10194l) {
                        menuC4984l.pro();
                        z = true;
                    }
                }
                loadAd(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC4984l) menu).license();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC4984l) menu).license();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    public final void loadAd(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        C14303l c14303l = new C14303l(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    C18073l.license("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                C18073l.license("Unexpected end of document");
                return;
            }
            Menu menu2 = c14303l.yandex;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.crashlytics;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14657l.startapp);
                        c14303l.loadAd = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c14303l.crashlytics = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c14303l.amazon = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c14303l.purchase = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c14303l.billing = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c14303l.mopub = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC14657l.adcel);
                        c14303l.subs = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        c14303l.isPro = (typedArrayObtainStyledAttributes2.getInt(5, c14303l.crashlytics) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c14303l.amazon) & 65535);
                        c14303l.firebase = typedArrayObtainStyledAttributes2.getText(7);
                        c14303l.smaato = typedArrayObtainStyledAttributes2.getText(8);
                        c14303l.remoteconfig = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        c14303l.vip = string == null ? (char) 0 : string.charAt(0);
                        c14303l.metrica = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        c14303l.startapp = string2 == null ? (char) 0 : string2.charAt(0);
                        c14303l.adcel = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            c14303l.ads = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c14303l.ads = c14303l.purchase;
                        }
                        c14303l.subscription = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        c14303l.tapsense = typedArrayObtainStyledAttributes2.getBoolean(4, c14303l.billing);
                        c14303l.Signature = typedArrayObtainStyledAttributes2.getBoolean(1, c14303l.mopub);
                        c14303l.license = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        c14303l.advert = typedArrayObtainStyledAttributes2.getString(12);
                        c14303l.pro = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        c14303l.ad = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && c14303l.pro == 0 && c14303l.ad == null) {
                            c14303l.isVip = (ActionProviderVisibilityListenerC7627l) c14303l.yandex(string3, billing, this.loadAd);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c14303l.isVip = null;
                        }
                        c14303l.signatures = typedArrayObtainStyledAttributes2.getText(17);
                        c14303l.premium = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            c14303l.appmetrica = AbstractC2341l.crashlytics(typedArrayObtainStyledAttributes2.getInt(19, -1), c14303l.appmetrica);
                        } else {
                            c14303l.appmetrica = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC7720l.crashlytics(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            c14303l.applovin = colorStateList;
                        } else {
                            c14303l.applovin = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        c14303l.admob = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        c14303l.admob = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(c14303l.loadAd, c14303l.subs, c14303l.isPro, c14303l.firebase);
                        c14303l.loadAd(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        loadAd(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        c14303l.loadAd = 0;
                        c14303l.crashlytics = 0;
                        c14303l.amazon = 0;
                        c14303l.purchase = 0;
                        c14303l.billing = true;
                        c14303l.mopub = true;
                    } else if (name3.equals("item")) {
                        if (!c14303l.admob) {
                            ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l = c14303l.isVip;
                            if (actionProviderVisibilityListenerC7627l == null || !actionProviderVisibilityListenerC7627l.loadAd.hasSubMenu()) {
                                c14303l.admob = true;
                                c14303l.loadAd(menu2.add(c14303l.loadAd, c14303l.subs, c14303l.isPro, c14303l.firebase));
                            } else {
                                c14303l.admob = true;
                                c14303l.loadAd(menu2.addSubMenu(c14303l.loadAd, c14303l.subs, c14303l.isPro, c14303l.firebase).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }
}
