package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٟ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18275l extends AbstractC9453l {
    public static final Parcelable.Creator<C18275l> CREATOR = new C18485l(17);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C4153l f35772l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f35773l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f35774l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f35775l;

    public C18275l(String str, String str2, C4153l c4153l, boolean z) {
        this.f35774l = str;
        this.f35773l = str2;
        this.f35772l = c4153l;
        this.f35775l = z;
    }

    public final void billing(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f35774l);
        sb.append(", ");
        sb.append(this.f35773l);
        sb.append(", ");
        this.f35772l.billing(sb);
        sb.append(", ");
        sb.append(this.f35775l);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18275l)) {
            return false;
        }
        C18275l c18275l = (C18275l) obj;
        return AbstractC8960l.isPro(this.f35774l, c18275l.f35774l) && AbstractC8960l.isPro(this.f35773l, c18275l.f35773l) && AbstractC8960l.isPro(this.f35772l, c18275l.f35772l) && this.f35775l == c18275l.f35775l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        billing(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f35774l);
        AbstractC9968l.vip(parcel, 3, this.f35773l);
        AbstractC9968l.remoteconfig(parcel, 4, this.f35772l, i);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f35775l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
