package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lِٜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12185l implements Parcelable {
    public static final Parcelable.Creator<C12185l> CREATOR = new C17440l(13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f24203l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Intent f24204l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final IntentSender f24205l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f24206l;

    public C12185l(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f24205l = intentSender;
        this.f24204l = intent;
        this.f24203l = i;
        this.f24206l = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f24205l, i);
        parcel.writeParcelable(this.f24204l, i);
        parcel.writeInt(this.f24203l);
        parcel.writeInt(this.f24206l);
    }
}
