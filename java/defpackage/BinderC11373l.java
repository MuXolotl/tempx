package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: lُ۟۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC11373l extends Binder {
    public final AbstractC1186l purchase;

    public BinderC11373l(List list) {
        this.purchase = AbstractC1186l.Signature(list);
    }

    public static AbstractC1186l yandex(IBinder iBinder) {
        int i;
        if (iBinder instanceof BinderC11373l) {
            return ((BinderC11373l) iBinder).purchase;
        }
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            c16971lMetrica.crashlytics(bundle);
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return c16971lMetrica.mopub();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        AbstractC1186l abstractC1186l = this.purchase;
        int size = abstractC1186l.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < AbstractC17252l.yandex) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) abstractC1186l.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
