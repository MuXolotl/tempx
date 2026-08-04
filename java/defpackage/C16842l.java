package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;

/* JADX INFO: renamed from: lٗؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16842l implements PrivateKey {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10198l f32870l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f32871l;

    public C16842l(Cfor cfor, PrivateKey... privateKeyArr) {
        this.f32870l = new C10198l(cfor);
        if (privateKeyArr.length == 0) {
            C8339l.metrica("at least one private key must be provided for the composite private key");
            throw null;
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        for (PrivateKey privateKey : privateKeyArr) {
            if (privateKey instanceof InterfaceC17813l) {
                try {
                    privateKey = ((InterfaceC17813l) privateKey).getPrivateKey(true);
                } catch (Exception unused) {
                }
            }
            arrayList.add(privateKey);
        }
        this.f32871l = DesugarCollections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16842l) {
            C16842l c16842l = (C16842l) obj;
            if (c16842l.f32870l.equals(this.f32870l) && this.f32871l.equals(c16842l.f32871l)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return CompositeIndex.getAlgorithmName(this.f32870l.f20787l);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        StringBuilder sb;
        byte[] bArrRemoteconfig;
        C10198l c10198l = this.f32870l;
        Cfor cfor = c10198l.f20787l;
        boolean zM195strictfp = cfor.m195strictfp(InterfaceC6796l.purchase);
        int i = 0;
        List list = this.f32871l;
        if (zM195strictfp) {
            try {
                PrivateKey privateKey = (PrivateKey) list.get(0);
                PrivateKey privateKey2 = (PrivateKey) list.get(1);
                byte[] seed = ((InterfaceC17813l) privateKey).getSeed();
                C2756l c2756lVip = C2756l.vip(privateKey2.getEncoded());
                String algorithm = privateKey2.getAlgorithm();
                if (algorithm.contains("Ed")) {
                    bArrRemoteconfig = Cthrow.premium(c2756lVip.ads()).f36593l;
                } else if (algorithm.contains("EC")) {
                    C7154l c7154lVip = C7154l.vip(c2756lVip.ads());
                    if (c7154lVip.tapsense() != null) {
                        c7154lVip = new C7154l((Cthrow) c7154lVip.f14964l.mo173throws(1), c7154lVip.ads(0, -1));
                    }
                    bArrRemoteconfig = c7154lVip.remoteconfig("DER");
                } else {
                    bArrRemoteconfig = c2756lVip.metrica().f36593l;
                }
                return new C2756l(c10198l, AbstractC14024l.mopub(seed, bArrRemoteconfig), (Cinterface) null, (byte[]) null).getEncoded();
            } catch (IOException e) {
                e = e;
                sb = new StringBuilder("unable to encode composite public key: ");
            }
        } else {
            appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
            if (InterfaceC4787l.license.ad(cfor)) {
                while (i < list.size()) {
                    appmetricaVar.purchase(C2756l.vip(((PrivateKey) list.get(i)).getEncoded()));
                    i++;
                }
                try {
                    C11138l c11138l = new C11138l(appmetricaVar);
                    c11138l.f22357l = -1;
                    return new C2756l(c10198l, c11138l, (Cinterface) null, (byte[]) null).remoteconfig("DER");
                } catch (IOException e2) {
                    e = e2;
                    sb = new StringBuilder("unable to encode composite private key: ");
                }
            } else {
                byte[] bArrMopub = null;
                while (i < list.size()) {
                    bArrMopub = AbstractC14024l.mopub(bArrMopub, C2756l.vip(((PrivateKey) list.get(i)).getEncoded()).metrica().f36593l);
                    i++;
                }
                try {
                    return new C2756l(c10198l, bArrMopub, (Cinterface) null, (byte[]) null).remoteconfig("DER");
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder("unable to encode composite private key: ");
                }
            }
        }
        C8339l.smaato(AbstractC5020l.adcel(e, sb));
        return null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.f32871l.hashCode();
    }
}
