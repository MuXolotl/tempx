package defpackage;

/* JADX INFO: renamed from: lؚؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7050l extends C17655l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC1186l f14779l;

    public C7050l(String str, C13708l c13708l) {
        super(str, null, false, 1);
        this.f14779l = AbstractC1186l.Signature(c13708l);
    }

    @Override // defpackage.C17655l, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        AbstractC1186l abstractC1186l = this.f14779l;
        if (abstractC1186l.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + abstractC1186l;
    }
}
