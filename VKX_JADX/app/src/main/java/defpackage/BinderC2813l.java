package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٟؔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2813l extends AbstractBinderC4213l implements InterfaceC4992l {
    public final /* synthetic */ AtomicReference purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2813l(C11860l c11860l, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.purchase = atomicReference;
    }

    @Override // defpackage.AbstractBinderC4213l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C11536l.CREATOR);
        AbstractC15425l.amazon(parcel);
        mo1264l(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // defpackage.InterfaceC4992l
    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final void mo1264l(List list) {
        AtomicReference atomicReference = this.purchase;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
