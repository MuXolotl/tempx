package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؘ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17915l extends AbstractC1679l {
    public final Object crashlytics;
    public final /* synthetic */ int loadAd = 1;

    public C17915l(Paint[] paintArr) {
        super(null);
        this.crashlytics = AbstractC14055l.remoteconfig((Paint[]) Arrays.copyOf(paintArr, paintArr.length));
    }

    public final void billing(Object obj) {
        int i = this.loadAd;
        Object obj2 = this.crashlytics;
        switch (i) {
            case 0:
                Float f = (Float) obj;
                if (!((Float) this.yandex).equals(f)) {
                    this.yandex = f;
                    ((C16582l) obj2).invoke(f);
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                if (!((Integer) this.yandex).equals(num)) {
                    this.yandex = num;
                    ((C16582l) obj2).invoke(num);
                }
                break;
            default:
                ColorFilter colorFilter = (ColorFilter) obj;
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    ((Paint) it.next()).setColorFilter(colorFilter);
                }
                this.yandex = colorFilter;
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17915l(C16582l c16582l, byte b) {
        Float fValueOf = Float.valueOf(0.0f);
        super(fValueOf);
        this.crashlytics = c16582l;
        c16582l.invoke(fValueOf);
    }

    public C17915l(C16582l c16582l) {
        super(255);
        this.crashlytics = c16582l;
        c16582l.invoke(255);
    }
}
