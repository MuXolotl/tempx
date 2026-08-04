package defpackage;

import android.media.MediaCodec;

/* JADX INFO: renamed from: lٙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C18406l extends AbstractC4008l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f35949l;

    public C18406l(IllegalStateException illegalStateException, C6403l c6403l) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(c6403l == null ? null : c6403l.yandex);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f35949l = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
