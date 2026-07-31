package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: lؑٚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0414l {
    public static final C11379l yandex = C1461l.f3646l;

    public static final boolean yandex(C9185l c9185l) {
        MotionEvent motionEventYandex;
        List list = c9185l.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C15730l) list.get(i)).subs != 2) {
                MotionEvent motionEventYandex2 = c9185l.yandex();
                if ((motionEventYandex2 == null || !motionEventYandex2.isFromSource(8194)) && ((motionEventYandex = c9185l.yandex()) == null || !motionEventYandex.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
