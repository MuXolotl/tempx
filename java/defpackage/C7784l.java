package defpackage;

import java.io.Closeable;

/* JADX INFO: renamed from: lًؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7784l implements Closeable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C17721l f16305l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16231l f16306l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14740l f16307l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final CharSequence f16308l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final CharSequence f16309l;

    public C7784l(C17721l c17721l, CharSequence charSequence, CharSequence charSequence2, C14740l c14740l, C16231l c16231l) {
        this.f16307l = c14740l;
        this.f16306l = c16231l;
        this.f16305l = c17721l;
        this.f16309l = charSequence;
        this.f16308l = charSequence2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16306l.amazon();
        this.f16307l.purchase();
    }
}
