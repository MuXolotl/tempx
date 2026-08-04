package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؓٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1901l extends AbstractC9453l {
    public static final Parcelable.Creator<C1901l> CREATOR = new C13546l(11);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f4319l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f4320l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f4321l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C6729l f4322l;

    public C1901l() {
        Locale locale = Locale.getDefault();
        Pattern pattern = AbstractC15091l.yandex;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        this(false, sb.toString(), false, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1901l)) {
            return false;
        }
        C1901l c1901l = (C1901l) obj;
        return this.f4321l == c1901l.f4321l && AbstractC15091l.crashlytics(this.f4320l, c1901l.f4320l) && this.f4319l == c1901l.f4319l && AbstractC15091l.crashlytics(this.f4322l, c1901l.f4322l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4321l), this.f4320l, Boolean.valueOf(this.f4319l), this.f4322l});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchOptions(relaunchIfRunning=");
        sb.append(this.f4321l);
        sb.append(", language=");
        sb.append(this.f4320l);
        sb.append(", androidReceiverCompatible: ");
        return AbstractC5020l.Signature(sb, this.f4319l, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f4321l ? 1 : 0);
        AbstractC9968l.vip(parcel, 3, this.f4320l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f4319l ? 1 : 0);
        AbstractC9968l.remoteconfig(parcel, 5, this.f4322l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C1901l(boolean z, String str, boolean z2, C6729l c6729l) {
        this.f4321l = z;
        this.f4320l = str;
        this.f4319l = z2;
        this.f4322l = c6729l;
    }
}
