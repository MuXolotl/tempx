package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؙْۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6899l extends AbstractC9453l {
    public static final Parcelable.Creator<C6899l> CREATOR = new C1800l(2);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f14439l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Double f14440l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f14441l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f14442l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f14443l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Long f14444l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f14445l;

    public C6899l(long j, Object obj, String str, String str2) {
        AbstractC1051l.billing(str);
        this.f14442l = 2;
        this.f14441l = str;
        this.f14439l = j;
        this.f14445l = str2;
        if (obj == null) {
            this.f14444l = null;
            this.f14440l = null;
            this.f14443l = null;
            return;
        }
        if (obj instanceof Long) {
            this.f14444l = (Long) obj;
            this.f14440l = null;
            this.f14443l = null;
        } else if (obj instanceof String) {
            this.f14444l = null;
            this.f14440l = null;
            this.f14443l = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                C8339l.metrica("User attribute given of un-supported type");
                throw null;
            }
            this.f14444l = null;
            this.f14440l = (Double) obj;
            this.f14443l = null;
        }
    }

    public final Object billing() {
        Long l = this.f14444l;
        if (l != null) {
            return l;
        }
        Double d = this.f14440l;
        if (d != null) {
            return d;
        }
        String str = this.f14443l;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C1800l.yandex(this, parcel);
    }

    public C6899l(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f14442l = i;
        this.f14441l = str;
        this.f14439l = j;
        this.f14444l = l;
        this.f14440l = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.f14443l = str2;
        this.f14445l = str3;
    }

    public C6899l(C3477l c3477l) {
        this(c3477l.amazon, c3477l.purchase, c3477l.crashlytics, c3477l.loadAd);
    }
}
