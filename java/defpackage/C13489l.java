package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lْٚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13489l extends AbstractC15114l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8008l f26485l;

    public C13489l(C11442l c11442l, String str) {
        super(c11442l, str);
        this.f26485l = c11442l.mopub(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f26485l.close();
        this.f29650l = true;
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: final */
    public final void mo824final(int i, String str) {
        yandex();
        this.f26485l.applovin(i, str);
    }

    @Override // defpackage.InterfaceC14742l
    public final void firebase(int i, long j) {
        yandex();
        this.f26485l.firebase(i, j);
    }

    @Override // defpackage.InterfaceC14742l
    public final byte[] getBlob(int i) {
        yandex();
        AbstractC13628l.smaato(21, "no row");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    public final int getColumnCount() {
        yandex();
        return 0;
    }

    @Override // defpackage.InterfaceC14742l
    public final String getColumnName(int i) {
        yandex();
        AbstractC13628l.smaato(21, "no row");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    public final long getLong(int i) {
        yandex();
        AbstractC13628l.smaato(21, "no row");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: implements */
    public final String mo826implements(int i) {
        yandex();
        AbstractC13628l.smaato(21, "no row");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    public final boolean isNull(int i) {
        yandex();
        AbstractC13628l.smaato(21, "no row");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: lؙ۟ٙ */
    public final boolean mo827l() {
        yandex();
        this.f26485l.f16687l.execute();
        return false;
    }

    @Override // defpackage.InterfaceC14742l
    public final void metrica(int i) {
        yandex();
        this.f26485l.metrica(i);
    }

    @Override // defpackage.InterfaceC14742l
    public final void smaato(int i, byte[] bArr) {
        yandex();
        this.f26485l.smaato(i, bArr);
    }

    @Override // defpackage.InterfaceC14742l
    public final void reset() {
    }
}
