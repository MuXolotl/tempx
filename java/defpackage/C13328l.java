package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lّْۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13328l extends AbstractC9453l {
    public static final Parcelable.Creator<C13328l> CREATOR = new C13546l(23);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f26158l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long[] f26159l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String f26160l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f26161l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public MediaInfo f26162l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public double f26163l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public double f26164l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public JSONObject f26165l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public double f26166l;

    public C13328l(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.f26162l = mediaInfo;
        this.f26161l = i;
        this.f26158l = z;
        this.f26164l = d;
        this.f26163l = d2;
        this.f26166l = d3;
        this.f26159l = jArr;
        this.f26160l = str;
        if (str == null) {
            this.f26165l = null;
            return;
        }
        try {
            this.f26165l = new JSONObject(this.f26160l);
        } catch (JSONException unused) {
            this.f26165l = null;
            this.f26160l = null;
        }
    }

    public final boolean billing(JSONObject jSONObject) {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.f26162l = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f26161l != (i = jSONObject.getInt("itemId"))) {
            this.f26161l = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f26158l != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.f26158l = z2;
            z = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.f26164l) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.f26164l) > 1.0E-7d)) {
            this.f26164l = dOptDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f26163l) > 1.0E-7d) {
                this.f26163l = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f26166l) > 1.0E-7d) {
                this.f26166l = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.f26159l;
            if (jArr2 == null || jArr2.length != length) {
                z3 = true;
                break;
            }
            for (int i3 = 0; i3 < length; i3++) {
                if (this.f26159l[i3] != jArr[i3]) {
                    z3 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z3) {
            this.f26159l = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.f26165l = jSONObject.getJSONObject("customData");
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13328l)) {
            return false;
        }
        C13328l c13328l = (C13328l) obj;
        JSONObject jSONObject = this.f26165l;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = c13328l.f26165l;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || AbstractC4851l.yandex(jSONObject, jSONObject2)) && AbstractC15091l.crashlytics(this.f26162l, c13328l.f26162l) && this.f26161l == c13328l.f26161l && this.f26158l == c13328l.f26158l && ((Double.isNaN(this.f26164l) && Double.isNaN(c13328l.f26164l)) || this.f26164l == c13328l.f26164l) && this.f26163l == c13328l.f26163l && this.f26166l == c13328l.f26166l && Arrays.equals(this.f26159l, c13328l.f26159l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26162l, Integer.valueOf(this.f26161l), Boolean.valueOf(this.f26158l), Double.valueOf(this.f26164l), Double.valueOf(this.f26163l), Double.valueOf(this.f26166l), Integer.valueOf(Arrays.hashCode(this.f26159l)), String.valueOf(this.f26165l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f26165l;
        this.f26160l = jSONObject == null ? null : jSONObject.toString();
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 2, this.f26162l, i);
        int i2 = this.f26161l;
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.f26158l;
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.f26164l;
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.f26163l;
        AbstractC9968l.subscription(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d3 = this.f26166l;
        AbstractC9968l.subscription(parcel, 7, 8);
        parcel.writeDouble(d3);
        AbstractC9968l.smaato(parcel, 8, this.f26159l);
        AbstractC9968l.vip(parcel, 9, this.f26160l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C13328l(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        billing(jSONObject);
    }
}
