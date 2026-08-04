package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* JADX INFO: renamed from: lؑٔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0337l implements InterfaceC4725l {
    public IBinder purchase;

    @Override // defpackage.InterfaceC4725l
    public final void Signature(InterfaceC1087l interfaceC1087l, int i, Bundle bundle, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            parcelObtain.writeLong(j);
            this.purchase.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void mo424abstract(InterfaceC1087l interfaceC1087l, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.purchase.transact(3020, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void advert(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3059, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void applovin(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3024, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void mo425case(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            this.purchase.transact(3048, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void mo426default(InterfaceC1087l interfaceC1087l, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.purchase.transact(3052, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void mo427extends(InterfaceC1087l interfaceC1087l, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.purchase.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void mo428final(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3040, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void mo429for(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void mo430goto(InterfaceC1087l interfaceC1087l, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.purchase.transact(3053, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void mo431implements(InterfaceC1087l interfaceC1087l, int i, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            this.purchase.transact(3031, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void mo432instanceof(InterfaceC1087l interfaceC1087l, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.purchase.transact(3019, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void mo433interface(InterfaceC1087l interfaceC1087l, int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            this.purchase.transact(3030, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void mo434l(InterfaceC1087l interfaceC1087l, int i, boolean z, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(i2);
            this.purchase.transact(3054, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public final void mo435l(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3034, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public final void mo436l(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3005, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public final void mo437l(InterfaceC1087l interfaceC1087l, int i, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeLong(j);
            this.purchase.transact(3038, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public final void mo438l(InterfaceC1087l interfaceC1087l, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.purchase.transact(3022, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public final void mo439l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            this.purchase.transact(3027, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public final void mo440l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            parcelObtain.writeInt(1);
            this.purchase.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public final void mo441l(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3035, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final void mo442l(InterfaceC1087l interfaceC1087l, int i, Surface surface) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, surface);
            this.purchase.transact(3044, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final void mo443l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            this.purchase.transact(3015, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public final void mo444l(InterfaceC1087l interfaceC1087l) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            this.purchase.transact(3045, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lًَٙ, reason: contains not printable characters */
    public final void mo445l(InterfaceC1087l interfaceC1087l, int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            this.purchase.transact(3055, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final void mo446l(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3021, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public final void mo447l(InterfaceC1087l interfaceC1087l, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.purchase.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lُٔۨ, reason: contains not printable characters */
    public final void mo448l(InterfaceC1087l interfaceC1087l, int i, int i2, int i3, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(i4);
            this.purchase.transact(3023, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public final void mo449l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            this.purchase.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final void mo450l(InterfaceC1087l interfaceC1087l, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.purchase.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public final void mo451l(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3042, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public final void mo452l(InterfaceC1087l interfaceC1087l, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.purchase.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public final void mo453l(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3026, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final void mo454l(InterfaceC1087l interfaceC1087l, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.purchase.transact(3037, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final void mo455l(InterfaceC1087l interfaceC1087l, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.purchase.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    public final void mo456l(InterfaceC1087l interfaceC1087l, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.purchase.transact(3017, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final void mo457l(InterfaceC1087l interfaceC1087l, int i, Surface surface, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, surface);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.purchase.transact(3061, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final void mo458l(InterfaceC1087l interfaceC1087l, int i, int i2, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeStrongBinder(iBinder);
            this.purchase.transact(3032, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final void mo459l(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3046, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public final void mo460l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            AbstractC9307l.loadAd(parcelObtain, bundle2);
            this.purchase.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final void mo461l(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3036, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final void mo462l(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            this.purchase.transact(3033, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void metrica(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3025, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void mo463native(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3043, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void mo464package(InterfaceC1087l interfaceC1087l, int i, Bundle bundle, Bundle bundle2, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            AbstractC9307l.loadAd(parcelObtain, bundle2);
            parcelObtain.writeInt(z ? 1 : 0);
            this.purchase.transact(3060, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void mo465private(InterfaceC1087l interfaceC1087l, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.purchase.transact(3028, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void mo466protected(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3047, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void remoteconfig(InterfaceC1087l interfaceC1087l, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.purchase.transact(3057, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void smaato(InterfaceC1087l interfaceC1087l, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            this.purchase.transact(3014, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void mo467strictfp(InterfaceC1087l interfaceC1087l, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.purchase.transact(3051, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void mo468super(InterfaceC1087l interfaceC1087l, int i, IBinder iBinder, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            this.purchase.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void mo469switch(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3041, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void tapsense(InterfaceC1087l interfaceC1087l, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            this.purchase.transact(3058, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void mo470transient(InterfaceC1087l interfaceC1087l, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.purchase.transact(3062, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void mo471try(InterfaceC1087l interfaceC1087l, int i, int i2, int i3, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeStrongBinder(iBinder);
            this.purchase.transact(3056, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    public final void vip(InterfaceC1087l interfaceC1087l, int i, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            AbstractC9307l.loadAd(parcelObtain, bundle);
            this.purchase.transact(3049, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void mo472volatile(InterfaceC1087l interfaceC1087l, int i, IBinder iBinder, int i2, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            this.purchase.transact(3012, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4725l
    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final void mo473while(InterfaceC1087l interfaceC1087l, int i, int i2, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1087l);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            this.purchase.transact(3039, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
