package defpackage;

/* JADX INFO: renamed from: lٕؕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C12623l.class)
public abstract class AbstractC3160l {
    public static final C18063l Companion = new C18063l();

    public abstract int amazon();

    public final void billing(int i) {
        if (amazon() == i) {
            return;
        }
        throw new C10741l(0, "Value expected to be of type " + AbstractC12900l.ad(i) + " is of unexpected type " + AbstractC12900l.ad(amazon()), null);
    }
}
