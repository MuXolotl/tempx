package defpackage;

import android.os.Build;
import android.widget.RemoteViews;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘۛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5967l {
    public static void crashlytics(RemoteViews remoteViews, int i, AbstractC11876l abstractC11876l) {
        if (abstractC11876l instanceof C10365l) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
        } else if (abstractC11876l instanceof C1617l) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
        } else if (abstractC11876l instanceof C9402l) {
            remoteViews.setViewLayoutWidth(i, ((C9402l) abstractC11876l).yandex, 1);
        } else if (abstractC11876l instanceof C3287l) {
            remoteViews.setViewLayoutWidthDimen(i, ((C3287l) abstractC11876l).yandex);
        } else {
            if (!abstractC11876l.equals(C16589l.yandex)) {
                C18725l.billing();
                return;
            }
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        }
        Unit unit = Unit.INSTANCE;
    }

    public static void loadAd(RemoteViews remoteViews, int i, AbstractC11876l abstractC11876l) {
        if (abstractC11876l instanceof C10365l) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
        } else if (abstractC11876l instanceof C1617l) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
        } else if (abstractC11876l instanceof C9402l) {
            remoteViews.setViewLayoutHeight(i, ((C9402l) abstractC11876l).yandex, 1);
        } else if (abstractC11876l instanceof C3287l) {
            remoteViews.setViewLayoutHeightDimen(i, ((C3287l) abstractC11876l).yandex);
        } else {
            if (!abstractC11876l.equals(C16589l.yandex)) {
                C18725l.billing();
                return;
            }
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        }
        Unit unit = Unit.INSTANCE;
    }

    public static void yandex(RemoteViews remoteViews, int i, AbstractC11876l abstractC11876l) {
        if (Build.VERSION.SDK_INT < 31) {
            C10754l.metrica("setClipToOutline is only available on SDK 31 and higher");
            return;
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (abstractC11876l instanceof C9402l) {
            remoteViews.setViewOutlinePreferredRadius(i, ((C9402l) abstractC11876l).yandex, 1);
        } else if (abstractC11876l instanceof C3287l) {
            remoteViews.setViewOutlinePreferredRadiusDimen(i, ((C3287l) abstractC11876l).yandex);
        } else {
            C11983l.advert(abstractC11876l.getClass().getCanonicalName(), "Rounded corners should not be ");
        }
    }
}
