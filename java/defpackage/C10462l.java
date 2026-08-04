package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lَٞ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10462l extends AbstractC9453l {
    public static final Parcelable.Creator<C10462l> CREATOR = new C1800l(5);

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final long f21285l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final boolean f21286l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f21287l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f21288l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f21289l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final String f21290l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final String f21291l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f21292l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final Boolean f21293l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final int f21294l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f21295l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f21296l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final String f21297l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final long f21298l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final int f21299l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final String f21300l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final String f21301l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f21302l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f21303l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f21304l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f21305l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final String f21306l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final int f21307l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final long f21308l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final long f21309l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f21310l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f21311l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f21312l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final boolean f21313l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final long f21314l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final List f21315l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final long f21316l;

    public C10462l(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        AbstractC1051l.billing(str);
        this.f21296l = str;
        this.f21295l = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f21288l = str3;
        this.f21302l = j;
        this.f21305l = str4;
        this.f21304l = j2;
        this.f21311l = j3;
        this.f21289l = str5;
        this.f21292l = z;
        this.f21310l = z2;
        this.f21312l = str6;
        this.f21308l = j4;
        this.f21287l = i;
        this.f21313l = z3;
        this.f21303l = z4;
        this.f21293l = bool;
        this.f21298l = j5;
        this.f21315l = list;
        this.f21297l = str7;
        this.f21291l = str8;
        this.f21290l = str9;
        this.f21286l = z5;
        this.f21316l = j6;
        this.f21294l = i2;
        this.f21301l = str10;
        this.f21307l = i3;
        this.f21285l = j7;
        this.f21300l = str11;
        this.f21306l = str12;
        this.f21314l = j8;
        this.f21299l = i4;
        this.f21309l = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f21296l);
        AbstractC9968l.vip(parcel, 3, this.f21295l);
        AbstractC9968l.vip(parcel, 4, this.f21288l);
        AbstractC9968l.vip(parcel, 5, this.f21305l);
        AbstractC9968l.subscription(parcel, 6, 8);
        parcel.writeLong(this.f21304l);
        AbstractC9968l.subscription(parcel, 7, 8);
        parcel.writeLong(this.f21311l);
        AbstractC9968l.vip(parcel, 8, this.f21289l);
        AbstractC9968l.subscription(parcel, 9, 4);
        parcel.writeInt(this.f21292l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 10, 4);
        parcel.writeInt(this.f21310l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 11, 8);
        parcel.writeLong(this.f21302l);
        AbstractC9968l.vip(parcel, 12, this.f21312l);
        AbstractC9968l.subscription(parcel, 14, 8);
        parcel.writeLong(this.f21308l);
        AbstractC9968l.subscription(parcel, 15, 4);
        parcel.writeInt(this.f21287l);
        AbstractC9968l.subscription(parcel, 16, 4);
        parcel.writeInt(this.f21313l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 18, 4);
        parcel.writeInt(this.f21303l ? 1 : 0);
        AbstractC9968l.amazon(parcel, 21, this.f21293l);
        AbstractC9968l.subscription(parcel, 22, 8);
        parcel.writeLong(this.f21298l);
        AbstractC9968l.startapp(parcel, 23, this.f21315l);
        AbstractC9968l.vip(parcel, 25, this.f21297l);
        AbstractC9968l.vip(parcel, 26, this.f21291l);
        AbstractC9968l.vip(parcel, 27, this.f21290l);
        AbstractC9968l.subscription(parcel, 28, 4);
        parcel.writeInt(this.f21286l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 29, 8);
        parcel.writeLong(this.f21316l);
        AbstractC9968l.subscription(parcel, 30, 4);
        parcel.writeInt(this.f21294l);
        AbstractC9968l.vip(parcel, 31, this.f21301l);
        AbstractC9968l.subscription(parcel, 32, 4);
        parcel.writeInt(this.f21307l);
        AbstractC9968l.subscription(parcel, 34, 8);
        parcel.writeLong(this.f21285l);
        AbstractC9968l.vip(parcel, 35, this.f21300l);
        AbstractC9968l.vip(parcel, 36, this.f21306l);
        AbstractC9968l.subscription(parcel, 37, 8);
        parcel.writeLong(this.f21314l);
        AbstractC9968l.subscription(parcel, 38, 4);
        parcel.writeInt(this.f21299l);
        AbstractC9968l.subscription(parcel, 39, 8);
        parcel.writeLong(this.f21309l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C10462l(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.f21296l = str;
        this.f21295l = str2;
        this.f21288l = str3;
        this.f21302l = j3;
        this.f21305l = str4;
        this.f21304l = j;
        this.f21311l = j2;
        this.f21289l = str5;
        this.f21292l = z;
        this.f21310l = z2;
        this.f21312l = str6;
        this.f21308l = j4;
        this.f21287l = i;
        this.f21313l = z3;
        this.f21303l = z4;
        this.f21293l = bool;
        this.f21298l = j5;
        this.f21315l = arrayList;
        this.f21297l = str7;
        this.f21291l = str8;
        this.f21290l = str9;
        this.f21286l = z5;
        this.f21316l = j6;
        this.f21294l = i2;
        this.f21301l = str10;
        this.f21307l = i3;
        this.f21285l = j7;
        this.f21300l = str11;
        this.f21306l = str12;
        this.f21314l = j8;
        this.f21299l = i4;
        this.f21309l = j9;
    }
}
