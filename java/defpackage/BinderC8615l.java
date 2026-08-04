package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٌؙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC8615l extends AbstractBinderC4213l implements InterfaceC14655l {
    public final /* synthetic */ C11860l billing;
    public final /* synthetic */ AtomicReference purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC8615l(C11860l c11860l, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.purchase = atomicReference;
        this.billing = c11860l;
    }

    @Override // defpackage.AbstractBinderC4213l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        C18090l c18090l = (C18090l) AbstractC15425l.yandex(parcel, C18090l.CREATOR);
        AbstractC15425l.amazon(parcel);
        mo2274l(c18090l);
        return true;
    }

    @Override // defpackage.InterfaceC14655l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo2274l(C18090l c18090l) {
        AtomicReference atomicReference = this.purchase;
        synchronized (atomicReference) {
            C8118l c8118l = ((C17417l) this.billing.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.loadAd(Integer.valueOf(c18090l.f35375l.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(c18090l);
            atomicReference.notifyAll();
        }
    }
}
