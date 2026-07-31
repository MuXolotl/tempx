package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lَّؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4031l extends AbstractC9453l {
    public static final Parcelable.Creator<C4031l> CREATOR = new C5422l(21);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C8495l f8310l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f8311l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f8312l;

    public C4031l(String str, int i, C8495l c8495l) {
        this.f8312l = str;
        this.f8311l = i;
        this.f8310l = c8495l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4031l) {
            C4031l c4031l = (C4031l) obj;
            if (AbstractC7236l.amazon(this.f8312l, c4031l.f8312l) && AbstractC7236l.amazon(Integer.valueOf(this.f8311l), Integer.valueOf(c4031l.f8311l)) && AbstractC7236l.amazon(this.f8310l, c4031l.f8310l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8312l, Integer.valueOf(this.f8311l), this.f8310l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f8312l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f8311l);
        AbstractC9968l.remoteconfig(parcel, 3, this.f8310l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
