package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.AbstractC1051l;
import defpackage.AbstractC9453l;
import defpackage.AbstractC9968l;
import defpackage.C10538l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC9453l implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C10538l(17);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f506l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final long f507l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f508l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f509l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f510l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final String f511l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Uri f512l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f513l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final HashSet f514l = new HashSet();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final List f515l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String f516l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f517l;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f510l = str;
        this.f509l = str2;
        this.f506l = str3;
        this.f513l = str4;
        this.f512l = uri;
        this.f516l = str5;
        this.f507l = j;
        this.f508l = str6;
        this.f515l = arrayList;
        this.f511l = str7;
        this.f517l = str8;
    }

    public static GoogleSignInAccount billing(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC1051l.billing(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f516l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f508l.equals(this.f508l)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f515l);
        hashSet.addAll(googleSignInAccount.f514l);
        HashSet hashSet2 = new HashSet(this.f515l);
        hashSet2.addAll(this.f514l);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f508l.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f515l);
        hashSet.addAll(this.f514l);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f510l);
        AbstractC9968l.vip(parcel, 3, this.f509l);
        AbstractC9968l.vip(parcel, 4, this.f506l);
        AbstractC9968l.vip(parcel, 5, this.f513l);
        AbstractC9968l.remoteconfig(parcel, 6, this.f512l, i);
        AbstractC9968l.vip(parcel, 7, this.f516l);
        AbstractC9968l.subscription(parcel, 8, 8);
        parcel.writeLong(this.f507l);
        AbstractC9968l.vip(parcel, 9, this.f508l);
        AbstractC9968l.ads(parcel, 10, this.f515l);
        AbstractC9968l.vip(parcel, 11, this.f511l);
        AbstractC9968l.vip(parcel, 12, this.f517l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
