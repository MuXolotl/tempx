package defpackage;

/* JADX INFO: renamed from: lؒ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1121l implements InterfaceC14742l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C10539l f3074l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f3075l = AbstractC1805l.amazon();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14742l f3076l;

    public C1121l(C10539l c10539l, InterfaceC14742l interfaceC14742l) {
        this.f3074l = c10539l;
        this.f3076l = interfaceC14742l;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            this.f3076l.close();
        } else {
            AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void mo824final(int i, String str) {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            this.f3076l.mo824final(i, str);
        } else {
            AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC14742l
    public final void firebase(int i, long j) {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            this.f3076l.firebase(i, j);
        } else {
            AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC14742l
    public final byte[] getBlob(int i) {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            return this.f3076l.getBlob(i);
        }
        AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    public final int getColumnCount() {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            return this.f3076l.getColumnCount();
        }
        AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    public final String getColumnName(int i) {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            return this.f3076l.getColumnName(i);
        }
        AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    public final long getLong(int i) {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            return this.f3076l.getLong(i);
        }
        AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final boolean mo825goto() {
        return getLong(0) != 0;
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final String mo826implements(int i) {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            return this.f3076l.mo826implements(i);
        }
        AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    public final boolean isNull(int i) {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            return this.f3076l.isNull(i);
        }
        AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final boolean mo827l() {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            return this.f3076l.mo827l();
        }
        AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.InterfaceC14742l
    public final void metrica(int i) {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            this.f3076l.metrica(i);
        } else {
            AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC14742l
    public final void reset() {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            this.f3076l.reset();
        } else {
            AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC14742l
    public final void smaato(int i, byte[] bArr) {
        if (this.f3074l.amazon.get()) {
            AbstractC13628l.smaato(21, "Statement is recycled");
            throw null;
        }
        if (this.f3075l == AbstractC1805l.amazon()) {
            this.f3076l.smaato(i, bArr);
        } else {
            AbstractC13628l.smaato(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
