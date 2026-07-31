package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.AbstractC15560l;
import defpackage.C0554l;
import defpackage.C10538l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C10538l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f46l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final CharSequence f47l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final long f48l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f49l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f50l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f51l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f52l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f53l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public PlaybackState f54l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final ArrayList f55l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f56l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Bundle f57l;

    public PlaybackStateCompat(Parcel parcel) {
        this.f50l = parcel.readInt();
        this.f49l = parcel.readLong();
        this.f53l = parcel.readFloat();
        this.f48l = parcel.readLong();
        this.f46l = parcel.readLong();
        this.f52l = parcel.readLong();
        this.f47l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f55l = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f51l = parcel.readLong();
        this.f57l = parcel.readBundle(C0554l.class.getClassLoader());
        this.f56l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f50l);
        sb.append(", position=");
        sb.append(this.f49l);
        sb.append(", buffered position=");
        sb.append(this.f46l);
        sb.append(", speed=");
        sb.append(this.f53l);
        sb.append(", updated=");
        sb.append(this.f48l);
        sb.append(", actions=");
        sb.append(this.f52l);
        sb.append(", error code=");
        sb.append(this.f56l);
        sb.append(", error message=");
        sb.append(this.f47l);
        sb.append(", custom actions=");
        sb.append(this.f55l);
        sb.append(", active item id=");
        return AbstractC15560l.ads(this.f51l, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f50l);
        parcel.writeLong(this.f49l);
        parcel.writeFloat(this.f53l);
        parcel.writeLong(this.f48l);
        parcel.writeLong(this.f46l);
        parcel.writeLong(this.f52l);
        TextUtils.writeToParcel(this.f47l, parcel, i);
        parcel.writeTypedList(this.f55l);
        parcel.writeLong(this.f51l);
        parcel.writeBundle(this.f57l);
        parcel.writeInt(this.f56l);
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new purchase();

        /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
        public final int f58l;

        /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
        public final CharSequence f59l;

        /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
        public final String f60l;

        /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
        public final Bundle f61l;

        public CustomAction(Parcel parcel) {
            this.f60l = parcel.readString();
            this.f59l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f58l = parcel.readInt();
            this.f61l = parcel.readBundle(C0554l.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f59l) + ", mIcon=" + this.f58l + ", mExtras=" + this.f61l;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f60l);
            TextUtils.writeToParcel(this.f59l, parcel, i);
            parcel.writeInt(this.f58l);
            parcel.writeBundle(this.f61l);
        }

        public CustomAction(String str, CharSequence charSequence, int i) {
            this.f60l = str;
            this.f59l = charSequence;
            this.f58l = i;
            this.f61l = null;
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f50l = i;
        this.f49l = j;
        this.f46l = j2;
        this.f53l = f;
        this.f52l = j3;
        this.f56l = i2;
        this.f47l = charSequence;
        this.f48l = j4;
        this.f55l = new ArrayList(arrayList);
        this.f51l = j5;
        this.f57l = bundle;
    }
}
