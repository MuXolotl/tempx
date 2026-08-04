package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٖؒؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1079l extends AbstractBinderC4213l implements InterfaceC6989l {
    public boolean billing;
    public final AtomicReference purchase;

    public BinderC1079l() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.purchase = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m784l(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L2a
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = defpackage.AbstractC14814l.adcel(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L2a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BinderC1079l.m784l(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // defpackage.AbstractBinderC4213l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
        AbstractC15425l.amazon(parcel);
        mo785return(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle isPro(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.purchase;
        synchronized (atomicReference) {
            if (!this.billing) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.purchase.get();
        }
        return bundle;
    }

    @Override // defpackage.InterfaceC6989l
    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final void mo785return(Bundle bundle) {
        AtomicReference atomicReference = this.purchase;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.billing = true;
                    this.purchase.notify();
                } catch (Throwable th) {
                    this.purchase.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
