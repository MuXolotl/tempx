package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؓٗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1882l implements Parcelable {
    public static final Parcelable.Creator<C1882l> CREATOR = new C15160l(28);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Messenger f4311l;

    public C1882l(IBinder iBinder) {
        this.f4311l = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f4311l;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((C1882l) obj).f4311l;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f4311l;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f4311l;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
