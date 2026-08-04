package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lّٖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12292l {
    public static final C11879l amazon = AbstractC1805l.loadAd(0);
    public final Object yandex = new Object();
    public final LinkedHashMap loadAd = new LinkedHashMap();
    public final LinkedHashSet crashlytics = new LinkedHashSet();

    public final void loadAd(C4271l c4271l) {
        synchronized (this.yandex) {
            this.crashlytics.remove(c4271l);
        }
    }

    public final C17273l yandex(Surface surface) {
        C17273l c17273l;
        List listM4213const;
        if (!surface.isValid()) {
            Log.w("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.yandex) {
            try {
                c17273l = new C17273l(this, surface);
                Integer num = (Integer) this.loadAd.get(surface);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.loadAd.put(surface, Integer.valueOf(iIntValue));
                listM4213const = iIntValue == 1 ? AbstractC16901l.m4213const(this.crashlytics) : null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listM4213const != null) {
            Iterator it = listM4213const.iterator();
            while (it.hasNext()) {
                ((C4271l) it.next()).amazon(surface);
            }
        }
        return c17273l;
    }
}
