package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: lًؚٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7851l extends AbstractC9453l {
    public static final Parcelable.Creator<C7851l> CREATOR = new C15160l(4);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f16375l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f16376l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f16377l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f16378l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f16379l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f16380l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f16381l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f16382l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f16383l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f16384l;

    public C7851l(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3, boolean z4) {
        this.f16379l = i;
        this.f16378l = z;
        this.f16375l = z2;
        this.f16382l = str;
        this.f16381l = str2;
        this.f16384l = str3;
        this.f16376l = str4;
        this.f16377l = str5;
        this.f16383l = z3;
        this.f16380l = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7851l)) {
            return false;
        }
        C7851l c7851l = (C7851l) obj;
        return this.f16379l == c7851l.f16379l && this.f16378l == c7851l.f16378l && this.f16375l == c7851l.f16375l && TextUtils.equals(this.f16382l, c7851l.f16382l) && TextUtils.equals(this.f16381l, c7851l.f16381l) && TextUtils.equals(this.f16384l, c7851l.f16384l) && TextUtils.equals(this.f16376l, c7851l.f16376l) && TextUtils.equals(this.f16377l, c7851l.f16377l) && this.f16383l == c7851l.f16383l && this.f16380l == c7851l.f16380l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16379l), Boolean.valueOf(this.f16378l), Boolean.valueOf(this.f16375l), this.f16382l, this.f16381l, this.f16384l, this.f16376l, this.f16377l, Boolean.valueOf(this.f16383l), Boolean.valueOf(this.f16380l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f16379l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f16378l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f16375l ? 1 : 0);
        AbstractC9968l.vip(parcel, 5, this.f16382l);
        AbstractC9968l.vip(parcel, 6, this.f16381l);
        AbstractC9968l.vip(parcel, 7, this.f16384l);
        AbstractC9968l.vip(parcel, 8, this.f16376l);
        AbstractC9968l.vip(parcel, 9, this.f16377l);
        AbstractC9968l.subscription(parcel, 10, 4);
        parcel.writeInt(this.f16383l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 11, 4);
        parcel.writeInt(this.f16380l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
