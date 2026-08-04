package defpackage;

import java.io.EOFException;

/* JADX INFO: renamed from: lًؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3972l implements InterfaceC14189l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C18476l f8158l = new C18476l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f8159l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1849l f8160l;

    public C3972l(C1849l c1849l) {
        this.f8160l = c1849l;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws EOFException {
        if (this.f8159l) {
            return;
        }
        this.f8159l = true;
        this.f8160l.f4253l = true;
        C18476l c18476l = this.f8158l;
        c18476l.skip(c18476l.f36079l);
    }

    @Override // defpackage.InterfaceC14189l
    public final C18476l crashlytics() {
        return this.f8158l;
    }

    @Override // defpackage.InterfaceC16090l
    /* JADX INFO: renamed from: extends */
    public final long mo1064extends(C18476l c18476l, long j) {
        if (this.f8159l) {
            C8339l.smaato("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount: "));
            return 0L;
        }
        C18476l c18476l2 = this.f8158l;
        if (c18476l2.f36079l == 0 && this.f8160l.mo1064extends(c18476l2, 8192L) == -1) {
            return -1L;
        }
        return c18476l2.mo1064extends(c18476l, Math.min(j, c18476l2.f36079l));
    }

    @Override // defpackage.InterfaceC14189l
    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final int mo1455l(int i, int i2, byte[] bArr) {
        AbstractC17463l.crashlytics(bArr.length, i, i2);
        C18476l c18476l = this.f8158l;
        if (c18476l.f36079l == 0 && this.f8160l.mo1064extends(c18476l, 8192L) == -1) {
            return -1;
        }
        return c18476l.mo1455l(i, ((int) Math.min(i2 - i, c18476l.f36079l)) + i, bArr);
    }

    @Override // defpackage.InterfaceC14189l
    public final byte readByte() throws EOFException {
        subscription(1L);
        return this.f8158l.readByte();
    }

    @Override // defpackage.InterfaceC14189l
    public final boolean request(long j) {
        C18476l c18476l;
        if (this.f8159l) {
            C8339l.smaato("Source is closed.");
            return false;
        }
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount: "));
            return false;
        }
        do {
            c18476l = this.f8158l;
            if (c18476l.f36079l >= j) {
                return true;
            }
        } while (this.f8160l.mo1064extends(c18476l, 8192L) != -1);
        return false;
    }

    @Override // defpackage.InterfaceC14189l
    public final boolean subs() {
        if (this.f8159l) {
            C8339l.smaato("Source is closed.");
            return false;
        }
        C18476l c18476l = this.f8158l;
        return c18476l.subs() && this.f8160l.mo1064extends(c18476l, 8192L) == -1;
    }

    @Override // defpackage.InterfaceC14189l
    public final void subscription(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException(AbstractC2812l.subscription(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    public final String toString() {
        return "buffered(" + this.f8160l + ')';
    }
}
