package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lّٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14151l extends AbstractC9453l {
    public static final Parcelable.Creator<C14151l> CREATOR = new C5422l(15);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f27666l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f27667l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f27668l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f27669l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f27670l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C9369l f27671l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f27672l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f27673l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f27674l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f27675l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f27676l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C8495l f27677l;

    public C14151l(String str, String str2, String str3, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2, int i, C9369l c9369l, C8495l c8495l, int i2) {
        this.f27670l = str;
        this.f27669l = str2;
        this.f27666l = str3;
        this.f27673l = z;
        this.f27672l = bArr;
        this.f27676l = bArr2;
        this.f27667l = bArr3;
        this.f27668l = z2;
        this.f27675l = i;
        this.f27671l = c9369l;
        this.f27677l = c8495l;
        this.f27674l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14151l) {
            C14151l c14151l = (C14151l) obj;
            if (AbstractC7236l.amazon(this.f27670l, c14151l.f27670l) && AbstractC7236l.amazon(this.f27669l, c14151l.f27669l) && AbstractC7236l.amazon(this.f27666l, c14151l.f27666l) && AbstractC7236l.amazon(Boolean.valueOf(this.f27673l), Boolean.valueOf(c14151l.f27673l)) && Arrays.equals(this.f27672l, c14151l.f27672l) && Arrays.equals(this.f27676l, c14151l.f27676l) && Arrays.equals(this.f27667l, c14151l.f27667l) && AbstractC7236l.amazon(Boolean.valueOf(this.f27668l), Boolean.valueOf(c14151l.f27668l)) && AbstractC7236l.amazon(Integer.valueOf(this.f27675l), Integer.valueOf(c14151l.f27675l)) && AbstractC7236l.amazon(this.f27671l, c14151l.f27671l) && AbstractC7236l.amazon(this.f27677l, c14151l.f27677l) && AbstractC7236l.amazon(Integer.valueOf(this.f27674l), Integer.valueOf(c14151l.f27674l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27670l, this.f27669l, this.f27666l, Boolean.valueOf(this.f27673l), Integer.valueOf(Arrays.hashCode(this.f27672l)), Integer.valueOf(Arrays.hashCode(this.f27676l)), Integer.valueOf(Arrays.hashCode(this.f27667l)), Boolean.valueOf(this.f27668l), Integer.valueOf(this.f27675l), this.f27671l, this.f27677l, Integer.valueOf(this.f27674l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f27670l);
        AbstractC9968l.vip(parcel, 2, this.f27669l);
        AbstractC9968l.vip(parcel, 3, this.f27666l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f27673l ? 1 : 0);
        AbstractC9968l.billing(parcel, 5, this.f27672l);
        AbstractC9968l.billing(parcel, 6, this.f27676l);
        AbstractC9968l.billing(parcel, 7, this.f27667l);
        AbstractC9968l.subscription(parcel, 8, 4);
        parcel.writeInt(this.f27668l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 9, 4);
        parcel.writeInt(this.f27675l);
        AbstractC9968l.remoteconfig(parcel, 10, this.f27671l, i);
        AbstractC9968l.remoteconfig(parcel, 11, this.f27677l, i);
        AbstractC9968l.subscription(parcel, 12, 4);
        parcel.writeInt(this.f27674l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
