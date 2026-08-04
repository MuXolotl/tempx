package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lْٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14125l extends AbstractC9453l {
    public static final Parcelable.Creator<C14125l> CREATOR = new C13546l(19);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public List f27620l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f27621l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f27622l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public double f27623l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f27624l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14125l)) {
            return false;
        }
        C14125l c14125l = (C14125l) obj;
        return this.f27622l == c14125l.f27622l && TextUtils.equals(this.f27621l, c14125l.f27621l) && AbstractC7236l.amazon(this.f27620l, c14125l.f27620l) && AbstractC7236l.amazon(this.f27624l, c14125l.f27624l) && this.f27623l == c14125l.f27623l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27622l), this.f27621l, this.f27620l, this.f27624l, Double.valueOf(this.f27623l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = this.f27622l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC9968l.vip(parcel, 3, this.f27621l);
        List list = this.f27620l;
        AbstractC9968l.ads(parcel, 4, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.f27624l;
        AbstractC9968l.ads(parcel, 5, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        double d = this.f27623l;
        AbstractC9968l.subscription(parcel, 6, 8);
        parcel.writeDouble(d);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
