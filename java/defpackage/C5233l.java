package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lؗۢۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5233l {
    public CarText crashlytics;
    public Action loadAd;
    public final ArrayList yandex = new ArrayList();

    public final void loadAd(Action action) {
        C9310l c9310l = C9310l.smaato;
        Objects.requireNonNull(action);
        c9310l.yandex(Collections.singletonList(action));
        this.loadAd = action;
    }

    public final Header yandex() {
        if (!CarText.isNullOrEmpty(this.crashlytics) || this.loadAd != null) {
            return new Header(this);
        }
        C8339l.smaato("Either the title or start header action must be set");
        return null;
    }
}
