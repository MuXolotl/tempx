package defpackage;

/* JADX INFO: renamed from: lؓؐۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C1538l extends AbstractC13674l implements InterfaceC18660l, InterfaceC5059l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f3813l;

    public C1538l(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f3813l = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1538l) {
            C1538l c1538l = (C1538l) obj;
            return this.f26701l.equals(c1538l.f26701l) && this.f26700l.equals(c1538l.f26700l) && AbstractC8576l.yandex(this.f26698l, c1538l.f26698l) && AbstractC8576l.yandex(premium(), c1538l.premium());
        }
        if (obj instanceof InterfaceC5059l) {
            return obj.equals(subs());
        }
        return false;
    }

    @Override // defpackage.AbstractC13674l, defpackage.InterfaceC6902l, defpackage.InterfaceC5059l
    public final boolean firebase() {
        return ((InterfaceC5059l) super.mo965synchronized()).firebase();
    }

    @Override // defpackage.InterfaceC18660l
    public final int getArity() {
        return this.f3813l;
    }

    public final int hashCode() {
        return this.f26700l.hashCode() + AbstractC12589l.advert(premium() == null ? 0 : premium().hashCode() * 31, 31, this.f26701l);
    }

    @Override // defpackage.AbstractC13674l
    public final InterfaceC6902l pro() {
        return AbstractC18202l.yandex.yandex(this);
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean purchase() {
        return ((InterfaceC5059l) super.mo965synchronized()).purchase();
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean signatures() {
        return ((InterfaceC5059l) super.mo965synchronized()).signatures();
    }

    @Override // defpackage.AbstractC13674l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final InterfaceC6902l mo965synchronized() {
        return (InterfaceC5059l) super.mo965synchronized();
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean tapsense() {
        return ((InterfaceC5059l) super.mo965synchronized()).tapsense();
    }

    public final String toString() {
        InterfaceC6902l interfaceC6902lSubs = subs();
        if (interfaceC6902lSubs != this) {
            return interfaceC6902lSubs.toString();
        }
        String str = this.f26701l;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC15560l.Signature("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean vip() {
        return ((InterfaceC5059l) super.mo965synchronized()).vip();
    }

    public C1538l(int i, Class cls, String str, String str2, int i2) {
        this(i, C11128l.f22339l, cls, str, str2, i2, 0);
    }
}
