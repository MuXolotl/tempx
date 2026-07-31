package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lْٗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16830l implements Parcelable {
    public static final Parcelable.Creator<C16830l> CREATOR = new C10538l(2);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f32849l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final CharSequence f32850l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final long f32851l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f32852l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32853l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f32854l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f32855l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f32856l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public PlaybackState f32857l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final List f32858l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f32859l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Bundle f32860l;

    public C16830l(Parcel parcel) {
        this.f32853l = parcel.readInt();
        this.f32852l = parcel.readLong();
        this.f32856l = parcel.readFloat();
        this.f32851l = parcel.readLong();
        this.f32849l = parcel.readLong();
        this.f32855l = parcel.readLong();
        this.f32850l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        List listCreateTypedArrayList = parcel.createTypedArrayList(C5388l.CREATOR);
        if (listCreateTypedArrayList == null) {
            C9258l c9258l = AbstractC1186l.f3181l;
            listCreateTypedArrayList = C13708l.f26763l;
        }
        this.f32858l = listCreateTypedArrayList;
        this.f32854l = parcel.readLong();
        this.f32860l = parcel.readBundle(C0458l.class.getClassLoader());
        this.f32859l = parcel.readInt();
    }

    public static C16830l yandex(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    C5388l c5388l = new C5388l(customAction.getAction(), customAction.getName(), customAction.getIcon(), AbstractC15323l.startapp(customAction.getExtras()));
                    c5388l.f11536l = customAction;
                    arrayList.add(c5388l);
                }
            }
        }
        C16830l c16830l = new C16830l(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), AbstractC15323l.startapp(playbackState.getExtras()));
        c16830l.f32857l = playbackState;
        return c16830l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f32853l);
        sb.append(", position=");
        sb.append(this.f32852l);
        sb.append(", buffered position=");
        sb.append(this.f32849l);
        sb.append(", speed=");
        sb.append(this.f32856l);
        sb.append(", updated=");
        sb.append(this.f32851l);
        sb.append(", actions=");
        sb.append(this.f32855l);
        sb.append(", error code=");
        sb.append(this.f32859l);
        sb.append(", error message=");
        sb.append(this.f32850l);
        sb.append(", custom actions=");
        sb.append(this.f32858l);
        sb.append(", active item id=");
        return AbstractC15560l.ads(this.f32854l, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32853l);
        parcel.writeLong(this.f32852l);
        parcel.writeFloat(this.f32856l);
        parcel.writeLong(this.f32851l);
        parcel.writeLong(this.f32849l);
        parcel.writeLong(this.f32855l);
        TextUtils.writeToParcel(this.f32850l, parcel, i);
        parcel.writeTypedList(this.f32858l);
        parcel.writeLong(this.f32854l);
        parcel.writeBundle(this.f32860l);
        parcel.writeInt(this.f32859l);
    }

    public C16830l(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        List arrayList2;
        this.f32853l = i;
        this.f32852l = j;
        this.f32849l = j2;
        this.f32856l = f;
        this.f32855l = j3;
        this.f32859l = i2;
        this.f32850l = charSequence;
        this.f32851l = j4;
        if (arrayList == null) {
            C9258l c9258l = AbstractC1186l.f3181l;
            arrayList2 = C13708l.f26763l;
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.f32858l = arrayList2;
        this.f32854l = j5;
        this.f32860l = bundle;
    }
}
