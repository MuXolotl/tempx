package defpackage;

import android.os.Parcel;

/* JADX INFO: renamed from: lؗۨۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5326l extends AbstractBinderC4213l implements InterfaceC12695l {
    public final /* synthetic */ RunnableC16301l purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5326l(C2454l c2454l, RunnableC16301l runnableC16301l) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.purchase = runnableC16301l;
    }

    @Override // defpackage.InterfaceC12695l
    public final void billing() {
        this.purchase.run();
    }

    @Override // defpackage.AbstractBinderC4213l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        billing();
        return true;
    }
}
