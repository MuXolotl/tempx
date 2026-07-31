package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.AbstractC13630l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15560l;
import defpackage.C18262l;
import defpackage.Cclass;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
class PEMUtil {
    private final Boundaries[] _supportedBoundaries;

    public static class Boundaries {
        private final String _footer;
        private final String _header;

        private Boundaries(String str) {
            this._header = AbstractC15560l.Signature("-----BEGIN ", str, "-----");
            this._footer = AbstractC15560l.Signature("-----END ", str, "-----");
        }

        public boolean isTheExpectedFooter(String str) {
            return str.startsWith(this._footer);
        }

        public boolean isTheExpectedHeader(String str) {
            return str.startsWith(this._header);
        }
    }

    public PEMUtil(String str) {
        this._supportedBoundaries = new Boundaries[]{new Boundaries(str), new Boundaries(AbstractC14814l.startapp("X509 ", str)), new Boundaries("PKCS7")};
    }

    private Boundaries getBoundaries(String str) {
        int i = 0;
        while (true) {
            Boundaries[] boundariesArr = this._supportedBoundaries;
            if (i == boundariesArr.length) {
                return null;
            }
            Boundaries boundaries = boundariesArr[i];
            if (boundaries.isTheExpectedHeader(str) || boundaries.isTheExpectedFooter(str)) {
                return boundaries;
            }
            i++;
        }
    }

    private String readLine(InputStream inputStream) throws IOException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i = inputStream.read();
            if (i != 13 && i != 10 && i >= 0) {
                stringBuffer.append((char) i);
            } else if (i < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
            return stringBuffer.toString();
        }
        if (i == 13) {
            inputStream.mark(1);
            int i2 = inputStream.read();
            if (i2 == 10) {
                inputStream.mark(1);
            }
            if (i2 > 0) {
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    public Cclass readPEMObject(InputStream inputStream, boolean z) throws IOException {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        Boundaries boundaries = null;
        while (boundaries == null) {
            String line = readLine(inputStream);
            if (line == null) {
                break;
            }
            boundaries = getBoundaries(line);
            if (boundaries != null && !boundaries.isTheExpectedHeader(line)) {
                str = "malformed PEM data: found footer where header was expected";
            }
            C18262l.metrica(str);
            return null;
        }
        if (boundaries != null) {
            Boundaries boundaries2 = null;
            while (boundaries2 == null) {
                String line2 = readLine(inputStream);
                if (line2 == null) {
                    break;
                }
                boundaries2 = getBoundaries(line2);
                if (boundaries2 == null) {
                    stringBuffer.append(line2);
                } else if (!boundaries.isTheExpectedFooter(line2)) {
                    str = "malformed PEM data: header/footer mismatch";
                }
            }
            if (boundaries2 == null) {
                str = "malformed PEM data: no footer found";
            } else {
                if (stringBuffer.length() == 0) {
                    return null;
                }
                try {
                    return Cclass.inmobi(AbstractC13630l.yandex(stringBuffer.toString()));
                } catch (Exception unused) {
                    str = "malformed PEM data encountered";
                }
            }
        } else {
            if (!z) {
                return null;
            }
            str = "malformed PEM data: no header found";
        }
        C18262l.metrica(str);
        return null;
    }
}
