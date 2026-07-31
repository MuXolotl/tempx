package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C17440l;
import defpackage.InterfaceC12713l;
import defpackage.InterfaceC4716l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C17440l(25);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC4716l f37l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f38l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f39l = new Object();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public InterfaceC12713l f40l = null;

    public MediaSessionCompat$Token(Object obj, InterfaceC4716l interfaceC4716l) {
        this.f38l = obj;
        this.f37l = interfaceC4716l;
    }

    public final void crashlytics(InterfaceC12713l interfaceC12713l) {
        synchronized (this.f39l) {
            this.f40l = interfaceC12713l;
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
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).f38l;
        Object obj3 = this.f38l;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f38l;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final void loadAd(InterfaceC4716l interfaceC4716l) {
        synchronized (this.f39l) {
            this.f37l = interfaceC4716l;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f38l, i);
    }

    public final InterfaceC4716l yandex() {
        InterfaceC4716l interfaceC4716l;
        synchronized (this.f39l) {
            interfaceC4716l = this.f37l;
        }
        return interfaceC4716l;
    }
}
