package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: lۦؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC18697l extends AbstractBinderC4213l implements InterfaceC11939l {
    public final C13730l purchase;

    public BinderC18697l(C13730l c13730l) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.purchase = c13730l;
    }

    @Override // defpackage.InterfaceC11939l
    public final void ads(String str, String str2, Bundle bundle, long j) {
        this.purchase.yandex(str, str2, bundle, j);
    }

    @Override // defpackage.InterfaceC11939l
    public final int amazon() {
        return System.identityHashCode(this.purchase);
    }

    @Override // defpackage.AbstractBinderC4213l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.purchase);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        AbstractC15425l.amazon(parcel);
        ads(string, string2, bundle, j);
        parcel2.writeNoException();
        return true;
    }
}
