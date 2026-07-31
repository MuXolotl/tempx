package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;

/* JADX INFO: renamed from: lؚۥۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC7645l extends AbstractBinderC5395l implements IInterface {
    public final /* synthetic */ C2350l billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC7645l(C7560l c7560l, C2350l c2350l) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks", 2);
        this.billing = c2350l;
        Objects.requireNonNull(c7560l);
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lٕؓۡ */
    public final boolean mo1129l(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) AbstractC14627l.yandex(parcel, Status.CREATOR);
                C16903l c16903l = (C16903l) AbstractC14627l.yandex(parcel, C16903l.CREATOR);
                AbstractC14627l.amazon(parcel);
                C5649l c5649l = new C5649l(c16903l);
                C0502l c0502l = new C0502l();
                c0502l.yandex = c5649l;
                AbstractC11718l.billing(status, c0502l, this.billing);
                return true;
            case 3:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            case 4:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            case 5:
                AbstractC14627l.amazon(parcel);
                throw new IllegalStateException("Not implemented.");
            case 6:
                parcel.createStringArrayList();
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            case 7:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            case 8:
                parcel.readInt();
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            case 9:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented");
                return false;
            case 10:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented");
                return false;
            case 11:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            case 12:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            case 13:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            case 14:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            case 15:
                AbstractC14627l.amazon(parcel);
                C8339l.smaato("Not implemented.");
                return false;
            default:
                return false;
        }
    }
}
