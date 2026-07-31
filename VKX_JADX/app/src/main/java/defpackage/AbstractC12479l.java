package defpackage;

import android.app.Notification;
import android.graphics.ColorSpace;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;

/* JADX INFO: renamed from: lٌّۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12479l {
    public static boolean amazon(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static void billing(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }

    public static CharSequence crashlytics(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static int loadAd(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static final C0005l mopub(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new C0005l(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final ColorSpace purchase(AbstractC11833l abstractC11833l) {
        if (AbstractC8576l.yandex(abstractC11833l, C3955l.ad)) {
            return ColorSpace.get(ColorSpace.Named.OK_LAB);
        }
        return null;
    }

    public static int yandex(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }
}
