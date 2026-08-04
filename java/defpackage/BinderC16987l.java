package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: lًٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC16987l extends Binder implements InterfaceC6779l {
    public final /* synthetic */ C12158l purchase;

    public BinderC16987l(C12158l c12158l) {
        this.purchase = c12158l;
        attachInterface(this, InterfaceC6779l.yandex);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC6779l.yandex;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        pro(parcel.createStringArray());
        return true;
    }

    @Override // defpackage.InterfaceC6779l
    public final void pro(String[] strArr) {
        C12158l c12158l = this.purchase;
        AbstractC10999l.mopub((InterfaceC2262l) c12158l.billing, null, 0, new C17949l(strArr, c12158l, null, 0), 3);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
