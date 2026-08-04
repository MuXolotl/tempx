package defpackage;

/* JADX INFO: renamed from: lٓ۠٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14461l implements InterfaceC10466l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f28328l;

    public /* synthetic */ C14461l(Object obj) {
        this.f28328l = obj;
    }

    public static C14461l yandex(Object obj) {
        if (obj != null) {
            return new C14461l(obj);
        }
        C6541l.subs("instance cannot be null");
        return null;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return this.f28328l;
    }
}
