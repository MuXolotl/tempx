package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: lّۗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12798l extends AbstractC9453l {
    public static final Parcelable.Creator<C12798l> CREATOR = new C10538l(14);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public List f25180l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f25181l;

    public C12798l(int i, List list) {
        this.f25181l = i;
        this.f25180l = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f25181l);
        AbstractC9968l.ads(parcel, 2, this.f25180l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
