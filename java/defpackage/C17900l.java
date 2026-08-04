package defpackage;

/* JADX INFO: renamed from: l٘ٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17900l extends Exception {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Exception f34849l;

    public C17900l(String str, Exception exc) {
        super(str);
        this.f34849l = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f34849l;
    }
}
