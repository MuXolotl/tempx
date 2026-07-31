package androidx.car.app;

import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class amazon implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CarAppBinder f283l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f284l;

    public /* synthetic */ amazon(CarAppBinder carAppBinder, int i) {
        this.f284l = i;
        this.f283l = carAppBinder;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f284l;
        CarAppBinder carAppBinder = this.f283l;
        switch (i) {
            case 0:
                return carAppBinder.lambda$onAppPause$3();
            case 1:
                return carAppBinder.lambda$onAppStart$1();
            case 2:
                return carAppBinder.lambda$onAppStop$4();
            default:
                return carAppBinder.lambda$onAppResume$2();
        }
    }
}
