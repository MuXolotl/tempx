package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٟؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5057l implements Parcelable {
    public static final Parcelable.Creator<C5057l> CREATOR = new C17440l(24);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC10867l f10327l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final MediaSession.Token f10328l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f10329l = new Object();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public InterfaceC12713l f10330l = null;

    public C5057l(MediaSession.Token token, InterfaceC10867l interfaceC10867l) {
        this.f10328l = token;
        this.f10327l = interfaceC10867l;
    }

    public final void crashlytics(InterfaceC12713l interfaceC12713l) {
        synchronized (this.f10329l) {
            this.f10330l = interfaceC12713l;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5057l) {
            return this.f10328l.equals(((C5057l) obj).f10328l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10328l.hashCode();
    }

    public final void loadAd(InterfaceC10867l interfaceC10867l) {
        synchronized (this.f10329l) {
            this.f10327l = interfaceC10867l;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10328l, i);
    }

    public final InterfaceC10867l yandex() {
        InterfaceC10867l interfaceC10867l;
        synchronized (this.f10329l) {
            interfaceC10867l = this.f10327l;
        }
        return interfaceC10867l;
    }
}
