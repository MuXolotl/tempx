package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘٕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15872l {
    public static boolean crashlytics = false;
    public static Field loadAd;
    public static WeakHashMap yandex;
    public static final int[] amazon = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final C0685l purchase = new C0685l();
    public static final ViewTreeObserverOnGlobalLayoutListenerC5110l billing = new ViewTreeObserverOnGlobalLayoutListenerC5110l();

    public static void admob(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = purchase(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(purchase(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(purchase(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static View.AccessibilityDelegate amazon(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC15028l.yandex(view);
        }
        if (crashlytics) {
            return null;
        }
        if (loadAd == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                loadAd = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                crashlytics = true;
                return null;
            }
        }
        try {
            Object obj = loadAd.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            crashlytics = true;
            return null;
        }
    }

    public static ArrayList billing(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static boolean crashlytics(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C9519l.amazon;
        C9519l c9519l = (C9519l) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c9519l == null) {
            c9519l = new C9519l();
            c9519l.yandex = null;
            c9519l.loadAd = null;
            c9519l.crashlytics = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c9519l);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c9519l.yandex;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C9519l.amazon;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c9519l.yandex == null) {
                            c9519l.yandex = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C9519l.amazon;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c9519l.yandex.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c9519l.yandex.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewYandex = c9519l.yandex(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewYandex != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c9519l.loadAd == null) {
                    c9519l.loadAd = new SparseArray();
                }
                c9519l.loadAd.put(keyCode, new WeakReference(viewYandex));
            }
        }
        return viewYandex != null;
    }

    public static void firebase(View view, int i) {
        ArrayList arrayListBilling = billing(view);
        for (int i2 = 0; i2 < arrayListBilling.size(); i2++) {
            if (((C6933l) arrayListBilling.get(i2)).yandex() == i) {
                arrayListBilling.remove(i2);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C16242l isPro(View view, C16242l c16242l) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c16242l + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC11026l.loadAd(view, c16242l);
        }
        C0262l c0262l = (C0262l) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC17353l interfaceC17353l = purchase;
        if (c0262l == null) {
            if (view instanceof InterfaceC17353l) {
                interfaceC17353l = (InterfaceC17353l) view;
            }
            return interfaceC17353l.yandex(c16242l);
        }
        C16242l c16242lYandex = c0262l.yandex(view, c16242l);
        if (c16242lYandex == null) {
            return null;
        }
        if (view instanceof InterfaceC17353l) {
            interfaceC17353l = (InterfaceC17353l) view;
        }
        return interfaceC17353l.yandex(c16242lYandex);
    }

    public static C1473l loadAd(View view, C1473l c1473l) {
        WindowInsets windowInsetsMopub = c1473l.mopub();
        if (windowInsetsMopub != null) {
            WindowInsets windowInsetsYandex = Build.VERSION.SDK_INT >= 30 ? AbstractC18305l.yandex(view, windowInsetsMopub) : AbstractC18211l.yandex(view, windowInsetsMopub);
            if (!windowInsetsYandex.equals(windowInsetsMopub)) {
                return C1473l.admob(windowInsetsYandex, view);
            }
        }
        return c1473l;
    }

    public static void metrica(View view, CharSequence charSequence) {
        new C4718l(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).mopub(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC5110l viewTreeObserverOnGlobalLayoutListenerC5110l = billing;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC5110l.f11109l.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC5110l);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC5110l);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC5110l.f11109l.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC5110l);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC5110l);
            }
        }
    }

    public static String[] mopub(C5217l c5217l) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC11026l.yandex(c5217l) : (String[]) c5217l.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static CharSequence purchase(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC17441l.yandex(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static void remoteconfig(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC15028l.loadAd(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void smaato(View view, C6933l c6933l, InterfaceC1775l interfaceC1775l) {
        C10156l c10156l;
        C6933l c6933l2 = new C6933l(null, c6933l.loadAd, null, interfaceC1775l, c6933l.crashlytics);
        View.AccessibilityDelegate accessibilityDelegateAmazon = amazon(view);
        if (accessibilityDelegateAmazon == null) {
            c10156l = null;
        } else {
            c10156l = accessibilityDelegateAmazon instanceof C14990l ? ((C14990l) accessibilityDelegateAmazon).yandex : new C10156l(accessibilityDelegateAmazon);
        }
        if (c10156l == null) {
            c10156l = new C10156l();
        }
        vip(view, c10156l);
        firebase(view, c6933l2.yandex());
        billing(view).add(c6933l2);
        admob(view, 0);
    }

    public static void startapp(View view, AbstractC15029l abstractC15029l) {
        if (Build.VERSION.SDK_INT >= 30) {
            C13499l.mopub(view, abstractC15029l);
            return;
        }
        PathInterpolator pathInterpolator = C12441l.purchase;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC16043l = abstractC15029l != null ? new ViewOnApplyWindowInsetsListenerC16043l(view, abstractC15029l) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC16043l);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC16043l);
        }
    }

    public static C1473l subs(View view, C1473l c1473l) {
        WindowInsets windowInsetsMopub = c1473l.mopub();
        if (windowInsetsMopub != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsMopub);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsMopub)) {
                return C1473l.admob(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return c1473l;
    }

    public static void vip(View view, C10156l c10156l) {
        if (c10156l == null && (amazon(view) instanceof C14990l)) {
            c10156l = new C10156l();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c10156l == null ? null : c10156l.f20671l);
    }

    public static C2932l yandex(View view) {
        if (yandex == null) {
            yandex = new WeakHashMap();
        }
        C2932l c2932l = (C2932l) yandex.get(view);
        if (c2932l != null) {
            return c2932l;
        }
        C2932l c2932l2 = new C2932l(view);
        yandex.put(view, c2932l2);
        return c2932l2;
    }
}
