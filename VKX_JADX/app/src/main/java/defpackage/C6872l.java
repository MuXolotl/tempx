package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؙۥْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6872l extends AbstractC9453l {
    public static final Parcelable.Creator<C6872l> CREATOR = new C10538l(27);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f14370l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f14371l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f14372l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f14373l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f14374l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f14375l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f14376l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f14377l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C16640l f14378l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final String f14379l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f14380l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f14381l;

    public C6872l(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, C16640l c16640l) {
        this.f14374l = str;
        this.f14373l = str2;
        this.f14370l = j;
        this.f14377l = str3;
        this.f14376l = str4;
        this.f14380l = str5;
        this.f14371l = str6;
        this.f14372l = str7;
        this.f14379l = str8;
        this.f14375l = j2;
        this.f14381l = str9;
        this.f14378l = c16640l;
        if (TextUtils.isEmpty(str6)) {
            new JSONObject();
            return;
        }
        try {
            new JSONObject(str6);
        } catch (JSONException e) {
            Locale locale = Locale.ROOT;
            Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + e.getMessage());
            this.f14371l = null;
            new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6872l)) {
            return false;
        }
        C6872l c6872l = (C6872l) obj;
        return AbstractC15091l.crashlytics(this.f14374l, c6872l.f14374l) && AbstractC15091l.crashlytics(this.f14373l, c6872l.f14373l) && this.f14370l == c6872l.f14370l && AbstractC15091l.crashlytics(this.f14377l, c6872l.f14377l) && AbstractC15091l.crashlytics(this.f14376l, c6872l.f14376l) && AbstractC15091l.crashlytics(this.f14380l, c6872l.f14380l) && AbstractC15091l.crashlytics(this.f14371l, c6872l.f14371l) && AbstractC15091l.crashlytics(this.f14372l, c6872l.f14372l) && AbstractC15091l.crashlytics(this.f14379l, c6872l.f14379l) && this.f14375l == c6872l.f14375l && AbstractC15091l.crashlytics(this.f14381l, c6872l.f14381l) && AbstractC15091l.crashlytics(this.f14378l, c6872l.f14378l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14374l, this.f14373l, Long.valueOf(this.f14370l), this.f14377l, this.f14376l, this.f14380l, this.f14371l, this.f14372l, this.f14379l, Long.valueOf(this.f14375l), this.f14381l, this.f14378l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f14374l);
        AbstractC9968l.vip(parcel, 3, this.f14373l);
        AbstractC9968l.subscription(parcel, 4, 8);
        parcel.writeLong(this.f14370l);
        AbstractC9968l.vip(parcel, 5, this.f14377l);
        AbstractC9968l.vip(parcel, 6, this.f14376l);
        AbstractC9968l.vip(parcel, 7, this.f14380l);
        AbstractC9968l.vip(parcel, 8, this.f14371l);
        AbstractC9968l.vip(parcel, 9, this.f14372l);
        AbstractC9968l.vip(parcel, 10, this.f14379l);
        AbstractC9968l.subscription(parcel, 11, 8);
        parcel.writeLong(this.f14375l);
        AbstractC9968l.vip(parcel, 12, this.f14381l);
        AbstractC9968l.remoteconfig(parcel, 13, this.f14378l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
