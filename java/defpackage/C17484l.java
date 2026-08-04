package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lُٗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17484l extends AbstractC9453l {
    public static final Parcelable.Creator<C17484l> CREATOR = new C18485l(1);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public String f34054l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f34055l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ParcelFileDescriptor f34056l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Uri f34057l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f34058l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f34059l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f34060l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f34061l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public ParcelFileDescriptor f34062l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public long f34063l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f34064l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f34065l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C16917l f34066l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public String f34067l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17484l) {
            C17484l c17484l = (C17484l) obj;
            if (AbstractC7236l.amazon(Long.valueOf(this.f34059l), Long.valueOf(c17484l.f34059l)) && AbstractC7236l.amazon(Integer.valueOf(this.f34058l), Integer.valueOf(c17484l.f34058l)) && Arrays.equals(this.f34055l, c17484l.f34055l) && AbstractC7236l.amazon(this.f34062l, c17484l.f34062l) && AbstractC7236l.amazon(this.f34061l, c17484l.f34061l) && AbstractC7236l.amazon(Long.valueOf(this.f34065l), Long.valueOf(c17484l.f34065l)) && AbstractC7236l.amazon(this.f34056l, c17484l.f34056l) && AbstractC7236l.amazon(this.f34057l, c17484l.f34057l) && AbstractC7236l.amazon(Long.valueOf(this.f34064l), Long.valueOf(c17484l.f34064l)) && AbstractC7236l.amazon(Boolean.valueOf(this.f34060l), Boolean.valueOf(c17484l.f34060l)) && AbstractC7236l.amazon(this.f34066l, c17484l.f34066l) && AbstractC7236l.amazon(Long.valueOf(this.f34063l), Long.valueOf(c17484l.f34063l)) && AbstractC7236l.amazon(this.f34054l, c17484l.f34054l) && AbstractC7236l.amazon(this.f34067l, c17484l.f34067l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f34059l), Integer.valueOf(this.f34058l), Integer.valueOf(Arrays.hashCode(this.f34055l)), this.f34062l, this.f34061l, Long.valueOf(this.f34065l), this.f34056l, this.f34057l, Long.valueOf(this.f34064l), Boolean.valueOf(this.f34060l), this.f34066l, Long.valueOf(this.f34063l), this.f34054l, this.f34067l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        long j = this.f34059l;
        AbstractC9968l.subscription(parcel, 1, 8);
        parcel.writeLong(j);
        int i2 = this.f34058l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC9968l.billing(parcel, 3, this.f34055l);
        AbstractC9968l.remoteconfig(parcel, 4, this.f34062l, i);
        AbstractC9968l.vip(parcel, 5, this.f34061l);
        long j2 = this.f34065l;
        AbstractC9968l.subscription(parcel, 6, 8);
        parcel.writeLong(j2);
        AbstractC9968l.remoteconfig(parcel, 7, this.f34056l, i);
        AbstractC9968l.remoteconfig(parcel, 8, this.f34057l, i);
        long j3 = this.f34064l;
        AbstractC9968l.subscription(parcel, 9, 8);
        parcel.writeLong(j3);
        boolean z = this.f34060l;
        AbstractC9968l.subscription(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC9968l.remoteconfig(parcel, 11, this.f34066l, i);
        long j4 = this.f34063l;
        AbstractC9968l.subscription(parcel, 12, 8);
        parcel.writeLong(j4);
        AbstractC9968l.vip(parcel, 13, this.f34054l);
        AbstractC9968l.vip(parcel, 14, this.f34067l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
