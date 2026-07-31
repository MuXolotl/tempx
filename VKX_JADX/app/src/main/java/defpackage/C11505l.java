package defpackage;

/* JADX INFO: renamed from: lُُۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C11505l extends Exception {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Exception f23126l;

    public C11505l(String str, Exception exc) {
        super(str);
        this.f23126l = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f23126l;
    }
}
