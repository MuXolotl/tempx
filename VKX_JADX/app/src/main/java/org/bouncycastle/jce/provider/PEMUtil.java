package org.bouncycastle.jce.provider;

import defpackage.AbstractC13630l;
import defpackage.AbstractC15560l;
import defpackage.C18262l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Csynchronized;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class PEMUtil {
    private final String _footer1;
    private final String _footer2;
    private final String _header1;
    private final String _header2;

    public PEMUtil(String str) {
        this._header1 = AbstractC15560l.Signature("-----BEGIN ", str, "-----");
        this._header2 = AbstractC15560l.Signature("-----BEGIN X509 ", str, "-----");
        this._footer1 = AbstractC15560l.Signature("-----END ", str, "-----");
        this._footer2 = AbstractC15560l.Signature("-----END X509 ", str, "-----");
    }

    private String readLine(InputStream inputStream) throws IOException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i = inputStream.read();
            if (i == 13 || i == 10 || i < 0) {
                if (i < 0 || stringBuffer.length() != 0) {
                    break;
                }
            } else if (i != 13) {
                stringBuffer.append((char) i);
            }
        }
        if (i < 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    public Cclass readPEMObject(InputStream inputStream) throws IOException {
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            line = readLine(inputStream);
            if (line == null || line.startsWith(this._header1)) {
                break;
            }
        } while (!line.startsWith(this._header2));
        while (true) {
            String line2 = readLine(inputStream);
            if (line2 == null || line2.startsWith(this._footer1) || line2.startsWith(this._footer2)) {
                break;
            }
            stringBuffer.append(line2);
        }
        if (stringBuffer.length() != 0) {
            Ccase ccaseAds = new Csynchronized(AbstractC13630l.yandex(stringBuffer.toString())).ads();
            if (ccaseAds instanceof Cclass) {
                return (Cclass) ccaseAds;
            }
            C18262l.metrica("malformed PEM data encountered");
        }
        return null;
    }
}
