package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15091l;
import defpackage.AbstractC9361l;
import defpackage.AbstractC9453l;
import defpackage.AbstractC9968l;
import defpackage.C14513l;
import defpackage.C1800l;
import defpackage.C7851l;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class CastDevice extends AbstractC9453l implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new C1800l(4);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f518l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InetAddress f519l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f520l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final Network f521l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final Boolean f522l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final List f523l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final String f524l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f525l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f526l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final Integer f527l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f528l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f529l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final byte[] f530l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f531l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f532l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final String f533l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C14513l f534l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f535l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f536l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final String f537l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C7851l f538l;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, C7851l c7851l, Integer num, Boolean bool, Network network) {
        this.f526l = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f525l = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f519l = InetAddress.getByName(str2);
            } catch (UnknownHostException e) {
                String str10 = this.f525l;
                String message = e.getMessage();
                Log.i("CastDevice", AbstractC9361l.advert(new StringBuilder(str10.length() + 48 + String.valueOf(message).length()), "Unable to convert host address (", str10, ") to ipaddress: ", message));
            }
        }
        this.f532l = str3 == null ? "" : str3;
        this.f531l = str4 == null ? "" : str4;
        this.f535l = str5 == null ? "" : str5;
        this.f520l = i;
        this.f523l = arrayList == null ? new ArrayList() : arrayList;
        this.f529l = i3;
        this.f536l = str6 != null ? str6 : "";
        this.f533l = str7;
        this.f518l = i4;
        this.f537l = str8;
        this.f530l = bArr;
        this.f524l = str9;
        this.f528l = z;
        this.f538l = c7851l;
        this.f527l = num;
        this.f522l = bool;
        this.f521l = network;
        this.f534l = new C14513l(i2, 26, (byte) 0);
    }

    public static CastDevice billing(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final int admob() {
        C14513l c14513l = this.f534l;
        if (c14513l.m3860synchronized(64)) {
            return 4;
        }
        if (c14513l.m3859strictfp()) {
            return 3;
        }
        if (c14513l.m3858native()) {
            return 5;
        }
        return c14513l.m3860synchronized(1) ? 2 : 1;
    }

    public final boolean equals(Object obj) {
        int i;
        byte[] bArr;
        if (obj != this) {
            if (obj instanceof CastDevice) {
                CastDevice castDevice = (CastDevice) obj;
                byte[] bArr2 = castDevice.f530l;
                int i2 = castDevice.f520l;
                String str = castDevice.f535l;
                if (AbstractC15091l.crashlytics(this.f526l, castDevice.f526l) && AbstractC15091l.crashlytics(this.f519l, castDevice.f519l) && AbstractC15091l.crashlytics(this.f531l, castDevice.f531l) && AbstractC15091l.crashlytics(this.f532l, castDevice.f532l)) {
                    String str2 = this.f535l;
                    if (AbstractC15091l.crashlytics(str2, str) && (i = this.f520l) == i2 && AbstractC15091l.crashlytics(this.f523l, castDevice.f523l) && this.f534l.f28392l == castDevice.f534l.f28392l && this.f529l == castDevice.f529l && AbstractC15091l.crashlytics(this.f536l, castDevice.f536l) && AbstractC15091l.crashlytics(Integer.valueOf(this.f518l), Integer.valueOf(castDevice.f518l)) && AbstractC15091l.crashlytics(this.f537l, castDevice.f537l) && AbstractC15091l.crashlytics(this.f533l, castDevice.f533l) && AbstractC15091l.crashlytics(str2, str) && i == i2 && ((((bArr = this.f530l) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && AbstractC15091l.crashlytics(this.f524l, castDevice.f524l) && this.f528l == castDevice.f528l && AbstractC15091l.crashlytics(mopub(), castDevice.mopub()))) {
                        if (AbstractC15091l.crashlytics(Boolean.valueOf(firebase()), Boolean.valueOf(castDevice.firebase() && AbstractC15091l.crashlytics(this.f521l, castDevice.f521l)))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean firebase() {
        Boolean bool = this.f522l;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = this.f529l;
        return i != -1 && (i & 2) > 0;
    }

    public final int hashCode() {
        return this.f526l.hashCode();
    }

    public final C7851l mopub() {
        C7851l c7851l = this.f538l;
        return (c7851l == null && this.f534l.m3858native()) ? new C7851l(1, false, false, null, null, null, null, null, false, false) : c7851l;
    }

    public final String toString() {
        String strConcat;
        C14513l c14513l = this.f534l;
        if (c14513l.m3860synchronized(64)) {
            strConcat = "[dynamic group]";
        } else if (c14513l.m3859strictfp()) {
            strConcat = "[static group]";
        } else {
            strConcat = c14513l.m3858native() ? "[speaker pair]" : "";
        }
        if (c14513l.m3860synchronized(262144)) {
            strConcat = strConcat.concat("[cast connect]");
        }
        Locale locale = Locale.ROOT;
        Pattern pattern = AbstractC15091l.yandex;
        String str = this.f532l;
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            if (length <= 2) {
                str = length == 2 ? "xx" : "x";
            } else {
                str = String.format(locale, "%c%d%c", Character.valueOf(str.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str.charAt(length - 1)));
            }
        }
        StringBuilder sbLicense = AbstractC14814l.license("\"", str, "\" (", this.f526l, ") ");
        sbLicense.append(strConcat);
        return sbLicense.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f526l);
        AbstractC9968l.vip(parcel, 3, this.f525l);
        AbstractC9968l.vip(parcel, 4, this.f532l);
        AbstractC9968l.vip(parcel, 5, this.f531l);
        AbstractC9968l.vip(parcel, 6, this.f535l);
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(this.f520l);
        AbstractC9968l.ads(parcel, 8, DesugarCollections.unmodifiableList(this.f523l));
        int i2 = this.f534l.f28392l;
        AbstractC9968l.subscription(parcel, 9, 4);
        parcel.writeInt(i2);
        AbstractC9968l.subscription(parcel, 10, 4);
        parcel.writeInt(this.f529l);
        AbstractC9968l.vip(parcel, 11, this.f536l);
        AbstractC9968l.vip(parcel, 12, this.f533l);
        AbstractC9968l.subscription(parcel, 13, 4);
        parcel.writeInt(this.f518l);
        AbstractC9968l.vip(parcel, 14, this.f537l);
        AbstractC9968l.billing(parcel, 15, this.f530l);
        AbstractC9968l.vip(parcel, 16, this.f524l);
        AbstractC9968l.subscription(parcel, 17, 4);
        parcel.writeInt(this.f528l ? 1 : 0);
        AbstractC9968l.remoteconfig(parcel, 18, mopub(), i);
        AbstractC9968l.firebase(parcel, 19, this.f527l);
        AbstractC9968l.amazon(parcel, 20, Boolean.valueOf(firebase()));
        AbstractC9968l.remoteconfig(parcel, 21, this.f521l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
