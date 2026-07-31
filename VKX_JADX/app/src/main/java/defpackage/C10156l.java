package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًَؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C10156l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final View.AccessibilityDelegate f20670l = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C14990l f20671l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final View.AccessibilityDelegate f20672l;

    public C10156l(View.AccessibilityDelegate accessibilityDelegate) {
        this.f20672l = accessibilityDelegate;
        this.f20671l = new C14990l(this);
    }

    public void admob(View view, int i) {
        this.f20672l.sendAccessibilityEvent(view, i);
    }

    public void amazon(View view, C15685l c15685l) {
        this.f20672l.onInitializeAccessibilityNodeInfo(view, c15685l.yandex);
    }

    public boolean billing(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f20672l.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void crashlytics(View view, AccessibilityEvent accessibilityEvent) {
        this.f20672l.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public C3585l loadAd(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f20672l.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C3585l(3, accessibilityNodeProvider);
        }
        return null;
    }

    public boolean mopub(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < list.size()) {
                C6933l c6933l = (C6933l) list.get(i2);
                if (c6933l.yandex() == i) {
                    Class cls = c6933l.crashlytics;
                    InterfaceC1775l interfaceC1775l = c6933l.amazon;
                    if (interfaceC1775l != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                            }
                        }
                        zPerformAccessibilityAction = interfaceC1775l.loadAd(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f20672l.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public void purchase(View view, AccessibilityEvent accessibilityEvent) {
        this.f20672l.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void subs(View view, AccessibilityEvent accessibilityEvent) {
        this.f20672l.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean yandex(View view, AccessibilityEvent accessibilityEvent) {
        return this.f20672l.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C10156l() {
        this(f20670l);
    }
}
