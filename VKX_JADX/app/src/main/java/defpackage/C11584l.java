package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: lِؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11584l {
    public boolean amazon;
    public final ByteBuffer crashlytics;
    public final CharsetDecoder loadAd;
    public char purchase;
    public final InputStream yandex;

    public C11584l(InputStream inputStream, Charset charset) {
        this.yandex = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.loadAd = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(C12710l.crashlytics.crashlytics(8196));
        this.crashlytics = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public final int yandex(char[] cArr, int i, int i2) throws CharacterCodingException {
        int i3;
        CharsetDecoder charsetDecoder;
        char c;
        char c2;
        char c3;
        char c4;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            C10754l.remoteconfig(cArr.length, AbstractC14814l.subscription(i, i2, "Unexpected arguments: ", ", ", ", "));
            return 0;
        }
        boolean z = true;
        if (this.amazon) {
            cArr[i] = this.purchase;
            i++;
            i2--;
            this.amazon = false;
            if (i2 == 0) {
                return 1;
            }
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 == 1) {
            if (this.amazon) {
                this.amazon = false;
                c4 = this.purchase;
            } else {
                char[] cArr2 = new char[2];
                int iYandex = yandex(cArr2, 0, 2);
                if (iYandex == -1) {
                    c = 65535;
                } else if (iYandex == 1) {
                    c2 = cArr2[0];
                } else {
                    if (iYandex != 2) {
                        C11983l.billing(iYandex, "Unreachable state: ");
                        return 0;
                    }
                    this.purchase = cArr2[1];
                    this.amazon = true;
                    c3 = cArr2[0];
                }
            }
            if (c != 65535) {
                c = c2;
                c = c3;
                c = c4;
                cArr[i] = c;
                return i3 + 1;
            }
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z2 = false;
        while (true) {
            charsetDecoder = this.loadAd;
            ByteBuffer byteBuffer = this.crashlytics;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z2);
            if (coderResultDecode.isUnderflow()) {
                if (z2 || !charBuffer.hasRemaining()) {
                    z = z2;
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = this.yandex.read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining < 0) {
                        byteBuffer.flip();
                    } else {
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z2 = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    byteBuffer.flip();
                    throw th;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    z = z2;
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i3;
    }
}
