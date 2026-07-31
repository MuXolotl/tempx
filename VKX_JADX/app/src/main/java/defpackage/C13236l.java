package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٌْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13236l extends AbstractC9453l {
    public static final Parcelable.Creator<C13236l> CREATOR = new C13546l(7);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f26008l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16021l f26009l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f26010l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f26011l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f26012l;

    public C13236l(C13236l c13236l, long j, long j2) {
        AbstractC1051l.subs(c13236l);
        this.f26010l = c13236l.f26010l;
        this.f26009l = c13236l.f26009l;
        this.f26008l = c13236l.f26008l;
        this.f26012l = j;
        this.f26011l = j2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f26009l);
        String str = this.f26008l;
        int length = String.valueOf(str).length();
        String str2 = this.f26010l;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        AbstractC9361l.appmetrica(sb, "origin=", str, ",name=", str2);
        return AbstractC0653l.ads(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C13546l.yandex(this, parcel, i);
    }

    public C13236l(String str, C16021l c16021l, String str2, long j, long j2) {
        this.f26010l = str;
        this.f26009l = c16021l;
        this.f26008l = str2;
        this.f26012l = j;
        this.f26011l = j2;
    }
}
