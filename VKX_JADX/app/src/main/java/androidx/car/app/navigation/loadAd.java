package androidx.car.app.navigation;

import androidx.car.app.isPro;
import androidx.car.app.subs;
import defpackage.C4088l;
import defpackage.C5268l;
import defpackage.InterfaceC10744l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class loadAd implements InterfaceC10744l {
    public final INavigationManager.Stub yandex;

    public loadAd(subs subsVar, isPro ispro, C5268l c5268l) {
        this.yandex = new NavigationManager$1(this, c5268l);
        c5268l.yandex(new C4088l(this, c5268l));
    }
}
