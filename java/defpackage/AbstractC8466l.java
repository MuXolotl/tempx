package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lٌؐٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8466l {
    public static final C15655l yandex = new C15655l(0);
    public static final C0499l loadAd = new C0499l("encoder-inflate-writer");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(Inflater inflater, InterfaceC8639l interfaceC8639l, ByteBuffer byteBuffer, CRC32 crc32, AbstractC0283l abstractC0283l) throws DataFormatException {
        C15591l c15591l;
        int i;
        if (abstractC0283l instanceof C15591l) {
            c15591l = (C15591l) abstractC0283l;
            int i2 = c15591l.f30444l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15591l.f30444l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15591l = new C15591l(abstractC0283l);
            }
        } else {
            c15591l = new C15591l(abstractC0283l);
        }
        Object obj = c15591l.f30442l;
        int i3 = c15591l.f30444l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            byteBuffer.clear();
            int iInflate = inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            if (iInflate <= 0 && !inflater.needsInput() && !inflater.finished()) {
                C8339l.smaato("Inflater made no progress.");
                return null;
            }
            byteBuffer.position(byteBuffer.position() + iInflate);
            byteBuffer.flip();
            AbstractC3107l.yandex(crc32, byteBuffer);
            c15591l.f30443l = iInflate;
            c15591l.f30444l = 1;
            Object objRemoteconfig = AbstractC3474l.remoteconfig(interfaceC8639l, byteBuffer, c15591l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objRemoteconfig == enumC9342l) {
                return enumC9342l;
            }
            i = iInflate;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c15591l.f30443l;
            AbstractC2829l.crashlytics(obj);
        }
        return new Integer(i);
    }
}
