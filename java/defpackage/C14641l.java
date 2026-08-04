package defpackage;

/* JADX INFO: renamed from: lٔؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14641l extends AbstractC4867l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C16565l f28654l;

    public C14641l(C16565l c16565l) {
        this.f28654l = c16565l;
    }

    @Override // defpackage.AbstractC4867l
    public final String admob() {
        C5807l c5807l = (C5807l) this.f28654l.f32513l.get();
        if (c5807l == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c5807l.yandex + "]";
    }
}
