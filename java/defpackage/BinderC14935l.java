package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: renamed from: lٔٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC14935l extends AbstractBinderC5395l {
    public AbstractC4620l billing;
    public final int mopub;

    public BinderC14935l(AbstractC4620l abstractC4620l, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 3);
        this.billing = abstractC4620l;
        this.mopub = i;
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lٕؓۡ */
    public final boolean mo1129l(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC2020l.yandex(parcel, Bundle.CREATOR);
            AbstractC2020l.crashlytics(parcel);
            AbstractC1051l.isPro(this.billing, "onPostInitComplete can be called only once per call to getRemoteService");
            this.billing.ad(i2, strongBinder, bundle, this.mopub);
            this.billing = null;
        } else if (i == 2) {
            parcel.readInt();
            AbstractC2020l.crashlytics(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            C3801l c3801l = (C3801l) AbstractC2020l.yandex(parcel, C3801l.CREATOR);
            AbstractC2020l.crashlytics(parcel);
            AbstractC4620l abstractC4620l = this.billing;
            AbstractC1051l.isPro(abstractC4620l, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC1051l.subs(c3801l);
            abstractC4620l.ad = c3801l;
            if (abstractC4620l.advert()) {
                C16526l c16526l = c3801l.f7917l;
                C15053l c15053lVip = C15053l.vip();
                C11361l c11361l = c16526l == null ? null : c16526l.f32298l;
                synchronized (c15053lVip) {
                    try {
                        if (c11361l == null) {
                            c11361l = C15053l.f29572l;
                        } else {
                            C11361l c11361l2 = (C11361l) c15053lVip.f29576l;
                            if (c11361l2 == null || c11361l2.f22909l < c11361l.f22909l) {
                            }
                        }
                        c15053lVip.f29576l = c11361l;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = c3801l.f7916l;
            AbstractC1051l.isPro(this.billing, "onPostInitComplete can be called only once per call to getRemoteService");
            this.billing.ad(i3, strongBinder2, bundle2, this.mopub);
            this.billing = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
