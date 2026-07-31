package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.billing;
import defpackage.AbstractC6475l;
import defpackage.AbstractC9859l;
import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
class NavigationManager$1 extends INavigationManager.Stub {
    final /* synthetic */ loadAd this$0;
    final /* synthetic */ AbstractC6475l val$lifecycle;

    public NavigationManager$1(loadAd loadad, AbstractC6475l abstractC6475l) {
        this.this$0 = loadad;
        this.val$lifecycle = abstractC6475l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onStopNavigation$0() {
        this.this$0.getClass();
        AbstractC9859l.yandex();
        return null;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        billing.loadAd(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new InterfaceC11652l() { // from class: androidx.car.app.navigation.yandex
            @Override // defpackage.InterfaceC11652l
            public final Object yandex() {
                return this.f313l.lambda$onStopNavigation$0();
            }
        });
    }
}
