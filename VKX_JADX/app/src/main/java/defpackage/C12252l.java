package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;

/* JADX INFO: renamed from: lِۦۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12252l {
    public static final C8662l amazon;
    public static final C8662l purchase;
    public int crashlytics;
    public final ArrayList yandex = new ArrayList();
    public int loadAd = 0;

    static {
        C15053l c15053l = new C15053l(new C4256l(':', 0));
        C16219l c16219l = C16219l.f31752l;
        amazon = new C8662l(c15053l, false, (AbstractC8791l) c16219l, Alert.DURATION_SHOW_INDEFINITELY);
        purchase = new C8662l(new C15053l(new C4256l('*', 0)), false, (AbstractC8791l) c16219l, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
