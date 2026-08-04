package defpackage;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lًٙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8081l {
    public static final C8081l amazon;
    public static final C8081l billing;
    public static final C8081l purchase;
    public final HashSet yandex;
    public static final C8081l loadAd = new C8081l(Collections.EMPTY_LIST);
    public static final C8081l crashlytics = new C8081l(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));

    static {
        new C8081l(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        amazon = new C8081l(Arrays.asList(ForegroundCarColorSpan.class));
        purchase = new C8081l(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        billing = new C8081l(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new C8081l(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new C8081l(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public C8081l(List list) {
        this.yandex = new HashSet(list);
    }

    public final void loadAd(CarText carText) {
        yandex(carText.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            yandex(it.next());
        }
    }

    public final void yandex(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.yandex.contains(cls)) {
                C8339l.metrica("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
                return;
            }
        }
    }
}
