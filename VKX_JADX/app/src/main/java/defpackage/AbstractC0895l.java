package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: lؙؒۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0895l implements IInterface {
    public final IBinder billing;
    public final String mopub;
    public final /* synthetic */ int purchase;

    public /* synthetic */ AbstractC0895l(IBinder iBinder, String str, int i) {
        this.purchase = i;
        this.billing = iBinder;
        this.mopub = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.purchase;
        return this.billing;
    }

    public Parcel crashlytics() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.mopub);
        return parcelObtain;
    }

    public void isPro(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.billing.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public void m741l(Parcel parcel, int i) {
        int i2 = this.purchase;
        IBinder iBinder = this.billing;
        switch (i2) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain.recycle();
                }
            case 2:
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain2.recycle();
                }
            case 3:
                Parcel parcelObtain3 = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain3, 0);
                    parcelObtain3.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain3.recycle();
                }
        }
    }

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public void m742l(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.billing.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public Parcel m743l() {
        int i = this.purchase;
        String str = this.mopub;
        switch (i) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(str);
                return parcelObtain;
            case 2:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(str);
                return parcelObtain2;
            case 3:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(str);
                return parcelObtain3;
            case 4:
                Parcel parcelObtain4 = Parcel.obtain();
                parcelObtain4.writeInterfaceToken(str);
                return parcelObtain4;
            default:
                Parcel parcelObtain5 = Parcel.obtain();
                parcelObtain5.writeInterfaceToken(str);
                return parcelObtain5;
        }
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public void m744l(Parcel parcel) {
        try {
            this.billing.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public Parcel m745l(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.billing.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public Parcel m746l(Parcel parcel, int i) {
        int i2 = this.purchase;
        IBinder iBinder = this.billing;
        switch (i2) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, parcelObtain, 0);
                        parcelObtain.readException();
                        parcel.recycle();
                        return parcelObtain;
                    } catch (Throwable th) {
                        parcel.recycle();
                        throw th;
                    }
                } catch (RuntimeException e) {
                    parcelObtain.recycle();
                    throw e;
                }
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcel.recycle();
                        return parcelObtain2;
                    } catch (Throwable th2) {
                        parcel.recycle();
                        throw th2;
                    }
                } catch (RuntimeException e2) {
                    parcelObtain2.recycle();
                    throw e2;
                }
        }
    }

    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public void m747l(Parcel parcel, int i) {
        try {
            this.billing.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public Parcel m748l(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.billing.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
