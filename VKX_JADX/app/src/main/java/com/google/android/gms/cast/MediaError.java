package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.AbstractC15091l;
import defpackage.AbstractC9453l;
import defpackage.AbstractC9968l;
import defpackage.C13546l;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class MediaError extends AbstractC9453l implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new C13546l(12);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Integer f539l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f540l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f541l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f542l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f543l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final JSONObject f544l;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.f541l = str;
        this.f540l = j;
        this.f539l = num;
        this.f543l = str2;
        this.f544l = jSONObject;
    }

    public static MediaError billing(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, AbstractC15091l.yandex(jSONObject, "reason"), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f544l;
        this.f542l = jSONObject == null ? null : jSONObject.toString();
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f541l);
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeLong(this.f540l);
        AbstractC9968l.firebase(parcel, 4, this.f539l);
        AbstractC9968l.vip(parcel, 5, this.f543l);
        AbstractC9968l.vip(parcel, 6, this.f542l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
