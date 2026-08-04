package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;

/* JADX INFO: renamed from: lَ۟ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10602l extends AbstractC9453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final PendingIntent f21519l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f21520l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f21521l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Integer f21522l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f21523l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C10602l f21518l = new C10602l(0, null, null);
    public static final Parcelable.Creator<C10602l> CREATOR = new C15160l(0);

    public C10602l(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.f21521l = i;
        this.f21520l = i2;
        this.f21519l = pendingIntent;
        this.f21523l = str;
        this.f21522l = num;
    }

    public static String billing(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        return "SIGN_IN_FAILED";
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        return "SERVICE_UPDATING";
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10602l)) {
            return false;
        }
        C10602l c10602l = (C10602l) obj;
        return this.f21520l == c10602l.f21520l && AbstractC7236l.amazon(this.f21519l, c10602l.f21519l) && AbstractC7236l.amazon(this.f21523l, c10602l.f21523l) && AbstractC7236l.amazon(this.f21522l, c10602l.f21522l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21520l), this.f21519l, this.f21523l, this.f21522l});
    }

    public final String toString() {
        C13568l c13568l = new C13568l(this);
        c13568l.loadAd(billing(this.f21520l), "statusCode");
        c13568l.loadAd(this.f21519l, "resolution");
        c13568l.loadAd(this.f21523l, "message");
        c13568l.loadAd(this.f21522l, "clientMethodKey");
        return c13568l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f21521l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f21520l);
        AbstractC9968l.remoteconfig(parcel, 3, this.f21519l, i);
        AbstractC9968l.vip(parcel, 4, this.f21523l);
        AbstractC9968l.firebase(parcel, 5, this.f21522l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C10602l(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
