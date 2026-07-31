package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.AbstractC15091l;
import defpackage.AbstractC4851l;
import defpackage.AbstractC9453l;
import defpackage.AbstractC9968l;
import defpackage.C13546l;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaTrack extends AbstractC9453l implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C13546l(29);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f563l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f564l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final List f565l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f566l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f567l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final JSONObject f568l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f569l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f570l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public String f571l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f572l;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.f567l = j;
        this.f566l = i;
        this.f563l = str;
        this.f570l = str2;
        this.f569l = str3;
        this.f572l = str4;
        this.f564l = i2;
        this.f565l = list;
        this.f568l = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.f568l;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.f568l;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || AbstractC4851l.yandex(jSONObject, jSONObject2)) && this.f567l == mediaTrack.f567l && this.f566l == mediaTrack.f566l && AbstractC15091l.crashlytics(this.f563l, mediaTrack.f563l) && AbstractC15091l.crashlytics(this.f570l, mediaTrack.f570l) && AbstractC15091l.crashlytics(this.f569l, mediaTrack.f569l) && AbstractC15091l.crashlytics(this.f572l, mediaTrack.f572l) && this.f564l == mediaTrack.f564l && AbstractC15091l.crashlytics(this.f565l, mediaTrack.f565l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f567l), Integer.valueOf(this.f566l), this.f563l, this.f570l, this.f569l, this.f572l, Integer.valueOf(this.f564l), this.f565l, String.valueOf(this.f568l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f568l;
        this.f571l = jSONObject == null ? null : jSONObject.toString();
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeLong(this.f567l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f566l);
        AbstractC9968l.vip(parcel, 4, this.f563l);
        AbstractC9968l.vip(parcel, 5, this.f570l);
        AbstractC9968l.vip(parcel, 6, this.f569l);
        AbstractC9968l.vip(parcel, 7, this.f572l);
        AbstractC9968l.subscription(parcel, 8, 4);
        parcel.writeInt(this.f564l);
        AbstractC9968l.startapp(parcel, 9, this.f565l);
        AbstractC9968l.vip(parcel, 10, this.f571l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
