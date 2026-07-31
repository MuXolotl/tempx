package androidx.car.app.model;

import android.os.Binder;
import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class crashlytics implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f299l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Binder f300l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f301l;

    public /* synthetic */ crashlytics(Binder binder, String str, int i) {
        this.f301l = i;
        this.f300l = binder;
        this.f299l = str;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f301l;
        String str = this.f299l;
        Binder binder = this.f300l;
        switch (i) {
            case 0:
                return ((InputCallbackDelegateImpl.OnInputCallbackStub) binder).lambda$onInputTextChanged$1(str);
            case 1:
                return ((InputCallbackDelegateImpl.OnInputCallbackStub) binder).lambda$onInputSubmitted$0(str);
            default:
                return ((TabCallbackDelegateImpl.TabCallbackStub) binder).lambda$onTabSelected$0(str);
        }
    }
}
