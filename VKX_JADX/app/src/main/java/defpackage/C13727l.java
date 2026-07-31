package defpackage;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؙْۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13727l extends AbstractC9453l {
    public static final Parcelable.Creator<C13727l> CREATOR = new C5422l(6);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public JSONObject f26786l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f26787l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f26788l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f26789l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f26790l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public float f26791l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f26792l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f26793l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f26794l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public String f26795l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public String f26796l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f26797l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f26798l;

    public C13727l(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.f26791l = f;
        this.f26790l = i;
        this.f26787l = i2;
        this.f26794l = i3;
        this.f26793l = i4;
        this.f26797l = i5;
        this.f26788l = i6;
        this.f26789l = i7;
        this.f26796l = str;
        this.f26792l = i8;
        this.f26798l = i9;
        this.f26795l = str2;
        if (str2 == null) {
            this.f26786l = null;
            return;
        }
        try {
            this.f26786l = new JSONObject(this.f26795l);
        } catch (JSONException unused) {
            this.f26786l = null;
            this.f26795l = null;
        }
    }

    public static final int billing(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13727l)) {
            return false;
        }
        C13727l c13727l = (C13727l) obj;
        JSONObject jSONObject = this.f26786l;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = c13727l.f26786l;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || AbstractC4851l.yandex(jSONObject, jSONObject2)) && this.f26791l == c13727l.f26791l && this.f26790l == c13727l.f26790l && this.f26787l == c13727l.f26787l && this.f26794l == c13727l.f26794l && this.f26793l == c13727l.f26793l && this.f26797l == c13727l.f26797l && this.f26788l == c13727l.f26788l && this.f26789l == c13727l.f26789l && AbstractC15091l.crashlytics(this.f26796l, c13727l.f26796l) && this.f26792l == c13727l.f26792l && this.f26798l == c13727l.f26798l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f26791l), Integer.valueOf(this.f26790l), Integer.valueOf(this.f26787l), Integer.valueOf(this.f26794l), Integer.valueOf(this.f26793l), Integer.valueOf(this.f26797l), Integer.valueOf(this.f26788l), Integer.valueOf(this.f26789l), this.f26796l, Integer.valueOf(this.f26792l), Integer.valueOf(this.f26798l), String.valueOf(this.f26786l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f26786l;
        this.f26795l = jSONObject == null ? null : jSONObject.toString();
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        float f = this.f26791l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeFloat(f);
        int i2 = this.f26790l;
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.f26787l;
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.f26794l;
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(i4);
        int i5 = this.f26793l;
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.f26797l;
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(i6);
        int i7 = this.f26788l;
        AbstractC9968l.subscription(parcel, 8, 4);
        parcel.writeInt(i7);
        int i8 = this.f26789l;
        AbstractC9968l.subscription(parcel, 9, 4);
        parcel.writeInt(i8);
        AbstractC9968l.vip(parcel, 10, this.f26796l);
        int i9 = this.f26792l;
        AbstractC9968l.subscription(parcel, 11, 4);
        parcel.writeInt(i9);
        int i10 = this.f26798l;
        AbstractC9968l.subscription(parcel, 12, 4);
        parcel.writeInt(i10);
        AbstractC9968l.vip(parcel, 13, this.f26795l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
