package defpackage;

/* JADX INFO: renamed from: lَۨۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10741l extends AbstractC18447l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21750l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10741l(int i, String str, Throwable th) {
        super(str, th);
        this.f21750l = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        switch (this.f21750l) {
            case 0:
                return "BsonInvalidOperationException(message=" + getMessage() + ", cause=" + getCause() + ')';
            default:
                StringBuilder sb = new StringBuilder("BsonSerializationException(message=");
                sb.append(getMessage());
                sb.append(", cause=");
                Throwable cause = getCause();
                return AbstractC2812l.tapsense(sb, cause != null ? cause.getMessage() : null, ')');
        }
    }
}
