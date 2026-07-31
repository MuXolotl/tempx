package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC17160l;
import defpackage.AbstractC6432l;
import defpackage.AbstractC8831l;
import defpackage.C10198l;
import defpackage.C17029l;
import defpackage.C2756l;
import defpackage.C8339l;
import defpackage.Cinterface;
import defpackage.applovin;

/* JADX INFO: loaded from: classes3.dex */
public class KeyUtil {
    public static byte[] getEncodedPrivateKeyInfo(AbstractC8831l abstractC8831l, Cinterface cinterface) {
        if (abstractC8831l.f18137l) {
            try {
                return getEncodedPrivateKeyInfo(AbstractC17160l.yandex(abstractC8831l, cinterface));
            } catch (Exception unused) {
                return null;
            }
        }
        C8339l.metrica("public key found");
        return null;
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(AbstractC8831l abstractC8831l) {
        if (abstractC8831l.f18137l) {
            C8339l.metrica("private key found");
            return null;
        }
        try {
            return getEncodedSubjectPublicKeyInfo(AbstractC6432l.yandex(abstractC8831l));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(C10198l c10198l, applovin applovinVar) {
        try {
            return getEncodedPrivateKeyInfo(new C2756l(c10198l, applovinVar.billing(), (Cinterface) null, (byte[]) null));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(C10198l c10198l, byte[] bArr) {
        try {
            return getEncodedSubjectPublicKeyInfo(new C17029l(c10198l, bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(C10198l c10198l, applovin applovinVar) {
        try {
            return getEncodedSubjectPublicKeyInfo(new C17029l(c10198l, applovinVar));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(C2756l c2756l) {
        try {
            return c2756l.remoteconfig("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(C17029l c17029l) {
        try {
            return c17029l.remoteconfig("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
