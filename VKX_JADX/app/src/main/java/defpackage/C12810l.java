package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lّۘ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12810l extends OrientationEventListener {
    public final /* synthetic */ C17485l yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12810l(Context context, C17485l c17485l) {
        super(context);
        this.yandex = c17485l;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0040  */
    /* JADX WARN: Code duplicated, block: B:41:0x004a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0054  */
    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        List listM4213const;
        if (i == -1) {
            return;
        }
        C17485l c17485l = this.yandex;
        if (c17485l.amazon == -1) {
            if (i < 0 || i >= 45) {
                if (45 <= i && i < 135) {
                    i2 = 3;
                } else if (135 <= i && i < 225) {
                    i2 = 2;
                } else if (225 <= i && i < 315) {
                    i2 = 1;
                }
            }
            i2 = 0;
        } else if ((i >= 0 && i < 40) || (320 <= i && i < 360)) {
            i2 = 0;
        } else if (50 <= i && i < 130) {
            i2 = 3;
        } else if (140 <= i && i < 220) {
            i2 = 2;
        } else if (230 > i || i >= 310) {
            i2 = c17485l.amazon;
        } else {
            i2 = 1;
        }
        C17485l c17485l2 = this.yandex;
        if (c17485l2.amazon != i2) {
            c17485l2.amazon = i2;
            synchronized (c17485l2.yandex) {
                listM4213const = AbstractC16901l.m4213const(c17485l2.crashlytics.values());
                Unit unit = Unit.INSTANCE;
            }
            Iterator it = listM4213const.iterator();
            while (it.hasNext()) {
                ((C5212l) it.next()).yandex(i2);
            }
        }
    }
}
