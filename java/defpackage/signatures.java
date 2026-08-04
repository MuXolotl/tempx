package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class signatures extends Ccase {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte f36568l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f36566l = new ad(2, signatures.class);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final signatures f36565l = new signatures((byte) 0);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final signatures f36567l = new signatures((byte) -1);

    public signatures(byte b) {
        this.f36568l = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static signatures applovin(applovin applovinVar) {
        String strConcat;
        if (applovinVar == 0 || (applovinVar instanceof signatures)) {
            return (signatures) applovinVar;
        }
        if (applovinVar instanceof byte[]) {
            try {
                return (signatures) f36566l.m215l((byte[]) applovinVar);
            } catch (IOException e) {
                strConcat = AbstractC5020l.adcel(e, new StringBuilder("failed to construct boolean from byte[]: "));
            }
        } else {
            strConcat = "illegal object in getInstance: ".concat(applovinVar.getClass().getName());
        }
        C8339l.metrica(strConcat);
        return null;
    }

    public static signatures premium(byte[] bArr) {
        if (bArr.length != 1) {
            C8339l.metrica("BOOLEAN value should have 1 byte in it");
            return null;
        }
        byte b = bArr[0];
        if (b != -1) {
            return b != 0 ? new signatures(b) : f36565l;
        }
        return f36567l;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(1, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    public final boolean appmetrica() {
        return this.f36568l != 0;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return appmetrica() ? 1 : 0;
    }

    @Override // defpackage.Ccase
    public final Ccase isVip() {
        return appmetrica() ? f36567l : f36565l;
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2248try(1, z);
        c7972l.m2220abstract(1);
        c7972l.m2243super(this.f36568l);
    }

    public final String toString() {
        return appmetrica() ? "TRUE" : "FALSE";
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        return (ccase instanceof signatures) && appmetrica() == ((signatures) ccase).appmetrica();
    }
}
