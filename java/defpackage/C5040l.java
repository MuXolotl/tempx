package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lؗٝ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5040l extends AbstractC9453l {
    public static final Parcelable.Creator<C5040l> CREATOR = new C5422l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final List f10305l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f10306l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Boolean f10307l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f10308l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f10309l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f10310l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Uri f10311l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f10312l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Boolean f10313l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f10314l;

    public C5040l(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        this.f10309l = str;
        this.f10308l = str2;
        this.f10305l = arrayList;
        this.f10312l = str3;
        this.f10311l = uri;
        this.f10314l = str4;
        this.f10306l = str5;
        this.f10307l = bool;
        this.f10313l = bool2;
        this.f10310l = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5040l)) {
            return false;
        }
        C5040l c5040l = (C5040l) obj;
        return AbstractC15091l.crashlytics(this.f10309l, c5040l.f10309l) && AbstractC15091l.crashlytics(this.f10308l, c5040l.f10308l) && AbstractC15091l.crashlytics(this.f10305l, c5040l.f10305l) && AbstractC15091l.crashlytics(this.f10312l, c5040l.f10312l) && AbstractC15091l.crashlytics(this.f10311l, c5040l.f10311l) && AbstractC15091l.crashlytics(this.f10314l, c5040l.f10314l) && AbstractC15091l.crashlytics(this.f10306l, c5040l.f10306l) && this.f10310l == c5040l.f10310l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10309l, this.f10308l, this.f10305l, this.f10312l, this.f10311l, this.f10314l, Integer.valueOf(this.f10310l)});
    }

    public final String toString() {
        List list = this.f10305l;
        int size = list == null ? 0 : list.size();
        String strValueOf = String.valueOf(this.f10311l);
        String str = this.f10309l;
        int length = String.valueOf(str).length();
        String str2 = this.f10308l;
        int length2 = String.valueOf(str2).length() + length + 23;
        int length3 = String.valueOf(size).length();
        String str3 = this.f10312l;
        int length4 = String.valueOf(str3).length() + length2 + 20 + length3 + 23 + 22;
        int length5 = strValueOf.length();
        String str4 = this.f10314l;
        int i = length4 + length5 + 11;
        int length6 = String.valueOf(str4).length();
        String str5 = this.f10306l;
        StringBuilder sb = new StringBuilder(i + length6 + 8 + String.valueOf(str5).length());
        AbstractC9361l.appmetrica(sb, "applicationId: ", str, ", name: ", str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        AbstractC9361l.appmetrica(sb, ", senderAppLaunchUrl: ", strValueOf, ", iconUrl: ", str4);
        return AbstractC0653l.ads(sb, ", type: ", str5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f10309l);
        AbstractC9968l.vip(parcel, 3, this.f10308l);
        AbstractC9968l.startapp(parcel, 5, DesugarCollections.unmodifiableList(this.f10305l));
        AbstractC9968l.vip(parcel, 6, this.f10312l);
        AbstractC9968l.remoteconfig(parcel, 7, this.f10311l, i);
        AbstractC9968l.vip(parcel, 8, this.f10314l);
        AbstractC9968l.vip(parcel, 9, this.f10306l);
        AbstractC9968l.amazon(parcel, 10, this.f10307l);
        AbstractC9968l.amazon(parcel, 11, this.f10313l);
        AbstractC9968l.subscription(parcel, 12, 4);
        parcel.writeInt(this.f10310l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
