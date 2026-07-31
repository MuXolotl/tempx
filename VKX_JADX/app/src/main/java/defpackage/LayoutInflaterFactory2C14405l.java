package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lٓۚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C14405l extends AbstractC10242l implements InterfaceC17433l, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public boolean f28166l;

    /* JADX INFO: renamed from: lؑٔۦ, reason: contains not printable characters */
    public C2282l f28167l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public TextView f28168l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public boolean f28169l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public PopupWindow f28170l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public WindowCallbackC8931l f28171l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public boolean f28172l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public int f28173l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public ActionBarContextView f28174l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public AbstractC12048l f28175l;

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public boolean f28176l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public C8551l f28177l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public boolean f28178l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public C9491l f28179l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public CharSequence f28180l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public boolean f28181l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public boolean f28182l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public Configuration f28184l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public boolean f28185l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C5008l f28186l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public ActionBarOverlayLayout f28187l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public boolean f28188l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public int f28189l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public View f28190l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public int f28191l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public boolean f28192l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Object f28193l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public boolean f28194l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C10471l f28195l;

    /* JADX INFO: renamed from: lٍۥ۟, reason: contains not printable characters */
    public OnBackInvokedDispatcher f28196l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public final int f28197l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public Rect f28199l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public boolean f28200l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public ViewGroup f28201l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public C9491l[] f28202l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Window f28203l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public boolean f28204l;

    /* JADX INFO: renamed from: lٕٖٙ, reason: contains not printable characters */
    public OnBackInvokedCallback f28205l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Context f28206l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public boolean f28207l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public boolean f28208l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C5184l f28209l;

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public Rect f28210l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public boolean f28211l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public C8551l f28212l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C5501l f28213l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public RunnableC11679l f28214l;

    /* JADX INFO: renamed from: lٌْؔ, reason: contains not printable characters */
    public static final C5128l f28165l = new C5128l(0);

    /* JADX INFO: renamed from: lۣؕ٘, reason: contains not printable characters */
    public static final int[] f28164l = {R.attr.windowBackground};

    /* JADX INFO: renamed from: lّؔ۟, reason: contains not printable characters */
    public static final boolean f28163l = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C2932l f28183l = null;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public final RunnableC11679l f28198l = new RunnableC11679l(this, 0);

    public LayoutInflaterFactory2C14405l(Context context, Window window, InterfaceC17378l interfaceC17378l, Object obj) {
        AbstractActivityC16046l abstractActivityC16046l = null;
        this.f28197l = -100;
        this.f28206l = context;
        this.f28193l = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC16046l)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC16046l = (AbstractActivityC16046l) context;
                    break;
                }
            }
            if (abstractActivityC16046l != null) {
                this.f28197l = ((LayoutInflaterFactory2C14405l) abstractActivityC16046l.remoteconfig()).f28197l;
            }
        }
        if (this.f28197l == -100) {
            String name = this.f28193l.getClass().getName();
            C5128l c5128l = f28165l;
            Integer num = (Integer) c5128l.get(name);
            if (num != null) {
                this.f28197l = num.intValue();
                c5128l.remove(this.f28193l.getClass().getName());
            }
        }
        if (window != null) {
            adcel(window);
        }
        C7862l.amazon();
    }

    public static C2462l ads(Context context) {
        C2462l c2462l;
        C2462l c2462lLoadAd;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c2462l = AbstractC10242l.f20857l) == null) {
            return null;
        }
        InterfaceC17227l interfaceC17227l = c2462l.yandex;
        C2462l c2462lPremium = premium(context.getApplicationContext().getResources().getConfiguration());
        int i2 = 0;
        if (i < 24) {
            c2462lLoadAd = interfaceC17227l.isEmpty() ? C2462l.loadAd : C2462l.loadAd(AbstractC16743l.loadAd(interfaceC17227l.get(0)));
        } else if (interfaceC17227l.isEmpty()) {
            c2462lLoadAd = C2462l.loadAd;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < c2462lPremium.yandex.size() + interfaceC17227l.size()) {
                Locale locale = i2 < interfaceC17227l.size() ? interfaceC17227l.get(i2) : c2462lPremium.yandex.get(i2 - interfaceC17227l.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c2462lLoadAd = C2462l.yandex((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return c2462lLoadAd.yandex.isEmpty() ? c2462lPremium : c2462lLoadAd;
    }

    public static Configuration license(Context context, int i, C2462l c2462l, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c2462l != null) {
            InterfaceC17227l interfaceC17227l = c2462l.yandex;
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC9374l.amazon(configuration2, c2462l);
                return configuration2;
            }
            configuration2.setLocale(interfaceC17227l.get(0));
            configuration2.setLayoutDirection(interfaceC17227l.get(0));
        }
        return configuration2;
    }

    public static C2462l premium(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC9374l.loadAd(configuration) : C2462l.loadAd(AbstractC16743l.loadAd(configuration.locale));
    }

    public final void Signature(C9491l c9491l, boolean z) {
        C3018l c3018l;
        ActionBarOverlayLayout actionBarOverlayLayout;
        C0791l c0791l;
        if (z && c9491l.yandex == 0 && (actionBarOverlayLayout = this.f28187l) != null) {
            actionBarOverlayLayout.firebase();
            ActionMenuView actionMenuView = ((C18434l) actionBarOverlayLayout.f145l).yandex.f247l;
            if (actionMenuView != null && (c0791l = actionMenuView.f157l) != null && c0791l.isPro()) {
                tapsense(c9491l.admob);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f28206l.getSystemService("window");
        if (windowManager != null && c9491l.remoteconfig && (c3018l = c9491l.purchase) != null) {
            windowManager.removeView(c3018l);
            if (z) {
                subscription(c9491l.yandex, c9491l, null);
            }
        }
        c9491l.firebase = false;
        c9491l.smaato = false;
        c9491l.remoteconfig = false;
        c9491l.billing = null;
        c9491l.vip = true;
        if (this.f28179l == c9491l) {
            this.f28179l = null;
        }
        if (c9491l.yandex == 0) {
            m3850private();
        }
    }

    public final void ad(int i) {
        C9491l c9491lApplovin = applovin(i);
        if (c9491lApplovin.admob != null) {
            Bundle bundle = new Bundle();
            c9491lApplovin.admob.tapsense(bundle);
            if (bundle.size() > 0) {
                c9491lApplovin.startapp = bundle;
            }
            c9491lApplovin.admob.pro();
            c9491lApplovin.admob.clear();
        }
        c9491lApplovin.metrica = true;
        c9491lApplovin.vip = true;
        if ((i == 108 || i == 0) && this.f28187l != null) {
            C9491l c9491lApplovin2 = applovin(0);
            c9491lApplovin2.firebase = false;
            m3854volatile(c9491lApplovin2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void adcel(Window window) {
        Drawable drawableMopub;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f28203l != null) {
            C8339l.smaato("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC8931l) {
            C8339l.smaato("AppCompat has already installed itself into the Window");
            return;
        }
        WindowCallbackC8931l windowCallbackC8931l = new WindowCallbackC8931l(this, callback);
        this.f28171l = windowCallbackC8931l;
        window.setCallback(windowCallbackC8931l);
        Context context = this.f28206l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f28164l);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableMopub = null;
        } else {
            C7862l c7862lYandex = C7862l.yandex();
            synchronized (c7862lYandex) {
                drawableMopub = c7862lYandex.yandex.mopub(context, resourceId, true);
            }
        }
        if (drawableMopub != null) {
            window.setBackgroundDrawable(drawableMopub);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f28203l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f28196l) != null) {
            return;
        }
        Object obj = this.f28193l;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f28205l) != null) {
            AbstractC5639l.crashlytics(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f28205l = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f28196l = AbstractC5639l.yandex(activity);
            } else {
                this.f28196l = null;
            }
        } else {
            this.f28196l = null;
        }
        m3850private();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.AbstractC10242l
    public final void admob() {
        if (this.f28193l instanceof Activity) {
            synchronized (AbstractC10242l.f20859l) {
                AbstractC10242l.subs(this);
            }
        }
        if (this.f28176l) {
            this.f28203l.getDecorView().removeCallbacks(this.f28198l);
        }
        this.f28172l = true;
        if (this.f28197l != -100) {
            Object obj = this.f28193l;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f28165l.put(this.f28193l.getClass().getName(), Integer.valueOf(this.f28197l));
            } else {
                f28165l.remove(this.f28193l.getClass().getName());
            }
        } else {
            f28165l.remove(this.f28193l.getClass().getName());
        }
        C8551l c8551l = this.f28212l;
        if (c8551l != null) {
            c8551l.m4258l();
        }
        C8551l c8551l2 = this.f28177l;
        if (c8551l2 != null) {
            c8551l2.m4258l();
        }
    }

    public final void advert() {
        ViewGroup viewGroup;
        if (this.f28192l) {
            return;
        }
        Context context = this.f28206l;
        int[] iArr = AbstractC14657l.isPro;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            C8339l.smaato("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            isPro(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            isPro(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            isPro(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            isPro(10);
        }
        this.f28207l = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        isVip();
        this.f28203l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f28182l) {
            viewGroup = this.f28166l ? (ViewGroup) layoutInflaterFrom.inflate(ua.itaysonlab.vkx.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(ua.itaysonlab.vkx.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f28207l) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ua.itaysonlab.vkx.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f28204l = false;
            this.f28188l = false;
        } else if (this.f28188l) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C8288l(context, typedValue.resourceId) : context).inflate(ua.itaysonlab.vkx.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(ua.itaysonlab.vkx.R.id.decor_content_parent);
            this.f28187l = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f28203l.getCallback());
            if (this.f28204l) {
                this.f28187l.isPro(109);
            }
            if (this.f28200l) {
                this.f28187l.isPro(2);
            }
            if (this.f28211l) {
                this.f28187l.isPro(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f28188l);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f28204l);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f28207l);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f28166l);
            sb.append(", windowNoTitle: ");
            C8339l.metrica(AbstractC5020l.Signature(sb, this.f28182l, " }"));
            return;
        }
        int i = 3;
        C16543l c16543l = new C16543l(i, this);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        AbstractC8558l.crashlytics(viewGroup, c16543l);
        if (this.f28187l == null) {
            this.f28168l = (TextView) viewGroup.findViewById(ua.itaysonlab.vkx.R.id.title);
        }
        boolean z = AbstractC15958l.yandex;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ua.itaysonlab.vkx.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f28203l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f28203l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C3316l(i, this));
        this.f28201l = viewGroup;
        Object obj = this.f28193l;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f28180l;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f28187l;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                C5184l c5184l = this.f28209l;
                if (c5184l != null) {
                    C18434l c18434l = (C18434l) c5184l.purchase;
                    if (!c18434l.mopub) {
                        Toolbar toolbar = c18434l.yandex;
                        c18434l.admob = title;
                        if ((c18434l.loadAd & 8) != 0) {
                            toolbar.setTitle(title);
                            if (c18434l.mopub) {
                                AbstractC15872l.metrica(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f28168l;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f28201l.findViewById(R.id.content);
        View decorView = this.f28203l.getDecorView();
        contentFrameLayout2.f173l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f28192l = true;
        C9491l c9491lApplovin = applovin(0);
        if (this.f28172l || c9491lApplovin.admob != null) {
            return;
        }
        inmobi(108);
    }

    @Override // defpackage.AbstractC10242l
    public final void amazon() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f28206l);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C14405l) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final C9491l applovin(int i) {
        C9491l[] c9491lArr = this.f28202l;
        if (c9491lArr == null || c9491lArr.length <= i) {
            C9491l[] c9491lArr2 = new C9491l[i + 1];
            if (c9491lArr != null) {
                System.arraycopy(c9491lArr, 0, c9491lArr2, 0, c9491lArr.length);
            }
            this.f28202l = c9491lArr2;
            c9491lArr = c9491lArr2;
        }
        C9491l c9491l = c9491lArr[i];
        if (c9491l != null) {
            return c9491l;
        }
        C9491l c9491l2 = new C9491l();
        c9491l2.yandex = i;
        c9491l2.vip = false;
        c9491lArr[i] = c9491l2;
        return c9491l2;
    }

    public final void appmetrica() {
        advert();
        if (this.f28188l && this.f28209l == null) {
            Object obj = this.f28193l;
            if (obj instanceof Activity) {
                this.f28209l = new C5184l((Activity) obj, this.f28204l);
            } else if (obj instanceof Dialog) {
                this.f28209l = new C5184l((Dialog) obj);
            }
            C5184l c5184l = this.f28209l;
            if (c5184l != null) {
                c5184l.amazon(this.f28185l);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.isPro() != false) goto L20;
     */
    @Override // defpackage.InterfaceC17433l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void billing(defpackage.MenuC4984l r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C14405l.billing(lٌؗٚ):void");
    }

    @Override // defpackage.AbstractC10242l
    public final void firebase(int i) {
        advert();
        ViewGroup viewGroup = (ViewGroup) this.f28201l.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f28206l).inflate(i, viewGroup);
        this.f28171l.yandex(this.f28203l.getCallback());
    }

    public final void inmobi(int i) {
        this.f28191l = (1 << i) | this.f28191l;
        if (this.f28176l) {
            return;
        }
        View decorView = this.f28203l.getDecorView();
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        decorView.postOnAnimation(this.f28198l);
        this.f28176l = true;
    }

    @Override // defpackage.AbstractC10242l
    public final boolean isPro(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f28182l && i == 108) {
            return false;
        }
        if (this.f28188l && i == 1) {
            this.f28188l = false;
        }
        if (i == 1) {
            m3848native();
            this.f28182l = true;
            return true;
        }
        if (i == 2) {
            m3848native();
            this.f28200l = true;
            return true;
        }
        if (i == 5) {
            m3848native();
            this.f28211l = true;
            return true;
        }
        if (i == 10) {
            m3848native();
            this.f28166l = true;
            return true;
        }
        if (i == 108) {
            m3848native();
            this.f28188l = true;
            return true;
        }
        if (i != 109) {
            return this.f28203l.requestFeature(i);
        }
        m3848native();
        this.f28204l = true;
        return true;
    }

    public final void isVip() {
        if (this.f28203l == null) {
            Object obj = this.f28193l;
            if (obj instanceof Activity) {
                adcel(((Activity) obj).getWindow());
            }
        }
        if (this.f28203l != null) {
            return;
        }
        C8339l.smaato("We have not been given a Window");
    }

    @Override // defpackage.AbstractC10242l
    public final void mopub() throws IllegalAccessException {
        String strPurchase;
        this.f28178l = true;
        startapp(false, true);
        isVip();
        Object obj = this.f28193l;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strPurchase = AbstractC11718l.purchase(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strPurchase = null;
            }
            if (strPurchase != null) {
                C5184l c5184l = this.f28209l;
                if (c5184l == null) {
                    this.f28185l = true;
                } else {
                    c5184l.amazon(true);
                }
            }
            synchronized (AbstractC10242l.f20859l) {
                AbstractC10242l.subs(this);
                AbstractC10242l.f20858l.add(new WeakReference(this));
            }
        }
        this.f28184l = new Configuration(this.f28206l.getResources().getConfiguration());
        this.f28181l = true;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m3848native() {
        if (this.f28192l) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c17508l;
        View view2 = null;
        if (this.f28167l == null) {
            int[] iArr = AbstractC14657l.isPro;
            Context context2 = this.f28206l;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f28167l = new C2282l();
            } else {
                try {
                    this.f28167l = (C2282l) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f28167l = new C2282l();
                }
            }
        }
        C2282l c2282l = this.f28167l;
        int i = AbstractC1189l.yandex;
        c2282l.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC14657l.advert, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context c8288l = (resourceId == 0 || ((context instanceof C8288l) && ((C8288l) context).yandex == resourceId)) ? context : new C8288l(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                c17508l = new C17508l(c8288l, attributeSet);
                break;
            case 1:
                c17508l = new C18167l(c8288l, attributeSet);
                break;
            case 2:
                c17508l = new C11590l(c8288l, attributeSet);
                break;
            case 3:
                c17508l = c2282l.purchase(c8288l, attributeSet);
                break;
            case 4:
                c17508l = new C10318l(c8288l, attributeSet, ua.itaysonlab.vkx.R.attr.imageButtonStyle);
                break;
            case 5:
                c17508l = new C10519l(c8288l, attributeSet);
                break;
            case 6:
                c17508l = new C4313l(c8288l, attributeSet);
                break;
            case 7:
                c17508l = c2282l.amazon(c8288l, attributeSet);
                break;
            case 8:
                c17508l = new C9614l(c8288l, attributeSet);
                break;
            case 9:
                c17508l = new AppCompatImageView(c8288l, attributeSet);
                break;
            case 10:
                c17508l = c2282l.yandex(c8288l, attributeSet);
                break;
            case 11:
                c17508l = c2282l.crashlytics(c8288l, attributeSet);
                break;
            case 12:
                c17508l = new C5217l(c8288l, attributeSet, ua.itaysonlab.vkx.R.attr.editTextStyle);
                break;
            case 13:
                c17508l = c2282l.loadAd(c8288l, attributeSet);
                break;
            default:
                c17508l = null;
                break;
        }
        if (c17508l == null && context != c8288l) {
            Object[] objArr = c2282l.yandex;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c8288l;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = C2282l.mopub;
                        if (i2 < 3) {
                            View viewBilling = c2282l.billing(c8288l, str, strArr[i2]);
                            if (viewBilling != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewBilling;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewBilling2 = c2282l.billing(c8288l, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewBilling2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c17508l = view2;
        }
        if (c17508l != null) {
            Context context3 = c17508l.getContext();
            if ((context3 instanceof ContextWrapper) && c17508l.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C2282l.crashlytics);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c17508l.setOnClickListener(new ViewOnClickListenerC11263l(c17508l, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c8288l.obtainStyledAttributes(attributeSet, C2282l.amazon);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    new C4718l(ua.itaysonlab.vkx.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).mopub(c17508l, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c8288l.obtainStyledAttributes(attributeSet, C2282l.purchase);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    AbstractC15872l.metrica(c17508l, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c8288l.obtainStyledAttributes(attributeSet, C2282l.billing);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                    new C4718l(ua.itaysonlab.vkx.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).mopub(c17508l, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c17508l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final boolean m3849package() {
        InterfaceC9913l interfaceC9913l;
        C6236l c6236l;
        boolean z = this.f28169l;
        this.f28169l = false;
        C9491l c9491lApplovin = applovin(0);
        if (!c9491lApplovin.remoteconfig) {
            AbstractC12048l abstractC12048l = this.f28175l;
            if (abstractC12048l != null) {
                abstractC12048l.loadAd();
                return true;
            }
            appmetrica();
            C5184l c5184l = this.f28209l;
            if (c5184l == null || (interfaceC9913l = c5184l.purchase) == null || (c6236l = ((C18434l) interfaceC9913l).yandex.f240l) == null || c6236l.f13167l == null) {
                return false;
            }
            C6236l c6236l2 = ((C18434l) interfaceC9913l).yandex.f240l;
            C17858l c17858l = c6236l2 == null ? null : c6236l2.f13167l;
            if (c17858l != null) {
                c17858l.collapseActionView();
            }
        } else if (!z) {
            Signature(c9491lApplovin, true);
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m3850private() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f28196l != null && (applovin(0).remoteconfig || this.f28175l != null)) {
                z = true;
            }
            if (z && this.f28205l == null) {
                this.f28205l = AbstractC5639l.loadAd(this.f28196l, this);
            } else {
                if (z || (onBackInvokedCallback = this.f28205l) == null) {
                    return;
                }
                AbstractC5639l.crashlytics(this.f28196l, onBackInvokedCallback);
                this.f28205l = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    public final boolean pro(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        C9491l c9491lApplovin;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean z2;
        boolean zM3854volatile;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        C0791l c0791l;
        C0791l c0791l2;
        C0791l c0791l3;
        C9491l c9491lApplovin2;
        Object obj = this.f28193l;
        if ((!(obj instanceof InterfaceC10671l) && !(obj instanceof DialogC0230l)) || (decorView = this.f28203l.getDecorView()) == null || !AbstractC16763l.billing(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                WindowCallbackC8931l windowCallbackC8931l = this.f28171l;
                Window.Callback callback = this.f28203l.getCallback();
                windowCallbackC8931l.getClass();
                try {
                    windowCallbackC8931l.f18398l = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    windowCallbackC8931l.f18398l = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f28169l = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    c9491lApplovin2 = applovin(0);
                                    if (!c9491lApplovin2.remoteconfig) {
                                        m3854volatile(c9491lApplovin2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f28175l == null) {
                                    c9491lApplovin = applovin(0);
                                    actionBarOverlayLayout = this.f28187l;
                                    context = this.f28206l;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.firebase();
                                        toolbar = ((C18434l) actionBarOverlayLayout.f145l).yandex;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f247l) == null || !actionMenuView.f160l || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = c9491lApplovin.remoteconfig;
                                            if (!z || c9491lApplovin.smaato) {
                                                Signature(c9491lApplovin, true);
                                                z2 = z;
                                            } else {
                                                if (c9491lApplovin.firebase) {
                                                    if (c9491lApplovin.metrica) {
                                                        c9491lApplovin.firebase = false;
                                                        zM3854volatile = m3854volatile(c9491lApplovin, keyEvent);
                                                    } else {
                                                        zM3854volatile = true;
                                                    }
                                                    if (zM3854volatile) {
                                                        m3852synchronized(c9491lApplovin, keyEvent);
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f28187l;
                                            actionBarOverlayLayout2.firebase();
                                            ActionMenuView actionMenuView2 = ((C18434l) actionBarOverlayLayout2.f145l).yandex.f247l;
                                            if (actionMenuView2 == null || (c0791l2 = actionMenuView2.f157l) == null || !c0791l2.isPro()) {
                                                if (!this.f28172l && m3854volatile(c9491lApplovin, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.f28187l;
                                                    actionBarOverlayLayout3.firebase();
                                                    ActionMenuView actionMenuView3 = ((C18434l) actionBarOverlayLayout3.f145l).yandex.f247l;
                                                    if (actionMenuView3 != null && (c0791l = actionMenuView3.f157l) != null && c0791l.smaato()) {
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.f28187l;
                                                actionBarOverlayLayout4.firebase();
                                                ActionMenuView actionMenuView4 = ((C18434l) actionBarOverlayLayout4.f145l).yandex.f247l;
                                                if (actionMenuView4 == null || (c0791l3 = actionMenuView4.f157l) == null || !c0791l3.mopub()) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z = c9491lApplovin.remoteconfig;
                                        if (z) {
                                        }
                                        Signature(c9491lApplovin, true);
                                        z2 = z;
                                    }
                                    if (z2) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (m3849package()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    windowCallbackC8931l.f18398l = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f28169l = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            c9491lApplovin2 = applovin(0);
                            if (!c9491lApplovin2.remoteconfig) {
                                m3854volatile(c9491lApplovin2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f28175l == null) {
                            c9491lApplovin = applovin(0);
                            actionBarOverlayLayout = this.f28187l;
                            context = this.f28206l;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.firebase();
                                toolbar = ((C18434l) actionBarOverlayLayout.f145l).yandex;
                                if (toolbar.getVisibility() == 0) {
                                    z = c9491lApplovin.remoteconfig;
                                    if (z) {
                                    }
                                    Signature(c9491lApplovin, true);
                                    z2 = z;
                                } else {
                                    z = c9491lApplovin.remoteconfig;
                                    if (z) {
                                    }
                                    Signature(c9491lApplovin, true);
                                    z2 = z;
                                }
                            } else {
                                z = c9491lApplovin.remoteconfig;
                                if (z) {
                                }
                                Signature(c9491lApplovin, true);
                                z2 = z;
                            }
                            if (z2) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (m3849package()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC10242l
    public final void remoteconfig(View view, ViewGroup.LayoutParams layoutParams) {
        advert();
        ViewGroup viewGroup = (ViewGroup) this.f28201l.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f28171l.yandex(this.f28203l.getCallback());
    }

    public final AbstractC17054l signatures(Context context) {
        if (this.f28212l == null) {
            if (C12418l.f24516l == null) {
                Context applicationContext = context.getApplicationContext();
                C12418l.f24516l = new C12418l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f28212l = new C8551l(this, C12418l.f24516l);
        }
        return this.f28212l;
    }

    @Override // defpackage.AbstractC10242l
    public final void smaato(View view) {
        advert();
        ViewGroup viewGroup = (ViewGroup) this.f28201l.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f28171l.yandex(this.f28203l.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean startapp(boolean z, boolean z2) throws IllegalAccessException {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        if (this.f28172l) {
            return false;
        }
        int i3 = this.f28197l;
        if (i3 == -100) {
            i3 = AbstractC10242l.f20860l;
        }
        Context context = this.f28206l;
        int iM3853throws = m3853throws(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        C2462l c2462lAds = i4 < 33 ? ads(context) : null;
        if (!z2 && c2462lAds != null) {
            c2462lAds = premium(context.getResources().getConfiguration());
        }
        Configuration configurationLicense = license(context, iM3853throws, c2462lAds, null, false);
        boolean z4 = this.f28208l;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        Object obj4 = this.f28193l;
        if (z4 || !(obj4 instanceof Activity)) {
            this.f28208l = true;
            i = this.f28173l;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                if (i4 >= 29) {
                    i2 = 269221888;
                } else {
                    i2 = i4 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i2);
                    if (activityInfo != null) {
                        this.f28173l = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f28173l = 0;
                }
                this.f28208l = true;
                i = this.f28173l;
            }
        }
        Configuration configuration = this.f28184l;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i5 = configuration.uiMode & 48;
        int i6 = configurationLicense.uiMode & 48;
        C2462l c2462lPremium = premium(configuration);
        C2462l c2462lPremium2 = c2462lAds == null ? null : premium(configurationLicense);
        int i7 = i5 != i6 ? AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE : 0;
        if (c2462lPremium2 != null && !c2462lPremium.equals(c2462lPremium2)) {
            i7 |= 8196;
        }
        if (((~i) & i7) != 0 && z && this.f28178l && ((f28163l || this.f28181l) && (obj4 instanceof Activity))) {
            Activity activity = (Activity) obj4;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 31 && (i7 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationLicense.getLayoutDirection());
                }
                if (i8 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC16112l(z5 ? 1 : 0, activity));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i7 == 0) {
            z5 = z3;
        } else {
            byte b = (i & i7) == i7;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
            if (c2462lPremium2 != null) {
                InterfaceC17227l interfaceC17227l = c2462lPremium2.yandex;
                if (Build.VERSION.SDK_INT >= 24) {
                    AbstractC9374l.amazon(configuration2, c2462lPremium2);
                } else {
                    configuration2.setLocale(interfaceC17227l.get(0));
                    configuration2.setLayoutDirection(interfaceC17227l.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 26 && i9 < 28) {
                if (i9 >= 24) {
                    if (!AbstractC16422l.admob) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            AbstractC16422l.mopub = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                        }
                        AbstractC16422l.admob = true;
                    }
                    Field field = AbstractC16422l.mopub;
                    if (field != null) {
                        try {
                            obj2 = field.get(resources);
                        } catch (IllegalAccessException e3) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!AbstractC16422l.loadAd) {
                                try {
                                    Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                                    AbstractC16422l.yandex = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                                }
                                AbstractC16422l.loadAd = true;
                            }
                            Field field2 = AbstractC16422l.yandex;
                            if (field2 != null) {
                                try {
                                    obj3 = field2.get(obj2);
                                } catch (IllegalAccessException e5) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                    obj3 = null;
                                }
                            } else {
                                obj3 = null;
                            }
                            if (obj3 != null) {
                                AbstractC16422l.crashlytics(obj3);
                            }
                        }
                    }
                } else {
                    if (!AbstractC16422l.loadAd) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            AbstractC16422l.yandex = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e6);
                        }
                        AbstractC16422l.loadAd = true;
                    }
                    Field field3 = AbstractC16422l.yandex;
                    if (field3 != null) {
                        try {
                            obj = field3.get(resources);
                        } catch (IllegalAccessException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e7);
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        AbstractC16422l.crashlytics(obj);
                    }
                }
            }
            int i10 = this.f28189l;
            if (i10 != 0) {
                context.setTheme(i10);
                context.getTheme().applyStyle(this.f28189l, true);
            }
            if (b != false && (obj4 instanceof Activity)) {
                Activity activity2 = (Activity) obj4;
                if (activity2 instanceof InterfaceC3177l) {
                    if (((C5268l) ((InterfaceC3177l) activity2).loadAd()).subs.yandex(EnumC8981l.f18520l)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f28181l && !this.f28172l) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (c2462lPremium2 != null) {
            C2462l c2462lPremium3 = premium(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC9374l.crashlytics(c2462lPremium3);
            } else {
                Locale.setDefault(c2462lPremium3.yandex.get(0));
            }
        }
        if (i3 == 0) {
            signatures(context).m4257l();
        } else {
            C8551l c8551l = this.f28212l;
            if (c8551l != null) {
                c8551l.m4258l();
            }
        }
        C8551l c8551l2 = this.f28177l;
        if (i3 == 3) {
            if (c8551l2 == null) {
                this.f28177l = new C8551l(this, context);
            }
            this.f28177l.m4257l();
        } else if (c8551l2 != null) {
            c8551l2.m4258l();
        }
        return z5;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean m3851strictfp(C9491l c9491l, int i, KeyEvent keyEvent) {
        MenuC4984l menuC4984l;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c9491l.firebase || m3854volatile(c9491l, keyEvent)) && (menuC4984l = c9491l.admob) != null) {
            return menuC4984l.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final void subscription(int i, C9491l c9491l, MenuC4984l menuC4984l) {
        if (menuC4984l == null) {
            if (c9491l == null && i >= 0) {
                C9491l[] c9491lArr = this.f28202l;
                if (i < c9491lArr.length) {
                    c9491l = c9491lArr[i];
                }
            }
            if (c9491l != null) {
                menuC4984l = c9491l.admob;
            }
        }
        if ((c9491l == null || c9491l.remoteconfig) && !this.f28172l) {
            WindowCallbackC8931l windowCallbackC8931l = this.f28171l;
            Window.Callback callback = this.f28203l.getCallback();
            windowCallbackC8931l.getClass();
            try {
                windowCallbackC8931l.f18402l = true;
                callback.onPanelClosed(i, menuC4984l);
            } finally {
                windowCallbackC8931l.f18402l = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.f28237l.getCount() > 0) goto L88;
     */
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3852synchronized(defpackage.C9491l r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C14405l.m3852synchronized(lٍِٟ, android.view.KeyEvent):void");
    }

    public final void tapsense(MenuC4984l menuC4984l) {
        C0791l c0791l;
        if (this.f28194l) {
            return;
        }
        this.f28194l = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f28187l;
        actionBarOverlayLayout.firebase();
        ActionMenuView actionMenuView = ((C18434l) actionBarOverlayLayout.f145l).yandex.f247l;
        if (actionMenuView != null && (c0791l = actionMenuView.f157l) != null) {
            c0791l.mopub();
            C14858l c14858l = c0791l.f2389l;
            if (c14858l != null && c14858l.loadAd()) {
                c14858l.subs.dismiss();
            }
        }
        Window.Callback callback = this.f28203l.getCallback();
        if (callback != null && !this.f28172l) {
            callback.onPanelClosed(108, menuC4984l);
        }
        this.f28194l = false;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m3853throws(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            C8339l.smaato("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.f28177l == null) {
                            this.f28177l = new C8551l(this, context);
                        }
                        return this.f28177l.mo2328l();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return signatures(context).mo2328l();
                }
            }
            return i;
        }
        return -1;
    }

    @Override // defpackage.AbstractC10242l
    public final void vip(CharSequence charSequence) {
        this.f28180l = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f28187l;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        C5184l c5184l = this.f28209l;
        if (c5184l == null) {
            TextView textView = this.f28168l;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C18434l c18434l = (C18434l) c5184l.purchase;
        if (c18434l.mopub) {
            return;
        }
        Toolbar toolbar = c18434l.yandex;
        c18434l.admob = charSequence;
        if ((c18434l.loadAd & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c18434l.mopub) {
                AbstractC15872l.metrica(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean m3854volatile(C9491l c9491l, KeyEvent keyEvent) {
        MenuC4984l menuC4984l;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.f28172l) {
            boolean z = c9491l.firebase;
            int i = c9491l.yandex;
            if (z) {
                return true;
            }
            C9491l c9491l2 = this.f28179l;
            if (c9491l2 != null && c9491l2 != c9491l) {
                Signature(c9491l2, false);
            }
            Window.Callback callback = this.f28203l.getCallback();
            if (callback != null) {
                c9491l.mopub = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.f28187l) != null) {
                actionBarOverlayLayout4.firebase();
                ((C18434l) actionBarOverlayLayout4.f145l).smaato = true;
            }
            if (c9491l.mopub == null) {
                MenuC4984l menuC4984l2 = c9491l.admob;
                if (menuC4984l2 == null || c9491l.metrica) {
                    if (menuC4984l2 == null) {
                        Context context = this.f28206l;
                        if ((i == 0 || i == 108) && this.f28187l != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C8288l c8288l = new C8288l(context, 0);
                                c8288l.getTheme().setTo(themeNewTheme);
                                context = c8288l;
                            }
                        }
                        MenuC4984l menuC4984l3 = new MenuC4984l(context);
                        menuC4984l3.f10202l = this;
                        MenuC4984l menuC4984l4 = c9491l.admob;
                        if (menuC4984l3 != menuC4984l4) {
                            if (menuC4984l4 != null) {
                                menuC4984l4.ads(c9491l.subs);
                            }
                            c9491l.admob = menuC4984l3;
                            C14422l c14422l = c9491l.subs;
                            if (c14422l != null) {
                                menuC4984l3.loadAd(c14422l, menuC4984l3.f10197l);
                            }
                        }
                        if (c9491l.admob != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.f28187l) != null) {
                                if (this.f28213l == null) {
                                    this.f28213l = new C5501l(2, this);
                                }
                                actionBarOverlayLayout2.smaato(c9491l.admob, this.f28213l);
                            }
                            c9491l.admob.pro();
                            if (callback.onCreatePanelMenu(i, c9491l.admob)) {
                                c9491l.metrica = false;
                            } else {
                                menuC4984l = c9491l.admob;
                                if (menuC4984l != null) {
                                    if (menuC4984l != null) {
                                        menuC4984l.ads(c9491l.subs);
                                    }
                                    c9491l.admob = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.f28187l) != null) {
                                    actionBarOverlayLayout.smaato(null, this.f28213l);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f28213l == null) {
                                this.f28213l = new C5501l(2, this);
                            }
                            actionBarOverlayLayout2.smaato(c9491l.admob, this.f28213l);
                        }
                        c9491l.admob.pro();
                        if (callback.onCreatePanelMenu(i, c9491l.admob)) {
                            menuC4984l = c9491l.admob;
                            if (menuC4984l != null) {
                                if (menuC4984l != null) {
                                    menuC4984l.ads(c9491l.subs);
                                }
                                c9491l.admob = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.smaato(null, this.f28213l);
                            }
                        } else {
                            c9491l.metrica = false;
                        }
                    }
                }
                c9491l.admob.pro();
                Bundle bundle = c9491l.startapp;
                if (bundle != null) {
                    c9491l.admob.subscription(bundle);
                    c9491l.startapp = null;
                }
                if (!callback.onPreparePanel(0, c9491l.mopub, c9491l.admob)) {
                    if (z2 && (actionBarOverlayLayout3 = this.f28187l) != null) {
                        actionBarOverlayLayout3.smaato(null, this.f28213l);
                    }
                    c9491l.admob.license();
                    return false;
                }
                c9491l.admob.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c9491l.admob.license();
            }
            c9491l.firebase = true;
            c9491l.smaato = false;
            this.f28179l = c9491l;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.InterfaceC17433l
    public final boolean yandex(MenuC4984l menuC4984l, MenuItem menuItem) {
        C9491l c9491l;
        Window.Callback callback = this.f28203l.getCallback();
        if (callback != null && !this.f28172l) {
            MenuC4984l menuC4984lFirebase = menuC4984l.firebase();
            C9491l[] c9491lArr = this.f28202l;
            int length = c9491lArr != null ? c9491lArr.length : 0;
            for (int i = 0; i < length; i++) {
                c9491l = c9491lArr[i];
                if (c9491l != null && c9491l.admob == menuC4984lFirebase) {
                    if (c9491l != null) {
                        return callback.onMenuItemSelected(c9491l.yandex, menuItem);
                    }
                }
            }
            c9491l = null;
            if (c9491l != null) {
                return callback.onMenuItemSelected(c9491l.yandex, menuItem);
            }
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
