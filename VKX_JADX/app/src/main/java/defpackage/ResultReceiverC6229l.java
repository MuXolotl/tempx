package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lؙؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ResultReceiverC6229l extends ResultReceiver {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final WeakReference f13159l;

    public ResultReceiverC6229l(C10730l c10730l) {
        super(null);
        this.f13159l = new WeakReference(c10730l);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InterfaceC10867l interfaceC10867l;
        C10730l c10730l = (C10730l) this.f13159l.get();
        if (c10730l == null || bundle == null) {
            return;
        }
        synchronized (c10730l.loadAd) {
            C5057l c5057l = c10730l.purchase;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = BinderC2430l.billing;
            if (binder == null) {
                interfaceC10867l = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC10867l)) {
                    C10979l c10979l = new C10979l();
                    c10979l.purchase = binder;
                    interfaceC10867l = c10979l;
                } else {
                    interfaceC10867l = (InterfaceC10867l) iInterfaceQueryLocalInterface;
                }
            }
            c5057l.loadAd(interfaceC10867l);
            c10730l.purchase.crashlytics(AbstractC11621l.billing(bundle));
            c10730l.loadAd();
        }
    }
}
