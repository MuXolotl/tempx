package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lؓؕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1611l implements InterfaceC11449l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14785l f3926l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f3927l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f3928l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f3929l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f3930l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f3931l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8688l f3932l = new C8688l(new C7730l(3, this));

    public C1611l(Context context, String str, C14785l c14785l, boolean z, boolean z2) {
        this.f3929l = context;
        this.f3928l = str;
        this.f3926l = c14785l;
        this.f3931l = z;
        this.f3930l = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C8688l c8688l = this.f3932l;
        if (c8688l.yandex()) {
            ((C10894l) c8688l.getValue()).close();
        }
    }

    @Override // defpackage.InterfaceC11449l
    public final String getDatabaseName() {
        return this.f3928l;
    }

    @Override // defpackage.InterfaceC11449l
    public final void setWriteAheadLoggingEnabled(boolean z) {
        C8688l c8688l = this.f3932l;
        if (c8688l.yandex()) {
            ((C10894l) c8688l.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.f3927l = z;
    }

    @Override // defpackage.InterfaceC11449l
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final C11442l mo966this() {
        return ((C10894l) this.f3932l.getValue()).yandex(true);
    }
}
