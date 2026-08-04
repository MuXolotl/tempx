package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: lؔٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2608l extends AbstractC10093l {
    public final /* synthetic */ AbstractC4620l admob;
    public final IBinder mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2608l(AbstractC4620l abstractC4620l, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC4620l, i, bundle);
        this.admob = abstractC4620l;
        this.mopub = iBinder;
    }

    @Override // defpackage.AbstractC10093l
    public final void loadAd(C10602l c10602l) {
        AbstractC4620l abstractC4620l = this.admob;
        InterfaceC14795l interfaceC14795l = abstractC4620l.adcel;
        if (interfaceC14795l != null) {
            interfaceC14795l.crashlytics(c10602l);
        }
        abstractC4620l.license(c10602l);
    }

    @Override // defpackage.AbstractC10093l
    public final boolean yandex() {
        IBinder iBinder = this.mopub;
        try {
            AbstractC1051l.subs(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC4620l abstractC4620l = this.admob;
            String strStartapp = abstractC4620l.startapp();
            InterfaceC9710l interfaceC9710l = abstractC4620l.startapp;
            if (!strStartapp.equals(interfaceDescriptor)) {
                String strStartapp2 = abstractC4620l.startapp();
                Log.w("GmsClient", AbstractC9361l.advert(new StringBuilder(strStartapp2.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strStartapp2, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfacePurchase = abstractC4620l.purchase(iBinder);
            if (iInterfacePurchase == null || !(abstractC4620l.signatures(2, 4, iInterfacePurchase) || abstractC4620l.signatures(3, 4, iInterfacePurchase))) {
                return false;
            }
            abstractC4620l.license = null;
            Bundle bundleFirebase = abstractC4620l.firebase();
            if (interfaceC9710l == null) {
                return true;
            }
            interfaceC9710l.firebase(bundleFirebase);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
