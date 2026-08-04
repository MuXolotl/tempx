package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lًٟۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC8187l extends AbstractBinderC5395l implements IInterface {
    public final /* synthetic */ int billing;
    public final /* synthetic */ C2350l mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC8187l(C7560l c7560l, C2350l c2350l, int i) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 1);
        this.billing = i;
        this.mopub = c2350l;
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lْؕ۠ */
    public final boolean mo1774l(int i, Parcel parcel, Parcel parcel2) {
        C2350l c2350l = this.mopub;
        int i2 = this.billing;
        if (i == 1) {
            Status status = (Status) AbstractC1763l.yandex(parcel, Status.CREATOR);
            C5156l c5156l = (C5156l) AbstractC1763l.yandex(parcel, C5156l.CREATOR);
            AbstractC1763l.crashlytics(parcel);
            switch (i2) {
                case 0:
                    AbstractC11718l.admob(status, c5156l, c2350l);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 2) {
            Status status2 = (Status) AbstractC1763l.yandex(parcel, Status.CREATOR);
            C0925l c0925l = (C0925l) AbstractC1763l.yandex(parcel, C0925l.CREATOR);
            AbstractC1763l.crashlytics(parcel);
            switch (i2) {
                case 1:
                    AbstractC11718l.admob(status2, c0925l, c2350l);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 3) {
            AbstractC1763l.crashlytics(parcel);
            C3010l.mopub();
            return false;
        }
        if (i != 4) {
            return false;
        }
        AbstractC1763l.crashlytics(parcel);
        C3010l.mopub();
        return false;
    }
}
