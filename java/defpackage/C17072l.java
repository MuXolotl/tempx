package defpackage;

/* JADX INFO: renamed from: lِٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C17072l extends IllegalStateException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33226l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17072l(AbstractC10022l abstractC10022l, String str) {
        super("Bad response: " + abstractC10022l + ". Text: \"" + str + '\"');
        this.f33226l = 9;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f33226l) {
            case 0:
                return null;
            default:
                return super.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17072l(String str, int i) {
        super(str);
        this.f33226l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17072l(int i) {
        super("Duplicate Content-Length header");
        this.f33226l = i;
        switch (i) {
            case 7:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17072l(int i, String str, Throwable th) {
        super(str, th);
        this.f33226l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17072l(String str) {
        super(AbstractC15560l.Signature("Content-Encoding: ", str, " unsupported."));
        this.f33226l = 12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17072l(String str, Throwable th) {
        super(AbstractC15560l.Signature("Concurrent ", str, " attempts"), th);
        this.f33226l = 2;
    }
}
