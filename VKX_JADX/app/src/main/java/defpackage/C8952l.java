package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: lٌٞۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8952l extends AbstractC0895l implements InterfaceC11939l {
    public C8952l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 5);
    }

    @Override // defpackage.InterfaceC11939l
    public final void ads(String str, String str2, Bundle bundle, long j) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        AbstractC15425l.loadAd(parcelM743l, bundle);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 1);
    }

    @Override // defpackage.InterfaceC11939l
    public final int amazon() {
        Parcel parcelM745l = m745l(m743l(), 2);
        int i = parcelM745l.readInt();
        parcelM745l.recycle();
        return i;
    }
}
