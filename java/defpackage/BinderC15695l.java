package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lٌٕٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC15695l extends AbstractBinderC4213l {
    public final Object billing;
    public final /* synthetic */ int purchase = 0;

    public BinderC15695l(C2350l c2350l) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.billing = c2350l;
    }

    @Override // defpackage.AbstractBinderC4213l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        switch (this.purchase) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                AbstractC15425l.amazon(parcel);
                C2350l c2350l = (C2350l) this.billing;
                if (status.billing()) {
                    try {
                        C11337l c11337l = C11337l.yandex;
                        int i2 = AbstractC5004l.yandex;
                        AbstractC11718l.billing(status, C0701l.license(bArrCreateByteArray, C11337l.loadAd), c2350l);
                    } catch (C9893l e) {
                        c2350l.yandex(e);
                    }
                } else {
                    AbstractC11718l.billing(status, null, c2350l);
                }
                return true;
            case 1:
                C2350l c2350l2 = (C2350l) this.billing;
                switch (i) {
                    case 1:
                        Status status2 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status2, null, c2350l2);
                        break;
                    case 2:
                        Status status3 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status3, null, c2350l2);
                        break;
                    case 3:
                        Status status4 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status4, null, c2350l2);
                        break;
                    case 4:
                        Status status5 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        C16346l c16346l = (C16346l) AbstractC15425l.yandex(parcel, C16346l.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status5, c16346l, c2350l2);
                        break;
                    case 5:
                        Status status6 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status6, null, c2350l2);
                        break;
                    case 6:
                        Status status7 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        C5824l c5824l = (C5824l) AbstractC15425l.yandex(parcel, C5824l.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status7, c5824l, c2350l2);
                        break;
                    case 7:
                        Status status8 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        C4080l c4080l = (C4080l) AbstractC15425l.yandex(parcel, C4080l.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status8, c4080l, c2350l2);
                        break;
                    case 8:
                        Status status9 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status9, null, c2350l2);
                        break;
                    case 9:
                        Status status10 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        C4153l c4153l = (C4153l) AbstractC15425l.yandex(parcel, C4153l.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status10, c4153l, c2350l2);
                        break;
                    case 10:
                        Status status11 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        C16346l c16346l2 = (C16346l) AbstractC15425l.yandex(parcel, C16346l.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status11, c16346l2, c2350l2);
                        break;
                    case 11:
                        Status status12 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        parcel.readLong();
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status12, null, c2350l2);
                        break;
                    case 12:
                        Status status13 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status13, null, c2350l2);
                        break;
                    case 13:
                        Status status14 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        C4668l c4668l = (C4668l) AbstractC15425l.yandex(parcel, C4668l.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status14, c4668l, c2350l2);
                        break;
                    case 14:
                        Status status15 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status15, null, c2350l2);
                        break;
                    case 15:
                        Status status16 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status16, null, c2350l2);
                        break;
                    case 16:
                        Status status17 = (Status) AbstractC15425l.yandex(parcel, Status.CREATOR);
                        long j = parcel.readLong();
                        AbstractC15425l.amazon(parcel);
                        AbstractC11718l.billing(status17, Long.valueOf(j), c2350l2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                AbstractC15425l.amazon(parcel);
                ((C18096l) this.billing).yandex(new C16948l(this, bArrCreateByteArray2));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC15695l(C1539l c1539l, C18096l c18096l) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.billing = c18096l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC15695l(C1539l c1539l, C2350l c2350l) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.billing = c2350l;
    }
}
