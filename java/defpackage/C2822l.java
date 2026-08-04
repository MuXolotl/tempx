package defpackage;

import java.security.spec.KeySpec;

/* JADX INFO: renamed from: lؘؔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2822l implements KeySpec {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C16791l f6146l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f6147l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f6148l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f6149l;

    public C2822l(C16791l c16791l, byte[] bArr) {
        if (bArr.length != 32) {
            C8339l.metrica("incorrect length for seed");
            throw null;
        }
        this.f6149l = true;
        this.f6146l = c16791l;
        this.f6148l = AbstractC14024l.crashlytics(bArr);
        this.f6147l = null;
    }

    public C2822l(C16791l c16791l, byte[] bArr, byte[] bArr2) {
        this.f6149l = false;
        this.f6146l = c16791l;
        this.f6148l = AbstractC14024l.crashlytics(bArr);
        this.f6147l = AbstractC14024l.crashlytics(bArr2);
    }
}
