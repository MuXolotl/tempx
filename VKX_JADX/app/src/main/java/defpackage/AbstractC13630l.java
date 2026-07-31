package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: lْۚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13630l {
    public static final C11547l yandex = new C11547l();

    public static byte[] yandex(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            yandex.yandex(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new Celse(AbstractC12900l.admob(e, new StringBuilder("unable to decode base64 string: ")), e, 1);
        }
    }
}
