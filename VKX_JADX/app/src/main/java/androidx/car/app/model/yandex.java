package androidx.car.app.model;

import android.os.Binder;
import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yandex implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Binder f308l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f309l;

    public /* synthetic */ yandex(Binder binder, int i) {
        this.f309l = i;
        this.f308l = binder;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f309l;
        Binder binder = this.f308l;
        switch (i) {
            case 0:
                return ((AlertCallbackDelegateImpl.AlertCallbackStub) binder).lambda$onAlertDismissed$1();
            case 1:
                return ((OnClickDelegateImpl.OnClickListenerStub) binder).lambda$onClick$0();
            default:
                return ((OnContentRefreshDelegateImpl.OnContentRefreshListenerStub) binder).lambda$onContentRefreshRequested$0();
        }
    }
}
