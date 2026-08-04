package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٖۜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16657l extends AbstractC9453l {
    public static final Parcelable.Creator<C16657l> CREATOR;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public static final C13038l f32623l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public static final int[] f32624l;

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final boolean f32625l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final int f32626l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final int f32627l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f32628l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f32629l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f32630l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final int f32631l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final int f32632l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f32633l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final int f32634l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final int f32635l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int[] f32636l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f32637l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final int f32638l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final int f32639l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final int f32640l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final int f32641l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final int f32642l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f32643l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final int f32644l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f32645l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f32646l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final int f32647l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final int f32648l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f32649l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final C0595l f32650l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f32651l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f32652l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f32653l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final boolean f32654l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f32655l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final int f32656l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f32657l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final int f32658l;

    static {
        C12525l c12525l = AbstractC0933l.f2615l;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i = 0; i < 2; i++) {
            AbstractC7280l.firebase(i, objArr[i]);
        }
        f32623l = AbstractC0933l.metrica(2, objArr);
        f32624l = new int[]{0, 1};
        CREATOR = new C1800l(6);
    }

    public C16657l(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        C0595l c0595l;
        this.f32637l = new ArrayList(list);
        this.f32636l = Arrays.copyOf(iArr, iArr.length);
        this.f32629l = j;
        this.f32646l = str;
        this.f32645l = i;
        this.f32652l = i2;
        this.f32630l = i3;
        this.f32633l = i4;
        this.f32651l = i5;
        this.f32643l = i6;
        this.f32653l = i7;
        this.f32649l = i8;
        this.f32628l = i9;
        this.f32655l = i10;
        this.f32644l = i11;
        this.f32634l = i12;
        this.f32639l = i13;
        this.f32657l = i14;
        this.f32638l = i15;
        this.f32632l = i16;
        this.f32631l = i17;
        this.f32627l = i18;
        this.f32658l = i19;
        this.f32635l = i20;
        this.f32642l = i21;
        this.f32648l = i22;
        this.f32626l = i23;
        this.f32641l = i24;
        this.f32647l = i25;
        this.f32656l = i26;
        this.f32640l = i27;
        this.f32625l = z;
        this.f32654l = z2;
        if (iBinder == null) {
            c0595l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            c0595l = iInterfaceQueryLocalInterface instanceof C0595l ? (C0595l) iInterfaceQueryLocalInterface : new C0595l(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 1);
        }
        this.f32650l = c0595l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.startapp(parcel, 2, this.f32637l);
        int[] iArr = this.f32636l;
        AbstractC9968l.subs(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        AbstractC9968l.subscription(parcel, 4, 8);
        parcel.writeLong(this.f32629l);
        AbstractC9968l.vip(parcel, 5, this.f32646l);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f32645l);
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(this.f32652l);
        AbstractC9968l.subscription(parcel, 8, 4);
        parcel.writeInt(this.f32630l);
        AbstractC9968l.subscription(parcel, 9, 4);
        parcel.writeInt(this.f32633l);
        AbstractC9968l.subscription(parcel, 10, 4);
        parcel.writeInt(this.f32651l);
        AbstractC9968l.subscription(parcel, 11, 4);
        parcel.writeInt(this.f32643l);
        AbstractC9968l.subscription(parcel, 12, 4);
        parcel.writeInt(this.f32653l);
        AbstractC9968l.subscription(parcel, 13, 4);
        parcel.writeInt(this.f32649l);
        AbstractC9968l.subscription(parcel, 14, 4);
        parcel.writeInt(this.f32628l);
        AbstractC9968l.subscription(parcel, 15, 4);
        parcel.writeInt(this.f32655l);
        AbstractC9968l.subscription(parcel, 16, 4);
        parcel.writeInt(this.f32644l);
        AbstractC9968l.subscription(parcel, 17, 4);
        parcel.writeInt(this.f32634l);
        AbstractC9968l.subscription(parcel, 18, 4);
        parcel.writeInt(this.f32639l);
        AbstractC9968l.subscription(parcel, 19, 4);
        parcel.writeInt(this.f32657l);
        AbstractC9968l.subscription(parcel, 20, 4);
        parcel.writeInt(this.f32638l);
        AbstractC9968l.subscription(parcel, 21, 4);
        parcel.writeInt(this.f32632l);
        AbstractC9968l.subscription(parcel, 22, 4);
        parcel.writeInt(this.f32631l);
        AbstractC9968l.subscription(parcel, 23, 4);
        parcel.writeInt(this.f32627l);
        AbstractC9968l.subscription(parcel, 24, 4);
        parcel.writeInt(this.f32658l);
        AbstractC9968l.subscription(parcel, 25, 4);
        parcel.writeInt(this.f32635l);
        AbstractC9968l.subscription(parcel, 26, 4);
        parcel.writeInt(this.f32642l);
        AbstractC9968l.subscription(parcel, 27, 4);
        parcel.writeInt(this.f32648l);
        AbstractC9968l.subscription(parcel, 28, 4);
        parcel.writeInt(this.f32626l);
        AbstractC9968l.subscription(parcel, 29, 4);
        parcel.writeInt(this.f32641l);
        AbstractC9968l.subscription(parcel, 30, 4);
        parcel.writeInt(this.f32647l);
        AbstractC9968l.subscription(parcel, 31, 4);
        parcel.writeInt(this.f32656l);
        AbstractC9968l.subscription(parcel, 32, 4);
        parcel.writeInt(this.f32640l);
        C0595l c0595l = this.f32650l;
        AbstractC9968l.admob(parcel, 33, c0595l == null ? null : c0595l.billing);
        AbstractC9968l.subscription(parcel, 34, 4);
        parcel.writeInt(this.f32625l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 35, 4);
        parcel.writeInt(this.f32654l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
