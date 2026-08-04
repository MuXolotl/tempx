package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lٕۥؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16041l extends AbstractC9453l {
    public static final Parcelable.Creator<C16041l> CREATOR;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f31430l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f31431l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f31432l;

    static {
        new C16041l(null, false, false);
        CREATOR = new C5422l(11);
    }

    public C16041l(ArrayList arrayList, boolean z, boolean z2) {
        this.f31432l = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
        this.f31431l = z;
        this.f31430l = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16041l)) {
            return false;
        }
        C16041l c16041l = (C16041l) obj;
        return AbstractC7236l.amazon(this.f31432l, c16041l.f31432l) && AbstractC7236l.amazon(Boolean.valueOf(this.f31431l), Boolean.valueOf(c16041l.f31431l));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31432l, Boolean.valueOf(this.f31431l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.ads(parcel, 1, new ArrayList(this.f31432l));
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f31431l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f31430l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
