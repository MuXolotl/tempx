package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lٍؙؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9369l extends AbstractC9453l {
    public static final Parcelable.Creator<C9369l> CREATOR = new C18485l(12);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final String[] f19204l = {"UNKNOWN", "PHONE", "TABLET", "DISPLAY", "LAPTOP", "TV", "WATCH", "CHROMEOS", "FOLDABLE", "AUTOMOTIVE", "SPEAKER"};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f19205l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f19206l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f19207l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f19208l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f19209l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f19210l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f19211l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final String f19212l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f19213l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f19214l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C12884l f19215l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final List f19216l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f19217l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final byte[] f19218l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f19219l;

    public C9369l(long j, String str, int i, String str2, long j2, String str3, byte[] bArr, byte[] bArr2, ArrayList arrayList, int i2, byte[] bArr3, C12884l c12884l, int i3, int i4, String str4) {
        this.f19210l = j;
        this.f19209l = str;
        this.f19206l = i;
        this.f19214l = str2;
        this.f19213l = j2;
        this.f19217l = str3;
        this.f19207l = bArr;
        this.f19208l = bArr2;
        this.f19216l = arrayList;
        this.f19211l = i2;
        this.f19218l = bArr3;
        this.f19215l = c12884l;
        this.f19205l = i3;
        this.f19219l = i4;
        this.f19212l = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9369l) {
            C9369l c9369l = (C9369l) obj;
            if (AbstractC7236l.amazon(Long.valueOf(this.f19210l), Long.valueOf(c9369l.f19210l)) && AbstractC7236l.amazon(this.f19209l, c9369l.f19209l) && AbstractC7236l.amazon(Integer.valueOf(this.f19206l), Integer.valueOf(c9369l.f19206l)) && AbstractC7236l.amazon(this.f19214l, c9369l.f19214l) && AbstractC7236l.amazon(this.f19217l, c9369l.f19217l) && Arrays.equals(this.f19207l, c9369l.f19207l) && Arrays.equals(this.f19208l, c9369l.f19208l) && AbstractC7236l.amazon(this.f19216l, c9369l.f19216l) && AbstractC7236l.amazon(Integer.valueOf(this.f19211l), Integer.valueOf(c9369l.f19211l)) && Arrays.equals(this.f19218l, c9369l.f19218l) && AbstractC7236l.amazon(this.f19215l, c9369l.f19215l) && AbstractC7236l.amazon(Integer.valueOf(this.f19205l), Integer.valueOf(c9369l.f19205l)) && AbstractC7236l.amazon(Integer.valueOf(this.f19219l), Integer.valueOf(c9369l.f19219l)) && AbstractC7236l.amazon(this.f19212l, c9369l.f19212l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f19210l), this.f19209l, Integer.valueOf(this.f19206l), this.f19214l, this.f19217l, Integer.valueOf(Arrays.hashCode(this.f19207l)), Integer.valueOf(Arrays.hashCode(this.f19208l)), this.f19216l, Integer.valueOf(this.f19211l), Integer.valueOf(Arrays.hashCode(this.f19218l)), this.f19215l, Integer.valueOf(this.f19205l), Integer.valueOf(this.f19219l), this.f19212l});
    }

    public final String toString() {
        char c;
        String str;
        Long lValueOf = Long.valueOf(this.f19210l);
        switch (this.f19206l) {
            case 1:
                c = 1;
                break;
            case 2:
                c = 2;
                break;
            case 3:
                c = 3;
                break;
            case 4:
                c = 4;
                break;
            case 5:
                c = 5;
                break;
            case 6:
                c = 6;
                break;
            case 7:
                c = 7;
                break;
            case 8:
                c = '\b';
                break;
            case 9:
                c = '\t';
                break;
            case 10:
                c = '\n';
                break;
            default:
                c = 0;
                break;
        }
        String str2 = f19204l[c];
        Long lValueOf2 = Long.valueOf(this.f19213l);
        byte[] bArr = this.f19207l;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.f19208l;
        Integer numValueOf = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        Integer numValueOf2 = Integer.valueOf(this.f19211l);
        byte[] bArr3 = this.f19218l;
        String string2 = bArr3 != null ? Arrays.toString(bArr3) : null;
        Integer numValueOf3 = Integer.valueOf(this.f19205l);
        int i = this.f19219l;
        if (i == 0) {
            str = "UNKNOWN";
        } else if (i != 1) {
            str = i != 2 ? "OTHER" : "Secondary";
        } else {
            str = "Main";
        }
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s, dataElements: %s, discoveryMedium: %s, instance type %s>, Dusi: %s", lValueOf, this.f19209l, str2, this.f19214l, lValueOf2, this.f19217l, string, numValueOf, this.f19216l, numValueOf2, string2, this.f19215l, numValueOf3, str, this.f19212l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC8996l abstractC8996lRemoteconfig;
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 8);
        parcel.writeLong(this.f19210l);
        AbstractC9968l.vip(parcel, 2, this.f19209l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f19206l);
        AbstractC9968l.vip(parcel, 4, this.f19214l);
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeLong(this.f19213l);
        AbstractC9968l.vip(parcel, 6, this.f19217l);
        byte[] bArr = this.f19207l;
        AbstractC9968l.billing(parcel, 7, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f19208l;
        AbstractC9968l.billing(parcel, 8, bArr2 != null ? (byte[]) bArr2.clone() : null);
        Collection collection = this.f19216l;
        if (collection == null) {
            C7118l c7118l = AbstractC8996l.f18540l;
            abstractC8996lRemoteconfig = C6490l.f13541l;
        } else {
            C7118l c7118l2 = AbstractC8996l.f18540l;
            if (collection instanceof AbstractC4477l) {
                abstractC8996lRemoteconfig = (AbstractC8996l) ((AbstractC4477l) collection);
                if (abstractC8996lRemoteconfig.admob()) {
                    Object[] array = abstractC8996lRemoteconfig.toArray(AbstractC4477l.f9105l);
                    abstractC8996lRemoteconfig = AbstractC8996l.remoteconfig(array.length, array);
                }
            } else {
                Object[] array2 = collection.toArray();
                int length = array2.length;
                AbstractC2991l.startapp(length, array2);
                abstractC8996lRemoteconfig = AbstractC8996l.remoteconfig(length, array2);
            }
        }
        AbstractC9968l.ads(parcel, 9, abstractC8996lRemoteconfig);
        AbstractC9968l.subscription(parcel, 10, 4);
        parcel.writeInt(this.f19211l);
        AbstractC9968l.billing(parcel, 11, this.f19218l);
        AbstractC9968l.remoteconfig(parcel, 12, this.f19215l, i);
        AbstractC9968l.subscription(parcel, 13, 4);
        parcel.writeInt(this.f19205l);
        AbstractC9968l.subscription(parcel, 14, 4);
        parcel.writeInt(this.f19219l);
        AbstractC9968l.vip(parcel, 15, this.f19212l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
