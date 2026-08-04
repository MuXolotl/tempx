package defpackage;

/* JADX INFO: renamed from: lِۛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12119l implements InterfaceC15446l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ThreadLocal f24100l;

    public C12119l(ThreadLocal threadLocal) {
        this.f24100l = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12119l) && AbstractC8576l.yandex(this.f24100l, ((C12119l) obj).f24100l);
    }

    public final int hashCode() {
        return this.f24100l.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f24100l + ')';
    }
}
