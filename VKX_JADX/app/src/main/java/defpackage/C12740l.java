package defpackage;

/* JADX INFO: renamed from: lّٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12740l implements InterfaceC9595l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f25105l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC10687l f25106l;

    public C12740l(InterfaceC10687l interfaceC10687l, long j) {
        this.f25106l = interfaceC10687l;
        this.f25105l = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12740l) {
            C12740l c12740l = (C12740l) obj;
            return AbstractC8576l.yandex(this.f25106l, c12740l.f25106l) && this.f25105l == c12740l.f25105l;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f25106l.hashCode() * 31) + 1237) * 31;
        long j = this.f25105l;
        return (((int) (j ^ (j >>> 32))) + iHashCode) * 31;
    }

    @Override // defpackage.InterfaceC9595l
    public final int inmobi() {
        return 0;
    }

    @Override // defpackage.InterfaceC9595l
    public final boolean isVip() {
        return false;
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.f25106l + ", wasImageCaptured=false, frameNumber=" + ((Object) C1266l.yandex(this.f25105l)) + ", reason=0)";
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        return null;
    }
}
