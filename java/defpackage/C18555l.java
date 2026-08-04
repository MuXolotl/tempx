package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: lۚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18555l implements InterfaceC1087l {
    public IBinder purchase;

    @Override // defpackage.InterfaceC1087l
    public final void admob(int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.purchase.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: class */
    public final void mo806class(int i, int i2, Bundle bundle, String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            AbstractC9592l.amazon(parcelObtain, bundle);
            this.purchase.transact(4001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: continue */
    public final void mo807continue(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            AbstractC9592l.amazon(parcelObtain, bundle);
            this.purchase.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    public final void firebase(int i, List list) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            if (list == null) {
                parcelObtain.writeInt(-1);
            } else {
                int i2 = ((C13708l) list).f26765l;
                parcelObtain.writeInt(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    AbstractC9592l.amazon(parcelObtain, (Parcelable) ((C13708l) list).get(i3));
                }
            }
            this.purchase.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    public final void loadAd(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            this.purchase.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo808l(int i, int i2, Bundle bundle, String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(10);
            AbstractC9592l.amazon(parcelObtain, bundle);
            this.purchase.transact(4002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: lؓۤٚ */
    public final void mo809l(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            AbstractC9592l.amazon(parcelObtain, bundle);
            this.purchase.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: lؘۛؕ */
    public final void mo810l(int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            AbstractC9592l.amazon(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.purchase.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: new */
    public final void mo811new(int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            AbstractC9592l.amazon(parcelObtain, bundle);
            AbstractC9592l.amazon(parcelObtain, bundle2);
            this.purchase.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: static */
    public final void mo812static(int i, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            AbstractC9592l.amazon(parcelObtain, bundle);
            AbstractC9592l.amazon(parcelObtain, bundle3);
            this.purchase.transact(3005, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: this */
    public final void mo813this(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            AbstractC9592l.amazon(parcelObtain, bundle);
            this.purchase.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: throw */
    public final void mo814throw(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            AbstractC9592l.amazon(parcelObtain, bundle);
            this.purchase.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: throws */
    public final void mo815throws(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            AbstractC9592l.amazon(parcelObtain, bundle);
            this.purchase.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC1087l
    public final void yandex() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(0);
            this.purchase.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
