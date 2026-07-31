package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Parcelable;
import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class crashlytics implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Parcelable f288l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CarAppBinder f289l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f290l;

    public /* synthetic */ crashlytics(CarAppBinder carAppBinder, Parcelable parcelable, int i) {
        this.f290l = i;
        this.f289l = carAppBinder;
        this.f288l = parcelable;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f290l;
        Parcelable parcelable = this.f288l;
        CarAppBinder carAppBinder = this.f289l;
        switch (i) {
            case 0:
                return carAppBinder.lambda$onConfigurationChanged$6((Configuration) parcelable);
            default:
                return carAppBinder.lambda$onNewIntent$5((Intent) parcelable);
        }
    }
}
