package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٍَٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9574l extends AbstractC0895l implements InterfaceC5496l {
    public C9574l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 5);
    }

    @Override // defpackage.InterfaceC5496l
    public final void ad(long j, String str, String str2, String str3) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeLong(j);
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        parcelM743l.writeString(str3);
        m741l(parcelM743l, 10);
    }

    @Override // defpackage.InterfaceC5496l
    public final List adcel(String str, String str2, String str3, boolean z) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(null);
        parcelM743l.writeString(str2);
        parcelM743l.writeString(str3);
        ClassLoader classLoader = AbstractC15425l.yandex;
        parcelM743l.writeInt(z ? 1 : 0);
        Parcel parcelM745l = m745l(parcelM743l, 15);
        ArrayList arrayListCreateTypedArrayList = parcelM745l.createTypedArrayList(C6899l.CREATOR);
        parcelM745l.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: break */
    public final void mo1794break(C13236l c13236l, C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c13236l);
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 1);
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: catch */
    public final void mo1795catch(C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 26);
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: const */
    public final void mo1796const(C6899l c6899l, C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c6899l);
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 2);
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: else */
    public final void mo1797else(C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 6);
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: import */
    public final void mo1798import(C17509l c17509l, C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c17509l);
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 12);
    }

    @Override // defpackage.InterfaceC5496l
    public final void inmobi(C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 25);
    }

    @Override // defpackage.InterfaceC5496l
    public final void isVip(Bundle bundle, C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, bundle);
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 19);
    }

    @Override // defpackage.InterfaceC5496l
    public final void license(C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 4);
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final void mo1799l(C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 27);
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final void mo1800l(C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 18);
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lؗۨؑ */
    public final String mo1801l(C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        Parcel parcelM745l = m745l(parcelM743l, 11);
        String string = parcelM745l.readString();
        parcelM745l.recycle();
        return string;
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lٍۤٙ */
    public final byte[] mo1802l(String str, C13236l c13236l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c13236l);
        parcelM743l.writeString(str);
        Parcel parcelM745l = m745l(parcelM743l, 9);
        byte[] bArrCreateByteArray = parcelM745l.createByteArray();
        parcelM745l.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lٖۥۡ */
    public final List mo1803l(String str, String str2, C10462l c10462l) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        Parcel parcelM745l = m745l(parcelM743l, 16);
        ArrayList arrayListCreateTypedArrayList = parcelM745l.createTypedArrayList(C17509l.CREATOR);
        parcelM745l.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: lؘٗۦ */
    public final void mo1804l(C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        m741l(parcelM743l, 20);
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public final void mo1805l(C10462l c10462l, Bundle bundle, InterfaceC4992l interfaceC4992l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        AbstractC15425l.loadAd(parcelM743l, bundle);
        AbstractC15425l.crashlytics(parcelM743l, interfaceC4992l);
        m741l(parcelM743l, 31);
    }

    @Override // defpackage.InterfaceC5496l
    public final List premium(String str, String str2, boolean z, C10462l c10462l) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        ClassLoader classLoader = AbstractC15425l.yandex;
        parcelM743l.writeInt(z ? 1 : 0);
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        Parcel parcelM745l = m745l(parcelM743l, 14);
        ArrayList arrayListCreateTypedArrayList = parcelM745l.createTypedArrayList(C6899l.CREATOR);
        parcelM745l.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: public */
    public final void mo1806public(C10462l c10462l, C17261l c17261l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        AbstractC15425l.loadAd(parcelM743l, c17261l);
        m741l(parcelM743l, 30);
    }

    @Override // defpackage.InterfaceC5496l
    public final void signatures(C10462l c10462l, C18032l c18032l, InterfaceC14655l interfaceC14655l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        AbstractC15425l.loadAd(parcelM743l, c18032l);
        AbstractC15425l.crashlytics(parcelM743l, interfaceC14655l);
        m741l(parcelM743l, 29);
    }

    @Override // defpackage.InterfaceC5496l
    public final C15927l startapp(C10462l c10462l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c10462l);
        Parcel parcelM745l = m745l(parcelM743l, 21);
        C15927l c15927l = (C15927l) AbstractC15425l.yandex(parcelM745l, C15927l.CREATOR);
        parcelM745l.recycle();
        return c15927l;
    }

    @Override // defpackage.InterfaceC5496l
    /* JADX INFO: renamed from: synchronized */
    public final List mo1807synchronized(String str, String str2, String str3) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(null);
        parcelM743l.writeString(str2);
        parcelM743l.writeString(str3);
        Parcel parcelM745l = m745l(parcelM743l, 17);
        ArrayList arrayListCreateTypedArrayList = parcelM745l.createTypedArrayList(C17509l.CREATOR);
        parcelM745l.recycle();
        return arrayListCreateTypedArrayList;
    }
}
