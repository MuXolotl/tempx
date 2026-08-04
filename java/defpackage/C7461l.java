package defpackage;

import java.security.spec.KeySpec;

/* JADX INFO: renamed from: lؚۗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7461l implements KeySpec {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7610l f15430l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f15431l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f15432l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f15433l;

    public C7461l(C7610l c7610l, byte[] bArr) {
        if (bArr.length != 64) {
            C8339l.metrica("incorrect length for seed");
            throw null;
        }
        this.f15433l = true;
        this.f15430l = c7610l;
        this.f15432l = AbstractC14024l.crashlytics(bArr);
        this.f15431l = null;
    }

    public C7461l(C7610l c7610l, byte[] bArr, byte[] bArr2) {
        this.f15433l = false;
        this.f15430l = c7610l;
        this.f15432l = AbstractC14024l.crashlytics(bArr);
        this.f15431l = AbstractC14024l.crashlytics(bArr2);
    }
}
