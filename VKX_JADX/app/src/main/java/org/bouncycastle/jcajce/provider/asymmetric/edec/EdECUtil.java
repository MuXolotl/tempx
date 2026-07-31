package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC12900l;
import defpackage.AbstractC7678l;
import defpackage.AbstractC7799l;
import defpackage.AbstractC8831l;
import defpackage.C17029l;
import defpackage.C2756l;
import defpackage.Ccase;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class EdECUtil {
    public static AbstractC8831l generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof BCXDHPrivateKey) {
            return ((BCXDHPrivateKey) privateKey).engineGetKeyParameters();
        }
        if (privateKey instanceof BCEdDSAPrivateKey) {
            return ((BCEdDSAPrivateKey) privateKey).engineGetKeyParameters();
        }
        try {
            byte[] encoded = privateKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EdEC/XDH private key");
            }
            if (encoded.length != 0) {
                return AbstractC7799l.yandex(C2756l.vip(Ccase.advert(encoded)));
            }
            throw new IllegalArgumentException("privateKeyInfoData array empty");
        } catch (Exception e) {
            throw new InvalidKeyException(AbstractC12900l.admob(e, new StringBuilder("cannot identify EdEC/XDH private key: ")));
        }
    }

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCXDHPublicKey) {
            return ((BCXDHPublicKey) publicKey).engineGetKeyParameters();
        }
        if (publicKey instanceof BCEdDSAPublicKey) {
            return ((BCEdDSAPublicKey) publicKey).engineGetKeyParameters();
        }
        try {
            byte[] encoded = publicKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EdEC/XDH public key");
            }
            HashMap map = AbstractC7678l.yandex;
            if (encoded.length != 0) {
                return AbstractC7678l.yandex(C17029l.vip(Ccase.advert(encoded)));
            }
            throw new IllegalArgumentException("keyInfoData array empty");
        } catch (Exception e) {
            throw new InvalidKeyException(AbstractC12900l.admob(e, new StringBuilder("cannot identify EdEC/XDH public key: ")));
        }
    }
}
