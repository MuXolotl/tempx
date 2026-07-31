package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙۨۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6933l {
    public static final C6933l adcel;
    public static final C6933l admob;
    public static final C6933l ads;
    public static final C6933l billing;
    public static final C6933l firebase;
    public static final C6933l isPro;
    public static final C6933l metrica;
    public static final C6933l mopub;
    public static final C6933l purchase;
    public static final C6933l remoteconfig;
    public static final C6933l smaato;
    public static final C6933l startapp;
    public static final C6933l subs;
    public static final C6933l vip;
    public final InterfaceC1775l amazon;
    public final Class crashlytics;
    public final int loadAd;
    public final Object yandex;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityActionYandex = null;
        new C6933l(1, (String) null);
        new C6933l(2, (String) null);
        new C6933l(4, (String) null);
        new C6933l(8, (String) null);
        purchase = new C6933l(16, (String) null);
        new C6933l(32, (String) null);
        billing = new C6933l(64, (String) null);
        mopub = new C6933l(128, (String) null);
        new C6933l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, AbstractC6856l.class);
        new C6933l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, AbstractC6856l.class);
        new C6933l(1024, AbstractC6778l.class);
        new C6933l(2048, AbstractC6778l.class);
        admob = new C6933l(4096, (String) null);
        subs = new C6933l(8192, (String) null);
        new C6933l(16384, (String) null);
        new C6933l(32768, (String) null);
        new C6933l(65536, (String) null);
        new C6933l(131072, AbstractC8305l.class);
        isPro = new C6933l(262144, (String) null);
        firebase = new C6933l(524288, (String) null);
        smaato = new C6933l(1048576, (String) null);
        new C6933l(2097152, AbstractC14052l.class);
        new C6933l(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        remoteconfig = new C6933l(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC7812l.class);
        vip = new C6933l(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        metrica = new C6933l(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        startapp = new C6933l(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        adcel = new C6933l(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i = Build.VERSION.SDK_INT;
        new C6933l(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C6933l(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C6933l(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C6933l(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C6933l(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C6933l(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, AbstractC18171l.class);
        new C6933l(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC6792l.class);
        new C6933l(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C6933l(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C6933l(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C6933l(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C6933l(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C6933l(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C6933l(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C6933l(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        ads = new C6933l(i >= 34 ? AbstractC5917l.mopub() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i2 = AbstractC2664l.yandex;
        if (i >= 36 && AbstractC1206l.yandex() >= 3600001) {
            accessibilityActionYandex = AbstractC3522l.yandex();
        }
        new C6933l(accessibilityActionYandex, R.id.ALT, null, null, null);
    }

    public C6933l(Object obj, int i, CharSequence charSequence, InterfaceC1775l interfaceC1775l, Class cls) {
        this.loadAd = i;
        this.amazon = interfaceC1775l;
        if (obj == null) {
            this.yandex = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.yandex = obj;
        }
        this.crashlytics = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6933l)) {
            return false;
        }
        Object obj2 = ((C6933l) obj).yandex;
        Object obj3 = this.yandex;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.yandex;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strAmazon = C15685l.amazon(this.loadAd);
        if (strAmazon.equals("ACTION_UNKNOWN")) {
            Object obj = this.yandex;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strAmazon = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strAmazon);
        return sb.toString();
    }

    public final int yandex() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.yandex).getId();
    }

    public C6933l(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C6933l(int i, String str) {
        this(null, i, str, null, null);
    }
}
