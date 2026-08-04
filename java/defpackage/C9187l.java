package defpackage;

/* JADX INFO: renamed from: lٌۦؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9187l extends C10604l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f18893l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9187l(C10604l c10604l, int i) {
        super(AbstractC9008l.yandex(c10604l.f21525l));
        this.f18893l = i;
        switch (i) {
            case 1:
                super(AbstractC9008l.yandex(c10604l.f21525l));
                break;
            default:
                break;
        }
    }

    @Override // defpackage.C10604l
    public final String toString() {
        int i = this.f18893l;
        byte[] bArr = this.f21525l;
        switch (i) {
            case 0:
                return "NetscapeRevocationURL: ".concat(AbstractC9008l.yandex(bArr));
            default:
                return "VerisignCzagExtension: ".concat(AbstractC9008l.yandex(bArr));
        }
    }
}
