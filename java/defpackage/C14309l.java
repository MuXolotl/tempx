package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٓٞۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14309l implements Parcelable {
    public static final Parcelable.Creator<C14309l> CREATOR = new C17440l(12);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final String f28000l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f28001l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f28002l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f28003l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f28004l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f28005l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f28006l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f28007l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f28008l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f28009l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f28010l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f28011l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f28012l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final boolean f28013l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f28014l;

    public C14309l(Parcel parcel) {
        this.f28005l = parcel.readString();
        this.f28004l = parcel.readString();
        this.f28001l = parcel.readInt() != 0;
        this.f28009l = parcel.readInt() != 0;
        this.f28008l = parcel.readInt();
        this.f28012l = parcel.readInt();
        this.f28002l = parcel.readString();
        this.f28003l = parcel.readInt() != 0;
        this.f28011l = parcel.readInt() != 0;
        this.f28006l = parcel.readInt() != 0;
        this.f28013l = parcel.readInt() != 0;
        this.f28010l = parcel.readInt();
        this.f28000l = parcel.readString();
        this.f28014l = parcel.readInt();
        this.f28007l = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f28005l);
        sb.append(" (");
        sb.append(this.f28004l);
        sb.append(")}:");
        if (this.f28001l) {
            sb.append(" fromLayout");
        }
        if (this.f28009l) {
            sb.append(" dynamicContainer");
        }
        int i = this.f28012l;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f28002l;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f28003l) {
            sb.append(" retainInstance");
        }
        if (this.f28011l) {
            sb.append(" removing");
        }
        if (this.f28006l) {
            sb.append(" detached");
        }
        if (this.f28013l) {
            sb.append(" hidden");
        }
        String str2 = this.f28000l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f28014l);
        }
        if (this.f28007l) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28005l);
        parcel.writeString(this.f28004l);
        parcel.writeInt(this.f28001l ? 1 : 0);
        parcel.writeInt(this.f28009l ? 1 : 0);
        parcel.writeInt(this.f28008l);
        parcel.writeInt(this.f28012l);
        parcel.writeString(this.f28002l);
        parcel.writeInt(this.f28003l ? 1 : 0);
        parcel.writeInt(this.f28011l ? 1 : 0);
        parcel.writeInt(this.f28006l ? 1 : 0);
        parcel.writeInt(this.f28013l ? 1 : 0);
        parcel.writeInt(this.f28010l);
        parcel.writeString(this.f28000l);
        parcel.writeInt(this.f28014l);
        parcel.writeInt(this.f28007l ? 1 : 0);
    }

    public C14309l(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        this.f28005l = abstractComponentCallbacksC4411l.getClass().getName();
        this.f28004l = abstractComponentCallbacksC4411l.f8974l;
        this.f28001l = abstractComponentCallbacksC4411l.f8986l;
        this.f28009l = abstractComponentCallbacksC4411l.f8959l;
        this.f28008l = abstractComponentCallbacksC4411l.f8962l;
        this.f28012l = abstractComponentCallbacksC4411l.f8970l;
        this.f28002l = abstractComponentCallbacksC4411l.f8978l;
        this.f28003l = abstractComponentCallbacksC4411l.f8977l;
        this.f28011l = abstractComponentCallbacksC4411l.f8980l;
        this.f28006l = abstractComponentCallbacksC4411l.f8969l;
        this.f28013l = abstractComponentCallbacksC4411l.f8947l;
        this.f28010l = abstractComponentCallbacksC4411l.f8948l.ordinal();
        this.f28000l = abstractComponentCallbacksC4411l.f8956l;
        this.f28014l = abstractComponentCallbacksC4411l.f8982l;
        this.f28007l = abstractComponentCallbacksC4411l.f8985l;
    }
}
