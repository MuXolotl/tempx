package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌٝؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC8931l implements Window.Callback {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f18398l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f18399l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Window.Callback f18400l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C14405l f18401l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f18402l;

    public WindowCallbackC8931l(LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l, Window.Callback callback) {
        this.f18401l = layoutInflaterFactory2C14405l;
        if (callback != null) {
            this.f18400l = callback;
        } else {
            C8339l.metrica("Window callback may not be null");
            throw null;
        }
    }

    public final void amazon(List list, Menu menu, int i) {
        AbstractC10647l.yandex(this.f18400l, list, menu, i);
    }

    public final void crashlytics(int i, Menu menu) {
        this.f18400l.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f18400l.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f18398l;
        Window.Callback callback = this.f18400l;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f18401l.pro(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C9491l c9491l;
        boolean z;
        boolean zM3851strictfp;
        MenuC4984l menuC4984l;
        boolean zPerformShortcut;
        if (!this.f18400l.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = this.f18401l;
            layoutInflaterFactory2C14405l.appmetrica();
            C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
            if (c5184l == null) {
                c9491l = layoutInflaterFactory2C14405l.f28179l;
                if (c9491l == null && layoutInflaterFactory2C14405l.m3851strictfp(c9491l, keyEvent.getKeyCode(), keyEvent)) {
                    C9491l c9491l2 = layoutInflaterFactory2C14405l.f28179l;
                    if (c9491l2 != null) {
                        c9491l2.smaato = true;
                    }
                } else {
                    if (layoutInflaterFactory2C14405l.f28179l == null) {
                        C9491l c9491lApplovin = layoutInflaterFactory2C14405l.applovin(0);
                        layoutInflaterFactory2C14405l.m3854volatile(c9491lApplovin, keyEvent);
                        zM3851strictfp = layoutInflaterFactory2C14405l.m3851strictfp(c9491lApplovin, keyEvent.getKeyCode(), keyEvent);
                        c9491lApplovin.firebase = false;
                        if (zM3851strictfp) {
                        }
                    }
                    z = false;
                }
                z = true;
            } else {
                C0053l c0053l = c5184l.subs;
                if (c0053l == null || (menuC4984l = c0053l.f942l) == null) {
                    zPerformShortcut = false;
                } else {
                    menuC4984l.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = menuC4984l.performShortcut(keyCode, keyEvent, 0);
                }
                if (zPerformShortcut) {
                    z = true;
                } else {
                    c9491l = layoutInflaterFactory2C14405l.f28179l;
                    if (c9491l == null) {
                        if (layoutInflaterFactory2C14405l.f28179l == null) {
                            C9491l c9491lApplovin2 = layoutInflaterFactory2C14405l.applovin(0);
                            layoutInflaterFactory2C14405l.m3854volatile(c9491lApplovin2, keyEvent);
                            zM3851strictfp = layoutInflaterFactory2C14405l.m3851strictfp(c9491lApplovin2, keyEvent.getKeyCode(), keyEvent);
                            c9491lApplovin2.firebase = false;
                            if (zM3851strictfp) {
                                z = true;
                            }
                        }
                        z = false;
                    } else {
                        if (layoutInflaterFactory2C14405l.f28179l == null) {
                            C9491l c9491lApplovin3 = layoutInflaterFactory2C14405l.applovin(0);
                            layoutInflaterFactory2C14405l.m3854volatile(c9491lApplovin3, keyEvent);
                            zM3851strictfp = layoutInflaterFactory2C14405l.m3851strictfp(c9491lApplovin3, keyEvent.getKeyCode(), keyEvent);
                            c9491lApplovin3.firebase = false;
                            if (zM3851strictfp) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f18400l.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f18400l.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f18400l.dispatchTrackballEvent(motionEvent);
    }

    public final boolean loadAd(int i, Menu menu) {
        return this.f18400l.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f18400l.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f18400l.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f18400l.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f18399l) {
            this.f18400l.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC4984l)) {
            return this.f18400l.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f18400l.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f18400l.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f18400l.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        loadAd(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = this.f18401l;
            layoutInflaterFactory2C14405l.appmetrica();
            C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
            if (c5184l != null) {
                ArrayList arrayList = c5184l.remoteconfig;
                if (true != c5184l.smaato) {
                    c5184l.smaato = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        C18725l.loadAd();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f18402l) {
            this.f18400l.onPanelClosed(i, menu);
            return;
        }
        crashlytics(i, menu);
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = this.f18401l;
        if (i != 108) {
            if (i == 0) {
                C9491l c9491lApplovin = layoutInflaterFactory2C14405l.applovin(i);
                if (c9491lApplovin.remoteconfig) {
                    layoutInflaterFactory2C14405l.Signature(c9491lApplovin, false);
                    return;
                }
                return;
            }
            return;
        }
        layoutInflaterFactory2C14405l.appmetrica();
        C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
        if (c5184l != null) {
            ArrayList arrayList = c5184l.remoteconfig;
            if (c5184l.smaato) {
                c5184l.smaato = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                C18725l.loadAd();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC11480l.yandex(this.f18400l, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC4984l menuC4984l = menu instanceof MenuC4984l ? (MenuC4984l) menu : null;
        if (i == 0 && menuC4984l == null) {
            return false;
        }
        if (menuC4984l != null) {
            menuC4984l.f10195l = true;
        }
        boolean zOnPreparePanel = this.f18400l.onPreparePanel(i, view, menu);
        if (menuC4984l != null) {
            menuC4984l.f10195l = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC4984l menuC4984l = this.f18401l.applovin(0).admob;
        if (menuC4984l != null) {
            amazon(list, menuC4984l, i);
        } else {
            amazon(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC7129l.yandex(this.f18400l, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f18400l.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f18400l.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = this.f18401l;
        Context context = layoutInflaterFactory2C14405l.f28206l;
        if (i != 0) {
            return AbstractC7129l.loadAd(this.f18400l, callback, i);
        }
        C12014l c12014l = new C12014l(context, callback);
        AbstractC12048l abstractC12048l = layoutInflaterFactory2C14405l.f28175l;
        if (abstractC12048l != null) {
            abstractC12048l.loadAd();
        }
        C10023l c10023l = new C10023l(layoutInflaterFactory2C14405l, c12014l);
        layoutInflaterFactory2C14405l.appmetrica();
        C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
        int i2 = 1;
        if (c5184l != null) {
            C0053l c0053l = c5184l.subs;
            if (c0053l != null) {
                c0053l.loadAd();
            }
            c5184l.crashlytics.setHideOnContentScrollEnabled(false);
            c5184l.billing.purchase();
            C0053l c0053l2 = new C0053l(c5184l, c5184l.billing.getContext(), c10023l);
            MenuC4984l menuC4984l = c0053l2.f942l;
            menuC4984l.pro();
            try {
                boolean zM3300else = ((C12014l) c0053l2.f941l.f20419l).m3300else(c0053l2, menuC4984l);
                menuC4984l.license();
                if (zM3300else) {
                    c5184l.subs = c0053l2;
                    c0053l2.isPro();
                    c5184l.billing.crashlytics(c0053l2);
                    c5184l.yandex(true);
                } else {
                    c0053l2 = null;
                }
                layoutInflaterFactory2C14405l.f28175l = c0053l2;
            } catch (Throwable th) {
                menuC4984l.license();
                throw th;
            }
        }
        if (layoutInflaterFactory2C14405l.f28175l == null) {
            C2932l c2932l = layoutInflaterFactory2C14405l.f28183l;
            if (c2932l != null) {
                c2932l.loadAd();
            }
            AbstractC12048l abstractC12048l2 = layoutInflaterFactory2C14405l.f28175l;
            if (abstractC12048l2 != null) {
                abstractC12048l2.loadAd();
            }
            if (layoutInflaterFactory2C14405l.f28174l == null) {
                if (layoutInflaterFactory2C14405l.f28207l) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C8288l c8288l = new C8288l(context, 0);
                        c8288l.getTheme().setTo(themeNewTheme);
                        context = c8288l;
                    }
                    layoutInflaterFactory2C14405l.f28174l = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C14405l.f28170l = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C14405l.f28170l.setContentView(layoutInflaterFactory2C14405l.f28174l);
                    layoutInflaterFactory2C14405l.f28170l.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C14405l.f28174l.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C14405l.f28170l.setHeight(-2);
                    layoutInflaterFactory2C14405l.f28214l = new RunnableC11679l(layoutInflaterFactory2C14405l, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C14405l.f28201l.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C14405l.appmetrica();
                        C5184l c5184l2 = layoutInflaterFactory2C14405l.f28209l;
                        Context contextLoadAd = c5184l2 != null ? c5184l2.loadAd() : null;
                        if (contextLoadAd != null) {
                            context = contextLoadAd;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C14405l.f28174l = (ActionBarContextView) viewStubCompat.yandex();
                    }
                }
            }
            if (layoutInflaterFactory2C14405l.f28174l != null) {
                C2932l c2932l2 = layoutInflaterFactory2C14405l.f28183l;
                if (c2932l2 != null) {
                    c2932l2.loadAd();
                }
                layoutInflaterFactory2C14405l.f28174l.purchase();
                Context context2 = layoutInflaterFactory2C14405l.f28174l.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C14405l.f28174l;
                C6538l c6538l = new C6538l();
                c6538l.f13643l = context2;
                c6538l.f13647l = actionBarContextView;
                c6538l.f13646l = c10023l;
                MenuC4984l menuC4984l2 = new MenuC4984l(actionBarContextView.getContext());
                menuC4984l2.f10204l = 1;
                c6538l.f13645l = menuC4984l2;
                menuC4984l2.f10202l = c6538l;
                if (((C12014l) c10023l.f20419l).m3300else(c6538l, menuC4984l2)) {
                    c6538l.isPro();
                    layoutInflaterFactory2C14405l.f28174l.crashlytics(c6538l);
                    layoutInflaterFactory2C14405l.f28175l = c6538l;
                    boolean z = layoutInflaterFactory2C14405l.f28192l && (viewGroup = layoutInflaterFactory2C14405l.f28201l) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = layoutInflaterFactory2C14405l.f28174l;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        C2932l c2932lYandex = AbstractC15872l.yandex(layoutInflaterFactory2C14405l.f28174l);
                        c2932lYandex.yandex(1.0f);
                        layoutInflaterFactory2C14405l.f28183l = c2932lYandex;
                        c2932lYandex.amazon(new C16972l(i2, layoutInflaterFactory2C14405l));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        layoutInflaterFactory2C14405l.f28174l.setVisibility(0);
                        if (layoutInflaterFactory2C14405l.f28174l.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C14405l.f28174l.getParent();
                            WeakHashMap weakHashMap = AbstractC15872l.yandex;
                            view.requestApplyInsets();
                        }
                    }
                    if (layoutInflaterFactory2C14405l.f28170l != null) {
                        layoutInflaterFactory2C14405l.f28203l.getDecorView().post(layoutInflaterFactory2C14405l.f28214l);
                    }
                } else {
                    layoutInflaterFactory2C14405l.f28175l = null;
                }
            }
            layoutInflaterFactory2C14405l.m3850private();
            layoutInflaterFactory2C14405l.f28175l = layoutInflaterFactory2C14405l.f28175l;
        }
        layoutInflaterFactory2C14405l.m3850private();
        AbstractC12048l abstractC12048l3 = layoutInflaterFactory2C14405l.f28175l;
        if (abstractC12048l3 != null) {
            return c12014l.adcel(abstractC12048l3);
        }
        return null;
    }

    public final void yandex(Window.Callback callback) {
        try {
            this.f18399l = true;
            callback.onContentChanged();
        } finally {
            this.f18399l = false;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f18400l.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
