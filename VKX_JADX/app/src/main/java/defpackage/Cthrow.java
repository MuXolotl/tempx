package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: throw, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cthrow extends Ccase implements Ccatch {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f36593l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f36592l = new ad(14, Cthrow.class);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final byte[] f36591l = new byte[0];

    public Cthrow(byte[] bArr) {
        if (bArr != null) {
            this.f36593l = bArr;
        } else {
            C6541l.subs("'string' cannot be null");
            throw null;
        }
    }

    public static Cthrow premium(Object obj) {
        String strAdcel;
        if (obj == null || (obj instanceof Cthrow)) {
            return (Cthrow) obj;
        }
        if (!(obj instanceof applovin)) {
            if (obj instanceof byte[]) {
                try {
                    return (Cthrow) f36592l.m215l((byte[]) obj);
                } catch (IOException e) {
                    strAdcel = AbstractC5020l.adcel(e, new StringBuilder("failed to construct OCTET STRING from byte[]: "));
                }
            }
            C8339l.metrica(strAdcel);
            return null;
        }
        Ccase ccaseBilling = ((applovin) obj).billing();
        if (ccaseBilling instanceof Cthrow) {
            return (Cthrow) ccaseBilling;
        }
        strAdcel = "illegal object in getInstance: ".concat(obj.getClass().getName());
        C8339l.metrica(strAdcel);
        return null;
    }

    @Override // defpackage.Ccatch
    public final InputStream amazon() {
        return new ByteArrayInputStream(this.f36593l);
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f36593l);
    }

    @Override // defpackage.Ccase
    public Ccase isVip() {
        return new C11327l(this.f36593l);
    }

    @Override // defpackage.Ccase
    public Ccase signatures() {
        return new C11327l(this.f36593l);
    }

    public final String toString() {
        C1561l c1561l = AbstractC8535l.yandex;
        byte[] bArr = this.f36593l;
        return "#".concat(AbstractC9008l.yandex(AbstractC8535l.amazon(0, bArr.length, bArr)));
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof Cthrow) {
            return Arrays.equals(this.f36593l, ((Cthrow) ccase).f36593l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC12254l
    public final Ccase smaato() {
        return this;
    }
}
