package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: lّٚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12687l implements Parcelable {
    public static final Parcelable.Creator<C12687l> CREATOR = new C17440l(9);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f25007l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final UUID f25008l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f25009l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f25010l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f25011l;

    public C12687l(Parcel parcel) {
        this.f25008l = new UUID(parcel.readLong(), parcel.readLong());
        this.f25007l = parcel.readString();
        String string = parcel.readString();
        String str = AbstractC15323l.yandex;
        this.f25011l = string;
        this.f25010l = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12687l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C12687l c12687l = (C12687l) obj;
        return Objects.equals(this.f25007l, c12687l.f25007l) && Objects.equals(this.f25011l, c12687l.f25011l) && Objects.equals(this.f25008l, c12687l.f25008l) && Arrays.equals(this.f25010l, c12687l.f25010l);
    }

    public final int hashCode() {
        if (this.f25009l == 0) {
            int iHashCode = this.f25008l.hashCode() * 31;
            String str = this.f25007l;
            this.f25009l = Arrays.hashCode(this.f25010l) + AbstractC12589l.advert((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f25011l);
        }
        return this.f25009l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f25008l;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f25007l);
        parcel.writeString(this.f25011l);
        parcel.writeByteArray(this.f25010l);
    }

    public final boolean yandex(UUID uuid) {
        UUID uuid2 = AbstractC17252l.loadAd;
        UUID uuid3 = this.f25008l;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    public C12687l(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f25008l = uuid;
        this.f25007l = str;
        str2.getClass();
        this.f25011l = AbstractC3825l.vip(str2);
        this.f25010l = bArr;
    }
}
