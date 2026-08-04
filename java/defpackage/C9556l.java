package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;

/* JADX INFO: renamed from: lٍٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9556l implements PublicKey {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10198l f19472l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f19473l;

    public C9556l(Cfor cfor, PublicKey... publicKeyArr) {
        this.f19472l = new C10198l(cfor);
        if (publicKeyArr.length == 0) {
            C8339l.metrica("at least one public key must be provided for the composite public key");
            throw null;
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        for (PublicKey publicKey : publicKeyArr) {
            arrayList.add(publicKey);
        }
        this.f19473l = DesugarCollections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9556l)) {
            return false;
        }
        C9556l c9556l = (C9556l) obj;
        return this.f19472l.equals(c9556l.f19472l) && this.f19473l.equals(c9556l.f19473l);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return CompositeIndex.getAlgorithmName(this.f19472l.f20787l);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        StringBuilder sb;
        applovin applovinVar;
        C10198l c10198l = this.f19472l;
        Cfor cfor = c10198l.f20787l;
        boolean zM195strictfp = cfor.m195strictfp(InterfaceC6796l.purchase);
        List list = this.f19473l;
        if (zM195strictfp) {
            try {
                C13353l c13353l = new C13353l(AbstractC14024l.mopub(C17029l.vip(((PublicKey) list.get(0)).getEncoded()).f33174l.inmobi(), C17029l.vip(((PublicKey) list.get(1)).getEncoded()).f33174l.inmobi()), 0);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C11138l c11138l = new C11138l(c10198l, c13353l);
                c11138l.f22357l = -1;
                c11138l.tapsense(byteArrayOutputStream, "DER");
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                e = e;
                sb = new StringBuilder("unable to encode composite public key: ");
            }
        } else {
            appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
            for (int i = 0; i < list.size(); i++) {
                C17029l c17029lVip = C17029l.vip(((PublicKey) list.get(i)).getEncoded());
                if (!InterfaceC4787l.license.ad(cfor)) {
                    applovinVar = c17029lVip;
                    applovinVar = c17029lVip.f33174l;
                }
                applovinVar = c17029lVip;
                appmetricaVar.purchase(applovinVar);
            }
            try {
                C11138l c11138l2 = new C11138l(appmetricaVar);
                c11138l2.f22357l = -1;
                C13353l c13353l2 = new C13353l(c11138l2.remoteconfig("DER"), 0);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                C11138l c11138l3 = new C11138l(c10198l, c13353l2);
                c11138l3.f22357l = -1;
                c11138l3.tapsense(byteArrayOutputStream2, "DER");
                return byteArrayOutputStream2.toByteArray();
            } catch (IOException e2) {
                e = e2;
                sb = new StringBuilder("unable to encode composite public key: ");
            }
        }
        C8339l.smaato(AbstractC5020l.adcel(e, sb));
        return null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.f19473l.hashCode() ^ this.f19472l.hashCode();
    }
}
