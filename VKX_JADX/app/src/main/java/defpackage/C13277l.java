package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lَْۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13277l extends CancellationException {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f26059l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f26060l;

    public C13277l(String str, int i) {
        super(str);
        this.f26060l = str;
        this.f26059l = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f26060l;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.f26060l);
        sb.append(", ");
        return AbstractC0653l.adcel(sb, this.f26059l, ')');
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
