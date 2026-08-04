package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lّ۟ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12884l extends AbstractC9453l {
    public static final Parcelable.Creator<C12884l> CREATOR = new C18485l(6);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f25326l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final List f25327l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C13084l f25328l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8332l f25329l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0906l f25330l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final List f25331l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f25332l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C17459l f25333l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final List f25334l;

    public C12884l(C0906l c0906l, C8332l c8332l, byte[] bArr, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C13084l c13084l, C17459l c17459l) {
        this.f25330l = c0906l;
        this.f25329l = c8332l;
        this.f25326l = bArr;
        this.f25332l = z;
        this.f25331l = arrayList;
        this.f25334l = arrayList2;
        this.f25327l = arrayList3;
        this.f25328l = c13084l;
        this.f25333l = c17459l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12884l) {
            C12884l c12884l = (C12884l) obj;
            if (AbstractC7236l.amazon(this.f25330l, c12884l.f25330l) && AbstractC7236l.amazon(this.f25329l, c12884l.f25329l) && Arrays.equals(this.f25326l, c12884l.f25326l) && this.f25332l == c12884l.f25332l && AbstractC7236l.amazon(this.f25331l, c12884l.f25331l) && AbstractC7236l.amazon(this.f25334l, c12884l.f25334l) && AbstractC7236l.amazon(this.f25327l, c12884l.f25327l) && AbstractC7236l.amazon(this.f25328l, c12884l.f25328l) && AbstractC7236l.amazon(this.f25333l, c12884l.f25333l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25330l, this.f25329l, Boolean.valueOf(this.f25332l), this.f25331l, this.f25334l, this.f25327l, this.f25328l, this.f25333l});
    }

    public final String toString() {
        return String.format(Locale.US, "<DataElementCollection: sequenceNumber=%s, castId=%s, deduplicationHint=%s, deduplicationHintEnabled=%s, bleGattConnectivityInfo = %s, wifiLanConnectivityInfoList = %s, bluetoothConnectivityInfoList = %s, connectivityCapability = %s, deviceType = %s>", this.f25330l, this.f25329l, Arrays.toString(this.f25326l), Boolean.valueOf(this.f25332l), this.f25331l, this.f25334l, this.f25327l, this.f25328l, this.f25333l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 1, this.f25330l, i);
        AbstractC9968l.remoteconfig(parcel, 2, this.f25329l, i);
        AbstractC9968l.billing(parcel, 3, this.f25326l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f25332l ? 1 : 0);
        AbstractC9968l.ads(parcel, 5, this.f25331l);
        AbstractC9968l.ads(parcel, 6, this.f25334l);
        AbstractC9968l.ads(parcel, 7, this.f25327l);
        AbstractC9968l.remoteconfig(parcel, 8, this.f25328l, i);
        AbstractC9968l.remoteconfig(parcel, 9, this.f25333l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
