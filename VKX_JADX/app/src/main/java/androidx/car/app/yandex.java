package androidx.car.app;

import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yandex implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ subs f336l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f337l;

    public /* synthetic */ yandex(subs subsVar, int i) {
        this.f337l = i;
        this.f336l = subsVar;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f337l;
        subs subsVar = this.f336l;
        switch (i) {
            case 0:
                return AppManager$1.lambda$onBackPressed$0(subsVar);
            case 1:
                return AppManager$1.lambda$stopLocationUpdates$2(subsVar);
            default:
                return AppManager$1.lambda$startLocationUpdates$1(subsVar);
        }
    }
}
