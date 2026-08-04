package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lِٖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16747l extends AbstractC6791l {
    public static final Pattern smaato = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder isPro = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder firebase = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.AbstractC6791l
    public final C7417l subs(C15608l c15608l, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.firebase;
        CharsetDecoder charsetDecoder2 = this.isPro;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C7417l(new C5038l(null, null, bArr));
        }
        Matcher matcher = smaato.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strAdmob = AbstractC11452l.admob(strGroup);
                strAdmob.getClass();
                if (strAdmob.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strAdmob.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C7417l(new C5038l(str, str2, bArr));
    }
}
