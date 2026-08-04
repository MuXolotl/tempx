package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: lؘؒۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5388l implements Parcelable {
    public static final Parcelable.Creator<C5388l> CREATOR = new C10538l(4);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f11533l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CharSequence f11534l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f11535l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public PlaybackState.CustomAction f11536l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Bundle f11537l;

    public C5388l(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.f11535l = string;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f11534l = charSequence;
        this.f11533l = parcel.readInt();
        this.f11537l = parcel.readBundle(C0458l.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f11534l) + ", mIcon=" + this.f11533l + ", mExtras=" + this.f11537l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11535l);
        TextUtils.writeToParcel(this.f11534l, parcel, i);
        parcel.writeInt(this.f11533l);
        parcel.writeBundle(this.f11537l);
    }

    public C5388l(String str, CharSequence charSequence, int i, Bundle bundle) {
        this.f11535l = str;
        this.f11534l = charSequence;
        this.f11533l = i;
        this.f11537l = bundle;
    }
}
