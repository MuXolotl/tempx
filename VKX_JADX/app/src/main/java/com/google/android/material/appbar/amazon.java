package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC2704l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class amazon extends AbstractC2704l {
    public static final Parcelable.Creator<amazon> CREATOR = new crashlytics();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f621l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f622l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f623l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f624l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public float f625l;

    public amazon(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f621l = parcel.readByte() != 0;
        this.f624l = parcel.readByte() != 0;
        this.f623l = parcel.readInt();
        this.f625l = parcel.readFloat();
        this.f622l = parcel.readByte() != 0;
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f621l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f624l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f623l);
        parcel.writeFloat(this.f625l);
        parcel.writeByte(this.f622l ? (byte) 1 : (byte) 0);
    }
}
