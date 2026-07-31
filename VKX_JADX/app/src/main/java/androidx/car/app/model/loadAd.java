package androidx.car.app.model;

import android.os.Binder;
import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class loadAd implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Binder f302l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f303l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f304l;

    public /* synthetic */ loadAd(Binder binder, int i, int i2) {
        this.f304l = i2;
        this.f302l = binder;
        this.f303l = i;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f304l;
        int i2 = this.f303l;
        Binder binder = this.f302l;
        switch (i) {
            case 0:
                return ((AlertCallbackDelegateImpl.AlertCallbackStub) binder).lambda$onAlertCancelled$0(i2);
            default:
                return ((OnSelectedDelegateImpl.OnSelectedListenerStub) binder).lambda$onSelected$0(i2);
        }
    }
}
