package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;

/* JADX INFO: renamed from: lِٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11563l implements InterfaceC9708l {
    public final ArrayList loadAd;
    public int yandex;

    public AbstractC11563l(int i, int i2) {
        this.yandex = (i2 & 1) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : i;
        this.loadAd = new ArrayList();
    }

    public final String amazon() {
        return AbstractC1833l.subs(AbstractC16901l.m4210case(this.loadAd, ",\n", null, null, null, 62), "  ");
    }
}
